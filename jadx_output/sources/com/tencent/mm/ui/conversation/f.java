package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class f implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.AppBrandServiceConversationUI.AppBrandServiceConversationFmUI f207657d;

    public f(com.tencent.mm.ui.conversation.AppBrandServiceConversationUI.AppBrandServiceConversationFmUI appBrandServiceConversationFmUI) {
        this.f207657d = appBrandServiceConversationFmUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f207657d.finish();
        return true;
    }
}
