package gd1;

/* loaded from: classes7.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f270510d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f270511e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gd1.u f270512f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, gd1.u uVar) {
        super(1);
        this.f270510d = lVar;
        this.f270511e = i17;
        this.f270512f = uVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        hd1.z result = (hd1.z) obj;
        kotlin.jvm.internal.o.g(result, "result");
        result.toString();
        boolean z17 = result instanceof hd1.y;
        gd1.u uVar = this.f270512f;
        int i17 = this.f270511e;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f270510d;
        if (z17) {
            lVar.a(i17, com.tencent.mm.plugin.appbrand.jsapi.nfc.v.a(uVar, 0, "ok", null));
        } else if (result instanceof hd1.x) {
            hd1.x xVar = (hd1.x) result;
            java.lang.String str = "fail:" + xVar.f280441b;
            int i18 = xVar.f280440a;
            lVar.a(i17, com.tencent.mm.plugin.appbrand.jsapi.nfc.v.a(uVar, i18, str, kz5.c1.i(new jz5.l("errCode", java.lang.Integer.valueOf(i18)))));
        }
        return jz5.f0.f302826a;
    }
}
