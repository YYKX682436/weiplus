package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class f6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivity f173863d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f173864e;

    public f6(com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivity textStatusDoWhatActivity, java.lang.String str) {
        this.f173863d = textStatusDoWhatActivity;
        this.f173864e = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivity$showCustomDialog$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivity textStatusDoWhatActivity = this.f173863d;
        android.widget.EditText editText = textStatusDoWhatActivity.f173530x;
        java.lang.String obj = r26.n0.u0(java.lang.String.valueOf(editText != null ? editText.getText() : null)).toString();
        textStatusDoWhatActivity.getClass();
        kotlin.jvm.internal.o.g(obj, "<set-?>");
        textStatusDoWhatActivity.f173516g = obj;
        lj4.d dVar = textStatusDoWhatActivity.f173517h;
        java.lang.String str = this.f173864e;
        if (dVar != null) {
            java.lang.String str2 = dVar.f318982e;
            if (str2 != null) {
                str = str2;
            }
            com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivity.U6(textStatusDoWhatActivity, str);
        } else {
            com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivity.U6(textStatusDoWhatActivity, str);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivity$showCustomDialog$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
