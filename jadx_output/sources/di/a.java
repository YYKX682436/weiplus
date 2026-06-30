package di;

/* loaded from: classes12.dex */
public abstract class a {
    public static final boolean a(java.lang.Thread thread) {
        java.lang.Thread.State state;
        return (thread == null || !thread.isAlive() || (state = thread.getState()) == java.lang.Thread.State.NEW || state == java.lang.Thread.State.TERMINATED) ? false : true;
    }
}
