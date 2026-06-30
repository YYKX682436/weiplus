package ib1;

/* loaded from: classes7.dex */
public class d implements ob1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f290042a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f290043b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f290044c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f290045d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ib1.e f290046e;

    public d(ib1.e eVar, java.lang.String str, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, java.lang.String str2) {
        this.f290046e = eVar;
        this.f290042a = str;
        this.f290043b = lVar;
        this.f290044c = i17;
        this.f290045d = str2;
    }

    @Override // ob1.d
    public void a(ob1.m mVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCreateBLEConnection", "appId:%s createBLEConnection result:%s", this.f290042a, mVar);
        int i17 = mVar.f344038a;
        java.lang.String str = this.f290045d;
        int i18 = this.f290044c;
        ib1.e eVar = this.f290046e;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f290043b;
        if (i17 != 0) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("errCode", java.lang.Integer.valueOf(mVar.f344038a));
            lVar.a(i18, eVar.q(mVar.f344039b, mVar.f344040c, hashMap));
            eVar.C(lVar, str, false);
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.l.a(27);
            return;
        }
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("errCode", 0);
        eVar.getClass();
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        hashMap2.put("errno", 0);
        lVar.a(i18, eVar.t("ok", hashMap2));
        eVar.C(lVar, str, true);
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.l.a(26);
    }
}
