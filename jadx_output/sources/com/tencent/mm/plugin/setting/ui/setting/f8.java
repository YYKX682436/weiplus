package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public final class f8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.k8 f161026d;

    public f8(com.tencent.mm.plugin.setting.ui.setting.k8 k8Var) {
        this.f161026d = k8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsBindEmailUIC$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.setting.ui.setting.k8 k8Var = this.f161026d;
        com.tencent.mm.ui.widget.dialog.i0 i0Var = new com.tencent.mm.ui.widget.dialog.i0(k8Var.getActivity());
        java.lang.String string = k8Var.getActivity().getString(com.tencent.mm.R.string.ohv);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        com.tencent.mm.ui.widget.dialog.a aVar = i0Var.f211821b;
        aVar.f211729s = string;
        i0Var.f(com.tencent.mm.R.string.j0b);
        aVar.E = new com.tencent.mm.plugin.setting.ui.setting.h8(k8Var);
        i0Var.e(com.tencent.mm.R.string.n_z);
        aVar.A = true;
        i0Var.b(true).show();
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsBindEmailUIC$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
