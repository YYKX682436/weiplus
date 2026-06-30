package ib1;

/* loaded from: classes7.dex */
public class l0 implements ob1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f290069a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f290070b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ib1.m0 f290071c;

    public l0(ib1.m0 m0Var, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17) {
        this.f290071c = m0Var;
        this.f290069a = lVar;
        this.f290070b = i17;
    }

    @Override // ob1.d
    public void a(ob1.m mVar) {
        int i17 = mVar.f344038a;
        ib1.m0 m0Var = this.f290071c;
        int i18 = this.f290070b;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f290069a;
        if (i17 != 0) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("errCode", java.lang.Integer.valueOf(mVar.f344038a));
            lVar.a(i18, m0Var.q(mVar.f344039b, mVar.f344040c, hashMap));
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.l.a(58);
            return;
        }
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("errCode", 0);
        m0Var.getClass();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        hashMap2.put("errno", 0);
        lVar.a(i18, m0Var.t("ok", hashMap2));
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.l.a(58);
    }
}
