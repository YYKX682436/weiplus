package vg0;

/* loaded from: classes8.dex */
public final class f implements ou4.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f436450a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f436451b;

    public f(java.lang.ref.WeakReference callbackRef) {
        kotlin.jvm.internal.o.g(callbackRef, "callbackRef");
        this.f436450a = callbackRef;
        this.f436451b = "nextFrameRenderFinishedCallback";
    }

    @Override // ou4.c0
    public void a(java.util.Map map, ou4.b0 callback) {
        android.view.ViewGroup viewGroup;
        kotlin.jvm.internal.o.g(callback, "callback");
        tg0.q1 q1Var = (tg0.q1) this.f436450a.get();
        if (q1Var != null && (viewGroup = ((rx4.e) q1Var).f401135b.f184641e) != null) {
            viewGroup.setVisibility(0);
        }
        ou4.b0.c(callback, null, 1, null);
    }

    @Override // ou4.c0
    public java.lang.String b() {
        return this.f436451b;
    }
}
