package com.tencent.mm.ui.widget.picker;

/* loaded from: classes3.dex */
public class v implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.picker.c0 f212336d;

    public v(com.tencent.mm.ui.widget.picker.c0 c0Var) {
        this.f212336d = c0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/picker/MMOptionPicker$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.widget.picker.c0 c0Var = this.f212336d;
        com.tencent.mm.ui.widget.picker.CustomOptionPickNew customOptionPickNew = c0Var.f212256q;
        java.lang.String a17 = customOptionPickNew == null ? null : customOptionPickNew.a();
        com.tencent.mm.ui.widget.picker.CustomOptionPickNew customOptionPickNew2 = c0Var.f212257r;
        java.lang.String a18 = customOptionPickNew2 == null ? null : customOptionPickNew2.a();
        com.tencent.mm.ui.widget.picker.a0 a0Var = c0Var.f212259t;
        if (a0Var != null) {
            a0Var.onResult(true, a17, a18);
        }
        com.tencent.mm.ui.widget.picker.CustomOptionPickNew customOptionPickNew3 = c0Var.f212256q;
        java.lang.String a19 = customOptionPickNew3 == null ? null : customOptionPickNew3.a();
        com.tencent.mm.ui.widget.picker.CustomOptionPickNew customOptionPickNew4 = c0Var.f212257r;
        java.lang.String a27 = customOptionPickNew4 == null ? null : customOptionPickNew4.a();
        com.tencent.mm.ui.widget.picker.CustomOptionPickNew customOptionPickNew5 = c0Var.f212258s;
        java.lang.String a28 = customOptionPickNew5 != null ? customOptionPickNew5.a() : null;
        com.tencent.mm.ui.widget.picker.z zVar = c0Var.f212260u;
        if (zVar != null) {
            zVar.a(true, a19, a27, a28);
        }
        yj0.a.h(this, "com/tencent/mm/ui/widget/picker/MMOptionPicker$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
