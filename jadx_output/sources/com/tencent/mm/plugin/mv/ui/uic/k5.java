package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class k5 extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.z5 f151251d;

    public k5(com.tencent.mm.plugin.mv.ui.uic.z5 z5Var) {
        this.f151251d = z5Var;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        kk4.b player;
        kk4.b player2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/uic/MusicMvMakerItemEditUIC$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        if (i17 == 0) {
            com.tencent.mm.plugin.mv.ui.uic.z5 z5Var = this.f151251d;
            if (z5Var.Q6().getChildCount() <= 0) {
                yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/uic/MusicMvMakerItemEditUIC$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
                return;
            }
            long paddingStart = (z5Var.Q6().getPaddingStart() - z5Var.Q6().getChildAt(0).getLeft()) / z5Var.f151583v;
            kk4.d dVar = z5Var.f151579r;
            if (dVar != null && (player2 = dVar.getPlayer()) != null) {
                ((kk4.v) player2).H(paddingStart, z5Var.f151582u + paddingStart);
            }
            kk4.d dVar2 = z5Var.f151579r;
            if (dVar2 != null && (player = dVar2.getPlayer()) != null) {
                kk4.b.f(player, (int) paddingStart, true, null, 4, null);
            }
            com.tencent.mm.plugin.mv.ui.uic.z5.O6(z5Var);
            fm3.q qVar = z5Var.f151584w;
            if (qVar != null) {
                z5Var.F.f151221a = 0L;
                kl3.t.g().a().c(qVar.f264107e);
            }
            z5Var.B = true;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/uic/MusicMvMakerItemEditUIC$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/uic/MusicMvMakerItemEditUIC$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        com.tencent.mm.plugin.mv.ui.uic.z5 z5Var = this.f151251d;
        if (z5Var.Q6().getChildCount() <= 0) {
            yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/uic/MusicMvMakerItemEditUIC$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
            return;
        }
        z5Var.D = (z5Var.Q6().getPaddingStart() - z5Var.Q6().getChildAt(0).getLeft()) / z5Var.f151583v;
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/uic/MusicMvMakerItemEditUIC$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
