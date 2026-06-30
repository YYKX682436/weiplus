package ir1;

/* loaded from: classes3.dex */
public final class j1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.conversation.ui.BizFansPrivateMsgScopeSettingUI f294007d;

    public j1(com.tencent.mm.plugin.brandservice.conversation.ui.BizFansPrivateMsgScopeSettingUI bizFansPrivateMsgScopeSettingUI) {
        this.f294007d = bizFansPrivateMsgScopeSettingUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.brandservice.conversation.ui.BizFansPrivateMsgScopeSettingUI bizFansPrivateMsgScopeSettingUI = this.f294007d;
        bizFansPrivateMsgScopeSettingUI.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_ori_scope_type", bizFansPrivateMsgScopeSettingUI.f93956f);
        bizFansPrivateMsgScopeSettingUI.setResult(-1, intent);
        bizFansPrivateMsgScopeSettingUI.finish();
        return true;
    }
}
