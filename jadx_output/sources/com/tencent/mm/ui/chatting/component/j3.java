package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public class j3 implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.h3 f199250d;

    public j3(com.tencent.mm.ui.chatting.component.h3 h3Var) {
        this.f199250d = h3Var;
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingBypComponent", "onNotifyChange " + str);
        if (!w0Var.f316973a.equals("FinderContact")) {
            java.lang.String str2 = w0Var.f316973a;
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            if (!str2.equals("FinderMsgContactStorage")) {
                return;
            }
        }
        com.tencent.mm.storage.e8 q17 = c01.d9.b().q();
        com.tencent.mm.ui.chatting.component.h3 h3Var = this.f199250d;
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) q17).n(h3Var.f198580d.x(), true);
        if (n17 == null || ((int) n17.E2) == 0) {
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(n17.P0())) {
            n17.M1(h3Var.f198580d.u().P0());
        }
        h3Var.f198580d.S(n17, null);
        ((com.tencent.mm.ui.chatting.component.pe) ((sb5.z0) h3Var.f198580d.f460708c.a(sb5.z0.class))).C();
        ((com.tencent.mm.ui.chatting.component.pe) ((sb5.z0) h3Var.f198580d.f460708c.a(sb5.z0.class))).J0(true);
        h3Var.f198580d.J();
        h3Var.C();
        h3Var.n0();
    }
}
