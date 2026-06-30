package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class z10 implements com.tencent.mm.plugin.finder.live.plugin.ep0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f115255d;

    /* renamed from: e, reason: collision with root package name */
    public final gk2.e f115256e;

    /* renamed from: f, reason: collision with root package name */
    public final qo0.c f115257f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.l f115258g;

    /* renamed from: h, reason: collision with root package name */
    public final cm2.t f115259h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f115260i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.ViewGroup f115261m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.view.notice.NoticeBindItemMiniInfoView f115262n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.TextView f115263o;

    /* renamed from: p, reason: collision with root package name */
    public final long f115264p;

    /* renamed from: q, reason: collision with root package name */
    public kotlinx.coroutines.r2 f115265q;

    /* renamed from: r, reason: collision with root package name */
    public r45.h32 f115266r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.plugin.l10 f115267s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f115268t;

    /* renamed from: u, reason: collision with root package name */
    public yz5.p f115269u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.Integer f115270v;

    public z10(android.content.Context context, gk2.e buContext, qo0.c statusMonitor, yz5.l lVar, cm2.t tVar) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(buContext, "buContext");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f115255d = context;
        this.f115256e = buContext;
        this.f115257f = statusMonitor;
        this.f115258g = lVar;
        this.f115259h = tVar;
        this.f115260i = "FinderLiveNoticeBubble";
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.f488943aw2, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) inflate;
        this.f115261m = viewGroup;
        android.view.View findViewById = viewGroup.findViewById(com.tencent.mm.R.id.f483378si3);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f115262n = (com.tencent.mm.plugin.finder.view.notice.NoticeBindItemMiniInfoView) findViewById;
        android.view.View findViewById2 = viewGroup.findViewById(com.tencent.mm.R.id.fdr);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f115263o = (android.widget.TextView) findViewById2;
        this.f115264p = 5000L;
        this.f115267s = new com.tencent.mm.plugin.finder.live.plugin.l10(this);
        this.f115268t = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.tencent.mm.plugin.finder.live.plugin.z10 r38, com.tencent.mm.plugin.finder.view.notice.NoticeStatusView r39) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.z10.a(com.tencent.mm.plugin.finder.live.plugin.z10, com.tencent.mm.plugin.finder.view.notice.NoticeStatusView):void");
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public cm2.t A() {
        return this.f115259h;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void B(android.os.Bundle bundle, java.lang.Object obj, long j17) {
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void U() {
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(cm2.y r25) {
        /*
            Method dump skipped, instructions count: 566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.z10.b(cm2.y):void");
    }

    public final void c() {
        jz5.f0 f0Var;
        r45.h32 h32Var = this.f115266r;
        android.widget.TextView textView = this.f115263o;
        if (h32Var != null) {
            com.tencent.mm.plugin.finder.view.notice.NoticeBindItemMiniInfoView.a(this.f115262n, h32Var, false, false, true, 6, null);
            textView.setVisibility(8);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            this.f115262n.setVisibility(8);
            textView.setVisibility(0);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public int e0() {
        return com.tencent.mm.R.id.eqy;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void f0(java.lang.Object data) {
        kotlin.jvm.internal.o.g(data, "data");
        if (data instanceof cm2.y) {
            b((cm2.y) data);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public android.view.View getView() {
        return this.f115261m;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void l(java.lang.Object data) {
        kotlin.jvm.internal.o.g(data, "data");
        if (data instanceof cm2.y) {
            cm2.y yVar = (cm2.y) data;
            b(yVar);
            android.view.View findViewById = this.f115261m.findViewById(com.tencent.mm.R.id.fek);
            kotlin.jvm.internal.o.d(findViewById);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(findViewById, "live_reserve_room");
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(findViewById, 8, 25653);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(findViewById, 32, 25652);
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            ml2.q1 q1Var = ml2.q1.f327812e;
            jz5.l lVar = new jz5.l("comment_scene", "temp_30");
            r45.h32 h32Var = yVar.f43408v;
            ((cy1.a) rVar).gk(findViewById, kz5.c1.m(kz5.c1.k(lVar, new jz5.l("live_notice_id", h32Var.getString(4))), zl2.r4.f473950a.U(this.f115256e)));
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(findViewById, new com.tencent.mm.plugin.finder.live.plugin.t10(h32Var));
            ym5.a1.h(findViewById, new com.tencent.mm.plugin.finder.live.plugin.u10(this, h32Var));
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void l0() {
        gm0.j1.d().q(6276, this.f115267s);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public int p0() {
        return com.tencent.mm.R.id.hhj;
    }
}
