package com.tencent.mm.ui.chatting.view;

/* loaded from: classes.dex */
public final class k2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db5.g3 f202984d;

    public k2(db5.g3 g3Var) {
        this.f202984d = g3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/view/MultiSelectCopyWarningDialog$createDialog$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.widget.dialog.a4 a4Var = this.f202984d.f212055d;
        if (a4Var != null) {
            a4Var.dismiss();
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/view/MultiSelectCopyWarningDialog$createDialog$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
