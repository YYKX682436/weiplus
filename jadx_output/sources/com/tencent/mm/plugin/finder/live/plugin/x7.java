package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes10.dex */
public final class x7 extends com.tencent.mm.plugin.finder.live.plugin.l {
    public boolean A;
    public com.tencent.mm.plugin.finder.live.view.j2 B;
    public final com.tencent.mm.plugin.finder.live.plugin.u7 C;
    public final jz5.g D;
    public final jz5.g E;
    public final zh2.c F;
    public final jz5.g G;
    public final jz5.g H;
    public final jz5.g I;

    /* renamed from: J, reason: collision with root package name */
    public final jz5.g f115035J;
    public final jz5.g K;
    public final jz5.g L;
    public final bm2.c1 M;
    public final java.util.ArrayList N;
    public com.tencent.mm.ui.widget.dialog.k0 P;
    public int Q;
    public boolean R;
    public com.tencent.mm.plugin.finder.live.view.e2 S;

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f115036p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f115037q;

    /* renamed from: r, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f115038r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.view.FinderLiveTextIndicator f115039s;

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.LiveBottomSheetPanel f115040t;

    /* renamed from: u, reason: collision with root package name */
    public final android.view.View f115041u;

    /* renamed from: v, reason: collision with root package name */
    public final android.view.View f115042v;

    /* renamed from: w, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f115043w;

    /* renamed from: x, reason: collision with root package name */
    public final android.view.View f115044x;

    /* renamed from: y, reason: collision with root package name */
    public final android.view.View f115045y;

    /* renamed from: z, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.widget.mn f115046z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x7(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f115036p = statusMonitor;
        this.f115037q = "Finder.FinderLiveAnchorLinkListPlugin";
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) root.findViewById(com.tencent.mm.R.id.ekv);
        this.f115038r = recyclerView;
        com.tencent.mm.plugin.finder.live.view.FinderLiveTextIndicator finderLiveTextIndicator = (com.tencent.mm.plugin.finder.live.view.FinderLiveTextIndicator) root.findViewById(com.tencent.mm.R.id.f484546el1);
        this.f115039s = finderLiveTextIndicator;
        com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel = (com.tencent.mm.ui.widget.LiveBottomSheetPanel) root.findViewById(com.tencent.mm.R.id.eke);
        this.f115040t = liveBottomSheetPanel;
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.ekc);
        this.f115041u = findViewById;
        android.view.View findViewById2 = root.findViewById(com.tencent.mm.R.id.ekd);
        this.f115042v = findViewById2;
        this.f115043w = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById2.findViewById(com.tencent.mm.R.id.f6b);
        android.view.View findViewById3 = root.findViewById(com.tencent.mm.R.id.tg8);
        this.f115044x = findViewById3;
        this.f115045y = root.findViewById(com.tencent.mm.R.id.ekm);
        android.view.View findViewById4 = root.findViewById(com.tencent.mm.R.id.f5b);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        com.tencent.mm.plugin.finder.live.widget.mn mnVar = new com.tencent.mm.plugin.finder.live.widget.mn((android.view.ViewGroup) findViewById4, statusMonitor, this);
        this.f115046z = mnVar;
        com.tencent.mm.plugin.finder.live.plugin.u7 u7Var = new com.tencent.mm.plugin.finder.live.plugin.u7(this);
        this.C = u7Var;
        this.D = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.s7(root, this));
        this.E = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.r7(root, this));
        com.tencent.mm.plugin.finder.live.plugin.l7 l7Var = new com.tencent.mm.plugin.finder.live.plugin.l7(this, root);
        this.F = l7Var;
        this.G = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.w7(this, root));
        this.H = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.n7(root, this));
        this.I = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.v7(root, this));
        this.f115035J = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.g7(root, this));
        this.K = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.i7(root, this));
        this.L = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.h7(root, this));
        bm2.c1 c1Var = new bm2.c1(S0());
        this.M = c1Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.N = arrayList;
        androidx.recyclerview.widget.y1 y1Var = new androidx.recyclerview.widget.y1();
        recyclerView.getLayoutParams().height = ((com.tencent.mm.ui.bl.b(root.getContext()).y * 2) / 3) - com.tencent.mm.ui.bl.c(root.getContext());
        liveBottomSheetPanel.setTranslationY(com.tencent.mm.ui.bl.b(root.getContext()).y);
        liveBottomSheetPanel.setOnVisibilityListener(new com.tencent.mm.plugin.finder.live.plugin.w6(this));
        gk2.e S0 = S0();
        android.view.ViewGroup viewGroup = this.f365323d;
        com.tencent.mm.plugin.finder.live.view.j2 j2Var = new com.tencent.mm.plugin.finder.live.view.j2(S0, viewGroup, u7Var, l7Var);
        j2Var.f116433f = 0;
        j2Var.f116432e = true;
        arrayList.add(j2Var);
        this.B = j2Var;
        gk2.e S02 = S0();
        android.content.Context context = viewGroup.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.live.view.e2 e2Var = new com.tencent.mm.plugin.finder.live.view.e2(S02, context, this);
        e2Var.setOnAnchorApplyListListener(new com.tencent.mm.plugin.finder.live.plugin.p7(this, e2Var));
        mnVar.f119096t.f119402h = e2Var.getOnAnchorApplyListListener();
        e2Var.f116433f = 1;
        e2Var.f116432e = false;
        arrayList.add(e2Var);
        this.S = e2Var;
        java.util.ArrayList arrayList2 = c1Var.f21807d;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        android.content.Context context2 = root.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        com.tencent.mm.plugin.finder.live.view.FinderLiveLayoutManager finderLiveLayoutManager = new com.tencent.mm.plugin.finder.live.view.FinderLiveLayoutManager(context2, 0, false);
        finderLiveLayoutManager.f115992z = new com.tencent.mm.plugin.finder.live.plugin.x6(this);
        recyclerView.setLayoutManager(finderLiveLayoutManager);
        recyclerView.i(new com.tencent.mm.plugin.finder.live.plugin.a7(this, root));
        recyclerView.setAdapter(c1Var);
        y1Var.b(recyclerView);
        findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.b7(this));
        findViewById2.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.c7(this));
        findViewById3.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.e7(this));
        finderLiveTextIndicator.setOnTabSelectedListener(new com.tencent.mm.plugin.finder.live.plugin.f7(this));
        android.content.Context context3 = finderLiveTextIndicator.getContext();
        kotlin.jvm.internal.o.f(context3, "getContext(...)");
        java.lang.Object systemService = context3.getSystemService("window");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        android.view.Display defaultDisplay = ((android.view.WindowManager) systemService).getDefaultDisplay();
        if (defaultDisplay != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        float f17 = (displayMetrics.density * 15.0f) / context3.getResources().getDisplayMetrics().density;
        finderLiveTextIndicator.f116112d.setTextSize(1, f17);
        finderLiveTextIndicator.f116113e.setTextSize(1, f17);
    }

    public static final void t1(com.tencent.mm.plugin.finder.live.plugin.x7 x7Var, dk2.m mVar, yz5.l lVar) {
        if (!((mm2.y2) x7Var.P0(mm2.y2.class)).W6(true)) {
            if (lVar != null) {
                lVar.invoke(java.lang.Boolean.FALSE);
                return;
            }
            return;
        }
        x7Var.C1();
        if (mVar.f233738a == 2 && mVar.f233742e != 3) {
            if (lVar != null) {
                lVar.invoke(java.lang.Boolean.TRUE);
            }
            x7Var.x1().E(mVar);
        } else {
            qf2.y1 y1Var = (qf2.y1) x7Var.U0(qf2.y1.class);
            if (y1Var != null) {
                y1Var.e7(mVar, lVar);
            }
        }
    }

    public final qi2.j1 A1() {
        return (qi2.j1) ((jz5.n) this.I).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    @Override // qo0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean B0() {
        /*
            r3 = this;
            com.tencent.mm.plugin.finder.live.widget.mn r0 = r3.f115046z
            boolean r1 = r0.b()
            r2 = 1
            if (r1 == 0) goto Ld
            r0.a()
            goto L45
        Ld:
            com.tencent.mm.plugin.finder.live.view.j2 r0 = r3.B
            r1 = 0
            if (r0 == 0) goto L29
            nj2.p r0 = r0.f116401i
            ej2.j r0 = r0.i()
            android.view.View r0 = r0.f253301d
            if (r0 == 0) goto L24
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L24
            r0 = r2
            goto L25
        L24:
            r0 = r1
        L25:
            if (r0 != r2) goto L29
            r0 = r2
            goto L2a
        L29:
            r0 = r1
        L2a:
            if (r0 == 0) goto L3a
            com.tencent.mm.plugin.finder.live.view.j2 r0 = r3.B
            if (r0 == 0) goto L45
            nj2.p r0 = r0.f116401i
            ej2.j r0 = r0.i()
            r0.b()
            goto L45
        L3a:
            int r0 = r3.w0()
            if (r0 != 0) goto L44
            r3.C1()
            goto L45
        L44:
            r2 = r1
        L45:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.x7.B0():boolean");
    }

    public final nj2.z B1() {
        return (nj2.z) ((jz5.n) this.G).getValue();
    }

    @Override // qo0.a
    public void C0(java.util.LinkedHashMap micUserMap) {
        kotlin.jvm.internal.o.g(micUserMap, "micUserMap");
        java.util.Iterator it = this.N.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.finder.live.view.k2) it.next()).i(S0());
        }
        if (A1().q()) {
            A1().z();
        }
        if (v1().q()) {
            v1().z();
        }
    }

    public final void C1() {
        com.tencent.mm.ui.widget.LiveBottomSheetPanel contentGroup = this.f115040t;
        kotlin.jvm.internal.o.f(contentGroup, "contentGroup");
        com.tencent.mm.ui.widget.LiveBottomSheetPanel.b(contentGroup, null, 1, null);
    }

    public final void D1() {
        com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel = this.f115040t;
        liveBottomSheetPanel.animate().translationY(com.tencent.mm.ui.bl.b(this.f365323d.getContext()).y);
        java.util.Iterator it = this.M.f21807d.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.finder.live.view.k2) it.next()).f();
        }
        com.tencent.mm.ui.widget.LiveBottomSheetPanel.b(liveBottomSheetPanel, null, 1, null);
    }

    public final void E1() {
        boolean N6 = ((mm2.y2) P0(mm2.y2.class)).N6(true, 1, false);
        java.lang.String str = this.f115037q;
        if (!N6) {
            com.tencent.mars.xlog.Log.i(str, "onRandomMatchClick click invalid");
            return;
        }
        if (this.R || ((mm2.o4) P0(mm2.o4.class)).D) {
            com.tencent.mars.xlog.Log.i(str, "onRandomMatchClick: return, inRandomMatchProcess = " + this.R + ", isWaitingRandomMatch = " + ((mm2.o4) P0(mm2.o4.class)).D);
            return;
        }
        com.tencent.mars.xlog.Log.i(str, "launchRandomMatch: start");
        this.R = true;
        dk2.xf W0 = W0();
        if (W0 != null) {
            byte[] bArr = ((mm2.e1) S0().a(mm2.e1.class)).f328985o;
            long j17 = ((mm2.e1) S0().a(mm2.e1.class)).f328988r.getLong(0);
            long j18 = ((mm2.e1) S0().a(mm2.e1.class)).f328983m;
            java.lang.String str2 = ((mm2.e1) S0().a(mm2.e1.class)).f328992v;
            android.content.Context context = this.f113324f.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            ((dk2.r4) W0).k0(bArr, j17, j18, str2, xy2.c.e(context), 1, ((mm2.o4) S0().a(mm2.o4.class)).R, new com.tencent.mm.plugin.finder.live.plugin.k7(this));
        }
    }

    public final void F1() {
        com.tencent.mm.plugin.finder.live.view.k2 k2Var;
        nj2.f fVar;
        nj2.w wVar;
        nj2.z B1 = B1();
        if (B1 != null && B1.q()) {
            nj2.z B12 = B1();
            if (B12 == null || (wVar = B12.f337878u) == null) {
                return;
            }
            nj2.z zVar = wVar.f337864a;
            if (zVar.q()) {
                zVar.y().q();
                zVar.z().r("onNotifyDataChanged");
                zVar.f337879v.c();
                return;
            }
            return;
        }
        nj2.h w17 = w1();
        if (!(w17 != null && w17.P())) {
            if (w0() == 0 && (k2Var = (com.tencent.mm.plugin.finder.live.view.k2) kz5.n0.Z(this.N)) != null) {
                k2Var.j();
            }
            if (A1().q()) {
                A1().z();
            }
            if (v1().q()) {
                v1().z();
                return;
            }
            return;
        }
        nj2.h w18 = w1();
        if (w18 == null || (fVar = w18.S) == null) {
            return;
        }
        nj2.h hVar = fVar.f337832a;
        if (hVar.P()) {
            nj2.h.e0(hVar).q();
            ((mj2.f) ((jz5.n) hVar.N).getValue()).r("onNotifyDataChanged");
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        if (r0.P() == true) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G1(boolean r4, km2.q r5) {
        /*
            r3 = this;
            if (r5 == 0) goto L97
            boolean r0 = r5.f309177h
            if (r0 != 0) goto L97
            java.lang.Class<mm2.e1> r0 = mm2.e1.class
            androidx.lifecycle.c1 r0 = r3.P0(r0)
            mm2.e1 r0 = (mm2.e1) r0
            boolean r0 = r0.g7()
            if (r0 == 0) goto L3a
            nj2.z r0 = r3.B1()
            if (r0 == 0) goto L39
            nj2.w r0 = r0.f337878u
            if (r0 == 0) goto L39
            nj2.z r0 = r0.f337864a
            boolean r1 = r0.q()
            if (r1 == 0) goto L39
            nj2.r r1 = r0.y()
            r1.r(r4, r5)
            mj2.m r1 = r0.z()
            r1.o(r4, r5)
            kj2.o r4 = r0.f337879v
            r4.c()
        L39:
            return
        L3a:
            nj2.h r0 = r3.w1()
            r1 = 0
            if (r0 == 0) goto L49
            boolean r0 = r0.P()
            r2 = 1
            if (r0 != r2) goto L49
            goto L4a
        L49:
            r2 = r1
        L4a:
            if (r2 == 0) goto L72
            nj2.h r0 = r3.w1()
            if (r0 == 0) goto L72
            nj2.f r0 = r0.S
            if (r0 == 0) goto L72
            nj2.h r0 = r0.f337832a
            boolean r2 = r0.P()
            if (r2 == 0) goto L72
            nj2.j r2 = nj2.h.e0(r0)
            r2.r(r4, r5)
            jz5.g r0 = r0.N
            jz5.n r0 = (jz5.n) r0
            java.lang.Object r0 = r0.getValue()
            mj2.f r0 = (mj2.f) r0
            r0.o(r4, r5)
        L72:
            qi2.j1 r0 = r3.A1()
            boolean r0 = r0.q()
            if (r0 == 0) goto L8a
            qi2.j1 r0 = r3.A1()
            nj2.p r2 = r0.f363549y
            r2.r(r4, r5)
            mj2.k r0 = r0.f363550z
            r0.o(r4, r5)
        L8a:
            java.util.ArrayList r0 = r3.N
            java.lang.Object r0 = kz5.n0.a0(r0, r1)
            com.tencent.mm.plugin.finder.live.view.k2 r0 = (com.tencent.mm.plugin.finder.live.view.k2) r0
            if (r0 == 0) goto L97
            r0.k(r4, r5)
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.x7.G1(boolean, km2.q):void");
    }

    public final void H1(int i17) {
        com.tencent.mm.plugin.finder.live.view.k2 k2Var;
        if (w0() != 0 || (k2Var = (com.tencent.mm.plugin.finder.live.view.k2) kz5.n0.a0(this.N, 1)) == null) {
            return;
        }
        k2Var.c(i17);
    }

    public final void I1(int i17) {
        if (w0() == 0) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f115038r;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(1);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkListPlugin", "onBattleActionSucc", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
            recyclerView.c1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(recyclerView, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkListPlugin", "onBattleActionSucc", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
            com.tencent.mm.plugin.finder.live.view.k2 k2Var = (com.tencent.mm.plugin.finder.live.view.k2) kz5.n0.a0(this.N, 1);
            if (k2Var != null) {
                k2Var.d(i17);
            }
            C1();
        }
    }

    public final void J1(int i17) {
        boolean g76 = ((mm2.e1) P0(mm2.e1.class)).g7();
        qo0.c cVar = this.f115036p;
        if (g76) {
            nj2.z B1 = B1();
            if (B1 != null) {
                B1.w();
            }
            K0(8);
            qo0.c.a(cVar, qo0.b.K3, null, 2, null);
            return;
        }
        if (((java.lang.Boolean) ((kotlinx.coroutines.flow.h3) ((mm2.o4) P0(mm2.o4.class)).H).getValue()).booleanValue()) {
            nj2.h w17 = w1();
            if (w17 != null) {
                com.tencent.mm.plugin.finder.live.widget.e0.W(w17, null, false, 0, 7, null);
                w17.f0(true);
                qf2.q3 q3Var = (qf2.q3) w17.I.getController(qf2.q3.class);
                if (q3Var != null) {
                    nj2.e eVar = new nj2.e(w17);
                    com.tencent.mars.xlog.Log.i("FinderLivePayMicControl", "requestPurchaseInfo");
                    com.tencent.mm.plugin.finder.live.util.y.d(q3Var, null, null, new qf2.o3(false, q3Var, eVar, null), 3, null);
                }
            }
            K0(8);
            qo0.c.a(cVar, qo0.b.K3, null, 2, null);
            return;
        }
        android.view.ViewGroup viewGroup = this.f365323d;
        viewGroup.setBackground(viewGroup.getContext().getResources().getDrawable(com.tencent.mm.R.color.f479319w5));
        K0(0);
        this.M.notifyDataSetChanged();
        L1();
        this.f115040t.post(new com.tencent.mm.plugin.finder.live.plugin.q7(this, i17));
        com.tencent.mars.xlog.Log.i(this.f115037q, "showApplyLinkList :" + ((mm2.o4) P0(mm2.o4.class)).f329318o.size() + " enableNewAnchorPkMic: " + ((mm2.c1) P0(mm2.c1.class)).f328926z3);
    }

    public final void K1() {
        pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.t7(this));
    }

    public final void L1() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("  ");
        android.view.ViewGroup viewGroup = this.f365323d;
        sb6.append(viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.dmr));
        sb6.append("  ");
        java.lang.String sb7 = sb6.toString();
        com.tencent.mm.plugin.finder.live.view.FinderLiveTextIndicator finderLiveTextIndicator = this.f115039s;
        finderLiveTextIndicator.setTab1Text(sb7);
        finderLiveTextIndicator.setTab2Text("  " + viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.dmq) + "  ");
        gk2.e S0 = S0();
        java.util.Iterator it = this.M.f21807d.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.finder.live.view.k2) it.next()).l(S0);
        }
        gk2.e liveData = S0();
        com.tencent.mm.plugin.finder.live.widget.mn mnVar = this.f115046z;
        mnVar.getClass();
        kotlin.jvm.internal.o.g(liveData, "liveData");
        pm0.v.X(new com.tencent.mm.plugin.finder.live.widget.kn(mnVar));
        finderLiveTextIndicator.a(((mm2.o4) P0(mm2.o4.class)).t7() > 0);
        finderLiveTextIndicator.b(((mm2.o4) P0(mm2.o4.class)).u7() > 0);
        u1();
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        com.tencent.mm.plugin.finder.live.view.k2 k2Var;
        kotlin.jvm.internal.o.g(status, "status");
        super.M0(status, bundle);
        int ordinal = status.ordinal();
        if (ordinal == 191) {
            this.A = bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_AUDIO_MODE", false) : false;
            if (bundle != null) {
                bundle.getBoolean("PARAM_FINDER_LIVE_IS_SHARE_MODE", false);
                return;
            }
            return;
        }
        if (ordinal == 203) {
            y1().a();
            z1().a();
            C1();
            return;
        }
        java.util.ArrayList arrayList = this.N;
        if (ordinal == 207) {
            if (w0() != 0 || (k2Var = (com.tencent.mm.plugin.finder.live.view.k2) kz5.n0.a0(arrayList, 1)) == null) {
                return;
            }
            k2Var.b();
            return;
        }
        switch (ordinal) {
            case 163:
                java.lang.String string = bundle != null ? bundle.getString("PARAM_FINDER_LIVE_AI_ASSISTANT_ID") : null;
                byte[] byteArray = bundle != null ? bundle.getByteArray("PARAM_FINDER_LIVE_AI_ASSISTANT_JUMP_INFO_BUFFER") : null;
                com.tencent.mm.plugin.finder.live.view.k2 k2Var2 = (com.tencent.mm.plugin.finder.live.view.k2) kz5.n0.a0(arrayList, 1);
                if (k2Var2 != null) {
                    k2Var2.m(string, byteArray);
                }
                J1(bundle != null ? bundle.getInt("PARAM_FINDER_LIVE_SHOW_APPLY_LIST_INDEX", -1) : -1);
                if (bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_LINK_MIC_SHOW_BATTLE_PANEL", false) : false) {
                    androidx.recyclerview.widget.RecyclerView recyclerView = this.f115038r;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList2.add(1);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(recyclerView, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkListPlugin", "showBattlePanel", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
                    recyclerView.c1(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(recyclerView, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkListPlugin", "showBattlePanel", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
                    return;
                }
                return;
            case 164:
                x1().w();
                return;
            case 165:
                dk2.u4 u4Var = ((mm2.o4) P0(mm2.o4.class)).Z;
                java.lang.Integer valueOf = u4Var != null ? java.lang.Integer.valueOf(u4Var.f234158e) : null;
                if ((valueOf != null && valueOf.intValue() == 0) || (valueOf != null && valueOf.intValue() == 1)) {
                    ((qi2.k0) ((jz5.n) this.L).getValue()).w();
                    return;
                } else {
                    v1().w();
                    return;
                }
            case 166:
                A1().w();
                return;
            default:
                return;
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f328801f2 != 1;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return false;
    }

    @Override // qo0.a
    public void s0(int i17, int i18, android.os.Bundle bundle) {
        if (!pm0.v.z(i18, 16384)) {
            K0(8);
        } else if (w0() != 0) {
            J1(-1);
        }
    }

    public final void u1() {
        android.view.ViewGroup viewGroup = this.f365323d;
        this.f115043w.setIconColor(viewGroup.getContext().getResources().getColor(com.tencent.mm.R.color.FG_0));
        this.f115039s.setTab2Color(viewGroup.getContext().getResources().getColor(com.tencent.mm.R.color.FG_0));
        this.f115040t.setBackgroundDrawable(viewGroup.getContext().getResources().getDrawable(com.tencent.mm.R.drawable.aja));
    }

    public final qi2.n v1() {
        dk2.u4 u4Var = ((mm2.o4) P0(mm2.o4.class)).Z;
        return ((u4Var != null && u4Var.g()) || (((mm2.o4) P0(mm2.o4.class)).f329324s.size() == 1 && !((mm2.c1) P0(mm2.c1.class)).K)) ? (qi2.n) ((jz5.n) this.K).getValue() : (qi2.n) ((jz5.n) this.f115035J).getValue();
    }

    public final nj2.h w1() {
        return (nj2.h) ((jz5.n) this.H).getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
    
        if ((r0.f234158e == 7) == true) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final qi2.c0 x1() {
        /*
            r6 = this;
            java.lang.Class<mm2.o4> r0 = mm2.o4.class
            androidx.lifecycle.c1 r1 = r6.P0(r0)
            mm2.o4 r1 = (mm2.o4) r1
            dk2.u4 r1 = r1.Z
            if (r1 == 0) goto L5b
            java.lang.String r2 = r1.f234154a
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L1b
            int r2 = r2.length()
            if (r2 != 0) goto L19
            goto L1b
        L19:
            r2 = r4
            goto L1c
        L1b:
            r2 = r3
        L1c:
            if (r2 != 0) goto L5b
            int r2 = r1.f234160g
            r5 = 2
            if (r2 != r5) goto L5b
            boolean r1 = r1.f()
            if (r1 == 0) goto L5b
            androidx.lifecycle.c1 r1 = r6.P0(r0)
            mm2.o4 r1 = (mm2.o4) r1
            dk2.u4 r1 = r1.Z
            if (r1 == 0) goto L3b
            boolean r1 = r1.i()
            if (r1 != r3) goto L3b
            r1 = r3
            goto L3c
        L3b:
            r1 = r4
        L3c:
            if (r1 != 0) goto L5b
            androidx.lifecycle.c1 r0 = r6.P0(r0)
            mm2.o4 r0 = (mm2.o4) r0
            dk2.u4 r0 = r0.Z
            if (r0 == 0) goto L53
            int r0 = r0.f234158e
            r1 = 7
            if (r0 != r1) goto L4f
            r0 = r3
            goto L50
        L4f:
            r0 = r4
        L50:
            if (r0 != r3) goto L53
            goto L54
        L53:
            r3 = r4
        L54:
            if (r3 != 0) goto L5b
            qi2.w r0 = r6.y1()
            return r0
        L5b:
            qi2.c0 r0 = r6.z1()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.x7.x1():qi2.c0");
    }

    @Override // qo0.a
    public void y0(boolean z17, int i17) {
        nj2.f fVar;
        nj2.w wVar;
        if (((mm2.e1) P0(mm2.e1.class)).g7()) {
            nj2.z B1 = B1();
            if (B1 == null || (wVar = B1.f337878u) == null) {
                return;
            }
            nj2.z zVar = wVar.f337864a;
            if (zVar.q()) {
                zVar.y().o(z17, i17);
                return;
            }
            return;
        }
        if (((java.lang.Boolean) ((kotlinx.coroutines.flow.h3) ((mm2.o4) P0(mm2.o4.class)).H).getValue()).booleanValue()) {
            nj2.h w17 = w1();
            if (w17 == null || (fVar = w17.S) == null) {
                return;
            }
            nj2.h hVar = fVar.f337832a;
            if (hVar.P()) {
                nj2.h.e0(hVar).o(z17, i17);
                return;
            }
            return;
        }
        com.tencent.mm.plugin.finder.live.widget.mn mnVar = this.f115046z;
        if (!mnVar.b()) {
            java.util.Iterator it = this.M.f21807d.iterator();
            while (it.hasNext()) {
                ((com.tencent.mm.plugin.finder.live.view.k2) it.next()).g(z17, i17);
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveLinkInviteAnchorWidget", "keyboardChange show:" + z17 + " height:" + i17);
        if (z17) {
            mnVar.d();
            mnVar.f119083d.post(new com.tencent.mm.plugin.finder.live.widget.fn(mnVar));
        }
    }

    public final qi2.w y1() {
        return (qi2.w) ((jz5.n) this.E).getValue();
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void z0() {
        super.z0();
        com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData liveMutableData = ((mm2.o4) P0(mm2.o4.class)).Q;
        liveMutableData.f111660d = true;
        liveMutableData.observe(this, new com.tencent.mm.plugin.finder.live.plugin.m7(this));
    }

    public final qi2.c0 z1() {
        return (qi2.c0) ((jz5.n) this.D).getValue();
    }
}
