package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class v4 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f202792d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f202793e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.b5 f202794f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.s4 f202795g;

    public v4(com.tencent.mm.ui.chatting.s4 s4Var, boolean z17, boolean z18, com.tencent.mm.ui.chatting.b5 b5Var) {
        this.f202795g = s4Var;
        this.f202792d = z17;
        this.f202793e = z18;
        this.f202794f = b5Var;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.ui.chatting.a5 J2;
        boolean Ri = ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).Ri();
        com.tencent.mm.ui.chatting.s4 s4Var = this.f202795g;
        com.tencent.mm.ui.chatting.h4.u(s4Var.f202659b, "view_exp", Ri);
        if (Ri) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(182, 217);
            g4Var.u(0, s4Var.f202659b.f201645j.s().getString(com.tencent.mm.R.string.b4g), false, true);
        } else {
            g4Var.f(0, s4Var.f202659b.f201645j.s().getString(com.tencent.mm.R.string.b4g));
        }
        if (this.f202792d) {
            g4Var.p(1, s4Var.f202659b.f201645j.s().getString(com.tencent.mm.R.string.b4e), s4Var.f202659b.f201645j.s().getString(com.tencent.mm.R.string.b4d), 0);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(22385, 1, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        }
        if (!this.f202793e || (J2 = com.tencent.mm.ui.chatting.h4.J(this.f202794f)) == null) {
            return;
        }
        g4Var.p(2, J2.f198363a, J2.f198364b, 0);
    }
}
