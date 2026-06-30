package st2;

/* loaded from: classes3.dex */
public final class s1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f412441a;

    /* renamed from: b, reason: collision with root package name */
    public final st2.h1 f412442b;

    /* renamed from: c, reason: collision with root package name */
    public final gk2.e f412443c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f412444d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f412445e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f412446f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f412447g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.EditText f412448h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f412449i;

    /* renamed from: j, reason: collision with root package name */
    public final android.view.View f412450j;

    /* renamed from: k, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f412451k;

    /* renamed from: l, reason: collision with root package name */
    public final tt2.f1 f412452l;

    /* renamed from: m, reason: collision with root package name */
    public long f412453m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f412454n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f412455o;

    public s1(android.view.View rootView, st2.h1 internal, gk2.e buContext) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        kotlin.jvm.internal.o.g(internal, "internal");
        kotlin.jvm.internal.o.g(buContext, "buContext");
        this.f412441a = rootView;
        this.f412442b = internal;
        this.f412443c = buContext;
        this.f412444d = "FinderLiveShoppingListSearchPage";
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.s3y);
        this.f412445e = findViewById;
        android.widget.TextView textView = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.mdg);
        d92.f fVar = d92.f.f227470a;
        android.content.Context context = rootView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        d92.f.a(fVar, context, textView, 15.0f, 0.0f, 8, null);
        this.f412446f = textView;
        android.view.View findViewById2 = rootView.findViewById(com.tencent.mm.R.id.rfz);
        this.f412447g = findViewById2;
        android.widget.EditText editText = (android.widget.EditText) rootView.findViewById(com.tencent.mm.R.id.f486761s40);
        boolean z17 = true;
        editText.setTextSize(1, 17.0f);
        this.f412448h = editText;
        this.f412449i = rootView.findViewById(com.tencent.mm.R.id.rnd);
        this.f412450j = rootView.findViewById(com.tencent.mm.R.id.rna);
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) rootView.findViewById(com.tencent.mm.R.id.mff);
        this.f412451k = recyclerView;
        if (!zl2.r4.f473950a.w1() && !((mm2.c1) buContext.a(mm2.c1.class)).T) {
            z17 = false;
        }
        android.content.Context context2 = rootView.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        tt2.f1 f1Var = new tt2.f1(context2, z17, buContext);
        this.f412452l = f1Var;
        findViewById.setOnClickListener(new st2.j1(this));
        findViewById2.setOnClickListener(new st2.k1(this));
        textView.setOnClickListener(new st2.l1(this));
        editText.addTextChangedListener(new st2.r1(this));
        editText.setOnEditorActionListener(new st2.m1(this));
        editText.setOnFocusChangeListener(new st2.n1(this));
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(rootView.getContext()));
        recyclerView.setAdapter(f1Var);
        f1Var.f421891v = internal;
        internal.H(f1Var);
    }

    public static final void a(st2.s1 s1Var) {
        java.lang.Object systemService = s1Var.f412441a.getContext().getSystemService("input_method");
        android.view.inputmethod.InputMethodManager inputMethodManager = systemService instanceof android.view.inputmethod.InputMethodManager ? (android.view.inputmethod.InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(s1Var.f412448h, 1);
        }
    }

    public final void b(java.lang.String str) {
        this.f412452l.c0(new qm0.a(kz5.p0.f313996d, null));
        android.view.View view = this.f412449i;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListSearchPage", "doSearch", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListSearchPage", "doSearch", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f412451k.setVisibility(4);
        android.view.View view2 = this.f412450j;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListSearchPage", "doSearch", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListSearchPage", "doSearch", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        r45.ld2 ld2Var = new r45.ld2();
        gk2.e eVar = this.f412443c;
        ld2Var.set(3, ((mm2.c1) eVar.a(mm2.c1.class)).f328852o);
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        r45.v82 v82Var = new r45.v82();
        v82Var.set(0, str);
        v82Var.set(1, java.lang.Long.valueOf(((mm2.e1) eVar.a(mm2.e1.class)).f328983m));
        v82Var.set(2, java.lang.Long.valueOf(((mm2.e1) eVar.a(mm2.e1.class)).f328988r.getLong(0)));
        v82Var.set(3, ((mm2.c1) eVar.a(mm2.c1.class)).f328852o);
        new ke2.o0("/cgi-bin/mmbiz-bin/finderlivesearchproduct", 17688, v82Var, ld2Var, null).l().K(new st2.o1(h0Var, this, str));
    }

    public final void c(boolean z17) {
        android.view.View view = this.f412441a;
        if (view.getVisibility() == 0) {
            i95.m c17 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ml2.r0 r0Var = (ml2.r0) c17;
            ml2.f4 f4Var = ml2.f4.f327454y0;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("total_duration", c01.id.c() - this.f412453m);
            ml2.r0.Dj(r0Var, f4Var, null, null, null, null, null, 0, 0L, jSONObject, null, null, null, false, this.f412454n, 7928, null);
        }
        com.tencent.mars.xlog.Log.i("Finder.LiveShoppingListPlugin", "hideSearchPage " + z17);
        if (z17) {
            view.animate().setDuration(300L).setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator()).translationX(this.f412442b.q().getWidth()).setListener(new st2.p1(this)).start();
        } else {
            android.view.View view2 = this.f412441a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListSearchPage", "hide", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListSearchPage", "hide", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        d();
    }

    public final void d() {
        java.lang.Object systemService = this.f412441a.getContext().getSystemService("input_method");
        android.view.inputmethod.InputMethodManager inputMethodManager = systemService instanceof android.view.inputmethod.InputMethodManager ? (android.view.inputmethod.InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(this.f412448h.getWindowToken(), 0);
        }
    }

    public final void e() {
        this.f412448h.setText("");
        android.view.View view = this.f412450j;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListSearchPage", "reset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListSearchPage", "reset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f412451k.setVisibility(4);
    }
}
