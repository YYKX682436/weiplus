package com.tencent.mm.plugin.finder.search;

/* loaded from: classes2.dex */
public final class k4 implements com.tencent.mm.plugin.finder.search.d5 {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.ListView f125742a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.search.g4 f125743b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View f125744c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f125745d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f125746e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k4(com.tencent.mm.ui.MMActivity activity, yz5.l onHistoryClickListener) {
        this(activity, false, false, onHistoryClickListener, null);
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(onHistoryClickListener, "onHistoryClickListener");
    }

    public final void a() {
        com.tencent.mm.plugin.finder.search.i4 i4Var = com.tencent.mm.plugin.finder.search.i4.f125723a;
        com.tencent.mm.plugin.finder.search.i4.f125725c.remove(java.lang.Integer.valueOf(hashCode()));
    }

    public final void b(java.lang.String str) {
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        android.widget.ListView listView = this.f125742a;
        if (K0) {
            listView.setVisibility(0);
        } else {
            listView.setVisibility(8);
        }
    }

    public final void c(java.lang.String str) {
        if (str != null) {
            com.tencent.mm.plugin.finder.search.i4.f125723a.b(str);
            android.view.View view = this.f125744c;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/search/FinderSearchHistoryLogic", "onTextSearch", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/search/FinderSearchHistoryLogic", "onTextSearch", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final void d() {
        com.tencent.mm.plugin.finder.search.i4 i4Var = com.tencent.mm.plugin.finder.search.i4.f125723a;
        if (com.tencent.mm.plugin.finder.search.i4.f125724b.getList(0).isEmpty()) {
            android.view.View view = this.f125744c;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/search/FinderSearchHistoryLogic", "updateHistoryFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/search/FinderSearchHistoryLogic", "updateHistoryFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = this.f125744c;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/search/FinderSearchHistoryLogic", "updateHistoryFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/search/FinderSearchHistoryLogic", "updateHistoryFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.plugin.finder.search.d5
    public void update() {
        this.f125743b.notifyDataSetChanged();
    }

    public k4(com.tencent.mm.ui.MMActivity activity, boolean z17, boolean z18, yz5.l onHistoryClickListener, com.tencent.mm.plugin.finder.search.c5 c5Var) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(onHistoryClickListener, "onHistoryClickListener");
        android.view.View findViewById = activity.findViewById(com.tencent.mm.R.id.h0r);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.ListView listView = (android.widget.ListView) findViewById;
        this.f125742a = listView;
        this.f125745d = z17;
        this.f125746e = z18;
        android.view.View inflate = android.view.LayoutInflater.from(activity).inflate(z17 ? z18 ? com.tencent.mm.R.layout.ajd : com.tencent.mm.R.layout.ajc : z18 ? com.tencent.mm.R.layout.b8d : com.tencent.mm.R.layout.b8c, (android.view.ViewGroup) listView, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f125744c = inflate;
        d();
        listView.addFooterView(inflate);
        com.tencent.mm.plugin.finder.search.g4 g4Var = new com.tencent.mm.plugin.finder.search.g4(this);
        this.f125743b = g4Var;
        listView.setAdapter((android.widget.ListAdapter) g4Var);
        inflate.setOnClickListener(new com.tencent.mm.plugin.finder.search.c4(this, c5Var));
        listView.setOnItemClickListener(new com.tencent.mm.plugin.finder.search.d4(onHistoryClickListener));
        listView.setOnTouchListener(new com.tencent.mm.plugin.finder.search.e4(activity));
        com.tencent.mm.plugin.finder.search.i4 i4Var = com.tencent.mm.plugin.finder.search.i4.f125723a;
        com.tencent.mm.plugin.finder.search.i4.f125725c.put(java.lang.Integer.valueOf(hashCode()), this);
    }
}
