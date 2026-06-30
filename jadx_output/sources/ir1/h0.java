package ir1;

/* loaded from: classes11.dex */
public final class h0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.conversation.ui.BizFansConversationListUI f293978d;

    public h0(com.tencent.mm.plugin.brandservice.conversation.ui.BizFansConversationListUI bizFansConversationListUI) {
        this.f293978d = bizFansConversationListUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.brandservice.conversation.ui.BizFansConversationListUI bizFansConversationListUI = this.f293978d;
        intent.putExtra("serviceType", bizFansConversationListUI.f93950f);
        j45.l.n(bizFansConversationListUI, "brandservice", ".conversation.ui.BizFansSettingUI", intent, bizFansConversationListUI.f93948d);
        return true;
    }
}
