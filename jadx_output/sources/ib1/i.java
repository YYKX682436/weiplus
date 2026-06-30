package ib1;

/* loaded from: classes7.dex */
public class i implements ob1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f290062a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.bluetooth.e f290063b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f290064c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f290065d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f290066e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ib1.j f290067f;

    public i(ib1.j jVar, java.lang.String str, com.tencent.mm.plugin.appbrand.jsapi.bluetooth.e eVar, java.lang.String str2, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17) {
        this.f290067f = jVar;
        this.f290062a = str;
        this.f290063b = eVar;
        this.f290064c = str2;
        this.f290065d = lVar;
        this.f290066e = i17;
    }

    @Override // ob1.d
    public void a(ob1.m mVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetBLEDeviceServices", "appId:%s getBLEDeviceServices result:%s", this.f290062a, mVar);
        int i17 = mVar.f344038a;
        int i18 = this.f290066e;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f290065d;
        ib1.j jVar = this.f290067f;
        if (i17 == 0) {
            jVar.C(lVar, i18, this.f290063b.j(this.f290064c, false));
        } else {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("errCode", java.lang.Integer.valueOf(mVar.f344038a));
            lVar.a(i18, jVar.q(mVar.f344039b, mVar.f344040c, hashMap));
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.l.a(138);
        }
    }
}
