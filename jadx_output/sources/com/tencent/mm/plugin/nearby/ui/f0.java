package com.tencent.mm.plugin.nearby.ui;

/* loaded from: classes15.dex */
public class f0 implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI f152137d;

    public f0(com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI nearbyFriendsUI) {
        this.f152137d = nearbyFriendsUI;
    }

    @Override // i11.c
    public boolean onGetLocation(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI nearbyFriendsUI = this.f152137d;
        if (nearbyFriendsUI.f152103w) {
            return false;
        }
        nearbyFriendsUI.f152103w = true;
        if (nearbyFriendsUI.B) {
            com.tencent.mm.ui.widget.dialog.u3 u3Var = nearbyFriendsUI.f152087d;
            if (u3Var != null) {
                u3Var.dismiss();
                nearbyFriendsUI.f152087d = null;
            }
            com.tencent.mm.plugin.report.service.f0.e(11);
            return false;
        }
        if (z17) {
            com.tencent.mm.ui.widget.dialog.u3 u3Var2 = nearbyFriendsUI.f152087d;
            if (u3Var2 != null) {
                u3Var2.setMessage(nearbyFriendsUI.getString(com.tencent.mm.R.string.f492619h61));
            }
            int i18 = (int) d18;
            nearbyFriendsUI.f152105y = new com.tencent.mm.plugin.nearby.ui.m0(nearbyFriendsUI, f18, f17, i18);
            nearbyFriendsUI.f152090g = new an3.f(nearbyFriendsUI.f152096p, f17, f18, i18, i17, "", "");
            gm0.j1.d().g(nearbyFriendsUI.f152090g);
        } else {
            com.tencent.mm.plugin.report.service.f0.e(11);
            com.tencent.mm.ui.widget.dialog.u3 u3Var3 = nearbyFriendsUI.f152087d;
            if (u3Var3 != null) {
                u3Var3.dismiss();
                nearbyFriendsUI.f152087d = null;
            }
            android.view.View findViewById = nearbyFriendsUI.findViewById(com.tencent.mm.R.id.k5p);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI$4", "onGetLocation", "(ZFFIDDD)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI$4", "onGetLocation", "(ZFFIDDD)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            nearbyFriendsUI.f152089f.setVisibility(8);
            nearbyFriendsUI.f152101u = true;
            if (!nearbyFriendsUI.A && !com.tencent.mm.sdk.platformtools.n2.a()) {
                com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI nearbyFriendsUI2 = this.f152137d;
                nearbyFriendsUI2.A = true;
                db5.e1.C(nearbyFriendsUI2, nearbyFriendsUI2.getString(com.tencent.mm.R.string.fs_), nearbyFriendsUI.getString(com.tencent.mm.R.string.f490573yv), nearbyFriendsUI.getString(com.tencent.mm.R.string.g6z), nearbyFriendsUI.getString(com.tencent.mm.R.string.f490347sg), false, new com.tencent.mm.plugin.nearby.ui.e0(this), null);
            }
        }
        return false;
    }
}
