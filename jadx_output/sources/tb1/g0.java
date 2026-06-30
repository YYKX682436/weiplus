package tb1;

/* loaded from: classes7.dex */
public class g0 extends com.tencent.mm.plugin.appbrand.v0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f416896d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f416897e;

    public g0(tb1.k0 k0Var, java.lang.ref.WeakReference weakReference, java.lang.ref.WeakReference weakReference2) {
        this.f416896d = weakReference;
        this.f416897e = weakReference2;
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void c() {
        tb1.a0 a0Var = (tb1.a0) this.f416896d.get();
        com.tencent.mm.plugin.appbrand.jsapi.t tVar = (com.tencent.mm.plugin.appbrand.jsapi.t) this.f416897e.get();
        if (a0Var == null || tVar == null) {
            return;
        }
        tVar.I(a0Var);
        tVar.O(a0Var);
        tVar.K(a0Var);
        tb1.b.f416889a.b(a0Var.getCameraId(), true);
        com.tencent.mm.plugin.appbrand.x0.e(tVar.getAppId(), this);
    }
}
