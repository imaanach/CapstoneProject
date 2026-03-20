package za.ac.cput.repository;
import za.ac.cput.domain.Admin;

import java.util.List;

public class AdminRepository implements IAdminRepository{
    @Override
    public List<Admin> getAll() {
        return List.of();
    }

    @Override
    public Admin create(Admin admin) {
        return null;
    }

    @Override
    public Admin read(String s) {
        return null;
    }

    @Override
    public Admin update(Admin admin) {
        return null;
    }

    @Override
    public boolean delete(String s) {
        return false;
    }
}
