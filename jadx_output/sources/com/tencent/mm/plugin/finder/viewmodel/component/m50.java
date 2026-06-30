package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes10.dex */
public final class m50 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public int f135124d;

    /* renamed from: e, reason: collision with root package name */
    public long f135125e;

    /* renamed from: f, reason: collision with root package name */
    public int f135126f;

    /* renamed from: g, reason: collision with root package name */
    public int f135127g;

    /* renamed from: h, reason: collision with root package name */
    public final long f135128h;

    /* renamed from: i, reason: collision with root package name */
    public final int f135129i;

    /* renamed from: m, reason: collision with root package name */
    public int f135130m;

    /* renamed from: n, reason: collision with root package name */
    public int f135131n;

    /* renamed from: o, reason: collision with root package name */
    public long f135132o;

    /* renamed from: p, reason: collision with root package name */
    public long f135133p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f135134q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f135135r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f135136s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout f135137t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m50(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        this.f135128h = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Y8).getValue()).r()).longValue();
        this.f135129i = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Z8).getValue()).r()).intValue();
        this.f135132o = -1L;
        com.tencent.mm.sdk.platformtools.b4 b4Var = new com.tencent.mm.sdk.platformtools.b4("Finder.SilentPlayControlUIC", (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.plugin.finder.viewmodel.component.l50(this), true);
        b4Var.setLogging(false);
        this.f135136s = b4Var;
    }

    public static final void O6(com.tencent.mm.plugin.finder.viewmodel.component.m50 m50Var, long j17, int i17, int i18, boolean z17) {
        m50Var.getClass();
        com.tencent.mars.xlog.Log.i("Finder.SilentPlayControlUIC", "[pausePlay] feedId=" + pm0.v.u(j17) + " isImage=" + z17 + " limitPlayDuration=" + m50Var.f135128h + " limitPlayCount=" + m50Var.f135129i);
        m50Var.P6(1, z17, j17, i17, i18, true);
        pm0.v.X(new com.tencent.mm.plugin.finder.viewmodel.component.j50(z17, m50Var));
    }

    public final void P6(int i17, boolean z17, long j17, int i18, int i19, boolean z18) {
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        if (nyVar != null) {
            r45.qt2 V6 = nyVar.V6();
            cl0.g gVar = new cl0.g();
            gVar.h("feedid", pm0.v.u(j17));
            if (!z17) {
                cl0.g gVar2 = new cl0.g();
                gVar2.o("current_play_sec", i18);
                gVar2.o("video_duration", i19);
                gVar.h("video_play_info", gVar2);
            }
            gVar.o("pause_type", i17);
            if (i17 == 1) {
                cl0.g gVar3 = new cl0.g();
                gVar3.o("replay_cnt", this.f135124d);
                gVar3.p("freeze_sec", (java.lang.System.currentTimeMillis() - this.f135125e) / 1000);
                gVar.h("auto_pause", gVar3);
            }
            com.tencent.mars.xlog.Log.i("Finder.SilentPlayControlUIC", "[report] isExposed=" + z18 + ' ' + gVar);
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.String gVar4 = gVar.toString();
            kotlin.jvm.internal.o.f(gVar4, "toString(...)");
            g0Var.d(21875, V6.getString(0), V6.getString(1), java.lang.Integer.valueOf(V6.getInteger(5)), java.lang.Integer.valueOf(1 ^ (z18 ? 1 : 0)), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), "button_goon_play", r26.i0.t(gVar4, ",", ";", false), V6.getString(2), java.lang.Integer.valueOf(V6.getInteger(7)));
        }
    }

    public final void Q6(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("Finder.SilentPlayControlUIC", "[reset] playCount=" + this.f135124d + " playTime=" + (java.lang.System.currentTimeMillis() - this.f135125e) + "ms source=" + str);
        this.f135124d = 0;
        this.f135125e = java.lang.System.currentTimeMillis();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onKeyDown(int i17, android.view.KeyEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        Q6("onKeyDown");
        return super.onKeyDown(i17, event);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStop() {
        super.onStop();
        this.f135136s.d();
        this.f135137t = null;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        Q6("WINDOW_FOCUS");
    }
}
