package ib1;

/* loaded from: classes7.dex */
public final class e0 implements ob1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ib1.f0 f290047a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f290048b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f290049c;

    public e0(java.lang.String str, ib1.f0 f0Var, int i17, com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        this.f290047a = f0Var;
        this.f290048b = i17;
        this.f290049c = lVar;
    }

    @Override // ob1.d
    public final void a(ob1.m mVar) {
        java.lang.Object obj = mVar.f344041d;
        java.lang.Integer num = obj instanceof java.lang.Integer ? (java.lang.Integer) obj : null;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f290049c;
        int i17 = this.f290048b;
        ib1.f0 f0Var = this.f290047a;
        int i18 = mVar.f344038a;
        if (i18 != 0) {
            jc1.d dVar = mVar.f344040c;
            java.lang.String str = mVar.f344039b;
            lVar.a(i17, num != null ? f0Var.q(str, dVar, kz5.c1.l(new jz5.l("errCode", java.lang.Integer.valueOf(i18)))) : f0Var.q(str, dVar, kz5.c1.i(new jz5.l("errCode", java.lang.Integer.valueOf(i18)), new jz5.l("mtu", num))));
        } else if (num != null) {
            qb1.a.b(f0Var, i17, lVar, kz5.c1.i(new jz5.l("mtu", num)));
        } else {
            qb1.a.b(f0Var, i17, lVar, null);
        }
    }
}
