package step2.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Participants {
    private static final String COMMA_DELIMITER = ",";

    private List<Person> participants = new ArrayList<>();

    public Participants(String participantsInput) {
        splitByDelimiter(participantsInput);
    }

    private void splitByDelimiter(String participantsInput) {
        participants = Stream.of(participantsInput.split(COMMA_DELIMITER))
                .map(Person::new)
                .collect(Collectors.toList());
    }

    public int countOfParticipants() {
        return participants.size();
    }

    public List<Person> getParticipants() {
        return participants;
    }
}