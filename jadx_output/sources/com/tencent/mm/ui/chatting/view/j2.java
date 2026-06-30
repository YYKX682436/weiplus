package com.tencent.mm.ui.chatting.view;

/* loaded from: classes8.dex */
public final class j2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db5.g3 f202976d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.view.m2 f202977e;

    public j2(db5.g3 g3Var, com.tencent.mm.ui.chatting.view.m2 m2Var) {
        this.f202976d = g3Var;
        this.f202977e = m2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/view/MultiSelectCopyWarningDialog$createDialog$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiSelectCopyWarningDialog", "User accepted TOS");
        com.tencent.mm.ui.widget.dialog.a4 a4Var = this.f202976d.f212055d;
        if (a4Var != null) {
            a4Var.dismiss();
        }
        com.tencent.mm.ui.chatting.view.m2 m2Var = this.f202977e;
        com.tencent.mm.sdk.platformtools.o4 o4Var = (com.tencent.mm.sdk.platformtools.o4) ((jz5.n) m2Var.f203007c).getValue();
        if (o4Var != null) {
            o4Var.putBoolean("multiselect_copy_warning_dialog_accepted", true);
        }
        yz5.a aVar = m2Var.f203005a;
        if (aVar != null) {
            aVar.invoke();
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/view/MultiSelectCopyWarningDialog$createDialog$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
