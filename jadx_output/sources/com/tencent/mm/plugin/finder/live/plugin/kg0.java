package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class kg0 extends com.tencent.mm.plugin.finder.live.plugin.l implements android.view.View.OnClickListener {
    public final android.widget.TextView A;
    public final android.widget.TextView B;
    public final wm2.n C;
    public int D;
    public final java.util.Map E;
    public yz5.a F;

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f113230p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f113231q;

    /* renamed from: r, reason: collision with root package name */
    public final android.view.View f113232r;

    /* renamed from: s, reason: collision with root package name */
    public final android.widget.LinearLayout f113233s;

    /* renamed from: t, reason: collision with root package name */
    public final android.widget.RelativeLayout f113234t;

    /* renamed from: u, reason: collision with root package name */
    public final android.widget.RelativeLayout f113235u;

    /* renamed from: v, reason: collision with root package name */
    public final android.widget.TextView f113236v;

    /* renamed from: w, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f113237w;

    /* renamed from: x, reason: collision with root package name */
    public final android.widget.RelativeLayout f113238x;

    /* renamed from: y, reason: collision with root package name */
    public final android.view.View f113239y;

    /* renamed from: z, reason: collision with root package name */
    public final android.view.View f113240z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kg0(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f113230p = statusMonitor;
        this.f113231q = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.bg0(root, this));
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.agx);
        this.f113232r = findViewById;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) root.findViewById(com.tencent.mm.R.id.eso);
        this.f113233s = linearLayout;
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) root.findViewById(com.tencent.mm.R.id.eta);
        this.f113234t = relativeLayout;
        android.widget.RelativeLayout relativeLayout2 = (android.widget.RelativeLayout) root.findViewById(com.tencent.mm.R.id.f484586et5);
        this.f113235u = relativeLayout2;
        this.f113236v = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.et7);
        this.f113237w = (com.tencent.mm.ui.widget.imageview.WeImageView) root.findViewById(com.tencent.mm.R.id.et6);
        android.widget.RelativeLayout relativeLayout3 = (android.widget.RelativeLayout) root.findViewById(com.tencent.mm.R.id.esq);
        this.f113238x = relativeLayout3;
        androidx.constraintlayout.widget.ConstraintLayout beautyPowerfulPanel = (androidx.constraintlayout.widget.ConstraintLayout) root.findViewById(com.tencent.mm.R.id.tgi);
        android.view.View findViewById2 = root.findViewById(com.tencent.mm.R.id.f484575er3);
        this.f113239y = findViewById2;
        this.f113240z = root.findViewById(com.tencent.mm.R.id.rmb);
        this.A = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.eto);
        this.B = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.etn);
        this.E = new java.util.LinkedHashMap();
        if (!x0()) {
            int c17 = com.tencent.mm.ui.bl.c(root.getContext());
            linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), linearLayout.getPaddingRight(), linearLayout.getPaddingBottom() + c17);
            beautyPowerfulPanel.setPadding(beautyPowerfulPanel.getPaddingLeft(), beautyPowerfulPanel.getPaddingTop(), beautyPowerfulPanel.getPaddingRight(), beautyPowerfulPanel.getPaddingBottom() + c17);
        }
        linearLayout.setTranslationY(com.tencent.mm.ui.bl.b(root.getContext()).y);
        kotlin.jvm.internal.o.f(beautyPowerfulPanel, "beautyPowerfulPanel");
        this.C = new wm2.n(beautyPowerfulPanel);
        relativeLayout.setOnClickListener(this);
        relativeLayout2.setOnClickListener(this);
        relativeLayout3.setOnClickListener(this);
        root.setOnClickListener(this);
        findViewById2.setOnClickListener(this);
        findViewById.setOnClickListener(this);
        K0(8);
    }

    public static final void t1(com.tencent.mm.plugin.finder.live.plugin.kg0 kg0Var, android.view.View view, ml2.u1 u1Var) {
        kg0Var.getClass();
        if (view.getVisibility() == 0) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.I8((zy2.zb) c17, u1Var, kg0Var.E, null, null, null, null, false, 124, null);
        }
    }

    public static final void u1(com.tencent.mm.plugin.finder.live.plugin.kg0 kg0Var, boolean z17) {
        if (z17) {
            kg0Var.getClass();
            qo0.c.a(kg0Var.f113230p, qo0.b.f365394o4, null, 2, null);
            return;
        }
        android.content.Context context = kg0Var.f365323d.getContext();
        com.tencent.mm.ui.MMActivity mMActivity = context instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context : null;
        if (mMActivity != null) {
            pf5.z zVar = pf5.z.f353948a;
            com.tencent.mm.plugin.finder.live.viewmodel.b8 b8Var = (com.tencent.mm.plugin.finder.live.viewmodel.b8) zVar.a(mMActivity).a(com.tencent.mm.plugin.finder.live.viewmodel.b8.class);
            com.tencent.mm.plugin.finder.live.viewmodel.d6 d6Var = com.tencent.mm.plugin.finder.live.viewmodel.d6.f117035e;
            b8Var.getClass();
            b8Var.f116946q = d6Var;
            ((com.tencent.mm.plugin.finder.live.viewmodel.b8) zVar.a(mMActivity).a(com.tencent.mm.plugin.finder.live.viewmodel.b8.class)).S6();
        }
    }

    @Override // qo0.a
    public void A0(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel captureDataManager$CaptureVideoNormalModel;
        java.lang.String str;
        java.lang.String str2;
        if (i17 != 20010 || intent == null || (captureDataManager$CaptureVideoNormalModel = (com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel) intent.getParcelableExtra("KSEGMENTMEDIAINFO")) == null) {
            return;
        }
        java.lang.Boolean bool = captureDataManager$CaptureVideoNormalModel.f155664h;
        kotlin.jvm.internal.o.f(bool, "getPhoto(...)");
        if (bool.booleanValue()) {
            str2 = captureDataManager$CaptureVideoNormalModel.f155662f;
            kotlin.jvm.internal.o.f(str2, "getThumbPath(...)");
            str = "";
        } else {
            str = captureDataManager$CaptureVideoNormalModel.f155661e;
            kotlin.jvm.internal.o.f(str, "getVideoPath(...)");
            str2 = captureDataManager$CaptureVideoNormalModel.f155662f;
            kotlin.jvm.internal.o.f(str2, "getThumbPath(...)");
        }
        r45.ba4 ba4Var = new r45.ba4();
        kotlin.jvm.internal.o.f(bool, "getPhoto(...)");
        int i19 = 0;
        if (bool.booleanValue()) {
            ba4Var.set(0, str2);
        } else {
            ba4Var.set(0, null);
            r45.gg0 gg0Var = new r45.gg0();
            gg0Var.set(0, str);
            i19 = 1;
            gg0Var.set(1, str2);
            ba4Var.set(1, gg0Var);
        }
        ba4Var.set(2, java.lang.Integer.valueOf(i19));
        zl2.r4 r4Var = zl2.r4.f473950a;
        android.content.Context context = this.f365323d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        r4Var.r3(context, S0(), ba4Var);
    }

    @Override // qo0.a
    public boolean B0() {
        int i17 = this.D;
        if (i17 == 0) {
            return false;
        }
        if (i17 == 1) {
            w1(false);
        } else {
            if (i17 != 3) {
                return false;
            }
            wm2.n nVar = this.C;
            if (((java.util.ArrayList) nVar.f447257g).size() > 1) {
                nVar.f447258h.a();
            } else {
                nVar.a(true, false);
            }
        }
        return true;
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
        if (ordinal != 138) {
            if (ordinal != 139) {
                return;
            }
            w1(false);
            return;
        }
        boolean z17 = bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_CAMERA_FROM_KTV", false) : false;
        android.view.View view = this.f113240z;
        android.widget.TextView textView = this.B;
        android.widget.TextView textView2 = this.A;
        if (z17) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorCameraOptPanelPlugin", "changeUIIfFromKtv", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorCameraOptPanelPlugin", "changeUIIfFromKtv", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.cg0(this));
            android.view.View view2 = this.f113239y;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorCameraOptPanelPlugin", "changeUIIfFromKtv", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorCameraOptPanelPlugin", "changeUIIfFromKtv", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView2.setText(textView2.getContext().getString(com.tencent.mm.R.string.mj7));
            textView.setText(textView2.getContext().getString(com.tencent.mm.R.string.mj6));
        } else {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorCameraOptPanelPlugin", "changeUIIfFromKtv", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorCameraOptPanelPlugin", "changeUIIfFromKtv", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setOnClickListener(null);
            android.view.View view3 = this.f113239y;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorCameraOptPanelPlugin", "changeUIIfFromKtv", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorCameraOptPanelPlugin", "changeUIIfFromKtv", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView2.setText(textView2.getContext().getString(com.tencent.mm.R.string.ehm));
            textView.setText(textView2.getContext().getString(com.tencent.mm.R.string.ehl));
        }
        pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.jg0(this));
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f328801f2 != 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        kn0.f fVar;
        kn0.f fVar2;
        kn0.f fVar3;
        kn0.f fVar4;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorCameraOptPanelPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        wm2.n nVar = this.C;
        boolean z17 = false;
        if (valueOf == null || valueOf.intValue() != com.tencent.mm.R.id.agx) {
            java.util.Map map = this.E;
            if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.eta) {
                i95.m c17 = i95.n0.c(ml2.j0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                zy2.zb.T8((zy2.zb) c17, ml2.t1.X, map, null, null, null, null, false, 124, null);
                kn0.i iVar = ((mm2.e1) P0(mm2.e1.class)).f328990t;
                kn0.f fVar5 = iVar != null ? iVar.f309560d : null;
                if (fVar5 != null) {
                    kn0.i iVar2 = ((mm2.e1) P0(mm2.e1.class)).f328990t;
                    fVar5.f309530b = !((iVar2 == null || (fVar4 = iVar2.f309560d) == null) ? true : fVar4.f309530b);
                }
                qo0.b bVar = qo0.b.f365402q;
                android.os.Bundle bundle = new android.os.Bundle();
                qo0.c cVar = this.f113230p;
                cVar.statusChange(bVar, bundle);
                v1();
                if (cVar.getLiveRole() == 1) {
                    ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
                    ml2.j0.f327583i.T.f327668o++;
                    int i17 = vn0.b.f438174a.b().f455410a == 0 ? 2 : 1;
                    i95.m c18 = i95.n0.c(ml2.j0.class);
                    kotlin.jvm.internal.o.f(c18, "getService(...)");
                    zy2.zb.y6((zy2.zb) c18, ml2.z4.f328350f, java.lang.String.valueOf(i17), null, 4, null);
                }
            } else {
                android.view.ViewGroup viewGroup = this.f365323d;
                if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.f484586et5) {
                    i95.m c19 = i95.n0.c(ml2.j0.class);
                    kotlin.jvm.internal.o.f(c19, "getService(...)");
                    zy2.zb.T8((zy2.zb) c19, ml2.t1.W, map, null, null, null, null, false, 124, null);
                    kn0.i iVar3 = ((mm2.e1) P0(mm2.e1.class)).f328990t;
                    if (((iVar3 == null || (fVar3 = iVar3.f309560d) == null || !fVar3.f309530b) ? false : true) == true) {
                        kn0.i iVar4 = ((mm2.e1) P0(mm2.e1.class)).f328990t;
                        if (iVar4 != null && (fVar2 = iVar4.f309560d) != null && fVar2.f309533e) {
                            z17 = true;
                        }
                        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f113237w;
                        if (z17) {
                            weImageView.animate().rotationY(180.0f).setDuration(200L).start();
                        } else {
                            weImageView.animate().rotationY(0.0f).setDuration(200L).start();
                        }
                        kn0.i iVar5 = ((mm2.e1) P0(mm2.e1.class)).f328990t;
                        kn0.f fVar6 = iVar5 != null ? iVar5.f309560d : null;
                        if (fVar6 != null) {
                            kn0.i iVar6 = ((mm2.e1) P0(mm2.e1.class)).f328990t;
                            fVar6.f309533e = !((iVar6 == null || (fVar = iVar6.f309560d) == null) ? true : fVar.f309533e);
                        }
                        tn0.w0 w0Var = dk2.ef.f233378d;
                        hn0.f fVar7 = w0Var != null ? w0Var.f420773t : null;
                        if (fVar7 != null) {
                            ((hn0.p) fVar7).j(dk2.ef.f233372a.G());
                        }
                        i95.m c27 = i95.n0.c(ml2.j0.class);
                        kotlin.jvm.internal.o.f(c27, "getService(...)");
                        zy2.zb.y6((zy2.zb) c27, ml2.z4.f328384w, "", null, 4, null);
                    } else {
                        com.tencent.mars.xlog.Log.i("Finder.FinderLiveAnchorCameraOptPanelPlugin", "clickMirror while using front camera, skip!");
                        db5.t7.makeText(viewGroup.getContext(), viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.dwh), 0).show();
                    }
                } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.esq) {
                    if (!((mm2.c1) P0(mm2.c1.class)).N3) {
                        db5.t7.makeText(viewGroup.getContext(), viewGroup.getContext().getString(com.tencent.mm.R.string.egp), 0).show();
                    } else if (ko0.l.f309870a.c()) {
                        i95.m c28 = i95.n0.c(ml2.j0.class);
                        kotlin.jvm.internal.o.f(c28, "getService(...)");
                        zy2.zb.T8((zy2.zb) c28, ml2.t1.V, map, null, null, null, null, false, 124, null);
                        this.D = 3;
                        this.f113233s.animate().translationY(com.tencent.mm.ui.bl.b(viewGroup.getContext()).y).setDuration(100L).setListener(new com.tencent.mm.plugin.finder.live.plugin.eg0(this)).start();
                    } else {
                        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(viewGroup.getContext());
                        u1Var.g(viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.mi9));
                        java.lang.String string = viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.d3z);
                        kotlin.jvm.internal.o.f(string, "getString(...)");
                        u1Var.a(false);
                        u1Var.n(string);
                        u1Var.q(false);
                    }
                } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.etb) {
                    w1(false);
                    if (gm0.j1.u().l()) {
                        zl2.r4 r4Var = zl2.r4.f473950a;
                        android.content.Context context = viewGroup.getContext();
                        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                        r4Var.i1((com.tencent.mm.ui.MMActivity) context, 20010);
                    } else {
                        db5.t7.l(viewGroup.getContext());
                    }
                } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.etf) {
                    if (this.D == 3) {
                        nVar.a(true, false);
                    } else {
                        w1(false);
                    }
                } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.f484575er3) {
                    w1(false);
                }
            }
        } else if (this.D == 3) {
            nVar.a(true, false);
        } else {
            w1(false);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorCameraOptPanelPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return false;
    }

    public final void v1() {
        kn0.f fVar;
        kn0.i iVar = ((mm2.e1) P0(mm2.e1.class)).f328990t;
        boolean z17 = false;
        if (iVar != null && (fVar = iVar.f309560d) != null && fVar.f309530b) {
            z17 = true;
        }
        android.widget.TextView textView = this.f113236v;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f113237w;
        android.view.ViewGroup viewGroup = this.f365323d;
        if (z17) {
            weImageView.setIconColor(viewGroup.getContext().getResources().getColor(com.tencent.mm.R.color.FG_0));
            textView.setTextColor(viewGroup.getContext().getResources().getColor(com.tencent.mm.R.color.FG_1));
        } else {
            weImageView.setIconColor(viewGroup.getContext().getResources().getColor(com.tencent.mm.R.color.FG_2));
            textView.setTextColor(viewGroup.getContext().getResources().getColor(com.tencent.mm.R.color.FG_2));
        }
    }

    public final void w1(boolean z17) {
        pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.hg0(this, z17));
    }
}
