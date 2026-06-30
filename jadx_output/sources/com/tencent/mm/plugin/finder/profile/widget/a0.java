package com.tencent.mm.plugin.finder.profile.widget;

/* loaded from: classes2.dex */
public final class a0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.d0 f124469d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f124470e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f124471f;

    public a0(com.tencent.mm.plugin.finder.profile.widget.d0 d0Var, kotlin.jvm.internal.h0 h0Var, java.lang.String str) {
        this.f124469d = d0Var;
        this.f124470e = h0Var;
        this.f124471f = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/widget/HeaderEnterpriseAddWidget$handleEnterprise$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.profile.widget.d0 d0Var = this.f124469d;
        if (!d0Var.f124510g) {
            d0Var.f124510g = true;
            com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
            ab0.b0 b0Var = (ab0.b0) i95.n0.c(ab0.b0.class);
            kotlin.jvm.internal.h0 h0Var = this.f124470e;
            java.lang.String str = (java.lang.String) h0Var.f310123d;
            r45.g05 g05Var = new r45.g05();
            java.lang.String str2 = this.f124471f;
            g05Var.f374785e = str2;
            g05Var.f374784d = 1;
            ((za0.k) b0Var).getClass();
            d17.g(new l41.e0(str, true, g05Var));
            d0Var.f124506c = com.tencent.mm.ui.widget.dialog.u3.f(d0Var.b().getContext(), d0Var.b().getContext().getString(com.tencent.mm.R.string.ggd), true, 3, null);
            com.tencent.mm.plugin.finder.profile.widget.d0.a(d0Var, 1, str2, (java.lang.String) h0Var.f310123d);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/widget/HeaderEnterpriseAddWidget$handleEnterprise$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
