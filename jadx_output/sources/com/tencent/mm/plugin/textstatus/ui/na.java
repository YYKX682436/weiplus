package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes5.dex */
public final class na implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity f174125d;

    public na(com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity textStatusEditActivity) {
        this.f174125d = textStatusEditActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$onCreate$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity textStatusEditActivity = this.f174125d;
        if (textStatusEditActivity.F1) {
            textStatusEditActivity.i7().clearFocus();
            textStatusEditActivity.hideVKB();
        } else {
            textStatusEditActivity.i7().requestFocus();
            textStatusEditActivity.showVKB();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$onCreate$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
