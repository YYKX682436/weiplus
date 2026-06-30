package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes10.dex */
public final class h3 extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView f151849d;

    public h3(com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView musicMvLyricView) {
        this.f151849d = musicMvLyricView;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        androidx.recyclerview.widget.k3 p07;
        android.view.View view;
        androidx.recyclerview.widget.k3 p08;
        android.view.View view2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/view/MusicMvLyricView$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView musicMvLyricView = this.f151849d;
        if (i17 == 1) {
            java.util.concurrent.Future future = musicMvLyricView.D;
            if (future != null) {
                future.cancel(false);
            }
            musicMvLyricView.f();
            if (musicMvLyricView.C) {
                musicMvLyricView.C = false;
            }
        }
        if (!musicMvLyricView.f151696v && i17 == 1) {
            musicMvLyricView.f151696v = true;
            com.tencent.mm.plugin.mv.ui.view.z2 eventListener = musicMvLyricView.getEventListener();
            if (eventListener != null) {
                com.tencent.mm.plugin.mv.ui.uic.j1 j1Var = (com.tencent.mm.plugin.mv.ui.uic.j1) eventListener;
                r45.bt4 bt4Var = (r45.bt4) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(j1Var.f151215b, 7, r45.bt4.class);
                if (bt4Var != null) {
                    bt4Var.f371050u = 1;
                }
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                com.tencent.mm.plugin.mv.ui.uic.s1 s1Var = j1Var.f151214a;
                if (currentTimeMillis - s1Var.f151428v > 2000) {
                    s1Var.f151428v = currentTimeMillis;
                    com.tencent.mm.plugin.mv.ui.uic.s1.Q6(s1Var, 54);
                }
            }
        }
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = musicMvLyricView.f151683f;
        if (linearLayoutManager != null) {
            int w17 = linearLayoutManager.w();
            com.tencent.mm.view.recyclerview.WxRecyclerView lyricRv = musicMvLyricView.getLyricRv();
            if (lyricRv != null && (p08 = lyricRv.p0(w17)) != null && (view2 = p08.itemView) != null) {
                view2.getLocationOnScreen(musicMvLyricView.getFirstVisibleItemPos());
            }
        }
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager2 = musicMvLyricView.f151683f;
        if (linearLayoutManager2 != null) {
            int y17 = linearLayoutManager2.y();
            com.tencent.mm.view.recyclerview.WxRecyclerView lyricRv2 = musicMvLyricView.getLyricRv();
            if (lyricRv2 != null && (p07 = lyricRv2.p0(y17)) != null && (view = p07.itemView) != null) {
                view.getLocationOnScreen(musicMvLyricView.getLastVisibleItemPos());
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/view/MusicMvLyricView$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/view/MusicMvLyricView$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/view/MusicMvLyricView$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
