package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class e6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivity f173841d;

    public e6(com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivity textStatusDoWhatActivity) {
        this.f173841d = textStatusDoWhatActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivity$showCustomDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.textstatus.ui.t5 t5Var = com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivity.C;
        this.f173841d.X6();
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivity$showCustomDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
