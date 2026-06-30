package pn4;

/* loaded from: classes9.dex */
public final class q implements tl.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f357184a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f357185b;

    public q(java.util.concurrent.atomic.AtomicBoolean atomicBoolean, kotlinx.coroutines.q qVar) {
        this.f357184a = atomicBoolean;
        this.f357185b = qVar;
    }

    @Override // tl.e
    public final void onCompletion() {
        if (this.f357184a.compareAndSet(false, true)) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            this.f357185b.resumeWith(kotlin.Result.m521constructorimpl(jz5.f0.f302826a));
        }
    }
}
