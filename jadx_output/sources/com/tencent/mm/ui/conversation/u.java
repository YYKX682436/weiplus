package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class u implements com.tencent.mm.ui.tools.od {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.v f208089a;

    public u(com.tencent.mm.ui.conversation.v vVar) {
        this.f208089a = vVar;
    }

    @Override // com.tencent.mm.ui.tools.od
    public void a() {
        com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment;
        com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment2;
        com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment3;
        com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment4;
        com.tencent.mm.ui.tools.TestTimeForChatting testTimeForChatting;
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseConversationUI", "[onDrawed]");
        com.tencent.mm.ui.conversation.v vVar = this.f208089a;
        vVar.f208178a.onDrawStart = java.lang.System.currentTimeMillis();
        com.tencent.mm.ui.conversation.BaseConversationUI baseConversationUI = vVar.f208178a;
        chattingUIFragment = baseConversationUI.chattingFragmet;
        if (chattingUIFragment == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BaseConversationUI", "chattingFragmet is null!");
            return;
        }
        chattingUIFragment2 = baseConversationUI.chattingFragmet;
        boolean K0 = chattingUIFragment2.K0();
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseConversationUI", "[onDrawed] isReadyToStartAnim:%s ", java.lang.Boolean.valueOf(K0));
        if (K0) {
            chattingUIFragment3 = baseConversationUI.chattingFragmet;
            chattingUIFragment3.T0();
            chattingUIFragment4 = baseConversationUI.chattingFragmet;
            chattingUIFragment4.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseChattingUIFragment", "onDrawReadyForAnimStart called");
            ((hd5.j) ((hd5.v) ((ke5.a) chattingUIFragment4.B0()).f307040a).f280654e).a();
            com.tencent.mm.ui.cf.f198092d.c();
            baseConversationUI.startChattingViewAnimation();
            testTimeForChatting = baseConversationUI.chattingView;
            testTimeForChatting.setOndispatchDraw(null);
        }
    }
}
