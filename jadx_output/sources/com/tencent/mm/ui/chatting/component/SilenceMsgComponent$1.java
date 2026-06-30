package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
class SilenceMsgComponent$1 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SilenceNotifyEvent> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.ml f198567d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SilenceMsgComponent$1(com.tencent.mm.ui.chatting.component.ml mlVar, androidx.lifecycle.y yVar) {
        super(yVar);
        this.f198567d = mlVar;
        this.__eventId = 562497440;
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.autogen.events.SilenceNotifyEvent silenceNotifyEvent) {
        byte[] bArr = silenceNotifyEvent.f54786g.f8138a;
        if (bArr != null) {
            r45.k4 k4Var = new r45.k4();
            try {
                k4Var.parseFrom(bArr);
                java.lang.String g17 = x51.j1.g(k4Var.f378345d);
                com.tencent.mm.ui.chatting.component.ml mlVar = this.f198567d;
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr SilenceNotifyEvent callback chatRoomId[%s], current talker[%s]", g17, mlVar.f198580d.u().d1());
                if (!com.tencent.mm.sdk.platformtools.t8.K0(g17) && g17.equals(mlVar.f198580d.u().d1())) {
                    gm0.j1.e().j(new com.tencent.mm.ui.chatting.component.hl(this, k4Var.f378347f, k4Var.f378349h, g17));
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ChattingUI.SilenceMsgComponent", e17, "summerbadcr SilenceNotifyEvent callback parse:", new java.lang.Object[0]);
            }
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr silenceNotifyListener callback event data is null");
        }
        return false;
    }
}
