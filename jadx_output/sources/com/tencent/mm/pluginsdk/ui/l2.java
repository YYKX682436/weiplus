package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes5.dex */
public final class l2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.n2 f190887d;

    public l2(com.tencent.mm.pluginsdk.ui.n2 n2Var) {
        this.f190887d = n2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/QBHalfBottomDialog$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f190887d.f190911g.B();
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/QBHalfBottomDialog$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
