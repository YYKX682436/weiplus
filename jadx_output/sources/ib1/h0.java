package ib1;

/* loaded from: classes7.dex */
public class h0 implements ob1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f290059a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f290060b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ib1.g0 f290061c;

    public h0(ib1.g0 g0Var, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17) {
        this.f290061c = g0Var;
        this.f290059a = lVar;
        this.f290060b = i17;
    }

    @Override // ob1.d
    public void a(ob1.m mVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiStartBluetoothDevicesDiscovery", "[onScanResult]result:%s", mVar);
        int i17 = mVar.f344038a;
        ib1.g0 g0Var = this.f290061c;
        int i18 = this.f290060b;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f290059a;
        if (i17 != 0) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("errCode", java.lang.Integer.valueOf(mVar.f344038a));
            hashMap.put("isDiscovering", java.lang.Boolean.FALSE);
            lVar.a(i18, g0Var.q(mVar.f344039b, mVar.f344040c, hashMap));
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.l.a(13);
            return;
        }
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("errCode", 0);
        hashMap2.put("isDiscovering", java.lang.Boolean.TRUE);
        g0Var.getClass();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        hashMap2.put("errno", 0);
        lVar.a(i18, g0Var.t("ok", hashMap2));
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.l.a(12);
    }
}
