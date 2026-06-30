package fn2;

/* loaded from: classes5.dex */
public final class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f264368d;

    /* renamed from: e, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f264369e;

    /* renamed from: f, reason: collision with root package name */
    public final sf2.d3 f264370f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.a f264371g;

    /* renamed from: h, reason: collision with root package name */
    public final yz5.a f264372h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.EditText f264373i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f264374m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f264375n;

    /* renamed from: o, reason: collision with root package name */
    public final bm2.n7 f264376o;

    /* renamed from: p, reason: collision with root package name */
    public final bm2.o6 f264377p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.Set f264378q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.widget.dv f264379r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.widget.dv f264380s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f264381t;

    /* renamed from: u, reason: collision with root package name */
    public kotlinx.coroutines.r2 f264382u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f264383v;

    /* renamed from: w, reason: collision with root package name */
    public final mm2.k5 f264384w;

    public s(android.view.View root, kotlinx.coroutines.y0 y0Var, sf2.d3 controller, int i17, fn2.u1 sourceScene, yz5.a onShowSearch, yz5.a onEndSearch) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(controller, "controller");
        kotlin.jvm.internal.o.g(sourceScene, "sourceScene");
        kotlin.jvm.internal.o.g(onShowSearch, "onShowSearch");
        kotlin.jvm.internal.o.g(onEndSearch, "onEndSearch");
        this.f264368d = root;
        this.f264369e = y0Var;
        this.f264370f = controller;
        this.f264371g = onShowSearch;
        this.f264372h = onEndSearch;
        this.f264378q = new java.util.LinkedHashSet();
        this.f264383v = "";
        this.f264384w = (mm2.k5) controller.business(mm2.k5.class);
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) root.findViewById(com.tencent.mm.R.id.rft);
        if (constraintLayout != null) {
            constraintLayout.setOnClickListener(new fn2.l(this));
        }
        this.f264373i = (android.widget.EditText) root.findViewById(com.tencent.mm.R.id.rju);
        this.f264375n = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.ole);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) root.findViewById(com.tencent.mm.R.id.rs6);
        this.f264374m = weImageView;
        if (weImageView != null) {
            weImageView.setOnClickListener(this);
        }
        android.widget.TextView textView = this.f264375n;
        if (textView != null) {
            textView.setOnClickListener(new fn2.m(this));
        }
        zl2.r4.f473950a.Z2(this.f264373i, null, 200, 100, (r17 & 16) != 0, (r17 & 32) != 0 ? com.tencent.mm.ui.tools.t4.MODE_CHINESE_AS_2 : null, new fn2.o(this));
        android.widget.EditText editText = this.f264373i;
        if (editText != null) {
            editText.setOnEditorActionListener(new fn2.r(this));
        }
        android.content.Context c17 = c();
        kotlin.jvm.internal.o.f(c17, "<get-context>(...)");
        bm2.n7 n7Var = new bm2.n7(c17, controller, y0Var);
        this.f264376o = n7Var;
        android.content.Context c18 = c();
        kotlin.jvm.internal.o.f(c18, "<get-context>(...)");
        bm2.o6 o6Var = new bm2.o6(c18, controller, i17, sourceScene, y0Var);
        this.f264377p = o6Var;
        o6Var.f22199o = r45.y4.AddSongSourceType_Search;
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.s3c);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.plugin.finder.live.widget.dv dvVar = new com.tencent.mm.plugin.finder.live.widget.dv((android.view.ViewGroup) findViewById, controller, y0Var, null);
        this.f264379r = dvVar;
        androidx.recyclerview.widget.RecyclerView recyclerView = dvVar.f118152e;
        if (recyclerView != null) {
            recyclerView.setAdapter(n7Var);
            recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(recyclerView.getContext()));
        }
        android.view.View findViewById2 = root.findViewById(com.tencent.mm.R.id.s3d);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        com.tencent.mm.plugin.finder.live.widget.dv dvVar2 = new com.tencent.mm.plugin.finder.live.widget.dv((android.view.ViewGroup) findViewById2, controller, y0Var, null);
        this.f264380s = dvVar2;
        androidx.recyclerview.widget.RecyclerView recyclerView2 = dvVar2.f118152e;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(o6Var);
            recyclerView2.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(recyclerView2.getContext()));
            ym5.a1.g(recyclerView2, new fn2.f(this));
        }
        fn2.g gVar = new fn2.g(this, null);
        fn2.h hVar = new fn2.h(this);
        dvVar2.f118162o = gVar;
        dvVar2.f118163p = hVar;
        if (y0Var != null) {
            kotlinx.coroutines.l.d(y0Var, null, null, new fn2.k(this, null), 3, null);
        }
    }

    public static final void a(fn2.s sVar, java.util.List list) {
        com.tencent.mm.plugin.finder.live.widget.dv dvVar = sVar.f264379r;
        if (dvVar != null) {
            dvVar.b();
        }
        com.tencent.mm.plugin.finder.live.widget.dv dvVar2 = sVar.f264380s;
        if (dvVar2 != null) {
            android.content.Context c17 = sVar.c();
            kotlin.jvm.internal.o.f(c17, "<get-context>(...)");
            java.lang.String string = c17.getString(com.tencent.mm.R.string.lqo);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            dvVar2.c(list, string);
        }
    }

    public static final void b(fn2.s sVar) {
        sVar.getClass();
        if (zl2.r4.f473950a.x1()) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.z4 z4Var = ml2.z4.W1;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", 2);
            jSONObject.put("element", 1);
            zy2.zb.y6(zbVar, z4Var, jSONObject.toString(), null, 4, null);
            return;
        }
        i95.m c18 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c18;
        ml2.b4 b4Var = ml2.b4.f327253o2;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("type", 2);
        jSONObject2.put("element", 1);
        ml2.r0.hj(r0Var, b4Var, jSONObject2.toString(), 0L, null, null, null, null, null, 252, null);
    }

    public final android.content.Context c() {
        return this.f264368d.getContext();
    }

    public final void d() {
        kotlinx.coroutines.r2 r2Var = this.f264382u;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        android.content.Context c17 = c();
        kotlin.jvm.internal.o.f(c17, "<get-context>(...)");
        android.widget.EditText editText = this.f264373i;
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) c17.getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(editText != null ? editText.getWindowToken() : null, 0);
        }
        android.widget.EditText editText2 = this.f264373i;
        if (editText2 != null) {
            editText2.clearComposingText();
            editText2.clearFocus();
            editText2.setText("");
        }
        com.tencent.mm.plugin.finder.live.widget.dv dvVar = this.f264379r;
        if (dvVar != null) {
            dvVar.b();
        }
        com.tencent.mm.plugin.finder.live.widget.dv dvVar2 = this.f264380s;
        if (dvVar2 != null) {
            dvVar2.b();
        }
        bm2.n7 n7Var = this.f264376o;
        ((java.util.ArrayList) n7Var.f22164d).clear();
        n7Var.notifyDataSetChanged();
        bm2.o6 o6Var = this.f264377p;
        ((java.util.ArrayList) o6Var.f22204t).clear();
        o6Var.notifyDataSetChanged();
        android.widget.TextView textView = this.f264375n;
        if (textView != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(textView, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongSearchWidget", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(textView, "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongSearchWidget", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f264383v = "";
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongSearchWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.rs6) {
            android.widget.EditText editText = this.f264373i;
            if (editText != null) {
                editText.setText("");
            }
            d();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongSearchWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
