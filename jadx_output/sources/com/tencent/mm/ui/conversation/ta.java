package com.tencent.mm.ui.conversation;

/* loaded from: classes9.dex */
public class ta implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.ServiceNotifyConversationUI f208088d;

    public ta(com.tencent.mm.ui.conversation.ServiceNotifyConversationUI serviceNotifyConversationUI) {
        this.f208088d = serviceNotifyConversationUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f208088d.finish();
        return true;
    }
}
