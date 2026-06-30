package com.tencent.mm.ui.widget.picker;

/* loaded from: classes9.dex */
public class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.picker.o f212283d;

    public j(com.tencent.mm.ui.widget.picker.o oVar) {
        this.f212283d = oVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/picker/MMDatePicker$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.widget.picker.o oVar = this.f212283d;
        com.tencent.mm.ui.widget.picker.n nVar = oVar.f212307n;
        if (nVar != null) {
            nVar.onResult(false, 0, 0, 0);
        }
        oVar.b();
        yj0.a.h(this, "com/tencent/mm/ui/widget/picker/MMDatePicker$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
