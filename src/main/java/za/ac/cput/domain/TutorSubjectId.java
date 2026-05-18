package za.ac.cput.domain;

import java.io.Serializable;
import java.util.Objects;

public class TutorSubjectId implements Serializable {
    private String subjectCode;
    private String tutorId;

    public TutorSubjectId() {
    }

    public TutorSubjectId(String subjectCode, String tutorId) {
        this.subjectCode = subjectCode;
        this.tutorId = tutorId;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        TutorSubjectId that = (TutorSubjectId) o;
        return Objects.equals(subjectCode, that.subjectCode) && Objects.equals(tutorId, that.tutorId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subjectCode, tutorId);
    }
}
