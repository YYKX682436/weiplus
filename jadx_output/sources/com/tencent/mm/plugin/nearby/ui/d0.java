package com.tencent.mm.plugin.nearby.ui;

/* loaded from: classes15.dex */
public class d0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI f152132d;

    public d0(com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI nearbyFriendsUI) {
        this.f152132d = nearbyFriendsUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI nearbyFriendsUI = this.f152132d;
        nearbyFriendsUI.B = true;
        com.tencent.mm.plugin.report.service.f0.e(11);
        if (nearbyFriendsUI.f152090g != null) {
            gm0.j1.d().d(nearbyFriendsUI.f152090g);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NearbyFriend", "[MonsterzDai]  [loading cancel] cancel in loading");
        if (nearbyFriendsUI.f152101u) {
            return;
        }
        nearbyFriendsUI.finish();
        com.tencent.mars.xlog.Log.i("MicroMsg.NearbyFriend", "[MonsterzDai]  [loading cancel] cancel in first loading");
    }
}
