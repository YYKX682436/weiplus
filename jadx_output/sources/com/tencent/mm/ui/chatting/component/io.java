package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public class io extends com.tencent.mm.ui.chatting.component.a implements yn.e, com.tencent.mm.modelbase.u0, l75.z0, l75.q0 {
    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void E() {
        c01.d9.e().a(137, this);
        ((l75.a1) c01.d9.b().q()).a(this);
    }

    @Override // com.tencent.mm.ui.chatting.component.a, com.tencent.mm.ui.chatting.component.hg
    public void I() {
        super.I();
        c01.d9.e().q(137, this);
        if (gm0.j1.a()) {
            ((l75.a1) c01.d9.b().q()).e(this);
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void K() {
        c01.d9.e().q(137, this);
        if (gm0.j1.a()) {
            ((l75.a1) c01.d9.b().q()).e(this);
        }
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        if (!this.f198580d.f460714i) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.VerifyUserComponent", "onNotifyChange fragment not foreground, return");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.VerifyUserComponent", "onNotifyChange " + i17);
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(this.f198580d.x(), true);
        if (n17 == null || ((int) n17.E2) == 0) {
            return;
        }
        if (n17 != this.f198580d.u() || com.tencent.mm.sdk.platformtools.t8.K0(n17.P0())) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(n17.P0())) {
                n17.M1(this.f198580d.u().P0());
            }
            if (!com.tencent.mm.storage.z3.L3(this.f198580d.x())) {
                this.f198580d.S(n17, null);
            }
            ((com.tencent.mm.ui.chatting.component.pe) ((sb5.z0) this.f198580d.f460708c.a(sb5.z0.class))).C();
            ((com.tencent.mm.ui.chatting.component.pe) ((sb5.z0) this.f198580d.f460708c.a(sb5.z0.class))).J0(false);
            this.f198580d.J();
        }
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        g(0, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    @Override // com.tencent.mm.modelbase.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSceneEnd(int r5, int r6, java.lang.String r7, com.tencent.mm.modelbase.m1 r8) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.component.io.onSceneEnd(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }
}
