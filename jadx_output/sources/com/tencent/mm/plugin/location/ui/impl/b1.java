package com.tencent.mm.plugin.location.ui.impl;

/* loaded from: classes15.dex */
public class b1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.location.ui.impl.x1 f144755d;

    public b1(com.tencent.mm.plugin.location.ui.impl.x1 x1Var) {
        this.f144755d = x1Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI$19", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.location.ui.impl.x1 x1Var = this.f144755d;
        if (!x1Var.f144920J) {
            x1Var.f144920J = true;
            x1Var.f144923m.setVisibility(8);
            x1Var.T1 = false;
            if (x1Var.S) {
                x1Var.C();
            }
            x1Var.y(com.tencent.mm.plugin.location.ui.impl.w1.OPENED);
            x1Var.D();
            x1Var.D1.setText("");
            x1Var.E1.setVisibility(8);
            x1Var.f144926p.b();
            x1Var.f144926p.removeFooterView(x1Var.f144929q);
            x1Var.f144932t.c();
            x1Var.f144932t.notifyDataSetChanged();
            x1Var.f144926p.setVisibility(0);
            x1Var.f144925o.setVisibility(8);
            android.view.View view2 = x1Var.f144933u;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI", "enterSearchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI", "enterSearchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            x1Var.B.setVisibility(8);
            x1Var.f144921i.setVisibility(8);
            x1Var.s(false);
            x1Var.P1 = x1Var.f144934v.isSelected();
            x1Var.f144934v.setSelected(false);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI$19", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
