package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes9.dex */
public final class e2 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.appcompat.app.AppCompatActivity f117056d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f117057e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f117058f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.view.refreshLayout.WxRefreshLayout f117059g;

    /* renamed from: h, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f117060h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f117061i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f117062m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.EditText f117063n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f117064o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f117065p;

    /* renamed from: q, reason: collision with root package name */
    public db2.m5 f117066q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f117067r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f117068s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f117069t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.ArrayList f117070u;

    /* renamed from: v, reason: collision with root package name */
    public final bm2.f f117071v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.viewmodel.s1 f117072w;

    /* renamed from: x, reason: collision with root package name */
    public yz5.l f117073x;

    public e2(androidx.appcompat.app.AppCompatActivity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f117056d = activity;
        this.f117067r = "";
        this.f117068s = "";
        this.f117070u = new java.util.ArrayList();
        this.f117071v = new bm2.f();
    }

    public static final void a(com.tencent.mm.plugin.finder.live.viewmodel.e2 e2Var, boolean z17) {
        if (!z17) {
            com.tencent.mm.plugin.finder.live.viewmodel.s1 s1Var = e2Var.f117072w;
            if (s1Var != null) {
                android.widget.LinearLayout linearLayout = s1Var.f117376h;
                if (linearLayout == null) {
                    kotlin.jvm.internal.o.o("container");
                    throw null;
                }
                linearLayout.setVisibility(8);
            }
            android.view.View view = e2Var.f117061i;
            if (view == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveSearchUIC", "configRecentPlayContainer", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveSearchUIC", "configRecentPlayContainer", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        com.tencent.mm.plugin.finder.live.viewmodel.s1 s1Var2 = e2Var.f117072w;
        if (s1Var2 != null && s1Var2.f117381p.getItemCount() > 0) {
            android.widget.LinearLayout linearLayout2 = s1Var2.f117376h;
            if (linearLayout2 == null) {
                kotlin.jvm.internal.o.o("container");
                throw null;
            }
            linearLayout2.setVisibility(0);
        }
        android.view.View view2 = e2Var.f117061i;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveSearchUIC", "configRecentPlayContainer", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveSearchUIC", "configRecentPlayContainer", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.TextView textView = e2Var.f117064o;
        if (textView == null) {
            return;
        }
        textView.setVisibility(8);
    }

    public final void b(cm2.k gameSearchItem, boolean z17) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(gameSearchItem, "gameSearchItem");
        r45.b73 b73Var = (r45.b73) gameSearchItem.f43358d.getCustom(1);
        if (b73Var == null || (str = b73Var.getString(0)) == null) {
            str = "";
        }
        ke2.y yVar = new ke2.y(str, 0, false, null, false, null, 60, null);
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f117056d;
        yVar.t(appCompatActivity, appCompatActivity.getResources().getString(com.tencent.mm.R.string.f9y), 500L);
        pq5.g l17 = yVar.l();
        kotlin.jvm.internal.o.e(appCompatActivity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        l17.f((com.tencent.mm.ui.MMActivity) appCompatActivity).K(new com.tencent.mm.plugin.finder.live.viewmodel.t1(this, str));
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        r45.s82 s82Var;
        gm0.j1.d().q(4140, this);
        java.util.ArrayList arrayList = this.f117070u;
        int size = arrayList.size();
        if (i17 == 0 && i18 == 0) {
            db2.m5 m5Var = m1Var instanceof db2.m5 ? (db2.m5) m1Var : null;
            if (m5Var != null && (s82Var = m5Var.f228075i) != null) {
                arrayList.addAll(s82Var.getList(1));
                java.lang.String string = s82Var.getString(3);
                if (string == null) {
                    string = "";
                }
                this.f117068s = string;
                this.f117069t = s82Var.getBoolean(2);
            }
        }
        int size2 = arrayList.size();
        com.tencent.mars.xlog.Log.i("Finder.FinderGameLiveSearchUIC", "originSize:" + size + ", currentSize:" + size2 + ", offset:" + this.f117068s + ", hasNext:" + this.f117069t);
        pm0.v.X(new com.tencent.mm.plugin.finder.live.viewmodel.d2(this, i17, size, size2));
    }
}
