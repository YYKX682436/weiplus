package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public class ec extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.gc f198966a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ec(com.tencent.mm.ui.chatting.component.gc gcVar, android.os.Looper looper) {
        super(looper);
        this.f198966a = gcVar;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        super.handleMessage(message);
        com.tencent.mm.ui.chatting.component.gc gcVar = this.f198966a;
        gcVar.f198580d.b0();
        int i17 = message.what;
        if (i17 == 1) {
            boolean z17 = ((com.tencent.mm.ui.chatting.component.jk) ((sb5.u1) gcVar.f198580d.f460708c.a(sb5.u1.class))).f199296g;
            ((com.tencent.mm.ui.chatting.ChattingUIFragment) gcVar.f198580d.f460719n).i1(false);
            ((com.tencent.mm.ui.chatting.ChattingUIFragment) gcVar.f198580d.f460719n).h1(true);
            if (z17) {
                ((com.tencent.mm.ui.chatting.ChattingUIFragment) gcVar.f198580d.f460719n).B.c(true);
            } else {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putBoolean("load_bottom", true);
                ((com.tencent.mm.ui.chatting.ChattingUIFragment) gcVar.f198580d.f460719n).b1(bundle);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.GetChatroomComponent", "[CheckGetChatroomTask$handleMessage] load bottom! isFromSearch:%s talker:%s", java.lang.Boolean.valueOf(z17), gcVar.f198580d.x());
            return;
        }
        if (i17 == 2) {
            ((com.tencent.mm.ui.chatting.ChattingUIFragment) gcVar.f198580d.f460719n).i1(true);
            ((com.tencent.mm.ui.chatting.ChattingUIFragment) gcVar.f198580d.f460719n).h1(true);
            gcVar.f199098h.postDelayed(new com.tencent.mm.ui.chatting.component.dc(this), 300L);
            com.tencent.mars.xlog.Log.i("MicroMsg.GetChatroomComponent", "[CheckGetChatroomTask$handleMessage] unLoad bottom! talker:%s", gcVar.f198580d.x());
            return;
        }
        if (i17 != 4) {
            if (i17 == 8) {
                com.tencent.mars.xlog.Log.i("MicroMsg.GetChatroomComponent", "[CheckGetChatroomTask$handleMessage] reset presenter");
                gcVar.f198580d.f460717l.R0();
                return;
            }
            return;
        }
        ((com.tencent.mm.ui.chatting.ChattingUIFragment) gcVar.f198580d.f460719n).i1(false);
        ((com.tencent.mm.ui.chatting.ChattingUIFragment) gcVar.f198580d.f460719n).h1(true);
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putBoolean("load_bottom", true);
        ((com.tencent.mm.ui.chatting.ChattingUIFragment) gcVar.f198580d.f460719n).b1(bundle2);
        com.tencent.mars.xlog.Log.i("MicroMsg.GetChatroomComponent", "[CheckGetChatroomTask$handleMessage] unLoad bottom and reset! talker:%s", gcVar.f198580d.x());
    }
}
