package lx;

/* loaded from: classes11.dex */
public final class s1 implements l81.e1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f321940a;

    public s1(lx.y1 plugin) {
        kotlin.jvm.internal.o.g(plugin, "plugin");
        this.f321940a = new java.lang.ref.WeakReference(plugin);
    }

    @Override // l81.e1
    public void a() {
    }

    @Override // l81.e1
    public void b() {
        if (((lx.y1) this.f321940a.get()) != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FlutterBizMeTabPlugin", "onAppBrandPreconditionError");
        }
    }

    @Override // l81.e1
    public void d(java.lang.String str) {
    }

    @Override // l81.e1
    public void e() {
        if (((lx.y1) this.f321940a.get()) != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FlutterBizMeTabPlugin", "onAppBrandUIEnter");
        }
    }

    @Override // l81.e1
    public void f(boolean z17) {
    }
}
