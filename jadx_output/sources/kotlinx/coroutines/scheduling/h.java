package kotlinx.coroutines.scheduling;

/* loaded from: classes14.dex */
public abstract class h extends kotlinx.coroutines.f2 {

    /* renamed from: e, reason: collision with root package name */
    public final kotlinx.coroutines.scheduling.c f310611e;

    public h(int i17, int i18, long j17, java.lang.String str) {
        this.f310611e = new kotlinx.coroutines.scheduling.c(i17, i18, j17, str);
    }

    @Override // kotlinx.coroutines.p0
    public void D(oz5.l lVar, java.lang.Runnable runnable) {
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = kotlinx.coroutines.scheduling.c.f310596n;
        this.f310611e.b(runnable, kotlinx.coroutines.scheduling.n.f310619f, false);
    }

    @Override // kotlinx.coroutines.p0
    public void F(oz5.l lVar, java.lang.Runnable runnable) {
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = kotlinx.coroutines.scheduling.c.f310596n;
        this.f310611e.b(runnable, kotlinx.coroutines.scheduling.n.f310619f, true);
    }

    @Override // kotlinx.coroutines.f2
    public java.util.concurrent.Executor K() {
        return this.f310611e;
    }
}
