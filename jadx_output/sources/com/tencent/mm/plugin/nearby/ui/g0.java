package com.tencent.mm.plugin.nearby.ui;

/* loaded from: classes4.dex */
public class g0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI f152140d;

    public g0(com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI nearbyFriendsUI) {
        this.f152140d = nearbyFriendsUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI nearbyFriendsUI = this.f152140d;
        nearbyFriendsUI.f152089f.removeHeaderView(nearbyFriendsUI.f152104x);
        nearbyFriendsUI.f152104x = null;
        android.content.Intent intent = new android.content.Intent(nearbyFriendsUI, (java.lang.Class<?>) com.tencent.mm.plugin.nearby.ui.NearbySayHiListUI.class);
        intent.putExtra("k_say_hi_type", 2);
        intent.putExtra("show_clear_header", true);
        nearbyFriendsUI.startActivityForResult(intent, com.tencent.rtmp.TXLiveConstants.PLAY_EVT_CHANGE_RESOLUTION);
        yj0.a.h(this, "com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
