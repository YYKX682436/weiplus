package com.tencent.mm.plugin.fts.ui;

@db5.a(19)
/* loaded from: classes12.dex */
public abstract class FTSBaseVoiceSearchUI extends com.tencent.mm.plugin.secdata.ui.MMSecDataActivity implements com.tencent.mm.ui.tools.b9, com.tencent.mm.plugin.fts.ui.w0, com.tencent.mm.plugin.fts.ui.d0, com.tencent.mm.ui.tools.c5 {
    public static final /* synthetic */ int E1 = 0;
    public android.view.View A;
    public final boolean A1;
    public android.view.View B;
    public java.lang.String B1;
    public android.view.View C;
    public boolean C1;
    public int D;
    public final com.tencent.mm.sdk.platformtools.n3 D1;
    public int E;
    public k23.v0 I;
    public z21.e S;
    public final boolean V;
    public final com.tencent.mm.plugin.fts.ui.widget.i0 W;
    public final com.tencent.mm.sdk.platformtools.n3 X;
    public java.lang.String Y;
    public com.tencent.mm.plugin.fts.ui.n1 Z;

    /* renamed from: d, reason: collision with root package name */
    public boolean f137913d;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.tools.f5 f137915f;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f137917h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f137918i;

    /* renamed from: l1, reason: collision with root package name */
    public android.widget.ListView f137919l1;

    /* renamed from: m, reason: collision with root package name */
    public db5.d5 f137920m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f137921n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.transvoice.ui.SoundWaveView f137922o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f137923p;

    /* renamed from: p0, reason: collision with root package name */
    public com.tencent.mm.plugin.fts.ui.n1 f137924p0;

    /* renamed from: p1, reason: collision with root package name */
    public com.tencent.mm.plugin.fts.ui.f0 f137925p1;

    /* renamed from: q, reason: collision with root package name */
    public android.view.ViewGroup f137926q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.ViewGroup f137927r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f137928s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f137929t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f137930u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f137931v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f137932w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f137933x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f137934x0;

    /* renamed from: x1, reason: collision with root package name */
    public boolean f137935x1;

    /* renamed from: y, reason: collision with root package name */
    public android.view.ViewGroup f137936y;

    /* renamed from: y0, reason: collision with root package name */
    public com.tencent.mm.plugin.fts.ui.widget.m1 f137937y0;

    /* renamed from: y1, reason: collision with root package name */
    public final android.animation.ValueAnimator.AnimatorUpdateListener f137938y1;

    /* renamed from: z, reason: collision with root package name */
    public android.view.View f137939z;

    /* renamed from: z1, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f137940z1;

    /* renamed from: e, reason: collision with root package name */
    public android.animation.ObjectAnimator f137914e = null;

    /* renamed from: g, reason: collision with root package name */
    public int f137916g = 0;
    public final int F = com.tencent.mm.ui.zk.a(getContext(), 0);
    public final int G = com.tencent.mm.ui.zk.a(getContext(), 25);
    public boolean H = false;

    /* renamed from: J, reason: collision with root package name */
    public android.widget.FrameLayout f137912J = null;
    public android.widget.FrameLayout K = null;
    public boolean L = false;
    public final android.animation.ValueAnimator M = android.animation.ValueAnimator.ofInt(250, com.tencent.tavkit.component.TAVPlayer.VIDEO_PLAYER_HEIGHT).setDuration(200L);
    public final android.animation.ValueAnimator N = android.animation.ValueAnimator.ofInt(40, 800).setDuration(200L);
    public final android.animation.ValueAnimator P = android.animation.ValueAnimator.ofInt(72, 0).setDuration(200L);
    public final android.animation.ValueAnimator Q = android.animation.ValueAnimator.ofInt(22, 0).setDuration(200L);
    public final android.animation.ValueAnimator R = android.animation.ValueAnimator.ofInt(8, 0).setDuration(200L);
    public boolean T = true;
    public boolean U = false;

    public FTSBaseVoiceSearchUI() {
        this.V = j62.e.g().c(new com.tencent.mm.repairer.config.search.RepairerConfigNativeGlobalSearchTeach()) == 1;
        this.W = new com.tencent.mm.plugin.fts.ui.widget.i0(this);
        this.X = new com.tencent.mm.plugin.fts.ui.e1(this);
        this.Y = "";
        com.tencent.mm.plugin.fts.ui.n1 n1Var = com.tencent.mm.plugin.fts.ui.n1.MODE_INIT;
        this.Z = n1Var;
        this.f137924p0 = n1Var;
        this.f137934x0 = false;
        this.f137935x1 = false;
        this.f137938y1 = new com.tencent.mm.plugin.fts.ui.j1(this);
        this.f137940z1 = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.plugin.fts.ui.a1(this), true);
        this.A1 = true;
        this.D1 = new com.tencent.mm.plugin.fts.ui.b1(this);
    }

    public static void U6(com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI fTSBaseVoiceSearchUI) {
        if (fTSBaseVoiceSearchUI.Y.length() > 0) {
            fTSBaseVoiceSearchUI.Y = fTSBaseVoiceSearchUI.Y.replaceAll("。", " ").replaceAll("\\.", " ").replaceAll("，", " ").replaceAll(",", " ").trim();
        }
    }

    public static void V6(com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI fTSBaseVoiceSearchUI) {
        com.tencent.mm.plugin.fts.ui.n1 n1Var = fTSBaseVoiceSearchUI.f137924p0;
        if (n1Var != fTSBaseVoiceSearchUI.Z) {
            int ordinal = n1Var.ordinal();
            if (ordinal == 1) {
                fTSBaseVoiceSearchUI.c7();
            } else if (ordinal == 2) {
                fTSBaseVoiceSearchUI.e7();
            } else if (ordinal == 3) {
                fTSBaseVoiceSearchUI.d7();
            }
            int ordinal2 = fTSBaseVoiceSearchUI.Z.ordinal();
            if (ordinal2 == 1) {
                android.view.View view = fTSBaseVoiceSearchUI.f137930u;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/FTSBaseVoiceSearchUI", "activeNewVoice2txtCancel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/FTSBaseVoiceSearchUI", "activeNewVoice2txtCancel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                fTSBaseVoiceSearchUI.f137929t.r(fTSBaseVoiceSearchUI.getResources().getColor(com.tencent.mm.R.color.f478712f3), 0.9f);
                fTSBaseVoiceSearchUI.f137928s.setBackgroundDrawable(fTSBaseVoiceSearchUI.getResources().getDrawable(com.tencent.mm.R.drawable.asz));
                fTSBaseVoiceSearchUI.f137928s.animate().scaleX(1.2f).scaleY(1.2f).setDuration(100L).start();
                fTSBaseVoiceSearchUI.f137923p.setVisibility(8);
                return;
            }
            if (ordinal2 == 2) {
                fTSBaseVoiceSearchUI.f137939z.animate().translationY(0.0f).alpha(1.0f).setDuration(100L).withEndAction(new com.tencent.mm.plugin.fts.ui.y0(fTSBaseVoiceSearchUI)).start();
                fTSBaseVoiceSearchUI.A.animate().translationY(0.0f).alpha(1.0f).setDuration(100L).start();
                fTSBaseVoiceSearchUI.B.animate().translationY(0.0f).setDuration(100L).start();
                fTSBaseVoiceSearchUI.f137922o.setVisibility(0);
                ((android.widget.RelativeLayout.LayoutParams) fTSBaseVoiceSearchUI.f137922o.getLayoutParams()).bottomMargin = 0;
                fTSBaseVoiceSearchUI.f137922o.requestLayout();
                fTSBaseVoiceSearchUI.f137923p.setVisibility(0);
                return;
            }
            if (ordinal2 != 3) {
                return;
            }
            android.view.View view2 = fTSBaseVoiceSearchUI.f137933x;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/fts/ui/FTSBaseVoiceSearchUI", "activeNewVoice2txtSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/fts/ui/FTSBaseVoiceSearchUI", "activeNewVoice2txtSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            fTSBaseVoiceSearchUI.f137932w.r(fTSBaseVoiceSearchUI.getResources().getColor(com.tencent.mm.R.color.f478712f3), 0.9f);
            fTSBaseVoiceSearchUI.f137931v.setBackgroundDrawable(fTSBaseVoiceSearchUI.getResources().getDrawable(com.tencent.mm.R.drawable.asz));
            fTSBaseVoiceSearchUI.f137931v.animate().scaleX(1.2f).scaleY(1.2f).setDuration(150L).start();
            fTSBaseVoiceSearchUI.f137923p.setVisibility(8);
        }
    }

    private void Y6(java.lang.String str, int i17) {
        this.B1 = str;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            t7();
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSBaseVoiceSearchUI", "[fts] doSearch: %s", str);
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.D1;
        n3Var.removeMessages(1);
        n3Var.sendEmptyMessageDelayed(1, i17);
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void H0() {
    }

    public void P4(java.lang.String str) {
        k23.v0 v0Var;
        k23.v0 v0Var2;
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSBaseVoiceSearchUI", "[fts] onSearchChange %s", str);
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        this.T = K0;
        if (K0) {
            androidx.appcompat.app.AppCompatActivity context = getContext();
            k23.x0 x0Var = k23.c1.f303536h;
            if (((java.lang.Boolean) ((jz5.n) x0Var.a(context).f303538d.f303531d).getValue()).booleanValue()) {
                com.tencent.mm.ui.tools.o3 o3Var = this.f137937y0.f210323h;
                if (!(o3Var != null ? o3Var.a() : false)) {
                    com.tencent.mm.ui.tools.o3 o3Var2 = this.f137937y0.f210323h;
                    if (o3Var2 != null) {
                        o3Var2.d();
                    }
                    showVKB();
                }
            }
            com.tencent.mm.plugin.fts.ui.widget.v vVar = z13.f.Y6(getContext()).f469399e;
            if ((vVar != null && vVar.D) || this.U) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                objArr[0] = this.U ? "YES" : "NO";
                com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSBaseVoiceSearchUI", "onSearchChange, isKeyboardDisplayed: %s", objArr);
                r7(true);
            }
            if (x0Var.a(getContext()).V6() && (v0Var2 = this.I) != null) {
                v0Var2.u(true);
            }
            j7();
        } else if (k23.c1.f303536h.a(getContext()).V6() && (v0Var = this.I) != null) {
            v0Var.u(false);
        }
        java.lang.String p17 = o13.n.p(str);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.B1) && this.B1.equals(p17)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSBaseVoiceSearchUI", "Same query %s %s", this.B1, p17);
            return;
        }
        com.tencent.mm.plugin.fts.ui.f0 f0Var = this.f137925p1;
        if (f0Var != null && !com.tencent.mm.sdk.platformtools.t8.K0(f0Var.f138050g) && this.f137925p1.f138050g.equals(p17)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSBaseVoiceSearchUI", "Same adapter query %s %s", this.f137925p1.f138050g, p17);
            return;
        }
        boolean Zi = ((s50.k0) ((u50.w) i95.n0.c(u50.w.class))).Zi();
        boolean z17 = this.f137925p1 instanceof com.tencent.mm.plugin.fts.ui.q2;
        if (Zi && z17) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(p17) && com.tencent.mm.sdk.platformtools.t8.K0(this.B1)) {
                ((java.util.LinkedList) com.tencent.mm.plugin.fts.ui.y2.f138383d).clear();
                com.tencent.mm.plugin.fts.ui.y2.f138382c = null;
            } else if (!com.tencent.mm.sdk.platformtools.t8.K0(p17)) {
                r45.ei6 ei6Var = new r45.ei6();
                ei6Var.f373542d = p17;
                ei6Var.f373543e = c01.id.c();
                ((java.util.LinkedList) com.tencent.mm.plugin.fts.ui.y2.f138383d).add(ei6Var);
            }
        }
        Y6(p17, 300);
    }

    public void R3(int i17, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSBaseVoiceSearchUI", "onEnd resultCount=%d | isFinished=%b", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        if (z17) {
            l7();
            if (i17 > 0) {
                k7();
            } else {
                o7();
            }
        } else if (i17 > 0) {
            k7();
            m7();
        } else {
            p7();
        }
        if (this.f137935x1) {
            this.f137935x1 = false;
            this.f137919l1.setSelection(0);
        }
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void V5() {
    }

    public abstract com.tencent.mm.plugin.fts.ui.f0 W6(com.tencent.mm.plugin.fts.ui.w0 w0Var);

    public final void X6() {
        k23.v0 v0Var = this.I;
        if (v0Var != null) {
            v0Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "dismissRecognizingPanel");
            v0Var.s();
        }
    }

    public void Z6(java.lang.String str, int i17) {
        Y6(str, i17);
    }

    public java.util.List a7() {
        return null;
    }

    public java.lang.String b7() {
        java.lang.String str = this.B1;
        return str == null ? "" : str;
    }

    public final void c7() {
        android.view.View view = this.f137930u;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/FTSBaseVoiceSearchUI", "inactiveNewVoice2txtCancel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/FTSBaseVoiceSearchUI", "inactiveNewVoice2txtCancel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f137929t.r(getResources().getColor(com.tencent.mm.R.color.f478553an), 1.0f);
        this.f137928s.setBackgroundDrawable(getResources().getDrawable(com.tencent.mm.R.drawable.cvu));
        this.f137928s.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).withStartAction(new com.tencent.mm.plugin.fts.ui.m1(this)).start();
    }

    public final void d7() {
        android.view.View view = this.f137933x;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/FTSBaseVoiceSearchUI", "inactiveNewVoice2txtSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/FTSBaseVoiceSearchUI", "inactiveNewVoice2txtSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f137932w.r(getResources().getColor(com.tencent.mm.R.color.f478553an), 1.0f);
        this.f137931v.setBackgroundDrawable(getResources().getDrawable(com.tencent.mm.R.drawable.cvu));
        this.f137931v.animate().scaleX(1.0f).scaleY(1.0f).setDuration(100L).withStartAction(new com.tencent.mm.plugin.fts.ui.k1(this)).start();
    }

    public final void e7() {
        android.view.ViewPropertyAnimator animate = this.f137939z.animate();
        int i17 = this.F;
        animate.translationY(i17).alpha(0.0f).setDuration(100L).withStartAction(new com.tencent.mm.plugin.fts.ui.l1(this)).start();
        this.A.animate().translationY(i17).alpha(0.0f).setDuration(100L).start();
        this.B.animate().translationY(i17).setDuration(100L).start();
    }

    public void f7() {
        boolean z17;
        k23.x0 x0Var = k23.c1.f303536h;
        if (!x0Var.a(this).W6()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSBaseVoiceSearchUI", "initFloatingVoiceViewModelIfNeeded, isExptEnable false");
            return;
        }
        if (this.f137912J == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSBaseVoiceSearchUI", "初始化 floatingVoiceInputViewModelContainer");
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.jlt);
            this.f137912J = new android.widget.FrameLayout(this);
            this.K = new android.widget.FrameLayout(this);
            viewGroup.addView(this.f137912J, new android.widget.FrameLayout.LayoutParams(-1, -1));
            viewGroup.addView(this.K, new android.widget.FrameLayout.LayoutParams(-1, -1));
        }
        if (this.V) {
            com.tencent.mm.ui.tools.o3 o3Var = this.f137937y0.f210323h;
            if (o3Var instanceof com.tencent.mm.plugin.fts.ui.widget.v) {
                kotlin.jvm.internal.o.e(o3Var, "null cannot be cast to non-null type com.tencent.mm.plugin.fts.ui.widget.FTSActionBarNewSearchView");
                z17 = ((java.lang.Boolean) ((jz5.n) ((com.tencent.mm.plugin.fts.ui.widget.v) o3Var).M).getValue()).booleanValue();
            } else {
                z17 = false;
            }
            if (z17) {
                androidx.appcompat.app.AppCompatActivity context = getContext();
                kotlin.jvm.internal.o.g(context, "context");
                androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(context).a(i23.e.class);
                kotlin.jvm.internal.o.f(a17, "get(...)");
                i23.e eVar = (i23.e) a17;
                android.widget.FrameLayout viewGroup2 = this.K;
                kotlin.jvm.internal.o.g(viewGroup2, "viewGroup");
                if (eVar.f288080e == null) {
                    android.view.View inflate = android.view.LayoutInflater.from(eVar.getActivity()).inflate(com.tencent.mm.R.layout.f489129eg2, (android.view.ViewGroup) null);
                    eVar.f288080e = inflate;
                    if (inflate != null) {
                        inflate.setOnClickListener(new i23.b(eVar));
                    }
                    android.view.View view = eVar.f288080e;
                    android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 81;
                    viewGroup2.addView(view, layoutParams);
                }
            }
        }
        if (this.I != null) {
            boolean U6 = x0Var.a(this).U6();
            this.I.B(U6);
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSBaseVoiceSearchUI", "initFloatingVoiceViewModelIfNeeded already not null, syncedGlobalEnable=" + U6);
            return;
        }
        if (!x0Var.a(this).U6()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSBaseVoiceSearchUI", "initFloatingVoiceViewModelIfNeeded, isEnable false");
            return;
        }
        k23.u2 u2Var = ((java.lang.Number) ((jz5.n) x0Var.a(this).f303538d.f303532e).getValue()).intValue() == 2 ? k23.u2.f303702e : k23.u2.f303701d;
        com.tencent.mm.plugin.fts.ui.c1 c1Var = new com.tencent.mm.plugin.fts.ui.c1(this);
        android.widget.FrameLayout frameLayout = this.f137912J;
        k23.v0 v0Var = new k23.v0(this);
        android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) findViewById(android.R.id.content);
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-1, -2);
        k23.w0 w0Var = k23.w0.f303734d;
        java.lang.String startButtonTitle = (java.lang.String) ((jz5.n) this.W.f138280c).getValue();
        int d17 = i65.a.d(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.color.f479158al2);
        java.lang.Integer[] numArr = new java.lang.Integer[2];
        for (int i17 = 0; i17 < 2; i17++) {
            numArr[i17] = java.lang.Integer.valueOf(d17);
        }
        kotlin.jvm.internal.o.g(startButtonTitle, "startButtonTitle");
        k23.d0 d0Var = new k23.d0(viewGroup3, layoutParams2, c1Var, frameLayout, w0Var, 6, 3, startButtonTitle, u2Var, numArr, null, 1024, null);
        d0Var.f303555l = 0.6f;
        v0Var.t(d0Var);
        this.I = v0Var;
        k23.x0 x0Var2 = k23.c1.f303536h;
        if (x0Var2.a(this).V6()) {
            this.I.i();
        }
        x0Var2.a(this).f303541g = this.I;
        z50.e.f470163a.a(vu4.a.f440239f, vu4.b.C, 3, 6, z13.f.Y6(getContext()).a7(), this.f137937y0.g());
        this.I.r();
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f137937y0.g())) {
            this.I.E();
        }
    }

    public void g7() {
    }

    @Override // com.tencent.mm.plugin.fts.ui.w0
    public /* bridge */ /* synthetic */ android.content.Context getContext() {
        return super.getContext();
    }

    @Override // com.tencent.mm.plugin.fts.ui.w0
    public android.widget.ListView getListView() {
        return this.f137919l1;
    }

    public void h7() {
    }

    public void i7() {
        if (this.f137934x0) {
            return;
        }
        this.f137934x0 = true;
        db5.d5 d5Var = this.f137920m;
        if (d5Var == null || !d5Var.isShowing()) {
            return;
        }
        com.tencent.mm.plugin.fts.ui.n1 n1Var = com.tencent.mm.plugin.fts.ui.n1.MODE_CANCEL;
        com.tencent.mm.plugin.fts.ui.n1 n1Var2 = this.Z;
        if (n1Var == n1Var2) {
            final com.tencent.mm.plugin.fts.ui.o1 o1Var = com.tencent.mm.plugin.fts.ui.o1.Cancel;
            ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI$$c
                @Override // java.lang.Runnable
                public final void run() {
                    db5.d5 d5Var2;
                    int i17 = com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI.E1;
                    com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI fTSBaseVoiceSearchUI = com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI.this;
                    fTSBaseVoiceSearchUI.getClass();
                    int ordinal = o1Var.ordinal();
                    if ((ordinal == 0 || ordinal == 5 || ordinal == 2 || ordinal == 3) && (d5Var2 = fTSBaseVoiceSearchUI.f137920m) != null && d5Var2 != null && d5Var2.isShowing()) {
                        fTSBaseVoiceSearchUI.f137920m.dismiss();
                    }
                }
            });
            z21.e eVar = this.S;
            if (eVar != null) {
                eVar.cancel(true);
            }
            this.Y = "";
            com.tencent.mm.ui.tools.o3 o3Var = this.f137937y0.f210323h;
            if (o3Var != null) {
                o3Var.g(true);
                return;
            }
            return;
        }
        com.tencent.mm.plugin.fts.ui.n1 n1Var3 = com.tencent.mm.plugin.fts.ui.n1.MODE_TRANS;
        final com.tencent.mm.plugin.fts.ui.o1 o1Var2 = com.tencent.mm.plugin.fts.ui.o1.ReadyToSearch;
        if (n1Var3 == n1Var2) {
            ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI$$c
                @Override // java.lang.Runnable
                public final void run() {
                    db5.d5 d5Var2;
                    int i17 = com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI.E1;
                    com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI fTSBaseVoiceSearchUI = com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI.this;
                    fTSBaseVoiceSearchUI.getClass();
                    int ordinal = o1Var2.ordinal();
                    if ((ordinal == 0 || ordinal == 5 || ordinal == 2 || ordinal == 3) && (d5Var2 = fTSBaseVoiceSearchUI.f137920m) != null && d5Var2 != null && d5Var2.isShowing()) {
                        fTSBaseVoiceSearchUI.f137920m.dismiss();
                    }
                }
            });
        } else if (com.tencent.mm.plugin.fts.ui.n1.MODE_SEARCH == n1Var2) {
            com.tencent.mm.sdk.platformtools.n3 n3Var = this.X;
            n3Var.removeMessages(1);
            n3Var.sendEmptyMessageDelayed(1, 0L);
            ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI$$c
                @Override // java.lang.Runnable
                public final void run() {
                    db5.d5 d5Var2;
                    int i17 = com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI.E1;
                    com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI fTSBaseVoiceSearchUI = com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI.this;
                    fTSBaseVoiceSearchUI.getClass();
                    int ordinal = o1Var2.ordinal();
                    if ((ordinal == 0 || ordinal == 5 || ordinal == 2 || ordinal == 3) && (d5Var2 = fTSBaseVoiceSearchUI.f137920m) != null && d5Var2 != null && d5Var2.isShowing()) {
                        fTSBaseVoiceSearchUI.f137920m.dismiss();
                    }
                }
            });
            Y6(b7(), 0);
            u7();
        }
    }

    public void j7() {
        this.f137919l1.setVisibility(8);
        android.view.View view = this.f137918i;
        if (view == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/FTSBaseVoiceSearchUI", "hideFeedBackBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/FTSBaseVoiceSearchUI", "hideFeedBackBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void k7() {
        this.f137919l1.setVisibility(0);
    }

    public void l7() {
    }

    public void m7() {
    }

    public boolean n5(java.lang.String str) {
        hideVKB();
        com.tencent.mm.plugin.fts.ui.widget.m1 m1Var = this.f137937y0;
        if (m1Var == null) {
            return false;
        }
        m1Var.a();
        return false;
    }

    public void n7(int i17) {
        android.view.View view = this.f137917h;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/FTSBaseVoiceSearchUI", "setFtsVoiceBtnsLayoutVisibile", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/FTSBaseVoiceSearchUI", "setFtsVoiceBtnsLayoutVisibile", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public void o7() {
        this.f137919l1.setVisibility(8);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        android.view.View findViewById;
        super.onCreate(bundle);
        this.f137913d = j62.e.g().c(new com.tencent.mm.repairer.config.search.RepairerConfigVoiceSearchNewStyle()) == 1 && j62.e.g().c(new com.tencent.mm.repairer.config.search.RepairerConfigFTSFloatingVoiceSearch()) <= 0 && !com.tencent.mm.ui.bk.U();
        showMMLogo();
        setMMTitle("");
        g7();
        sh0.e eVar = (sh0.e) i95.n0.c(sh0.e.class);
        com.tencent.xweb.f1 f1Var = com.tencent.xweb.WebView.f220189m;
        com.tencent.xweb.f1 f1Var2 = com.tencent.xweb.f1.WV_KIND_PINUS;
        com.tencent.mm.plugin.fts.ui.f1 f1Var3 = new com.tencent.mm.plugin.fts.ui.f1(this);
        ((th0.a0) eVar).getClass();
        com.tencent.mm.xwebutil.y0.b(f1Var2, f1Var3);
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSBaseVoiceSearchUI", "Start To Load WebView %s", "WV_KIND_PINUS");
        if (com.tencent.mm.plugin.fts.ui.n3.g(this)) {
            setMMTitle("");
            hideActionbarLine();
            hideActionBarOperationArea();
            androidx.appcompat.app.b supportActionBar = getSupportActionBar();
            java.util.Objects.requireNonNull(supportActionBar);
            supportActionBar.o();
        }
        com.tencent.mm.plugin.fts.ui.widget.m1 m1Var = new com.tencent.mm.plugin.fts.ui.widget.m1(this);
        this.f137937y0 = m1Var;
        m1Var.f210324i = this;
        m1Var.f138302s = com.tencent.mm.plugin.fts.ui.n3.h() && !k23.c1.f303536h.a(this).W6();
        com.tencent.mm.plugin.fts.ui.widget.m1 m1Var2 = this.f137937y0;
        if (com.tencent.mm.plugin.fts.ui.n3.g(m1Var2.f138301r)) {
            m1Var2.s();
        }
        this.f137919l1 = (android.widget.ListView) findViewById(com.tencent.mm.R.id.mfg);
        java.util.List a76 = a7();
        if (a76 != null && a76.size() > 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSBaseVoiceSearchUI", "searchResultLV addFooterView %d", java.lang.Integer.valueOf(a76.size()));
            java.util.Iterator it = a76.iterator();
            while (it.hasNext()) {
                this.f137919l1.addFooterView((android.view.View) it.next());
            }
        }
        com.tencent.mm.plugin.fts.ui.f0 W6 = W6(this);
        this.f137925p1 = W6;
        W6.f138054n = this;
        this.f137919l1.setAdapter((android.widget.ListAdapter) W6);
        this.f137919l1.setOnScrollListener(this.f137925p1);
        this.f137919l1.setOnItemClickListener(this.f137925p1);
        this.f137919l1.setOnTouchListener(new com.tencent.mm.plugin.fts.ui.g1(this));
        if (this.f137913d) {
            android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.ggg);
            this.f137917h = findViewById2;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/FTSBaseVoiceSearchUI", "initNewVoiceSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/fts/ui/FTSBaseVoiceSearchUI", "initNewVoiceSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f137917h.setOnTouchListener(new com.tencent.mm.plugin.fts.ui.i1(this));
            android.animation.ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f137938y1;
            this.M.addUpdateListener(animatorUpdateListener);
            this.N.addUpdateListener(animatorUpdateListener);
            this.P.addUpdateListener(animatorUpdateListener);
            this.Q.addUpdateListener(animatorUpdateListener);
            this.R.addUpdateListener(animatorUpdateListener);
        }
        f7();
        setBackBtn(new com.tencent.mm.plugin.fts.ui.h1(this));
        if (j62.e.g().l("clicfg_android_use_search_global_sug_feedback", false, true, true)) {
            android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.typ);
            this.f137918i = findViewById3;
            if (findViewById3 != null && (findViewById = findViewById3.findViewById(com.tencent.mm.R.id.tyo)) != null) {
                findViewById.setOnClickListener(new com.tencent.mm.plugin.fts.ui.d1(this));
            }
        }
        java.lang.Object[] objArr = new java.lang.Object[4];
        z50.h hVar = z50.i.f470166a;
        objArr[0] = hVar.c() ? "yes" : "no";
        objArr[1] = java.lang.Float.valueOf(hVar.a());
        objArr[2] = java.lang.Float.valueOf(hVar.b());
        objArr[3] = com.tencent.mm.sdk.platformtools.m2.j() ? "yes" : "no";
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSBaseVoiceSearchUI", "[hitest], isBigFont: %s, fontScale: %f, maxScale: %f, isChineseAppLang: %s", objArr);
        com.tencent.mm.ui.tools.f5 f5Var = new com.tencent.mm.ui.tools.f5(this);
        this.f137915f = f5Var;
        f5Var.f210400e = this;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, androidx.activity.ComponentActivity, android.app.Activity
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        this.f137937y0.j(this, menu);
        if (!this.C1) {
            this.f137937y0.c(((java.lang.Boolean) ((jz5.n) k23.c1.f303536h.a(getContext()).f303538d.f303531d).getValue()).booleanValue());
            this.C1 = true;
        }
        return true;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        z21.e eVar;
        k23.v0 v0Var = this.I;
        if (v0Var != null) {
            v0Var.v();
        }
        this.D1.removeMessages(1);
        this.f137925p1.g();
        com.tencent.mm.ui.tools.f5 f5Var = this.f137915f;
        if (f5Var != null) {
            f5Var.d();
            this.f137915f.f210400e = null;
        }
        this.X.removeCallbacksAndMessages(null);
        if (this.f137913d && (eVar = this.S) != null) {
            eVar.cancel(true);
            this.S = null;
        }
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        com.tencent.mm.ui.tools.f5 f5Var = this.f137915f;
        if (f5Var != null) {
            f5Var.d();
        }
        super.onPause();
        this.f137937y0.a();
        this.f137925p1.getClass();
        if (this.L) {
            this.L = false;
            new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI$$a
                @Override // java.lang.Runnable
                public final void run() {
                    int i17 = com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI.E1;
                    com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI.this.X6();
                }
            }, 100L);
        }
        k23.v0 v0Var = this.I;
        if (v0Var != null) {
            v0Var.y();
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, android.app.Activity
    public boolean onPrepareOptionsMenu(android.view.Menu menu) {
        this.f137937y0.m(this, menu);
        return true;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mm.ui.tools.f5 f5Var = this.f137915f;
        if (f5Var != null) {
            f5Var.f();
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSBaseVoiceSearchUI", "onWindowFocusChanged, hasFocus: ".concat(z17 ? "YES" : "NO"));
        com.tencent.mm.ui.tools.f5 f5Var = this.f137915f;
        if (f5Var == null || !z17) {
            return;
        }
        f5Var.f();
    }

    public void p7() {
    }

    @Override // com.tencent.mm.ui.MMActivity
    public android.view.View provideCustomActivityContentView() {
        if (com.tencent.mm.plugin.fts.ui.n3.g(this)) {
            return android.view.LayoutInflater.from(this).inflate(com.tencent.mm.R.layout.f489112ef3, (android.view.ViewGroup) null);
        }
        return null;
    }

    public abstract void q7(java.lang.String str);

    public void r7(boolean z17) {
        k23.v0 v0Var;
        k23.x0 x0Var = k23.c1.f303536h;
        boolean U6 = x0Var.a(this).U6();
        boolean z18 = !z17 || (this.T && x0Var.a(this).U6());
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSBaseVoiceSearchUI", "showFloatingButton: visible: " + z17 + ", isQueryEmpty: " + this.T + ", isEnable: " + U6);
        if (z18 && (v0Var = this.I) != null) {
            v0Var.G(z17);
        }
    }

    public void s7() {
        this.f137935x1 = true;
        p7();
        com.tencent.mm.plugin.fts.ui.j3 j3Var = new com.tencent.mm.plugin.fts.ui.j3();
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(this).a(z13.f.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        z13.f fVar = (z13.f) a17;
        j3Var.f138085b = fVar.i7();
        j3Var.f138084a = k23.s2.a(fVar.f469406o);
        if (fVar.f469407p.contains(b7())) {
            j3Var.f138086c = true;
        }
        this.f137925p1.o(this.B1, j3Var);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.plugin.appbrand.widget.input.x4
    public void showVKB() {
        android.view.View currentFocus;
        int i17 = j62.e.g().i("clicfg_oppo_android16_show_vkb_new_impl", 0, true, true);
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSBaseVoiceSearchUI", "showVKB exptKey %s exptVal %s", "clicfg_oppo_android16_show_vkb_new_impl", java.lang.Integer.valueOf(i17));
        if (i17 == 0) {
            super.showVKB();
            return;
        }
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) getSystemService("input_method");
        if (inputMethodManager == null || (currentFocus = getCurrentFocus()) == null || currentFocus.getWindowToken() == null) {
            return;
        }
        inputMethodManager.showSoftInput(currentFocus, 2);
    }

    @Override // com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
    }

    public void t7() {
        this.D1.removeMessages(1);
        this.f137935x1 = false;
        this.f137925p1.p();
        j7();
    }

    public void u7() {
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void v() {
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.X;
        n3Var.removeMessages(1);
        n3Var.sendEmptyMessageDelayed(1, 0L);
        this.Y = "";
    }

    @Override // com.tencent.mm.ui.tools.c5
    public void w2(int i17, boolean z17) {
        android.view.View view;
        android.animation.ObjectAnimator objectAnimator = this.f137914e;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            this.f137914e.cancel();
        }
        boolean z18 = i17 > 0;
        this.U = z18;
        if (z18) {
            this.f137916g = i17;
            int c17 = i65.a.c(getContext(), this.f137916g);
            androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(this).a(z13.f.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            ((z13.f) a17).f469402h = c17;
        }
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = z17 ? "true" : "false";
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSBaseVoiceSearchUI", "onKeyboardHeightChanged, height: %d, isResized: %s", objArr);
        if (k23.c1.f303536h.a(getContext()).V6() || (view = this.f137917h) == null) {
            return;
        }
        if (i17 > 0) {
            if (view.getTranslationY() != 0.0f) {
                view.setTranslationY(0.0f);
            }
            this.f137914e = android.animation.ObjectAnimator.ofFloat(view, "translationY", 0.0f, -i17);
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f137937y0.g())) {
                n7(0);
            }
        } else {
            this.f137914e = android.animation.ObjectAnimator.ofFloat(view, "translationY", view.getTranslationY(), 0.0f);
            n7(8);
        }
        this.f137914e.setDuration(200L);
        this.f137914e.setInterpolator(new y3.b());
        this.f137914e.addUpdateListener(new com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI$$d());
        this.f137914e.start();
    }
}
