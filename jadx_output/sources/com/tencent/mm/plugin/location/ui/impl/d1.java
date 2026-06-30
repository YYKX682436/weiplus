package com.tencent.mm.plugin.location.ui.impl;

/* loaded from: classes15.dex */
public class d1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.location.ui.impl.x1 f144792d;

    public d1(com.tencent.mm.plugin.location.ui.impl.x1 x1Var) {
        this.f144792d = x1Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI$20", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.location.ui.impl.x1 x1Var = this.f144792d;
        x1Var.r(14, x1Var.f144932t.f144760f, true);
        x1Var.t();
        yj0.a.h(this, "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI$20", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
