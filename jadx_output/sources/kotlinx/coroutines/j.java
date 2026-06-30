package kotlinx.coroutines;

/* loaded from: classes14.dex */
public final class j extends kotlinx.coroutines.a {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Thread f310542f;

    /* renamed from: g, reason: collision with root package name */
    public final kotlinx.coroutines.w1 f310543g;

    public j(oz5.l lVar, java.lang.Thread thread, kotlinx.coroutines.w1 w1Var) {
        super(lVar, true, true);
        this.f310542f = thread;
        this.f310543g = w1Var;
    }

    @Override // kotlinx.coroutines.c3
    public void u(java.lang.Object obj) {
        java.lang.Thread currentThread = java.lang.Thread.currentThread();
        java.lang.Thread thread = this.f310542f;
        if (kotlin.jvm.internal.o.b(currentThread, thread)) {
            return;
        }
        java.util.concurrent.locks.LockSupport.unpark(thread);
    }
}
