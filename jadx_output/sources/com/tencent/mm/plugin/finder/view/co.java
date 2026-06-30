package com.tencent.mm.plugin.finder.view;

/* loaded from: classes.dex */
public final class co implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f131788d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f131789e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f131790f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0 f131791g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ androidx.constraintlayout.widget.ConstraintLayout f131792h;

    public co(android.view.View view, long j17, java.lang.String str, kotlin.jvm.internal.g0 g0Var, androidx.constraintlayout.widget.ConstraintLayout constraintLayout) {
        this.f131788d = view;
        this.f131789e = j17;
        this.f131790f = str;
        this.f131791g = g0Var;
        this.f131792h = constraintLayout;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderWxProfileApi$updateWxProfile$1$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View view2 = this.f131788d;
        java.lang.String string = view2.getContext().getString(com.tencent.mm.R.string.f490394tr);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        com.tencent.mm.plugin.finder.view.bo boVar = new com.tencent.mm.plugin.finder.view.bo(this.f131788d, this.f131789e, this.f131790f, this.f131791g);
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(this.f131792h.getContext(), 1, false);
        k0Var.f211872n = new com.tencent.mm.plugin.finder.view.eo(view2, string);
        k0Var.f211881s = new com.tencent.mm.plugin.finder.view.fo(boVar);
        k0Var.v();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderWxProfileApi$updateWxProfile$1$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
