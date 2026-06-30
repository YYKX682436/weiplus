package com.tencent.mm.plugin.finder.search;

/* loaded from: classes2.dex */
public final class m5 implements com.tencent.mm.plugin.finder.search.d5 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f125776a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.p f125777b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.p f125778c;

    /* renamed from: d, reason: collision with root package name */
    public final yz5.a f125779d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ListView f125780e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.search.i5 f125781f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f125782g;

    public m5(com.tencent.mm.ui.MMActivity activity, boolean z17, yz5.p onHistoryClickListener, yz5.p onHistoryRemoveListener, yz5.a onHistoryClearListener, int i17, kotlin.jvm.internal.i iVar) {
        z17 = (i17 & 2) != 0 ? false : z17;
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(onHistoryClickListener, "onHistoryClickListener");
        kotlin.jvm.internal.o.g(onHistoryRemoveListener, "onHistoryRemoveListener");
        kotlin.jvm.internal.o.g(onHistoryClearListener, "onHistoryClearListener");
        this.f125776a = z17;
        this.f125777b = onHistoryClickListener;
        this.f125778c = onHistoryRemoveListener;
        this.f125779d = onHistoryClearListener;
        android.view.View findViewById = activity.findViewById(com.tencent.mm.R.id.h0r);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.ListView listView = (android.widget.ListView) findViewById;
        this.f125780e = listView;
        android.view.View inflate = android.view.LayoutInflater.from(activity).inflate(z17 ? com.tencent.mm.R.layout.dd7 : com.tencent.mm.R.layout.dd6, (android.view.ViewGroup) listView, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f125782g = inflate;
        b();
        listView.addFooterView(inflate);
        com.tencent.mm.plugin.finder.search.i5 i5Var = new com.tencent.mm.plugin.finder.search.i5(this);
        this.f125781f = i5Var;
        listView.setAdapter((android.widget.ListAdapter) i5Var);
        inflate.setOnClickListener(new com.tencent.mm.plugin.finder.search.e5(this));
        listView.setOnItemClickListener(new com.tencent.mm.plugin.finder.search.f5(this));
        listView.setOnTouchListener(new com.tencent.mm.plugin.finder.search.g5(activity));
        com.tencent.mm.plugin.finder.search.k5.f125749c.put(java.lang.Integer.valueOf(hashCode()), this);
    }

    public final void a(java.lang.String str) {
        if (str != null) {
            com.tencent.mm.plugin.finder.search.k5.f125747a.b(str);
            android.view.View view = this.f125782g;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/search/RingtoneSearchHistoryLogic", "onTextSearch", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/search/RingtoneSearchHistoryLogic", "onTextSearch", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final void b() {
        com.tencent.mm.plugin.finder.search.k5 k5Var = com.tencent.mm.plugin.finder.search.k5.f125747a;
        if (com.tencent.mm.plugin.finder.search.k5.f125748b.getList(0).isEmpty()) {
            android.view.View view = this.f125782g;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/search/RingtoneSearchHistoryLogic", "updateHistoryFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/search/RingtoneSearchHistoryLogic", "updateHistoryFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = this.f125782g;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/search/RingtoneSearchHistoryLogic", "updateHistoryFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/search/RingtoneSearchHistoryLogic", "updateHistoryFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.plugin.finder.search.d5
    public void update() {
        this.f125781f.notifyDataSetChanged();
    }
}
