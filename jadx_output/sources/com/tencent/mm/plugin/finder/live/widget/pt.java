package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes10.dex */
public final class pt extends com.tencent.mm.plugin.finder.live.widget.e0 {
    public final dk2.hc H;
    public final yz5.l I;

    /* renamed from: J, reason: collision with root package name */
    public final yz5.p f119428J;
    public final yz5.l K;
    public final yz5.l L;
    public boolean M;
    public boolean N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pt(android.content.Context context, dk2.hc question, yz5.l onFirstResponseOptionSelected, yz5.p onResponseOptionsEntered, yz5.l onDismissedWithoutResponse) {
        super(context, false, null, 0.0f, 14, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(question, "question");
        kotlin.jvm.internal.o.g(onFirstResponseOptionSelected, "onFirstResponseOptionSelected");
        kotlin.jvm.internal.o.g(onResponseOptionsEntered, "onResponseOptionsEntered");
        kotlin.jvm.internal.o.g(onDismissedWithoutResponse, "onDismissedWithoutResponse");
        this.H = question;
        this.I = onFirstResponseOptionSelected;
        this.f119428J = onResponseOptionsEntered;
        this.K = onDismissedWithoutResponse;
        this.L = new com.tencent.mm.plugin.finder.live.widget.ot(this);
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int A() {
        return com.tencent.mm.R.layout.ebk;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public java.lang.String L() {
        return this.H.f233582d;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void N(android.view.View rootView) {
        androidx.recyclerview.widget.f2 ltVar;
        kotlin.jvm.internal.o.g(rootView, "rootView");
        d0();
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.tnv);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) findViewById;
        android.content.Context context = this.f118183e;
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.GridLayoutManager(context, 2));
        dk2.hc hcVar = this.H;
        int ordinal = hcVar.f233581c.ordinal();
        yz5.l lVar = this.L;
        if (ordinal == 0) {
            ltVar = new com.tencent.mm.plugin.finder.live.widget.lt(hcVar.f233583e, lVar);
        } else {
            if (ordinal != 1) {
                throw new jz5.j();
            }
            ltVar = new com.tencent.mm.plugin.finder.live.widget.gt(hcVar.f233583e, lVar);
        }
        recyclerView.setAdapter(ltVar);
        androidx.recyclerview.widget.n2 itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.f12171f = 0L;
        }
        android.view.View findViewById2 = rootView.findViewById(com.tencent.mm.R.id.tnw);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        textView.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.mt(recyclerView, this));
        android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams2 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams;
        int dimension = (int) (context.getResources().getDimension(com.tencent.mm.R.dimen.ail) + (context.getResources().getDimension(com.tencent.mm.R.dimen.ais) * 2));
        int size = hcVar.f233583e.size();
        rootView.post(new com.tencent.mm.plugin.finder.live.widget.nt(rootView, (((size / 2) + (size % 2)) * dimension) + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).height + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin));
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void S() {
        super.S();
        if (this.N) {
            return;
        }
        this.K.invoke(this.H);
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public android.view.View u() {
        android.view.View view = new android.view.View(this.f118183e);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/BaseBottomPanelSheetPage", "genEmptyView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/BaseBottomPanelSheetPage", "genEmptyView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return view;
    }
}
