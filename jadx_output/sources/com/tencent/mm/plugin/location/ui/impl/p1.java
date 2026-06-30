package com.tencent.mm.plugin.location.ui.impl;

/* loaded from: classes15.dex */
public class p1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.location.ui.impl.x1 f144871d;

    public p1(com.tencent.mm.plugin.location.ui.impl.x1 x1Var) {
        this.f144871d = x1Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.location.ui.impl.x1 x1Var = this.f144871d;
        x1Var.getClass();
        com.tencent.mm.repairer.config.global.RepairerConfigLocationPoiDrawer repairerConfigLocationPoiDrawer = new com.tencent.mm.repairer.config.global.RepairerConfigLocationPoiDrawer();
        boolean z17 = true;
        if (j62.e.g().c(repairerConfigLocationPoiDrawer) != 1 && bm5.o1.f22719a.h(repairerConfigLocationPoiDrawer) != 1) {
            z17 = false;
        }
        if (x1Var.f144920J) {
            com.tencent.mm.plugin.location.ui.impl.c0 c0Var = x1Var.f144932t;
            int i17 = c0Var.f144760f;
            if (i17 >= 0 && i17 < c0Var.getCount()) {
                com.tencent.mm.plugin.location.ui.impl.d0 item = x1Var.f144932t.getItem(i17);
                if (z17) {
                    x1Var.v(item);
                } else {
                    x1Var.A(item, null, false);
                }
            }
        } else {
            com.tencent.mm.plugin.location.ui.impl.c0 c0Var2 = x1Var.f144931s;
            int i18 = c0Var2.f144760f;
            if (i18 >= 0 && i18 < c0Var2.getCount()) {
                com.tencent.mm.plugin.location.ui.impl.d0 item2 = x1Var.f144931s.getItem(i18);
                if (i18 != 0 || z17) {
                    x1Var.v(item2);
                } else {
                    x1Var.A(item2, null, false);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
