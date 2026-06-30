package vf1;

/* loaded from: classes7.dex */
public class b extends com.tencent.mm.plugin.appbrand.v0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f436313d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.t f436314e;

    public b(vf1.g gVar, java.lang.ref.WeakReference weakReference, com.tencent.mm.plugin.appbrand.jsapi.t tVar) {
        this.f436313d = weakReference;
        this.f436314e = tVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void c() {
        tb1.a0 a0Var;
        com.tencent.mm.plugin.appbrand.jsapi.t tVar = this.f436314e;
        java.lang.ref.WeakReference weakReference = this.f436313d;
        if (weakReference != null && (a0Var = (tb1.a0) weakReference.get()) != null) {
            tVar.I(a0Var);
            tVar.O(a0Var);
            tVar.K(a0Var);
            tb1.b.f416889a.b(a0Var.getCameraId(), true);
        }
        com.tencent.mm.plugin.appbrand.x0.e(tVar.getAppId(), this);
    }
}
