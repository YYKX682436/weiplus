package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class x7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 f174424d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f174425e;

    public x7(com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2, java.lang.String str) {
        this.f174424d = textStatusDoWhatActivityV2;
        this.f174425e = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2$showCustomDialog$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2 = this.f174424d;
        android.widget.EditText editText = textStatusDoWhatActivityV2.f173561y1;
        java.lang.String obj = r26.n0.u0(java.lang.String.valueOf(editText != null ? editText.getText() : null)).toString();
        kotlin.jvm.internal.o.g(obj, "<set-?>");
        textStatusDoWhatActivityV2.f173541i = obj;
        lj4.d dVar = textStatusDoWhatActivityV2.f173543m;
        if (dVar != null) {
            java.lang.String str = dVar.f318982e;
            if (str == null) {
                str = this.f174425e;
            }
            com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2.X6(textStatusDoWhatActivityV2, str, false, false, 6, null);
        } else {
            com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2.X6(textStatusDoWhatActivityV2, this.f174425e, false, false, 6, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2$showCustomDialog$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
