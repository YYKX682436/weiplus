package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class bl extends com.tencent.mm.ui.component.UIComponent implements com.tencent.mm.plugin.finder.view.ka {
    public static final com.tencent.mm.plugin.finder.viewmodel.component.ei M = new com.tencent.mm.plugin.finder.viewmodel.component.ei(null);
    public static final java.util.Set N = kz5.z.D0(new java.lang.Integer[]{3, 4, 35, 39});
    public final jz5.g A;
    public final jz5.g B;
    public final jz5.g C;
    public final jz5.g D;
    public int E;
    public int F;
    public boolean G;
    public boolean H;
    public long I;

    /* renamed from: J, reason: collision with root package name */
    public so2.j5 f133890J;
    public boolean K;
    public final jz5.g L;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f133891d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f133892e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f133893f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f133894g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f133895h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f133896i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f133897m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f133898n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f133899o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f133900p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f133901q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f133902r;

    /* renamed from: s, reason: collision with root package name */
    public final int f133903s;

    /* renamed from: t, reason: collision with root package name */
    public final int f133904t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f133905u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f133906v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f133907w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f133908x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f133909y;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f133910z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bl(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f133891d = jz5.h.b(com.tencent.mm.plugin.finder.viewmodel.component.al.f133783d);
        this.f133893f = jz5.h.b(com.tencent.mm.plugin.finder.viewmodel.component.fj.f134409d);
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        this.f133894g = ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.R).getValue()).r()).booleanValue();
        cq.k1.a();
        this.f133895h = ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.S).getValue()).r()).booleanValue();
        this.f133896i = "";
        this.f133898n = "";
        this.f133899o = "";
        this.f133900p = "";
        this.f133901q = "";
        this.f133903s = activity.getResources().getColor(com.tencent.mm.R.color.f479261ud);
        this.f133904t = activity.getResources().getColor(com.tencent.mm.R.color.f479252u4);
        activity.getResources().getColor(com.tencent.mm.R.color.f478714f5);
        activity.getResources().getColor(com.tencent.mm.R.color.f478873jj);
        activity.getResources().getColor(com.tencent.mm.R.color.f479241tt);
        this.f133905u = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.ji(this));
        jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.ki(this));
        this.f133906v = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.ak(this));
        jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.zj(this));
        this.f133907w = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.yj(this));
        jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.xj(this));
        jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.hj(this));
        this.f133908x = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.ej(this));
        this.f133909y = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.zk(this));
        this.f133910z = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.cj(this));
        this.A = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.bj(this));
        this.B = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.ij(this));
        jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.lk(this));
        jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.mk(this));
        this.C = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.jk(this));
        this.D = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.kk(this));
        this.E = -1;
        this.F = -1;
        this.L = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.gj(this));
    }

    public static final java.util.Map i7(com.tencent.mm.plugin.finder.viewmodel.component.bl blVar, android.view.View view) {
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(zy2.ra.class))).V6();
        in5.c Lj = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Lj(blVar.getActivity());
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = Lj instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) Lj : null;
        long itemId = baseFinderFeed != null ? baseFinderFeed.getItemId() : 0L;
        android.app.Activity context2 = blVar.getContext();
        kotlin.jvm.internal.o.g(context2, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context2 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        return kz5.c1.l(new jz5.l("session_buffer", ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).ek(itemId, baseFinderFeed != null ? baseFinderFeed.w() : null, nyVar != null ? nyVar.V6().getInteger(5) : 0)), new jz5.l("finder_tab_context_id", V6.getString(2)), new jz5.l("finder_context_id", V6.getString(1)), new jz5.l("comment_scene", java.lang.Integer.valueOf(V6.getInteger(5))), new jz5.l("feed_id", pm0.v.u(itemId)));
    }

    public static void o7(com.tencent.mm.plugin.finder.viewmodel.component.bl blVar, com.tencent.mm.plugin.finder.view.FinderEdgeTransparentView finderEdgeTransparentView, android.widget.HorizontalScrollView horizontalScrollView, int i17, int i18, int i19, java.lang.Object obj) {
        if ((i19 & 4) != 0) {
            i17 = 4;
        }
        if ((i19 & 8) != 0) {
            i18 = 8;
        }
        blVar.getClass();
        boolean canScrollHorizontally = horizontalScrollView.canScrollHorizontally(-1);
        boolean canScrollHorizontally2 = horizontalScrollView.canScrollHorizontally(1);
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (!canScrollHorizontally && !canScrollHorizontally2) {
            finderEdgeTransparentView.setEnable(false);
            return;
        }
        finderEdgeTransparentView.setEnable(true);
        if (canScrollHorizontally) {
            finderEdgeTransparentView.f131003t |= i18;
        } else {
            finderEdgeTransparentView.f131003t &= ~i18;
        }
        if (canScrollHorizontally2) {
            finderEdgeTransparentView.f131003t |= i17;
        } else {
            finderEdgeTransparentView.f131003t &= ~i17;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r1v25 */
    public static android.view.View p7(com.tencent.mm.plugin.finder.viewmodel.component.bl blVar, boolean z17, java.lang.String str, boolean z18, int i17, java.lang.Object obj) {
        ?? r17;
        android.view.View view;
        android.widget.FrameLayout frameLayout;
        android.view.View view2;
        android.view.View view3;
        android.widget.TextView textView;
        java.lang.String str2 = (i17 & 2) != 0 ? "" : str;
        boolean z19 = (i17 & 4) != 0 ? true : z18;
        blVar.getClass();
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.I3).getValue()).r()).intValue() == 1 && !((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode()) {
            com.tencent.mars.xlog.Log.i("Finder.HomeActionBarUIC", "[showRedDotBubble] isShow=" + z17 + " tips=" + str2 + " isWithAnim=" + z19);
            android.view.View findViewById = blVar.findViewById(com.tencent.mm.R.id.jtz);
            if (findViewById != null && (z17 || findViewById.getVisibility() != 8)) {
                if (z17) {
                    blVar.K = true;
                }
                jz5.g gVar = blVar.A;
                android.view.View findViewById2 = ((android.view.View) ((jz5.n) gVar).getValue()).findViewById(com.tencent.mm.R.id.kts);
                android.widget.FrameLayout c76 = blVar.c7();
                android.view.View findViewById3 = ((android.view.View) ((jz5.n) gVar).getValue()).findViewById(com.tencent.mm.R.id.nfb);
                if (z17) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(4);
                    java.util.Collections.reverse(arrayList);
                    r17 = 0;
                    view = findViewById3;
                    frameLayout = c76;
                    view2 = findViewById2;
                    yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC", "showRedDotBubble", "(ZLjava/lang/String;Z)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC", "showRedDotBubble", "(ZLjava/lang/String;Z)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    r17 = 0;
                    view = findViewById3;
                    frameLayout = c76;
                    view2 = findViewById2;
                }
                android.view.ViewPropertyAnimator animate = view.animate();
                if (animate != null) {
                    animate.cancel();
                }
                android.view.ViewPropertyAnimator animate2 = frameLayout.animate();
                if (animate2 != null) {
                    animate2.cancel();
                }
                android.view.ViewPropertyAnimator animate3 = view2.animate();
                if (animate3 != null) {
                    animate3.cancel();
                }
                android.view.ViewPropertyAnimator animate4 = findViewById.animate();
                if (animate4 != null) {
                    animate4.cancel();
                }
                if (z17 && (textView = (android.widget.TextView) findViewById.findViewById(com.tencent.mm.R.id.lql)) != null) {
                    com.tencent.mm.ui.fk.a(textView);
                    d92.f.f227470a.l(textView, 14.0f, r17);
                    textView.setText(str2);
                }
                java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
                if (!n3.x0.c(findViewById) || findViewById.isLayoutRequested()) {
                    view3 = findViewById;
                    view3.addOnLayoutChangeListener(new com.tencent.mm.plugin.finder.viewmodel.component.rk(findViewById, z17, blVar, view, frameLayout, view2, z19));
                } else {
                    float width = findViewById.getWidth() - (findViewById.getContext().getResources().getDisplayMetrics().widthPixels / 4.0f);
                    if (z17) {
                        com.tencent.mm.plugin.finder.view.FinderEdgeTransparentView finderEdgeTransparentView = (com.tencent.mm.plugin.finder.view.FinderEdgeTransparentView) blVar.findViewById(com.tencent.mm.R.id.nuq);
                        if (finderEdgeTransparentView != null) {
                            finderEdgeTransparentView.setEdgeWidth(2 * width);
                            finderEdgeTransparentView.setEnable(width > 0.0f ? true : r17);
                        }
                        view.animate().alpha(0.0f).setDuration(300L).setStartDelay(400L).start();
                        frameLayout.animate().alpha(0.0f).setDuration(300L).setStartDelay(400L).start();
                        view2.animate().alpha(0.0f).setDuration(300L).setStartDelay(400L).start();
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                        arrayList2.add(java.lang.Integer.valueOf((int) r17));
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC", "showRedDotBubble", "(ZLjava/lang/String;Z)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((java.lang.Integer) arrayList2.get(r17)).intValue());
                        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC", "showRedDotBubble", "(ZLjava/lang/String;Z)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setTranslationX(findViewById.getWidth() + findViewById.getPaddingStart() + findViewById.getPaddingEnd());
                        findViewById.animate().translationX(0.0f).setDuration(400L).setStartDelay(460L).start();
                        findViewById.postDelayed(new com.tencent.mm.plugin.finder.viewmodel.component.sk(blVar), 15000L);
                    } else if (findViewById.getVisibility() == 0) {
                        if (z19) {
                            view.animate().alpha(1.0f).setDuration(300L).start();
                            frameLayout.animate().alpha(1.0f).setDuration(300L).start();
                            view2.animate().alpha(1.0f).setDuration(300L).start();
                            findViewById.animate().translationX(findViewById.getWidth() + findViewById.getPaddingStart() + findViewById.getPaddingEnd()).setDuration(300L).setListener(new com.tencent.mm.plugin.finder.viewmodel.component.tk(findViewById, blVar)).start();
                        } else {
                            com.tencent.mm.plugin.finder.view.FinderEdgeTransparentView finderEdgeTransparentView2 = (com.tencent.mm.plugin.finder.view.FinderEdgeTransparentView) blVar.findViewById(com.tencent.mm.R.id.nuq);
                            if (finderEdgeTransparentView2 != 0) {
                                finderEdgeTransparentView2.setEnable(r17);
                            }
                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                            arrayList3.add(java.lang.Float.valueOf(1.0f));
                            java.util.Collections.reverse(arrayList3);
                            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC", "showRedDotBubble", "(ZLjava/lang/String;Z)Landroid/view/View;", "android/view/View_EXEC_", "setAlpha", "(F)V");
                            android.view.View view4 = view;
                            view4.setAlpha(((java.lang.Float) arrayList3.get(r17)).floatValue());
                            yj0.a.f(view4, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC", "showRedDotBubble", "(ZLjava/lang/String;Z)Landroid/view/View;", "android/view/View_EXEC_", "setAlpha", "(F)V");
                            frameLayout.setAlpha(1.0f);
                            java.util.ArrayList arrayList4 = new java.util.ArrayList();
                            arrayList4.add(java.lang.Float.valueOf(1.0f));
                            java.util.Collections.reverse(arrayList4);
                            yj0.a.d(view2, arrayList4.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC", "showRedDotBubble", "(ZLjava/lang/String;Z)Landroid/view/View;", "android/view/View_EXEC_", "setAlpha", "(F)V");
                            android.view.View view5 = view2;
                            view5.setAlpha(((java.lang.Float) arrayList4.get(r17)).floatValue());
                            yj0.a.f(view5, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC", "showRedDotBubble", "(ZLjava/lang/String;Z)Landroid/view/View;", "android/view/View_EXEC_", "setAlpha", "(F)V");
                            java.util.ArrayList arrayList5 = new java.util.ArrayList();
                            arrayList5.add(8);
                            java.util.Collections.reverse(arrayList5);
                            yj0.a.d(findViewById, arrayList5.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC", "showRedDotBubble", "(ZLjava/lang/String;Z)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById.setVisibility(((java.lang.Integer) arrayList5.get(r17)).intValue());
                            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC", "showRedDotBubble", "(ZLjava/lang/String;Z)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                    }
                    view3 = findViewById;
                }
                return view3;
            }
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.view.ka
    public void G3(int i17, int i18, int i19, int i27) {
        if (i19 != -1) {
            com.tencent.mm.plugin.finder.report.v1.f125393a.q(i19, hc2.d0.b(i27));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x029f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O6() {
        /*
            Method dump skipped, instructions count: 726
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.component.bl.O6():void");
    }

    public final void P6(int i17, int i18) {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) getActivity().findViewById(i17);
        if (weImageView != null) {
            weImageView.setIconColor(i18);
            if (this.f133894g && V6(r7())) {
                java.lang.Object parent = weImageView.getParent();
                android.view.View view = parent instanceof android.view.View ? (android.view.View) parent : null;
                if (view != null) {
                    new d92.c(view, true).invoke();
                }
                new d92.c(weImageView, true).invoke();
                return;
            }
            java.lang.Object parent2 = weImageView.getParent();
            android.view.View view2 = parent2 instanceof android.view.View ? (android.view.View) parent2 : null;
            d92.f fVar = d92.f.f227470a;
            if (view2 != null) {
                d92.f.o(fVar, view2, true, false, false, 4, null);
            }
            d92.f.o(fVar, weImageView, true, false, false, 4, null);
        }
    }

    public final void Q6() {
        ((c61.l7) i95.n0.c(c61.l7.class)).getClass();
        if (vd2.t3.f435921a.g()) {
            if ((com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A()) && com.tencent.mm.ui.bk.v0() && (com.tencent.mm.ui.bk.P(getActivity()) || (com.tencent.mm.ui.bk.O(getActivity().getContentResolver()) && !getActivity().isInMultiWindowMode()))) {
                android.view.View findViewById = findViewById(com.tencent.mm.R.id.nfb);
                if (findViewById != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC", "checkNearbyLiveFriends", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC", "checkNearbyLiveFriends", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.g8o);
                if (findViewById2 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC", "checkNearbyLiveFriends", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC", "checkNearbyLiveFriends", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.hza);
            if (findViewById3 == null) {
                return;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC", "checkNearbyLiveFriends", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC", "checkNearbyLiveFriends", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final void R6(int i17) {
        androidx.appcompat.app.AppCompatActivity context = getActivity();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        this.f133896i = com.tencent.mm.plugin.finder.extension.reddot.ha.f105557a.l(i17, nyVar != null ? nyVar.V6() : null, this.f133896i);
    }

    public final void S6() {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        if (activity != null && (com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A()) && com.tencent.mm.ui.bk.v0() && (com.tencent.mm.ui.bk.P(activity) || com.tencent.mm.ui.bk.N(activity.getTaskId()) || (com.tencent.mm.ui.bk.O(activity.getContentResolver()) && !activity.isInMultiWindowMode()))) {
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.nfb);
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC", "checkPostEntrance", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC", "checkPostEntrance", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.g8o);
            if (findViewById2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC", "checkPostEntrance", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC", "checkPostEntrance", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.nfb);
            if (findViewById3 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC", "checkPostEntrance", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC", "checkPostEntrance", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.hza);
        if (findViewById4 != null) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC", "checkPostEntrance", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(findViewById4, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC", "checkPostEntrance", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (g7()) {
            a7().setVisibility(0);
            android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.g8o);
            if (findViewById5 != null) {
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
                arrayList5.add(8);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(findViewById5, arrayList5.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC", "checkPostEntrance", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(findViewById5, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC", "checkPostEntrance", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            a7().setVisibility(8);
        }
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(a7(), "post_feed_3tab");
        aVar.Tj(a7(), 40, 1, false);
        aVar.Ai(a7(), new com.tencent.mm.plugin.finder.viewmodel.component.si(this));
        q7();
    }

    public final void T6() {
        r45.ls2 ls2Var = (r45.ls2) g92.b.f269769e.k2().d().getCustom(26);
        boolean z17 = false;
        if (ls2Var != null && ls2Var.getInteger(0) == 1) {
            z17 = true;
        }
        if (z17) {
            android.widget.FrameLayout b76 = b7();
            if (b76 != null) {
                b76.setVisibility(8);
            }
            android.widget.FrameLayout c76 = c7();
            if (c76 == null) {
                return;
            }
            c76.setVisibility(8);
        }
    }

    public final void U6(int i17) {
        com.tencent.mars.xlog.Log.i("Finder.HomeActionBarUIC", "[doPrepareUser] isPreparing=" + this.f133902r + " status=" + i17);
        if (this.f133902r) {
            return;
        }
        this.f133902r = true;
        if (((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("TLPostCamera") == null) {
            ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("TLCamera");
        }
        pf5.e.launch$default(this, null, null, new com.tencent.mm.plugin.finder.viewmodel.component.aj(this, null), 3, null);
    }

    public final boolean V6(int i17) {
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Q).getValue()).r()).intValue() <= i17;
    }

    public final android.widget.LinearLayout W6() {
        return (android.widget.LinearLayout) ((jz5.n) this.f133905u).getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b2 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v13, types: [zx2.u] */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v4, types: [oa.i] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.tencent.mm.plugin.finder.viewmodel.component.gi X6(int r12) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.component.bl.X6(int):com.tencent.mm.plugin.finder.viewmodel.component.gi");
    }

    public final com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout Y6() {
        return (com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout) ((jz5.n) this.f133910z).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String Z6(long r7, java.lang.String r9) {
        /*
            r6 = this;
            xc2.y2 r0 = xc2.y2.f453343a
            android.app.Activity r1 = r6.getContext()
            r4 = 20
            r2 = r7
            r5 = r9
            java.util.List r9 = r0.l(r1, r2, r4, r5)
            r0 = 0
            if (r9 == 0) goto L4b
            java.lang.Object r9 = kz5.n0.Z(r9)
            xc2.t r9 = (xc2.t) r9
            if (r9 == 0) goto L4b
            java.util.List r9 = r9.f453302d
            if (r9 == 0) goto L4b
            java.util.Iterator r9 = r9.iterator()
        L21:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L3b
            java.lang.Object r1 = r9.next()
            r2 = r1
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r2 = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) r2
            xc2.y2 r3 = xc2.y2.f453343a
            int r2 = r2.getBusiness_type()
            boolean r2 = r3.A(r2)
            if (r2 == 0) goto L21
            goto L3c
        L3b:
            r1 = r0
        L3c:
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r1 = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) r1
            if (r1 == 0) goto L4b
            com.tencent.mm.protocal.protobuf.NativeInfo r9 = r1.getNative_info()
            if (r9 == 0) goto L4b
            java.lang.String r9 = r9.getNecessary_params()
            goto L4c
        L4b:
            r9 = r0
        L4c:
            if (r9 == 0) goto L4f
            goto L8b
        L4f:
            xc2.y2 r9 = xc2.y2.f453343a
            android.app.Activity r1 = r6.getContext()
            r2 = 16
            java.util.List r7 = r9.k(r1, r7, r2)
            if (r7 == 0) goto L8a
            java.util.Iterator r7 = r7.iterator()
        L61:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L7b
            java.lang.Object r8 = r7.next()
            r9 = r8
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r9 = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) r9
            xc2.y2 r1 = xc2.y2.f453343a
            int r9 = r9.getBusiness_type()
            boolean r9 = r1.A(r9)
            if (r9 == 0) goto L61
            goto L7c
        L7b:
            r8 = r0
        L7c:
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r8 = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) r8
            if (r8 == 0) goto L8a
            com.tencent.mm.protocal.protobuf.NativeInfo r7 = r8.getNative_info()
            if (r7 == 0) goto L8a
            java.lang.String r0 = r7.getNecessary_params()
        L8a:
            r9 = r0
        L8b:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.component.bl.Z6(long, java.lang.String):java.lang.String");
    }

    public final android.widget.FrameLayout a7() {
        return (android.widget.FrameLayout) ((jz5.n) this.f133906v).getValue();
    }

    public final android.widget.FrameLayout b7() {
        return (android.widget.FrameLayout) ((jz5.n) this.C).getValue();
    }

    public final android.widget.FrameLayout c7() {
        return (android.widget.FrameLayout) ((jz5.n) this.D).getValue();
    }

    public final android.widget.HorizontalScrollView d7() {
        return this.f133895h ? Y6() : e7();
    }

    public final com.google.android.material.tabs.TabLayout e7() {
        return (com.google.android.material.tabs.TabLayout) ((jz5.n) this.f133909y).getValue();
    }

    public final ey2.t0 f7() {
        return (ey2.t0) this.f133891d.getValue();
    }

    public final boolean g7() {
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127952tc).getValue()).r()).intValue() == 1) {
            i95.m c17 = i95.n0.c(l40.e.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            if (l40.e.dh((l40.e) c17, getContext(), null, 2, null) != 4 && !((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h7(int i17) {
        if (((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.y0().r()).intValue() == 1 && i17 == 3) {
            return true;
        }
        return i17 == 39 && ((ey2.h1) ((xy2.k) pf5.u.f353936a.e(zy2.b6.class).c(xy2.k.class))).O6();
    }

    public final void k7() {
        com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
        com.tencent.mm.plugin.finder.viewmodel.component.ny e17 = iyVar.e(getActivity());
        com.tencent.mm.plugin.finder.report.r0 a76 = e17 != null ? e17.a7(-1) : null;
        if (a76 instanceof com.tencent.mm.plugin.finder.report.k4) {
            com.tencent.mm.plugin.finder.report.k4.j1((com.tencent.mm.plugin.finder.report.k4) a76, hc2.k.a(kz5.b1.e(new jz5.l("feedActionType", 3))), false, 2, null);
        }
        R6(2);
        com.tencent.mm.plugin.finder.report.v1 v1Var = com.tencent.mm.plugin.finder.report.v1.f125393a;
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        v1Var.q(((com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.class)).S6(), 95);
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.finder.extension.reddot.jb L0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().L0("TLPersonalCenter");
        intent.putExtra("RED_DOT_EXIST_ON_ENTER", (L0 != null ? L0.I0("TLPersonalCenter") : null) != null);
        in5.c Lj = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Lj(getActivity());
        intent.putExtra("key_ref_feed_id", Lj != null ? Lj.getItemId() : 0L);
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = Lj instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) Lj : null;
        intent.putExtra("key_ref_feed_dup_flag", baseFinderFeed != null ? baseFinderFeed.w() : null);
        androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
        kotlin.jvm.internal.o.g(activity2, "activity");
        intent.putExtra("key_ref_comment_scene", ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135380n);
        com.tencent.mm.plugin.finder.viewmodel.component.iy.d(iyVar, getActivity(), intent, 0L, null, 0, 0, false, 0, null, 508, null);
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).qk(getActivity(), intent);
    }

    @Override // com.tencent.mm.plugin.finder.view.ka
    public void l(int i17, int i18, int i19, int i27) {
        this.E = i27;
        this.F = i19;
        com.tencent.mm.ui.bk.i0(getActivity().getWindow(), false);
        com.tencent.mm.ui.bk.h0(getActivity().getWindow(), false);
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((com.tencent.mm.ui.MMActivity) activity).setNavigationbarColor(getActivity().getResources().getColor(com.tencent.mm.R.color.f478712f3));
        android.view.View view = (android.view.View) ((jz5.n) this.A).getValue();
        if (view != null) {
            view.setBackground(null);
        }
        if (i17 != -1) {
            com.tencent.mm.plugin.finder.viewmodel.component.gi X6 = X6(this.E);
            if (X6 != null) {
                X6.b(this.f133903s, false);
            }
            com.tencent.mm.plugin.finder.viewmodel.component.gi X62 = X6(this.F);
            if (X62 != null) {
                X62.b(this.f133904t, true);
            }
        }
    }

    public final void l7() {
        java.lang.Object obj;
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        java.util.Iterator it = ((com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.class)).getFragments().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment) obj).f129265p == 4) {
                    break;
                }
            }
        }
        com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment finderHomeTabFragment = (com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment) obj;
        if (finderHomeTabFragment != null) {
            finderHomeTabFragment.f129263n = hc2.e.a() ? com.tencent.mm.R.string.f6h : com.tencent.mm.R.string.ms8;
        }
        com.tencent.mm.plugin.finder.viewmodel.component.gi X6 = X6(4);
        if (X6 != null) {
            if (hc2.e.a()) {
                X6.c(com.tencent.mm.R.string.f6h);
            } else {
                X6.c(com.tencent.mm.R.string.ms8);
            }
        }
    }

    public final void m7(android.view.View view) {
        boolean z17;
        if (view != null) {
            view.setOnClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.nk(this));
        }
        boolean z18 = false;
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.o0().r()).booleanValue()) {
            z17 = true;
        } else {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            z17 = false;
        }
        if (z17 || z65.c.a()) {
            z18 = true;
        } else {
            kb2.b bVar = kb2.b.f306225a;
        }
        if (z18) {
            view.setOnLongClickListener(com.tencent.mm.plugin.finder.viewmodel.component.ok.f135477d);
        }
    }

    public final void n7(int i17) {
        java.lang.Object k17;
        java.lang.Boolean valueOf;
        com.tencent.mm.plugin.finder.viewmodel.component.gi giVar = null;
        boolean z17 = this.f133895h;
        if (z17) {
            com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout Y6 = Y6();
            if (Y6 != null) {
                k17 = Y6.i(i17);
            }
            k17 = null;
        } else {
            com.google.android.material.tabs.TabLayout e76 = e7();
            if (e76 != null) {
                k17 = e76.k(i17);
            }
            k17 = null;
        }
        if (z17) {
            zx2.u uVar = k17 instanceof zx2.u ? (zx2.u) k17 : null;
            if (uVar != null) {
                valueOf = java.lang.Boolean.valueOf(uVar.a());
            }
            valueOf = null;
        } else {
            oa.i iVar = k17 instanceof oa.i ? (oa.i) k17 : null;
            if (iVar != null) {
                valueOf = java.lang.Boolean.valueOf(iVar.a());
            }
            valueOf = null;
        }
        if (kotlin.jvm.internal.o.b(valueOf, java.lang.Boolean.TRUE)) {
            return;
        }
        if (z17) {
            boolean z18 = k17 instanceof zx2.u;
            zx2.u uVar2 = z18 ? (zx2.u) k17 : null;
            if (uVar2 != null) {
                uVar2.b();
            }
            zx2.u uVar3 = z18 ? (zx2.u) k17 : null;
            java.lang.Object obj = uVar3 != null ? uVar3.f477081a : null;
            if (obj instanceof com.tencent.mm.plugin.finder.viewmodel.component.gi) {
                giVar = (com.tencent.mm.plugin.finder.viewmodel.component.gi) obj;
            }
        } else {
            boolean z19 = k17 instanceof oa.i;
            oa.i iVar2 = z19 ? (oa.i) k17 : null;
            if (iVar2 != null) {
                iVar2.b();
            }
            oa.i iVar3 = z19 ? (oa.i) k17 : null;
            java.lang.Object obj2 = iVar3 != null ? iVar3.f343778a : null;
            if (obj2 instanceof com.tencent.mm.plugin.finder.viewmodel.component.gi) {
                giVar = (com.tencent.mm.plugin.finder.viewmodel.component.gi) obj2;
            }
        }
        if (giVar == null) {
            return;
        }
        r45.nx2 nx2Var = f7().f257506i;
        nx2Var.set(5, 1);
        nx2Var.set(4, java.lang.Integer.valueOf(f7().f257508n));
        nx2Var.set(3, java.lang.Boolean.valueOf(((c61.l7) i95.n0.c(c61.l7.class)).nk().L0("TLRecommendTab") != null));
        nx2Var.set(2, java.lang.Boolean.valueOf(((c61.l7) i95.n0.c(c61.l7.class)).nk().L0("TLFollow") != null));
        nx2Var.set(1, java.lang.Boolean.valueOf(((c61.l7) i95.n0.c(c61.l7.class)).nk().L0("finder_tl_hot_tab") != null));
        nx2Var.set(0, java.lang.Boolean.valueOf(((c61.l7) i95.n0.c(c61.l7.class)).nk().L0("FinderEntrance") != null));
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        S6();
        Q6();
        T6();
        O6();
    }

    /* JADX WARN: Removed duplicated region for block: B:325:0x0937  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0a7b  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0a8c  */
    @Override // com.tencent.mm.ui.component.UIComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r38) {
        /*
            Method dump skipped, instructions count: 2742
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.component.bl.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateBefore(android.os.Bundle bundle) {
        super.onCreateBefore(bundle);
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        ((com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.class)).f133575o.add(this);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
    }

    @Override // com.tencent.mm.plugin.finder.view.ka
    public void onPageScrolled(int i17, float f17, int i18) {
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        this.f133897m = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e1, code lost:
    
        if (r3 != false) goto L37;
     */
    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.component.bl.onResume():void");
    }

    public final void q7() {
        android.widget.FrameLayout c76;
        if (g7()) {
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.kzq);
            if (findViewById != null && findViewById.getVisibility() == 0) {
                b7().setVisibility(0);
                c7().setVisibility(8);
                c76 = b7();
                kotlin.jvm.internal.o.f(c76, "<get-searchEntranceLayoutLeft>(...)");
                cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
                aVar.pk(c76, "search_3tab");
                aVar.Rj(c76, iy1.a.Finder);
                aVar.Tj(c76, 40, 1, false);
                aVar.Ai(c76, new com.tencent.mm.plugin.finder.viewmodel.component.uk(c76, this));
            }
        }
        b7().setVisibility(8);
        c7().setVisibility(0);
        c76 = c7();
        kotlin.jvm.internal.o.f(c76, "<get-searchEntranceLayoutRight>(...)");
        cy1.a aVar2 = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar2.pk(c76, "search_3tab");
        aVar2.Rj(c76, iy1.a.Finder);
        aVar2.Tj(c76, 40, 1, false);
        aVar2.Ai(c76, new com.tencent.mm.plugin.finder.viewmodel.component.uk(c76, this));
    }

    public final int r7() {
        return this.f133895h ? Y6().getTabCount() : e7().getTabCount();
    }

    @Override // com.tencent.mm.plugin.finder.view.ka
    public void z(boolean z17, int i17, com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment fragment) {
        kotlin.jvm.internal.o.g(fragment, "fragment");
    }
}
