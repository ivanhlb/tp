package seedu.duke.commands;

import seedu.duke.storage.GTDList;

import java.util.Hashtable;

public class Command {

    protected Hashtable<String, GTDList> GTDLists;

    public Command() {

    }

    public void execute() {
    }

    /**
     * Supplies the data the command will operate on.
     */
    public void setData(Hashtable<String, GTDList> GTDLists) {
        this.GTDLists = GTDLists;
    }
}
