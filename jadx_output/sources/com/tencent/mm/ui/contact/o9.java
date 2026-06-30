package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class o9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.SelectContactUI f207066d;

    public o9(com.tencent.mm.ui.contact.SelectContactUI selectContactUI) {
        this.f207066d = selectContactUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/SelectContactUI$18", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.contact.SelectContactUI selectContactUI = this.f207066d;
        if (selectContactUI.G1 || selectContactUI.K1) {
            db5.e1.y(selectContactUI, selectContactUI.getString(com.tencent.mm.R.string.htx), "", selectContactUI.getString(com.tencent.mm.R.string.l_e), new com.tencent.mm.ui.contact.m9(this));
            a14.a.a().f591j++;
        } else if (selectContactUI.H1 || selectContactUI.L1) {
            db5.e1.y(selectContactUI, selectContactUI.getString(com.tencent.mm.R.string.htw), "", selectContactUI.getString(com.tencent.mm.R.string.l_e), new com.tencent.mm.ui.contact.n9(this));
            a14.a.a().f592k++;
            a14.a.a().f590i++;
        } else {
            com.tencent.mm.ui.contact.SelectContactUI.w7(selectContactUI);
        }
        yj0.a.h(this, "com/tencent/mm/ui/contact/SelectContactUI$18", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
