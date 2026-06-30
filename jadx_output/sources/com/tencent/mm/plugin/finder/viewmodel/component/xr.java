package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes.dex */
public final class xr implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.hs f136489d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f136490e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f136491f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f136492g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.zk2 f136493h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.xk2 f136494i;

    public xr(com.tencent.mm.plugin.finder.viewmodel.component.hs hsVar, android.view.View view, android.view.View view2, in5.s0 s0Var, r45.zk2 zk2Var, r45.xk2 xk2Var) {
        this.f136489d = hsVar;
        this.f136490e = view;
        this.f136491f = view2;
        this.f136492g = s0Var;
        this.f136493h = zk2Var;
        this.f136494i = xk2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC$refreshHeaderLayout$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.viewmodel.component.hs hsVar = this.f136489d;
        android.view.View likeLayout = this.f136490e;
        kotlin.jvm.internal.o.f(likeLayout, "$likeLayout");
        com.tencent.mm.plugin.finder.viewmodel.component.hs.D7(hsVar, likeLayout, true, null, true, 4, null);
        this.f136491f.setEnabled(false);
        likeLayout.setEnabled(false);
        in5.s0 s0Var = this.f136492g;
        java.lang.String string = s0Var.f293121e.getString(com.tencent.mm.R.string.hsa);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        this.f136489d.R6(s0Var, this.f136493h, this.f136494i, string);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC$refreshHeaderLayout$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
