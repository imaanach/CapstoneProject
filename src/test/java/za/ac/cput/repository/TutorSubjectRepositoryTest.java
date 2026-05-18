package za.ac.cput.repository;

import org.junit.jupiter.api.*;
import za.ac.cput.domain.*;
import za.ac.cput.factory.SubjectFactory;
import za.ac.cput.factory.TutorFactory;
import za.ac.cput.factory.TutorSubjectFactory;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
/*
TutorSubject.java
TutorSubject Repository Test class
Author: Charmaine Dlamini - 222056401
Date: 1/05/2026
*/
@TestMethodOrder(MethodOrderer.MethodName.class)
class TutorSubjectRepositoryTest {

    private static ITutorSubjectRepository repository = TutorSubjectRepository.getRepository();
    private static TutorSubject tutorSubject;

    @BeforeEach
    void setUp() {
        List<Subject> subjects = new ArrayList<>();
        Subject subject = SubjectFactory.createSubject(
                "ADP362S",
                "Application Development Practice",
                "Programming Module",
                "3rd Year"
        );

        subjects.add(subject);

        List<Booking> bookings = new ArrayList<>();
        List<Tutor> tutors = new ArrayList<>();
        Tutor tutor = TutorFactory.createTutor(
                "T001",
                "Imaan",
                "Achmat",
                "imaan@gmail.com",
                "0211377053",
                "password",
                150.0,
                bookings
        );

        tutors.add(tutor);
        tutorSubject = TutorSubjectFactory.createTutorSubject(
                "ADP362S",
                "T001",
                5,
                subjects,
                tutors
        );
    }

    @Test
    void a_create() {
        TutorSubject created = repository.create(tutorSubject);
        assertNotNull(created);
        System.out.println(created);
    }

    @Test
    void b_read() {

        TutorSubjectId id = new TutorSubjectId(
                tutorSubject.getSubjectCode(),
                tutorSubject.getTutorId());
        repository.create(tutorSubject);
        TutorSubject read = repository.read(id);
        assertNotNull(read);
        System.out.println(read);
    }
    @Test
    void c_update() {
        repository.create(tutorSubject);
        TutorSubject updatedTutorSubject = new TutorSubject.Builder()
                .copy(tutorSubject)
                .setYearsTaught(10)
                .build();
        TutorSubject updated = repository.update(updatedTutorSubject);

        assertNotNull(updated);
        System.out.println(updated);
    }

    @Test
    @Disabled
    void e_delete() {
        repository.create(tutorSubject);
        TutorSubjectId id = new TutorSubjectId(
                tutorSubject.getSubjectCode(),
                tutorSubject.getTutorId());

        boolean deleted = repository.delete(id);
        assertTrue(deleted);
    }

    @Test
    void d_getAll() {
        System.out.println(repository.getAll());

    }

    }
