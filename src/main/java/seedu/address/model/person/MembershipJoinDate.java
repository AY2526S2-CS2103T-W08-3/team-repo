package seedu.address.model.person;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


/**
 * Represents the start date of a member's membership
 */
public class MembershipJoinDate {
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
    public final String value;
    public MembershipJoinDate() {
        this.value = LocalDate.now().format(FORMATTER);
    }
    public MembershipJoinDate(String date) {
        this.value = date;
    }

    @Override
    public String toString() {
        return value;
    }
    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        // instanceof handles nulls
        if (!(other instanceof MembershipJoinDate)) {
            return false;
        }

        MembershipJoinDate otherJoinDate = (MembershipJoinDate) other;
        return this.value.equals(otherJoinDate.value);
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
}
