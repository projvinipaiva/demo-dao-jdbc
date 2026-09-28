package dao;

import model.entities.Department;

import java.util.List;

public interface DepartmentDao {

    void insert(Department obj);
    void update(Department obj);
    void deleteById(Integer id);
    Department findById(Integer id); // consuntar um objto com esse ID(se existir vai voltar ele, se não vai voltar nulo).
    List<Department> findAll();
}
