package com.tencent.mm.plugin.finder.playlist;

/* loaded from: classes14.dex */
public final class s2 {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f122445a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.playlist.p2 f122446b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.FinderRefreshLayout f122447c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerView f122448d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.FrameLayout f122449e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f122450f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f122451g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f122452h;

    public s2(android.app.Activity context, com.tencent.mm.plugin.finder.playlist.p2 presenter) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(presenter, "presenter");
        this.f122445a = context;
        this.f122446b = presenter;
    }

    public final android.widget.FrameLayout a() {
        android.widget.FrameLayout frameLayout = this.f122449e;
        if (frameLayout != null) {
            return frameLayout;
        }
        kotlin.jvm.internal.o.o("loadingLayout");
        throw null;
    }

    public final com.tencent.mm.view.recyclerview.WxRecyclerView b() {
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f122448d;
        if (wxRecyclerView != null) {
            return wxRecyclerView;
        }
        kotlin.jvm.internal.o.o("recyclerView");
        throw null;
    }

    public final android.view.View c() {
        android.view.View view = this.f122452h;
        if (view != null) {
            return view;
        }
        kotlin.jvm.internal.o.o("retryView");
        throw null;
    }

    public final com.tencent.mm.plugin.finder.view.FinderRefreshLayout d() {
        com.tencent.mm.plugin.finder.view.FinderRefreshLayout finderRefreshLayout = this.f122447c;
        if (finderRefreshLayout != null) {
            return finderRefreshLayout;
        }
        kotlin.jvm.internal.o.o("rlLayout");
        throw null;
    }

    public final void e() {
        a().setVisibility(8);
        c().setOnClickListener(null);
    }

    public final void f() {
        a().setVisibility(0);
        android.view.View view = this.f122450f;
        if (view == null) {
            kotlin.jvm.internal.o.o("loadingView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/playlist/FinderPlayListViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/playlist/FinderPlayListViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f122451g;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("nothingView");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/playlist/FinderPlayListViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/playlist/FinderPlayListViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View c17 = c();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(c17, arrayList3.toArray(), "com/tencent/mm/plugin/finder/playlist/FinderPlayListViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c17.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(c17, "com/tencent/mm/plugin/finder/playlist/FinderPlayListViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
