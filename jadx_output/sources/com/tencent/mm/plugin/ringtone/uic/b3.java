package com.tencent.mm.plugin.ringtone.uic;

/* loaded from: classes10.dex */
public final class b3 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f158351d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f158352e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f158353f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f158354g;

    /* renamed from: h, reason: collision with root package name */
    public final ox3.u f158355h;

    /* renamed from: i, reason: collision with root package name */
    public final ox3.n f158356i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f158357m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.view.recyclerview.WxLinearLayoutManager f158358n;

    /* renamed from: o, reason: collision with root package name */
    public cy3.a0 f158359o;

    /* renamed from: p, reason: collision with root package name */
    public vx3.i f158360p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f158361q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f158362r;

    /* renamed from: s, reason: collision with root package name */
    public int f158363s;

    /* renamed from: t, reason: collision with root package name */
    public final int f158364t;

    /* renamed from: u, reason: collision with root package name */
    public final int f158365u;

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.mm.plugin.ringtone.uic.z2 f158366v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f158367w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f158351d = jz5.h.b(new com.tencent.mm.plugin.ringtone.uic.n2(this));
        this.f158352e = jz5.h.b(new com.tencent.mm.plugin.ringtone.uic.m2(this));
        this.f158353f = jz5.h.b(new com.tencent.mm.plugin.ringtone.uic.o2(this));
        this.f158354g = jz5.h.b(new com.tencent.mm.plugin.ringtone.uic.a3(this));
        jz5.h.b(new com.tencent.mm.plugin.ringtone.uic.w2(this));
        jz5.h.b(new com.tencent.mm.plugin.ringtone.uic.x2(this));
        jz5.h.b(new com.tencent.mm.plugin.ringtone.uic.l2(this));
        this.f158355h = new ox3.u();
        this.f158356i = new ox3.n();
        this.f158358n = new com.tencent.mm.view.recyclerview.WxLinearLayoutManager(activity, 1, false);
        this.f158363s = -1;
        this.f158364t = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("ReportRingBackRequestInfoMaxCount", 10);
        this.f158365u = i65.a.h(activity, com.tencent.mm.R.dimen.f479738dv);
        this.f158366v = new com.tencent.mm.plugin.ringtone.uic.z2(this, activity);
    }

    public final void O6(boolean z17, boolean z18) {
        this.f158361q = true;
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        ((com.tencent.mm.plugin.ringtone.uic.g2) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.ringtone.uic.g2.class)).P6(true, this.f158360p, z18);
        if (z17) {
            return;
        }
        androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
        kotlin.jvm.internal.o.g(activity2, "activity");
        java.lang.Object a17 = pf5.z.f353948a.a(activity2).a(com.tencent.mm.plugin.ringtone.uic.c3.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        ed0.z0.i1((ed0.z0) a17, 8L, 0, null, 0L, 14, null);
    }

    public final com.tencent.mm.view.refreshLayout.WxRefreshLayout P6() {
        java.lang.Object value = ((jz5.n) this.f158351d).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.view.refreshLayout.WxRefreshLayout) value;
    }

    public final com.tencent.mm.view.recyclerview.WxRecyclerView Q6() {
        java.lang.Object value = ((jz5.n) this.f158353f).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.view.recyclerview.WxRecyclerView) value;
    }

    public final boolean R6() {
        return ((com.tencent.mm.plugin.ringtone.uic.v) ((dd0.m0) ((ed0.a1) i95.n0.c(ed0.a1.class))).Ai(getActivity())).Q6();
    }

    public final void S6() {
        java.util.List data;
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f158357m;
        if (wxRecyclerAdapter != null) {
            if (wxRecyclerAdapter != null && (data = wxRecyclerAdapter.getData()) != null) {
                data.clear();
            }
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = this.f158357m;
            if (wxRecyclerAdapter2 != null) {
                wxRecyclerAdapter2.notifyDataSetChanged();
                return;
            }
            return;
        }
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        java.lang.Object a17 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.ringtone.uic.v.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter n66 = ed0.r0.n6((ed0.r0) a17, false, 1, null);
        n66.F = this.f158366v;
        if (R6()) {
            in5.n0.S(n66, this.f158355h, false, 2, null);
        }
        Q6().setAdapter(n66);
        this.f158357m = n66;
    }

    public final void T6() {
        Q6().setVisibility(0);
        java.lang.Object value = ((jz5.n) this.f158354g).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        android.view.View view = (android.view.View) value;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/ringtone/uic/RingtoneSelectMainUIC", "showSearchResultView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/ringtone/uic/RingtoneSelectMainUIC", "showSearchResultView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.util.List data;
        super.onActivityResult(i17, i18, intent);
        if (i18 == 6) {
            getActivity().setResult(6, getIntent());
            getActivity().finish();
        }
        if (i17 == 11111 && i18 == -1) {
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f158357m;
            if ((wxRecyclerAdapter == null || (data = wxRecyclerAdapter.getData()) == null || data.isEmpty()) ? false : true) {
                return;
            }
            O6(true, false);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        ((com.tencent.mm.plugin.ringtone.uic.c3) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.ringtone.uic.c3.class)).f158374f = 1;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
        java.lang.String stringExtra = getIntent().getStringExtra("ringtone_select_ringtone");
        if (stringExtra != null) {
            this.f158360p = vx3.l.E.f(stringExtra);
        }
        P6().setOnSimpleAction(new com.tencent.mm.plugin.ringtone.uic.p2(this));
        if (R6()) {
            P6().getCommonConfig().f330194d = false;
        }
        P6().getCommonConfig().f330206p = true;
        P6().getCommonConfig().f330207q = false;
        com.tencent.mm.view.recyclerview.WxLinearLayoutManager wxLinearLayoutManager = this.f158358n;
        wxLinearLayoutManager.f11877q = true;
        Q6().setLayoutManager(wxLinearLayoutManager);
        Q6().setItemViewCacheSize(0);
        if (R6()) {
            cy3.a0 a0Var = new cy3.a0(i65.a.h(getActivity(), com.tencent.mm.R.dimen.f479727dj));
            this.f158359o = a0Var;
            a0Var.f224751h = new com.tencent.mm.plugin.ringtone.uic.q2(this);
            a0Var.b(Q6());
            Q6().i(new com.tencent.mm.plugin.ringtone.uic.r2(this));
        } else {
            Q6().N(new cy3.t(getActivity()));
        }
        findViewById(com.tencent.mm.R.id.m5s).setOnClickListener(new com.tencent.mm.plugin.ringtone.uic.s2(this));
        S6();
        if (R6()) {
            O6(true, false);
        } else {
            P6().setRefreshingState(true);
        }
        kotlinx.coroutines.l.d(getMainScope(), null, null, new com.tencent.mm.plugin.ringtone.uic.i2(this, null), 3, null);
        P6().postDelayed(new com.tencent.mm.plugin.ringtone.uic.t2(this), 100L);
        kotlinx.coroutines.l.d(v65.m.b(getActivity()), kotlinx.coroutines.internal.b0.f310484a, null, new com.tencent.mm.plugin.ringtone.uic.v2(this, null), 2, null);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        Q6().setAdapter(null);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
    }
}
