package org.shiftworksboot.repository;

import lombok.extern.java.Log;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.shiftworksboot.constant.TaskDept;
import org.shiftworksboot.entity.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestPropertySource(locations = "classpath:application-test.yml")
@Log
class TaskRepositoryTest {

    @Autowired
    TaskRepository taskRepository;

    @Test
    @DisplayName("업무 등록 테스트")
    public void insertTaskTest() {
        Task task = new Task();
        task.setTask_content("test task");
        task.setTask_title("test1");
        task.setNotification('Y');
        task.setT_private('N');
        task.setDept_id(TaskDept.dept1);

        log.info(taskRepository.save(task).toString());

    }

}