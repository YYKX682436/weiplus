package com.tencent.mm.ui.contact;

/* loaded from: classes.dex */
public class g7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.OnlyChatContactMgrUI f206723d;

    public g7(com.tencent.mm.ui.contact.OnlyChatContactMgrUI onlyChatContactMgrUI) {
        this.f206723d = onlyChatContactMgrUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/OnlyChatContactMgrUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.ui.contact.OnlyChatContactMgrUI.f206501u;
        com.tencent.mm.ui.contact.OnlyChatContactMgrUI onlyChatContactMgrUI = this.f206723d;
        onlyChatContactMgrUI.getClass();
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) onlyChatContactMgrUI, 1, true);
        k0Var.f211872n = new com.tencent.mm.ui.contact.q6(onlyChatContactMgrUI);
        k0Var.r(onlyChatContactMgrUI.getString(com.tencent.mm.R.string.f489885eg), 17, i65.a.b(onlyChatContactMgrUI, 14), null);
        k0Var.f211881s = new com.tencent.mm.ui.contact.r6(onlyChatContactMgrUI);
        k0Var.v();
        yj0.a.h(this, "com/tencent/mm/ui/contact/OnlyChatContactMgrUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
