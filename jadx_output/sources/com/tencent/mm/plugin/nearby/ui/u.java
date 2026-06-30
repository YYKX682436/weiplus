package com.tencent.mm.plugin.nearby.ui;

/* loaded from: classes14.dex */
public class u implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.nearby.ui.w f152220d;

    public u(com.tencent.mm.plugin.nearby.ui.w wVar) {
        this.f152220d = wVar;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.plugin.nearby.ui.w wVar = this.f152220d;
        if (i17 == 0) {
            com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI nearbyFriendsUI = wVar.f152222d;
            nearbyFriendsUI.f152096p = 4;
            nearbyFriendsUI.f152095o = false;
            gm0.j1.u().c().w(16386, java.lang.Integer.valueOf(wVar.f152222d.f152096p));
            wVar.f152222d.U6();
            return;
        }
        if (i17 == 1) {
            com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI nearbyFriendsUI2 = wVar.f152222d;
            nearbyFriendsUI2.f152096p = 3;
            nearbyFriendsUI2.f152095o = false;
            gm0.j1.u().c().w(16386, java.lang.Integer.valueOf(wVar.f152222d.f152096p));
            wVar.f152222d.U6();
            return;
        }
        if (i17 == 2) {
            com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI nearbyFriendsUI3 = wVar.f152222d;
            nearbyFriendsUI3.f152096p = 1;
            nearbyFriendsUI3.f152095o = false;
            gm0.j1.u().c().w(16386, java.lang.Integer.valueOf(wVar.f152222d.f152096p));
            wVar.f152222d.U6();
            return;
        }
        if (i17 == 3) {
            android.content.Intent intent = new android.content.Intent(wVar.f152222d, (java.lang.Class<?>) com.tencent.mm.plugin.nearby.ui.NearbySayHiListUI.class);
            intent.putExtra("k_say_hi_type", 2);
            wVar.f152222d.startActivityForResult(intent, com.tencent.rtmp.TXLiveConstants.PLAY_EVT_CHANGE_RESOLUTION);
        } else {
            if (i17 != 4) {
                return;
            }
            wVar.f152222d.f152091h = new an3.f(2, 0.0f, 0.0f, 0, 0, "", "");
            gm0.j1.d().g(wVar.f152222d.f152091h);
            com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI nearbyFriendsUI4 = wVar.f152222d;
            nearbyFriendsUI4.f152087d = db5.e1.Q(nearbyFriendsUI4.getContext(), wVar.f152222d.getString(com.tencent.mm.R.string.f490573yv), wVar.f152222d.getString(com.tencent.mm.R.string.h5z), true, true, new com.tencent.mm.plugin.nearby.ui.t(this));
        }
    }
}
