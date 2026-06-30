package com.tencent.mm.plugin.finder.search;

/* loaded from: classes8.dex */
public final class u5 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f125894d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.ui.search.FTSEditTextView f125895e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.search.v5 f125896f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ListView f125897g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.search.r5 f125898h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f125899i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f125900m;

    /* renamed from: n, reason: collision with root package name */
    public db2.j6 f125901n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.search.q5 f125902o;

    public u5(com.tencent.mm.ui.MMActivity activity, com.tencent.mm.ui.search.FTSEditTextView editText, yz5.p onSuggestionClickListener) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(editText, "editText");
        kotlin.jvm.internal.o.g(onSuggestionClickListener, "onSuggestionClickListener");
        this.f125894d = activity;
        this.f125895e = editText;
        this.f125896f = new com.tencent.mm.plugin.finder.search.v5(activity);
        android.view.View findViewById = activity.findViewById(com.tencent.mm.R.id.f487177ns4);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.ListView listView = (android.widget.ListView) findViewById;
        this.f125897g = listView;
        this.f125899i = "";
        this.f125900m = "";
        com.tencent.mm.plugin.finder.search.n5 n5Var = new com.tencent.mm.plugin.finder.search.n5(this);
        java.util.ArrayList arrayList = editText.F;
        if (!arrayList.contains(n5Var)) {
            arrayList.add(n5Var);
        }
        com.tencent.mm.plugin.finder.search.r5 r5Var = new com.tencent.mm.plugin.finder.search.r5(this);
        this.f125898h = r5Var;
        listView.setAdapter((android.widget.ListAdapter) r5Var);
        listView.setOnItemClickListener(new com.tencent.mm.plugin.finder.search.o5(this, onSuggestionClickListener));
        listView.setOnTouchListener(new com.tencent.mm.plugin.finder.search.p5(this));
    }

    public final void a() {
        com.tencent.mars.xlog.Log.i("Finder.SearchSuggestion", "dismissSuggestion");
        android.widget.ListView listView = this.f125897g;
        listView.animate().cancel();
        listView.animate().alpha(0.0f).setDuration(300L).setListener(new com.tencent.mm.plugin.finder.search.t5(this)).start();
        com.tencent.mm.plugin.finder.search.q5 q5Var = this.f125902o;
        if (q5Var != null) {
            ((com.tencent.mm.plugin.finder.viewmodel.component.bc0) q5Var).a(8);
        }
    }

    public final void b() {
        com.tencent.mars.xlog.Log.i("Finder.SearchSuggestion", "ignore searchSuggestionContent");
        this.f125900m = "";
        gm0.j1.d().d(this.f125901n);
        com.tencent.mm.plugin.finder.search.r5 r5Var = this.f125898h;
        r5Var.f125841d = null;
        r5Var.notifyDataSetChanged();
        a();
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x021f A[SYNTHETIC] */
    @Override // com.tencent.mm.modelbase.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSceneEnd(int r19, int r20, java.lang.String r21, com.tencent.mm.modelbase.m1 r22) {
        /*
            Method dump skipped, instructions count: 627
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.search.u5.onSceneEnd(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }
}
