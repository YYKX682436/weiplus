package com.tencent.mm.ui.widget.dialog;

/* loaded from: classes8.dex */
public class w0 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f212012d;

    public w0(com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        this.f212012d = k0Var;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        db5.t4 t4Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/dialog/MMBottomSheet$5", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f212012d;
        if (i17 >= k0Var.N.size()) {
            yj0.a.h(this, "com/tencent/mm/ui/widget/dialog/MMBottomSheet$5", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        db5.h4 h4Var = (db5.h4) ((java.util.ArrayList) k0Var.N.f228344d).get(i17);
        if (h4Var != null && h4Var.f228375s) {
            yj0.a.h(this, "com/tencent/mm/ui/widget/dialog/MMBottomSheet$5", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        if (i17 < k0Var.N.size() && (t4Var = k0Var.f211884v) != null) {
            t4Var.onMMMenuItemSelected(k0Var.N.getItem(i17), i17);
        }
        if (!k0Var.U1) {
            k0Var.u();
        }
        k0Var.W1 = true;
        k0Var.f211862h = true;
        k0Var.f211878p1.notifyDataSetChanged();
        yj0.a.h(this, "com/tencent/mm/ui/widget/dialog/MMBottomSheet$5", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
