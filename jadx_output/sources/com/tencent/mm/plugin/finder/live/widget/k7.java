package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class k7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.n7 f118820d;

    public k7(com.tencent.mm.plugin.finder.live.widget.n7 n7Var) {
        this.f118820d = n7Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMusicEntranceSelectPanel$initContentView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.widget.n7 n7Var = this.f118820d;
        n7Var.getClass();
        com.tencent.mars.xlog.Log.i("FinderLiveAnchorMusicEntranceSelectPanel", "onSingSongClick");
        yz5.l lVar = n7Var.P;
        if (lVar != null) {
            lVar.invoke(com.tencent.mm.plugin.finder.live.widget.i7.f118646e);
        }
        n7Var.f0(true);
        if (n7Var.e0()) {
            ll2.e.d(ll2.e.f319133a, "anchorlive.bottom.newmusic.song", false, false, 6, null);
        } else {
            ll2.e.d(ll2.e.f319133a, "startlive.more.newmusic.song", false, false, 6, null);
        }
        com.tencent.mm.plugin.finder.live.widget.e0.t(n7Var, false, 1, null);
        com.tencent.mm.plugin.finder.live.plugin.l lVar2 = n7Var.H;
        sf2.x xVar = (sf2.x) lVar2.U0(sf2.x.class);
        if (xVar != null) {
            xVar.s7(true);
        }
        sf2.x xVar2 = (sf2.x) lVar2.U0(sf2.x.class);
        if (xVar2 != null) {
            xVar2.c7();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMusicEntranceSelectPanel$initContentView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
