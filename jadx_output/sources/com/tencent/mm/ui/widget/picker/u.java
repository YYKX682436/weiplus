package com.tencent.mm.ui.widget.picker;

/* loaded from: classes3.dex */
public class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.picker.c0 f212335d;

    public u(com.tencent.mm.ui.widget.picker.c0 c0Var) {
        this.f212335d = c0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/picker/MMOptionPicker$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.widget.picker.c0 c0Var = this.f212335d;
        com.tencent.mm.ui.widget.picker.a0 a0Var = c0Var.f212259t;
        if (a0Var != null) {
            a0Var.onResult(false, null, null);
        }
        com.tencent.mm.ui.widget.picker.z zVar = c0Var.f212260u;
        if (zVar != null) {
            zVar.a(false, null, null, null);
        }
        yj0.a.h(this, "com/tencent/mm/ui/widget/picker/MMOptionPicker$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
