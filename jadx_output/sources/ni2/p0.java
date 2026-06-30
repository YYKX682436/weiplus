package ni2;

/* loaded from: classes3.dex */
public final class p0 extends com.tencent.mm.plugin.finder.live.widget.g implements android.view.View.OnClickListener {

    /* renamed from: h, reason: collision with root package name */
    public final qo0.c f337407h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.plugin.l f337408i;

    /* renamed from: m, reason: collision with root package name */
    public fg2.a1 f337409m;

    /* renamed from: n, reason: collision with root package name */
    public int f337410n;

    /* renamed from: o, reason: collision with root package name */
    public int f337411o;

    /* renamed from: p, reason: collision with root package name */
    public hi2.b f337412p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f337413q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(android.content.Context context, qo0.c statusMonitor, com.tencent.mm.plugin.finder.live.plugin.l basePlugin) {
        super(context, false, null, false, 14, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        kotlin.jvm.internal.o.g(basePlugin, "basePlugin");
        this.f337407h = statusMonitor;
        this.f337408i = basePlugin;
        this.f337411o = 1;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public android.view.View c() {
        ae2.in inVar = ae2.in.f3688a;
        if (!(((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.R).getValue()).r()).intValue() == 1)) {
            return null;
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = new com.tencent.mm.ui.widget.imageview.WeImageView(this.f118381d);
        weImageView.setIconColor(weImageView.getContext().getResources().getColor(com.tencent.mm.R.color.FG_0));
        weImageView.setLayoutParams(new android.view.ViewGroup.LayoutParams(i65.a.b(weImageView.getContext(), 24), i65.a.b(weImageView.getContext(), 24)));
        weImageView.setImageResource(com.tencent.mm.R.raw.icons_outlined_screen_effect_medium);
        return weImageView;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int j() {
        return com.tencent.mm.R.layout.ava;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public java.lang.String o() {
        fg2.a1 a1Var = this.f337409m;
        if (a1Var == null) {
            kotlin.jvm.internal.o.o("viewBinding");
            throw null;
        }
        java.lang.String string = a1Var.f261937a.getResources().getString(com.tencent.mm.R.string.f491871ei2);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicRequestPanelWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        fg2.a1 a1Var = this.f337409m;
        if (a1Var == null) {
            kotlin.jvm.internal.o.o("viewBinding");
            throw null;
        }
        int id6 = a1Var.f261939c.getId();
        com.tencent.mm.plugin.finder.live.plugin.l lVar = this.f337408i;
        android.content.Context context = this.f118381d;
        if (valueOf != null && valueOf.intValue() == id6) {
            if (this.f337411o == 4) {
                ml2.n4 n4Var = ml2.n4.P;
                com.tencent.mars.xlog.Log.i("FinderLiveMicReportUtil", "reportLink21084 action: 38");
                i95.m c17 = i95.n0.c(ml2.r0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                ml2.r0.ik((ml2.r0) c17, n4Var, null, 0, 6, null);
            }
            zl2.r4 r4Var = zl2.r4.f473950a;
            android.content.Context context2 = this.f118381d;
            gk2.e S0 = lVar.S0();
            java.lang.String string = context.getString(com.tencent.mm.R.string.ec6);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            java.lang.String string2 = context.getString(com.tencent.mm.R.string.f491825ec4);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            if (r4Var.B(context2, S0, string, string2, new ni2.l0(this))) {
                this.f337413q = true;
                a();
                yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicRequestPanelWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            z();
        } else {
            fg2.a1 a1Var2 = this.f337409m;
            if (a1Var2 == null) {
                kotlin.jvm.internal.o.o("viewBinding");
                throw null;
            }
            int id7 = a1Var2.f261938b.getId();
            if (valueOf != null && valueOf.intValue() == id7) {
                if (this.f337411o == 4) {
                    ml2.n4 n4Var2 = ml2.n4.Q;
                    com.tencent.mars.xlog.Log.i("FinderLiveMicReportUtil", "reportLink21084 action: 39");
                    i95.m c18 = i95.n0.c(ml2.r0.class);
                    kotlin.jvm.internal.o.f(c18, "getService(...)");
                    ml2.r0.ik((ml2.r0) c18, n4Var2, null, 0, 6, null);
                }
                zl2.r4 r4Var2 = zl2.r4.f473950a;
                android.content.Context context3 = this.f118381d;
                gk2.e S02 = lVar.S0();
                java.lang.String string3 = context.getString(com.tencent.mm.R.string.ec6);
                kotlin.jvm.internal.o.f(string3, "getString(...)");
                java.lang.String string4 = context.getString(com.tencent.mm.R.string.f491825ec4);
                kotlin.jvm.internal.o.f(string4, "getString(...)");
                if (r4Var2.B(context3, S02, string3, string4, new ni2.m0(this))) {
                    this.f337413q = true;
                    a();
                    yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicRequestPanelWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                y();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicRequestPanelWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void p(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        int i17 = com.tencent.mm.R.id.a6v;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(rootView, com.tencent.mm.R.id.a6v);
        if (weImageView != null) {
            i17 = com.tencent.mm.R.id.f483289a71;
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(rootView, com.tencent.mm.R.id.f483289a71);
            if (linearLayout != null) {
                i17 = com.tencent.mm.R.id.f487556oz4;
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(rootView, com.tencent.mm.R.id.f487556oz4);
                if (weImageView2 != null) {
                    i17 = com.tencent.mm.R.id.oz_;
                    android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) x4.b.a(rootView, com.tencent.mm.R.id.oz_);
                    if (linearLayout2 != null) {
                        this.f337409m = new fg2.a1((android.widget.LinearLayout) rootView, weImageView, linearLayout, weImageView2, linearLayout2);
                        linearLayout2.setOnClickListener(this);
                        fg2.a1 a1Var = this.f337409m;
                        if (a1Var != null) {
                            a1Var.f261938b.setOnClickListener(this);
                            return;
                        } else {
                            kotlin.jvm.internal.o.o("viewBinding");
                            throw null;
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i17)));
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void t() {
        super.t();
        if (!this.f337413q) {
            ml2.n4 n4Var = ml2.n4.Z;
            com.tencent.mars.xlog.Log.i("FinderLiveMicReportUtil", "reportLink21084 action: 54");
            i95.m c17 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ml2.r0.ik((ml2.r0) c17, n4Var, null, 0, 6, null);
        }
        this.f337413q = false;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void v() {
        this.f337413q = true;
        a();
        ml2.n4 n4Var = ml2.n4.C;
        com.tencent.mars.xlog.Log.i("FinderLiveMicReportUtil", "reportLink21084 action: 26");
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0.ik((ml2.r0) c17, n4Var, null, 0, 6, null);
        this.f337407h.statusChange(qo0.b.f365360h3, null);
        com.tencent.mm.plugin.finder.live.plugin.kg0 kg0Var = (com.tencent.mm.plugin.finder.live.plugin.kg0) this.f337408i.X0(com.tencent.mm.plugin.finder.live.plugin.kg0.class);
        if (kg0Var != null) {
            kg0Var.F = new ni2.n0(this);
        }
    }

    public final void y() {
        com.tencent.mars.xlog.Log.i("FinderLiveMicRequestPanelWidget", "SHEET_MORE_ACTION_AUDIO_LINK");
        com.tencent.mm.plugin.finder.live.plugin.l lVar = this.f337408i;
        boolean z17 = false;
        if (!((mm2.o4) lVar.P0(mm2.o4.class)).k7()) {
            com.tencent.mars.xlog.Log.i("FinderLiveMicRequestPanelWidget", "skip apply mic, disable mic");
            fg2.a1 a1Var = this.f337409m;
            if (a1Var == null) {
                kotlin.jvm.internal.o.o("viewBinding");
                throw null;
            }
            android.content.Context context = a1Var.f261937a.getContext();
            fg2.a1 a1Var2 = this.f337409m;
            if (a1Var2 != null) {
                db5.t7.makeText(context, a1Var2.f261937a.getContext().getResources().getString(com.tencent.mm.R.string.f491606dn2), 0).show();
                return;
            } else {
                kotlin.jvm.internal.o.o("viewBinding");
                throw null;
            }
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("PARAM_FINDER_LIVE_LINK_MIC_TYPE", 1);
        bundle.putInt("PARAM_FINDER_LIVE_LINK_MIC_SOURCE", this.f337411o);
        bundle.putInt("PARAM_FINDER_LIVE_LINK_MIC_POSITION", this.f337410n);
        hi2.b bVar = this.f337412p;
        if (bVar != null) {
            bundle.putByteArray("PARAM_FINDER_LIVE_LINK_MIC_BUFFER", bVar.f281506a);
            bundle.putBoolean("PARAM_FINDER_LIVE_LINK_MIC_CAN_AUTO_LINK", bVar.f281507b);
        }
        qo0.b bVar2 = qo0.b.F3;
        qo0.c cVar = this.f337407h;
        cVar.statusChange(bVar2, bundle);
        this.f337413q = true;
        a();
        if (cVar.getLiveRole() == 0) {
            if (this.f337411o == 2) {
                dk2.u4 u4Var = ((mm2.o4) lVar.S0().a(mm2.o4.class)).Z;
                if (!(u4Var != null && u4Var.k())) {
                    dk2.u4 u4Var2 = ((mm2.o4) lVar.S0().a(mm2.o4.class)).Z;
                    if (u4Var2 != null && u4Var2.g()) {
                        z17 = true;
                    }
                    if (!z17) {
                        ml2.n4 n4Var = ml2.n4.A;
                        com.tencent.mars.xlog.Log.i("FinderLiveMicReportUtil", "reportLink21084 action: 24");
                        i95.m c17 = i95.n0.c(ml2.r0.class);
                        kotlin.jvm.internal.o.f(c17, "getService(...)");
                        ml2.r0.ik((ml2.r0) c17, n4Var, null, 0, 6, null);
                    }
                }
                ml2.n4 n4Var2 = ml2.n4.L;
                com.tencent.mars.xlog.Log.i("FinderLiveMicReportUtil", "reportLink21084 action: 35");
                i95.m c18 = i95.n0.c(ml2.r0.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                ml2.r0.ik((ml2.r0) c18, n4Var2, null, 0, 6, null);
            } else {
                dk2.u4 u4Var3 = ((mm2.o4) lVar.S0().a(mm2.o4.class)).Z;
                if (!(u4Var3 != null && u4Var3.k())) {
                    dk2.u4 u4Var4 = ((mm2.o4) lVar.S0().a(mm2.o4.class)).Z;
                    if (u4Var4 != null && u4Var4.g()) {
                        z17 = true;
                    }
                    if (!z17) {
                        i95.m c19 = i95.n0.c(ml2.r0.class);
                        kotlin.jvm.internal.o.f(c19, "getService(...)");
                        ml2.r0.ik((ml2.r0) c19, ml2.n4.f327740g, null, 0, 6, null);
                    }
                }
                ml2.n4 n4Var3 = ml2.n4.f327737J;
                com.tencent.mars.xlog.Log.i("FinderLiveMicReportUtil", "reportLink21084 action: 33");
                i95.m c27 = i95.n0.c(ml2.r0.class);
                kotlin.jvm.internal.o.f(c27, "getService(...)");
                ml2.r0.ik((ml2.r0) c27, n4Var3, null, 0, 6, null);
            }
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            fg2.a1 a1Var3 = this.f337409m;
            if (a1Var3 != null) {
                ((cy1.a) rVar).Cj("finder_live_apply_for_audio_event", a1Var3.f261937a, null, 25561);
            } else {
                kotlin.jvm.internal.o.o("viewBinding");
                throw null;
            }
        }
    }

    public final void z() {
        com.tencent.mars.xlog.Log.i("FinderLiveMicRequestPanelWidget", "SHEET_MORE_ACTION_VIDEO_LINK");
        com.tencent.mm.plugin.finder.live.plugin.l lVar = this.f337408i;
        boolean z17 = false;
        if (!((mm2.o4) lVar.P0(mm2.o4.class)).k7()) {
            com.tencent.mars.xlog.Log.i("FinderLiveMicRequestPanelWidget", "skip apply mic, disable mic");
            fg2.a1 a1Var = this.f337409m;
            if (a1Var == null) {
                kotlin.jvm.internal.o.o("viewBinding");
                throw null;
            }
            android.content.Context context = a1Var.f261937a.getContext();
            fg2.a1 a1Var2 = this.f337409m;
            if (a1Var2 != null) {
                db5.t7.makeText(context, a1Var2.f261937a.getContext().getResources().getString(com.tencent.mm.R.string.f491606dn2), 0).show();
                return;
            } else {
                kotlin.jvm.internal.o.o("viewBinding");
                throw null;
            }
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("PARAM_FINDER_LIVE_LINK_MIC_TYPE", 2);
        bundle.putInt("PARAM_FINDER_LIVE_LINK_MIC_SOURCE", this.f337411o);
        bundle.putInt("PARAM_FINDER_LIVE_LINK_MIC_POSITION", this.f337410n);
        hi2.b bVar = this.f337412p;
        if (bVar != null) {
            bundle.putByteArray("PARAM_FINDER_LIVE_LINK_MIC_BUFFER", bVar.f281506a);
            bundle.putBoolean("PARAM_FINDER_LIVE_LINK_MIC_CAN_AUTO_LINK", bVar.f281507b);
        }
        qo0.b bVar2 = qo0.b.F3;
        qo0.c cVar = this.f337407h;
        cVar.statusChange(bVar2, bundle);
        this.f337413q = true;
        a();
        if (cVar.getLiveRole() == 0) {
            if (this.f337411o == 2) {
                dk2.u4 u4Var = ((mm2.o4) lVar.S0().a(mm2.o4.class)).Z;
                if (!(u4Var != null && u4Var.k())) {
                    dk2.u4 u4Var2 = ((mm2.o4) lVar.S0().a(mm2.o4.class)).Z;
                    if (u4Var2 != null && u4Var2.g()) {
                        z17 = true;
                    }
                    if (!z17) {
                        ml2.n4 n4Var = ml2.n4.B;
                        com.tencent.mars.xlog.Log.i("FinderLiveMicReportUtil", "reportLink21084 action: 25");
                        i95.m c17 = i95.n0.c(ml2.r0.class);
                        kotlin.jvm.internal.o.f(c17, "getService(...)");
                        ml2.r0.ik((ml2.r0) c17, n4Var, null, 0, 6, null);
                    }
                }
                ml2.n4 n4Var2 = ml2.n4.K;
                com.tencent.mars.xlog.Log.i("FinderLiveMicReportUtil", "reportLink21084 action: 34");
                i95.m c18 = i95.n0.c(ml2.r0.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                ml2.r0.ik((ml2.r0) c18, n4Var2, null, 0, 6, null);
            } else {
                dk2.u4 u4Var3 = ((mm2.o4) lVar.S0().a(mm2.o4.class)).Z;
                if (!(u4Var3 != null && u4Var3.k())) {
                    dk2.u4 u4Var4 = ((mm2.o4) lVar.S0().a(mm2.o4.class)).Z;
                    if (u4Var4 != null && u4Var4.g()) {
                        z17 = true;
                    }
                    if (!z17) {
                        i95.m c19 = i95.n0.c(ml2.r0.class);
                        kotlin.jvm.internal.o.f(c19, "getService(...)");
                        ml2.r0.ik((ml2.r0) c19, ml2.n4.f327741h, null, 0, 6, null);
                    }
                }
                ml2.n4 n4Var3 = ml2.n4.I;
                com.tencent.mars.xlog.Log.i("FinderLiveMicReportUtil", "reportLink21084 action: 32");
                i95.m c27 = i95.n0.c(ml2.r0.class);
                kotlin.jvm.internal.o.f(c27, "getService(...)");
                ml2.r0.ik((ml2.r0) c27, n4Var3, null, 0, 6, null);
            }
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            fg2.a1 a1Var3 = this.f337409m;
            if (a1Var3 != null) {
                ((cy1.a) rVar).Cj("finder_live_apply_for_video_event", a1Var3.f261937a, null, 25561);
            } else {
                kotlin.jvm.internal.o.o("viewBinding");
                throw null;
            }
        }
    }
}
