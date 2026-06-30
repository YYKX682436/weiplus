package com.tencent.mm.ui.conversation;

/* loaded from: classes.dex */
public class sa implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.ServiceNotifyConversationUI f208069d;

    public sa(com.tencent.mm.ui.conversation.ServiceNotifyConversationUI serviceNotifyConversationUI) {
        this.f208069d = serviceNotifyConversationUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        android.content.Intent intent = new android.content.Intent(this.f208069d.getContext(), (java.lang.Class<?>) com.tencent.mm.ui.ServiceNotifySettingsUI.class);
        intent.putExtra("mode", 0);
        intent.putExtra("from_scene", "scene_service_notify_conversation");
        com.tencent.mm.ui.conversation.ServiceNotifyConversationUI serviceNotifyConversationUI = this.f208069d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(serviceNotifyConversationUI, arrayList.toArray(), "com/tencent/mm/ui/conversation/ServiceNotifyConversationUI$2", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        serviceNotifyConversationUI.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(serviceNotifyConversationUI, "com/tencent/mm/ui/conversation/ServiceNotifyConversationUI$2", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(21825, 2, null, java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.i1()), null, null, 0, 0, 0, 0, te5.v1.f418758b);
        return true;
    }
}
