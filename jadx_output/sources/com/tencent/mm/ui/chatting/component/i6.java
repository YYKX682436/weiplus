package com.tencent.mm.ui.chatting.component;

/* loaded from: classes10.dex */
public final class i6 extends com.tencent.mm.ui.chatting.component.a implements yn.e {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f199210e = "ChattingPermissionComponent";

    /* renamed from: f, reason: collision with root package name */
    public yb5.d f199211f;

    @Override // com.tencent.mm.ui.chatting.component.a, com.tencent.mm.ui.chatting.component.hg
    public void I() {
        super.I();
        this.f199211f = null;
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void K() {
        com.tencent.mars.xlog.Log.i(this.f199210e, "[onChattingExitAnimStart]");
        yb5.d dVar = this.f199211f;
        if (c01.e2.G(dVar != null ? dVar.x() : null)) {
            ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).rj(".ui.chatting.ChattingBizView");
        } else {
            ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).rj(".ui.chatting.ChattingView");
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, com.tencent.mm.ui.chatting.component.hg
    public void L(yb5.d dVar) {
        super.L(dVar);
        this.f199211f = dVar;
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void x() {
        com.tencent.mars.xlog.Log.i(this.f199210e, "[onChattingResume]");
        yb5.d dVar = this.f199211f;
        if (c01.e2.G(dVar != null ? dVar.x() : null)) {
            ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).getClass();
            com.tencent.mm.sensitive.business.BusinessStackRecorder.f193183f.b().b("com.tencent.mm.sensitive.SENSITIVE_PAGE_RESUME", ".ui.chatting.ChattingBizView", "");
        } else {
            ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).getClass();
            com.tencent.mm.sensitive.business.BusinessStackRecorder.f193183f.b().b("com.tencent.mm.sensitive.SENSITIVE_PAGE_RESUME", ".ui.chatting.ChattingView", "");
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void z() {
        com.tencent.mars.xlog.Log.i(this.f199210e, "[onChattingEnterAnimStart]");
        yb5.d dVar = this.f199211f;
        if (c01.e2.G(dVar != null ? dVar.x() : null)) {
            ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).qj(".ui.chatting.ChattingBizView");
        } else {
            ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).qj(".ui.chatting.ChattingView");
        }
    }
}
