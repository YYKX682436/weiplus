package com.tencent.mm.ui.widget.dialog;

/* loaded from: classes8.dex */
public class u0 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f211995d;

    public u0(com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        this.f211995d = k0Var;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/dialog/MMBottomSheet$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f211995d;
        if (i17 < k0Var.L.size()) {
            db5.h4 h4Var = (db5.h4) ((java.util.ArrayList) k0Var.L.f228344d).get(i17);
            if (h4Var == null || h4Var.f228375s) {
                yj0.a.h(this, "com/tencent/mm/ui/widget/dialog/MMBottomSheet$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            }
            db5.t4 t4Var = k0Var.f211881s;
            if (t4Var != null) {
                t4Var.onMMMenuItemSelected(h4Var, i17);
            } else {
                h4Var.c();
            }
        } else if (k0Var.M.size() > 0 && i17 < k0Var.L.size() + k0Var.M.size()) {
            db5.h4 h4Var2 = (db5.h4) k0Var.M.getItem(i17 - k0Var.L.size());
            if (h4Var2 == null || h4Var2.f228375s) {
                yj0.a.h(this, "com/tencent/mm/ui/widget/dialog/MMBottomSheet$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            }
            db5.t4 t4Var2 = k0Var.f211882t;
            if (t4Var2 != null) {
                t4Var2.onMMMenuItemSelected(h4Var2, i17);
            } else {
                h4Var2.c();
            }
        } else {
            if (!k0Var.f211865i2) {
                yj0.a.h(this, "com/tencent/mm/ui/widget/dialog/MMBottomSheet$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            }
            k0Var.A.a();
            com.tencent.mm.ui.widget.dialog.g1 g1Var = k0Var.B;
            if (g1Var != null) {
                g1Var.a();
            }
        }
        if (!k0Var.U1) {
            k0Var.u();
        }
        k0Var.W1 = true;
        k0Var.f211862h = true;
        k0Var.f211851a2 = i17;
        k0Var.f211868l1.notifyDataSetChanged();
        yj0.a.h(this, "com/tencent/mm/ui/widget/dialog/MMBottomSheet$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
