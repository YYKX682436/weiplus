package pp1;

/* loaded from: classes14.dex */
public final class z implements androidx.lifecycle.y, gp1.y, pp1.a0 {
    public static boolean B;
    public static final android.view.animation.Interpolator C = com.tencent.mm.ui.tools.c3.a(com.tencent.mm.ui.tools.b3.EASE);
    public static final android.view.animation.Interpolator D = com.tencent.mm.ui.tools.c3.a(com.tencent.mm.ui.tools.b3.EASE_IN_OUT);
    public int A;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.ball.view.ContentFloatBallRecyclerView f357446d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.ball.view.FloatBackgroundView f357447e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.ball.view.ContentFloatBallView f357448f;

    /* renamed from: g, reason: collision with root package name */
    public int f357449g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f357450h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f357451i;

    /* renamed from: m, reason: collision with root package name */
    public int f357452m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f357453n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f357454o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f357455p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f357456q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f357457r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f357458s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f357459t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f357460u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f357461v;

    /* renamed from: w, reason: collision with root package name */
    public int f357462w;

    /* renamed from: x, reason: collision with root package name */
    public int f357463x;

    /* renamed from: y, reason: collision with root package name */
    public int f357464y;

    /* renamed from: z, reason: collision with root package name */
    public int f357465z;

    public z(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f357451i = new java.util.ArrayList();
        this.f357453n = jz5.h.b(pp1.o.f357432d);
        this.f357456q = jz5.h.b(pp1.n.f357431d);
        this.f357457r = jz5.h.b(new pp1.u(this));
        this.f357458s = jz5.h.b(new pp1.t(this));
        this.f357459t = jz5.h.b(new pp1.c(this));
        this.f357460u = jz5.h.b(new pp1.s(context, this));
        this.f357461v = jz5.h.b(new pp1.x(this));
        this.f357462w = -1;
        this.f357463x = -1;
        this.f357464y = -1;
        this.f357465z = -1;
    }

    public static final void c(pp1.z zVar) {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager;
        com.tencent.mm.plugin.ball.view.ContentFloatBallRecyclerView contentFloatBallRecyclerView = zVar.f357446d;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager2 = contentFloatBallRecyclerView != null ? contentFloatBallRecyclerView.getLayoutManager() : null;
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager2 instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager2 : null;
        if (linearLayoutManager == null) {
            return;
        }
        int itemCount = linearLayoutManager.getItemCount();
        for (int i17 = 0; i17 < itemCount; i17++) {
            com.tencent.mm.plugin.ball.view.ContentFloatBallRecyclerView contentFloatBallRecyclerView2 = zVar.f357446d;
            android.view.View findViewByPosition = (contentFloatBallRecyclerView2 == null || (layoutManager = contentFloatBallRecyclerView2.getLayoutManager()) == null) ? null : layoutManager.findViewByPosition(i17);
            if (findViewByPosition == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FloatBall.FloatBallRecyclerViewHelperV2", "checkResetAllItem itemView is null");
            } else {
                com.tencent.mm.plugin.ball.view.ContentFloatBallRecyclerView contentFloatBallRecyclerView3 = zVar.f357446d;
                androidx.recyclerview.widget.k3 m07 = contentFloatBallRecyclerView3 != null ? contentFloatBallRecyclerView3.m0(findViewByPosition) : null;
                if (m07 instanceof lp1.b) {
                    lp1.b bVar = (lp1.b) m07;
                    bVar.x();
                    com.tencent.mm.view.shadow.layout.WxShadowLinearLayout wxShadowLinearLayout = bVar.f320269n;
                    wxShadowLinearLayout.setPivotX(0.0f);
                    wxShadowLinearLayout.setPivotY(0.0f);
                    wxShadowLinearLayout.setScaleX(1.0f);
                    wxShadowLinearLayout.setScaleY(1.0f);
                    wxShadowLinearLayout.setAlpha(1.0f);
                    wxShadowLinearLayout.setTranslationX(0.0f);
                    wxShadowLinearLayout.setTranslationY(0.0f);
                    android.view.View view = bVar.f320275t;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(java.lang.Float.valueOf(0.0f));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/ball/convert/FloatBallViewHolder", "reset", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/ball/convert/FloatBallViewHolder", "reset", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                }
            }
        }
    }

    @Override // gp1.y
    public void X(java.util.List ballInfoList, com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        kotlin.jvm.internal.o.g(ballInfoList, "ballInfoList");
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBall.FloatBallRecyclerViewHelperV2", "onFloatBallInfoChanged ballInfoList size: " + ballInfoList.size() + ", lastShowSize: " + this.f357452m);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = 0;
        for (java.lang.Object obj : ballInfoList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.tencent.mm.plugin.ball.model.BallInfo ballInfo2 = (com.tencent.mm.plugin.ball.model.BallInfo) obj;
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBall.FloatBallRecyclerViewHelperV2", "getData info type: " + ballInfo2.f93046d + ", key: " + ballInfo2.f93049g + ", name: " + ballInfo2.f93063x);
            if (!ballInfo2.f93045J) {
                arrayList.add(new pp1.a(ballInfo2, i17));
            }
            i17 = i18;
        }
        java.util.ArrayList arrayList2 = this.f357451i;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        if (!this.f357454o) {
            l();
        }
        u();
        if (B) {
            return;
        }
        ku5.u0 u0Var = ku5.t0.f312615d;
        pp1.v vVar = new pp1.v(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(vVar, 200L, false);
    }

    public final int d(int i17, boolean z17, int i18) {
        return z17 ? ((i18 - 1) - i17) * qp1.c0.f365700i : (-i17) * qp1.c0.f365700i;
    }

    public int e() {
        return this.f357451i.size();
    }

    public final com.tencent.mm.view.recyclerview.WxLinearLayoutManager f() {
        return (com.tencent.mm.view.recyclerview.WxLinearLayoutManager) ((jz5.n) this.f357460u).getValue();
    }

    public final android.view.View g(android.view.View view) {
        if (view != null) {
            return view.findViewById(com.tencent.mm.R.id.f483337sh2);
        }
        return null;
    }

    @Override // androidx.lifecycle.y
    /* renamed from: getLifecycle */
    public androidx.lifecycle.o mo133getLifecycle() {
        return (androidx.lifecycle.b0) ((jz5.n) this.f357458s).getValue();
    }

    public final void h() {
        com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView = this.f357448f;
        if (contentFloatBallView != null) {
            this.f357449g = this.f357454o ? contentFloatBallView.m(contentFloatBallView.w()) : contentFloatBallView.n(contentFloatBallView.w());
        }
    }

    public boolean i() {
        com.tencent.mm.plugin.ball.view.ContentFloatBallRecyclerView contentFloatBallRecyclerView = this.f357446d;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = contentFloatBallRecyclerView != null ? contentFloatBallRecyclerView.getLayoutManager() : null;
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return false;
        }
        int w17 = linearLayoutManager.w();
        this.f357462w = w17;
        android.view.View findViewByPosition = linearLayoutManager.findViewByPosition(w17);
        if (findViewByPosition == null) {
            return false;
        }
        findViewByPosition.getLeft();
        com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView = this.f357448f;
        this.f357465z = contentFloatBallView != null ? contentFloatBallView.m(false) : 0;
        h();
        return true;
    }

    public boolean j() {
        com.tencent.mm.plugin.ball.view.ContentFloatBallRecyclerView contentFloatBallRecyclerView = this.f357446d;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = contentFloatBallRecyclerView != null ? contentFloatBallRecyclerView.getLayoutManager() : null;
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return false;
        }
        int y17 = linearLayoutManager.y();
        this.f357463x = y17;
        android.view.View findViewByPosition = linearLayoutManager.findViewByPosition(y17);
        if (findViewByPosition == null) {
            return false;
        }
        findViewByPosition.getRight();
        com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView = this.f357448f;
        this.f357464y = contentFloatBallView != null ? contentFloatBallView.n(false) : 0;
        h();
        return true;
    }

    public void k() {
        this.f357462w = -1;
        this.f357463x = -1;
        this.f357464y = -1;
        this.f357465z = -1;
        this.A = 0;
    }

    public final void l() {
        java.util.ArrayList arrayList = this.f357451i;
        kotlin.jvm.internal.o.g(arrayList, "<this>");
        java.util.Collections.reverse(arrayList);
        java.util.Iterator it = arrayList.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            pp1.a aVar = (pp1.a) next;
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBall.FloatBallRecyclerViewHelperV2", "reverseShowList index: " + i17 + ", item: " + aVar.f357393d.f93063x);
            aVar.f357394e = i17;
            i17 = i18;
        }
    }

    public void m(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBall.FloatBallRecyclerViewHelperV2", "setExpandFlag isExpand: " + z17);
        B = z17;
    }

    public final void n(boolean z17, boolean z18, float f17, float f18, boolean z19) {
        com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView = this.f357448f;
        if (contentFloatBallView != null) {
            if (!z18) {
                f17 = 0.0f;
            }
            contentFloatBallView.K(z18, z17, f18, z19, java.lang.Float.valueOf(f17));
        }
    }

    public final void o(boolean z17, android.view.View view, int i17, int i18, float f17, float f18, boolean z18) {
        if (view == null) {
            return;
        }
        com.tencent.mm.plugin.ball.view.ContentFloatBallRecyclerView contentFloatBallRecyclerView = this.f357446d;
        android.view.ViewGroup.LayoutParams layoutParams = null;
        androidx.recyclerview.widget.k3 m07 = contentFloatBallRecyclerView != null ? contentFloatBallRecyclerView.m0(view) : null;
        if (m07 instanceof lp1.b) {
            lp1.b bVar = (lp1.b) m07;
            if (z18) {
                bVar.x();
                return;
            }
            com.tencent.mm.view.shadow.layout.WxShadowLinearLayout wxShadowLinearLayout = bVar.f320269n;
            if (!(z17 && i17 == i18 - 1) && (z17 || i17 != 0)) {
                wxShadowLinearLayout.setAlpha(1.0f);
                bVar.x();
                return;
            }
            float f19 = pp1.b.f357396e;
            int i19 = (int) ((com.tencent.mm.plugin.ball.view.ContentFloatBallCollapseView.f93385q * f18) + ((1 - f18) * f19));
            int i27 = (int) (com.tencent.mm.plugin.ball.view.ContentFloatBallCollapseView.f93386r * f18);
            com.tencent.mm.ui.widget.RoundCornerRelativeLayout roundCornerRelativeLayout = bVar.f320271p;
            qp1.g0.e(roundCornerRelativeLayout, i19, i27);
            com.tencent.mm.plugin.ball.view.FloatBallRoundCornerFrameLayout floatBallRoundCornerFrameLayout = bVar.f320272q;
            qp1.g0.e(floatBallRoundCornerFrameLayout, i19, i27);
            android.view.ViewGroup.LayoutParams layoutParams2 = roundCornerRelativeLayout.getLayoutParams();
            if (layoutParams2 == null) {
                layoutParams2 = null;
            } else if (layoutParams2 instanceof android.widget.RelativeLayout.LayoutParams) {
                int i28 = (int) f19;
                if (z17) {
                    ((android.widget.RelativeLayout.LayoutParams) layoutParams2).setMargins(i28, i28, (int) (f19 * f18), i28);
                } else {
                    ((android.widget.RelativeLayout.LayoutParams) layoutParams2).setMargins((int) (f19 * f18), i28, i28, i28);
                }
            }
            roundCornerRelativeLayout.setLayoutParams(layoutParams2);
            android.view.ViewGroup.LayoutParams layoutParams3 = floatBallRoundCornerFrameLayout.getLayoutParams();
            if (layoutParams3 == null) {
                layoutParams3 = null;
            } else if (layoutParams3 instanceof android.widget.RelativeLayout.LayoutParams) {
                int i29 = (int) f19;
                if (z17) {
                    ((android.widget.RelativeLayout.LayoutParams) layoutParams3).setMargins(i29, i29, (int) (f19 * f18), i29);
                } else {
                    ((android.widget.RelativeLayout.LayoutParams) layoutParams3).setMargins((int) (f19 * f18), i29, i29, i29);
                }
            }
            floatBallRoundCornerFrameLayout.setLayoutParams(layoutParams3);
            android.widget.RelativeLayout relativeLayout = bVar.f320274s;
            relativeLayout.setAlpha(f17);
            if (f17 >= 0.5f) {
                wxShadowLinearLayout.setAlpha(java.lang.Math.max(0.0f, java.lang.Math.min(1.0f - ((f17 - 0.8f) / 0.2f), 1.0f)));
            }
            if (relativeLayout.getVisibility() != 0) {
                relativeLayout.setVisibility(0);
            }
            if (!kotlin.jvm.internal.o.b(bVar.f320276u, java.lang.Boolean.valueOf(z17))) {
                bVar.f320276u = java.lang.Boolean.valueOf(z17);
                bVar.z(relativeLayout, z17);
                bVar.z(roundCornerRelativeLayout, z17);
                bVar.z(floatBallRoundCornerFrameLayout, z17);
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView = bVar.f320273r;
                android.view.ViewGroup.LayoutParams layoutParams4 = weImageView.getLayoutParams();
                if (layoutParams4 != null) {
                    if (layoutParams4 instanceof android.widget.RelativeLayout.LayoutParams) {
                        if (z17) {
                            android.widget.RelativeLayout.LayoutParams layoutParams5 = (android.widget.RelativeLayout.LayoutParams) layoutParams4;
                            layoutParams5.removeRule(18);
                            layoutParams5.addRule(19, com.tencent.mm.R.id.sgz);
                        } else {
                            android.widget.RelativeLayout.LayoutParams layoutParams6 = (android.widget.RelativeLayout.LayoutParams) layoutParams4;
                            layoutParams6.removeRule(19);
                            layoutParams6.addRule(18, com.tencent.mm.R.id.sgz);
                        }
                    }
                    layoutParams = layoutParams4;
                }
                weImageView.setLayoutParams(layoutParams);
            }
            bVar.y();
        }
    }

    public void p(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBall.FloatBallRecyclerViewHelperV2", "updateDockLeftForDrawingOrder isDockLeft: " + z17);
        this.f357454o = z17;
        ((com.tencent.mm.plugin.ball.ui.floatball.FloatBallLiveList) ((jz5.n) this.f357457r).getValue()).getClass();
    }

    public final void q(boolean z17, float f17) {
        com.tencent.mm.plugin.ball.view.FloatBackgroundView floatBackgroundView;
        if (!z17) {
            com.tencent.mm.plugin.ball.view.FloatBackgroundView floatBackgroundView2 = this.f357447e;
            if (!((floatBackgroundView2 == null || floatBackgroundView2.getF93440e()) ? false : true) || (floatBackgroundView = this.f357447e) == null) {
                return;
            }
            floatBackgroundView.a(false);
            return;
        }
        com.tencent.mm.plugin.ball.view.FloatBackgroundView floatBackgroundView3 = this.f357447e;
        if (floatBackgroundView3 != null) {
            floatBackgroundView3.a(true);
        }
        com.tencent.mm.plugin.ball.view.FloatBackgroundView floatBackgroundView4 = this.f357447e;
        if (floatBackgroundView4 == null || floatBackgroundView4.f93440e) {
            return;
        }
        floatBackgroundView4.setAlpha(f17);
    }

    public final void r(boolean z17, android.view.View view, int i17, int i18, float f17, boolean z18) {
        android.view.View findViewById = view != null ? view.findViewById(com.tencent.mm.R.id.f483336sh1) : null;
        if (z17) {
            float max = java.lang.Math.max(0.0f, java.lang.Math.min(1.0f, ((i18 - i17) - 1) * 0.25f));
            float f18 = max + (f17 * (0.0f - max));
            if (findViewById == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(f18));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/ball/ui/floatball/FloatBallRecyclerViewHelperV2", "updateItemMaskAlpha", "(ZLandroid/view/View;IIFZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            findViewById.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/ball/ui/floatball/FloatBallRecyclerViewHelperV2", "updateItemMaskAlpha", "(ZLandroid/view/View;IIFZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            return;
        }
        float max2 = java.lang.Math.max(0.0f, java.lang.Math.min(1.0f, i17 * 0.25f));
        float f19 = max2 + (f17 * (0.0f - max2));
        if (findViewById == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(java.lang.Float.valueOf(f19));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/ball/ui/floatball/FloatBallRecyclerViewHelperV2", "updateItemMaskAlpha", "(ZLandroid/view/View;IIFZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        findViewById.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/ball/ui/floatball/FloatBallRecyclerViewHelperV2", "updateItemMaskAlpha", "(ZLandroid/view/View;IIFZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    public final void s(android.view.View view, float f17) {
        if (view != null) {
            view.setPivotX(0.0f);
            view.setPivotY(view.getHeight() / 2.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/ball/ui/floatball/FloatBallRecyclerViewHelperV2", "updateItemTransX", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/ball/ui/floatball/FloatBallRecyclerViewHelperV2", "updateItemTransX", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setTranslationX(f17);
            view.setTranslationY(0.0f);
        }
    }

    public final void t(float f17, boolean z17) {
        if (z17) {
            com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView = this.f357448f;
            if (contentFloatBallView != null) {
                contentFloatBallView.U(f17);
                return;
            }
            return;
        }
        com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView2 = this.f357448f;
        if (contentFloatBallView2 != null) {
            contentFloatBallView2.U(1.0f);
        }
    }

    public final void u() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateShowData isExpanded ");
        sb6.append(B);
        sb6.append(", showSize: ");
        java.util.ArrayList arrayList = this.f357451i;
        sb6.append(arrayList.size());
        sb6.append(", lastShowSize: ");
        sb6.append(this.f357452m);
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBall.FloatBallRecyclerViewHelperV2", sb6.toString());
        this.f357452m = arrayList.size();
        ((com.tencent.mm.plugin.ball.ui.floatball.FloatBallLiveList) ((jz5.n) this.f357457r).getValue()).z(new pp1.y(this));
    }
}
