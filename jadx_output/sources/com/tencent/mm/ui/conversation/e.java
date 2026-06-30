package com.tencent.mm.ui.conversation;

/* loaded from: classes9.dex */
public class e implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.AppBrandServiceConversationUI.AppBrandServiceConversationFmUI f207639d;

    public e(com.tencent.mm.ui.conversation.AppBrandServiceConversationUI.AppBrandServiceConversationFmUI appBrandServiceConversationFmUI) {
        this.f207639d = appBrandServiceConversationFmUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        java.lang.String str;
        com.tencent.mm.ui.conversation.AppBrandServiceConversationUI.AppBrandServiceConversationFmUI appBrandServiceConversationFmUI = this.f207639d;
        android.content.Intent intent = new android.content.Intent(appBrandServiceConversationFmUI.getContext(), (java.lang.Class<?>) com.tencent.mm.ui.ServiceNotifySettingsUI.class);
        intent.putExtra("mode", 1);
        str = appBrandServiceConversationFmUI.mSceneId;
        intent.putExtra("scene_id", str);
        com.tencent.mm.ui.conversation.AppBrandServiceConversationUI.AppBrandServiceConversationFmUI appBrandServiceConversationFmUI2 = this.f207639d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(appBrandServiceConversationFmUI2, arrayList.toArray(), "com/tencent/mm/ui/conversation/AppBrandServiceConversationUI$AppBrandServiceConversationFmUI$2", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        appBrandServiceConversationFmUI2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(appBrandServiceConversationFmUI2, "com/tencent/mm/ui/conversation/AppBrandServiceConversationUI$AppBrandServiceConversationFmUI$2", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return true;
    }
}
