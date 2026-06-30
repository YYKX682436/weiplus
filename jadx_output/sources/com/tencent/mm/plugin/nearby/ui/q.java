package com.tencent.mm.plugin.nearby.ui;

/* loaded from: classes8.dex */
public class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.nearby.ui.NearbyFriendsIntroUI f152198d;

    public q(com.tencent.mm.plugin.nearby.ui.NearbyFriendsIntroUI nearbyFriendsIntroUI) {
        this.f152198d = nearbyFriendsIntroUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/nearby/ui/NearbyFriendsIntroUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.nearby.ui.NearbyFriendsIntroUI nearbyFriendsIntroUI = this.f152198d;
        com.tencent.mm.ui.widget.dialog.j0 j0Var = nearbyFriendsIntroUI.f152085d;
        if (j0Var == null) {
            nearbyFriendsIntroUI.f152085d = db5.e1.x(nearbyFriendsIntroUI.getContext(), nearbyFriendsIntroUI.getString(com.tencent.mm.R.string.f490573yv), null, nearbyFriendsIntroUI.f152086e, new com.tencent.mm.plugin.nearby.ui.p(this), null);
        } else {
            j0Var.show();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/nearby/ui/NearbyFriendsIntroUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
