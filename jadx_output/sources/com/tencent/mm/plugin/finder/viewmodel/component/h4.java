package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes8.dex */
public final class h4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.q4 f134577d;

    public h4(com.tencent.mm.plugin.finder.viewmodel.component.q4 q4Var) {
        this.f134577d = q4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderBaseCreateAccountHalfScreenUIC$initView$2$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.viewmodel.component.q4 q4Var = this.f134577d;
        com.tencent.mm.ui.widget.dialog.y1 y1Var = q4Var.f135658d;
        if (y1Var != null) {
            y1Var.r(true);
        }
        q4Var.R6();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderBaseCreateAccountHalfScreenUIC$initView$2$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
