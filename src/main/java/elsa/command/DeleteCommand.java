package elsa.command;

import elsa.ElsaException;
import elsa.task.TaskList;
import elsa.ui.Ui;

/**
 * Represents the command that deletes tasks in the taskList.
 *
 * @author Aaron
 */
public class DeleteCommand extends Command {
    /**
     * The index of the task to be deleted.
     */
    private final int taskIndex;

    /**
     * Constructs a DeleteCommand with the specified task index.
     *
     * @param taskIndex The index of the task to delete.
     */
    public DeleteCommand(int taskIndex) {
        this.taskIndex = taskIndex;
    }

    /**
     * Executes the command to delete the task at the specified index.
     *
     * @param tasks The task list to update.
     * @param ui The elsa.ui.Ui instance, which is not used in this command.
     * @return A response string representing the result of the command execution, which can be displayed to the user.
     */
    @Override
    public String execute(TaskList tasks, Ui ui) throws ElsaException {
        return tasks.deleteTask(taskIndex);
    }
}
