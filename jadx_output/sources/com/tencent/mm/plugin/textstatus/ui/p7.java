package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class p7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 f174171d;

    public p7(com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2) {
        this.f174171d = textStatusDoWhatActivityV2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2$onCreate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2 = this.f174171d;
        textStatusDoWhatActivityV2.hideVKB();
        com.tencent.mm.plugin.textstatus.ui.h6 h6Var = com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2.C1;
        android.view.View view2 = textStatusDoWhatActivityV2.f173558x1;
        if (((view2 != null && view2.getVisibility() == 0) || textStatusDoWhatActivityV2.b7().isExpand) ? false : true) {
            textStatusDoWhatActivityV2.d7().f473343e = qj4.k.f363922e;
        }
        textStatusDoWhatActivityV2.onBackPressed();
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2$onCreate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
