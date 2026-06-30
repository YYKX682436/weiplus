package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class yn implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f133411d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f133412e;

    public yn(java.lang.String str, android.view.View view) {
        this.f133411d = str;
        this.f133412e = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderWxProfileApi$updateWxProfile$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
        android.content.Context context = this.f133412e.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        i0Var.Bk(this.f133411d, context);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderWxProfileApi$updateWxProfile$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
