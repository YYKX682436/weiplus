package nr2;

/* loaded from: classes2.dex */
public final class l1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f339260a;

    /* renamed from: b, reason: collision with root package name */
    public final nr2.i1 f339261b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.FinderRefreshLayout f339262c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerView f339263d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.FrameLayout f339264e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f339265f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f339266g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f339267h;

    public l1(android.app.Activity context, nr2.i1 presenter) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(presenter, "presenter");
        this.f339260a = context;
        this.f339261b = presenter;
    }

    public final android.widget.FrameLayout a() {
        android.widget.FrameLayout frameLayout = this.f339264e;
        if (frameLayout != null) {
            return frameLayout;
        }
        kotlin.jvm.internal.o.o("loadingLayout");
        throw null;
    }

    public final com.tencent.mm.view.recyclerview.WxRecyclerView b() {
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f339263d;
        if (wxRecyclerView != null) {
            return wxRecyclerView;
        }
        kotlin.jvm.internal.o.o("recyclerView");
        throw null;
    }

    public final android.view.View c() {
        android.view.View view = this.f339267h;
        if (view != null) {
            return view;
        }
        kotlin.jvm.internal.o.o("retryView");
        throw null;
    }

    public final com.tencent.mm.plugin.finder.view.FinderRefreshLayout d() {
        com.tencent.mm.plugin.finder.view.FinderRefreshLayout finderRefreshLayout = this.f339262c;
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
        android.view.View view = this.f339265f;
        if (view == null) {
            kotlin.jvm.internal.o.o("loadingView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/paidcollection/FinderPaidCollectionViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/paidcollection/FinderPaidCollectionViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f339266g;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("nothingView");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/paidcollection/FinderPaidCollectionViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/paidcollection/FinderPaidCollectionViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View c17 = c();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(c17, arrayList3.toArray(), "com/tencent/mm/plugin/finder/paidcollection/FinderPaidCollectionViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c17.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(c17, "com/tencent/mm/plugin/finder/paidcollection/FinderPaidCollectionViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
