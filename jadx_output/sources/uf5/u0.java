package uf5;

/* loaded from: classes4.dex */
public class u0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.privacy.ContactMgrUIBase f427304d;

    public u0(com.tencent.mm.ui.contact.privacy.ContactMgrUIBase contactMgrUIBase) {
        this.f427304d = contactMgrUIBase;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/privacy/ContactMgrUIBase$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.ui.contact.privacy.ContactMgrUIBase.E;
        com.tencent.mm.ui.contact.privacy.ContactMgrUIBase contactMgrUIBase = this.f427304d;
        contactMgrUIBase.getClass();
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) contactMgrUIBase, 1, true);
        k0Var.f211872n = new uf5.i0(contactMgrUIBase);
        k0Var.r(contactMgrUIBase.getString(com.tencent.mm.R.string.hlc), 17, i65.a.b(contactMgrUIBase, 14), null);
        k0Var.f211881s = new uf5.j0(contactMgrUIBase);
        k0Var.v();
        yj0.a.h(this, "com/tencent/mm/ui/contact/privacy/ContactMgrUIBase$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
