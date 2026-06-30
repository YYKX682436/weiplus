package pn4;

/* loaded from: classes9.dex */
public final class r implements tl.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f357202a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f357203b;

    public r(java.util.concurrent.atomic.AtomicBoolean atomicBoolean, kotlinx.coroutines.q qVar) {
        this.f357202a = atomicBoolean;
        this.f357203b = qVar;
    }

    @Override // tl.f
    public final void a() {
        if (this.f357202a.compareAndSet(false, true)) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            this.f357203b.resumeWith(kotlin.Result.m521constructorimpl(jz5.f0.f302826a));
        }
    }
}
