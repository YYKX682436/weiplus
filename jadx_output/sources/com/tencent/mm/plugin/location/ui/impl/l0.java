package com.tencent.mm.plugin.location.ui.impl;

/* loaded from: classes15.dex */
public class l0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.location.ui.impl.p0 f144844d;

    public l0(com.tencent.mm.plugin.location.ui.impl.p0 p0Var) {
        this.f144844d = p0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/location/ui/impl/RealTimeLocationUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.location.ui.impl.p0 p0Var = this.f144844d;
        p0Var.T.setSelected(true);
        za3.i1 i1Var = p0Var.X;
        i1Var.f470956n = true;
        i1Var.a(p0Var.f144733i.f144804f);
        p0Var.X.d(false);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(10997, "6", "", 0, 0);
        yj0.a.h(this, "com/tencent/mm/plugin/location/ui/impl/RealTimeLocationUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
