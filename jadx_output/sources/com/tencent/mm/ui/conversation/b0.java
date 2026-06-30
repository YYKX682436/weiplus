package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class b0 extends yb5.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.BaseConversationUI f207452d;

    public b0(com.tencent.mm.ui.conversation.BaseConversationUI baseConversationUI) {
        this.f207452d = baseConversationUI;
    }

    @Override // yb5.n
    public void a() {
        com.tencent.mm.ui.tools.TestTimeForChatting testTimeForChatting;
        com.tencent.mm.ui.tools.TestTimeForChatting testTimeForChatting2;
        boolean isShown;
        int i17;
        com.tencent.mm.ui.base.OnLayoutChangedLinearLayout onLayoutChangedLinearLayout;
        db5.x8 x8Var;
        com.tencent.mm.ui.tools.TestTimeForChatting testTimeForChatting3;
        com.tencent.mm.ui.tools.TestTimeForChatting testTimeForChatting4;
        com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment;
        com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment2;
        com.tencent.mm.ui.conversation.BaseConversationUI baseConversationUI = this.f207452d;
        if (!baseConversationUI.mChattingClosed) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BaseConversationUI", "start chatting but last chatting does't be close!");
            baseConversationUI.closeChatting(false);
        }
        if (baseConversationUI.isFinishing() || baseConversationUI.isPaused() || !baseConversationUI.mChattingClosed) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BaseConversationUI", "[startChattingRunnable] pass! isPause:%s mChattingClosed:%s", java.lang.Boolean.valueOf(baseConversationUI.isPaused()), java.lang.Boolean.valueOf(baseConversationUI.mChattingClosed));
            return;
        }
        baseConversationUI.mChattingClosed = false;
        java.lang.Object[] objArr = new java.lang.Object[1];
        testTimeForChatting = baseConversationUI.chattingView;
        if (testTimeForChatting == null) {
            isShown = false;
        } else {
            testTimeForChatting2 = baseConversationUI.chattingView;
            isShown = testTimeForChatting2.isShown();
        }
        objArr[0] = java.lang.Boolean.valueOf(isShown);
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseConversationUI", "ashutest::startChatting, ishow:%b", objArr);
        android.content.Intent putExtra = new android.content.Intent().putExtra("Chat_User", baseConversationUI.pendingUser);
        i17 = baseConversationUI.unreadSum;
        putExtra.putExtra("key_chat_unread", i17);
        android.os.Bundle bundle = baseConversationUI.pendingBundle;
        if (bundle != null) {
            putExtra.putExtras(bundle);
        }
        putExtra.putExtra("img_gallery_enter_from_chatting_ui", true);
        com.tencent.mm.ui.conversation.BaseConversationUI.access$100(baseConversationUI, putExtra, false);
        onLayoutChangedLinearLayout = baseConversationUI.chattingFragmentView;
        x8Var = baseConversationUI.onChattingLayoutChangedListener;
        onLayoutChangedLinearLayout.setOnChattingLayoutChangedListener(x8Var);
        int width = baseConversationUI.getWindow().getDecorView().getWidth() == 0 ? baseConversationUI.getResources().getDisplayMetrics().widthPixels : baseConversationUI.getWindow().getDecorView().getWidth();
        testTimeForChatting3 = baseConversationUI.chattingView;
        testTimeForChatting3.setTranslationX(width - 0.1f);
        testTimeForChatting4 = baseConversationUI.chattingView;
        testTimeForChatting4.setVisibility(0);
        baseConversationUI.pauseMainFragment();
        chattingUIFragment = baseConversationUI.chattingFragmet;
        if (chattingUIFragment.isSupportNavigationSwipeBack()) {
            al5.a3.d(baseConversationUI);
        }
        chattingUIFragment2 = baseConversationUI.chattingFragmet;
        chattingUIFragment2.getIdentityString();
        baseConversationUI.chattinguiResumeTime = com.tencent.mm.sdk.platformtools.t8.i1();
    }

    public java.lang.String toString() {
        return super.toString() + "|startChattingRunnable";
    }
}
