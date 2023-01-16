public class PrioritySetting {
//lazy class
    public int priority;
    public PrioritySetting() {
    }

    public PrioritySetting(int priority)
    {
        this.priority=priority;
    }
    public void changePriority(int newPriority)
    {
        System.out.println("Nw priority is: "+newPriority);
    }

}
