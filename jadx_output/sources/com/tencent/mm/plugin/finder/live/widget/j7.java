package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class j7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.n7 f118729d;

    public j7(com.tencent.mm.plugin.finder.live.widget.n7 n7Var) {
        this.f118729d = n7Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMusicEntranceSelectPanel$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.widget.n7 n7Var = this.f118729d;
        n7Var.getClass();
        com.tencent.mars.xlog.Log.i("FinderLiveAnchorMusicEntranceSelectPanel", "onBgMusicClick");
        yz5.l lVar = n7Var.P;
        if (lVar != null) {
            lVar.invoke(com.tencent.mm.plugin.finder.live.widget.i7.f118645d);
        }
        com.tencent.mm.plugin.finder.live.plugin.l lVar2 = n7Var.H;
        qo0.c.a(lVar2.f113325g, qo0.b.f365382m2, null, 2, null);
        boolean z17 = false;
        com.tencent.mm.plugin.finder.live.widget.e0.t(n7Var, false, 1, null);
        if (n7Var.e0()) {
            ll2.e.d(ll2.e.f319133a, "anchorlive.bottom.music.bgmusic", false, false, 6, null);
        } else {
            ll2.e.d(ll2.e.f319133a, "startlive.bottom.music.bgmusic", false, false, 6, null);
        }
        df2.od odVar = (df2.od) lVar2.U0(df2.od.class);
        if (odVar != null && odVar.c7(r45.d62.FINDER_LIVE_QUEST_COMM_TARGET_TYPE_SET_MUSIC_COUNT)) {
            z17 = true;
        }
        if (z17) {
            df2.dd ddVar = df2.od.f230952w;
            gk2.e S0 = lVar2.S0();
            df2.od odVar2 = (df2.od) lVar2.U0(df2.od.class);
            ddVar.a(S0, 2, 7, odVar2 != null ? odVar2.f230958r : null, 14);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMusicEntranceSelectPanel$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
