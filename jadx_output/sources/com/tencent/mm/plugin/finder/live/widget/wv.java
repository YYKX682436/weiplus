package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class wv {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.view.k0 f120236a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.widget.k80 f120237b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View f120238c;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f120239d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f120240e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f120241f;

    public wv(com.tencent.mm.plugin.finder.live.view.k0 pluginLayout, android.app.Activity activity, gk2.e buContext, zl2.u4 uiMode) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(buContext, "buContext");
        kotlin.jvm.internal.o.g(uiMode, "uiMode");
        this.f120236a = pluginLayout;
        com.tencent.mm.plugin.finder.live.widget.k80 k80Var = new com.tencent.mm.plugin.finder.live.widget.k80(pluginLayout, uiMode);
        this.f120237b = k80Var;
        zl2.w4 w4Var = zl2.w4.f474017a;
        android.view.LayoutInflater layoutInflater = activity.getLayoutInflater();
        kotlin.jvm.internal.o.f(layoutInflater, "getLayoutInflater(...)");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) w4Var.b(com.tencent.mm.R.layout.eby, null, false, uiMode, activity, layoutInflater);
        this.f120238c = viewGroup;
        android.view.View findViewById = viewGroup.findViewById(com.tencent.mm.R.id.ruw);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) findViewById;
        this.f120239d = recyclerView;
        android.view.View findViewById2 = viewGroup.findViewById(com.tencent.mm.R.id.rnf);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f120240e = findViewById2;
        android.view.View findViewById3 = viewGroup.findViewById(com.tencent.mm.R.id.rjm);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f120241f = findViewById3;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById3, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveSingerListWidget", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/live/widget/FinderLiveSingerListWidget", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        recyclerView.setVisibility(8);
        findViewById2.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.vv(this));
        recyclerView.setAdapter(k80Var);
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(pluginLayout.getContext()));
    }
}
