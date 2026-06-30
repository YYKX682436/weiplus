package ic3;

/* loaded from: classes5.dex */
public final class e0 implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ic3.f0 f290398d;

    public e0(ic3.f0 f0Var) {
        this.f290398d = f0Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        i95.m c17 = i95.n0.c(xj.i.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        xj.i.gg((xj.i) c17, this.f290398d.f290401d, wj.w0.f446541d, null, 4, null);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
    }
}
