package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.BaseConversationUI f208070d;

    public t(com.tencent.mm.ui.conversation.BaseConversationUI baseConversationUI) {
        this.f208070d = baseConversationUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.tools.TestTimeForChatting testTimeForChatting;
        com.tencent.mm.ui.IChattingUIProxy iChattingUIProxy;
        com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment;
        com.tencent.mm.ui.tools.TestTimeForChatting testTimeForChatting2;
        gm0.j1.e().o();
        com.tencent.mm.sdk.platformtools.u3.m(0);
        com.tencent.mm.ui.conversation.BaseConversationUI baseConversationUI = this.f208070d;
        baseConversationUI.onSwipe(1.0f);
        testTimeForChatting = baseConversationUI.chattingView;
        if (testTimeForChatting != null) {
            chattingUIFragment = baseConversationUI.chattingFragmet;
            if (chattingUIFragment != null) {
                testTimeForChatting2 = baseConversationUI.chattingView;
                testTimeForChatting2.c();
            }
        }
        iChattingUIProxy = baseConversationUI.chattingUIProxy;
        iChattingUIProxy.onEnterEnd();
        baseConversationUI.U6();
    }

    public java.lang.String toString() {
        return super.toString() + "|chattingView_onAnimationEnd";
    }
}
