package ib1;

/* loaded from: classes7.dex */
public final class g implements ob1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f290050a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ib1.h f290051b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f290052c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f290053d;

    public g(java.lang.String str, ib1.h hVar, int i17, com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        this.f290050a = str;
        this.f290051b = hVar;
        this.f290052c = i17;
        this.f290053d = lVar;
    }

    @Override // ob1.d
    public final void a(ob1.m mVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiGetBLEDeviceRSSI", "appId: " + this.f290050a + ", result: " + mVar, new java.lang.Object[0]);
        int i17 = mVar.f344038a;
        int i18 = this.f290052c;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f290053d;
        ib1.h hVar = this.f290051b;
        if (i17 != 0) {
            lVar.a(i18, hVar.q(mVar.f344039b, mVar.f344040c, kz5.c1.l(new jz5.l("errCode", java.lang.Integer.valueOf(i17)))));
            return;
        }
        java.lang.Object obj = mVar.f344041d;
        java.lang.Integer num = obj instanceof java.lang.Integer ? (java.lang.Integer) obj : null;
        if (num != null) {
            qb1.a.b(hVar, i18, lVar, kz5.c1.i(new jz5.l("RSSI", num)));
            return;
        }
        java.util.Map l17 = kz5.c1.l(new jz5.l("errCode", -1));
        hVar.getClass();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        l17.put("errno", 1509000);
        lVar.a(i18, hVar.t("fail:internal error", l17));
    }
}
