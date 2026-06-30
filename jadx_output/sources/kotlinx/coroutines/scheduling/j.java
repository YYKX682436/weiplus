package kotlinx.coroutines.scheduling;

/* loaded from: classes14.dex */
public abstract class j implements java.lang.Runnable {
    public long submissionTime;
    public kotlinx.coroutines.scheduling.k taskContext;

    public j(long j17, kotlinx.coroutines.scheduling.k kVar) {
        this.submissionTime = j17;
        this.taskContext = kVar;
    }

    public final int getMode() {
        return ((kotlinx.coroutines.scheduling.l) this.taskContext).f310612a;
    }
}
