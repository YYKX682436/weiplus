package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes9.dex */
public class a2 extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public final r45.lo0 f137450n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.l2 f137451o;

    public a2(com.tencent.mm.plugin.fts.logic.l2 l2Var, r45.lo0 lo0Var) {
        this.f137451o = l2Var;
        this.f137450n = lo0Var;
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "InsertVoiceTransTextTask";
    }

    @Override // p13.c
    public boolean i() {
        java.lang.String str;
        r45.lo0 lo0Var = this.f137450n;
        java.lang.String a17 = o13.n.a(lo0Var.f379671f);
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(a17);
        com.tencent.mm.plugin.fts.logic.l2 l2Var = this.f137451o;
        if (K0) {
            l2Var.f137611m.a(lo0Var.f379669d);
            return true;
        }
        java.lang.String str2 = lo0Var.f379670e;
        if (lo0Var.f379673h == 1) {
            str = c01.z1.r();
        } else if (com.tencent.mm.storage.z3.R4(str2)) {
            com.tencent.mm.storage.f9 f27 = pt0.f0.f2(lo0Var.f379670e, lo0Var.f379669d);
            if (f27 != null) {
                str = c01.w9.s(f27.j());
                java.lang.String str3 = lo0Var.f379670e;
                if (str == null) {
                    str = str3;
                }
            } else {
                str = lo0Var.f379670e;
            }
        } else {
            str = lo0Var.f379670e;
        }
        java.lang.String str4 = str;
        l2Var.f137609h.h();
        l2Var.f137609h.N(65536, 70, lo0Var.f379669d, str2, lo0Var.f379672g, a17, str4);
        l2Var.f137609h.j();
        l2Var.f137611m.a(lo0Var.f379669d);
        return true;
    }

    @Override // p13.c
    public java.lang.String j() {
        r45.lo0 lo0Var = this.f137450n;
        return java.lang.String.format("{msgId: %d, talker: %s}", java.lang.Long.valueOf(lo0Var.f379669d), lo0Var.f379670e);
    }
}
