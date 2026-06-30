package pi1;

/* loaded from: classes7.dex */
public abstract class b implements pi1.e {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.page.v5 f354756a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReference f354757b;

    public b(com.tencent.mm.plugin.appbrand.page.v5 v5Var) {
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        this.f354757b = atomicReference;
        atomicReference.set(pi1.d.SHOWN);
        this.f354756a = v5Var;
    }

    @Override // pi1.e
    public void c() {
        android.app.Activity w17;
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f354756a;
        if (!(v5Var.getWindowAndroid() instanceof com.tencent.mm.plugin.appbrand.platform.window.activity.r0) || (w17 = ((com.tencent.mm.plugin.appbrand.platform.window.activity.r0) v5Var.getWindowAndroid()).w()) == null) {
            return;
        }
        ((ne.a) v5Var.b(ne.a.class)).getClass();
        com.tencent.mm.plugin.appbrand.ui.na.g(w17, false);
    }

    @Override // pi1.e
    public pi1.d getCurrentState() {
        return (pi1.d) this.f354757b.get();
    }
}
