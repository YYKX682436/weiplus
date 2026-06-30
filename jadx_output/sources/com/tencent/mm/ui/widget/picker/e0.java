package com.tencent.mm.ui.widget.picker;

/* loaded from: classes11.dex */
public class e0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.picker.h0 f212269d;

    public e0(com.tencent.mm.ui.widget.picker.h0 h0Var) {
        this.f212269d = h0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/picker/MMTimePicker$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.widget.picker.h0.a(this.f212269d, false, null);
        yj0.a.h(this, "com/tencent/mm/ui/widget/picker/MMTimePicker$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
