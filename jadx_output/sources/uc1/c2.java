package uc1;

/* loaded from: classes13.dex */
public class c2 implements vc1.j2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f426300a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f426301b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ vc1.a3 f426302c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uc1.d2 f426303d;

    public c2(uc1.d2 d2Var, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, vc1.a3 a3Var) {
        this.f426303d = d2Var;
        this.f426300a = lVar;
        this.f426301b = i17;
        this.f426302c = a3Var;
    }

    @Override // vc1.j2
    public void a(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiTranslateMapMarker", "onMarkerTranslate result::%b", java.lang.Boolean.valueOf(z17));
        vc1.a3 a3Var = this.f426302c;
        int i17 = this.f426301b;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f426300a;
        uc1.d2 d2Var = this.f426303d;
        if (z17) {
            vc1.p1 p1Var = (vc1.p1) a3Var;
            p1Var.getClass();
            d2Var.G(lVar, i17, "ok", p1Var instanceof dg1.h);
        } else {
            vc1.p1 p1Var2 = (vc1.p1) a3Var;
            p1Var2.getClass();
            d2Var.G(lVar, i17, "fail", p1Var2 instanceof dg1.h);
        }
    }

    @Override // vc1.j2
    public void b() {
    }
}
