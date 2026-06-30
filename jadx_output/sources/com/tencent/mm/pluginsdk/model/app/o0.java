package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes9.dex */
public class o0 implements g35.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f189005a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f189006b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ot0.q f189007c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f189008d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f189009e;

    public o0(com.tencent.mm.storage.f9 f9Var, java.lang.String str, ot0.q qVar, java.lang.String str2, long j17) {
        this.f189005a = f9Var;
        this.f189006b = str;
        this.f189007c = qVar;
        this.f189008d = str2;
        this.f189009e = j17;
    }

    @Override // g35.d
    public void a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, long j17) {
        int i17;
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str4);
        com.tencent.mm.storage.f9 f9Var = this.f189005a;
        if (K0) {
            f9Var.r1(5);
            bu.a.e(f9Var.getMsgId(), bu.a.c(0, 0, str, 727));
            ((com.tencent.mm.storage.g9) c01.d9.b().u()).lb(f9Var.getMsgId(), f9Var, true);
            com.tencent.mm.storage.f9 f9Var2 = new com.tencent.mm.storage.f9();
            f9Var2.e1(c01.w9.o(f9Var2.Q0()));
            f9Var2.u1(f9Var2.Q0());
            f9Var2.d1(str);
            f9Var2.setType(10000);
            f9Var2.r1(6);
            f9Var2.j1(0);
            ((com.tencent.mm.storage.g9) c01.d9.b().u()).M9(f9Var2);
            return;
        }
        java.lang.String str7 = this.f189006b;
        if (com.tencent.mm.storage.z3.L4(str7) && ((i17 = this.f189007c.f348666i) == 24 || i17 == 1)) {
            com.tencent.mm.pluginsdk.model.app.k0.M(f9Var, str7, this.f189008d);
            return;
        }
        com.tencent.mm.pluginsdk.model.app.s5 Ni = com.tencent.mm.pluginsdk.model.app.u5.Ni();
        java.lang.String str8 = this.f189006b;
        long j18 = this.f189009e;
        java.lang.String str9 = this.f189008d;
        f9Var.getType();
        Ni.getClass();
        c01.d9.e().g(new com.tencent.mm.pluginsdk.model.app.c4(str8, j18, str9, str4));
    }
}
