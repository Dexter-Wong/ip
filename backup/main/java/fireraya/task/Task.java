package fireraya.task;

public class Task {
    protected String description;
    protected boolean isDone;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public String getCompletionIcon() {
        return (isDone ? "[X] " : "[ ] ");
    }

    public void markAsDone() {
        isDone = true;
    }

    public void markAsUndone() {
        isDone = false;
    }

    public String getTask() {
        return description;
    }

    public String saveFormat() { return String.format("X | %d | %s", isDone ? 1 : 0, description);}

    @Override
    public String toString() {
        return this.getCompletionIcon() + this.getTask();
    }

}
