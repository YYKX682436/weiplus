package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public final class z2 extends com.tencent.mm.ui.chatting.component.a implements yn.e {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f200353e = "MicroMsg.ChattingBlockNotifyComponent";

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void E() {
        com.tencent.mars.xlog.Log.i(this.f200353e, "[onChattingEnterAnimEnd] setInterruptTouch false");
        ((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) this.f198580d.f460708c.a(sb5.z.class))).R1 = false;
    }

    @Override // com.tencent.mm.ui.chatting.component.a, com.tencent.mm.ui.chatting.component.hg
    public void I() {
        super.I();
    }

    @Override // com.tencent.mm.ui.chatting.component.a, com.tencent.mm.ui.chatting.component.hg
    public void L(yb5.d dVar) {
        super.L(dVar);
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void x() {
        com.tencent.mars.xlog.Log.i(this.f200353e, "[onChattingResume]");
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void z() {
        com.tencent.mars.xlog.Log.i(this.f200353e, "[onChattingEnterAnimStart] setInterruptTouch true");
        ((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) this.f198580d.f460708c.a(sb5.z.class))).R1 = true;
    }
}
