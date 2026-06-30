package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes5.dex */
public final class o2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.q2 f190913d;

    public o2(com.tencent.mm.pluginsdk.ui.q2 q2Var) {
        this.f190913d = q2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/QBMoreFileHalfBottomDialog$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f190913d.f191090h.B();
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/QBMoreFileHalfBottomDialog$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
