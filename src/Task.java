public class Task {

    int id;

    String name;

    String description;

    int day, month, year;

    boolean done;

    public Task(int id, boolean done){
        this.id=id;
        this.done=done;
    }

    public Task(String name, String description, int day, int month, int year, boolean done) {
        this.name = name;
        this.description = description;
        this.day = day;
        this.month = month;
        this.year = year;
        this.done = done;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public String toString(){
        return "Task: id=" + id + ", name:" + name +
                ", description:" + description +
                ", day:" + day + ", month:" + month +
                ", year:" + year+ ", Completed:" + done +".\n";
    }
}
