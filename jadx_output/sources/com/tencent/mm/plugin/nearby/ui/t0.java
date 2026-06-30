package com.tencent.mm.plugin.nearby.ui;

/* loaded from: classes8.dex */
public class t0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.nearby.ui.NearbyPersonalInfoUI f152219d;

    public t0(com.tencent.mm.plugin.nearby.ui.NearbyPersonalInfoUI nearbyPersonalInfoUI) {
        this.f152219d = nearbyPersonalInfoUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.nearby.ui.NearbyPersonalInfoUI nearbyPersonalInfoUI = this.f152219d;
        if (nearbyPersonalInfoUI.f152109e != -1) {
            c01.fb a17 = c01.fb.a();
            a17.f37188b = nearbyPersonalInfoUI.f152109e;
            c01.fb.e(a17);
        }
        c01.fb b17 = c01.fb.b();
        if (b17 == null) {
            db5.e1.m(nearbyPersonalInfoUI.getContext(), com.tencent.mm.R.string.h78, com.tencent.mm.R.string.f490573yv, new com.tencent.mm.plugin.nearby.ui.v0(nearbyPersonalInfoUI));
        } else {
            java.lang.String d17 = b17.d();
            if (d17 == null) {
                d17 = "";
            }
            b17.c();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            int i17 = b17.f37188b;
            if (com.tencent.mm.sdk.platformtools.t8.K0(d17) || i17 == 0) {
                db5.e1.m(nearbyPersonalInfoUI.getContext(), com.tencent.mm.R.string.h78, com.tencent.mm.R.string.f490573yv, new com.tencent.mm.plugin.nearby.ui.v0(nearbyPersonalInfoUI));
            } else {
                m25.a.a(nearbyPersonalInfoUI.getContext(), new android.content.Intent());
                c01.fb a18 = c01.fb.a();
                if (i17 != -1) {
                    a18.f37188b = i17;
                }
                ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(1, c01.fb.e(a18)));
                nearbyPersonalInfoUI.finish();
            }
        }
        return true;
    }
}
