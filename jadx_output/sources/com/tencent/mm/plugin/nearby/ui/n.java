package com.tencent.mm.plugin.nearby.ui;

/* loaded from: classes3.dex */
public class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.nearby.ui.NearbyFriendShowSayHiUI f152185d;

    public n(com.tencent.mm.plugin.nearby.ui.NearbyFriendShowSayHiUI nearbyFriendShowSayHiUI) {
        this.f152185d = nearbyFriendShowSayHiUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/nearby/ui/NearbyFriendShowSayHiUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((wo2.k) ((ws5.g) i95.n0.c(ws5.g.class))).Ni(14L);
        com.tencent.mm.plugin.nearby.ui.NearbyFriendShowSayHiUI nearbyFriendShowSayHiUI = this.f152185d;
        android.content.Intent intent = new android.content.Intent(this.f152185d, (java.lang.Class<?>) com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI.class);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(nearbyFriendShowSayHiUI, arrayList2.toArray(), "com/tencent/mm/plugin/nearby/ui/NearbyFriendShowSayHiUI$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        nearbyFriendShowSayHiUI.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(nearbyFriendShowSayHiUI, "com/tencent/mm/plugin/nearby/ui/NearbyFriendShowSayHiUI$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/nearby/ui/NearbyFriendShowSayHiUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
