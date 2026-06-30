package com.tencent.mm.plugin.nearby.ui;

/* loaded from: classes15.dex */
public class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI f152224d;

    public x(com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI nearbyFriendsUI) {
        this.f152224d = nearbyFriendsUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI nearbyFriendsUI = this.f152224d;
        com.tencent.mm.plugin.nearby.ui.m0 m0Var = nearbyFriendsUI.f152105y;
        if (m0Var != null) {
            nearbyFriendsUI.f152092i = new an3.g(1, m0Var.f152179b, m0Var.f152178a, m0Var.f152180c, 0, "", "");
            nearbyFriendsUI.f152087d = db5.e1.Q(nearbyFriendsUI.getContext(), nearbyFriendsUI.getString(com.tencent.mm.R.string.f490573yv), nearbyFriendsUI.getString(com.tencent.mm.R.string.h6l), true, true, new com.tencent.mm.plugin.nearby.ui.y(nearbyFriendsUI));
            an3.e.a(3);
            gm0.j1.d().g(nearbyFriendsUI.f152092i);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
