package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes10.dex */
public final class h extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.view.i f151837d;

    public h(com.tencent.mm.plugin.mv.ui.view.i iVar) {
        this.f151837d = iVar;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/view/CenterPagerSnapHelper$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onScrollStateChanged:");
        sb6.append(i17);
        sb6.append(", snapPosition:");
        com.tencent.mm.plugin.mv.ui.view.i iVar = this.f151837d;
        sb6.append(iVar.f151864m);
        com.tencent.mars.xlog.Log.i("MicroMsg.CenterPagerSnapHelper", sb6.toString());
        if (i17 == 0) {
            iVar.f151861j = false;
            iVar.n();
        }
        if (i17 == 1) {
            iVar.f151861j = true;
            com.tencent.mm.plugin.mv.ui.view.c cVar = iVar.f151867p;
            if (cVar != null) {
                int i18 = iVar.f151864m;
                com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC musicMvMainUIC = ((com.tencent.mm.plugin.mv.ui.uic.m2) cVar).f151290a;
                java.lang.String str = musicMvMainUIC.f150974d;
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("onPageStartChange:");
                sb7.append(i18);
                sb7.append(", dataList.size:");
                java.util.ArrayList arrayList2 = musicMvMainUIC.f150977g;
                sb7.append(arrayList2.size());
                com.tencent.mars.xlog.Log.i(str, sb7.toString());
                if (i18 < arrayList2.size() && i18 >= 0) {
                    if (arrayList2.size() > 1) {
                        musicMvMainUIC.X6(i18);
                    }
                    musicMvMainUIC.f150990w = true;
                    pk4.c cVar2 = musicMvMainUIC.f150983p;
                    if (cVar2 != null) {
                        com.tencent.mm.plugin.mv.ui.uic.l2 l2Var = new com.tencent.mm.plugin.mv.ui.uic.l2(musicMvMainUIC, i18);
                        gk4.r rVar = ((com.tencent.mm.plugin.thumbplayer.view.MultiMediaEffectVideoLayout) cVar2).f174566f;
                        rVar.getClass();
                        rVar.f272603h.i(new gk4.i(l2Var));
                    }
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/view/CenterPagerSnapHelper$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/view/CenterPagerSnapHelper$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/view/CenterPagerSnapHelper$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
