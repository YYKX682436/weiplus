package com.tencent.mm.plugin.finder.search;

/* loaded from: classes8.dex */
public final class u4 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f125880a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.ui.search.FTSEditTextView f125881b;

    /* renamed from: c, reason: collision with root package name */
    public final int f125882c;

    /* renamed from: d, reason: collision with root package name */
    public final int f125883d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f125884e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f125885f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.search.w5 f125886g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.ListView f125887h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.search.r4 f125888i;

    /* renamed from: j, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f125889j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f125890k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f125891l;

    /* renamed from: m, reason: collision with root package name */
    public bq.t1 f125892m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.search.q4 f125893n;

    public u4(com.tencent.mm.ui.MMActivity activity, com.tencent.mm.ui.search.FTSEditTextView editText, int i17, int i18, boolean z17, boolean z18, yz5.l onSuggestionClickListener) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(editText, "editText");
        kotlin.jvm.internal.o.g(onSuggestionClickListener, "onSuggestionClickListener");
        this.f125880a = activity;
        this.f125881b = editText;
        this.f125882c = i17;
        this.f125883d = i18;
        this.f125884e = z17;
        this.f125885f = z18;
        this.f125886g = new com.tencent.mm.plugin.finder.search.w5(activity, z17, z18);
        android.view.View findViewById = activity.findViewById(com.tencent.mm.R.id.f487177ns4);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.ListView listView = (android.widget.ListView) findViewById;
        this.f125887h = listView;
        this.f125890k = "";
        this.f125891l = "";
        com.tencent.mm.plugin.finder.search.n4 n4Var = new com.tencent.mm.plugin.finder.search.n4(this);
        java.util.ArrayList arrayList = editText.F;
        if (!arrayList.contains(n4Var)) {
            arrayList.add(n4Var);
        }
        com.tencent.mm.plugin.finder.search.r4 r4Var = new com.tencent.mm.plugin.finder.search.r4(this);
        this.f125888i = r4Var;
        listView.setAdapter((android.widget.ListAdapter) r4Var);
        listView.setOnItemClickListener(new com.tencent.mm.plugin.finder.search.o4(this, onSuggestionClickListener));
        listView.setOnTouchListener(new com.tencent.mm.plugin.finder.search.p4(this));
        if (z17 || z18) {
            listView.setBackgroundColor(activity.getResources().getColor(com.tencent.mm.R.color.f479160rk));
        }
    }

    public final void a() {
        com.tencent.mars.xlog.Log.i("Finder.SearchSuggestion", "dismissSuggestion");
        android.widget.ListView listView = this.f125887h;
        listView.animate().cancel();
        listView.animate().alpha(0.0f).setDuration(300L).setListener(new com.tencent.mm.plugin.finder.search.t4(this)).start();
        com.tencent.mm.plugin.finder.search.q4 q4Var = this.f125893n;
        if (q4Var != null) {
            q4Var.a(8);
        }
    }

    public final void b() {
        com.tencent.mars.xlog.Log.i("Finder.SearchSuggestion", "ignore searchSuggestionContent");
        this.f125891l = "";
        this.f125889j = null;
        bq.t1 t1Var = this.f125892m;
        if (t1Var != null) {
            t1Var.j();
        }
        com.tencent.mm.plugin.finder.search.r4 r4Var = this.f125888i;
        r4Var.f125839d = null;
        r4Var.notifyDataSetChanged();
        a();
    }

    public final void c(int i17, int i18) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("searchsessionid", ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).f125208d);
        jSONObject.put("searchscene", i17);
        jSONObject.put("keyword", this.f125890k);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.List<android.text.SpannableString> list = this.f125888i.f125839d;
        if (list != null) {
            int i19 = 0;
            for (android.text.SpannableString spannableString : list) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append(i19);
                sb7.append('#');
                sb7.append((java.lang.Object) spannableString);
                sb7.append('/');
                sb6.append(sb7.toString());
                i19++;
            }
            if (sb6.length() > 0) {
                sb6.deleteCharAt(sb6.length() - 1);
            }
        }
        java.lang.String sb8 = sb6.toString();
        kotlin.jvm.internal.o.f(sb8, "toString(...)");
        jSONObject.put("expose_suggestword", sb8);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) c17;
        com.tencent.mm.ui.MMActivity context = this.f125880a;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        com.tencent.mm.plugin.finder.report.o3.ij(o3Var, i18, "suggestword_panel", t17, nyVar != null ? nyVar.V6() : null, null, 16, null);
    }
}
