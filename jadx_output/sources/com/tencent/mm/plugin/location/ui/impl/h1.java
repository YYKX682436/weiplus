package com.tencent.mm.plugin.location.ui.impl;

/* loaded from: classes15.dex */
public class h1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.location.ui.impl.x1 f144824d;

    public h1(com.tencent.mm.plugin.location.ui.impl.x1 x1Var) {
        this.f144824d = x1Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI$24", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.location.ui.impl.x1 x1Var = this.f144824d;
        x1Var.D1.setText("");
        x1Var.C();
        if (x1Var.Q) {
            x1Var.y(com.tencent.mm.plugin.location.ui.impl.w1.OPENED);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI$24", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
