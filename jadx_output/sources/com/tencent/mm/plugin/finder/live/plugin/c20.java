package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class c20 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.e20 f112097d;

    public c20(com.tencent.mm.plugin.finder.live.plugin.e20 e20Var) {
        this.f112097d = e20Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.live.plugin.e20 e20Var = this.f112097d;
        e20Var.getClass();
        boolean z17 = dk2.ef.f233384g;
        zl2.r4 r4Var = zl2.r4.f473950a;
        boolean M = r4Var.M();
        boolean z18 = ((mm2.m6) e20Var.P0(mm2.m6.class)).f329248p;
        java.lang.Boolean bool = (java.lang.Boolean) ((mm2.m6) e20Var.P0(mm2.m6.class)).f329245m.getValue();
        boolean h27 = r4Var.h2(e20Var.S0());
        com.tencent.mars.xlog.Log.i("FinderLiveOldSongBannerPlugin", "[OldSongBanner] checkNeedShow: isAnchor=" + z17 + ", enableSingSong=" + M + ", isNewVersionSongList=" + z18 + ", showSongList=" + bool + ", isSongListEnabled=" + h27);
        if (!M) {
            e20Var.K0(8);
            return;
        }
        if (z17) {
            if (h27) {
                e20Var.K0(0);
                return;
            } else {
                e20Var.K0(8);
                return;
            }
        }
        if (bool != null) {
            if (bool.booleanValue() && h27) {
                e20Var.K0(0);
            } else {
                e20Var.K0(8);
            }
        }
    }
}
