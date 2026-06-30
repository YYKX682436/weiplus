package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class x4 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f206229d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.b5 f206230e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f206231f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.s4 f206232g;

    public x4(com.tencent.mm.ui.chatting.s4 s4Var, java.lang.String str, com.tencent.mm.ui.chatting.b5 b5Var, int i17) {
        this.f206232g = s4Var;
        this.f206229d = str;
        this.f206230e = b5Var;
        this.f206231f = i17;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.ui.chatting.a5 J2;
        boolean Ri = ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).Ri();
        com.tencent.mm.ui.chatting.s4 s4Var = this.f206232g;
        com.tencent.mm.ui.chatting.h4.u(s4Var.f202659b, "view_exp", Ri);
        if (Ri) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(182, 217);
            g4Var.u(0, s4Var.f202659b.f201645j.s().getString(com.tencent.mm.R.string.b4g), false, true);
        } else {
            g4Var.f(0, s4Var.f202659b.f201645j.s().getString(com.tencent.mm.R.string.b4g));
        }
        if (!com.tencent.mm.ui.chatting.h4.M(this.f206229d)) {
            com.tencent.mm.autogen.mmdata.rpt.HBReportNewStruct hBReportNewStruct = new com.tencent.mm.autogen.mmdata.rpt.HBReportNewStruct();
            hBReportNewStruct.f58415d = 13L;
            hBReportNewStruct.k();
            java.lang.String string = s4Var.f202659b.f201645j.s().getString(com.tencent.mm.R.string.b4f);
            ((pg0.s3) ((qg0.h0) i95.n0.c(qg0.h0.class))).getClass();
            if (com.tencent.mm.plugin.luckymoney.model.m5.s()) {
                g4Var.f(1, (java.lang.String) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_HK_NEWYEAR_NAME_STRING_SYNC, string));
            } else {
                g4Var.f(1, string);
            }
        }
        com.tencent.mm.ui.chatting.b5 b5Var = this.f206230e;
        if (b5Var.f198486a && this.f206231f == 1 && (J2 = com.tencent.mm.ui.chatting.h4.J(b5Var)) != null) {
            g4Var.p(2, J2.f198363a, J2.f198364b, 0);
        }
    }
}
