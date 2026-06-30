package ib1;

/* loaded from: classes7.dex */
public class c0 implements ob1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f290039a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f290040b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ib1.d0 f290041c;

    public c0(ib1.d0 d0Var, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17) {
        this.f290041c = d0Var;
        this.f290039a = lVar;
        this.f290040b = i17;
    }

    @Override // ob1.d
    public void a(ob1.m mVar) {
        int i17 = mVar.f344038a;
        ib1.d0 d0Var = this.f290041c;
        int i18 = this.f290040b;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f290039a;
        if (i17 != 0) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("errCode", java.lang.Integer.valueOf(mVar.f344038a));
            lVar.a(i18, d0Var.q(mVar.f344039b, mVar.f344040c, hashMap));
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.l.a(43);
            return;
        }
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("errCode", 0);
        d0Var.getClass();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        hashMap2.put("errno", 0);
        lVar.a(i18, d0Var.t("ok", hashMap2));
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.l.a(42);
    }
}
