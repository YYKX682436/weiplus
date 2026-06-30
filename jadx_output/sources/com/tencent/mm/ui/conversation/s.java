package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class s implements yb5.m {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.BaseConversationUI f208052d;

    public s(com.tencent.mm.ui.conversation.BaseConversationUI baseConversationUI) {
        this.f208052d = baseConversationUI;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public boolean queueIdle() {
        com.tencent.mm.ui.tools.TestTimeForChatting testTimeForChatting;
        com.tencent.mm.ui.tools.TestTimeForChatting testTimeForChatting2;
        java.lang.System.currentTimeMillis();
        com.tencent.mm.ui.conversation.BaseConversationUI baseConversationUI = this.f208052d;
        testTimeForChatting = baseConversationUI.chattingView;
        if (testTimeForChatting == null) {
            com.tencent.mm.ui.conversation.BaseConversationUI.BaseConversationFmUI baseConversationFmUI = baseConversationUI.conversationFm;
            com.tencent.mm.ui.conversation.BaseConversationUI.access$100(baseConversationUI, new android.content.Intent().putExtra("Chat_User", (baseConversationFmUI == null || com.tencent.mm.sdk.platformtools.t8.K0(baseConversationFmUI.getF207399d())) ? c01.z1.r() : baseConversationUI.conversationFm.getF207399d()), true);
            baseConversationUI.onPrepareChattingFragmentEnd();
            testTimeForChatting2 = baseConversationUI.chattingView;
            testTimeForChatting2.setVisibility(8);
            baseConversationUI.resumeMainFragment();
        }
        java.lang.System.currentTimeMillis();
        return false;
    }
}
