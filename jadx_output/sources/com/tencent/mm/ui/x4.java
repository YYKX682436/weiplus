package com.tencent.mm.ui;

/* loaded from: classes3.dex */
public class x4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.FindMoreFriendsUI f212543d;

    public x4(com.tencent.mm.ui.FindMoreFriendsUI findMoreFriendsUI) {
        this.f212543d = findMoreFriendsUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/FindMoreFriendsUI$19", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.FindMoreFriendsUI findMoreFriendsUI = this.f212543d;
        android.content.Intent intent = new android.content.Intent(this.f212543d.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindMoreV2UI.class);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findMoreFriendsUI, arrayList2.toArray(), "com/tencent/mm/ui/FindMoreFriendsUI$19", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        findMoreFriendsUI.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(findMoreFriendsUI, "com/tencent/mm/ui/FindMoreFriendsUI$19", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/ui/FindMoreFriendsUI$19", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
