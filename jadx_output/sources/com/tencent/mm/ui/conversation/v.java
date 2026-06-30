package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class v implements db5.x8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.BaseConversationUI f208178a;

    public v(com.tencent.mm.ui.conversation.BaseConversationUI baseConversationUI) {
        this.f208178a = baseConversationUI;
    }

    @Override // db5.x8
    public void a() {
        boolean z17;
        com.tencent.mm.ui.base.OnLayoutChangedLinearLayout onLayoutChangedLinearLayout;
        com.tencent.mm.ui.tools.TestTimeForChatting testTimeForChatting;
        com.tencent.mm.ui.conversation.BaseConversationUI baseConversationUI = this.f208178a;
        com.tencent.mm.ui.conversation.BaseConversationUI.access$500(baseConversationUI);
        z17 = baseConversationUI.mNeedChattingAnim;
        if (z17) {
            testTimeForChatting = baseConversationUI.chattingView;
            testTimeForChatting.setOndispatchDraw(new com.tencent.mm.ui.conversation.u(this));
            baseConversationUI.mNeedChattingAnim = false;
        } else {
            com.tencent.mm.ui.conversation.BaseConversationUI.access$800(baseConversationUI);
            com.tencent.mm.ui.conversation.BaseConversationUI.access$900(baseConversationUI);
        }
        onLayoutChangedLinearLayout = baseConversationUI.chattingFragmentView;
        onLayoutChangedLinearLayout.f197686d = null;
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseConversationUI", "klem CHATTING ONLAYOUT ");
    }
}
