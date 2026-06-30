package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class x9 extends com.tencent.mm.plugin.finder.live.widget.e0 {
    public final gk2.e H;
    public final r45.lc1 I;

    /* renamed from: J, reason: collision with root package name */
    public final r45.s02 f120304J;
    public final java.lang.String K;
    public java.util.LinkedList L;
    public final int M;
    public int N;
    public com.tencent.mm.view.recyclerview.WxRecyclerView P;
    public android.widget.FrameLayout Q;
    public int R;
    public yz5.a S;
    public jz5.l T;
    public final jz5.g U;
    public kotlinx.coroutines.r2 V;
    public final jz5.g W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x9(android.content.Context context, gk2.e eVar, r45.lc1 lc1Var, r45.s02 modInfo) {
        super(context, false, null, -1.0f, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(modInfo, "modInfo");
        this.H = eVar;
        this.I = lc1Var;
        this.f120304J = modInfo;
        this.K = "FinderLiveChooseRolePanel";
        this.L = new java.util.LinkedList();
        this.M = -1;
        int integer = g92.b.f269769e.k2().getInteger(4);
        this.N = integer;
        this.R = integer;
        this.U = jz5.h.b(new com.tencent.mm.plugin.finder.live.widget.w9(context, this));
        this.W = jz5.h.b(new com.tencent.mm.plugin.finder.live.widget.k9(context, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f0(com.tencent.mm.plugin.finder.live.widget.x9 r18, int r19, kotlin.coroutines.Continuation r20) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.x9.f0(com.tencent.mm.plugin.finder.live.widget.x9, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int A() {
        return com.tencent.mm.R.layout.f488875dr0;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public jz5.l B() {
        android.content.Context context = this.f118183e;
        java.lang.String string = context.getString(com.tencent.mm.R.string.mie);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.lang.String string2 = context.getString(com.tencent.mm.R.string.mic);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        return new jz5.l(string, string2);
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void N(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        this.Q = (android.widget.FrameLayout) rootView.findViewById(com.tencent.mm.R.id.tha);
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) rootView.findViewById(com.tencent.mm.R.id.rls);
        this.P = wxRecyclerView;
        if (wxRecyclerView != null) {
            wxRecyclerView.setAdapter((com.tencent.mm.plugin.finder.live.widget.j9) ((jz5.n) this.W).getValue());
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = this.P;
        android.content.Context context = this.f118183e;
        if (wxRecyclerView2 != null) {
            wxRecyclerView2.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context));
        }
        a0(context.getDrawable(com.tencent.mm.R.drawable.clh));
        d0();
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void U() {
        kotlinx.coroutines.r2 r2Var = this.V;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        kotlinx.coroutines.y0 y0Var = this.E;
        this.V = y0Var != null ? kotlinx.coroutines.l.d(y0Var, null, null, new com.tencent.mm.plugin.finder.live.widget.o9(this, null), 3, null) : null;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void V(com.tencent.mm.plugin.finder.live.widget.e0 e0Var, boolean z17, int i17) {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams;
        java.lang.Object obj;
        r45.lc1 lc1Var;
        android.view.View Q6;
        android.widget.FrameLayout frameLayout;
        java.lang.Object obj2;
        super.V(e0Var, z17, i17);
        int integer = g92.b.f269769e.k2().getInteger(4);
        this.N = integer;
        this.R = integer;
        java.util.LinkedList a17 = com.tencent.mm.plugin.finder.live.util.n2.f115640a.a();
        this.L = a17;
        java.util.Iterator it = a17.iterator();
        while (true) {
            marginLayoutParams = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((r45.of1) obj).getInteger(2) == 2) {
                    break;
                }
            }
        }
        if (obj == null) {
            java.util.LinkedList linkedList = this.L;
            r45.of1 of1Var = new r45.of1();
            of1Var.set(2, java.lang.Integer.valueOf(this.M));
            linkedList.add(of1Var);
        }
        ((com.tencent.mm.plugin.finder.live.widget.j9) ((jz5.n) this.W).getValue()).notifyDataSetChanged();
        android.widget.FrameLayout frameLayout2 = this.Q;
        if (frameLayout2 != null) {
            frameLayout2.removeAllViews();
        }
        com.tencent.mm.plugin.finder.live.viewmodel.z2 z2Var = (com.tencent.mm.plugin.finder.live.viewmodel.z2) ((jz5.n) this.U).getValue();
        if (z2Var != null) {
            r45.lc1 lc1Var2 = this.I;
            if (lc1Var2 == null) {
                gk2.e eVar = this.H;
                if (eVar != null) {
                    mm2.c1 c1Var = (mm2.c1) eVar.a(mm2.c1.class);
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("get-joinLiveVisibleInfo = ");
                    r45.lc1 lc1Var3 = c1Var.f328901v6;
                    if (lc1Var3 == null || (obj2 = pm0.b0.g(lc1Var3)) == null) {
                        obj2 = "null";
                    }
                    sb6.append(obj2);
                    com.tencent.mars.xlog.Log.i(c1Var.f328800f, sb6.toString());
                    lc1Var2 = c1Var.f328901v6;
                } else {
                    lc1Var = null;
                    Q6 = z2Var.Q6(lc1Var, this.f120304J, false, true, true);
                    if (Q6 != null && (frameLayout = this.Q) != null) {
                        frameLayout.addView(Q6);
                    }
                }
            }
            lc1Var = lc1Var2;
            Q6 = z2Var.Q6(lc1Var, this.f120304J, false, true, true);
            if (Q6 != null) {
                frameLayout.addView(Q6);
            }
        }
        android.widget.FrameLayout frameLayout3 = this.Q;
        int childCount = frameLayout3 != null ? frameLayout3.getChildCount() : 0;
        android.content.Context context = this.f118183e;
        if (childCount > 0) {
            android.widget.FrameLayout frameLayout4 = this.Q;
            if (frameLayout4 != null) {
                frameLayout4.setVisibility(0);
            }
            android.widget.FrameLayout frameLayout5 = this.Q;
            if (frameLayout5 == null) {
                return;
            }
            android.view.ViewGroup.LayoutParams layoutParams = frameLayout5.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.bottomMargin = (int) context.getResources().getDimension(com.tencent.mm.R.dimen.f479714d7);
                marginLayoutParams = marginLayoutParams2;
            }
            frameLayout5.setLayoutParams(marginLayoutParams);
            return;
        }
        android.widget.FrameLayout frameLayout6 = this.Q;
        if (frameLayout6 != null) {
            frameLayout6.setVisibility(8);
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.P;
        if (wxRecyclerView == null) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams2 = wxRecyclerView.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
        if (marginLayoutParams3 != null) {
            marginLayoutParams3.bottomMargin = (int) context.getResources().getDimension(com.tencent.mm.R.dimen.f479657bu);
            marginLayoutParams = marginLayoutParams3;
        }
        wxRecyclerView.setLayoutParams(marginLayoutParams);
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public android.view.View u() {
        android.widget.TextView textView = new android.widget.TextView(this.f118183e);
        textView.setText(textView.getContext().getString(com.tencent.mm.R.string.f491728m93));
        textView.setTextSize(15.0f);
        textView.setTextColor(textView.getContext().getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_9));
        return textView;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public android.view.View v() {
        android.widget.TextView textView = new android.widget.TextView(this.f118183e);
        textView.setText(textView.getContext().getString(com.tencent.mm.R.string.f491729m94));
        textView.setTextSize(15.0f);
        textView.setTextColor(textView.getContext().getResources().getColor(com.tencent.mm.R.color.f478553an));
        textView.setBackgroundDrawable(textView.getContext().getDrawable(com.tencent.mm.R.drawable.f481060jo));
        textView.setMinWidth((int) textView.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479723df));
        textView.setMinHeight((int) textView.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479714d7));
        textView.setGravity(17);
        return textView;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public boolean w() {
        return true;
    }
}
