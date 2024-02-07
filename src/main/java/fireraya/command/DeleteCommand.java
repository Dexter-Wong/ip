package fireraya.command;

import fireraya.exception.FirerayaException;
import fireraya.main.Storage;
import fireraya.main.TaskList;
import fireraya.main.Ui;

public class DeleteCommand extends Command{

    private int index;

    public DeleteCommand(int index) {
        this.index = index;
    }
    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) throws FirerayaException {
        if (tasks.size() <= index || index < 0) {
            throw new FirerayaException("That task does not exist!");
        }

        ui.print("Noted. I've deleted this task:");
        ui.listTaskAt(tasks.getTasks(), index);
        tasks.delete(index);
        storage.saveToFile(tasks.getTasks());


    }
}