package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes10.dex */
public final class vu {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.ViewGroup f120089a;

    /* renamed from: b, reason: collision with root package name */
    public final sf2.d3 f120090b;

    /* renamed from: c, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f120091c;

    /* renamed from: d, reason: collision with root package name */
    public final fn2.u1 f120092d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f120093e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f120094f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.MMRoundCornerImageView f120095g;

    /* renamed from: h, reason: collision with root package name */
    public final androidx.constraintlayout.widget.ConstraintLayout f120096h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.view.LazyPlayPAGView f120097i;

    /* renamed from: j, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.MMProcessBar f120098j;

    /* renamed from: k, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.button.WeButton f120099k;

    /* renamed from: l, reason: collision with root package name */
    public final android.widget.TextView f120100l;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.ImageView f120101m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.TextView f120102n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.TextView f120103o;

    /* renamed from: p, reason: collision with root package name */
    public final androidx.constraintlayout.widget.ConstraintLayout f120104p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f120105q;

    public vu(android.view.ViewGroup root, sf2.d3 controller, kotlinx.coroutines.y0 y0Var, fn2.u1 sourceScene) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(controller, "controller");
        kotlin.jvm.internal.o.g(sourceScene, "sourceScene");
        this.f120089a = root;
        this.f120090b = controller;
        this.f120091c = y0Var;
        this.f120092d = sourceScene;
        this.f120093e = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.jyj);
        this.f120094f = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.qg7);
        this.f120095g = (com.tencent.mm.ui.widget.MMRoundCornerImageView) root.findViewById(com.tencent.mm.R.id.f484549qf5);
        this.f120096h = (androidx.constraintlayout.widget.ConstraintLayout) root.findViewById(com.tencent.mm.R.id.rfq);
        com.tencent.mm.view.LazyPlayPAGView lazyPlayPAGView = (com.tencent.mm.view.LazyPlayPAGView) root.findViewById(com.tencent.mm.R.id.f486040jz2);
        this.f120097i = lazyPlayPAGView;
        this.f120098j = (com.tencent.mm.ui.widget.MMProcessBar) root.findViewById(com.tencent.mm.R.id.ree);
        this.f120099k = (com.tencent.mm.ui.widget.button.WeButton) root.findViewById(com.tencent.mm.R.id.ref);
        this.f120100l = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.s9i);
        this.f120101m = (android.widget.ImageView) root.findViewById(com.tencent.mm.R.id.rs7);
        this.f120102n = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.s9q);
        this.f120103o = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.f486046uj0);
        this.f120104p = (androidx.constraintlayout.widget.ConstraintLayout) root.findViewById(com.tencent.mm.R.id.f486949v65);
        ym5.l2 l2Var = ym5.l2.f463424a;
        ym5.j2[] j2VarArr = ym5.j2.f463392d;
        if (lazyPlayPAGView != null) {
            lazyPlayPAGView.o(ae2.in.f3688a.a(ym5.f6.f463317p));
        }
        if (lazyPlayPAGView != null) {
            lazyPlayPAGView.setRepeatCount(0);
        }
        b();
    }

    public final android.content.Context a() {
        return this.f120089a.getContext();
    }

    public final void b() {
        android.view.ViewGroup viewGroup = this.f120089a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(viewGroup, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveRequestSingingSongWidget", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        viewGroup.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(viewGroup, "com/tencent/mm/plugin/finder/live/widget/FinderLiveRequestSingingSongWidget", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.view.LazyPlayPAGView lazyPlayPAGView = this.f120097i;
        if (lazyPlayPAGView != null) {
            lazyPlayPAGView.n();
        }
    }

    public final void c(int i17, bm2.y8 element, int i18, r45.ay1 ay1Var) {
        int i19;
        kotlin.jvm.internal.o.g(element, "element");
        boolean x17 = zl2.r4.f473950a.x1();
        hn2.c cVar = hn2.d.f282504o;
        fn2.u1 u1Var = this.f120092d;
        boolean z17 = false;
        int i27 = element.f22467d;
        if (x17) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.z4 z4Var = ml2.z4.Y1;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", i17);
            jSONObject.put("element", i27);
            jSONObject.put("tab_name", a().getString(com.tencent.mm.R.string.mni));
            jSONObject.put("pos", i18);
            jSONObject.put("source_scene", u1Var.f264417d);
            if (ay1Var != null && ay1Var.f370360q) {
                z17 = true;
            }
            if (z17) {
                jSONObject.put("part_id", 1);
            }
            if (ay1Var != null) {
                jSONObject.put("song_id", ay1Var.f370350d);
                jSONObject.put("song_name", ay1Var.f370351e);
                jSONObject.put("duration", cVar.a(ay1Var, null).a());
                jSONObject.put("singer_mid", ay1Var.f370352f);
                jSONObject.put("singer_name", ay1Var.f370353g);
            }
            zy2.zb.y6(zbVar, z4Var, jSONObject.toString(), null, 4, null);
            return;
        }
        i95.m c18 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c18;
        ml2.b4 b4Var = ml2.b4.f327261q2;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("type", i17);
        jSONObject2.put("element", i27);
        jSONObject2.put("tab_name", a().getString(com.tencent.mm.R.string.mni));
        jSONObject2.put("pos", i18);
        jSONObject2.put("source_scene", u1Var.f264417d);
        if (ay1Var != null) {
            i19 = 1;
            if (ay1Var.f370360q) {
                z17 = true;
            }
        } else {
            i19 = 1;
        }
        if (z17) {
            jSONObject2.put("part_id", i19);
        }
        if (ay1Var != null) {
            jSONObject2.put("song_id", ay1Var.f370350d);
            jSONObject2.put("song_name", ay1Var.f370351e);
            jSONObject2.put("duration", cVar.a(ay1Var, null).a());
            jSONObject2.put("singer_mid", ay1Var.f370352f);
            jSONObject2.put("singer_name", ay1Var.f370353g);
        }
        ml2.r0.hj(r0Var, b4Var, jSONObject2.toString(), 0L, null, null, null, null, null, 252, null);
    }
}
