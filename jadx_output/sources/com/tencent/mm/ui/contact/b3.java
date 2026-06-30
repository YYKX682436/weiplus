package com.tencent.mm.ui.contact;

/* loaded from: classes12.dex */
public final class b3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.ContactSayHiImagePreviewUI f206618d;

    public b3(com.tencent.mm.ui.contact.ContactSayHiImagePreviewUI contactSayHiImagePreviewUI) {
        this.f206618d = contactSayHiImagePreviewUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/ContactSayHiImagePreviewUI$btnDelete$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.contact.ContactSayHiImagePreviewUI contactSayHiImagePreviewUI = this.f206618d;
        com.tencent.mm.ui.tools.MMGestureGallery mMGestureGallery = contactSayHiImagePreviewUI.f206411d;
        if (mMGestureGallery == null || contactSayHiImagePreviewUI.f206418n == null) {
            i17 = -1;
        } else {
            contactSayHiImagePreviewUI.f206417m = true;
            int selectedItemPosition = mMGestureGallery.getSelectedItemPosition();
            if (selectedItemPosition >= 0) {
                com.tencent.mm.ui.tools.MMGestureGallery mMGestureGallery2 = contactSayHiImagePreviewUI.f206411d;
                kotlin.jvm.internal.o.d(mMGestureGallery2);
                if (selectedItemPosition < mMGestureGallery2.getCount()) {
                    com.tencent.mm.ui.contact.z2 z2Var = contactSayHiImagePreviewUI.f206418n;
                    kotlin.jvm.internal.o.d(z2Var);
                    java.util.ArrayList arrayList2 = z2Var.f207268d;
                    if (arrayList2 != null) {
                        arrayList2.remove(selectedItemPosition);
                    }
                    com.tencent.mm.ui.contact.z2 z2Var2 = contactSayHiImagePreviewUI.f206418n;
                    kotlin.jvm.internal.o.d(z2Var2);
                    z2Var2.notifyDataSetChanged();
                }
            }
            com.tencent.mm.ui.contact.z2 z2Var3 = contactSayHiImagePreviewUI.f206418n;
            kotlin.jvm.internal.o.d(z2Var3);
            i17 = z2Var3.getCount();
        }
        if (i17 == 0) {
            contactSayHiImagePreviewUI.U6();
        }
        yj0.a.h(this, "com/tencent/mm/ui/contact/ContactSayHiImagePreviewUI$btnDelete$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
