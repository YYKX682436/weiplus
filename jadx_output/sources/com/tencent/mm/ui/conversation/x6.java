package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class x6 implements ih5.d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.MainUI f208233d;

    public x6(com.tencent.mm.ui.conversation.MainUI mainUI) {
        this.f208233d = mainUI;
    }

    @Override // ih5.d
    public void onFragmentVisibilityChanged(boolean z17) {
        if (this.f208233d.f207372o != null) {
            com.tencent.mm.ui.conversation.ConvExposeHelper.f207293d.getClass();
            com.tencent.mm.ui.conversation.ConvExposeHelper.f207303q.set(z17);
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.ui.conversation.p6(this, z17));
            com.tencent.mm.ui.conversation.ConversationListView conversationListView = this.f208233d.f207372o;
            if (conversationListView.f207311J) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ConversationListView", "onFragmentVisibilityChanged visible: %b", java.lang.Boolean.valueOf(z17));
                conversationListView.y();
            }
        }
    }
}
