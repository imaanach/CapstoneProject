/*
TutorService
Author: Imaan Achmat
Date 26/06/2026
 */
package za.ac.cput.service;


import org.springframework.stereotype.Service;
import za.ac.cput.domain.Tutor;
import za.ac.cput.repository.ITutorRepository;
import za.ac.cput.repository.TutorRepository;
import java.util.List;

@Service
public class TutorService implements ITutorService {

    private ITutorRepository repository;

    public TutorService() {
        this.repository = TutorRepository.getRepository();
    }

    @Override
    public Tutor create(Tutor tutor) {
        return this.repository.create(tutor);
    }

    @Override
    public Tutor read(String tutorId) {
        return this.repository.read(tutorId);
    }

    @Override
    public Tutor update(Tutor tutor) {
        return this.repository.update(tutor);
    }

    @Override
    public boolean delete(String tutorId) {
        return this.repository.delete(tutorId);
    }

    @Override
    public List<Tutor> getAll() {
        return this.repository.getAll();
    }
}
