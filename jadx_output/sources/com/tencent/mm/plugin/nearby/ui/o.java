package com.tencent.mm.plugin.nearby.ui;

/* loaded from: classes3.dex */
public class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.nearby.ui.NearbyFriendShowSayHiUI f152193d;

    public o(com.tencent.mm.plugin.nearby.ui.NearbyFriendShowSayHiUI nearbyFriendShowSayHiUI) {
        this.f152193d = nearbyFriendShowSayHiUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/nearby/ui/NearbyFriendShowSayHiUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.nearby.ui.NearbyFriendShowSayHiUI nearbyFriendShowSayHiUI = this.f152193d;
        android.content.Intent intent = new android.content.Intent(nearbyFriendShowSayHiUI, (java.lang.Class<?>) com.tencent.mm.plugin.nearby.ui.NearbySayHiListUI.class);
        intent.putExtra("k_say_hi_type", 2);
        intent.putExtra("show_clear_header", true);
        nearbyFriendShowSayHiUI.startActivityForResult(intent, com.tencent.rtmp.TXLiveConstants.PLAY_EVT_CHANGE_RESOLUTION);
        yj0.a.h(this, "com/tencent/mm/plugin/nearby/ui/NearbyFriendShowSayHiUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
