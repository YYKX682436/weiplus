package com.tencent.mm.ui.contact;

/* loaded from: classes.dex */
public class gc implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.SnsTagContactListUI f206735d;

    public gc(com.tencent.mm.ui.contact.SnsTagContactListUI snsTagContactListUI) {
        this.f206735d = snsTagContactListUI;
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
        yj0.a.b("com/tencent/mm/ui/contact/SnsTagContactListUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.ui.contact.SnsTagContactListUI snsTagContactListUI = this.f206735d;
        com.tencent.mm.contact.s sVar = (com.tencent.mm.contact.s) snsTagContactListUI.f206571e.getItem(i17);
        p94.n0 b17 = p94.w0.b();
        if (b17 == null) {
            snsTagContactListUI.finish();
            yj0.a.h(this, "com/tencent/mm/ui/contact/SnsTagContactListUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        ((com.tencent.mm.plugin.sns.model.d6) b17).h(intent, sVar.d1());
        intent.putExtra("sns_adapter_type", 1);
        j45.l.j(snsTagContactListUI.getContext(), "sns", ".ui.SnsTimeLineUserPagerUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/ui/contact/SnsTagContactListUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
