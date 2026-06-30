package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes.dex */
public final class rx extends com.tencent.mm.plugin.finder.live.widget.e0 {
    public static java.util.LinkedList Z;
    public final com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore H;
    public final java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public android.view.View f119692J;
    public android.view.View K;
    public android.widget.TextView L;
    public androidx.recyclerview.widget.RecyclerView M;
    public androidx.recyclerview.widget.RecyclerView N;
    public android.view.View P;
    public final jz5.g Q;
    public final jz5.g R;
    public java.util.LinkedList S;
    public kotlinx.coroutines.r2 T;
    public com.tencent.mm.ui.widget.dialog.k0 U;
    public final int V;
    public final jz5.g W;
    public boolean X;
    public boolean Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rx(android.content.Context context, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(context, false, null, -1.0f, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(store, "store");
        this.H = store;
        this.I = "Finder.FinderLiveTaskPanel";
        this.Q = jz5.h.b(new com.tencent.mm.plugin.finder.live.widget.qx(this));
        this.R = jz5.h.b(new com.tencent.mm.plugin.finder.live.widget.bx(this));
        this.V = 1;
        this.W = jz5.h.b(new com.tencent.mm.plugin.finder.live.widget.ax(context));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e0(com.tencent.mm.plugin.finder.live.widget.rx r7, kotlin.coroutines.Continuation r8) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.rx.e0(com.tencent.mm.plugin.finder.live.widget.rx, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int A() {
        return com.tencent.mm.R.layout.dte;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int D() {
        return 8;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void N(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.rnr);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f119692J = findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.tencent.mm.R.id.rnu);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.K = findViewById2;
        android.view.View findViewById3 = rootView.findViewById(com.tencent.mm.R.id.rnt);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.P = findViewById3;
        android.view.View findViewById4 = rootView.findViewById(com.tencent.mm.R.id.rnw);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById4;
        this.L = textView;
        com.tencent.mm.ui.bk.q0(textView.getPaint());
        android.view.View findViewById5 = rootView.findViewById(com.tencent.mm.R.id.rnp);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) findViewById5;
        this.M = recyclerView;
        android.content.Context context = this.f118183e;
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context, 0, false));
        com.tencent.mm.plugin.finder.ui.o6 o6Var = new com.tencent.mm.plugin.finder.ui.o6();
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.M;
        if (recyclerView2 == null) {
            kotlin.jvm.internal.o.o("cardRv");
            throw null;
        }
        o6Var.b(recyclerView2);
        androidx.recyclerview.widget.RecyclerView recyclerView3 = this.M;
        if (recyclerView3 == null) {
            kotlin.jvm.internal.o.o("cardRv");
            throw null;
        }
        recyclerView3.setAdapter((vm2.v) ((jz5.n) this.R).getValue());
        androidx.recyclerview.widget.RecyclerView recyclerView4 = this.M;
        if (recyclerView4 == null) {
            kotlin.jvm.internal.o.o("cardRv");
            throw null;
        }
        recyclerView4.post(new com.tencent.mm.plugin.finder.live.widget.cx(this));
        androidx.recyclerview.widget.RecyclerView recyclerView5 = this.M;
        if (recyclerView5 == null) {
            kotlin.jvm.internal.o.o("cardRv");
            throw null;
        }
        recyclerView5.i(new com.tencent.mm.plugin.finder.live.widget.dx(this));
        android.view.View findViewById6 = rootView.findViewById(com.tencent.mm.R.id.rnv);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        androidx.recyclerview.widget.RecyclerView recyclerView6 = (androidx.recyclerview.widget.RecyclerView) findViewById6;
        this.N = recyclerView6;
        recyclerView6.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context, 0, false));
        androidx.recyclerview.widget.RecyclerView recyclerView7 = this.N;
        if (recyclerView7 == null) {
            kotlin.jvm.internal.o.o("timeRv");
            throw null;
        }
        recyclerView7.setAdapter(f0());
        android.view.View view = this.f119692J;
        if (view == null) {
            kotlin.jvm.internal.o.o("closeView");
            throw null;
        }
        view.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.ex(this));
        d0();
        if (this.U == null) {
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, 1, false);
            this.U = k0Var;
            k0Var.f211872n = new com.tencent.mm.plugin.finder.live.widget.fx(this);
            k0Var.V1 = true;
            k0Var.f211881s = new com.tencent.mm.plugin.finder.live.widget.gx(this);
            k0Var.f211856e = new com.tencent.mm.plugin.finder.live.widget.hx(this);
        }
        android.view.View view2 = this.K;
        if (view2 != null) {
            view2.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.ix(this));
        } else {
            kotlin.jvm.internal.o.o("more");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void S() {
        super.S();
        kotlinx.coroutines.r2 r2Var = this.T;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.X = false;
        this.Y = false;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void V(com.tencent.mm.plugin.finder.live.widget.e0 e0Var, boolean z17, int i17) {
        jz5.f0 f0Var;
        super.V(e0Var, z17, i17);
        java.util.LinkedList linkedList = this.S;
        if (linkedList != null) {
            g0(linkedList, true);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            android.view.View view = this.P;
            if (view == null) {
                kotlin.jvm.internal.o.o("loading");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveTaskPanel", "openPanel", "(Lcom/tencent/mm/plugin/finder/live/widget/BaseBottomPanelSheetPage;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveTaskPanel", "openPanel", "(Lcom/tencent/mm/plugin/finder/live/widget/BaseBottomPanelSheetPage;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            androidx.recyclerview.widget.RecyclerView recyclerView = this.M;
            if (recyclerView == null) {
                kotlin.jvm.internal.o.o("cardRv");
                throw null;
            }
            recyclerView.setVisibility(4);
        }
        h0(new com.tencent.mm.plugin.finder.live.widget.lx(this));
    }

    public final vm2.y f0() {
        return (vm2.y) ((jz5.n) this.Q).getValue();
    }

    public final void g0(java.util.LinkedList data, boolean z17) {
        android.view.View view = this.P;
        if (view == null) {
            kotlin.jvm.internal.o.o("loading");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveTaskPanel", "refreshUI", "(Ljava/util/LinkedList;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveTaskPanel", "refreshUI", "(Ljava/util/LinkedList;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        androidx.recyclerview.widget.RecyclerView recyclerView = this.M;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("cardRv");
            throw null;
        }
        recyclerView.setVisibility(0);
        vm2.y f07 = f0();
        f07.getClass();
        kotlin.jvm.internal.o.g(data, "data");
        java.util.LinkedList linkedList = f07.f438133f;
        linkedList.clear();
        linkedList.addAll(data);
        f07.notifyDataSetChanged();
        vm2.v vVar = (vm2.v) ((jz5.n) this.R).getValue();
        vVar.getClass();
        java.util.LinkedList linkedList2 = vVar.f438123g;
        linkedList2.clear();
        linkedList2.addAll(data);
        vVar.f438122f = z17;
        vVar.notifyDataSetChanged();
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.N;
        if (recyclerView2 != null) {
            recyclerView2.post(new com.tencent.mm.plugin.finder.live.widget.mx(this, data));
        } else {
            kotlin.jvm.internal.o.o("timeRv");
            throw null;
        }
    }

    public final void h0(yz5.l lVar) {
        kotlinx.coroutines.r2 r2Var = this.T;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.T = kotlinx.coroutines.l.d(this.H.getLiveRoomData().f272475i, null, null, new com.tencent.mm.plugin.finder.live.widget.nx(this, lVar, null), 3, null);
    }
}
