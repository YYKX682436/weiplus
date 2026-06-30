package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class jf0 extends com.tencent.mm.plugin.finder.live.plugin.l implements com.tencent.mm.plugin.finder.live.plugin.oo0 {
    public final android.widget.TextView A;
    public final android.widget.ImageView B;
    public final android.view.View C;
    public final android.widget.ImageView D;
    public final com.tencent.mm.plugin.finder.live.view.FinderLiveAfterPluginRecommendLiveView E;
    public final android.view.View F;
    public final com.tencent.mm.plugin.finder.live.widget.h4 G;
    public final com.tencent.mm.plugin.finder.live.widget.ut H;
    public final com.tencent.mm.plugin.finder.live.widget.b4 I;

    /* renamed from: J, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.widget.q4 f113089J;
    public boolean K;
    public boolean L;
    public final android.view.ViewGroup M;
    public final android.widget.ProgressBar N;
    public boolean P;

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f113090p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.ui.base.RequestDisallowScrollView f113091q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.TextView f113092r;

    /* renamed from: s, reason: collision with root package name */
    public final android.widget.TextView f113093s;

    /* renamed from: t, reason: collision with root package name */
    public final android.widget.ImageView f113094t;

    /* renamed from: u, reason: collision with root package name */
    public final android.widget.TextView f113095u;

    /* renamed from: v, reason: collision with root package name */
    public final android.view.View f113096v;

    /* renamed from: w, reason: collision with root package name */
    public final android.widget.TextView f113097w;

    /* renamed from: x, reason: collision with root package name */
    public final android.widget.RelativeLayout f113098x;

    /* renamed from: y, reason: collision with root package name */
    public final android.widget.LinearLayout f113099y;

    /* renamed from: z, reason: collision with root package name */
    public final android.widget.TextView f113100z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jf0(android.view.ViewGroup root, qo0.c statueMonitor, r45.qt2 qt2Var) {
        super(root, statueMonitor, qt2Var);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statueMonitor, "statueMonitor");
        this.f113090p = statueMonitor;
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.j8n);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f113091q = (com.tencent.mm.ui.base.RequestDisallowScrollView) findViewById;
        android.view.View findViewById2 = root.findViewById(com.tencent.mm.R.id.j8j);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.view.View findViewById3 = root.findViewById(com.tencent.mm.R.id.obc);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById3;
        this.f113092r = textView;
        android.view.View findViewById4 = root.findViewById(com.tencent.mm.R.id.f484050cu2);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f113093s = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = root.findViewById(com.tencent.mm.R.id.f482986tm);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById5;
        this.f113094t = imageView;
        android.view.View findViewById6 = root.findViewById(com.tencent.mm.R.id.f483021ui);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById6;
        this.f113095u = textView2;
        android.view.View findViewById7 = root.findViewById(com.tencent.mm.R.id.p3r);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f113096v = findViewById7;
        android.view.View findViewById8 = root.findViewById(com.tencent.mm.R.id.p3t);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        android.widget.TextView textView3 = (android.widget.TextView) findViewById8;
        this.f113097w = textView3;
        android.view.View findViewById9 = root.findViewById(com.tencent.mm.R.id.i66);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) findViewById9;
        this.f113098x = relativeLayout;
        android.view.View findViewById10 = root.findViewById(com.tencent.mm.R.id.f483001ty);
        kotlin.jvm.internal.o.f(findViewById10, "findViewById(...)");
        this.f113099y = (android.widget.LinearLayout) findViewById10;
        android.view.View findViewById11 = root.findViewById(com.tencent.mm.R.id.f482999tw);
        kotlin.jvm.internal.o.f(findViewById11, "findViewById(...)");
        this.f113100z = (android.widget.TextView) findViewById11;
        android.view.View findViewById12 = root.findViewById(com.tencent.mm.R.id.f483000tx);
        kotlin.jvm.internal.o.f(findViewById12, "findViewById(...)");
        this.A = (android.widget.TextView) findViewById12;
        android.view.View findViewById13 = root.findViewById(com.tencent.mm.R.id.f482985tl);
        kotlin.jvm.internal.o.f(findViewById13, "findViewById(...)");
        this.B = (android.widget.ImageView) findViewById13;
        android.view.View findViewById14 = root.findViewById(com.tencent.mm.R.id.aac);
        kotlin.jvm.internal.o.f(findViewById14, "findViewById(...)");
        android.view.View findViewById15 = root.findViewById(com.tencent.mm.R.id.aaa);
        kotlin.jvm.internal.o.f(findViewById15, "findViewById(...)");
        this.C = findViewById15;
        android.view.View findViewById16 = root.findViewById(com.tencent.mm.R.id.fus);
        kotlin.jvm.internal.o.f(findViewById16, "findViewById(...)");
        android.view.View findViewById17 = root.findViewById(com.tencent.mm.R.id.f485570i64);
        kotlin.jvm.internal.o.f(findViewById17, "findViewById(...)");
        this.D = (android.widget.ImageView) findViewById17;
        android.view.View findViewById18 = root.findViewById(com.tencent.mm.R.id.mww);
        kotlin.jvm.internal.o.f(findViewById18, "findViewById(...)");
        this.E = (com.tencent.mm.plugin.finder.live.view.FinderLiveAfterPluginRecommendLiveView) findViewById18;
        android.view.View findViewById19 = root.findViewById(com.tencent.mm.R.id.f486561lo5);
        kotlin.jvm.internal.o.f(findViewById19, "findViewById(...)");
        android.view.View findViewById20 = root.findViewById(com.tencent.mm.R.id.loc);
        kotlin.jvm.internal.o.f(findViewById20, "findViewById(...)");
        android.view.View findViewById21 = root.findViewById(com.tencent.mm.R.id.exw);
        kotlin.jvm.internal.o.f(findViewById21, "findViewById(...)");
        this.F = findViewById21;
        this.G = new com.tencent.mm.plugin.finder.live.widget.h4((android.view.ViewGroup) findViewById19, this);
        this.H = new com.tencent.mm.plugin.finder.live.widget.ut((com.tencent.mm.plugin.finder.live.view.FinderLiveAfterRecommendPanelView) findViewById20, this);
        this.I = new com.tencent.mm.plugin.finder.live.widget.b4((android.view.ViewGroup) findViewById16, this);
        this.f113089J = new com.tencent.mm.plugin.finder.live.widget.q4(findViewById21, this);
        this.K = true;
        android.view.View findViewById22 = root.findViewById(com.tencent.mm.R.id.auu);
        kotlin.jvm.internal.o.f(findViewById22, "findViewById(...)");
        this.M = (android.view.ViewGroup) findViewById22;
        android.view.View findViewById23 = root.findViewById(com.tencent.mm.R.id.ilt);
        kotlin.jvm.internal.o.f(findViewById23, "findViewById(...)");
        android.widget.ProgressBar progressBar = (android.widget.ProgressBar) findViewById23;
        this.N = progressBar;
        textView3.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.me0(this));
        imageView.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.ne0(this));
        imageView.setContentDescription(root.getContext().getString(com.tencent.mm.R.string.ka9));
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        com.tencent.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
        relativeLayout.setVisibility(8);
        progressBar.setVisibility(8);
        ((android.widget.ImageView) findViewById14).setImageDrawable(com.tencent.mm.ui.uk.e(root.getContext(), com.tencent.mm.R.raw.icons_filled_back, -1));
        findViewById15.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.oe0(this));
        root.setTranslationX(com.tencent.mm.ui.bl.b(root.getContext()).x);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object t1(com.tencent.mm.plugin.finder.live.plugin.jf0 r19, kotlin.coroutines.Continuation r20) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.jf0.t1(com.tencent.mm.plugin.finder.live.plugin.jf0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object u1(com.tencent.mm.plugin.finder.live.plugin.jf0 r18, kotlin.coroutines.Continuation r19) {
        /*
            Method dump skipped, instructions count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.jf0.u1(com.tencent.mm.plugin.finder.live.plugin.jf0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return false;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.oo0
    public kotlinx.coroutines.f1 H(oz5.l context, kotlinx.coroutines.a1 start, yz5.p block) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(start, "start");
        kotlin.jvm.internal.o.g(block, "block");
        return com.tencent.mm.plugin.finder.live.util.y.g(this, context, start, block);
    }

    @Override // qo0.a
    public void I0() {
        c50.m0 m0Var = this.E.f115795u;
        if (m0Var != null) {
            com.tencent.mm.plugin.finder.live.view.u0 u0Var = com.tencent.mm.plugin.finder.live.view.u0.f116703d;
            gp2.l0 l0Var = (gp2.l0) m0Var;
            l0Var.m();
            l0Var.M(u0Var);
        }
        com.tencent.mm.plugin.finder.live.widget.b4 b4Var = this.I;
        c50.m0 m0Var2 = b4Var.f117826g;
        if (m0Var2 != null) {
            com.tencent.mm.plugin.finder.live.widget.n3 n3Var = new com.tencent.mm.plugin.finder.live.widget.n3(b4Var);
            gp2.l0 l0Var2 = (gp2.l0) m0Var2;
            l0Var2.m();
            l0Var2.M(n3Var);
        }
        this.f113089J.d();
        if (w0() == 0) {
            ml2.b1.a(ml2.b1.f327211a, java.lang.String.valueOf(hashCode()), null, 2, null);
        }
    }

    @Override // qo0.a
    public void J0() {
        com.tencent.mm.plugin.finder.live.view.EasySimpleLivingCardView easySimpleLivingCardView;
        if (this.f365323d.getVisibility() == 0) {
            com.tencent.mm.plugin.finder.live.view.FinderLiveAfterPluginRecommendLiveView finderLiveAfterPluginRecommendLiveView = this.E;
            finderLiveAfterPluginRecommendLiveView.getClass();
            finderLiveAfterPluginRecommendLiveView.post(new com.tencent.mm.plugin.finder.live.view.v0(finderLiveAfterPluginRecommendLiveView));
            com.tencent.mm.plugin.finder.live.widget.b4 b4Var = this.I;
            android.view.View view = b4Var.f117824e;
            if (view.isShown() && (easySimpleLivingCardView = (com.tencent.mm.plugin.finder.live.view.EasySimpleLivingCardView) view.findViewById(com.tencent.mm.R.id.ryi)) != null) {
                easySimpleLivingCardView.post(new com.tencent.mm.plugin.finder.live.widget.q3(b4Var.f117827h, easySimpleLivingCardView, b4Var));
            }
            this.f113089J.g();
            ((ml2.r0) i95.n0.c(ml2.r0.class)).Jj(java.lang.String.valueOf(hashCode()), ((mm2.e1) P0(mm2.e1.class)).f328988r.getLong(0));
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void K0(int i17) {
        super.K0(i17);
        android.view.ViewGroup viewGroup = this.f365323d;
        android.view.View findViewById = viewGroup.findViewById(com.tencent.mm.R.id.mwd);
        if (findViewById != null) {
            findViewById.setOnClickListener(null);
            findViewById.setClickable(false);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorAfterPlugin", "hideSidebarMask", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorAfterPlugin", "hideSidebarMask", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (viewGroup.getVisibility() == 0) {
            android.content.Context context = viewGroup.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            if (((pl2.x) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(pl2.x.class)).f356683f) {
                com.tencent.mars.xlog.Log.i("FinderLiveVisitorAfterPlugin", "show after maskview");
                android.view.View findViewById2 = viewGroup.findViewById(com.tencent.mm.R.id.mwd);
                if (findViewById2 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorAfterPlugin", "showSidebarMask", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorAfterPlugin", "showSidebarMask", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.ze0(this, findViewById2));
                    return;
                }
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("FinderLiveVisitorAfterPlugin", "hide after maskview");
    }

    @Override // qo0.a
    public void N0() {
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void O0() {
        com.tencent.mm.plugin.finder.live.view.FinderLiveAfterPluginRecommendLiveView finderLiveAfterPluginRecommendLiveView = this.E;
        c50.m0 m0Var = finderLiveAfterPluginRecommendLiveView.f115795u;
        if (m0Var != null) {
            ((gp2.l0) m0Var).o();
        }
        finderLiveAfterPluginRecommendLiveView.f115795u = null;
        com.tencent.mm.plugin.finder.live.widget.q4 q4Var = this.f113089J;
        q4Var.f();
        q4Var.f119493j = null;
        if (this.L) {
            ml2.b1.a(ml2.b1.f327211a, java.lang.String.valueOf(hashCode()), null, 2, null);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.oo0
    public so2.v2 Y() {
        so2.v2 v2Var = new so2.v2();
        v2Var.a(S0(), null, null, null);
        return v2Var;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.oo0
    public kotlinx.coroutines.r2 d0(oz5.l context, kotlinx.coroutines.a1 start, yz5.p block) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(start, "start");
        kotlin.jvm.internal.o.g(block, "block");
        return com.tencent.mm.plugin.finder.live.util.y.j(this, context, start, block);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return false;
    }

    public final void v1(java.lang.String str, int i17, com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo) {
        boolean z17 = Y().f410654i;
        android.widget.TextView textView = this.f113097w;
        android.view.ViewGroup viewGroup = this.f365323d;
        if (z17) {
            textView.setText(viewGroup.getContext().getString(com.tencent.mm.R.string.e2a, Y().f410656k));
        } else {
            textView.setText(viewGroup.getContext().getString(com.tencent.mm.R.string.ehi));
        }
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        android.widget.LinearLayout linearLayout = this.f113099y;
        if ((!K0 || i17 > 0) && !Y().f410654i) {
            com.tencent.mars.xlog.Log.i("FinderLiveVisitorAfterPlugin", "authProfession:" + str + ", friendFollowCount:" + i17);
            linearLayout.setVisibility(0);
            boolean K02 = com.tencent.mm.sdk.platformtools.t8.K0(str);
            android.widget.TextView textView2 = this.f113100z;
            if (K02) {
                textView2.setVisibility(8);
            } else {
                java.lang.String string = viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.cq9, str);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                textView2.setText(string);
                textView2.setVisibility(0);
            }
            android.widget.TextView textView3 = this.A;
            if (i17 > 0) {
                java.lang.String string2 = viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.f491394cy4, com.tencent.mm.plugin.finder.assist.w2.o(i17, false));
                kotlin.jvm.internal.o.f(string2, "getString(...)");
                textView3.setText(string2);
                textView3.setVisibility(0);
            } else {
                textView3.setVisibility(8);
            }
        } else {
            linearLayout.setVisibility(8);
        }
        if (finderAuthInfo != null) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.m1.f460511a.c(this.B, finderAuthInfo, 0);
        }
    }

    public final void w1(r45.fa2 fa2Var, float f17) {
        com.tencent.mm.plugin.finder.live.view.FinderLiveAfterPluginRecommendLiveView finderLiveAfterPluginRecommendLiveView = this.E;
        if (finderLiveAfterPluginRecommendLiveView.getVisibility() == 0) {
            return;
        }
        finderLiveAfterPluginRecommendLiveView.setReportObj(this.f113326h);
        if (fa2Var == null) {
            finderLiveAfterPluginRecommendLiveView.setVisibility(8);
        } else {
            finderLiveAfterPluginRecommendLiveView.setVisibility(0);
            finderLiveAfterPluginRecommendLiveView.b(fa2Var, Y(), f17);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
    
        if (r0 == null) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x1(java.lang.String r16, java.lang.String r17, kotlin.coroutines.Continuation r18) {
        /*
            Method dump skipped, instructions count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.jf0.x1(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void y1() {
        java.lang.String str;
        boolean z17 = Y().f410654i;
        android.view.ViewGroup viewGroup = this.f365323d;
        if (z17) {
            str = Y().f410655j;
            zl2.q4 q4Var = zl2.q4.f473933a;
            java.lang.String str2 = Y().f410646a;
            android.content.Context context = viewGroup.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            q4Var.G(str, str2, context, Y().f410658m, java.lang.String.valueOf(Y().f410659n.getLong(0)), 3);
        } else {
            str = Y().f410646a;
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("finder_username", str);
            intent.putExtra("key_enter_profile_type", 11);
            android.content.Context context2 = viewGroup.getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((com.tencent.mm.plugin.finder.live.viewmodel.aa) ((zy2.v9) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).c(zy2.v9.class))).R6(intent);
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.e1 e1Var = ya2.e1.f460472a;
            android.content.Context context3 = viewGroup.getContext();
            kotlin.jvm.internal.o.f(context3, "getContext(...)");
            e1Var.w(context3, intent);
        }
        ((ml2.r0) i95.n0.c(ml2.r0.class)).ok(str);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void z0() {
        this.E.a();
        this.f113091q.setOnScrollChangeListener(new com.tencent.mm.plugin.finder.live.plugin.te0(this));
    }
}
