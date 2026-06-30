package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class r60 extends com.tencent.mm.plugin.finder.live.plugin.l implements vd2.j5 {
    public final android.graphics.Point A;
    public kotlinx.coroutines.r2 B;
    public kotlinx.coroutines.r2 C;
    public java.lang.Long D;
    public java.lang.String E;
    public final java.util.List F;
    public final java.util.List G;
    public final java.util.List H;
    public final jz5.g I;

    /* renamed from: J, reason: collision with root package name */
    public final yz5.l f114094J;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.ViewGroup f114095p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.ViewGroup f114096q;

    /* renamed from: r, reason: collision with root package name */
    public final qo0.c f114097r;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.String f114098s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.LinkedList f114099t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.plugin.ep0 f114100u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.plugin.ep0 f114101v;

    /* renamed from: w, reason: collision with root package name */
    public final android.view.ViewGroup f114102w;

    /* renamed from: x, reason: collision with root package name */
    public final android.widget.ScrollView f114103x;

    /* renamed from: y, reason: collision with root package name */
    public final android.view.View f114104y;

    /* renamed from: z, reason: collision with root package name */
    public final android.view.ViewGroup f114105z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r60(android.view.ViewGroup liveRootView, android.view.ViewGroup promoteBubbleContainerParent, qo0.c statusMonitor) {
        super(promoteBubbleContainerParent, statusMonitor, null);
        kotlin.jvm.internal.o.g(liveRootView, "liveRootView");
        kotlin.jvm.internal.o.g(promoteBubbleContainerParent, "promoteBubbleContainerParent");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f114095p = liveRootView;
        this.f114096q = promoteBubbleContainerParent;
        this.f114097r = statusMonitor;
        this.f114098s = "FinderLivePromoteBubblePlugin";
        java.util.LinkedList linkedList = new java.util.LinkedList();
        this.f114099t = linkedList;
        this.A = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
        this.F = kz5.b0.c(com.tencent.mm.plugin.finder.live.plugin.cj.class);
        this.G = kz5.c0.i(cm2.y.class, cm2.z.class);
        this.H = kz5.c0.i(cm2.m0.class, cm2.k0.class, com.tencent.mm.plugin.finder.live.plugin.i6.class);
        this.I = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.t50(this));
        this.f114094J = new com.tencent.mm.plugin.finder.live.plugin.f60(this);
        android.view.View findViewById = promoteBubbleContainerParent.findViewById(com.tencent.mm.R.id.fio);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f114102w = (android.view.ViewGroup) findViewById;
        android.view.View findViewById2 = promoteBubbleContainerParent.findViewById(com.tencent.mm.R.id.fip);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f114103x = (android.widget.ScrollView) findViewById2;
        android.view.View findViewById3 = promoteBubbleContainerParent.findViewById(com.tencent.mm.R.id.fil);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f114104y = findViewById3;
        android.view.View findViewById4 = promoteBubbleContainerParent.findViewById(com.tencent.mm.R.id.fim);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        com.tencent.mm.ui.bk.r0(((android.widget.TextView) findViewById4).getPaint(), 0.8f);
        android.view.View findViewById5 = promoteBubbleContainerParent.findViewById(com.tencent.mm.R.id.qya);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f114105z = (android.view.ViewGroup) findViewById5;
        linkedList.add(new com.tencent.mm.plugin.finder.live.plugin.h50(this));
        linkedList.add(new com.tencent.mm.plugin.finder.live.plugin.i50(this));
        linkedList.add(new com.tencent.mm.plugin.finder.live.plugin.j50(this));
        linkedList.add(new com.tencent.mm.plugin.finder.live.plugin.k50(this));
        linkedList.add(new com.tencent.mm.plugin.finder.live.plugin.l50(this));
        linkedList.add(new com.tencent.mm.plugin.finder.live.plugin.m50(this));
        linkedList.add(new com.tencent.mm.plugin.finder.live.plugin.n50(this));
        linkedList.add(new com.tencent.mm.plugin.finder.live.plugin.o50(this));
        linkedList.add(new com.tencent.mm.plugin.finder.live.plugin.p50(this));
        linkedList.add(new com.tencent.mm.plugin.finder.live.plugin.a50(this));
        linkedList.add(new com.tencent.mm.plugin.finder.live.plugin.b50(this));
        linkedList.add(new com.tencent.mm.plugin.finder.live.plugin.c50(this));
        linkedList.add(new com.tencent.mm.plugin.finder.live.plugin.d50(this));
        linkedList.add(new com.tencent.mm.plugin.finder.live.plugin.e50(this));
        linkedList.add(new com.tencent.mm.plugin.finder.live.plugin.f50(this));
        linkedList.add(new com.tencent.mm.plugin.finder.live.plugin.g50(this));
        if (x0()) {
            return;
        }
        android.graphics.Point b17 = com.tencent.mm.ui.bl.b(promoteBubbleContainerParent.getContext());
        if (b17.x >= (b17.y / 3) * 2) {
            android.view.ViewGroup.LayoutParams layoutParams = promoteBubbleContainerParent.getLayoutParams();
            layoutParams.width = (b17.x / 2) + ((int) promoteBubbleContainerParent.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479729dl));
            promoteBubbleContainerParent.setLayoutParams(layoutParams);
        }
    }

    public static final void t1(com.tencent.mm.plugin.finder.live.plugin.r60 r60Var, cm2.t tVar) {
        cm2.t A;
        r60Var.getClass();
        java.lang.String str = "[addPromoteData],promoteData = " + tVar.f43385d;
        java.lang.String str2 = r60Var.f114098s;
        com.tencent.mars.xlog.Log.i(str2, str);
        com.tencent.mm.plugin.finder.live.plugin.ep0 ep0Var = r60Var.f114100u;
        if (((ep0Var == null || (A = ep0Var.A()) == null) ? -1L : A.f43385d) == tVar.c()) {
            com.tencent.mars.xlog.Log.i(str2, "[addPromoteData],promoteData = " + tVar.f43385d + ", already add");
            return;
        }
        if (!((mm2.f6) r60Var.P0(mm2.f6.class)).f329035i && ((tVar instanceof cm2.m0) || (tVar instanceof cm2.k0))) {
            com.tencent.mars.xlog.Log.i("MMFinder.LiveShopSlice", "shoppingAvailable false, reset promotingProduct");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showBubble: reportExtBuff:");
        com.tencent.mm.protobuf.g gVar = tVar.f43397s;
        sb6.append(gVar != null ? new java.lang.String(gVar.g(), r26.c.f368865a) : "");
        sb6.append(", businessExtBuff:");
        com.tencent.mm.protobuf.g gVar2 = tVar.f43398t;
        sb6.append(gVar2 != null ? new java.lang.String(gVar2.g(), r26.c.f368865a) : "");
        com.tencent.mars.xlog.Log.i("kenneth_PromoteReport", sb6.toString());
        r60Var.E1(tVar);
        r60Var.x1(tVar);
        com.tencent.mm.plugin.finder.live.plugin.ep0 C1 = r60Var.C1(tVar);
        if (C1 != null) {
            com.tencent.mm.plugin.finder.live.plugin.ep0 ep0Var2 = r60Var.f114100u;
            if (ep0Var2 != null) {
                ep0Var2.l0();
            }
            if (r60Var.f114101v != null) {
                ((mm2.i5) r60Var.P0(mm2.i5.class)).f329140f.postValue(null);
            }
            C1.l(tVar);
            r60Var.F1(null);
            r60Var.y1(C1);
            r60Var.v1(r60Var.f114100u, C1);
            r60Var.f114100u = C1;
            ((mm2.f6) r60Var.P0(mm2.f6.class)).c7(tVar);
            df2.pv pvVar = (df2.pv) r60Var.U0(df2.pv.class);
            if (pvVar != null) {
                pvVar.d7(r60Var);
            }
            r60Var.G1();
            com.tencent.mm.plugin.finder.live.plugin.l.b1(r60Var, null, r60Var.f114098s, false, 4, null);
        }
        ((mm2.f6) r60Var.P0(mm2.f6.class)).L = 0L;
        pm0.v.V(1000L, new com.tencent.mm.plugin.finder.live.plugin.s50(r60Var));
    }

    public static final void u1(com.tencent.mm.plugin.finder.live.plugin.r60 r60Var) {
        com.tencent.mm.plugin.finder.live.widget.dk dkVar;
        com.tencent.mm.plugin.finder.live.plugin.ui uiVar = (com.tencent.mm.plugin.finder.live.plugin.ui) r60Var.X0(com.tencent.mm.plugin.finder.live.plugin.ui.class);
        if (uiVar != null && (dkVar = uiVar.f114568p) != null) {
            dkVar.a();
        }
        com.tencent.mm.plugin.finder.live.plugin.ll0 ll0Var = (com.tencent.mm.plugin.finder.live.plugin.ll0) r60Var.X0(com.tencent.mm.plugin.finder.live.plugin.ll0.class);
        if (ll0Var != null) {
            ll0Var.t1();
        }
        com.tencent.mm.plugin.finder.live.plugin.hz hzVar = (com.tencent.mm.plugin.finder.live.plugin.hz) r60Var.X0(com.tencent.mm.plugin.finder.live.plugin.hz.class);
        if (hzVar != null) {
            hzVar.v1();
        }
        ((mm2.c1) r60Var.P0(mm2.c1.class)).J2.postValue(java.lang.Boolean.FALSE);
    }

    public final void A1(com.tencent.mm.plugin.finder.live.plugin.ep0 ep0Var, yz5.a aVar) {
        if (zl2.r4.f473950a.w1()) {
            com.tencent.mm.plugin.finder.live.plugin.c4 c4Var = (com.tencent.mm.plugin.finder.live.plugin.c4) X0(com.tencent.mm.plugin.finder.live.plugin.c4.class);
            if (c4Var != null) {
                c4Var.H1();
            }
        } else {
            com.tencent.mm.plugin.finder.live.plugin.ag0 ag0Var = (com.tencent.mm.plugin.finder.live.plugin.ag0) X0(com.tencent.mm.plugin.finder.live.plugin.ag0.class);
            if (ag0Var != null) {
                ag0Var.L1();
            }
        }
        if (ep0Var != null) {
            ep0Var.R(this, new com.tencent.mm.plugin.finder.live.plugin.c60(aVar));
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l
    public void B(android.os.Bundle bundle, java.lang.Object obj, long j17) {
        this.f365323d.postDelayed(new com.tencent.mm.plugin.finder.live.plugin.j60(this, bundle, obj, j17), 500L);
    }

    public final void B1(com.tencent.mm.plugin.finder.live.plugin.ep0 ep0Var, com.tencent.mm.plugin.finder.live.plugin.ep0 ep0Var2) {
        android.view.View view = ep0Var != null ? ep0Var.getView() : null;
        android.view.View view2 = ep0Var2.getView();
        D1("doShopBubbleShowAnimate", view);
        android.view.ViewGroup viewGroup = this.f114102w;
        if (viewGroup == null) {
            kotlin.jvm.internal.o.o("promoteBubbleContainer");
            throw null;
        }
        viewGroup.addView(view2);
        if (zl2.r4.f473950a.w1()) {
            com.tencent.mm.plugin.finder.live.plugin.c4 c4Var = (com.tencent.mm.plugin.finder.live.plugin.c4) X0(com.tencent.mm.plugin.finder.live.plugin.c4.class);
            if (c4Var != null) {
                c4Var.H1();
            }
        } else {
            com.tencent.mm.plugin.finder.live.plugin.ag0 ag0Var = (com.tencent.mm.plugin.finder.live.plugin.ag0) X0(com.tencent.mm.plugin.finder.live.plugin.ag0.class);
            if (ag0Var != null) {
                ag0Var.L1();
            }
        }
        if (!ep0Var2.q0()) {
            com.tencent.mars.xlog.Log.e("IFinderLivePromoteItem", "runShopBubbleAnimateV2 when shopping not visible");
            return;
        }
        android.view.View view3 = ep0Var2.getView();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/IFinderLivePromoteItem", "runShopBubbleAnimateV2", "(Lcom/tencent/mm/plugin/finder/live/plugin/FinderBaseLivePlugin;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        float floatValue = ((java.lang.Float) arrayList.get(0)).floatValue();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Float.valueOf(floatValue));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/IFinderLivePromoteItem", "runShopBubbleAnimateV2", "(Lcom/tencent/mm/plugin/finder/live/plugin/FinderBaseLivePlugin;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view3.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/plugin/IFinderLivePromoteItem", "runShopBubbleAnimateV2", "(Lcom/tencent/mm/plugin/finder/live/plugin/FinderBaseLivePlugin;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/plugin/IFinderLivePromoteItem", "runShopBubbleAnimateV2", "(Lcom/tencent/mm/plugin/finder/live/plugin/FinderBaseLivePlugin;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.bottomMargin = -((int) view3.getResources().getDimension(com.tencent.mm.R.dimen.f479653br));
        }
        view3.post(new com.tencent.mm.plugin.finder.live.plugin.zo0(view3, ep0Var2, this));
    }

    public final com.tencent.mm.plugin.finder.live.plugin.ep0 C1(cm2.t tVar) {
        for (com.tencent.mm.plugin.finder.live.plugin.q50 q50Var : this.f114099t) {
            if (q50Var.a(tVar)) {
                return q50Var.b(tVar);
            }
        }
        return null;
    }

    @Override // vd2.j5
    public void C4() {
        K0(0);
    }

    public final void D1(java.lang.String str, android.view.View view) {
        java.lang.Boolean bool;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[removeOldViewAndLog] ");
        sb6.append(str);
        sb6.append(", contains:");
        android.view.ViewGroup viewGroup = this.f114102w;
        if (view == null) {
            bool = null;
        } else {
            if (viewGroup == null) {
                kotlin.jvm.internal.o.o("promoteBubbleContainer");
                throw null;
            }
            bool = java.lang.Boolean.valueOf(viewGroup.indexOfChild(view) != -1);
        }
        sb6.append(bool);
        sb6.append("?:false");
        com.tencent.mars.xlog.Log.i(this.f114098s, sb6.toString());
        if (viewGroup != null) {
            viewGroup.removeView(view);
        } else {
            kotlin.jvm.internal.o.o("promoteBubbleContainer");
            throw null;
        }
    }

    public final void E1(cm2.t tVar) {
        cm2.t A;
        if (zl2.r4.f473950a.w1()) {
            return;
        }
        com.tencent.mm.plugin.finder.live.plugin.ep0 ep0Var = this.f114100u;
        if (tVar.f43385d != ((ep0Var == null || (A = ep0Var.A()) == null) ? 0L : A.f43385d)) {
            df2.nt ntVar = (df2.nt) U0(df2.nt.class);
            if (ntVar != null) {
                r45.yp5 yp5Var = new r45.yp5();
                yp5Var.set(0, java.lang.Long.valueOf(tVar.f43385d));
                yp5Var.set(2, 1);
                yp5Var.set(1, 1);
                yp5Var.set(3, tVar.f43397s);
                ntVar.a7(yp5Var);
            }
            com.tencent.mm.protobuf.g gVar = tVar.f43397s;
            com.tencent.mars.xlog.Log.i("kenneth_PromoteReport", "[reportExpose] reportExtBuff:".concat(gVar != null ? new java.lang.String(gVar.g(), r26.c.f368865a) : ""));
        }
    }

    public final void F1(java.lang.Boolean bool) {
        if (zl2.r4.f473950a.y1(S0())) {
            return;
        }
        java.lang.Boolean bool2 = (java.lang.Boolean) ((je2.h) P0(je2.h.class)).f299233f.getValue();
        int i17 = bool != null ? bool.booleanValue() : bool2 == null || kotlin.jvm.internal.o.b(bool2, java.lang.Boolean.FALSE) ? 0 : 8;
        com.tencent.mm.plugin.finder.live.plugin.ep0 ep0Var = this.f114100u;
        if (ep0Var != null) {
            android.view.View findViewById = ep0Var.getView().findViewById(ep0Var.e0());
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(i17));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLivePromoteBubblePlugin", "showOrHideCloseView", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/plugin/FinderLivePromoteBubblePlugin", "showOrHideCloseView", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            y1(ep0Var);
        }
        com.tencent.mm.plugin.finder.live.plugin.ep0 ep0Var2 = this.f114101v;
        if (ep0Var2 != null) {
            android.view.View findViewById2 = ep0Var2.getView().findViewById(ep0Var2.e0());
            if (findViewById2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(java.lang.Integer.valueOf(i17));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLivePromoteBubblePlugin", "showOrHideCloseView", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/live/plugin/FinderLivePromoteBubblePlugin", "showOrHideCloseView", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            y1(ep0Var2);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    public final void G1() {
        java.lang.String str;
        java.lang.Object obj;
        com.tencent.mm.protobuf.f b17;
        so2.j5 j5Var = ((mm2.f6) S0().a(mm2.f6.class)).f329049w;
        cm2.t tVar = j5Var instanceof cm2.t ? (cm2.t) j5Var : null;
        r45.qc2 qc2Var = new r45.qc2();
        qc2Var.set(0, java.lang.Long.valueOf(tVar != null ? tVar.f43385d : 0L));
        qc2Var.set(1, tVar != null ? tVar.a() : null);
        qc2Var.set(2, tVar != null ? new com.tencent.mm.protobuf.g(tVar.b().toByteArray()) : null);
        if (tVar == null || (str = tVar.f43396r) == null) {
            str = "";
        }
        qc2Var.set(4, str);
        qc2Var.set(5, ((mm2.f6) S0().a(mm2.f6.class)).N);
        java.lang.Object obj2 = "null";
        if (tVar == null || (b17 = tVar.b()) == null || (obj = pm0.b0.g(b17)) == null) {
            obj = "null";
        }
        if (tVar != null) {
            r45.d52 d52Var = new r45.d52();
            com.tencent.mm.protobuf.g a17 = tVar.a();
            if (a17 != null) {
                d52Var.parseFrom(a17.g());
            }
            java.lang.Object g17 = pm0.b0.g(d52Var);
            if (g17 != null) {
                obj2 = g17;
            }
        }
        com.tencent.mars.xlog.Log.i(this.f114098s, "[startOrUpdatePollingData] update polling extBUf = " + qc2Var.getByteString(1) + ", current_promoting_id = " + qc2Var.getLong(0) + ", promote_info_buffer = " + obj + ", ext_buffer = " + obj2);
        dk2.ef efVar = dk2.ef.f233372a;
        dk2.ef.f233392k.h(10, qc2Var);
    }

    @Override // qo0.a
    public void I0() {
        com.tencent.mm.plugin.finder.live.plugin.ep0 ep0Var = this.f114100u;
        if (ep0Var != null) {
            ep0Var.onPause();
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
        pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.p60(status, bundle, this));
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void O0() {
        super.O0();
        if (!((mm2.c1) P0(mm2.c1.class)).R5) {
            z1(false, false, false);
        }
        com.tencent.mm.plugin.finder.live.plugin.ep0 ep0Var = this.f114100u;
        if (ep0Var != null) {
            ep0Var.t();
        }
        zl2.r4 r4Var = zl2.r4.f473950a;
        dk2.ef.f233392k.f(10);
        this.f114100u = null;
        w1();
    }

    @Override // vd2.j5
    public java.lang.String Q() {
        return this.f114098s;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l
    public void g1(android.content.res.Configuration configuration) {
        if (x0()) {
            return;
        }
        android.view.ViewGroup viewGroup = this.f114096q;
        android.graphics.Point b17 = com.tencent.mm.ui.bl.b(viewGroup.getContext());
        if (b17.x >= (b17.y / 3) * 2) {
            android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            layoutParams.width = (b17.x / 2) + ((int) viewGroup.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479729dl));
            viewGroup.setLayoutParams(layoutParams);
        } else {
            android.view.ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
            layoutParams2.width = -1;
            viewGroup.setLayoutParams(layoutParams2);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l
    public void i1(android.os.Bundle bundle) {
        this.f365323d.postDelayed(new com.tencent.mm.plugin.finder.live.plugin.g60(this, bundle), 500L);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l
    public void j1(android.os.Bundle bundle, long j17) {
        this.f365323d.postDelayed(new com.tencent.mm.plugin.finder.live.plugin.h60(this, bundle, j17), 500L);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l
    public void l1(android.os.Bundle bundle, java.lang.Object obj) {
        this.f365323d.postDelayed(new com.tencent.mm.plugin.finder.live.plugin.i60(this, bundle, obj), 500L);
    }

    @Override // vd2.j5
    public void o1() {
        K0(8);
    }

    @Override // vd2.j5
    public int priority() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return true;
    }

    public final void v1(com.tencent.mm.plugin.finder.live.plugin.ep0 ep0Var, com.tencent.mm.plugin.finder.live.plugin.ep0 ep0Var2) {
        android.view.View view = ep0Var != null ? ep0Var.getView() : null;
        android.view.View view2 = ep0Var2.getView();
        android.view.ViewGroup viewGroup = this.f114102w;
        if (viewGroup == null) {
            kotlin.jvm.internal.o.o("promoteBubbleContainer");
            throw null;
        }
        if (viewGroup.getChildCount() == 0 || view == null) {
            if (ep0Var2 instanceof com.tencent.mm.plugin.finder.live.plugin.ea0) {
                B1(ep0Var, ep0Var2);
                return;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[addPromoteBubbleAnim] addView when container cnt = ");
            if (viewGroup == null) {
                kotlin.jvm.internal.o.o("promoteBubbleContainer");
                throw null;
            }
            sb6.append(viewGroup.getChildCount());
            com.tencent.mars.xlog.Log.i(this.f114098s, sb6.toString());
            if (viewGroup == null) {
                kotlin.jvm.internal.o.o("promoteBubbleContainer");
                throw null;
            }
            viewGroup.addView(view2);
            if (viewGroup != null) {
                viewGroup.requestLayout();
                return;
            } else {
                kotlin.jvm.internal.o.o("promoteBubbleContainer");
                throw null;
            }
        }
        if (ep0Var instanceof com.tencent.mm.plugin.finder.live.plugin.ea0) {
            A1(ep0Var, new com.tencent.mm.plugin.finder.live.plugin.r50(this, ep0Var2, ep0Var, view, view2));
            return;
        }
        android.view.View view3 = ep0Var != null ? ep0Var.getView() : null;
        android.view.View view4 = ep0Var2.getView();
        if (ep0Var2 instanceof com.tencent.mm.plugin.finder.live.plugin.ea0) {
            B1(ep0Var, ep0Var2);
            return;
        }
        if (viewGroup == null) {
            kotlin.jvm.internal.o.o("promoteBubbleContainer");
            throw null;
        }
        int height = viewGroup.getHeight();
        android.view.ViewGroup viewGroup2 = this.f114096q;
        android.view.ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
        layoutParams.height = height;
        viewGroup2.setLayoutParams(layoutParams);
        viewGroup.addView(view4);
        view4.post(new com.tencent.mm.plugin.finder.live.plugin.b60(view3, view4, this, ep0Var2));
    }

    public final void w1() {
        kotlinx.coroutines.r2 r2Var = this.B;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.D = null;
        this.E = null;
    }

    public final void x1(cm2.t tVar) {
        if (zl2.r4.f473950a.y1(S0())) {
            return;
        }
        so2.j5 j5Var = ((mm2.f6) P0(mm2.f6.class)).f329049w;
        cm2.t tVar2 = j5Var instanceof cm2.t ? (cm2.t) j5Var : null;
        long j17 = tVar2 != null ? tVar2.f43385d : 0L;
        java.lang.String str = "[checkAndLaunchDelayDismissJob] curPromoteDataId = " + j17 + " , remotePromoteDataId = " + tVar.f43385d + " , delay:" + tVar.f43390i;
        java.lang.String str2 = this.f114098s;
        com.tencent.mars.xlog.Log.i(str2, str);
        if (j17 == tVar.f43385d && this.f114100u != null) {
            com.tencent.mars.xlog.Log.i(str2, "[checkAndLaunchDelayDismissJob] return");
            return;
        }
        kotlinx.coroutines.r2 r2Var = this.C;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        cm2.t tVar3 = tVar.f43390i > 0 ? tVar : null;
        if (tVar3 != null) {
            this.C = com.tencent.mm.plugin.finder.live.util.y.e(this, null, null, new com.tencent.mm.plugin.finder.live.plugin.u50(tVar3, this, tVar, null), 3, null);
        }
    }

    public final void y1(com.tencent.mm.plugin.finder.live.plugin.ep0 ep0Var) {
        kn0.p pVar;
        tn0.w0 Z0 = Z0();
        boolean z17 = false;
        if (Z0 != null && (pVar = Z0.D) != null && pVar.f()) {
            z17 = true;
        }
        java.lang.String str = this.f114098s;
        if (z17) {
            com.tencent.mars.xlog.Log.i(str, "[checkLayout] float mode, return.");
        } else if (x0()) {
            if (this.F.contains(ep0Var.getClass())) {
                return;
            }
            com.tencent.mars.xlog.Log.i(str, "[checkLayout] enter");
            ep0Var.getView().post(new com.tencent.mm.plugin.finder.live.plugin.v50(ep0Var, this));
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void z0() {
        super.z0();
        com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData liveMutableData = ((mm2.i5) P0(mm2.i5.class)).f329140f;
        liveMutableData.f111660d = true;
        liveMutableData.observe(this, new com.tencent.mm.plugin.finder.live.plugin.d60(this));
        com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData liveMutableData2 = ((je2.h) P0(je2.h.class)).f299233f;
        liveMutableData2.f111660d = true;
        liveMutableData2.observe(this, new com.tencent.mm.plugin.finder.live.plugin.e60(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z1(boolean r31, boolean r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.r60.z1(boolean, boolean, boolean):void");
    }
}
