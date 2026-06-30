package com.tencent.mm.plugin.finder.ui.conv;

/* loaded from: classes10.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f129022a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.ui.conv.FinderConvSearchFeedFragment f129023b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.ui.conv.c f129024c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f129025d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f129026e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f129027f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.FinderRefreshLayout f129028g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f129029h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerView f129030i;

    /* renamed from: j, reason: collision with root package name */
    public android.widget.FrameLayout f129031j;

    /* renamed from: k, reason: collision with root package name */
    public android.view.View f129032k;

    /* renamed from: l, reason: collision with root package name */
    public android.view.View f129033l;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f129034m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f129035n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f129036o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.vj0 f129037p;

    /* renamed from: q, reason: collision with root package name */
    public on5.c f129038q;

    public l(android.app.Activity context, com.tencent.mm.plugin.finder.ui.conv.FinderConvSearchFeedFragment fragment, com.tencent.mm.plugin.finder.ui.conv.c presenter, android.view.View view, java.lang.String conversation) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(fragment, "fragment");
        kotlin.jvm.internal.o.g(presenter, "presenter");
        kotlin.jvm.internal.o.g(conversation, "conversation");
        this.f129022a = context;
        this.f129023b = fragment;
        this.f129024c = presenter;
        this.f129025d = view;
        this.f129026e = conversation;
        this.f129027f = "";
        this.f129037p = new com.tencent.mm.plugin.finder.ui.conv.d(new com.tencent.mm.plugin.finder.ui.conv.e(this));
    }

    public final android.view.View a(int i17) {
        android.view.View view = this.f129025d;
        android.view.View findViewById = view != null ? view.findViewById(i17) : null;
        if (findViewById != null) {
            return findViewById;
        }
        android.view.View findViewById2 = this.f129022a.findViewById(i17);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        return findViewById2;
    }

    public final com.tencent.mm.view.recyclerview.WxRecyclerView b() {
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f129030i;
        if (wxRecyclerView != null) {
            return wxRecyclerView;
        }
        kotlin.jvm.internal.o.o("recyclerView");
        throw null;
    }

    public final com.tencent.mm.plugin.finder.view.FinderRefreshLayout c() {
        com.tencent.mm.plugin.finder.view.FinderRefreshLayout finderRefreshLayout = this.f129028g;
        if (finderRefreshLayout != null) {
            return finderRefreshLayout;
        }
        kotlin.jvm.internal.o.o("rlLayout");
        throw null;
    }

    public final void d() {
        android.widget.FrameLayout frameLayout = this.f129031j;
        if (frameLayout == null) {
            kotlin.jvm.internal.o.o("loadingLayout");
            throw null;
        }
        frameLayout.setVisibility(8);
        android.view.View view = this.f129034m;
        if (view != null) {
            view.setOnClickListener(null);
        } else {
            kotlin.jvm.internal.o.o("retryView");
            throw null;
        }
    }

    public final void e() {
        com.tencent.mm.plugin.finder.ui.conv.c cVar = this.f129024c;
        int i17 = 0;
        if (com.tencent.mm.sdk.platformtools.t8.L0(cVar.f129012d)) {
            android.view.View view = this.f129035n;
            if (view == null) {
                kotlin.jvm.internal.o.o("dateHeaderContainer");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/conv/FinderConvSearchFeedViewCallback", "initDateHeader", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/ui/conv/FinderConvSearchFeedViewCallback", "initDateHeader", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = this.f129035n;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("dateHeaderContainer");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/ui/conv/FinderConvSearchFeedViewCallback", "initDateHeader", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/ui/conv/FinderConvSearchFeedViewCallback", "initDateHeader", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int[] iArr = new int[2];
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = b().getLayoutManager();
        com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager finderStaggeredGridLayoutManager = layoutManager instanceof com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager ? (com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager) layoutManager : null;
        if (finderStaggeredGridLayoutManager != null) {
            finderStaggeredGridLayoutManager.u(iArr);
        }
        java.lang.Integer j07 = kz5.z.j0(iArr);
        int intValue = j07 != null ? j07.intValue() : 0;
        java.util.Iterator it = cVar.f129012d.iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            in5.c cVar2 = (in5.c) next;
            com.tencent.mm.plugin.finder.ui.conv.n nVar = cVar2 instanceof com.tencent.mm.plugin.finder.ui.conv.n ? (com.tencent.mm.plugin.finder.ui.conv.n) cVar2 : null;
            if (nVar != null && intValue >= i17) {
                android.widget.TextView textView = this.f129036o;
                if (textView == null) {
                    kotlin.jvm.internal.o.o("dateHeaderTv");
                    throw null;
                }
                textView.setText(com.tencent.mm.ui.gridviewheaders.a.e().c(new java.util.Date(nVar.f129039d), this.f129022a));
            }
            i17 = i18;
        }
    }

    public final void f() {
        android.widget.FrameLayout frameLayout = this.f129031j;
        if (frameLayout == null) {
            kotlin.jvm.internal.o.o("loadingLayout");
            throw null;
        }
        frameLayout.setVisibility(0);
        android.view.View view = this.f129032k;
        if (view == null) {
            kotlin.jvm.internal.o.o("loadingView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/conv/FinderConvSearchFeedViewCallback", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/ui/conv/FinderConvSearchFeedViewCallback", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f129033l;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("nothingView");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/ui/conv/FinderConvSearchFeedViewCallback", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/ui/conv/FinderConvSearchFeedViewCallback", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f129034m;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("retryView");
            throw null;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/ui/conv/FinderConvSearchFeedViewCallback", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/ui/conv/FinderConvSearchFeedViewCallback", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
