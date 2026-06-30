package ib1;

/* loaded from: classes7.dex */
public final class o implements ob1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f290072a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ib1.p f290073b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f290074c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f290075d;

    public o(java.lang.String str, ib1.p pVar, int i17, com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        this.f290072a = str;
        this.f290073b = pVar;
        this.f290074c = i17;
        this.f290075d = lVar;
    }

    @Override // ob1.d
    public final void a(ob1.m mVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiMakeBluetoothPair", "appId: " + this.f290072a + ", result: " + mVar, new java.lang.Object[0]);
        int i17 = mVar.f344038a;
        int i18 = this.f290074c;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f290075d;
        ib1.p pVar = this.f290073b;
        if (i17 == 0) {
            qb1.a.b(pVar, i18, lVar, null);
        } else {
            lVar.a(i18, pVar.q(mVar.f344039b, mVar.f344040c, kz5.c1.l(new jz5.l("errCode", java.lang.Integer.valueOf(i17)))));
        }
    }
}
