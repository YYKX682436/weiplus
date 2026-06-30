package com.tencent.mm.ui.widget.dialog;

/* loaded from: classes8.dex */
public class m0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f211923d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f211924e;

    public m0(com.tencent.mm.ui.widget.dialog.k0 k0Var, int i17) {
        this.f211924e = k0Var;
        this.f211923d = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/dialog/MMBottomSheet$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f211924e;
        if (k0Var.f211889y != null) {
            int size = k0Var.R.size();
            int i17 = this.f211923d;
            if (i17 < size) {
                k0Var.f211889y.onMMMenuItemSelected(k0Var.R.getItem(i17), i17);
            }
        }
        if (!k0Var.U1) {
            k0Var.u();
        }
        yj0.a.h(this, "com/tencent/mm/ui/widget/dialog/MMBottomSheet$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
