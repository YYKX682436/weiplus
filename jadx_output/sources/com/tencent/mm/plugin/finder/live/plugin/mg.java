package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class mg extends com.tencent.mm.plugin.finder.live.plugin.l implements he2.b {
    public final jz5.g A;
    public boolean B;
    public boolean C;
    public final bm2.o1 D;
    public final jz5.g E;
    public final jz5.g F;
    public boolean G;
    public boolean H;
    public long I;

    /* renamed from: J, reason: collision with root package name */
    public int f113502J;
    public int K;
    public boolean L;
    public android.view.View M;
    public volatile boolean N;
    public final jz5.g P;
    public float Q;
    public final jz5.g R;
    public int S;
    public int T;
    public kotlinx.coroutines.r2 U;
    public final jz5.g V;
    public android.graphics.Rect W;
    public jz5.l X;
    public final jz5.g Y;
    public final jz5.g Z;

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f113503p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.ViewGroup f113504q;

    /* renamed from: r, reason: collision with root package name */
    public final android.view.ViewGroup f113505r;

    /* renamed from: s, reason: collision with root package name */
    public final android.widget.TextView f113506s;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.View f113507t;

    /* renamed from: u, reason: collision with root package name */
    public final android.view.View f113508u;

    /* renamed from: v, reason: collision with root package name */
    public final bm2.h1 f113509v;

    /* renamed from: w, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.view.FinderMaxSizeLayout f113510w;

    /* renamed from: x, reason: collision with root package name */
    public final android.view.ViewGroup f113511x;

    /* renamed from: y, reason: collision with root package name */
    public dk2.zf f113512y;

    /* renamed from: z, reason: collision with root package name */
    public final dk2.v4 f113513z;

    /* renamed from: p0, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.plugin.me f113495p0 = new com.tencent.mm.plugin.finder.live.plugin.me(null);

    /* renamed from: x0, reason: collision with root package name */
    public static final java.util.List f113497x0 = kz5.c0.i(1, 20002, 20035, 1000066, 20112, 20124, 20128);

    /* renamed from: y0, reason: collision with root package name */
    public static final java.util.List f113499y0 = kz5.c0.i(1, 20002, 20035, 1000066, 20124, 20128);

    /* renamed from: l1, reason: collision with root package name */
    public static final java.util.List f113494l1 = kz5.c0.i(1, 20002, 20035, 1000066, 20124, 20128, 20112);

    /* renamed from: p1, reason: collision with root package name */
    public static final float f113496p1 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479688cn);

    /* renamed from: x1, reason: collision with root package name */
    public static final int f113498x1 = (int) com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479653br);

    /* renamed from: y1, reason: collision with root package name */
    public static final int f113500y1 = 1;

    /* renamed from: z1, reason: collision with root package name */
    public static final int f113501z1 = 2;
    public static final int A1 = 3;
    public static final java.util.Set B1 = kz5.z.D0(new java.lang.Integer[]{java.lang.Integer.valueOf(be1.r0.CTRL_INDEX), 158, 161});
    public static final java.util.Set C1 = kz5.z.D0(new java.lang.Integer[]{165, 166, 154, 155, 156});
    public static final float D1 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479704cz);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mg(android.view.ViewGroup root, qo0.c statusMonitor, android.view.ViewGroup viewGroup) {
        super(root, statusMonitor, null);
        double d17;
        double d18;
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f113503p = statusMonitor;
        this.f113504q = viewGroup;
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.i8o);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) findViewById;
        this.f113505r = viewGroup2;
        android.view.View findViewById2 = root.findViewById(com.tencent.mm.R.id.i8p);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f113506s = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = root.findViewById(com.tencent.mm.R.id.i8j);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f113507t = findViewById3;
        android.view.View findViewById4 = root.findViewById(com.tencent.mm.R.id.uag);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f113508u = findViewById4;
        this.f113509v = new bm2.h1(findViewById4);
        android.view.View findViewById5 = root.findViewById(com.tencent.mm.R.id.f484600ev2);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        com.tencent.mm.plugin.finder.live.view.FinderMaxSizeLayout finderMaxSizeLayout = (com.tencent.mm.plugin.finder.live.view.FinderMaxSizeLayout) findViewById5;
        this.f113510w = finderMaxSizeLayout;
        android.view.ViewParent parent = root.getParent();
        android.view.ViewGroup viewGroup3 = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        this.f113511x = viewGroup3 != null ? (android.view.ViewGroup) viewGroup3.findViewById(com.tencent.mm.R.id.rdu) : null;
        android.content.Context context = root.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        this.f113513z = new dk2.v4(context, S0());
        this.A = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.we(root, this));
        this.C = true;
        bm2.o1 o1Var = new bm2.o1(((we2.s) P0(we2.s.class)).f445255g);
        this.D = o1Var;
        this.E = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.qe(root, this));
        this.F = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.bf(root, this));
        this.H = true;
        this.L = true;
        jz5.h.b(com.tencent.mm.plugin.finder.live.plugin.cg.f112149d);
        this.N = true;
        this.P = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.af(this));
        zl2.r4 r4Var = zl2.r4.f473950a;
        if (!r4Var.w1() || ((mm2.f6) P0(mm2.f6.class)).N6() || ((on2.z2) P0(on2.z2.class)).f347096q || ((mm2.o4) P0(mm2.o4.class)).k7()) {
            d18 = 0.25d;
        } else {
            d18 = 0.29d;
        }
        this.K = (int) (d17 * d18);
        if (x0()) {
            com.tencent.mm.plugin.finder.live.plugin.me meVar = f113495p0;
            android.content.Context context2 = root.getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            int a17 = meVar.a(context2);
            root.getLayoutParams().width = a17;
            C1().getLayoutParams().width = a17;
            com.tencent.mars.xlog.Log.i("Finder.LiveCommentPlugin", "init comment width = " + a17);
            int i17 = (int) (((double) com.tencent.mm.ui.bl.b(root.getContext()).y) * 0.3d);
            int i18 = com.tencent.mm.plugin.finder.live.view.FinderMaxSizeLayout.f116120n;
            finderMaxSizeLayout.b(i17, true);
            ((we2.s) S0().a(we2.s.class)).f445257i = a17;
        } else {
            int i19 = (int) (this.K + f113496p1);
            int i27 = com.tencent.mm.plugin.finder.live.view.FinderMaxSizeLayout.f116120n;
            finderMaxSizeLayout.b(i19, true);
            android.graphics.Point b17 = com.tencent.mm.ui.bl.b(root.getContext());
            if (b17.x >= (b17.y / 3) * 2) {
                android.view.ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
                layoutParams.width = b17.x / 2;
                root.setLayoutParams(layoutParams);
            } else {
                we2.s sVar = (we2.s) S0().a(we2.s.class);
                int i28 = b17.x;
                android.view.ViewGroup.LayoutParams layoutParams2 = root.getLayoutParams();
                kotlin.jvm.internal.o.e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                int marginStart = i28 - ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).getMarginStart();
                android.view.ViewGroup.LayoutParams layoutParams3 = root.getLayoutParams();
                kotlin.jvm.internal.o.e(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                sVar.f445257i = marginStart - ((android.view.ViewGroup.MarginLayoutParams) layoutParams3).getMarginEnd();
            }
        }
        this.f113502J = finderMaxSizeLayout.getF116124g();
        com.tencent.mars.xlog.Log.i("Finder.LiveCommentPlugin", "commentListWidth : " + ((we2.s) S0().a(we2.s.class)).f445257i);
        com.tencent.mm.plugin.finder.live.view.FinderLiveOverScrollRecyclerView C12 = C1();
        android.content.Context context3 = root.getContext();
        kotlin.jvm.internal.o.f(context3, "getContext(...)");
        C12.setLayoutManager(new com.tencent.mm.plugin.finder.live.widget.manager.FinderLiveMsgLinearLayoutManager(context3));
        C1().setAdapter(o1Var);
        ym5.a1.h(C1(), new com.tencent.mm.plugin.finder.live.plugin.ee(this));
        o1Var.f22181n = new com.tencent.mm.plugin.finder.live.plugin.fe(this);
        o1Var.f22182o = new com.tencent.mm.plugin.finder.live.plugin.ge(this);
        o1Var.f22183p = new com.tencent.mm.plugin.finder.live.plugin.he(this);
        C1().i(new com.tencent.mm.plugin.finder.live.plugin.ie(this));
        if (!(((java.lang.Number) ae2.in.f3746f7.r()).intValue() == 1) || r4Var.w1() || x0()) {
            viewGroup2.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.ke(this));
        } else {
            viewGroup2.setOnTouchListener(new com.tencent.mm.plugin.finder.live.plugin.je(this));
        }
        r4Var.e(this, true);
        finderMaxSizeLayout.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.le(this));
        finderMaxSizeLayout.setOnTouchListener(com.tencent.mm.plugin.finder.live.plugin.ce.f112140d);
        this.R = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.vf(root));
        this.V = jz5.h.b(com.tencent.mm.plugin.finder.live.plugin.pe.f113860d);
        this.Y = jz5.h.b(com.tencent.mm.plugin.finder.live.plugin.xe.f115076d);
        this.Z = jz5.h.b(com.tencent.mm.plugin.finder.live.plugin.ye.f115189d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [int] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    public static void U1(com.tencent.mm.plugin.finder.live.plugin.mg mgVar, java.util.List msgList, boolean z17, boolean z18, java.lang.Boolean bool, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            z17 = true;
        }
        ?? r57 = z18;
        if ((i17 & 4) != 0) {
            r57 = 0;
        }
        if ((i17 & 8) != 0) {
            bool = java.lang.Boolean.TRUE;
        }
        mgVar.getClass();
        kotlin.jvm.internal.o.g(msgList, "msgList");
        mgVar.f365323d.getVisibility();
        mgVar.f365323d.getAlpha();
        mgVar.f365323d.isShown();
        mgVar.C1().getVisibility();
        mgVar.C1().isShown();
        if (!z17) {
            android.os.Message obtainMessage = mgVar.E1().obtainMessage();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.addAll(msgList);
            obtainMessage.obj = arrayList;
            obtainMessage.arg1 = r57;
            int i18 = f113501z1;
            obtainMessage.what = i18;
            mgVar.E1().removeMessages(i18);
            mgVar.E1().sendMessage(obtainMessage);
            return;
        }
        if (!msgList.isEmpty()) {
            mgVar.w1();
        }
        if (mgVar.N) {
            if (!mgVar.C1().isShown()) {
                mgVar.N = false;
                com.tencent.mars.xlog.Log.i("Finder.LiveCommentPlugin", "updateMessages return ,isMsgListViewVisible is not real.correct it");
                return;
            }
        } else {
            if (!mgVar.C1().isShown()) {
                com.tencent.mars.xlog.Log.i("Finder.LiveCommentPlugin", "updateMessages return ,RecyclerView is invisible");
                return;
            }
            mgVar.N = true;
        }
        android.os.Message obtainMessage2 = mgVar.E1().obtainMessage();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.addAll(msgList);
        obtainMessage2.obj = arrayList2;
        obtainMessage2.arg1 = r57;
        obtainMessage2.arg2 = kotlin.jvm.internal.o.b(bool, java.lang.Boolean.TRUE) ? 1 : 0;
        int i19 = f113500y1;
        obtainMessage2.what = i19;
        mgVar.E1().removeMessages(i19);
        mgVar.E1().sendMessage(obtainMessage2);
    }

    public static final void t1(com.tencent.mm.plugin.finder.live.plugin.mg mgVar) {
        java.util.List C0;
        java.lang.Object obj;
        mgVar.M1(true);
        mgVar.f113505r.setVisibility(8);
        if (!((mm2.x4) mgVar.P0(mm2.x4.class)).f329540u) {
            y1(mgVar, null, 0, 3, null);
            return;
        }
        int i17 = ((mm2.x4) mgVar.P0(mm2.x4.class)).f329536q;
        int size = ((mm2.x4) mgVar.P0(mm2.x4.class)).f329528f.size() - 1;
        java.util.List list = ((mm2.x4) mgVar.P0(mm2.x4.class)).f329528f;
        kotlin.jvm.internal.o.f(list, "<get-msgList>(...)");
        e06.k kVar = new e06.k(i17, size);
        synchronized (list) {
            C0 = kz5.n0.C0(list, kVar);
        }
        synchronized (C0) {
            java.util.Iterator it = C0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                dk2.zf zfVar = (dk2.zf) obj;
                zl2.r4 r4Var = zl2.r4.f473950a;
                kotlin.jvm.internal.o.d(zfVar);
                if (r4Var.x(zfVar)) {
                    break;
                }
            }
        }
        dk2.zf zfVar2 = (dk2.zf) obj;
        if (zfVar2 != null) {
            int indexOf = ((mm2.x4) mgVar.P0(mm2.x4.class)).f329528f.indexOf(zfVar2);
            if (indexOf != -1) {
                i95.m c17 = i95.n0.c(ml2.r0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                ml2.r0 r0Var = (ml2.r0) c17;
                java.lang.String a17 = zfVar2.a();
                if (a17 == null) {
                    a17 = "";
                }
                r0Var.Gk(a17, 0, "");
                com.tencent.mm.plugin.finder.live.view.FinderLiveOverScrollRecyclerView C12 = mgVar.C1();
                if (indexOf < 0) {
                    indexOf = 0;
                }
                int itemCount = mgVar.D.getItemCount() - 1;
                if (indexOf > itemCount) {
                    indexOf = itemCount;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(indexOf));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(C12, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin", "onNewTipsClick", "()V", "Undefined", "scrollToPosition", "(I)V");
                C12.a1(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(C12, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin", "onNewTipsClick", "()V", "Undefined", "scrollToPosition", "(I)V");
            } else {
                y1(mgVar, null, 0, 3, null);
            }
        }
        ((mm2.x4) mgVar.P0(mm2.x4.class)).f329540u = false;
    }

    public static final void u1(com.tencent.mm.plugin.finder.live.plugin.mg mgVar, dk2.zf zfVar) {
        java.lang.String sb6;
        android.view.View view = mgVar.f113508u;
        if (view.isShown()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.LiveCommentPlugin", "#showStickTopTitleMsg execute. stickTopWelcomeTitleLayout.width=" + view.getWidth());
        android.view.View view2 = mgVar.f113508u;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin", "showStickTopTitleMsg", "(Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin", "showStickTopTitleMsg", "(Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        bm2.h1 h1Var = mgVar.f113509v;
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = h1Var.f21927e;
        com.tencent.mm.plugin.finder.live.view.FinderLiveFoldTextView finderLiveFoldTextView = mMNeat7extView instanceof com.tencent.mm.plugin.finder.live.view.FinderLiveFoldTextView ? (com.tencent.mm.plugin.finder.live.view.FinderLiveFoldTextView) mMNeat7extView : null;
        if (finderLiveFoldTextView != null) {
            finderLiveFoldTextView.setUnFoldListener(null);
        }
        h1Var.itemView.setOnClickListener(null);
        int type = zfVar.getType();
        if (type == 10001) {
            fk2.y2 y2Var = new fk2.y2(((we2.s) mgVar.S0().a(we2.s.class)).f445255g.d());
            android.content.Context context = view.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            fk2.f3.s(y2Var, zfVar, context, mgVar.f113509v, zfVar.j(), null, 16, null);
        } else if (type == 20036 || type == 100000) {
            if (zfVar.x().length() > 0) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.d4h));
                sb7.append(' ');
                java.lang.String j17 = zfVar.j();
                sb7.append(r26.n0.u0(j17 != null ? j17 : "").toString());
                sb7.append('\n');
                sb7.append(r26.n0.u0(zfVar.x()).toString());
                sb6 = sb7.toString();
            } else {
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                sb8.append(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.d4h));
                sb8.append(' ');
                java.lang.String j18 = zfVar.j();
                sb8.append(j18 != null ? j18 : "");
                sb6 = sb8.toString();
            }
            java.lang.String str = sb6;
            com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView2 = h1Var.f21927e;
            mMNeat7extView2.setPadding(0, 0, 0, 0);
            android.view.ViewGroup.LayoutParams layoutParams = mMNeat7extView2.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams instanceof android.widget.RelativeLayout.LayoutParams) {
                    ((android.widget.RelativeLayout.LayoutParams) layoutParams).addRule(15, -1);
                }
                mMNeat7extView2.setLayoutParams(layoutParams);
            }
            fk2.h hVar = fk2.k.f263413m;
            kotlin.jvm.internal.o.e(mMNeat7extView2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.FinderLiveFoldTextView");
            hVar.a(str, (com.tencent.mm.plugin.finder.live.view.FinderLiveFoldTextView) mMNeat7extView2, mgVar.C1().getWidth(), 14, true, mgVar.f113509v);
            ((com.tencent.mm.plugin.finder.live.view.FinderLiveFoldTextView) mMNeat7extView2).setUnFoldListener(new com.tencent.mm.plugin.finder.live.plugin.xf(mgVar, zfVar));
            h1Var.itemView.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.yf(mgVar, zfVar));
        }
        if (zfVar.getType() == 100000 || zfVar.getType() == 20036) {
            i95.m c17 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ml2.r0 r0Var = (ml2.r0) c17;
            ml2.b4 b4Var = ml2.b4.f327281y2;
            cl0.g gVar = new cl0.g();
            gVar.o("type", 1);
            ml2.r0.hj(r0Var, b4Var, gVar.toString(), 0L, null, null, null, null, null, 252, null);
        }
    }

    public static final void v1(com.tencent.mm.plugin.finder.live.plugin.mg mgVar, dk2.zf zfVar) {
        try {
            ((mm2.x4) mgVar.P0(mm2.x4.class)).O6(zfVar);
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = mgVar.C1().getLayoutManager();
            kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            int w17 = ((androidx.recyclerview.widget.LinearLayoutManager) layoutManager).w();
            java.util.List list = ((mm2.x4) mgVar.P0(mm2.x4.class)).f329528f;
            int min = java.lang.Math.min(w17, list.size());
            list.add(min, zfVar);
            java.util.List list2 = ((mm2.x4) mgVar.P0(mm2.x4.class)).f329528f;
            kotlin.jvm.internal.o.f(list2, "<get-msgList>(...)");
            U1(mgVar, list2, false, false, null, 14, null);
            com.tencent.mars.xlog.Log.i("Finder.LiveCommentPlugin", "#onTextClick click, insert to " + w17);
            mgVar.G1();
            kotlinx.coroutines.r2 r2Var = mgVar.U;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            mgVar.C1().post(new com.tencent.mm.plugin.finder.live.plugin.zf(mgVar, min));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("Finder.LiveCommentPlugin", e17.toString());
        }
        if (zfVar.getType() == 100000 || zfVar.getType() == 20036) {
            i95.m c17 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ml2.r0 r0Var = (ml2.r0) c17;
            ml2.b4 b4Var = ml2.b4.f327281y2;
            cl0.g gVar = new cl0.g();
            gVar.o("type", 2);
            ml2.r0.hj(r0Var, b4Var, gVar.toString(), 0L, null, null, null, null, null, 252, null);
        }
    }

    public static /* synthetic */ void y1(com.tencent.mm.plugin.finder.live.plugin.mg mgVar, java.lang.Boolean bool, int i17, int i18, java.lang.Object obj) {
        if ((i18 & 1) != 0) {
            bool = java.lang.Boolean.FALSE;
        }
        if ((i18 & 2) != 0) {
            i17 = -1;
        }
        mgVar.x1(bool, i17);
    }

    public final cn2.p0 A1() {
        return (cn2.p0) ((jz5.n) this.E).getValue();
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l
    public void B(android.os.Bundle bundle, java.lang.Object obj, long j17) {
        java.lang.String string = bundle != null ? bundle.getString("ACTION_POST_PORTRAIT", "") : null;
        if (kotlin.jvm.internal.o.b(string != null ? string : "", "PORTRAIT_ACTION_GOTO_PROFILE_COMMENT")) {
            com.tencent.mm.plugin.finder.live.plugin.pf pfVar = new com.tencent.mm.plugin.finder.live.plugin.pf(this, bundle, obj, j17);
            java.util.regex.Pattern pattern = pm0.v.f356802a;
            com.tencent.mm.sdk.platformtools.u3.i(pfVar, j17);
        }
    }

    public final int B1() {
        android.view.ViewGroup viewGroup;
        com.tencent.mm.plugin.finder.live.plugin.ad adVar = (com.tencent.mm.plugin.finder.live.plugin.ad) X0(com.tencent.mm.plugin.finder.live.plugin.ad.class);
        if (adVar == null) {
            return 0;
        }
        if (!(adVar.w0() == 0)) {
            adVar = null;
        }
        if (adVar == null || (viewGroup = adVar.f365323d) == null) {
            return 0;
        }
        return viewGroup.getHeight();
    }

    @Override // qo0.a
    public void C0(java.util.LinkedHashMap micUserMap) {
        kotlin.jvm.internal.o.g(micUserMap, "micUserMap");
        com.tencent.mars.xlog.Log.i("Finder.LiveCommentPlugin", "onAudienceMicUserChanged commentAdapter micEnable true");
        fk2.x xVar = fk2.g0.f263390m;
        fk2.g0.f263392o = true;
    }

    public final com.tencent.mm.plugin.finder.live.view.FinderLiveOverScrollRecyclerView C1() {
        return (com.tencent.mm.plugin.finder.live.view.FinderLiveOverScrollRecyclerView) this.A.getValue();
    }

    public final int D1() {
        return ((java.lang.Number) ((jz5.n) this.Y).getValue()).intValue();
    }

    public final com.tencent.mm.sdk.platformtools.n3 E1() {
        return (com.tencent.mm.sdk.platformtools.n3) this.P.getValue();
    }

    public final int F1() {
        return ((java.lang.Number) ((jz5.n) this.R).getValue()).intValue();
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    public final void G1() {
        android.view.View view = this.f113508u;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin", "hideStickTopTitleMsg", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin", "hideStickTopTitleMsg", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final boolean H1() {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = C1().getLayoutManager();
        kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        return ((androidx.recyclerview.widget.LinearLayoutManager) layoutManager).x() == this.D.getItemCount() - 1;
    }

    public final void I1(java.util.List bulletCommentList) {
        kotlin.jvm.internal.o.g(bulletCommentList, "bulletCommentList");
        A1().f(bulletCommentList, true);
    }

    public final void J1() {
        C1().post(new com.tencent.mm.plugin.finder.live.plugin.mf(this));
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void K0(int i17) {
        ((mm2.e1) S0().a(mm2.e1.class)).f328988r.getLong(0);
        android.view.ViewGroup viewGroup = this.f365323d;
        viewGroup.getAlpha();
        if (((mm2.j2) P0(mm2.j2.class)).O6(x0())) {
            super.K0(8);
            this.f113327i = i17;
            com.tencent.mars.xlog.Log.i("Finder.LiveCommentPlugin", "danmaku intercept visible:" + i17);
            return;
        }
        if (i17 == 0 && w0() != 0) {
            com.tencent.mars.xlog.Log.i("Finder.LiveCommentPlugin", "[commentHeightChange] commentPlugin visible change");
            viewGroup.postDelayed(new com.tencent.mm.plugin.finder.live.plugin.wf(this), 100L);
        }
        ae2.in inVar = ae2.in.f3688a;
        if (((java.lang.Boolean) ((nb2.a) ((jz5.n) ae2.in.M5).getValue()).r()).booleanValue()) {
            i17 = 8;
        }
        super.K0(i17);
    }

    public final void K1() {
        if (this.I > 0) {
            mm2.x4 x4Var = (mm2.x4) P0(mm2.x4.class);
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = C1().getLayoutManager();
            kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            x4Var.f329538s = ((androidx.recyclerview.widget.LinearLayoutManager) layoutManager).x() == this.D.getItemCount() - 1;
            mm2.x4 x4Var2 = (mm2.x4) P0(mm2.x4.class);
            long j17 = ((mm2.x4) P0(mm2.x4.class)).f329539t;
            long j18 = this.I;
            if (j17 < j18) {
                j17 = j18;
            }
            x4Var2.f329539t = j17;
        }
    }

    public void L1() {
        bm2.o1 o1Var = this.D;
        try {
            o1Var.f22180m.clear();
            o1Var.notifyDataSetChanged();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("Finder.LiveCommentPlugin", "[reset] err = " + e17.getMessage());
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
        int ordinal = status.ordinal();
        if (ordinal == 7) {
            if (((mm2.c1) P0(mm2.c1.class)).f328902w) {
                if ((bundle != null && bundle.getBoolean("PARAM_FINDER_LIVE_START_BY_MINI_WINDOW")) || x0()) {
                    java.util.List list = ((mm2.x4) P0(mm2.x4.class)).f329528f;
                    kotlin.jvm.internal.o.f(list, "<get-msgList>(...)");
                    V1(list);
                }
            }
            java.lang.System.currentTimeMillis();
            return;
        }
        if (ordinal == 21) {
            K1();
            return;
        }
        if (ordinal == 33) {
            this.f113505r.setVisibility(8);
            C1().postDelayed(new com.tencent.mm.plugin.finder.live.plugin.of(this), 100L);
            M1(true);
            return;
        }
        if (ordinal == 41) {
            this.L = !(bundle != null ? bundle.getBoolean("PARAM_IS_ENTERING_COMMENT") : false);
            return;
        }
        if (ordinal != 120) {
            if (ordinal == 191) {
                com.tencent.mars.xlog.Log.i("Finder.LiveCommentPlugin", "FINDER_LIVE_MODE_SWITCH isAudioMode:" + (bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_AUDIO_MODE", false) : false) + ", isShareMode:" + (bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_IS_SHARE_MODE", false) : false) + ", isLinkMic: " + (((mm2.o4) P0(mm2.o4.class)).Z6().size() > 0));
                return;
            }
            switch (ordinal) {
                case 128:
                case 129:
                    if (bundle != null) {
                        java.lang.String string = bundle.getString("PARAM_FINDER_LIVE_COMMENT");
                        if (string == null) {
                            string = "";
                        }
                        java.util.List list2 = ((mm2.x4) P0(mm2.x4.class)).f329528f;
                        kotlin.jvm.internal.o.f(list2, "<get-msgList>(...)");
                        kz5.h0.B(list2, new com.tencent.mm.plugin.finder.live.plugin.ag(string));
                        pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.bg(this));
                        return;
                    }
                    return;
                case 130:
                    if (bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_SCREEN_CLEAR") : false) {
                        K1();
                        return;
                    }
                    java.util.List list3 = ((mm2.x4) P0(mm2.x4.class)).f329528f;
                    kotlin.jvm.internal.o.f(list3, "<get-msgList>(...)");
                    V1(list3);
                    return;
                default:
                    return;
            }
        }
        int i17 = bundle != null ? bundle.getInt("PARAM_FINDER_LIVE_COMMENT_MOVE_DISTANCE") : 0;
        com.tencent.mars.xlog.Log.i("Finder.LiveCommentPlugin", "comment move distance:" + i17 + ",has change:" + this.G);
        boolean z17 = this.G;
        if ((z17 || i17 <= 0) && (!z17 || i17 >= 0)) {
            return;
        }
        this.G = !z17;
        android.view.ViewGroup viewGroup = this.f365323d;
        android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        int i18 = ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        android.view.ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin += i17;
        android.view.ViewGroup.LayoutParams layoutParams3 = viewGroup.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        int i19 = ((android.view.ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[adjustCommentLayout] bottomMargin: ");
        sb6.append(i18);
        sb6.append(" -> ");
        sb6.append(i19);
        sb6.append(", distance=");
        sb6.append(i17);
        sb6.append(", caller=\n");
        java.lang.StackTraceElement[] stackTrace = java.lang.Thread.currentThread().getStackTrace();
        kotlin.jvm.internal.o.f(stackTrace, "getStackTrace(...)");
        sb6.append(kz5.n0.g0(kz5.z.s0(stackTrace, 8), "\n", null, null, 0, null, null, 62, null));
        com.tencent.mars.xlog.Log.i("Finder.LiveCommentPlugin", sb6.toString());
        viewGroup.requestLayout();
    }

    public final void M1(boolean z17) {
        if (this.C != z17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[FinderLiveComment] forceReachLast: ");
            sb6.append(this.C);
            sb6.append(" -> ");
            sb6.append(z17);
            sb6.append(", from: ");
            java.lang.StackTraceElement[] stackTrace = java.lang.Thread.currentThread().getStackTrace();
            kotlin.jvm.internal.o.f(stackTrace, "getStackTrace(...)");
            java.lang.StackTraceElement stackTraceElement = (java.lang.StackTraceElement) kz5.z.U(stackTrace, 4);
            java.lang.String methodName = stackTraceElement != null ? stackTraceElement.getMethodName() : null;
            if (methodName == null) {
                methodName = com.eclipsesource.mmv8.Platform.UNKNOWN;
            }
            sb6.append(methodName);
            com.tencent.mars.xlog.Log.i("Finder.LiveCommentPlugin", sb6.toString());
        }
        this.C = z17;
    }

    public final void N1(long j17) {
        android.view.ViewGroup viewGroup = this.f113505r;
        if (j17 <= 0 || !((mm2.c1) P0(mm2.c1.class)).f328902w) {
            viewGroup.setVisibility(8);
            return;
        }
        viewGroup.setVisibility(0);
        boolean z17 = ((mm2.x4) P0(mm2.x4.class)).f329540u;
        android.view.ViewGroup viewGroup2 = this.f365323d;
        android.widget.TextView textView = this.f113506s;
        if (z17) {
            java.lang.String string = viewGroup2.getContext().getResources().getString(com.tencent.mm.R.string.d_j);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[0], 0));
            kotlin.jvm.internal.o.f(format, "format(...)");
            textView.setText(format);
            return;
        }
        java.lang.String valueOf = j17 <= 99 ? java.lang.String.valueOf(j17) : "99+";
        java.lang.String string2 = viewGroup2.getContext().getResources().getString(com.tencent.mm.R.string.dzs);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        java.lang.String format2 = java.lang.String.format(string2, java.util.Arrays.copyOf(new java.lang.Object[]{valueOf}, 1));
        kotlin.jvm.internal.o.f(format2, "format(...)");
        textView.setText(format2);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void O0() {
        super.O0();
        android.content.Context context = this.f365323d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        im2.n nVar = (im2.n) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(im2.n.class);
        long j17 = ((mm2.e1) S0().a(mm2.e1.class)).f328988r.getLong(0);
        java.util.List list = ((mm2.x4) P0(mm2.x4.class)).f329528f;
        kotlin.jvm.internal.o.f(list, "<get-msgList>(...)");
        nVar.getClass();
        if (nVar.f292450e && j17 == nVar.f292449d && (!list.isEmpty())) {
            java.util.List list2 = bg2.a.f19908c;
            list2.clear();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                dk2.zf zfVar = (dk2.zf) obj;
                if ((zfVar.m() == 0 && kz5.z.F(bg2.a.f19909d, zfVar.getType())) ? false : true) {
                    arrayList.add(obj);
                }
            }
            list2.addAll(arrayList);
            bg2.a.f19907b = j17;
            com.tencent.mars.xlog.Log.i("Finder.CommentDataTransfer", "passToFeed liveId:" + pm0.v.u(j17) + ", cache size:" + list2.size());
        }
        com.tencent.mm.plugin.finder.view.oc.f132781a.a();
        K1();
        this.L = true;
        this.N = true;
        A1().c(4);
        dk2.t5 N6 = ((we2.s) S0().a(we2.s.class)).N6();
        N6.f234103b = com.tencent.wcdb.core.Database.DictDefaultMatchValue;
        N6.f234104c = -1;
        N6.f234105d = Long.MIN_VALUE;
        N6.f234106e = false;
        N6.f234107f = true;
        N6.f234110i = null;
        N6.f234109h = null;
        ((cn2.y0) ((jz5.n) this.F).getValue()).d();
        this.W = null;
        this.X = null;
        kotlinx.coroutines.r2 r2Var = this.U;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        G1();
    }

    public final void P1(boolean z17) {
        if (!z17) {
            java.util.List list = ((mm2.x4) P0(mm2.x4.class)).f329528f;
            kotlin.jvm.internal.o.f(list, "<get-msgList>(...)");
            U1(this, list, false, false, null, 14, null);
            N1(0L);
            if (((mm2.c1) P0(mm2.c1.class)).f328801f2 != 2) {
                cn2.p0 A12 = A1();
                java.util.List list2 = ((mm2.x4) P0(mm2.x4.class)).f329529g;
                kotlin.jvm.internal.o.f(list2, "<get-bulletCommetList>(...)");
                A12.f(list2, true);
                return;
            }
            return;
        }
        A1().f43598i.clear();
        A1().c(1);
        this.f113505r.setVisibility(8);
        M1(true);
        kotlinx.coroutines.r2 r2Var = this.U;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        int[] msgType = (int[]) ((jz5.n) this.V).getValue();
        bm2.o1 o1Var = this.D;
        o1Var.getClass();
        kotlin.jvm.internal.o.g(msgType, "msgType");
        pm0.v.b0(o1Var.f22180m, new bm2.n1(msgType));
        o1Var.notifyDataSetChanged();
    }

    public final void Q1(java.util.List list, java.lang.Boolean bool, boolean z17) {
        com.tencent.mm.plugin.finder.view.oc ocVar = com.tencent.mm.plugin.finder.view.oc.f132781a;
        boolean z18 = !ocVar.b() && this.C;
        boolean H1 = H1();
        long j17 = ((mm2.c1) P0(mm2.c1.class)).f328775a2 - this.I;
        int R1 = R1(list, z17);
        if (R1 > 0 && (this.C != H1 || !z18)) {
            com.tencent.mars.xlog.Log.i("Finder.LiveCommentPlugin", "[FinderLiveComment] newComment: reachLast=" + z18 + ", forceReachLast=" + this.C + ", realReachLast=" + H1 + ", isFlowWindowShowing=" + ocVar.b());
        }
        if (this.D.getItemCount() > 0) {
            if (z18) {
                C1().post(new com.tencent.mm.plugin.finder.live.plugin.gg(this, bool, R1));
            } else if (j17 > 0) {
                N1(j17);
            }
        }
    }

    public final int R1(java.util.List list, boolean z17) {
        kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
        f0Var.f310116d = -1;
        if (z17 && !C1().isShown()) {
            this.N = false;
            com.tencent.mars.xlog.Log.i("Finder.LiveCommentPlugin", "[updateComments] RecyclerView is invisible, return");
            return f0Var.f310116d;
        }
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode()) {
            int size = list.size();
            pm0.v.G(list, com.tencent.mm.plugin.finder.live.plugin.hg.f112807d);
            com.tencent.mars.xlog.Log.i("Finder.LiveCommentPlugin", "updateComments  before size:" + size + " afterSize:" + list.size());
        }
        androidx.recyclerview.widget.h0.a(new com.tencent.mm.plugin.finder.live.plugin.jg(this, list), false).a(new com.tencent.mm.plugin.finder.live.plugin.ig(this, list, f0Var));
        return f0Var.f310116d;
    }

    public final void T1(java.util.List list, boolean z17, boolean z18, java.lang.Boolean bool) {
        android.view.ViewGroup viewGroup;
        if (list == null || list.isEmpty()) {
            com.tencent.mars.xlog.Log.i("ken_comment", "updateMessageInrtetnal else，" + this);
        } else if (kotlin.jvm.internal.o.b(((mm2.c1) P0(mm2.c1.class)).G3, java.lang.Boolean.FALSE) && z17) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (kz5.z.F((int[]) ((jz5.n) this.V).getValue(), ((dk2.zf) obj).getType())) {
                    arrayList2.add(obj);
                }
            }
            arrayList.addAll(arrayList2);
            Q1(arrayList, bool, z17);
        } else {
            Q1(list, bool, z17);
        }
        if (this.f113512y != null) {
            com.tencent.mars.xlog.Log.i("Finder.LiveCommentPlugin", "try update bottom sticky, but has one showing");
        } else {
            java.util.List list2 = ((mm2.x4) P0(mm2.x4.class)).f329534o;
            kotlin.jvm.internal.o.f(list2, "<get-stickBottomMsgList>(...)");
            dk2.zf zfVar = (dk2.zf) kz5.h0.C(list2);
            if (zfVar != null && (viewGroup = this.f113511x) != null) {
                this.f113512y = zfVar;
                android.view.ViewGroup viewGroup2 = this.f365323d;
                android.view.View inflate = android.view.View.inflate(viewGroup2.getContext(), com.tencent.mm.R.layout.apg, null);
                kotlin.jvm.internal.o.d(inflate);
                bm2.h1 h1Var = new bm2.h1(inflate);
                we2.p pVar = ((we2.s) P0(we2.s.class)).f445255g;
                android.content.Context context = viewGroup2.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                pVar.a(context, h1Var, zfVar, -1, new java.util.ArrayList());
                inflate.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.eg(pVar, zfVar));
                viewGroup.removeAllViews();
                viewGroup.addView(inflate);
                int z19 = zfVar.z();
                int i17 = z19 != 1 ? z19 != 2 ? z19 != 999 ? 0 : 3 : 1 : 2;
                df2.nw nwVar = df2.xw.f231808w;
                jz5.l[] lVarArr = new jz5.l[2];
                java.lang.String f17 = zfVar.f();
                if (f17 == null) {
                    f17 = "";
                }
                lVarArr[0] = new jz5.l("msg_id", f17);
                lVarArr[1] = new jz5.l("reply_type", java.lang.String.valueOf(i17));
                nwVar.a(4, kz5.c1.k(lVarArr));
                com.tencent.mm.plugin.finder.live.util.y.m(this, null, null, new com.tencent.mm.plugin.finder.live.plugin.fg(this, viewGroup, zfVar, null), 3, null);
            }
        }
        if (!z18 && kotlin.jvm.internal.o.b(((mm2.c1) P0(mm2.c1.class)).G3, java.lang.Boolean.TRUE) && ((mm2.c1) P0(mm2.c1.class)).f328801f2 != 2) {
            kotlin.jvm.internal.o.f(((mm2.x4) P0(mm2.x4.class)).f329530h, "<get-bulletListFromJoinLive>(...)");
            if (!r0.isEmpty()) {
                cn2.p0 A12 = A1();
                java.util.List list3 = ((mm2.x4) P0(mm2.x4.class)).f329530h;
                kotlin.jvm.internal.o.f(list3, "<get-bulletListFromJoinLive>(...)");
                A12.f(list3, true);
                ((mm2.x4) P0(mm2.x4.class)).f329530h.clear();
            }
            cn2.p0 A13 = A1();
            java.util.List list4 = ((mm2.x4) P0(mm2.x4.class)).f329529g;
            kotlin.jvm.internal.o.f(list4, "<get-bulletCommetList>(...)");
            A13.f(list4, true);
        }
        if (z17 && (!list.isEmpty())) {
            w1();
        }
    }

    public final void V1(java.util.List list) {
        if (!(list == null || list.isEmpty()) && ((mm2.x4) P0(mm2.x4.class)).f329536q != -1) {
            C1().post(new com.tencent.mm.plugin.finder.live.plugin.lg(list, this));
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.LiveCommentPlugin", "[updateMessagesOnViewAttach] curVisiableFirstPosition:" + ((mm2.x4) P0(mm2.x4.class)).f329537r);
    }

    @Override // he2.b
    public android.view.View W() {
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout;
        android.view.ViewGroup viewGroup = this.f365323d;
        android.view.ViewGroup viewGroup2 = this.f113504q;
        if (viewGroup2 == null) {
            com.tencent.mars.xlog.Log.i("Finder.LiveCommentPlugin", "getCommentRootView rootParent null");
            return viewGroup;
        }
        if (this.M != null) {
            com.tencent.mars.xlog.Log.i("Finder.LiveCommentPlugin", "getCommentRootView viewPagerRootView not null");
            android.view.View view = this.M;
            kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type android.view.View");
            return view;
        }
        com.tencent.mars.xlog.Log.i("Finder.LiveCommentPlugin", "getCommentRootView getPortraitRootView");
        if (viewGroup2 == null || (constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) viewGroup2.findViewById(com.tencent.mm.R.id.thw)) == null) {
            com.tencent.mars.xlog.Log.w("Finder.LiveCommentPlugin", "cannot find comment bottom area");
        } else {
            android.view.ViewParent parent = viewGroup.getParent();
            android.view.ViewGroup viewGroup3 = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup3 != null) {
                viewGroup3.removeView(viewGroup);
            }
            android.view.ViewParent parent2 = constraintLayout.getParent();
            android.view.ViewGroup viewGroup4 = parent2 instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent2 : null;
            if (viewGroup4 != null) {
                viewGroup4.removeView(constraintLayout);
            }
            android.content.Context context = viewGroup.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            androidx.constraintlayout.widget.ConstraintLayout finderLiveBoxConstraintLayout = new com.tencent.mm.plugin.finder.live.box.viewpager.FinderLiveBoxConstraintLayout(context);
            finderLiveBoxConstraintLayout.addView(constraintLayout, new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(-1, -2));
            androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
            cVar.d(finderLiveBoxConstraintLayout);
            cVar.e(constraintLayout.getId(), 1, 0, 1);
            cVar.e(constraintLayout.getId(), 2, 0, 2);
            cVar.e(constraintLayout.getId(), 4, 0, 4);
            cVar.b(finderLiveBoxConstraintLayout);
            finderLiveBoxConstraintLayout.setConstraintSet(null);
            androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(-1, -2);
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 12);
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 16);
            finderLiveBoxConstraintLayout.addView(viewGroup, layoutParams);
            androidx.constraintlayout.widget.c cVar2 = new androidx.constraintlayout.widget.c();
            cVar2.d(finderLiveBoxConstraintLayout);
            cVar2.e(viewGroup.getId(), 1, 0, 1);
            cVar2.e(viewGroup.getId(), 2, 0, 2);
            cVar2.e(viewGroup.getId(), 4, constraintLayout.getId(), 3);
            cVar2.b(finderLiveBoxConstraintLayout);
            finderLiveBoxConstraintLayout.setConstraintSet(null);
            viewGroup = finderLiveBoxConstraintLayout;
        }
        this.M = viewGroup;
        kotlin.jvm.internal.o.d(viewGroup);
        return viewGroup;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l
    public void g1(android.content.res.Configuration configuration) {
        if (x0()) {
            return;
        }
        android.view.ViewGroup viewGroup = this.f365323d;
        android.graphics.Point b17 = com.tencent.mm.ui.bl.b(viewGroup.getContext());
        if (b17.x >= (b17.y / 3) * 2) {
            android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            layoutParams.width = b17.x / 2;
            viewGroup.setLayoutParams(layoutParams);
            return;
        }
        we2.s sVar = (we2.s) S0().a(we2.s.class);
        int i17 = b17.x;
        android.view.ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        int marginStart = i17 - ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).getMarginStart();
        android.view.ViewGroup.LayoutParams layoutParams3 = viewGroup.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        sVar.f445257i = marginStart - ((android.view.ViewGroup.MarginLayoutParams) layoutParams3).getMarginEnd();
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l
    public void i1(android.os.Bundle bundle) {
        C1().post(new com.tencent.mm.plugin.finder.live.plugin.nf(this));
    }

    @Override // he2.b
    public void j(boolean z17) {
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return x0() || this.L;
    }

    @Override // he2.b
    public void w(int i17) {
        if (x0()) {
            com.tencent.mm.plugin.finder.live.view.FinderMaxSizeLayout finderMaxSizeLayout = this.f113510w;
            if (i17 == -2) {
                finderMaxSizeLayout.b(i17, false);
            } else {
                int i18 = com.tencent.mm.plugin.finder.live.view.FinderMaxSizeLayout.f116120n;
                finderMaxSizeLayout.b(0, true);
            }
        }
    }

    public final void w1() {
        java.lang.Boolean bool = ((mm2.c1) P0(mm2.c1.class)).G3;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (this.H != booleanValue) {
                java.lang.System.currentTimeMillis();
                this.H = booleanValue;
                if (booleanValue) {
                    P1(false);
                    y1(this, java.lang.Boolean.TRUE, 0, 2, null);
                    C1().setVisibility(0);
                } else {
                    P1(true);
                }
                com.tencent.mars.xlog.Log.i("Finder.LiveCommentPlugin", "enableLiveRoomComment:" + booleanValue);
            }
        }
    }

    public final void x1(java.lang.Boolean bool, int i17) {
        boolean b17 = kotlin.jvm.internal.o.b(bool, java.lang.Boolean.TRUE);
        bm2.o1 o1Var = this.D;
        if (b17) {
            if (1 <= i17 && i17 < 30) {
                int itemCount = o1Var.getItemCount() - 1;
                com.tencent.mm.plugin.finder.live.view.FinderLiveOverScrollRecyclerView C12 = C1();
                if (itemCount < 0) {
                    itemCount = 0;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(itemCount));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(C12, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin", "commentScrollToEnd", "(Ljava/lang/Boolean;I)V", "Undefined", "smoothScrollToPosition", "(I)V");
                C12.c1(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(C12, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin", "commentScrollToEnd", "(Ljava/lang/Boolean;I)V", "Undefined", "smoothScrollToPosition", "(I)V");
                this.I = ((mm2.c1) P0(mm2.c1.class)).f328775a2;
            }
        }
        if (i17 >= 1) {
            com.tencent.mm.plugin.finder.live.view.FinderLiveOverScrollRecyclerView C13 = C1();
            int itemCount2 = o1Var.getItemCount() - 1;
            if (itemCount2 < 0) {
                itemCount2 = 0;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(java.lang.Integer.valueOf(itemCount2));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(C13, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin", "commentScrollToEnd", "(Ljava/lang/Boolean;I)V", "Undefined", "scrollToPosition", "(I)V");
            C13.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(C13, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin", "commentScrollToEnd", "(Ljava/lang/Boolean;I)V", "Undefined", "scrollToPosition", "(I)V");
        } else if (kotlin.jvm.internal.o.b(bool, java.lang.Boolean.FALSE)) {
            com.tencent.mm.plugin.finder.live.view.FinderLiveOverScrollRecyclerView C14 = C1();
            int itemCount3 = o1Var.getItemCount() - 1;
            if (itemCount3 < 0) {
                itemCount3 = 0;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(java.lang.Integer.valueOf(itemCount3));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(C14, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin", "commentScrollToEnd", "(Ljava/lang/Boolean;I)V", "Undefined", "scrollToPosition", "(I)V");
            C14.a1(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(C14, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin", "commentScrollToEnd", "(Ljava/lang/Boolean;I)V", "Undefined", "scrollToPosition", "(I)V");
        }
        this.I = ((mm2.c1) P0(mm2.c1.class)).f328775a2;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void z0() {
        com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData liveMutableData;
        super.z0();
        ((we2.s) S0().a(we2.s.class)).N6().f234110i = new com.tencent.mm.plugin.finder.live.plugin.oe(new java.lang.ref.SoftReference(this));
        ((we2.s) S0().a(we2.s.class)).N6().f234109h = new com.tencent.mm.plugin.finder.live.plugin.ne(new java.lang.ref.SoftReference(this));
        ((mm2.e1) S0().a(mm2.e1.class)).f328986p.observe(this, new com.tencent.mm.plugin.finder.live.plugin.cf(this));
        ((mm2.x4) S0().a(mm2.x4.class)).f329545z.observe(this, new com.tencent.mm.plugin.finder.live.plugin.ef(this));
        ((je2.h) P0(je2.h.class)).f299233f.observe(this, new com.tencent.mm.plugin.finder.live.plugin.ff(this));
        df2.a9 a9Var = (df2.a9) U0(df2.a9.class);
        if (a9Var != null && (liveMutableData = a9Var.A) != null) {
            liveMutableData.observe(this, new com.tencent.mm.plugin.finder.live.plugin.hf(this));
        }
        ((mm2.x4) S0().a(mm2.x4.class)).B.observe(this, new com.tencent.mm.plugin.finder.live.plugin.Cif(this));
        ((mm2.c1) S0().a(mm2.c1.class)).C3.observe(this, new com.tencent.mm.plugin.finder.live.plugin.jf(this));
        com.tencent.mm.plugin.finder.live.util.y.m(this, null, null, new com.tencent.mm.plugin.finder.live.plugin.lf(this, null), 3, null);
    }

    public final int z1() {
        android.view.ViewGroup viewGroup = this.f113504q;
        android.view.View findViewById = viewGroup != null ? viewGroup.findViewById(com.tencent.mm.R.id.eqz) : null;
        com.tencent.mm.plugin.finder.live.plugin.r60 r60Var = (com.tencent.mm.plugin.finder.live.plugin.r60) X0(com.tencent.mm.plugin.finder.live.plugin.r60.class);
        if (r60Var != null) {
            com.tencent.mm.plugin.finder.live.plugin.r60 r60Var2 = r60Var.w0() == 0 ? r60Var : null;
            if (r60Var2 != null) {
                com.tencent.mm.plugin.finder.live.plugin.ep0 ep0Var = r60Var2.f114100u;
                if (ep0Var == null) {
                    ep0Var = r60Var2.f114101v;
                }
                if (ep0Var == null) {
                    return 0;
                }
                android.view.View findViewById2 = ep0Var.getView().findViewById(ep0Var.p0());
                return findViewById2 != null ? findViewById2.getHeight() : (int) ep0Var.getView().getResources().getDimension(com.tencent.mm.R.dimen.f479653br);
            }
        }
        if (findViewById != null) {
            return findViewById.getHeight();
        }
        return 0;
    }
}
