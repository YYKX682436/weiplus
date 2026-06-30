package nf2;

/* loaded from: classes10.dex */
public final class d1 implements nf2.e1 {
    public float A;
    public nf2.g0 B;
    public nf2.d0 C;
    public jz5.l D;
    public nf2.j1 E;
    public int F;
    public int G;
    public nf2.x H;
    public nf2.h0 I;

    /* renamed from: J, reason: collision with root package name */
    public final yz5.p f336679J;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f336680a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.ViewGroup f336681b;

    /* renamed from: c, reason: collision with root package name */
    public nf2.f1 f336682c;

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f336683d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f336684e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f336685f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.FrameLayout f336686g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.FrameLayout f336687h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f336688i;

    /* renamed from: j, reason: collision with root package name */
    public android.view.View f336689j;

    /* renamed from: k, reason: collision with root package name */
    public android.view.View f336690k;

    /* renamed from: l, reason: collision with root package name */
    public android.view.View f336691l;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f336692m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f336693n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f336694o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ImageView f336695p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f336696q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.view.MMPAGView f336697r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.controller.lyrics.FinderLiveNormalRoomLyricsRenderView f336698s;

    /* renamed from: t, reason: collision with root package name */
    public nf2.i1 f336699t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f336700u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f336701v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.view.MMPAGView f336702w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f336703x;

    /* renamed from: y, reason: collision with root package name */
    public jz5.l f336704y;

    /* renamed from: z, reason: collision with root package name */
    public nf2.f1 f336705z;

    public d1(android.content.Context context, android.view.ViewGroup container, nf2.f1 config, kotlinx.coroutines.y0 scope) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(container, "container");
        kotlin.jvm.internal.o.g(config, "config");
        kotlin.jvm.internal.o.g(scope, "scope");
        this.f336680a = context;
        this.f336681b = container;
        this.f336682c = config;
        this.f336683d = scope;
        this.A = 0.5f;
        this.E = nf2.j1.f336760d;
        this.f336679J = new nf2.n0(this);
        container.setVisibility(0);
        android.view.View c17 = c();
        this.f336684e = c17;
        container.addView(c17);
        b();
        this.B = new nf2.g0(this, this.f336682c);
        f();
        com.tencent.mm.plugin.finder.live.controller.lyrics.FinderLiveNormalRoomLyricsRenderView finderLiveNormalRoomLyricsRenderView = this.f336698s;
        if (finderLiveNormalRoomLyricsRenderView != null) {
            finderLiveNormalRoomLyricsRenderView.j(this.f336682c);
        }
        e();
        d();
    }

    public static final void a(nf2.d1 d1Var) {
        android.view.View view;
        int width;
        if (d1Var.f336682c.f336732n == nf2.a.f336648e && (view = d1Var.f336685f) != null) {
            android.view.ViewParent parent = view.getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null && (width = viewGroup.getWidth()) > 0) {
                float x17 = view.getX();
                float x18 = view.getX() + view.getWidth();
                int i17 = d1Var.G;
                nf2.j1 j1Var = (x17 < ((float) i17) || x17 >= ((float) d1Var.F)) ? (x18 <= ((float) (width - d1Var.F)) || x18 > ((float) (width - i17))) ? nf2.j1.f336760d : nf2.j1.f336762f : nf2.j1.f336761e;
                if (j1Var != d1Var.E) {
                    d1Var.E = j1Var;
                    com.tencent.mm.plugin.finder.live.controller.lyrics.FinderLiveNormalRoomLyricsRenderView finderLiveNormalRoomLyricsRenderView = d1Var.f336698s;
                    if (finderLiveNormalRoomLyricsRenderView != null) {
                        finderLiveNormalRoomLyricsRenderView.setHorizontalAlignment(j1Var);
                    }
                    if (d1Var.f336700u) {
                        return;
                    }
                    d1Var.k(j1Var);
                }
            }
        }
    }

    public final void b() {
        this.f336685f = this.f336684e.findViewById(com.tencent.mm.R.id.tkq);
        this.f336686g = (android.widget.FrameLayout) this.f336684e.findViewById(com.tencent.mm.R.id.tkw);
        this.f336687h = (android.widget.FrameLayout) this.f336684e.findViewById(com.tencent.mm.R.id.tkv);
        this.f336688i = this.f336684e.findViewById(com.tencent.mm.R.id.tkt);
        this.f336689j = this.f336684e.findViewById(com.tencent.mm.R.id.ueu);
        this.f336690k = this.f336684e.findViewById(com.tencent.mm.R.id.uew);
        this.f336691l = this.f336684e.findViewById(com.tencent.mm.R.id.ues);
        this.f336692m = this.f336684e.findViewById(com.tencent.mm.R.id.uey);
        this.f336693n = this.f336684e.findViewById(com.tencent.mm.R.id.ueq);
        this.f336694o = (com.tencent.mm.ui.widget.imageview.WeImageView) this.f336684e.findViewById(com.tencent.mm.R.id.uet);
        this.f336695p = (android.widget.ImageView) this.f336684e.findViewById(com.tencent.mm.R.id.uer);
        this.f336696q = this.f336684e.findViewById(com.tencent.mm.R.id.tkl);
        this.f336697r = (com.tencent.mm.view.MMPAGView) this.f336684e.findViewById(com.tencent.mm.R.id.tkn);
        this.f336698s = (com.tencent.mm.plugin.finder.live.controller.lyrics.FinderLiveNormalRoomLyricsRenderView) this.f336684e.findViewById(com.tencent.mm.R.id.tkx);
        this.f336701v = this.f336684e.findViewById(com.tencent.mm.R.id.tkr);
        this.f336702w = (com.tencent.mm.view.MMPAGView) this.f336684e.findViewById(com.tencent.mm.R.id.tks);
        com.tencent.mars.xlog.Log.i("FinderLiveLyricsView", "bindViewReferences: all view references bound");
    }

    public final android.view.View c() {
        int i17;
        int ordinal = this.f336682c.f336732n.ordinal();
        if (ordinal == 0) {
            i17 = com.tencent.mm.R.layout.ea7;
        } else {
            if (ordinal != 1) {
                throw new jz5.j();
            }
            i17 = com.tencent.mm.R.layout.ea8;
        }
        com.tencent.mars.xlog.Log.i("FinderLiveLyricsView", "inflateLayout: mode=" + this.f336682c.f336732n + ", layoutResId=" + i17);
        android.view.View inflate = android.view.LayoutInflater.from(this.f336680a).inflate(i17, this.f336681b, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return inflate;
    }

    public final void d() {
        if (!this.f336682c.f336723e) {
            android.view.View view = this.f336696q;
            if (view == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/lyrics/FinderLiveLyricsView", "initCollapsedButton", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/lyrics/FinderLiveLyricsView", "initCollapsedButton", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = this.f336696q;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/controller/lyrics/FinderLiveLyricsView", "initCollapsedButton", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/controller/lyrics/FinderLiveLyricsView", "initCollapsedButton", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.FrameLayout frameLayout = this.f336686g;
        android.view.View view3 = this.f336688i;
        android.view.View view4 = this.f336696q;
        if (frameLayout != null && view3 != null && view4 != null) {
            this.f336699t = new nf2.i1(frameLayout, view3, view4, this.f336682c.f336732n);
        }
        com.tencent.mm.view.MMPAGView mMPAGView = this.f336697r;
        if (mMPAGView != null) {
            ym5.l2 l2Var = ym5.l2.f463424a;
            ym5.j2[] j2VarArr = ym5.j2.f463392d;
            mMPAGView.o(ae2.in.f3688a.a(ym5.f6.U1));
            kotlinx.coroutines.l.d(this.f336683d, null, null, new nf2.m0(mMPAGView, null), 3, null);
        }
        android.view.View view5 = this.f336696q;
        if (view5 != null) {
            view5.setOnClickListener(new nf2.l0(this));
        }
        com.tencent.mars.xlog.Log.i("FinderLiveLyricsView", "initCollapsedButton: initialized");
    }

    public final void e() {
        if (!this.f336682c.f336723e) {
            android.view.View view = this.f336688i;
            if (view == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/lyrics/FinderLiveLyricsView", "initMenuBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/lyrics/FinderLiveLyricsView", "initMenuBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = this.f336688i;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/controller/lyrics/FinderLiveLyricsView", "initMenuBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/controller/lyrics/FinderLiveLyricsView", "initMenuBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        h();
        com.tencent.mars.xlog.Log.i("FinderLiveLyricsView", "initMenuBar: menu initialized for anchor");
    }

    public final void f() {
        android.widget.FrameLayout.LayoutParams layoutParams;
        android.view.View view = this.f336685f;
        android.view.ViewGroup viewGroup = view instanceof android.view.ViewGroup ? (android.view.ViewGroup) view : null;
        if (viewGroup == null || this.f336686g == null) {
            return;
        }
        android.util.DisplayMetrics displayMetrics = this.f336680a.getResources().getDisplayMetrics();
        int i17 = displayMetrics.widthPixels;
        int i18 = displayMetrics.heightPixels;
        boolean z17 = i17 > i18;
        int a17 = i65.a.a(com.tencent.mm.sdk.platformtools.x2.f193071a, this.f336682c.f336730l);
        int a18 = i65.a.a(com.tencent.mm.sdk.platformtools.x2.f193071a, this.f336682c.f336728j);
        int a19 = i65.a.a(com.tencent.mm.sdk.platformtools.x2.f193071a, this.f336682c.f336729k);
        int ordinal = this.f336682c.f336732n.ordinal();
        if (ordinal == 0) {
            if (z17) {
                i17 = i18;
            }
            int i19 = (i17 - (a18 * 2)) - a17;
            android.view.ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
            layoutParams = layoutParams2 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams2 : null;
            if (layoutParams != null) {
                layoutParams.width = i19;
            }
            if (layoutParams != null) {
                layoutParams.gravity = 1;
            }
            viewGroup.setLayoutParams(layoutParams);
            return;
        }
        if (ordinal != 1) {
            return;
        }
        if (z17) {
            i17 = i18;
        }
        nf2.f1 f1Var = this.f336682c;
        int i27 = (i17 - ((int) (i17 * (f1Var.f336726h + f1Var.f336727i)))) - (a19 * 2);
        android.view.ViewGroup.LayoutParams layoutParams3 = viewGroup.getLayoutParams();
        layoutParams = layoutParams3 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams3 : null;
        if (layoutParams != null) {
            layoutParams.height = i27;
        }
        if (layoutParams != null) {
            layoutParams.gravity = 16;
        }
        viewGroup.setLayoutParams(layoutParams);
    }

    public final void g(boolean z17) {
        nf2.g0 g0Var;
        if (this.f336685f == null || (g0Var = this.B) == null) {
            return;
        }
        float f17 = this.f336682c.f336728j;
        android.content.Context context = this.f336680a;
        this.G = ym5.x.a(context, f17);
        this.F = ym5.x.a(context, this.f336682c.f336731m);
        g0Var.f(new nf2.o0(this, g0Var, z17));
    }

    public final void h() {
        android.view.View view = this.f336689j;
        if (view != null) {
            view.setOnClickListener(new nf2.p0(this));
        }
        android.view.View view2 = this.f336690k;
        if (view2 != null) {
            view2.setOnClickListener(new nf2.q0(this));
        }
        android.view.View view3 = this.f336691l;
        if (view3 != null) {
            view3.setOnClickListener(new nf2.r0(this));
        }
        android.view.View view4 = this.f336692m;
        if (view4 != null) {
            view4.setOnClickListener(new nf2.s0(this));
        }
        android.view.View view5 = this.f336693n;
        if (view5 != null) {
            view5.setOnClickListener(new nf2.t0(this));
        }
    }

    public final void i(boolean z17) {
        if (this.f336685f == null) {
            return;
        }
        float f17 = this.f336682c.f336728j;
        android.content.Context context = this.f336680a;
        this.G = ym5.x.a(context, f17);
        this.F = ym5.x.a(context, this.f336682c.f336731m);
        nf2.g0 g0Var = this.B;
        if (g0Var != null) {
            g0Var.f(new nf2.u0(z17, this));
        }
    }

    public final void j(nf2.f1 newConfig) {
        com.tencent.mm.plugin.finder.live.controller.lyrics.FinderLiveNormalRoomLyricsRenderView finderLiveNormalRoomLyricsRenderView;
        nf2.d0 d0Var;
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        nf2.a aVar = this.f336682c.f336732n;
        nf2.a aVar2 = newConfig.f336732n;
        if (!(aVar != aVar2)) {
            this.f336682c = newConfig;
            com.tencent.mars.xlog.Log.i("FinderLiveLyricsView", "updateConfig: updating config without layout switch, color=" + newConfig.f336736r);
            com.tencent.mm.plugin.finder.live.controller.lyrics.FinderLiveNormalRoomLyricsRenderView finderLiveNormalRoomLyricsRenderView2 = this.f336698s;
            if (finderLiveNormalRoomLyricsRenderView2 != null) {
                finderLiveNormalRoomLyricsRenderView2.j(newConfig);
                return;
            }
            return;
        }
        com.tencent.mm.plugin.finder.live.controller.lyrics.FinderLiveNormalRoomLyricsRenderView finderLiveNormalRoomLyricsRenderView3 = this.f336698s;
        my5.a f111592f = finderLiveNormalRoomLyricsRenderView3 != null ? finderLiveNormalRoomLyricsRenderView3.getF111592f() : null;
        com.tencent.mm.plugin.finder.live.controller.lyrics.FinderLiveNormalRoomLyricsRenderView finderLiveNormalRoomLyricsRenderView4 = this.f336698s;
        int f111595i = finderLiveNormalRoomLyricsRenderView4 != null ? finderLiveNormalRoomLyricsRenderView4.getF111595i() : 0;
        com.tencent.mm.plugin.finder.live.controller.lyrics.FinderLiveNormalRoomLyricsRenderView finderLiveNormalRoomLyricsRenderView5 = this.f336698s;
        boolean z17 = finderLiveNormalRoomLyricsRenderView5 != null ? finderLiveNormalRoomLyricsRenderView5.f111596m : false;
        jz5.l lVar = this.D;
        this.f336682c = newConfig;
        android.view.View view = this.f336684e;
        android.view.ViewGroup viewGroup = this.f336681b;
        viewGroup.removeView(view);
        android.view.View c17 = c();
        this.f336684e = c17;
        viewGroup.addView(c17);
        b();
        nf2.g0 g0Var = this.B;
        if (g0Var != null) {
            g0Var.f336741c = null;
            g0Var.f336742d = 0;
            g0Var.f336743e = 0;
            g0Var.f336744f = false;
            com.tencent.mars.xlog.Log.i("FinderLiveLyricsPositionManager", "release");
        }
        this.B = new nf2.g0(this, this.f336682c);
        f();
        com.tencent.mm.plugin.finder.live.controller.lyrics.FinderLiveNormalRoomLyricsRenderView finderLiveNormalRoomLyricsRenderView6 = this.f336698s;
        if (finderLiveNormalRoomLyricsRenderView6 != null) {
            finderLiveNormalRoomLyricsRenderView6.j(this.f336682c);
        }
        e();
        d();
        nf2.d0 d0Var2 = this.C;
        if (d0Var2 != null) {
            d0Var2.e();
        }
        this.C = null;
        if (this.f336682c.f336721c) {
            g(false);
        } else {
            i(false);
        }
        if (this.I != null) {
            h();
        }
        nf2.x xVar = this.H;
        if (xVar != null && (d0Var = this.C) != null) {
            d0Var.f336677l = xVar;
        }
        com.tencent.mars.xlog.Log.i("FinderLiveLyricsView", "rebuildLayout: completed for mode=" + this.f336682c.f336732n);
        if (f111592f != null && (finderLiveNormalRoomLyricsRenderView = this.f336698s) != null) {
            finderLiveNormalRoomLyricsRenderView.f(f111592f);
        }
        if (z17) {
            com.tencent.mm.plugin.finder.live.controller.lyrics.FinderLiveNormalRoomLyricsRenderView finderLiveNormalRoomLyricsRenderView7 = this.f336698s;
            if (finderLiveNormalRoomLyricsRenderView7 != null) {
                finderLiveNormalRoomLyricsRenderView7.h();
            }
            com.tencent.mm.plugin.finder.live.controller.lyrics.FinderLiveNormalRoomLyricsRenderView finderLiveNormalRoomLyricsRenderView8 = this.f336698s;
            if (finderLiveNormalRoomLyricsRenderView8 != null) {
                finderLiveNormalRoomLyricsRenderView8.f111595i = f111595i;
            }
        }
        if (lVar != null) {
            float floatValue = ((java.lang.Number) lVar.f302833d).floatValue();
            float floatValue2 = ((java.lang.Number) lVar.f302834e).floatValue();
            android.view.View view2 = this.f336685f;
            if (view2 != null) {
                view2.post(new nf2.z0(this, floatValue, floatValue2));
            }
        }
        com.tencent.mars.xlog.Log.i("FinderLiveLyricsView", "updateConfig: layout switched to " + aVar2);
    }

    public final void k(nf2.j1 j1Var) {
        android.widget.FrameLayout frameLayout;
        if (this.f336682c.f336732n == nf2.a.f336648e && (frameLayout = this.f336687h) != null) {
            android.view.ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams ? (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 == null) {
                return;
            }
            int ordinal = j1Var.ordinal();
            if (ordinal == 0) {
                layoutParams2.f10906q = 0;
                layoutParams2.f10908s = 0;
            } else if (ordinal == 1) {
                layoutParams2.f10906q = 0;
                layoutParams2.f10908s = -1;
            } else if (ordinal == 2) {
                layoutParams2.f10906q = -1;
                layoutParams2.f10908s = 0;
            }
            frameLayout.setLayoutParams(layoutParams2);
        }
    }

    public final void l(float f17, float f18) {
        this.D = new jz5.l(java.lang.Float.valueOf(f17), java.lang.Float.valueOf(f18));
        nf2.g0 g0Var = this.B;
        if (g0Var != null) {
            if (g0Var.f336744f && g0Var.f336742d > 0 && g0Var.f336743e > 0) {
                nf2.g0.e(g0Var, f17, f18, false, new nf2.a1(this), 4, null);
                return;
            }
        }
        if (g0Var != null) {
            g0Var.f(new nf2.c1(g0Var, f17, f18, this));
        }
    }
}
