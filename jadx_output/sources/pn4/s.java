package pn4;

/* loaded from: classes5.dex */
public final class s implements pn4.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f357215a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f357216b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f357217c;

    public s(java.lang.String str, java.util.concurrent.atomic.AtomicBoolean atomicBoolean, kotlinx.coroutines.q qVar) {
        this.f357215a = str;
        this.f357216b = atomicBoolean;
        this.f357217c = qVar;
    }

    @Override // pn4.n
    public void a(int i17, java.lang.Long l17) {
        if (i17 < this.f357215a.length() || !this.f357216b.compareAndSet(false, true)) {
            return;
        }
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f357217c.resumeWith(kotlin.Result.m521constructorimpl(jz5.f0.f302826a));
    }
}
