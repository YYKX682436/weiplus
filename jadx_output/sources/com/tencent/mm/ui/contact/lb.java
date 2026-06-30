package com.tencent.mm.ui.contact;

/* loaded from: classes.dex */
public class lb implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.SnsLabelContactListUI f207018d;

    public lb(com.tencent.mm.ui.contact.SnsLabelContactListUI snsLabelContactListUI) {
        this.f207018d = snsLabelContactListUI;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/SnsLabelContactListUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.ui.contact.SnsLabelContactListUI snsLabelContactListUI = this.f207018d;
        com.tencent.mm.contact.s sVar = (com.tencent.mm.contact.s) snsLabelContactListUI.f206562e.getItem(i17);
        p94.n0 b17 = p94.w0.b();
        if (b17 == null) {
            snsLabelContactListUI.finish();
            yj0.a.h(this, "com/tencent/mm/ui/contact/SnsLabelContactListUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        ((com.tencent.mm.plugin.sns.model.d6) b17).h(intent, sVar.d1());
        intent.putExtra("Contact_User", sVar.d1());
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.l(intent, snsLabelContactListUI);
        yj0.a.h(this, "com/tencent/mm/ui/contact/SnsLabelContactListUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
