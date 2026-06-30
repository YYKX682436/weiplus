package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes9.dex */
public class o5 implements g35.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f189013a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.d f189014b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f189015c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f189016d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.s5 f189017e;

    public o5(com.tencent.mm.pluginsdk.model.app.s5 s5Var, com.tencent.mm.storage.f9 f9Var, com.tencent.mm.pluginsdk.model.app.d dVar, long j17, java.lang.String str) {
        this.f189017e = s5Var;
        this.f189013a = f9Var;
        this.f189014b = dVar;
        this.f189015c = j17;
        this.f189016d = str;
    }

    @Override // g35.d
    public void a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, long j17) {
        int t17;
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str4);
        com.tencent.mm.storage.f9 f9Var = this.f189013a;
        if (K0) {
            f9Var.r1(5);
            bu.a.e(f9Var.getMsgId(), bu.a.c(0, 0, str, 727));
            ((com.tencent.mm.storage.g9) c01.d9.b().u()).bb(f9Var.getMsgId(), f9Var);
            com.tencent.mm.storage.f9 f9Var2 = new com.tencent.mm.storage.f9();
            f9Var2.e1(c01.w9.o(f9Var.Q0()));
            f9Var2.u1(f9Var.Q0());
            f9Var2.d1(str);
            f9Var2.setType(10000);
            f9Var2.r1(6);
            f9Var2.j1(0);
            ((com.tencent.mm.storage.g9) c01.d9.b().u()).M9(f9Var2);
            this.f189017e.f189076n = false;
            return;
        }
        com.tencent.mm.pluginsdk.model.app.d dVar = this.f189014b;
        dVar.field_signature = str4;
        dVar.field_fakeAeskey = str5;
        dVar.field_fakeSignature = str6;
        dVar.field_lastModifyTime = c01.id.e();
        java.lang.String j18 = f9Var.j();
        if (com.tencent.mm.storage.z3.R4(f9Var.Q0()) && (t17 = c01.w9.t(f9Var.j())) != -1) {
            j18 = (f9Var.j() + " ").substring(t17 + 2).trim();
        }
        ot0.q v17 = ot0.q.v(j18);
        if (v17 != null) {
            v17.f348710t = str2;
            v17.T = str3;
            v17.f348682m = j17;
            com.tencent.mm.storage.f9 Li = pt0.f0.Li(dVar.field_msgInfoTalker, dVar.field_msgInfoId);
            Li.d1(ot0.q.u(v17, null, null));
            ((com.tencent.mm.storage.g9) c01.d9.b().u()).lb(Li.getMsgId(), Li, true);
        }
        com.tencent.mm.pluginsdk.model.app.u5.wi().update(dVar, new java.lang.String[0]);
        c01.d9.e().g(new com.tencent.mm.pluginsdk.model.app.w4(this.f189015c, null, this.f189016d));
    }
}
