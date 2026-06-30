package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes5.dex */
public final class f4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.q4 f134328d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f134329e;

    public f4(com.tencent.mm.plugin.finder.viewmodel.component.q4 q4Var, android.view.View view) {
        this.f134328d = q4Var;
        this.f134329e = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.view.View view2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderBaseCreateAccountHalfScreenUIC$initView$2$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.viewmodel.component.q4 q4Var = this.f134328d;
        com.tencent.mm.ui.widget.dialog.y1 y1Var = q4Var.f135658d;
        android.widget.CheckBox checkBox = (y1Var == null || (view2 = y1Var.f212027f) == null) ? null : (android.widget.CheckBox) view2.findViewById(com.tencent.mm.R.id.g4b);
        if (checkBox != null) {
            checkBox.setChecked(!checkBox.isChecked());
        }
        this.f134329e.setContentDescription(checkBox != null && checkBox.isChecked() ? q4Var.getContext().getString(com.tencent.mm.R.string.d_) : q4Var.getContext().getString(com.tencent.mm.R.string.f489843db));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderBaseCreateAccountHalfScreenUIC$initView$2$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
