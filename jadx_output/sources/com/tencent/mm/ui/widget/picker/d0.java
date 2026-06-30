package com.tencent.mm.ui.widget.picker;

/* loaded from: classes11.dex */
public class d0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.picker.h0 f212267d;

    public d0(com.tencent.mm.ui.widget.picker.h0 h0Var) {
        this.f212267d = h0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String format;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/picker/MMTimePicker$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.widget.picker.h0 h0Var = this.f212267d;
        com.tencent.mm.ui.widget.picker.CustomTimePickerNew customTimePickerNew = h0Var.f212279m;
        if (customTimePickerNew == null) {
            format = null;
        } else {
            customTimePickerNew.f212223e.f();
            format = java.lang.String.format(java.util.Locale.US, "%02d:%02d", java.lang.Integer.valueOf(customTimePickerNew.f212231p), java.lang.Integer.valueOf(customTimePickerNew.f212232q));
        }
        com.tencent.mm.ui.widget.picker.h0.a(h0Var, true, format);
        yj0.a.h(this, "com/tencent/mm/ui/widget/picker/MMTimePicker$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
