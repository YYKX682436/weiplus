package com.tencent.mm.ui.widget.picker;

/* loaded from: classes9.dex */
public class l0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f212288d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ db5.h4 f212289e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.picker.n0 f212290f;

    public l0(com.tencent.mm.ui.widget.picker.n0 n0Var, int i17, db5.h4 h4Var) {
        this.f212290f = n0Var;
        this.f212288d = i17;
        this.f212289e = h4Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/picker/MultiPicker$ListViewAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.widget.picker.n0 n0Var = this.f212290f;
        com.tencent.mm.ui.widget.picker.p0 p0Var = n0Var.f212299g;
        db5.t4 t4Var = p0Var.f212319k;
        int i17 = this.f212288d;
        if (t4Var != null) {
            t4Var.onMMMenuItemSelected(p0Var.f212320l.getItem(i17), i17);
        }
        if (this.f212289e.f228375s) {
            yj0.a.h(this, "com/tencent/mm/ui/widget/picker/MultiPicker$ListViewAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (((java.lang.Boolean) n0Var.f212297e.get(java.lang.Integer.valueOf(i17))).booleanValue()) {
            n0Var.f212297e.put(java.lang.Integer.valueOf(i17), java.lang.Boolean.FALSE);
        } else {
            n0Var.f212297e.put(java.lang.Integer.valueOf(i17), java.lang.Boolean.TRUE);
        }
        n0Var.f212297e = n0Var.f212297e;
        n0Var.notifyDataSetChanged();
        yj0.a.h(this, "com/tencent/mm/ui/widget/picker/MultiPicker$ListViewAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
