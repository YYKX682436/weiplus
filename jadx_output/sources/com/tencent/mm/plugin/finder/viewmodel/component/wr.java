package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes.dex */
public final class wr implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.hs f136360d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f136361e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f136362f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f136363g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.zk2 f136364h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.xk2 f136365i;

    public wr(com.tencent.mm.plugin.finder.viewmodel.component.hs hsVar, android.view.View view, android.view.View view2, in5.s0 s0Var, r45.zk2 zk2Var, r45.xk2 xk2Var) {
        this.f136360d = hsVar;
        this.f136361e = view;
        this.f136362f = view2;
        this.f136363g = s0Var;
        this.f136364h = zk2Var;
        this.f136365i = xk2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC$refreshHeaderLayout$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.viewmodel.component.hs hsVar = this.f136360d;
        android.view.View dislikeLayout = this.f136361e;
        kotlin.jvm.internal.o.f(dislikeLayout, "$dislikeLayout");
        com.tencent.mm.plugin.finder.viewmodel.component.hs.D7(hsVar, dislikeLayout, true, null, false, 4, null);
        dislikeLayout.setEnabled(false);
        this.f136362f.setEnabled(false);
        in5.s0 s0Var = this.f136363g;
        java.lang.String string = s0Var.f293121e.getString(com.tencent.mm.R.string.hs_);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        this.f136360d.R6(s0Var, this.f136364h, this.f136365i, string);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC$refreshHeaderLayout$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
