package com.tencent.mm.plugin.location.ui.impl;

/* loaded from: classes15.dex */
public class o0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.location.ui.impl.p0 f144859d;

    public o0(com.tencent.mm.plugin.location.ui.impl.p0 p0Var) {
        this.f144859d = p0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/location/ui/impl/RealTimeLocationUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(10997, "11", 0, 0, 0);
        com.tencent.mm.plugin.location.ui.impl.p0 p0Var = this.f144859d;
        p0Var.Z.a();
        va3.v0 v0Var = p0Var.Y;
        va3.x0.a(v0Var.a(5, 0, v0Var.f434364v, v0Var.f434354i, v0Var.f434355m, v0Var.G, v0Var.H, false, false));
        yj0.a.h(this, "com/tencent/mm/plugin/location/ui/impl/RealTimeLocationUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
