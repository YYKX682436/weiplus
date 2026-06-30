package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes5.dex */
public final class dv {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.ViewGroup f118148a;

    /* renamed from: b, reason: collision with root package name */
    public final sf2.d3 f118149b;

    /* renamed from: c, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f118150c;

    /* renamed from: d, reason: collision with root package name */
    public final yz5.a f118151d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f118152e;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.constraintlayout.widget.ConstraintLayout f118153f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f118154g;

    /* renamed from: h, reason: collision with root package name */
    public final androidx.constraintlayout.widget.ConstraintLayout f118155h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f118156i;

    /* renamed from: j, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f118157j;

    /* renamed from: k, reason: collision with root package name */
    public int f118158k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f118159l;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f118160m;

    /* renamed from: n, reason: collision with root package name */
    public int f118161n;

    /* renamed from: o, reason: collision with root package name */
    public yz5.p f118162o;

    /* renamed from: p, reason: collision with root package name */
    public yz5.a f118163p;

    /* renamed from: q, reason: collision with root package name */
    public yz5.p f118164q;

    /* renamed from: r, reason: collision with root package name */
    public yz5.a f118165r;

    public dv(android.view.ViewGroup root, sf2.d3 controller, kotlinx.coroutines.y0 y0Var, yz5.a aVar) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(controller, "controller");
        this.f118148a = root;
        this.f118149b = controller;
        this.f118150c = y0Var;
        this.f118151d = aVar;
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.f487066s71);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) findViewById;
        this.f118152e = recyclerView;
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) root.findViewById(com.tencent.mm.R.id.rfp);
        this.f118153f = constraintLayout;
        android.view.View findViewById2 = root.findViewById(com.tencent.mm.R.id.qgx);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f118154g = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = root.findViewById(com.tencent.mm.R.id.rfs);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f118155h = (androidx.constraintlayout.widget.ConstraintLayout) findViewById3;
        this.f118163p = com.tencent.mm.plugin.finder.live.widget.bv.f117923d;
        this.f118165r = com.tencent.mm.plugin.finder.live.widget.cv.f118028d;
        if (constraintLayout != null) {
            constraintLayout.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.wu(this));
        }
        recyclerView.i(new com.tencent.mm.plugin.finder.live.widget.ev(recyclerView, new kotlin.jvm.internal.f0(), new com.tencent.mm.plugin.finder.live.widget.xu(this), new kotlin.jvm.internal.f0(), new com.tencent.mm.plugin.finder.live.widget.yu(this)));
    }

    public final void a(int i17) {
        kotlinx.coroutines.y0 y0Var;
        androidx.recyclerview.widget.f2 adapter = this.f118152e.getAdapter();
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            com.tencent.mars.xlog.Log.i("FinderLiveRequestSongRvWidget", "lastVisiblePosition " + i17 + " datalist size " + itemCount + " continue flag " + this.f118158k + " loadingMore " + this.f118156i);
            if (this.f118158k <= 0 || itemCount == 0 || i17 < itemCount - 1 || this.f118156i || (y0Var = this.f118150c) == null) {
                return;
            }
            kotlinx.coroutines.l.d(y0Var, null, null, new com.tencent.mm.plugin.finder.live.widget.av(this, null), 3, null);
        }
    }

    public final void b() {
        android.view.ViewGroup viewGroup = this.f118148a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(viewGroup, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveRequestSongRvWidget", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        viewGroup.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(viewGroup, "com/tencent/mm/plugin/finder/live/widget/FinderLiveRequestSongRvWidget", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void c(java.util.List data, java.lang.String emptyTips) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(emptyTips, "emptyTips");
        android.view.ViewGroup viewGroup = this.f118148a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(viewGroup, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveRequestSongRvWidget", "hideLoading", "(Ljava/util/List;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        viewGroup.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(viewGroup, "com/tencent/mm/plugin/finder/live/widget/FinderLiveRequestSongRvWidget", "hideLoading", "(Ljava/util/List;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f118152e;
        int i17 = data.isEmpty() ^ true ? 0 : 8;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(recyclerView, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveRequestSongRvWidget", "hideLoading", "(Ljava/util/List;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        recyclerView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(recyclerView, "com/tencent/mm/plugin/finder/live/widget/FinderLiveRequestSongRvWidget", "hideLoading", "(Ljava/util/List;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView textView = this.f118154g;
        int i18 = data.isEmpty() ? 0 : 8;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(textView, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveRequestSongRvWidget", "hideLoading", "(Ljava/util/List;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        textView.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(textView, "com/tencent/mm/plugin/finder/live/widget/FinderLiveRequestSongRvWidget", "hideLoading", "(Ljava/util/List;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = this.f118153f;
        if (constraintLayout != null) {
            int i19 = data.isEmpty() ? 0 : 8;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(java.lang.Integer.valueOf(i19));
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(constraintLayout, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveRequestSongRvWidget", "hideLoading", "(Ljava/util/List;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            constraintLayout.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(constraintLayout, "com/tencent/mm/plugin/finder/live/widget/FinderLiveRequestSongRvWidget", "hideLoading", "(Ljava/util/List;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f118154g.setText(emptyTips);
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout2 = this.f118155h;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(8);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(constraintLayout2, arrayList5.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveRequestSongRvWidget", "hideLoading", "(Ljava/util/List;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        constraintLayout2.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(constraintLayout2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveRequestSongRvWidget", "hideLoading", "(Ljava/util/List;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void d() {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.f118152e.getLayoutManager();
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            a(linearLayoutManager.y());
        }
    }

    public final void e() {
        android.view.ViewGroup viewGroup = this.f118148a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(viewGroup, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveRequestSongRvWidget", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        viewGroup.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(viewGroup, "com/tencent/mm/plugin/finder/live/widget/FinderLiveRequestSongRvWidget", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f118152e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(recyclerView, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveRequestSongRvWidget", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        recyclerView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(recyclerView, "com/tencent/mm/plugin/finder/live/widget/FinderLiveRequestSongRvWidget", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView textView = this.f118154g;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(textView, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveRequestSongRvWidget", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        textView.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(textView, "com/tencent/mm/plugin/finder/live/widget/FinderLiveRequestSongRvWidget", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = this.f118153f;
        if (constraintLayout != null) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(constraintLayout, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveRequestSongRvWidget", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            constraintLayout.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(constraintLayout, "com/tencent/mm/plugin/finder/live/widget/FinderLiveRequestSongRvWidget", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout2 = this.f118155h;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(0);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(constraintLayout2, arrayList5.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveRequestSongRvWidget", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        constraintLayout2.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(constraintLayout2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveRequestSongRvWidget", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
