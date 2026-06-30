package com.tencent.mm.ui.chatting.component;

@yn.c
/* loaded from: classes4.dex */
public final class a9 extends com.tencent.mm.ui.chatting.component.a implements yn.e {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f198613e = "MicroMsg.ChattingVoipComponent";

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void J() {
        java.lang.String x17 = this.f198580d.x();
        com.tencent.mars.xlog.Log.i(this.f198613e, "onChattingExitAnimEnd, talker:".concat(x17));
        if (x17.length() == 0) {
            return;
        }
        pm0.v.K(null, new com.tencent.mm.ui.chatting.component.z8(this, x17));
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void y() {
        com.tencent.mars.xlog.Log.i(this.f198613e, "onChattingPause, talker:".concat(this.f198580d.x()));
    }
}
