package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class et extends com.tencent.mm.plugin.finder.live.widget.e0 {
    public final com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore H;
    public final com.tencent.mm.plugin.finder.live.view.k0 I;

    /* renamed from: J, reason: collision with root package name */
    public final java.lang.String f118280J;
    public java.util.LinkedList K;
    public android.view.View L;
    public com.tencent.mm.view.recyclerview.WxRecyclerView M;
    public final jz5.g N;
    public final int[] P;
    public android.view.View Q;
    public android.view.View R;
    public com.tencent.mm.ui.widget.dialog.k0 S;
    public final int T;
    public final jz5.g U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public et(android.content.Context context, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store, com.tencent.mm.plugin.finder.live.view.k0 pluginLayout) {
        super(context, false, null, 0.75f, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(store, "store");
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.H = store;
        this.I = pluginLayout;
        this.f118280J = "FinderLivePrizePanel";
        this.N = jz5.h.b(new com.tencent.mm.plugin.finder.live.widget.fs(context));
        this.P = new int[2];
        this.T = 1;
        this.U = jz5.h.b(new com.tencent.mm.plugin.finder.live.widget.ws(this, context));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e0(com.tencent.mm.plugin.finder.live.widget.et r18, r45.uc5 r19, kotlin.coroutines.Continuation r20) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.et.e0(com.tencent.mm.plugin.finder.live.widget.et, r45.uc5, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0184 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[LOOP:0: B:32:0x014b->B:61:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0079  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x01d9 -> B:19:0x0054). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f0(com.tencent.mm.plugin.finder.live.widget.et r23, r45.vv1 r24, kotlin.coroutines.Continuation r25) {
        /*
            Method dump skipped, instructions count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.et.f0(com.tencent.mm.plugin.finder.live.widget.et, r45.vv1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final java.lang.String g0(com.tencent.mm.plugin.finder.live.widget.et etVar) {
        boolean m07 = etVar.m0();
        android.content.Context context = etVar.f118183e;
        if (m07) {
            java.lang.String string = context.getString(com.tencent.mm.R.string.nrm);
            kotlin.jvm.internal.o.d(string);
            return string;
        }
        if (!etVar.n0()) {
            return "";
        }
        java.lang.String string2 = context.getString(com.tencent.mm.R.string.nrm);
        kotlin.jvm.internal.o.d(string2);
        return string2;
    }

    public static final rl5.r h0(com.tencent.mm.plugin.finder.live.widget.et etVar) {
        return (rl5.r) ((jz5.n) etVar.N).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i0(com.tencent.mm.plugin.finder.live.widget.et r10, r45.dz1 r11, r45.dz1 r12, kotlin.coroutines.Continuation r13) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.et.i0(com.tencent.mm.plugin.finder.live.widget.et, r45.dz1, r45.dz1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int A() {
        return com.tencent.mm.R.layout.ebc;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int J() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void N(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        android.content.Context context = this.f118183e;
        a0(context.getDrawable(com.tencent.mm.R.drawable.a0l));
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.uub);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.view.View findViewById2 = rootView.findViewById(com.tencent.mm.R.id.uu6);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.L = findViewById2;
        android.view.View findViewById3 = rootView.findViewById(com.tencent.mm.R.id.uu7);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.M = (com.tencent.mm.view.recyclerview.WxRecyclerView) findViewById3;
        android.view.View findViewById4 = rootView.findViewById(com.tencent.mm.R.id.uu8);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.Q = findViewById4;
        android.view.View findViewById5 = rootView.findViewById(com.tencent.mm.R.id.uu9);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.R = findViewById5;
        findViewById5.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.bs(this));
        android.view.View view = this.L;
        if (view == null) {
            kotlin.jvm.internal.o.o("panelTitleAdd");
            throw null;
        }
        view.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.cs(this));
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.M;
        if (wxRecyclerView == null) {
            kotlin.jvm.internal.o.o("panelContentRv");
            throw null;
        }
        wxRecyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context));
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = this.M;
        if (wxRecyclerView2 == null) {
            kotlin.jvm.internal.o.o("panelContentRv");
            throw null;
        }
        wxRecyclerView2.setAdapter((com.tencent.mm.plugin.finder.live.widget.vs) ((jz5.n) this.U).getValue());
        com.tencent.mm.plugin.finder.live.widget.ds dsVar = new com.tencent.mm.plugin.finder.live.widget.ds(this);
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView3 = this.M;
        if (wxRecyclerView3 == null) {
            kotlin.jvm.internal.o.o("panelContentRv");
            throw null;
        }
        wxRecyclerView3.U0(dsVar);
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView4 = this.M;
        if (wxRecyclerView4 != null) {
            wxRecyclerView4.P(dsVar);
        } else {
            kotlin.jvm.internal.o.o("panelContentRv");
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j0(int r18, kotlin.coroutines.Continuation r19) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.et.j0(int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if ((!r1.isEmpty()) == true) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k0() {
        /*
            Method dump skipped, instructions count: 834
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.et.k0():void");
    }

    public final jz5.l l0(int i17) {
        java.util.LinkedList linkedList = this.K;
        if (linkedList == null) {
            return null;
        }
        java.util.Iterator it = linkedList.iterator();
        boolean z17 = false;
        int i18 = 0;
        while (true) {
            if (!it.hasNext()) {
                i18 = -1;
                break;
            }
            r45.dz1 dz1Var = (r45.dz1) ((r45.uc5) it.next()).getCustom(2);
            if (dz1Var != null && dz1Var.getInteger(0) == i17) {
                break;
            }
            i18++;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
        int intValue = valueOf.intValue();
        java.util.LinkedList linkedList2 = this.K;
        e06.k g17 = linkedList2 != null ? kz5.c0.g(linkedList2) : new e06.k(0, 0);
        if (intValue <= g17.f246210e && g17.f246209d <= intValue) {
            z17 = true;
        }
        if (!z17) {
            valueOf = null;
        }
        if (valueOf == null) {
            return null;
        }
        int intValue2 = valueOf.intValue();
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(intValue2);
        java.util.LinkedList linkedList3 = this.K;
        return new jz5.l(valueOf2, linkedList3 != null ? (r45.uc5) kz5.n0.a0(linkedList3, intValue2) : null);
    }

    public final boolean m0() {
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = this.H;
        return ((on2.z2) liveRoomControllerStore.business(on2.z2.class)).V6() || ((on2.z2) liveRoomControllerStore.business(on2.z2.class)).T6();
    }

    public final boolean n0() {
        df2.ar arVar = (df2.ar) this.H.controller(df2.ar.class);
        return arVar != null && arVar.f7();
    }
}
