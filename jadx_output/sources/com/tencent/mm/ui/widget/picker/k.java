package com.tencent.mm.ui.widget.picker;

/* loaded from: classes9.dex */
public class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.picker.o f212285d;

    public k(com.tencent.mm.ui.widget.picker.o oVar) {
        this.f212285d = oVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/picker/MMDatePicker$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.widget.picker.o oVar = this.f212285d;
        int year = oVar.f212306m.getYear();
        int month = oVar.f212306m.getMonth();
        int dayOfMonth = oVar.f212306m.getDayOfMonth();
        com.tencent.mm.ui.widget.picker.n nVar = oVar.f212307n;
        if (nVar != null) {
            nVar.onResult(true, year, month, dayOfMonth);
        }
        oVar.b();
        yj0.a.h(this, "com/tencent/mm/ui/widget/picker/MMDatePicker$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
