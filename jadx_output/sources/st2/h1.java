package st2;

/* loaded from: classes3.dex */
public final class h1 implements android.view.View.OnClickListener {
    public android.view.View A;
    public androidx.recyclerview.widget.RecyclerView B;
    public androidx.recyclerview.widget.RecyclerView C;
    public android.view.View D;
    public android.view.View E;
    public android.view.View F;
    public android.view.View G;
    public android.view.View H;
    public final jz5.g I;

    /* renamed from: J, reason: collision with root package name */
    public xt2.u1 f412332J;
    public st2.p2 K;
    public st2.s1 L;
    public final jz5.g M;
    public boolean N;
    public final tt2.e1 P;
    public final tt2.a Q;
    public final tt2.e1 R;
    public st2.v1 S;
    public int T;
    public boolean U;
    public final java.util.Set V;
    public st2.i1 W;
    public final jz5.g X;
    public boolean Y;
    public final yz5.p Z;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f412333d;

    /* renamed from: e, reason: collision with root package name */
    public final qo0.c f412334e;

    /* renamed from: f, reason: collision with root package name */
    public final gk2.e f412335f;

    /* renamed from: g, reason: collision with root package name */
    public final dk2.xf f412336g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.plugin.l f412337h;

    /* renamed from: i, reason: collision with root package name */
    public ut2.j5 f412338i;

    /* renamed from: m, reason: collision with root package name */
    public ut2.h4 f412339m;

    /* renamed from: n, reason: collision with root package name */
    public ut2.k0 f412340n;

    /* renamed from: o, reason: collision with root package name */
    public ut2.m0 f412341o;

    /* renamed from: p, reason: collision with root package name */
    public ut2.u3 f412342p;

    /* renamed from: p0, reason: collision with root package name */
    public androidx.recyclerview.widget.v2 f412343p0;

    /* renamed from: q, reason: collision with root package name */
    public bc2.b f412344q;

    /* renamed from: r, reason: collision with root package name */
    public ut2.a4 f412345r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f412346s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingPanel f412347t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.widget.FinderLiveFixClickIssueRecyclerView f412348u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f412349v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f412350w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.ViewGroup f412351x;

    /* renamed from: x0, reason: collision with root package name */
    public final java.util.HashMap f412352x0;

    /* renamed from: y, reason: collision with root package name */
    public android.view.ViewGroup f412353y;

    /* renamed from: y0, reason: collision with root package name */
    public final java.util.List f412354y0;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.TextView f412355z;

    /* JADX WARN: Removed duplicated region for block: B:44:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x033d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public h1(android.view.ViewGroup r9, qo0.c r10, gk2.e r11, dk2.xf r12, com.tencent.mm.plugin.finder.live.plugin.l r13) {
        /*
            Method dump skipped, instructions count: 1266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: st2.h1.<init>(android.view.ViewGroup, qo0.c, gk2.e, dk2.xf, com.tencent.mm.plugin.finder.live.plugin.l):void");
    }

    public static /* synthetic */ void P(st2.h1 h1Var, android.os.Bundle bundle, int i17, boolean z17, boolean z18, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            i17 = 0;
        }
        if ((i18 & 4) != 0) {
            z17 = false;
        }
        if ((i18 & 8) != 0) {
            z18 = false;
        }
        h1Var.O(bundle, i17, z17, z18);
    }

    public static final int[] a(st2.h1 h1Var) {
        return (int[]) ((jz5.n) h1Var.X).getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
    
        if (r0.x0() == true) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(st2.h1 r6, l81.b1 r7) {
        /*
            com.tencent.mm.plugin.finder.live.plugin.l r0 = r6.f412337h
            if (r0 == 0) goto Lc
            boolean r1 = r0.x0()
            r2 = 1
            if (r1 != r2) goto Lc
            goto Ld
        Lc:
            r2 = 0
        Ld:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "openFullScreenMiniprogram isLandscape:"
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "Finder.LiveShoppingListPlugin"
            com.tencent.mars.xlog.Log.i(r3, r1)
            if (r2 == 0) goto L36
            zl2.r4 r1 = zl2.r4.f473950a
            boolean r1 = r1.x1()
            if (r1 != 0) goto L36
            if (r0 == 0) goto L39
            java.lang.String r1 = "PORTRAIT_ACTION_FULL_SCREEN_MINIPRO"
            r3 = 0
            r4 = 4
            r5 = 0
            r2 = r7
            com.tencent.mm.plugin.finder.live.plugin.l.s1(r0, r1, r2, r3, r4, r5)
            goto L39
        L36:
            r6.E(r7)
        L39:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: st2.h1.b(st2.h1, l81.b1):void");
    }

    public final void A() {
        if (!w() || this.U) {
            return;
        }
        gk2.e eVar = this.f412335f;
        if (((mm2.e1) eVar.a(mm2.e1.class)).f328988r.getLong(0) == 0) {
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.LiveShoppingListPlugin", "has notify visitor shopping:" + this.U);
        int i17 = this.T + 1;
        this.T = i17;
        if (i17 >= 3) {
            this.T = 0;
            return;
        }
        int i18 = (int) ((mm2.c1) eVar.a(mm2.c1.class)).f328866q;
        java.util.regex.Pattern pattern = pm0.v.f356802a;
        int i19 = i18 | 16;
        dk2.xf xfVar = this.f412336g;
        if (xfVar != null) {
            ((dk2.r4) xfVar).p0(((mm2.e1) eVar.a(mm2.e1.class)).f328988r.getLong(0), ((mm2.e1) eVar.a(mm2.e1.class)).f328983m, i19, 16L, 2, new st2.h0(this));
        }
    }

    public final void B(android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("Finder.LiveShoppingListPlugin", "refresh shop page,view visibility:" + this.f412333d.getVisibility());
        int i17 = w() ? 0 : 3;
        if (!(bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_SHOPPING_REFRESH_WHEN_OPEN", false) : false) || h().isShowing) {
            P(this, bundle, i17, true, false, 8, null);
        } else {
            com.tencent.mars.xlog.Log.i("Finder.LiveShoppingListPlugin", "onLiveShoppingRefresh, try to refresh when shopping list is not opened");
        }
    }

    public final void C(android.os.Bundle bundle) {
        com.tencent.mm.plugin.finder.live.plugin.l lVar = this.f412337h;
        if (lVar != null) {
            lVar.K0(8);
        }
        if (w()) {
            return;
        }
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0.Dj((ml2.r0) c17, ml2.f4.f327443q, null, null, null, null, null, 0, 0L, null, null, null, null, false, null, 16376, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x008e, code lost:
    
        if ((r0.T7() || r0.X7()) != false) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01b1  */
    /* JADX WARN: Type inference failed for: r14v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D(android.os.Bundle r48) {
        /*
            Method dump skipped, instructions count: 625
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: st2.h1.D(android.os.Bundle):void");
    }

    public final void E(l81.b1 b1Var) {
        st2.h2 h2Var;
        com.tencent.mm.plugin.finder.live.view.k0 Y0;
        dk2.q4 q4Var = dk2.q4.f233938a;
        android.content.Context context = this.f412333d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        gk2.e eVar = this.f412335f;
        com.tencent.mm.plugin.finder.live.plugin.l lVar = this.f412337h;
        if (lVar == null || (Y0 = lVar.Y0()) == null) {
            h2Var = null;
        } else {
            java.lang.String appId = b1Var.f317014b;
            kotlin.jvm.internal.o.f(appId, "appId");
            h2Var = new st2.h2(Y0, appId);
        }
        q4Var.l(context, eVar, b1Var, true, h2Var);
    }

    public final void F(l81.b1 b1Var) {
        dk2.q4 q4Var = dk2.q4.f233938a;
        android.content.Context context = this.f412333d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.live.plugin.l lVar = this.f412337h;
        q4Var.n(context, this.f412335f, b1Var, lVar != null ? lVar.Y0() : null);
    }

    public final void G() {
        android.content.Context context = this.f412333d.getContext();
        com.tencent.mm.ui.MMActivity mMActivity = context instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context : null;
        if (mMActivity == null) {
            com.tencent.mars.xlog.Log.e("Finder.LiveShoppingListPlugin", "refreshCouponList, context is not MMActivity");
            return;
        }
        com.tencent.mm.plugin.finder.live.plugin.l lVar = this.f412337h;
        if (lVar != null) {
            com.tencent.mm.plugin.finder.live.util.y.m(lVar, null, null, new st2.o0(mMActivity, this, null), 3, null);
        }
    }

    public final void H(tt2.e1 adapter) {
        kotlin.jvm.internal.o.g(adapter, "adapter");
        adapter.f421892w = this.Z;
        adapter.f421893x = new st2.q0(this);
        adapter.f421894y = new st2.r0(this, adapter);
        adapter.f421895z = new st2.s0(this);
        adapter.A = new st2.m(this);
    }

    public final void I(boolean z17) {
        java.lang.String string;
        if (p().getVisibility() != 0 || z17) {
            if (j().getVisibility() != 0 || z17) {
                android.view.View findViewById = k().t().findViewById(com.tencent.mm.R.id.flt);
                android.widget.TextView textView = (android.widget.TextView) findViewById;
                d92.f fVar = d92.f.f227470a;
                kotlin.jvm.internal.o.d(textView);
                fVar.h(textView, java.lang.Float.valueOf(12.0f));
                kotlin.jvm.internal.o.f(findViewById, "apply(...)");
                android.widget.TextView textView2 = (android.widget.TextView) findViewById;
                if (w()) {
                    android.view.View j17 = k().j();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(j17, arrayList.toArray(), "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "setMainListTopButton", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    j17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(j17, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "setMainListTopButton", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    string = "";
                } else {
                    android.view.View findViewById2 = k().j().findViewById(com.tencent.mm.R.id.fls);
                    kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
                    fVar.k(findViewById2, 20.0f, 20.0f);
                    android.view.View findViewById3 = k().j().findViewById(com.tencent.mm.R.id.flt);
                    kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
                    fVar.h((android.widget.TextView) findViewById3, java.lang.Float.valueOf(12.0f));
                    android.view.View j18 = k().j();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(j18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "setMainListTopButton", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    j18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(j18, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "setMainListTopButton", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    string = this.f412333d.getContext().getString(com.tencent.mm.R.string.eec);
                }
                textView2.setText(string);
            }
        }
    }

    public final void J() {
        java.util.LinkedList linkedList = ((mm2.f6) this.f412335f.a(mm2.f6.class)).f329043q;
        if (linkedList == null || linkedList.isEmpty()) {
            return;
        }
        t(false, false);
        ut2.a4 a4Var = this.f412345r;
        if (a4Var != null) {
            a4Var.b(false, w(), false);
        }
        l().setVisibility(8);
        android.view.View t17 = k().t();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(t17, arrayList.toArray(), "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "showCanUseCouponProductList", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        t17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(t17, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "showCanUseCouponProductList", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        q().setVisibility(0);
        o().setVisibility(8);
        I(false);
        d(java.lang.Boolean.TRUE);
        h().post(new st2.w0(this));
        com.tencent.mm.plugin.finder.live.plugin.l lVar = this.f412337h;
        if (lVar != null) {
            lVar.K0(0);
        }
    }

    public final void K(boolean z17) {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.B;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("couponList");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "showCouponList", "(Z)V", "Undefined", "scrollToPosition", "(I)V");
        recyclerView.a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(recyclerView, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "showCouponList", "(Z)V", "Undefined", "scrollToPosition", "(I)V");
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.B;
        if (recyclerView2 == null) {
            kotlin.jvm.internal.o.o("couponList");
            throw null;
        }
        recyclerView2.setVisibility(0);
        R();
        boolean z18 = !z17;
        com.tencent.mars.xlog.Log.i("Finder.LiveShoppingListPlugin", "showSecondaryPage " + z18);
        p().setVisibility(0);
        if (z18) {
            p().setTranslationX(0.0f);
        } else {
            p().setTranslationX(q().getWidth());
            p().animate().setDuration(300L).setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator()).translationX(0.0f).setListener(null).start();
        }
        if (x()) {
            ((ml2.r0) i95.n0.c(ml2.r0.class)).sj(1, 3, 0);
        }
    }

    public final void L() {
        com.tencent.mars.xlog.Log.i("Finder.LiveShoppingListPlugin", "showEmptyShoppingPanel");
        l().setVisibility(8);
        o().setVisibility(8);
        ut2.a4 a4Var = this.f412345r;
        if (a4Var != null) {
            a4Var.b(false, w(), false);
        }
        android.view.View view = this.H;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "showEmptyShoppingPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "showEmptyShoppingPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        h().post(new st2.w0(this));
        com.tencent.mm.plugin.finder.live.plugin.l lVar = this.f412337h;
        if (lVar != null) {
            lVar.K0(0);
        }
    }

    public final void M(boolean z17) {
        ut2.a4 a4Var;
        com.tencent.mars.xlog.Log.i("Finder.LiveShoppingListPlugin", "showEmptyContent");
        android.view.View m17 = k().m();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m17, arrayList.toArray(), "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "showGoodsEmptyContent", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(m17, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "showGoodsEmptyContent", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        try {
            if (this.f412345r == null) {
                st2.g3 g3Var = st2.g3.f412326a;
                android.view.ViewGroup root = this.f412333d;
                kotlin.jvm.internal.o.g(root, "root");
                android.view.View inflate = ((android.view.ViewStub) root.findViewById(com.tencent.mm.R.id.flj)).inflate();
                kotlin.jvm.internal.o.f(inflate, "inflate(...)");
                this.f412345r = new ut2.a4(inflate, this);
            }
            r45.dv1 dv1Var = ((mm2.f6) this.f412335f.a(mm2.f6.class)).P;
            if (dv1Var != null && (a4Var = this.f412345r) != null) {
                a4Var.a(dv1Var);
            }
        } catch (java.lang.Exception e17) {
            hc2.c.a(e17, "Finder.LiveShoppingListPlugin-initEmptyHolder");
        }
        ut2.a4 a4Var2 = this.f412345r;
        if (a4Var2 != null) {
            a4Var2.b(true, w(), z17);
        }
        l().setVisibility(8);
        android.view.View t17 = k().t();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(t17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "showGoodsEmptyContent", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        t17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(t17, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "showGoodsEmptyContent", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        I(false);
        o().setVisibility(8);
        ut2.a4 a4Var3 = this.f412345r;
        if (a4Var3 == null || a4Var3.f430821c.getVisibility() != 0) {
            return;
        }
        a4Var3.f430820b.h().getViewTreeObserver().addOnGlobalLayoutListener(new ut2.z3(a4Var3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x0525, code lost:
    
        if (r6 != null) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
    
        if ((!r6.isEmpty()) != false) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0d3e  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x033b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N(qm0.a r51, android.os.Bundle r52) {
        /*
            Method dump skipped, instructions count: 3397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: st2.h1.N(qm0.a, android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0136 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O(android.os.Bundle r20, int r21, boolean r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: st2.h1.O(android.os.Bundle, int, boolean, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x0250, code lost:
    
        if (r14.f35271d == 3) goto L116;
     */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0541  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Q(qm0.a r37, java.util.List r38, java.util.List r39) {
        /*
            Method dump skipped, instructions count: 1491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: st2.h1.Q(qm0.a, java.util.List, java.util.List):void");
    }

    public final void R() {
        java.util.List list;
        r45.zv2 zv2Var;
        java.util.LinkedList<r45.ov2> list2;
        gk2.e eVar = this.f412335f;
        java.util.List O6 = ((mm2.f6) eVar.a(mm2.f6.class)).O6();
        java.util.List instantDiscountList = ((mm2.f6) eVar.a(mm2.f6.class)).f329044r;
        r45.dv1 dv1Var = ((mm2.f6) eVar.a(mm2.f6.class)).P;
        if (dv1Var == null || (zv2Var = (r45.zv2) dv1Var.getCustom(34)) == null || (list2 = zv2Var.getList(0)) == null) {
            list = kz5.p0.f313996d;
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list2, 10));
            for (r45.ov2 ov2Var : list2) {
                kotlin.jvm.internal.o.d(ov2Var);
                arrayList.add(new cm2.k0(ov2Var));
            }
            list = kz5.n0.S0(arrayList);
        }
        tt2.a aVar = this.Q;
        aVar.getClass();
        kotlin.jvm.internal.o.g(instantDiscountList, "instantDiscountList");
        java.util.ArrayList arrayList2 = (java.util.ArrayList) aVar.f421824f;
        arrayList2.clear();
        arrayList2.addAll(O6);
        aVar.f421825g = instantDiscountList;
        aVar.f421826h = list;
        java.util.LinkedList linkedList = aVar.f421827i;
        linkedList.clear();
        linkedList.addAll(aVar.x());
        aVar.notifyDataSetChanged();
    }

    public final void S() {
        java.lang.Object obj;
        gk2.e eVar = this.f412335f;
        so2.j5 j5Var = ((mm2.f6) eVar.a(mm2.f6.class)).f329049w;
        if (j5Var instanceof cm2.k0) {
            qo0.b bVar = qo0.b.N2;
            android.os.Bundle bundle = new android.os.Bundle();
            java.util.Iterator it = ((mm2.f6) eVar.a(mm2.f6.class)).O6().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                so2.j5 j5Var2 = (so2.j5) obj;
                if ((j5Var2 instanceof cm2.k0) && kotlin.jvm.internal.o.b(((cm2.k0) j5Var2).f43362x, ((cm2.k0) j5Var).f43362x)) {
                    break;
                }
            }
            so2.j5 j5Var3 = (so2.j5) obj;
            if (j5Var3 != null) {
                bundle.putByteArray("PARAM_FINDER_LIVE_PROMOTE_DATA", ((cm2.k0) j5Var3).f43360v.toByteArray());
            }
            this.f412334e.statusChange(bVar, bundle);
        }
    }

    public final void c() {
        java.lang.String str;
        java.lang.String str2;
        r45.c33 c33Var;
        r45.c33 c33Var2;
        r45.c33 c33Var3;
        r45.c33 c33Var4;
        gk2.e eVar = this.f412335f;
        r45.dv1 dv1Var = ((mm2.f6) eVar.a(mm2.f6.class)).P;
        java.lang.String str3 = null;
        bw5.x7 x7Var = dv1Var != null ? (bw5.x7) dv1Var.getCustom(42) : null;
        if (x7Var != null) {
            com.tencent.mars.xlog.Log.i("Finder.LiveShoppingListPlugin", "add product jump");
            i95.m c17 = i95.n0.c(pq.q.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            pq.q qVar = (pq.q) c17;
            android.content.Context context = h().getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            pq.q.Lb(qVar, new pq.a(context), x7Var, null, 4, null);
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("add product appId:");
        r45.dv1 dv1Var2 = ((mm2.f6) eVar.a(mm2.f6.class)).f329038n;
        sb6.append((dv1Var2 == null || (c33Var4 = (r45.c33) dv1Var2.getCustom(2)) == null) ? null : c33Var4.getString(0));
        sb6.append(",path:");
        r45.dv1 dv1Var3 = ((mm2.f6) eVar.a(mm2.f6.class)).f329038n;
        if (dv1Var3 != null && (c33Var3 = (r45.c33) dv1Var3.getCustom(2)) != null) {
            str3 = c33Var3.getString(1);
        }
        sb6.append(str3);
        com.tencent.mars.xlog.Log.i("Finder.LiveShoppingListPlugin", sb6.toString());
        st2.g gVar = new st2.g(this);
        java.lang.String obj = com.tencent.mm.sdk.platformtools.t8.s0().toString();
        l81.b1 b1Var = new l81.b1();
        r45.dv1 dv1Var4 = ((mm2.f6) eVar.a(mm2.f6.class)).f329038n;
        if (dv1Var4 == null || (c33Var2 = (r45.c33) dv1Var4.getCustom(2)) == null || (str = c33Var2.getString(0)) == null) {
            str = "";
        }
        b1Var.f317014b = str;
        st2.c2 c2Var = st2.c2.f412249a;
        r45.dv1 dv1Var5 = ((mm2.f6) eVar.a(mm2.f6.class)).f329038n;
        if (dv1Var5 == null || (c33Var = (r45.c33) dv1Var5.getCustom(2)) == null || (str2 = c33Var.getString(1)) == null) {
            str2 = "";
        }
        b1Var.f317022f = c2Var.a(str2, ((mm2.e1) eVar.a(mm2.e1.class)).f328983m);
        b1Var.f317028i = new dk2.ah();
        b1Var.f317032k = 1176;
        java.lang.String str4 = ((mm2.e1) eVar.a(mm2.e1.class)).f328988r.getLong(0) == 0 ? "pre_live_add" : "post_live_add";
        b1Var.f317034l = str4 + ':' + ((mm2.e1) eVar.a(mm2.e1.class)).f328988r.getLong(0) + ':' + ((mm2.c1) eVar.a(mm2.c1.class)).f328852o + "::" + ((mm2.c1) eVar.a(mm2.c1.class)).f328861p2 + ':' + obj + ':' + ((mm2.c1) eVar.a(mm2.c1.class)).P3 + ':' + ((mm2.c1) eVar.a(mm2.c1.class)).f328791d3;
        ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
        ml2.y4 y4Var = ml2.j0.f327583i;
        java.lang.String sceneNote = b1Var.f317034l;
        kotlin.jvm.internal.o.f(sceneNote, "sceneNote");
        y4Var.getClass();
        y4Var.f328306n = sceneNote;
        p52.c cVar = p52.h.f352016a;
        kotlin.jvm.internal.o.g(obj, "<set-?>");
        p52.h.f352029n = obj;
        zy2.qa qaVar = (zy2.qa) i95.n0.c(zy2.qa.class);
        java.lang.String appId = b1Var.f317014b;
        kotlin.jvm.internal.o.f(appId, "appId");
        ((com.tencent.mm.plugin.finder.report.o3) qaVar).Ck(3L, appId, obj, 1176L, java.lang.String.valueOf(((mm2.c1) eVar.a(mm2.c1.class)).f328861p2), str4, ((mm2.c1) eVar.a(mm2.c1.class)).P3);
        gVar.invoke(java.lang.Boolean.FALSE, b1Var);
        qo0.c statusMonitor = this.f412334e;
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        if (statusMonitor.getLiveRole() != 1) {
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        ml2.t2[] t2VarArr = ml2.t2.f328014d;
        jSONObject.put("type", 2);
        ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
        jSONObject.put("sessionid", y4Var.f328306n);
        jSONObject.put("shopwindowid", "");
        if (((mm2.c1) eVar.a(mm2.c1.class)).T7()) {
            i95.m c18 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c18;
            ml2.c1 c1Var = ml2.c1.f327325e;
            zy2.zb.j5(zbVar, 6L, jSONObject.toString(), null, 4, null);
            return;
        }
        if (((mm2.c1) eVar.a(mm2.c1.class)).a8()) {
            ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
            y4Var.Y = true;
            jSONObject.put("appid", ((mm2.f6) eVar.a(mm2.f6.class)).A);
            long j17 = ((mm2.e1) eVar.a(mm2.e1.class)).f328988r.getLong(0);
            if (j17 < 0) {
                jSONObject.put("liveid", "");
            } else {
                ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
                jSONObject.put("liveid", b52.b.q(j17));
            }
            jSONObject.put("clickid", p52.h.f352029n);
            p52.h.f352029n = "";
            so2.j5 j5Var = ((mm2.f6) eVar.a(mm2.f6.class)).f329049w;
            jSONObject.put("productid", j5Var != null ? java.lang.Long.valueOf(j5Var.getItemId()) : "");
            i95.m c19 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c19, "getService(...)");
            zy2.zb.y6((zy2.zb) c19, ml2.z4.f328366o, jSONObject.toString(), null, 4, null);
        }
    }

    public final void d(java.lang.Boolean bool) {
        android.content.Context context = this.f412333d.getContext();
        gk2.e eVar = this.f412335f;
        java.lang.String string = context.getString(com.tencent.mm.R.string.dkg, ((mm2.f6) eVar.a(mm2.f6.class)).U);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        android.widget.TextView textView = this.f412355z;
        if (textView == null) {
            kotlin.jvm.internal.o.o("goodsOfCouponTitleTxt");
            throw null;
        }
        textView.setText(string);
        tt2.e1 e1Var = this.R;
        java.util.LinkedList productList = ((mm2.f6) eVar.a(mm2.f6.class)).f329043q;
        e1Var.getClass();
        kotlin.jvm.internal.o.g(productList, "productList");
        java.util.LinkedList linkedList = e1Var.f421884o;
        linkedList.clear();
        linkedList.addAll(productList);
        e1Var.notifyDataSetChanged();
        androidx.recyclerview.widget.RecyclerView recyclerView = this.C;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("goodListOfCoupon");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "animateShowGoodListOfCoupon", "(Ljava/lang/Boolean;)V", "Undefined", "scrollToPosition", "(I)V");
        recyclerView.a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(recyclerView, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "animateShowGoodListOfCoupon", "(Ljava/lang/Boolean;)V", "Undefined", "scrollToPosition", "(I)V");
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.C;
        if (recyclerView2 == null) {
            kotlin.jvm.internal.o.o("goodListOfCoupon");
            throw null;
        }
        recyclerView2.setVisibility(0);
        boolean b17 = kotlin.jvm.internal.o.b(bool, java.lang.Boolean.TRUE);
        com.tencent.mars.xlog.Log.i("Finder.LiveShoppingListPlugin", "showSecondaryPage " + b17);
        j().setVisibility(0);
        if (b17) {
            j().setTranslationX(0.0f);
        } else {
            j().setTranslationX(q().getWidth());
            j().animate().setDuration(300L).setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator()).translationX(0.0f).setListener(null).start();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        if ((r0 != null && r0.getInteger(0) == 1) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            r11 = this;
            android.view.View r8 = r11.F
            if (r8 != 0) goto L6
            goto L7d
        L6:
            zl2.r4 r0 = zl2.r4.f473950a
            boolean r0 = r0.w1()
            r9 = 0
            if (r0 == 0) goto L39
            gk2.e r0 = r11.f412335f
            java.lang.Class<mm2.f6> r1 = mm2.f6.class
            androidx.lifecycle.c1 r2 = r0.a(r1)
            mm2.f6 r2 = (mm2.f6) r2
            long r2 = r2.G
            int r2 = (int) r2
            r3 = 1
            boolean r2 = pm0.v.z(r2, r3)
            if (r2 != 0) goto L37
            androidx.lifecycle.c1 r0 = r0.a(r1)
            mm2.f6 r0 = (mm2.f6) r0
            r45.j31 r0 = r0.Y
            if (r0 == 0) goto L34
            int r0 = r0.getInteger(r9)
            if (r0 != r3) goto L34
            goto L35
        L34:
            r3 = r9
        L35:
            if (r3 == 0) goto L39
        L37:
            r0 = r9
            goto L3b
        L39:
            r0 = 8
        L3b:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.lang.ThreadLocal r1 = zj0.c.f473285a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r10.add(r0)
            java.util.Collections.reverse(r10)
            java.lang.Object[] r1 = r10.toArray()
            java.lang.String r2 = "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal"
            java.lang.String r3 = "checkOptionVisibility"
            java.lang.String r4 = "()V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setVisibility"
            java.lang.String r7 = "(I)V"
            r0 = r8
            yj0.a.d(r0, r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r0 = r10.get(r9)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r8.setVisibility(r0)
            java.lang.String r1 = "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal"
            java.lang.String r2 = "checkOptionVisibility"
            java.lang.String r3 = "()V"
            java.lang.String r4 = "android/view/View_EXEC_"
            java.lang.String r5 = "setVisibility"
            java.lang.String r6 = "(I)V"
            r0 = r8
            yj0.a.f(r0, r1, r2, r3, r4, r5, r6)
        L7d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: st2.h1.e():void");
    }

    public final void f() {
        gk2.e eVar = this.f412335f;
        if (!pm0.v.z((int) ((mm2.c1) eVar.a(mm2.c1.class)).f328866q, 16) && ((mm2.c1) eVar.a(mm2.c1.class)).a8() && pm0.v.z((int) ((mm2.c1) eVar.a(mm2.c1.class)).f328878s, 1)) {
            com.tencent.mars.xlog.Log.i("Finder.LiveShoppingListPlugin", "checkShoppingAvailableAnchorStatus backEndAnchorStatusFlag:" + ((mm2.c1) eVar.a(mm2.c1.class)).f328878s);
            int i17 = ((int) ((mm2.c1) eVar.a(mm2.c1.class)).f328866q) | 16;
            dk2.xf xfVar = this.f412336g;
            if (xfVar != null) {
                dk2.xf.h(xfVar, ((mm2.e1) eVar.a(mm2.e1.class)).f328988r.getLong(0), ((mm2.e1) eVar.a(mm2.e1.class)).f328983m, i17, 16L, 2, null, 32, null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g(long r12) {
        /*
            r11 = this;
            r0 = 0
            int r0 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r1 = -1
            if (r0 > 0) goto L8
            return r1
        L8:
            tt2.e1 r0 = r11.P
            java.util.LinkedList r2 = r0.f421885p
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
            r4 = r3
        L12:
            boolean r5 = r2.hasNext()
            r6 = 1
            if (r5 == 0) goto L34
            java.lang.Object r5 = r2.next()
            so2.j5 r5 = (so2.j5) r5
            boolean r7 = r5 instanceof cm2.m0
            if (r7 == 0) goto L2d
            cm2.m0 r5 = (cm2.m0) r5
            long r7 = r5.f43369w
            int r5 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r5 != 0) goto L2d
            r5 = r6
            goto L2e
        L2d:
            r5 = r3
        L2e:
            if (r5 == 0) goto L31
            goto L35
        L31:
            int r4 = r4 + 1
            goto L12
        L34:
            r4 = r1
        L35:
            if (r4 != r1) goto Lc1
            ut2.u3 r2 = r11.n()
            r45.xv2 r2 = r2.f431117g
            if (r2 != 0) goto L41
            r5 = r6
            goto L42
        L41:
            r5 = r3
        L42:
            if (r5 != 0) goto L94
            java.lang.String r2 = r2.getString(r3)
            android.view.ViewGroup r5 = r11.f412333d
            android.content.Context r7 = r5.getContext()
            r8 = 2131762957(0x7f101f0d, float:1.9157006E38)
            java.lang.String r7 = r7.getString(r8)
            boolean r2 = kotlin.jvm.internal.o.b(r2, r7)
            if (r2 == 0) goto L5c
            goto L94
        L5c:
            ut2.u3 r2 = r11.n()
            java.util.List r2 = r2.f431116f
            java.util.Iterator r2 = r2.iterator()
        L66:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L86
            java.lang.Object r7 = r2.next()
            r9 = r7
            r45.xv2 r9 = (r45.xv2) r9
            java.lang.String r9 = r9.getString(r3)
            android.content.Context r10 = r5.getContext()
            java.lang.String r10 = r10.getString(r8)
            boolean r9 = kotlin.jvm.internal.o.b(r9, r10)
            if (r9 == 0) goto L66
            goto L87
        L86:
            r7 = 0
        L87:
            r45.xv2 r7 = (r45.xv2) r7
            if (r7 == 0) goto L94
            ut2.u3 r2 = r11.n()
            r2.a(r7, r3, r3)
            r2 = r6
            goto L95
        L94:
            r2 = r3
        L95:
            if (r2 == 0) goto Lc1
            java.util.LinkedList r0 = r0.f421885p
            java.util.Iterator r0 = r0.iterator()
            r2 = r3
        L9e:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto Lc0
            java.lang.Object r4 = r0.next()
            so2.j5 r4 = (so2.j5) r4
            boolean r5 = r4 instanceof cm2.m0
            if (r5 == 0) goto Lb8
            cm2.m0 r4 = (cm2.m0) r4
            long r4 = r4.f43369w
            int r4 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r4 != 0) goto Lb8
            r4 = r6
            goto Lb9
        Lb8:
            r4 = r3
        Lb9:
            if (r4 == 0) goto Lbd
            r1 = r2
            goto Lc0
        Lbd:
            int r2 = r2 + 1
            goto L9e
        Lc0:
            r4 = r1
        Lc1:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: st2.h1.g(long):int");
    }

    public final com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingPanel h() {
        com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingPanel finderLiveShoppingPanel = this.f412347t;
        if (finderLiveShoppingPanel != null) {
            return finderLiveShoppingPanel;
        }
        kotlin.jvm.internal.o.o("contentGroup");
        throw null;
    }

    public final android.view.ViewGroup i() {
        java.lang.Object value = ((jz5.n) this.I).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.ViewGroup) value;
    }

    public final android.view.ViewGroup j() {
        android.view.ViewGroup viewGroup = this.f412353y;
        if (viewGroup != null) {
            return viewGroup;
        }
        kotlin.jvm.internal.o.o("goodListOfCouponContainer");
        throw null;
    }

    public final ut2.j5 k() {
        ut2.j5 j5Var = this.f412338i;
        if (j5Var != null) {
            return j5Var;
        }
        kotlin.jvm.internal.o.o("headerHolder");
        throw null;
    }

    public final android.widget.ProgressBar l() {
        java.lang.Object value = this.f412349v.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.ProgressBar) value;
    }

    public final bc2.b m() {
        bc2.b bVar = this.f412344q;
        if (bVar != null) {
            return bVar;
        }
        kotlin.jvm.internal.o.o("notifyViewHolder");
        throw null;
    }

    public final ut2.u3 n() {
        ut2.u3 u3Var = this.f412342p;
        if (u3Var != null) {
            return u3Var;
        }
        kotlin.jvm.internal.o.o("productLabelsHolder");
        throw null;
    }

    public final android.widget.TextView o() {
        java.lang.Object value = this.f412350w.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.TextView) value;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.g2y) {
            u();
        } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.flu) {
            P(this, null, w() ? 0 : 4, true, false, 8, null);
        } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.flq) {
            com.tencent.mars.xlog.Log.i("Finder.LiveShoppingListPlugin", "[onClickOptionView]");
            h().setSkipReSwitchToLandscape(true);
            u();
            int h07 = (int) (com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).y * (ae2.in.f3688a.h0() / 100.0f));
            android.content.Context context = this.f412333d.getContext();
            com.tencent.mm.ui.MMActivity mMActivity = context instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context : null;
            if (mMActivity != null) {
                xt2.b5 b5Var = new xt2.b5(mMActivity, this.f412335f, h07);
                b5Var.G = new st2.i0(this);
                b5Var.f118384g.f(h07);
            }
        } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.rqm) {
            s(true);
        } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.s47) {
            t(true, true);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public final android.view.ViewGroup p() {
        android.view.ViewGroup viewGroup = this.f412351x;
        if (viewGroup != null) {
            return viewGroup;
        }
        kotlin.jvm.internal.o.o("secondaryPageContainer");
        throw null;
    }

    public final com.tencent.mm.plugin.finder.live.widget.FinderLiveFixClickIssueRecyclerView q() {
        com.tencent.mm.plugin.finder.live.widget.FinderLiveFixClickIssueRecyclerView finderLiveFixClickIssueRecyclerView = this.f412348u;
        if (finderLiveFixClickIssueRecyclerView != null) {
            return finderLiveFixClickIssueRecyclerView;
        }
        kotlin.jvm.internal.o.o("shoppingList");
        throw null;
    }

    public final void r() {
        this.f412332J = null;
        i().removeAllViews();
        i().setVisibility(8);
    }

    public final void s(boolean z17) {
        com.tencent.mars.xlog.Log.i("Finder.LiveShoppingListPlugin", "hideSecondaryPage " + z17);
        if (z17) {
            j().animate().setDuration(300L).setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator()).translationX(q().getWidth()).setListener(new st2.p(this)).start();
        } else {
            j().setVisibility(8);
        }
    }

    public final void t(boolean z17, boolean z18) {
        com.tencent.mars.xlog.Log.i("Finder.LiveShoppingListPlugin", "hideSecondaryPage " + z17 + ",visibility:" + p().getVisibility());
        if (z17) {
            if (p().getVisibility() == 8) {
                return;
            }
            this.N = true;
            p().animate().setDuration(300L).setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator()).translationX(q().getWidth()).setListener(new st2.q(this)).start();
        } else if (!this.N) {
            p().setVisibility(8);
        }
        if (z18) {
            O(null, 0, true, false);
        }
    }

    public final void u() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("hideShoppingContent:");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(new com.tencent.mm.sdk.platformtools.z3());
        com.tencent.mars.xlog.Log.i("Finder.LiveShoppingListPlugin", sb6.toString());
        gk2.e eVar = this.f412335f;
        ((mm2.f6) eVar.a(mm2.f6.class)).f329043q.clear();
        ((mm2.f6) eVar.a(mm2.f6.class)).D = null;
        h().post(new st2.s(this));
        ut2.j5 k17 = k();
        kotlinx.coroutines.r2 r2Var = k17.E;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        xt2.n nVar = k17.C;
        if (nVar != null) {
            nVar.dismiss();
        }
        xt2.n nVar2 = k().D;
        if (nVar2 != null) {
            nVar2.dismiss();
        }
        c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
        com.tencent.mm.plugin.finder.live.plugin.l lVar = this.f412337h;
        com.tencent.mm.plugin.finder.live.view.k0 R0 = lVar != null ? lVar.R0() : null;
        com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout = R0 instanceof com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout ? (com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout) R0 : null;
        ((c61.p2) ybVar).Kj(finderLiveVisitorPluginLayout != null ? finderLiveVisitorPluginLayout.getReportObj() : null, 18054, zl2.r4.k0(zl2.r4.f473950a, this.f412335f, 30, null, 0, null, 28, null));
        vt2.m.f439979d.clear();
        r();
        st2.s1 s1Var = this.L;
        if (s1Var != null) {
            s1Var.c(false);
        } else {
            kotlin.jvm.internal.o.o("searchProductPage");
            throw null;
        }
    }

    public final boolean v(boolean z17) {
        return w() && z17;
    }

    public final boolean w() {
        return ((java.lang.Boolean) this.M.getValue()).booleanValue();
    }

    public final boolean x() {
        return ((mm2.c1) this.f412335f.a(mm2.c1.class)).T;
    }

    public final boolean y() {
        r45.xv2 xv2Var = n().f431117g;
        return xv2Var != null && xv2Var.getInteger(4) == 1;
    }

    public final boolean z() {
        com.tencent.mm.plugin.finder.live.plugin.l lVar = this.f412337h;
        return (lVar != null && lVar.w0() == 0) && h().getVisibility() == 0 && j().getVisibility() != 0 && p().getVisibility() != 0;
    }
}
