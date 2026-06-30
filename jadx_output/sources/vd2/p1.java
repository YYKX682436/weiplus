package vd2;

/* loaded from: classes3.dex */
public final class p1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vd2.s1 f435849d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f435850e;

    public p1(vd2.s1 s1Var, int i17) {
        this.f435849d = s1Var;
        this.f435850e = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.finder.live.view.FinderLiveRecyclerView finderLiveRecyclerView;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/FinderLiveAdapter$bindNormalLive$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        vd2.s1 s1Var = this.f435849d;
        com.tencent.mm.plugin.finder.live.FinderLiveViewCallback finderLiveViewCallback = s1Var.f435903f;
        int i17 = this.f435850e;
        if (finderLiveViewCallback != null && (finderLiveRecyclerView = finderLiveViewCallback.f111492q) != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(finderLiveRecyclerView, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/FinderLiveAdapter$bindNormalLive$3", "onClick", "(Landroid/view/View;)V", "Undefined", "smoothScrollToPosition", "(I)V");
            finderLiveRecyclerView.c1(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(finderLiveRecyclerView, "com/tencent/mm/plugin/finder/live/FinderLiveAdapter$bindNormalLive$3", "onClick", "(Landroid/view/View;)V", "Undefined", "smoothScrollToPosition", "(I)V");
        }
        com.tencent.mm.plugin.finder.live.FinderLiveViewCallback finderLiveViewCallback2 = s1Var.f435903f;
        if (finderLiveViewCallback2 != null) {
            finderLiveViewCallback2.t();
        }
        com.tencent.mm.plugin.finder.live.FinderLiveViewCallback finderLiveViewCallback3 = s1Var.f435903f;
        if (finderLiveViewCallback3 != null) {
            finderLiveViewCallback3.x(false, false);
        }
        com.tencent.mm.plugin.finder.live.FinderLiveViewCallback finderLiveViewCallback4 = s1Var.f435903f;
        if (finderLiveViewCallback4 != null) {
            finderLiveViewCallback4.u(i17);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/FinderLiveAdapter$bindNormalLive$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
