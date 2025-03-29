package ru.workMatters.tasks.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.workMatters.tasks.domain.Tasks;
import ru.workMatters.tasks.service.TasksService;

import java.util.Collection;

@RestController
@RequestMapping("tasks")
public class TasksController{

    private final TasksService tasksService;

    public TasksController(TasksService tasksService) {
        this.tasksService = tasksService;
    }

    @GetMapping("{id}")
    public ResponseEntity<Tasks> getTaskInfo( @PathVariable long id){
        Tasks task = tasksService.findTaskById( id );
        if( task == null ){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok( task );
    }

    @GetMapping
    public Tasks createTask(@RequestBody Tasks task){
        return tasksService.createTask( task );
    }

    @GetMapping
    public ResponseEntity<Tasks> updateTask(@RequestBody Tasks task){
        Tasks foundTasks = tasksService.updateTask( task );
        if( foundTasks == null ){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok( foundTasks );
    }

    @GetMapping("{id}")
    public Tasks deleteTask(@PathVariable long id){
        return tasksService.deleteTaskById( id );
    }

    @GetMapping
    public ResponseEntity<Collection<Tasks>> getAllTasks(){
        return ResponseEntity.ok(tasksService.getAllTasks());

    }































}
