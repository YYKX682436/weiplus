package ku5;

/* loaded from: classes12.dex */
public class d implements ku5.p {
    @Override // ku5.p
    public void a(java.lang.Runnable runnable, ku5.f fVar) {
        throw new java.util.concurrent.RejectedExecutionException("Task " + runnable.toString() + " rejected from " + fVar.toString());
    }
}
