package com.tencent.mm.ui.contact;

/* loaded from: classes12.dex */
public class p1 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.ContactRemarkImagePreviewUI f207074d;

    public p1(com.tencent.mm.ui.contact.ContactRemarkImagePreviewUI contactRemarkImagePreviewUI) {
        this.f207074d = contactRemarkImagePreviewUI;
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
        yj0.a.b("com/tencent/mm/ui/contact/ContactRemarkImagePreviewUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.ui.contact.ContactRemarkImagePreviewUI contactRemarkImagePreviewUI = this.f207074d;
        if (contactRemarkImagePreviewUI.isTitleShowing()) {
            contactRemarkImagePreviewUI.hideTitleView();
        } else {
            contactRemarkImagePreviewUI.showTitleView();
        }
        yj0.a.h(this, "com/tencent/mm/ui/contact/ContactRemarkImagePreviewUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
