package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class x80 extends com.tencent.mm.plugin.finder.live.plugin.l implements nn0.a0 {
    public boolean A;
    public int B;
    public int C;
    public final on0.b D;
    public kotlinx.coroutines.r2 E;
    public final android.os.Handler F;
    public final java.lang.Runnable G;

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f115049p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.view.FinderLiveInterceptTouchRelativeLayout f115050q;

    /* renamed from: r, reason: collision with root package name */
    public long f115051r;

    /* renamed from: s, reason: collision with root package name */
    public long f115052s;

    /* renamed from: t, reason: collision with root package name */
    public java.util.LinkedList f115053t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f115054u;

    /* renamed from: v, reason: collision with root package name */
    public kotlinx.coroutines.r2 f115055v;

    /* renamed from: w, reason: collision with root package name */
    public final android.view.View f115056w;

    /* renamed from: x, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.multistream.MultiStreamRecyclerView f115057x;

    /* renamed from: y, reason: collision with root package name */
    public int f115058y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f115059z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.tencent.mm.plugin.finder.live.view.FinderLiveInterceptTouchRelativeLayout] */
    /* JADX WARN: Type inference failed for: r1v7, types: [com.tencent.mm.plugin.finder.live.view.FinderLiveInterceptTouchRelativeLayout] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, qo0.c] */
    public x80(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        com.tencent.mm.plugin.finder.live.view.FinderLiveSwipeToCloseRelativeLayout finderLiveSwipeToCloseRelativeLayout;
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f115049p = statusMonitor;
        if (root instanceof com.tencent.mm.plugin.finder.live.view.FinderLiveInterceptTouchRelativeLayout) {
            finderLiveSwipeToCloseRelativeLayout = (com.tencent.mm.plugin.finder.live.view.FinderLiveInterceptTouchRelativeLayout) root;
        } else {
            android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.fkn);
            kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
            finderLiveSwipeToCloseRelativeLayout = (com.tencent.mm.plugin.finder.live.view.FinderLiveInterceptTouchRelativeLayout) findViewById;
        }
        this.f115050q = finderLiveSwipeToCloseRelativeLayout;
        this.f115051r = android.os.SystemClock.elapsedRealtime();
        this.f115052s = -1L;
        this.f115054u = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.w80(root));
        android.view.ViewGroup viewGroup = statusMonitor instanceof android.view.ViewGroup ? (android.view.ViewGroup) statusMonitor : null;
        this.f115056w = viewGroup != null ? viewGroup.findViewById(com.tencent.mm.R.id.ey8) : null;
        android.view.ViewGroup viewGroup2 = statusMonitor instanceof android.view.ViewGroup ? (android.view.ViewGroup) statusMonitor : null;
        com.tencent.mm.plugin.finder.live.multistream.MultiStreamRecyclerView multiStreamRecyclerView = viewGroup2 != null ? (com.tencent.mm.plugin.finder.live.multistream.MultiStreamRecyclerView) viewGroup2.findViewById(com.tencent.mm.R.id.ig6) : null;
        this.f115057x = multiStreamRecyclerView;
        this.f115058y = 1;
        this.f115059z = true;
        android.content.Context context = root.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        this.D = new on0.b(context);
        this.F = new android.os.Handler(android.os.Looper.getMainLooper());
        this.G = new com.tencent.mm.plugin.finder.live.plugin.p80(this);
        finderLiveSwipeToCloseRelativeLayout.setOnTouchListener(new com.tencent.mm.plugin.finder.live.plugin.m80(this));
        com.tencent.mm.plugin.finder.live.view.FinderLiveSwipeToCloseRelativeLayout finderLiveSwipeToCloseRelativeLayout2 = finderLiveSwipeToCloseRelativeLayout instanceof com.tencent.mm.plugin.finder.live.view.FinderLiveSwipeToCloseRelativeLayout ? finderLiveSwipeToCloseRelativeLayout : null;
        if (finderLiveSwipeToCloseRelativeLayout2 != null) {
            finderLiveSwipeToCloseRelativeLayout2.f116103f = this;
        }
        if (multiStreamRecyclerView != null) {
            com.tencent.mm.plugin.finder.live.plugin.n80 n80Var = new com.tencent.mm.plugin.finder.live.plugin.n80(this);
            com.tencent.mm.plugin.finder.live.plugin.o80 o80Var = new com.tencent.mm.plugin.finder.live.plugin.o80(this);
            multiStreamRecyclerView.A2 = n80Var;
            multiStreamRecyclerView.B2 = o80Var;
        }
        root.setImportantForAccessibility(4);
        root.setContentDescription(root.getContext().getString(com.tencent.mm.R.string.ec8));
    }

    public static /* synthetic */ boolean A1(com.tencent.mm.plugin.finder.live.plugin.x80 x80Var, java.lang.Boolean bool, android.view.MotionEvent motionEvent, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            bool = null;
        }
        if ((i17 & 2) != 0) {
            motionEvent = null;
        }
        return x80Var.z1(bool, motionEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:147:0x047f, code lost:
    
        if (r2 != 6) goto L236;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void t1(com.tencent.mm.plugin.finder.live.plugin.x80 r16, android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 1848
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.x80.t1(com.tencent.mm.plugin.finder.live.plugin.x80, android.view.MotionEvent):void");
    }

    @Override // qo0.a
    public void C0(java.util.LinkedHashMap micUserMap) {
        kotlin.jvm.internal.o.g(micUserMap, "micUserMap");
        this.f115058y = micUserMap.size();
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return false;
    }

    @Override // nn0.a0
    public void I(boolean z17, float f17, float f18, float f19, java.lang.String str) {
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void K0(int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("visibility:");
        sb6.append(i17 == 0);
        com.tencent.mars.xlog.Log.i("Finder.LiveScreenClearPlugin", sb6.toString());
        super.K0(i17);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
        super.M0(status, bundle);
        int ordinal = status.ordinal();
        if (ordinal != 130) {
            if (ordinal != 191) {
                return;
            }
            this.A = bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_AUDIO_MODE", false) : false;
            return;
        }
        boolean z17 = bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_SCREEN_CLEAR", false) : false;
        android.view.ViewGroup viewGroup = this.f365323d;
        if (z17) {
            viewGroup.setImportantForAccessibility(1);
            viewGroup.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.v80(this));
        } else {
            viewGroup.setImportantForAccessibility(4);
            viewGroup.setOnClickListener(null);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void O0() {
        this.f115053t = null;
        on0.b bVar = this.D;
        if (bVar != null) {
            bVar.f346764d = null;
        }
        h0(false);
        this.F.removeCallbacksAndMessages(null);
    }

    @Override // nn0.a0
    public void P() {
        y1(2);
    }

    @Override // nn0.a0
    public void g0(android.view.MotionEvent event, int i17, boolean z17) {
        kotlin.jvm.internal.o.g(event, "event");
        pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.u80(this, event));
    }

    @Override // nn0.a0
    public void h0(boolean z17) {
        com.tencent.mars.xlog.Log.i("Finder.LiveScreenClearPlugin", "notifyClipChildren clip: " + z17);
        qo0.c cVar = this.f115049p;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = cVar instanceof com.tencent.mm.plugin.finder.live.view.k0 ? (com.tencent.mm.plugin.finder.live.view.k0) cVar : null;
        if (k0Var != null) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) k0Var.findViewById(com.tencent.mm.R.id.fqe);
            if (viewGroup != null) {
                viewGroup.setClipChildren(z17);
            }
            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) k0Var.findViewById(com.tencent.mm.R.id.fh8);
            if (viewGroup2 != null) {
                viewGroup2.setClipChildren(z17);
            }
            android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) k0Var.findViewById(com.tencent.mm.R.id.ig6);
            if (viewGroup3 != null) {
                viewGroup3.setClipChildren(z17);
            }
            android.view.ViewGroup viewGroup4 = (android.view.ViewGroup) k0Var.findViewById(com.tencent.mm.R.id.ig7);
            if (viewGroup4 != null) {
                viewGroup4.setClipChildren(z17);
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return false;
    }

    public final void u1(boolean z17) {
        ((mm2.c1) P0(mm2.c1.class)).N1 = z17;
        com.tencent.mars.xlog.Log.i("Finder.LiveScreenClearPlugin", "screenAction business(LiveCommonSlice::class.java).screenClear:" + ((mm2.c1) P0(mm2.c1.class)).N1);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_FINDER_LIVE_SCREEN_CLEAR", ((mm2.c1) P0(mm2.c1.class)).N1);
        qo0.b bVar = qo0.b.Z2;
        qo0.c cVar = this.f115049p;
        cVar.statusChange(bVar, bundle);
        if (cVar.getLiveRole() == 0) {
            ((ml2.r0) i95.n0.c(ml2.r0.class)).zj(((mm2.c1) P0(mm2.c1.class)).N1 ? ml2.o1.f327767e : ml2.o1.f327768f);
        }
        if (((mm2.c1) P0(mm2.c1.class)).N1 && x0()) {
            android.content.Context context = this.f365323d.getContext();
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            ((android.app.Activity) context).getWindow().getDecorView().setSystemUiVisibility(3846);
        }
        this.F.removeCallbacks(this.G);
    }

    public final void v1() {
        android.view.View view = this.f115056w;
        if (view != null && view.getVisibility() == 0) {
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveScreenClearPlugin", "hideFrameScaleTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveScreenClearPlugin", "hideFrameScaleTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            zl2.r4.f473950a.I0().putBoolean("FRAME_SCALE_TIPS_SHOW_KEY", false);
            kotlinx.coroutines.r2 r2Var = this.f115055v;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
        }
    }

    public final void w1() {
        com.tencent.mars.xlog.Log.i("Finder.LiveScreenClearPlugin", "onScaleTouchEnd");
        com.tencent.mm.plugin.finder.live.plugin.wi wiVar = (com.tencent.mm.plugin.finder.live.plugin.wi) X0(com.tencent.mm.plugin.finder.live.plugin.wi.class);
        if (wiVar == null || wiVar.r()) {
            return;
        }
        wiVar.f365323d.setAlpha(1.0f);
    }

    public final void x1(android.view.View.OnTouchListener onTouchListener) {
        java.util.LinkedList linkedList;
        if (onTouchListener == null) {
            return;
        }
        if (this.f115053t == null) {
            this.f115053t = new java.util.LinkedList();
        }
        java.util.LinkedList linkedList2 = this.f115053t;
        boolean z17 = false;
        if (linkedList2 != null && linkedList2.contains(onTouchListener)) {
            z17 = true;
        }
        if (z17 || (linkedList = this.f115053t) == null) {
            return;
        }
        linkedList.add(onTouchListener);
    }

    public final void y1(int i17) {
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c17;
        ml2.b4 b4Var = ml2.b4.M1;
        cl0.g gVar = new cl0.g();
        gVar.o("type", i17);
        gVar.o("screen_status", this.f115059z ? 1 : 0);
        ml2.r0.hj(r0Var, b4Var, gVar.toString(), 0L, null, null, null, null, null, 252, null);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void z0() {
        super.z0();
        if (x0()) {
            android.os.Handler handler = this.F;
            java.lang.Runnable runnable = this.G;
            handler.removeCallbacks(runnable);
            handler.postDelayed(runnable, 5000L);
        }
    }

    public final boolean z1(java.lang.Boolean bool, android.view.MotionEvent motionEvent) {
        android.view.View view;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("screenClickLogic， pointerCount = ");
        sb6.append(motionEvent != null ? motionEvent.getPointerCount() : 0);
        com.tencent.mars.xlog.Log.i("Finder.LiveScreenClearPlugin", sb6.toString());
        if (android.os.SystemClock.elapsedRealtime() - this.f115051r >= android.view.ViewConfiguration.getDoubleTapTimeout()) {
            if ((motionEvent != null ? motionEvent.getPointerCount() : 0) != 3) {
                this.f115051r = android.os.SystemClock.elapsedRealtime();
                if (com.tencent.mm.plugin.finder.live.FinderLiveViewCallback.N != 0) {
                    com.tencent.mars.xlog.Log.i("Finder.LiveScreenClearPlugin", "[screenAction] inNewGuideStatus:" + com.tencent.mm.plugin.finder.live.FinderLiveViewCallback.N + " return");
                } else {
                    android.content.Context context = this.f115050q.getContext();
                    kotlin.jvm.internal.o.f(context, "getContext(...)");
                    pf5.z zVar = pf5.z.f353948a;
                    if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(pl2.x.class);
                    kotlin.jvm.internal.o.f(a17, "get(...)");
                    pl2.x xVar = (pl2.x) a17;
                    if (xVar.f356683f) {
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("inSideBarStatus, is NUll? ");
                        sb7.append(xVar.f356684g == null);
                        com.tencent.mars.xlog.Log.i("Finder.LiveScreenClearPlugin", sb7.toString());
                        xVar.f356687m.f356678h = 3;
                        pl2.s sVar = xVar.f356684g;
                        if (sVar != null) {
                            pl2.s.e(sVar, 0L, null, 3, null);
                        }
                    } else {
                        u1(bool != null ? bool.booleanValue() : !((mm2.c1) P0(mm2.c1.class)).N1);
                    }
                }
                boolean z17 = ((mm2.c1) P0(mm2.c1.class)).N1;
                android.view.ViewGroup viewGroup = this.f365323d;
                if (z17) {
                    if (zl2.r4.f473950a.I0().getBoolean("FRAME_SCALE_TIPS_SHOW_KEY", true) && this.f115058y == 1 && !this.A) {
                        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                        this.f115055v = com.tencent.mm.plugin.finder.live.util.y.m(this, kotlinx.coroutines.internal.b0.f310484a, null, new com.tencent.mm.plugin.finder.live.plugin.q80(this, null), 2, null);
                    }
                    this.f115059z = true;
                } else {
                    viewGroup.post(new com.tencent.mm.plugin.finder.live.plugin.r80(this));
                    w1();
                    on0.b bVar = this.D;
                    if (bVar != null) {
                        bVar.f346762b = false;
                        bVar.f346782v = false;
                        bVar.f346781u = false;
                        bVar.f346775o = 0.0f;
                        bVar.f346776p = 0.0f;
                        bVar.f346777q = 0.0f;
                        bVar.f346778r = 0.0f;
                        bVar.f346780t = 1.0f;
                        bVar.f346774n = 0.0f;
                        bVar.f346773m = new android.graphics.PointF();
                        bVar.f346770j = new android.graphics.PointF();
                        bVar.f346771k = 0;
                        bVar.f346772l = new android.graphics.PointF();
                        bVar.a();
                    }
                    v1();
                }
                if (((mm2.c1) P0(mm2.c1.class)).g8()) {
                    if (((mm2.c1) P0(mm2.c1.class)).N1) {
                        com.tencent.mm.plugin.finder.live.plugin.gl0 gl0Var = (com.tencent.mm.plugin.finder.live.plugin.gl0) X0(com.tencent.mm.plugin.finder.live.plugin.gl0.class);
                        if (gl0Var != null) {
                            if (gl0Var.f112712p == null) {
                                android.view.ViewGroup viewGroup2 = gl0Var.f365323d;
                                gl0Var.f112712p = viewGroup2.findViewById(com.tencent.mm.R.id.fko);
                                java.lang.StringBuilder sb8 = new java.lang.StringBuilder("init vrTipGroup:");
                                android.view.View view2 = gl0Var.f112712p;
                                sb8.append(view2 != null ? view2.hashCode() : 0);
                                com.tencent.mars.xlog.Log.i("FinderLiveVisitorVRActionTipsLazyPlugin", sb8.toString());
                                android.view.View view3 = gl0Var.f112712p;
                                if (view3 != null) {
                                    com.tencent.mm.ui.bk.r0(((android.widget.TextView) view3.findViewById(com.tencent.mm.R.id.fqn)).getPaint(), 0.8f);
                                    com.tencent.mm.ui.bk.r0(((android.widget.TextView) view3.findViewById(com.tencent.mm.R.id.fqm)).getPaint(), 0.8f);
                                    view3.setPadding(view3.getPaddingLeft(), view3.getPaddingTop(), view3.getPaddingRight(), com.tencent.mm.ui.zk.a(viewGroup2.getContext(), 32) + com.tencent.mm.ui.bl.c(viewGroup2.getContext()));
                                }
                            }
                            android.view.View view4 = gl0Var.f112712p;
                            if (view4 != null) {
                                ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
                                ml2.x4[] x4VarArr = ml2.x4.f328234d;
                                r0Var.Mk(java.lang.String.valueOf(5));
                                view4.animate().alpha(1.0f).translationY(0.0f).withStartAction(new com.tencent.mm.plugin.finder.live.plugin.el0(view4, gl0Var)).withEndAction(new com.tencent.mm.plugin.finder.live.plugin.fl0(gl0Var)).start();
                            }
                        }
                        viewGroup.post(new com.tencent.mm.plugin.finder.live.plugin.s80(this));
                    } else {
                        com.tencent.mm.plugin.finder.live.plugin.gl0 gl0Var2 = (com.tencent.mm.plugin.finder.live.plugin.gl0) X0(com.tencent.mm.plugin.finder.live.plugin.gl0.class);
                        if (gl0Var2 != null && (view = gl0Var2.f112712p) != null) {
                            view.removeCallbacks((java.lang.Runnable) ((jz5.n) gl0Var2.f112713q).getValue());
                            view.animate().alpha(0.0f).translationY(com.tencent.mm.ui.bl.b(gl0Var2.f365323d.getContext()).y / 2.0f).withEndAction(new com.tencent.mm.plugin.finder.live.plugin.dl0(view, gl0Var2)).start();
                        }
                        viewGroup.post(new com.tencent.mm.plugin.finder.live.plugin.t80(this));
                    }
                }
                return true;
            }
        }
        return false;
    }
}
