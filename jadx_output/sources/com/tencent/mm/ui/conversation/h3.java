package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class h3 implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.ConversationListView f207715d;

    public h3(com.tencent.mm.ui.conversation.ConversationListView conversationListView) {
        this.f207715d = conversationListView;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ConversationListView", "ActionBarView layout changed, call setupActionBarView()");
        int i39 = com.tencent.mm.ui.conversation.ConversationListView.f207310x0;
        this.f207715d.y();
    }
}
