package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ej0 extends com.tencent.mm.plugin.finder.live.plugin.l {

    /* renamed from: r, reason: collision with root package name */
    public static boolean f112427r;

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f112428p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f112429q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ej0(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f112428p = statusMonitor;
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.ihi);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById;
        android.view.View findViewById2 = root.findViewById(com.tencent.mm.R.id.ihh);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById2;
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(viewGroup, "finder_live_mini_window");
        if (statusMonitor.getLiveRole() == 0) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(viewGroup, 8, 25561);
        }
        weImageView.setImageResource(u1() ? com.tencent.mm.R.raw.icons_outlined_multi_task : com.tencent.mm.R.raw.icons_outlined_mini_window_new_2);
        viewGroup.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.yi0(this));
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
        super.M0(status, bundle);
        int ordinal = status.ordinal();
        if (ordinal == 7 || ordinal == 30) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.I8((zy2.zb) c17, ml2.u1.f328088u, null, null, null, null, null, false, 126, null);
            this.f112429q = true;
            return;
        }
        if (ordinal == 27 || ordinal == 28) {
            K0(4);
            this.f112429q = false;
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l
    public void l1(android.os.Bundle bundle, java.lang.Object obj) {
        java.lang.String string = bundle != null ? bundle.getString("ACTION_POST_PORTRAIT", "") : null;
        if (!kotlin.jvm.internal.o.b(string != null ? string : "", "PORTRAIT_ACTION_OPEN_PERMISTTION_PAGE") || f112427r) {
            return;
        }
        f112427r = true;
        pm0.v.V(500L, new com.tencent.mm.plugin.finder.live.plugin.cj0(this));
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return true;
    }

    public final void t1() {
        if (!((mm2.c1) P0(mm2.c1.class)).M7()) {
            android.content.Context context = this.f365323d.getContext();
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            if (!((androidx.appcompat.app.AppCompatActivity) context).getIntent().hasExtra("KEY_MINI_APP_AD_FLOW_INFO")) {
                v1();
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorMiniWindowPlugin", "miniWindow click!");
                i95.m c17 = i95.n0.c(ml2.j0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                zy2.zb.T8((zy2.zb) c17, ml2.t1.f327984s, null, null, null, null, null, false, 126, null);
                zl2.r4.f473950a.d(this);
            }
        }
        if (((mm2.c1) P0(mm2.c1.class)).L5) {
            ((mm2.c1) P0(mm2.c1.class)).N5 = 2;
            v1();
            i95.m c18 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            zy2.zb.T8((zy2.zb) c18, ml2.t1.f327984s, null, null, null, null, null, false, 126, null);
        } else {
            xu2.u uVar = (xu2.u) X0(xu2.u.class);
            if (uVar != null) {
                uVar.x1(new com.tencent.mm.plugin.finder.live.plugin.zi0(this));
            }
        }
        zl2.r4.f473950a.d(this);
    }

    public final boolean u1() {
        if (com.tencent.mm.ui.bk.v0()) {
            android.view.ViewGroup viewGroup = this.f365323d;
            android.content.Context context = viewGroup.getContext();
            android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
            kotlin.jvm.internal.o.d(activity);
            if (!com.tencent.mm.ui.bk.N(activity.getTaskId())) {
                android.content.Context context2 = viewGroup.getContext();
                android.app.Activity activity2 = context2 instanceof android.app.Activity ? (android.app.Activity) context2 : null;
                if (com.tencent.mm.ui.bk.O(activity2 != null ? activity2.getContentResolver() : null)) {
                    android.content.Context context3 = viewGroup.getContext();
                    android.app.Activity activity3 = context3 instanceof android.app.Activity ? (android.app.Activity) context3 : null;
                    kotlin.jvm.internal.o.d(activity3);
                    if (!activity3.isInMultiWindowMode()) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void v1() {
        if (!((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            com.tencent.mars.xlog.Log.e("Finder.FinderLiveVisitorMiniWindowPlugin", "showVideoTalking, permission denied");
            if (!x0()) {
                x1();
                return;
            } else {
                com.tencent.mm.plugin.finder.live.plugin.l.q1(this, "PORTRAIT_ACTION_OPEN_PERMISTTION_PAGE", null, 2, null);
                f112427r = false;
                return;
            }
        }
        qo0.c cVar = this.f112428p;
        if (cVar.getLiveRole() == 1) {
            ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
            ml2.y4 y4Var = ml2.j0.f327583i;
            y4Var.U = true;
            ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
            y4Var.V = false;
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.z4 z4Var = ml2.z4.f328352g;
            ml2.z1 z1Var = ml2.z1.f328331e;
            zy2.zb.y6(zbVar, z4Var, java.lang.String.valueOf(2), null, 4, null);
        } else if (cVar.getLiveRole() == 0) {
            ((ml2.r0) i95.n0.c(ml2.r0.class)).Mj(true, ml2.z1.f328333g);
        }
        if (cVar.getLiveRole() == 0) {
            com.tencent.mm.plugin.finder.live.view.k0 Y0 = Y0();
            com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout = Y0 instanceof com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout ? (com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout) Y0 : null;
            if (finderLiveVisitorPluginLayout != null ? finderLiveVisitorPluginLayout.getIsPresentedInTimeLineUI() : false) {
                dk2.ef efVar = dk2.ef.f233372a;
                if (dk2.ef.f233398n != null) {
                    com.tencent.mars.xlog.Log.w("FinderVideoPassive", "onShowMiniWindowFromTimeLineUI.");
                }
                com.tencent.mm.plugin.finder.live.view.k0 Y02 = Y0();
                com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout2 = Y02 instanceof com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout ? (com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout) Y02 : null;
                if (finderLiveVisitorPluginLayout2 != null) {
                    finderLiveVisitorPluginLayout2.checkMiniWindow();
                }
            }
        }
        android.content.Context context = this.f365323d.getContext();
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null) {
            pf5.z zVar = pf5.z.f353948a;
            if (!(activity instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveExitAnimateOpUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) activity).a(com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveExitAnimateOpUIC.class)).f116991q = true;
            pf5.z zVar2 = pf5.z.f353948a;
            if (!(activity instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveExitAnimateOpUIC) zVar2.a((androidx.appcompat.app.AppCompatActivity) activity).a(com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveExitAnimateOpUIC.class)).f116992r = 2;
            activity.finish();
        }
    }

    public final void w1(android.view.View view) {
        if (view == null || !u1()) {
            t1();
            return;
        }
        android.view.ViewGroup viewGroup = this.f365323d;
        rl5.r rVar = new rl5.r(viewGroup.getContext(), view);
        rVar.F = true;
        rVar.f397335J = viewGroup.getContext().getString(com.tencent.mm.R.string.k28);
        rVar.f397355y = new com.tencent.mm.plugin.finder.live.plugin.aj0(this);
        rVar.f397354x = new com.tencent.mm.plugin.finder.live.plugin.bj0(this);
        rVar.m();
    }

    public final void x1() {
        qo0.c.a(this.f112428p, qo0.b.D, null, 2, null);
        tb0.i iVar = (tb0.i) i95.n0.c(tb0.i.class);
        android.view.ViewGroup viewGroup = this.f365323d;
        android.content.Context context = viewGroup.getContext();
        java.lang.String string = viewGroup.getContext().getString(com.tencent.mm.R.string.gff);
        com.tencent.mm.plugin.finder.live.plugin.dj0 dj0Var = new com.tencent.mm.plugin.finder.live.plugin.dj0(this);
        java.lang.String a17 = n25.a.a();
        ((sb0.f) iVar).getClass();
        com.tencent.mm.pluginsdk.permission.RequestFloatWindowPermissionDialog.R6(context, 21, string, dj0Var, false, false, a17);
    }
}
