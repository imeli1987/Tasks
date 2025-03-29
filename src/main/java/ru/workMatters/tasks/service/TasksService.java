package ru.workMatters.tasks.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ru.workMatters.tasks.domain.Tasks;

import java.util.Collection;
import java.util.HashMap;

@Service
public class TasksService{

    private final HashMap<Long, Tasks> tasks = new HashMap<>();
    private long lastId = 0;

    public Tasks createTask(Tasks task){
        task.setId( ++lastId );
        tasks.put( lastId, task );
        return task;
    }

    public Tasks findTaskById( long id ){
        return tasks.get( id );
    }

    public Tasks updateTask( Tasks task ){
        if (tasks.containsKey( task.getId() )) {
            tasks.put( task.getId(), task );
            return task;
        }
        return null;
    }

    public Tasks deleteTaskById( long id ){
        return tasks.remove( id );
    }


    public Collection<Tasks> getAllTasks(){
        return tasks.values();
    }
































}
