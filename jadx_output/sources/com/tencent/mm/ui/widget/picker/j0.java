package com.tencent.mm.ui.widget.picker;

/* loaded from: classes9.dex */
public class j0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.picker.p0 f212284d;

    public j0(com.tencent.mm.ui.widget.picker.p0 p0Var) {
        this.f212284d = p0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/picker/MultiPicker$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.widget.picker.p0 p0Var = this.f212284d;
        java.util.ArrayList a17 = p0Var.f212322n.a();
        com.tencent.mm.ui.widget.picker.o0 o0Var = p0Var.f212323o;
        if (o0Var != null) {
            o0Var.a(true, a17);
        }
        y9.i iVar = p0Var.f212309a;
        if (iVar != null) {
            iVar.dismiss();
        }
        yj0.a.h(this, "com/tencent/mm/ui/widget/picker/MultiPicker$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
