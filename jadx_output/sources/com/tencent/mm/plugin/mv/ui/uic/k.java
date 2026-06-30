package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class k implements com.tencent.mm.plugin.mv.ui.view.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.q f151231a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f151232b;

    public k(com.tencent.mm.plugin.mv.ui.uic.q qVar, androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        this.f151231a = qVar;
        this.f151232b = appCompatActivity;
    }

    @Override // com.tencent.mm.plugin.mv.ui.view.a
    public void onPageSelected(int i17) {
        androidx.recyclerview.widget.k3 m07;
        java.util.ArrayList arrayList;
        im3.j jVar;
        com.tencent.mm.plugin.mv.ui.uic.q qVar = this.f151231a;
        com.tencent.mm.plugin.mv.ui.uic.MusicMvAlbumPreviewRecyclerUIC$MvPreviewLiveList musicMvAlbumPreviewRecyclerUIC$MvPreviewLiveList = qVar.f151366i;
        if (musicMvAlbumPreviewRecyclerUIC$MvPreviewLiveList != null && (arrayList = musicMvAlbumPreviewRecyclerUIC$MvPreviewLiveList.f152065o) != null && (jVar = (im3.j) kz5.n0.a0(arrayList, i17)) != null) {
            androidx.appcompat.app.AppCompatActivity activity = this.f151232b;
            kotlin.jvm.internal.o.g(activity, "activity");
            androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.mv.ui.uic.b.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            ((com.tencent.mm.plugin.mv.ui.uic.b) a17).O6().B3(new pm3.d(pm3.c.f356871d, jVar));
        }
        int childCount = qVar.getRecyclerView().getChildCount();
        if (childCount < 0) {
            return;
        }
        int i18 = 0;
        while (true) {
            android.view.View childAt = qVar.getRecyclerView().getChildAt(i18);
            if (childAt != null && (m07 = qVar.getRecyclerView().m0(childAt)) != null) {
                android.view.KeyEvent.Callback findViewById = m07.itemView.findViewById(com.tencent.mm.R.id.k0o);
                qk4.a aVar = findViewById instanceof qk4.a ? (qk4.a) findViewById : null;
                if (aVar != null) {
                    qk4.b recycler = qVar.Q6();
                    com.tencent.mm.plugin.thumbplayer.view.recycler.MMRecyclerVideoLayout mMRecyclerVideoLayout = (com.tencent.mm.plugin.thumbplayer.view.recycler.MMRecyclerVideoLayout) aVar;
                    kotlin.jvm.internal.o.g(recycler, "recycler");
                    qk4.f fVar = (qk4.f) recycler;
                    android.view.ViewParent parent = mMRecyclerVideoLayout.getParent();
                    android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
                    if (viewGroup != null) {
                        viewGroup.removeView(mMRecyclerVideoLayout);
                    }
                    kk4.v player = mMRecyclerVideoLayout.getPlayer();
                    if (player != null) {
                        player.R();
                    }
                    kk4.v player2 = mMRecyclerVideoLayout.getPlayer();
                    if (player2 != null) {
                        kk4.b.i(player2, false, false, 3, null);
                    }
                    pm0.v.O(fVar.f364445c, new qk4.e(mMRecyclerVideoLayout, fVar));
                    android.view.View findViewById2 = m07.itemView.findViewById(com.tencent.mm.R.id.kwj);
                    if (findViewById2 != null) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList2.add(0);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvAlbumPreviewRecyclerUIC", "stopAllVideo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(findViewById2, "com/tencent/mm/plugin/mv/ui/uic/MusicMvAlbumPreviewRecyclerUIC", "stopAllVideo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
            }
            if (i18 == childCount) {
                return;
            } else {
                i18++;
            }
        }
    }
}
