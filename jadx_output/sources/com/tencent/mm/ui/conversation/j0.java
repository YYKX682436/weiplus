package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class j0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.ConvBoxServiceConversationUI.ConvBoxServiceConversationFmUI f207769d;

    public j0(com.tencent.mm.ui.conversation.ConvBoxServiceConversationUI.ConvBoxServiceConversationFmUI convBoxServiceConversationFmUI) {
        this.f207769d = convBoxServiceConversationFmUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f207769d.finish();
        return true;
    }
}
