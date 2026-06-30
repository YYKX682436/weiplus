package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ie extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.mg f112962d;

    public ie(com.tencent.mm.plugin.finder.live.plugin.mg mgVar) {
        this.f112962d = mgVar;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin$6", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin$6", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.lang.String j17;
        int i19;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin$6", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        com.tencent.mm.plugin.finder.live.plugin.mg mgVar = this.f112962d;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = mgVar.C1().getLayoutManager();
        kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        int y17 = ((androidx.recyclerview.widget.LinearLayoutManager) layoutManager).y();
        ((mm2.x4) mgVar.P0(mm2.x4.class)).f329536q = y17;
        mm2.x4 x4Var = (mm2.x4) mgVar.P0(mm2.x4.class);
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager2 = mgVar.C1().getLayoutManager();
        kotlin.jvm.internal.o.e(layoutManager2, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        x4Var.f329537r = ((androidx.recyclerview.widget.LinearLayoutManager) layoutManager2).w();
        if (y17 < dk2.ef.K - 1) {
            long j18 = y17 + 1;
            long j19 = mgVar.I;
            if (j18 < j19) {
                j18 = j19;
            }
            mgVar.I = j18;
        } else {
            mgVar.I = ((mm2.c1) mgVar.P0(mm2.c1.class)).f328775a2;
        }
        if (y17 == mgVar.D.getItemCount() - 1) {
            mgVar.f113505r.setVisibility(8);
            if (!mgVar.B) {
                mgVar.M1(true);
            }
        }
        dk2.t5 N6 = ((we2.s) mgVar.S0().a(we2.s.class)).N6();
        gk2.e buContext = mgVar.S0();
        int i27 = ((mm2.x4) mgVar.P0(mm2.x4.class)).f329537r;
        N6.getClass();
        kotlin.jvm.internal.o.g(buContext, "buContext");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - N6.f234103b;
        if (N6.f234107f) {
            N6.f234107f = java.lang.System.currentTimeMillis() - N6.f234103b < ((long) N6.a());
        }
        boolean z18 = N6.f234107f && i27 >= (i19 = N6.f234104c) && i19 > 0;
        int i28 = N6.f234104c;
        if (!z18) {
            if (N6.f234106e && !N6.f234108g && i27 < i28) {
                N6.f234106e = false;
                yz5.p pVar = N6.f234109h;
                if (pVar != null) {
                    pVar.invoke(java.lang.Integer.valueOf(i28), java.lang.Boolean.TRUE);
                }
            }
            N6.f234108g = false;
        } else if (!N6.f234106e) {
            mm2.x4 x4Var2 = (mm2.x4) buContext.a(mm2.x4.class);
            int i29 = N6.f234104c;
            java.util.List list = x4Var2.f329528f;
            int type = (i29 < 0 || i29 >= list.size()) ? Integer.MIN_VALUE : ((dk2.zf) list.get(N6.f234104c)).getType();
            if (type == 20031) {
                long a17 = ((long) N6.a()) - currentTimeMillis >= 5000 ? N6.a() - currentTimeMillis : 5000L;
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveCommentStickyHelper", "checkSticky do sticky stickyTime:" + a17 + " needStickyTime:" + N6.a());
                kotlin.jvm.internal.o.d(list);
                dk2.zf zfVar = (dk2.zf) kz5.n0.a0(list, N6.f234104c);
                if (zfVar != null && (j17 = zfVar.j()) != null) {
                    N6.f234108g = true;
                    N6.f234106e = true;
                    yz5.p pVar2 = N6.f234110i;
                    if (pVar2 != null) {
                        pVar2.invoke(j17, java.lang.Integer.valueOf(N6.f234104c));
                    }
                }
                pm0.v.V(a17, new dk2.r5(N6));
            } else {
                com.tencent.mars.xlog.Log.w("Finder.FinderLiveCommentStickyHelper", "checkSticky unexpected else. targetStickyCommentMsgIndex:" + N6.f234104c + " targetMsgType:" + type);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin$6", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
