package com.tencent.mm.ui.feature.api.screenshot;

/* loaded from: classes8.dex */
public final class k0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qj5.n f208514d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f208515e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qj5.q f208516f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.feature.api.screenshot.j1 f208517g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f208518h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(qj5.n nVar, android.app.Activity activity, qj5.q qVar, com.tencent.mm.ui.feature.api.screenshot.j1 j1Var, java.util.HashMap hashMap) {
        super(1);
        this.f208514d = nVar;
        this.f208515e = activity;
        this.f208516f = qVar;
        this.f208517g = j1Var;
        this.f208518h = hashMap;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        java.lang.String str2 = this.f208514d.f363986t2;
        if (str2 != null) {
            jd5.a aVar = new jd5.a();
            aVar.p(str2);
            aVar.q(this.f208516f.b(!r0.f363987u2));
            com.tencent.mm.ui.feature.api.screenshot.j0 j0Var = new com.tencent.mm.ui.feature.api.screenshot.j0(str, this.f208515e, this.f208514d, this.f208517g, this.f208518h, this.f208516f, str2, aVar);
            n13.a0 a0Var = (n13.a0) i95.n0.c(n13.a0.class);
            n13.t tVar = new n13.t();
            tVar.f334133a = j0Var;
            tVar.f334138f.f334139a = 0;
            ((dk5.y) a0Var).wi(this.f208515e, aVar, str, tVar);
        }
        return jz5.f0.f302826a;
    }
}
