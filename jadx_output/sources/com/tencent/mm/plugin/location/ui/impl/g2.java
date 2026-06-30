package com.tencent.mm.plugin.location.ui.impl;

/* loaded from: classes8.dex */
public class g2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.location.ui.impl.y1 f144821d;

    public g2(com.tencent.mm.plugin.location.ui.impl.y1 y1Var) {
        this.f144821d = y1Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/location/ui/impl/TrackMapUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.location.ui.impl.y1 y1Var = this.f144821d;
        y1Var.j();
        y1Var.p();
        y1Var.f144728d.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/location/ui/impl/TrackMapUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
