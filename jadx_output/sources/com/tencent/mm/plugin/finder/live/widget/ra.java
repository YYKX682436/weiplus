package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class ra extends com.tencent.mm.plugin.finder.live.widget.e0 {
    public mm2.n0 H;

    /* renamed from: J, reason: collision with root package name */
    public android.widget.TextView f119612J;
    public android.widget.TextView K;
    public com.tencent.mm.plugin.finder.live.widget.sb L;
    public kotlinx.coroutines.r2 M;

    /* renamed from: b2, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.MaxHeightWxRecyclerView f119613b2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ra(android.content.Context context) {
        super(context, false, null, -1.0f, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int A() {
        return com.tencent.mm.R.layout.e9o;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public java.lang.String L() {
        java.lang.String string = this.f118183e.getString(com.tencent.mm.R.string.onu);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void N(android.view.View rootView) {
        kotlinx.coroutines.y0 y0Var;
        kotlin.jvm.internal.o.g(rootView, "rootView");
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveCoLiveInviteePreparePanel", "initContentView");
        android.content.Context context = this.f118183e;
        a0(context.getDrawable(com.tencent.mm.R.drawable.clh));
        Y(com.tencent.mm.R.color.ah8);
        d0();
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.stu);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f119613b2 = (com.tencent.mm.view.recyclerview.MaxHeightWxRecyclerView) findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.tencent.mm.R.id.stw);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f119612J = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = rootView.findViewById(com.tencent.mm.R.id.stv);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.K = (android.widget.TextView) findViewById3;
        android.widget.TextView textView = this.f119612J;
        if (textView == null) {
            kotlin.jvm.internal.o.o("quitBtn");
            throw null;
        }
        textView.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.la(this));
        android.widget.TextView textView2 = this.K;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("learnMoreBtn");
            throw null;
        }
        textView2.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.ma(this));
        com.tencent.mm.plugin.finder.live.widget.sb sbVar = new com.tencent.mm.plugin.finder.live.widget.sb(context);
        this.L = sbVar;
        sbVar.f119748f = null;
        com.tencent.mm.view.recyclerview.MaxHeightWxRecyclerView maxHeightWxRecyclerView = this.f119613b2;
        if (maxHeightWxRecyclerView == null) {
            kotlin.jvm.internal.o.o("hostListRv");
            throw null;
        }
        maxHeightWxRecyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context));
        com.tencent.mm.view.recyclerview.MaxHeightWxRecyclerView maxHeightWxRecyclerView2 = this.f119613b2;
        if (maxHeightWxRecyclerView2 == null) {
            kotlin.jvm.internal.o.o("hostListRv");
            throw null;
        }
        com.tencent.mm.plugin.finder.live.widget.sb sbVar2 = this.L;
        if (sbVar2 == null) {
            kotlin.jvm.internal.o.o("hostAdapter");
            throw null;
        }
        maxHeightWxRecyclerView2.setAdapter(sbVar2);
        com.tencent.mm.view.recyclerview.MaxHeightWxRecyclerView maxHeightWxRecyclerView3 = this.f119613b2;
        if (maxHeightWxRecyclerView3 == null) {
            kotlin.jvm.internal.o.o("hostListRv");
            throw null;
        }
        maxHeightWxRecyclerView3.setOverScrollMode(2);
        com.tencent.mm.view.recyclerview.MaxHeightWxRecyclerView maxHeightWxRecyclerView4 = this.f119613b2;
        if (maxHeightWxRecyclerView4 == null) {
            kotlin.jvm.internal.o.o("hostListRv");
            throw null;
        }
        maxHeightWxRecyclerView4.post(new com.tencent.mm.plugin.finder.live.widget.u80(this));
        e0();
        mm2.n0 n0Var = this.H;
        if (n0Var == null || (y0Var = this.E) == null) {
            return;
        }
        kotlinx.coroutines.r2 r2Var = this.M;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        c0Var.f310112d = n0Var.O6();
        this.M = kotlinx.coroutines.l.d(y0Var, null, null, new com.tencent.mm.plugin.finder.live.widget.oa(n0Var, this, c0Var, null), 3, null);
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public boolean Q() {
        return true;
    }

    public final void e0() {
        java.util.LinkedList linkedList;
        kotlinx.coroutines.flow.f3 f3Var;
        mm2.n0 n0Var = this.H;
        r45.f50 f50Var = (n0Var == null || (f3Var = n0Var.f329265g) == null) ? null : (r45.f50) ((kotlinx.coroutines.flow.l2) f3Var).getValue();
        java.lang.String e17 = xy2.c.e(this.f118183e);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("refreshFromSlice: invitationId=");
        sb6.append(f50Var != null ? java.lang.Long.valueOf(f50Var.f374013d) : null);
        sb6.append(", inviteeCount=");
        sb6.append((f50Var == null || (linkedList = f50Var.f374016g) == null) ? null : java.lang.Integer.valueOf(linkedList.size()));
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveCoLiveInviteePreparePanel", sb6.toString());
        java.util.List<com.tencent.mm.plugin.finder.live.widget.v1> a17 = com.tencent.mm.plugin.finder.live.widget.v1.f120019f.a(f50Var, e17);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(a17, 10));
        for (com.tencent.mm.plugin.finder.live.widget.v1 v1Var : a17) {
            java.lang.String finderUsername = v1Var.f120020a;
            java.lang.String str = v1Var.f120022c;
            int i17 = v1Var.f120023d;
            kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
            java.lang.String nickname = v1Var.f120021b;
            kotlin.jvm.internal.o.g(nickname, "nickname");
            arrayList.add(new com.tencent.mm.plugin.finder.live.widget.v1(finderUsername, nickname, str, i17, false));
        }
        com.tencent.mm.plugin.finder.live.widget.sb sbVar = this.L;
        if (sbVar == null) {
            kotlin.jvm.internal.o.o("hostAdapter");
            throw null;
        }
        java.util.ArrayList arrayList2 = (java.util.ArrayList) sbVar.f119747e;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        sbVar.notifyDataSetChanged();
    }
}
