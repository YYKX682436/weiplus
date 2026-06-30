package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class t6 implements ul5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.MainUI f208079a;

    public t6(com.tencent.mm.ui.conversation.MainUI mainUI) {
        this.f208079a = mainUI;
    }

    @Override // ul5.b
    public boolean a() {
        com.tencent.mm.ui.conversation.MainUI mainUI = this.f208079a;
        com.tencent.mm.ui.conversation.ConversationListView conversationListView = mainUI.f207372o;
        android.view.View childAt = conversationListView.getChildAt(conversationListView.getChildCount() - 1);
        return childAt != null && childAt.getBottom() <= mainUI.f207372o.getHeight() && (mainUI.f207372o.getLastVisiblePosition() == mainUI.f207372o.getAdapter().getCount() - 1 || childAt.getId() == com.tencent.mm.R.id.bp9);
    }
}
