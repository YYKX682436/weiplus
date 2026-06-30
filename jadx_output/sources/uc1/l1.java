package uc1;

/* loaded from: classes13.dex */
public class l1 implements vc1.j2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f426332a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f426333b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ vc1.a3 f426334c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uc1.m1 f426335d;

    public l1(uc1.m1 m1Var, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, vc1.a3 a3Var) {
        this.f426335d = m1Var;
        this.f426332a = lVar;
        this.f426333b = i17;
        this.f426334c = a3Var;
    }

    @Override // vc1.j2
    public void a(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiMoveMapMarkerAlong", "moveMapMarkerAlong onMarkerTranslate result::%b", java.lang.Boolean.valueOf(z17));
        vc1.a3 a3Var = this.f426334c;
        int i17 = this.f426333b;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f426332a;
        uc1.m1 m1Var = this.f426335d;
        if (z17) {
            vc1.p1 p1Var = (vc1.p1) a3Var;
            p1Var.getClass();
            m1Var.F(lVar, i17, "ok", p1Var instanceof dg1.h);
        } else {
            vc1.p1 p1Var2 = (vc1.p1) a3Var;
            p1Var2.getClass();
            m1Var.F(lVar, i17, "fail", p1Var2 instanceof dg1.h);
        }
    }

    @Override // vc1.j2
    public void b() {
        vc1.p1 p1Var = (vc1.p1) this.f426334c;
        p1Var.getClass();
        this.f426335d.F(this.f426332a, this.f426333b, "cancel", p1Var instanceof dg1.h);
    }
}
