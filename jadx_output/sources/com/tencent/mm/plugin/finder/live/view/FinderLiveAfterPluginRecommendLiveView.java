package com.tencent.mm.plugin.finder.live.view;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\u001d\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveAfterPluginRecommendLiveView;", "Landroid/widget/LinearLayout;", "Lr45/qt2;", "d", "Lr45/qt2;", "getReportObj", "()Lr45/qt2;", "setReportObj", "(Lr45/qt2;)V", "reportObj", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "com/tencent/mm/plugin/finder/live/view/o0", "com/tencent/mm/plugin/finder/live/view/r0", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderLiveAfterPluginRecommendLiveView extends android.widget.LinearLayout {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f115780x = 0;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public r45.qt2 reportObj;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.view.SimpleLivingCardView f115782e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.view.SimpleLivingCardView f115783f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.view.SimpleLivingCardView f115784g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.view.SimpleLivingCardView f115785h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f115786i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View f115787m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.ViewGroup f115788n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.ViewGroup f115789o;

    /* renamed from: p, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f115790p;

    /* renamed from: q, reason: collision with root package name */
    public r45.fa2 f115791q;

    /* renamed from: r, reason: collision with root package name */
    public final android.view.View f115792r;

    /* renamed from: s, reason: collision with root package name */
    public final android.view.View f115793s;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.View f115794t;

    /* renamed from: u, reason: collision with root package name */
    public c50.m0 f115795u;

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.view.r0 f115796v;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.List f115797w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveAfterPluginRecommendLiveView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.live.view.r0 r0Var = new com.tencent.mm.plugin.finder.live.view.r0(this);
        this.f115796v = r0Var;
        this.f115797w = new java.util.ArrayList();
        android.view.View.inflate(context, com.tencent.mm.R.layout.b0m, this);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.icl);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f115782e = (com.tencent.mm.plugin.finder.live.view.SimpleLivingCardView) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.f485640ig2);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f115783f = (com.tencent.mm.plugin.finder.live.view.SimpleLivingCardView) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.ifc);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f115784g = (com.tencent.mm.plugin.finder.live.view.SimpleLivingCardView) findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.i_j);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f115785h = (com.tencent.mm.plugin.finder.live.view.SimpleLivingCardView) findViewById4;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.opc);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f115786i = (android.widget.TextView) findViewById5;
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.f487354oe0);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f115787m = findViewById6;
        android.view.View findViewById7 = findViewById(com.tencent.mm.R.id.onq);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        com.tencent.mm.ui.fk.a((android.widget.TextView) findViewById7);
        android.view.View findViewById8 = findViewById(com.tencent.mm.R.id.ihm);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.f115788n = (android.view.ViewGroup) findViewById8;
        android.view.View findViewById9 = findViewById(com.tencent.mm.R.id.rvp);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        this.f115789o = (android.view.ViewGroup) findViewById9;
        this.f115792r = findViewById(com.tencent.mm.R.id.f487082s75);
        this.f115793s = findViewById(com.tencent.mm.R.id.s3w);
        this.f115794t = findViewById(com.tencent.mm.R.id.f485176u06);
        android.view.View findViewById10 = findViewById(com.tencent.mm.R.id.rvq);
        kotlin.jvm.internal.o.f(findViewById10, "findViewById(...)");
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) findViewById10;
        this.f115790p = recyclerView;
        recyclerView.setAdapter(r0Var);
        recyclerView.setLayoutManager(new com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager(2, 1));
        if (recyclerView.getItemDecorationCount() == 0) {
            android.content.Context context2 = getRootView().getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            recyclerView.N(new com.tencent.mm.plugin.finder.live.view.o0(context2));
        }
        ym5.a1.g(recyclerView, new in5.f(new com.tencent.mm.plugin.finder.live.view.m0(this), new com.tencent.mm.plugin.finder.live.view.n0(this)));
        ym5.a1.h(recyclerView, new in5.g(recyclerView));
    }

    public final void a() {
        java.lang.String str;
        c50.q0 q0Var = (c50.q0) i95.n0.c(c50.q0.class);
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        androidx.appcompat.app.AppCompatActivity appCompatActivity = (androidx.appcompat.app.AppCompatActivity) context;
        java.util.List feedList = this.f115797w;
        mn0.d0 d0Var = mn0.d0.f329717p;
        ((v40.q) q0Var).getClass();
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f115790p;
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(feedList, "feedList");
        pf5.u uVar = pf5.u.f353936a;
        ((gp2.v0) uVar.e(wo2.k.class).a(gp2.v0.class)).N6(appCompatActivity);
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) uVar.c(appCompatActivity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        if (nyVar == null || (str = java.lang.Integer.valueOf(nyVar.f135380n).toString()) == null) {
            str = "";
        }
        gp2.l0 l0Var = new gp2.l0(appCompatActivity, recyclerView, feedList, false, 0, false, false, false, null, d0Var, 0, str, 0, false, null, null, 62960, null);
        l0Var.e(null);
        this.f115795u = l0Var;
        l0Var.f(c50.a.f38585d, 10);
        c50.m0 m0Var = this.f115795u;
        if (m0Var != null) {
            com.tencent.mm.plugin.finder.live.view.s0 s0Var = new com.tencent.mm.plugin.finder.live.view.s0(this);
            com.tencent.mm.plugin.finder.live.view.t0 t0Var = new com.tencent.mm.plugin.finder.live.view.t0(this);
            gp2.l0 l0Var2 = (gp2.l0) m0Var;
            l0Var2.H = s0Var;
            l0Var2.I = t0Var;
        }
        post(new com.tencent.mm.plugin.finder.live.view.v0(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x03f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(r45.fa2 r29, so2.v2 r30, float r31) {
        /*
            Method dump skipped, instructions count: 1094
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.view.FinderLiveAfterPluginRecommendLiveView.b(r45.fa2, so2.v2, float):void");
    }

    public final void c(com.tencent.mm.protocal.protobuf.FinderObject finderObject, ml2.x1 x1Var, org.json.JSONObject jSONObject) {
        org.json.JSONObject jSONObject2 = jSONObject == null ? new org.json.JSONObject() : jSONObject;
        r45.nw1 liveInfo = finderObject.getLiveInfo();
        jSONObject2.put("liveid", pm0.v.u(liveInfo != null ? liveInfo.getLong(0) : 0L));
        jSONObject2.put("exposeType", 2);
        java.lang.String jSONObject3 = jSONObject2.toString();
        kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveAfterPluginRecommendLiveView", "abel end page log, 21053, action=" + x1Var.f328220d + ", extra=" + jSONObject3);
        c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
        java.lang.String username = finderObject.getUsername();
        java.lang.String valueOf = java.lang.String.valueOf(finderObject.getRefObjectId());
        long refObjectId = finderObject.getRefObjectId();
        r45.nw1 liveInfo2 = finderObject.getLiveInfo();
        long j17 = liveInfo2 != null ? liveInfo2.getLong(0) : 0L;
        ml2.q1 q1Var = ml2.q1.f327812e;
        r45.nw1 liveInfo3 = finderObject.getLiveInfo();
        int integer = liveInfo3 != null ? liveInfo3.getInteger(1) : -1;
        java.lang.String nickname = finderObject.getNickname();
        if (nickname == null) {
            nickname = "";
        }
        ((b92.d1) zbVar).wi(new ml2.f0(null, username, 0, valueOf, refObjectId, j17, x1Var, "temp_30", integer, nickname, ml2.e0.f327371f, false, false, 0, null, null, jSONObject3, null, 1L, null, 0, 0L, 0, null, null, null, 66777088, null));
    }

    public final r45.qt2 getReportObj() {
        return this.reportObj;
    }

    public final void setReportObj(r45.qt2 qt2Var) {
        this.reportObj = qt2Var;
    }
}
