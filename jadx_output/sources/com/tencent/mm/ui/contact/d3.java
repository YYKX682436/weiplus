package com.tencent.mm.ui.contact;

/* loaded from: classes12.dex */
public final class d3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.ContactSayHiImagePreviewUI f206659d;

    public d3(com.tencent.mm.ui.contact.ContactSayHiImagePreviewUI contactSayHiImagePreviewUI) {
        this.f206659d = contactSayHiImagePreviewUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/ContactSayHiImagePreviewUI$btnDownloadAndSave$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
        com.tencent.mm.ui.contact.ContactSayHiImagePreviewUI contactSayHiImagePreviewUI = this.f206659d;
        java.util.ArrayList arrayList2 = contactSayHiImagePreviewUI.f206414g;
        kotlin.jvm.internal.o.d(arrayList2);
        com.tencent.mm.ui.tools.MMGestureGallery mMGestureGallery = contactSayHiImagePreviewUI.f206411d;
        kotlin.jvm.internal.o.d(mMGestureGallery);
        java.lang.String str = (java.lang.String) arrayList2.get(mMGestureGallery.getSelectedItemPosition());
        ((ub0.r) oVar).getClass();
        com.tencent.mm.pluginsdk.ui.tools.l7.a(str, contactSayHiImagePreviewUI, null);
        yj0.a.h(this, "com/tencent/mm/ui/contact/ContactSayHiImagePreviewUI$btnDownloadAndSave$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
