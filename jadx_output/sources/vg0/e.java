package vg0;

/* loaded from: classes8.dex */
public final class e implements ou4.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f436448a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f436449b;

    public e(java.lang.ref.WeakReference callbackRef) {
        kotlin.jvm.internal.o.g(callbackRef, "callbackRef");
        this.f436448a = callbackRef;
        this.f436449b = qc1.e.NAME;
    }

    @Override // ou4.c0
    public void a(java.util.Map map, ou4.b0 callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        tg0.q1 q1Var = (tg0.q1) this.f436448a.get();
        if (q1Var != null) {
            ((rx4.e) q1Var).f401135b.hideVKB();
        }
        ou4.b0.c(callback, null, 1, null);
    }

    @Override // ou4.c0
    public java.lang.String b() {
        return this.f436449b;
    }
}
