package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class u4 extends xt2.m6 implements jf2.j {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f119938d;

    /* renamed from: e, reason: collision with root package name */
    public final qo0.c f119939e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.plugin.l f119940f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f119941g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f119942h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f119943i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f119944m;

    /* renamed from: n, reason: collision with root package name */
    public androidx.lifecycle.y f119945n;

    public u4(android.view.ViewGroup root, qo0.c statusMonitor, com.tencent.mm.plugin.finder.live.plugin.l basePlugin) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        kotlin.jvm.internal.o.g(basePlugin, "basePlugin");
        this.f119938d = root;
        this.f119939e = statusMonitor;
        this.f119940f = basePlugin;
        this.f119941g = "Finder.FinderLiveAnchoMusicEntranceWidget";
        this.f119942h = true;
        this.f119943i = root.findViewById(com.tencent.mm.R.id.jzu);
        java.lang.Object context = root.getContext();
        this.f119945n = context instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) context : null;
        root.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.t4(this));
    }

    @Override // jf2.h
    public void b() {
        android.view.ViewGroup viewGroup = this.f119938d;
        if (viewGroup.getVisibility() != 0 || this.f119942h) {
            this.f119942h = false;
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.I8((zy2.zb) c17, ml2.u1.R, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f327916f), null, null, null, null, false, 124, null);
        }
        viewGroup.setVisibility(0);
        java.lang.String str = "checkAndSwitchRedDotPath: registeredMusicPath=" + this.f119944m + ", currentMusicPath=anchorlive.bottom.newmusic";
        java.lang.String str2 = this.f119941g;
        com.tencent.mars.xlog.Log.i(str2, str);
        if (!kotlin.jvm.internal.o.b(this.f119944m, "anchorlive.bottom.newmusic")) {
            com.tencent.mars.xlog.Log.i(str2, "music path changed: " + this.f119944m + " -> anchorlive.bottom.newmusic");
            java.lang.String str3 = this.f119944m;
            if (str3 != null) {
                ll2.e.f319133a.o(this.f119945n, str3, true);
            }
            ll2.e.f319133a.k(this.f119945n, "anchorlive.bottom.newmusic", new com.tencent.mm.plugin.finder.live.widget.r4(this));
            this.f119944m = "anchorlive.bottom.newmusic";
        }
        l();
    }

    @Override // jf2.j
    public jz5.l d() {
        return new jz5.l(java.lang.Integer.valueOf(com.tencent.mm.R.raw.music_regular), java.lang.Integer.valueOf(com.tencent.mm.R.string.due));
    }

    @Override // jf2.j
    public void e(int i17) {
        this.f119938d.performClick();
    }

    @Override // xt2.m6
    public android.view.View f() {
        return this.f119938d.findViewById(com.tencent.mm.R.id.jyy);
    }

    @Override // jf2.h
    public void g() {
        this.f119938d.setVisibility(8);
    }

    @Override // xt2.m6
    public android.view.ViewGroup h() {
        return this.f119938d;
    }

    @Override // jf2.h
    public boolean i() {
        com.tencent.mm.plugin.finder.live.plugin.l lVar = this.f119940f;
        if (zl2.r4.F1(lVar.S0()) || ((mm2.e1) lVar.P0(mm2.e1.class)).b7()) {
            return false;
        }
        boolean z17 = ((mm2.c1) lVar.P0(mm2.c1.class)).f328778a5;
        boolean z18 = sn0.b.f409964e2 != null;
        boolean o17 = ((mm2.e1) lVar.P0(mm2.e1.class)).a7() ? ((mm2.o2) lVar.P0(mm2.o2.class)).f329308q : gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_ACCOUNT_LIVE_HAS_SING_SONG_ABILITY_SETTING_BOOLEAN_SYNC, false);
        boolean z19 = ((java.lang.Number) ae2.in.f3688a.M().r()).intValue() == 1;
        boolean z27 = o17 || z19;
        zl2.r4 r4Var = zl2.r4.f473950a;
        boolean z28 = r4Var.L(lVar.S0()) && r4Var.w1();
        if ((z18 && z27 && !z17) || !z28) {
            android.view.ViewGroup viewGroup = this.f119938d;
            ((com.tencent.mm.ui.widget.imageview.WeImageView) viewGroup.findViewById(com.tencent.mm.R.id.fcq)).setImageDrawable(com.tencent.mm.ui.uk.e(viewGroup.getContext(), com.tencent.mm.R.raw.icon_song_filled, viewGroup.getContext().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_8)));
        }
        com.tencent.mars.xlog.Log.i(this.f119941g, "checkVisible enableSingSongListFromBack: " + o17 + ", enableSwitch: " + z19 + ", isGameLive: " + z17 + ", isSecond: " + z18);
        if (z18) {
            if ((!z17 || (!z28 && !z27)) && !z27) {
                return false;
            }
        } else if (!z28 && !z27) {
            return false;
        }
        return true;
    }

    @Override // xt2.m6
    public android.widget.ImageView j() {
        android.view.View findViewById = this.f119938d.findViewById(com.tencent.mm.R.id.fcq);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return (android.widget.ImageView) findViewById;
    }

    public final void l() {
        com.tencent.mm.plugin.finder.live.plugin.l lVar = this.f119940f;
        if (ll2.e.f319133a.h("anchorlive.bottom.newmusic") && ((((mm2.e1) lVar.P0(mm2.e1.class)).a7() ? ((mm2.o2) lVar.P0(mm2.o2.class)).f329308q : gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_ACCOUNT_LIVE_HAS_SING_SONG_ABILITY_SETTING_BOOLEAN_SYNC, false)) || (((java.lang.Number) ae2.in.f3688a.M().r()).intValue() == 1))) {
            android.view.View view = this.f119943i;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchoMusicEntranceWidget", "updateRedDotVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchoMusicEntranceWidget", "updateRedDotVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = this.f119943i;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchoMusicEntranceWidget", "updateRedDotVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchoMusicEntranceWidget", "updateRedDotVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // jf2.h
    public int type() {
        return 8;
    }
}
