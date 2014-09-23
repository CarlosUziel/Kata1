/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata1;

import java.util.Date;


/**
 *
 * @author usuario
 */
public class Person {

    private static final long MILLISECONDS_PER_YEAR = (long) (1000 * 60 * 60 * 24 * 365);

    private final String name;
    private final Date birthday;

    public Person(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public int getAge() {
        return millisecondsToYears(getAgeInMilliseconds());
    }

    private int millisecondsToYears(long milliseconds) {
        return (int) (milliseconds / MILLISECONDS_PER_YEAR);
    }

    private long getAgeInMilliseconds() {
        return now().getTime() - birthday.getTime();
    }

    private Date now() {
        return new Date();
    }

}
