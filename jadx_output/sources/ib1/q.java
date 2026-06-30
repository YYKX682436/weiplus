package ib1;

/* loaded from: classes7.dex */
public class q implements ob1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f290076a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f290077b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ib1.s f290078c;

    public q(ib1.s sVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17) {
        this.f290078c = sVar;
        this.f290076a = lVar;
        this.f290077b = i17;
    }

    @Override // ob1.d
    public void a(ob1.m mVar) {
        int i17 = mVar.f344038a;
        ib1.s sVar = this.f290078c;
        int i18 = this.f290077b;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f290076a;
        if (i17 != 0) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("errCode", java.lang.Integer.valueOf(mVar.f344038a));
            lVar.a(i18, sVar.q(mVar.f344039b, mVar.f344040c, hashMap));
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.l.a(43);
            return;
        }
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("errCode", 0);
        sVar.getClass();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        hashMap2.put("errno", 0);
        lVar.a(i18, sVar.t("ok", hashMap2));
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.l.a(42);
    }
}
