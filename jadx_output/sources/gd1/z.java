package gd1;

/* loaded from: classes7.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f270519d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f270520e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gd1.b0 f270521f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ hd1.w f270522g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, gd1.b0 b0Var, hd1.w wVar) {
        super(1);
        this.f270519d = lVar;
        this.f270520e = i17;
        this.f270521f = b0Var;
        this.f270522g = wVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        hd1.z result = (hd1.z) obj;
        kotlin.jvm.internal.o.g(result, "result");
        result.toString();
        boolean z17 = result instanceof hd1.y;
        gd1.b0 b0Var = this.f270521f;
        int i17 = this.f270520e;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f270519d;
        if (z17) {
            lVar.a(i17, com.tencent.mm.plugin.appbrand.jsapi.nfc.v.a(b0Var, 0, "ok", null));
            ((hd1.b) this.f270522g.f280439b).f280386b = new gd1.y(lVar, b0Var);
        } else if (result instanceof hd1.x) {
            hd1.x xVar = (hd1.x) result;
            java.lang.String str = "fail:" + xVar.f280441b;
            int i18 = xVar.f280440a;
            lVar.a(i17, com.tencent.mm.plugin.appbrand.jsapi.nfc.v.a(b0Var, i18, str, kz5.c1.i(new jz5.l("errCode", java.lang.Integer.valueOf(i18)))));
        }
        return jz5.f0.f302826a;
    }
}
