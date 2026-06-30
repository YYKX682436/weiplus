package com.tencent.mm.ui.contact;

/* loaded from: classes12.dex */
public final class f3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.ContactSayHiImagePreviewUI f206702d;

    public f3(com.tencent.mm.ui.contact.ContactSayHiImagePreviewUI contactSayHiImagePreviewUI) {
        this.f206702d = contactSayHiImagePreviewUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/ContactSayHiImagePreviewUI$btnFav$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.ui.contact.ContactSayHiImagePreviewUI.f206410s;
        com.tencent.mm.ui.contact.ContactSayHiImagePreviewUI contactSayHiImagePreviewUI = this.f206702d;
        contactSayHiImagePreviewUI.getClass();
        com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
        java.util.ArrayList arrayList2 = contactSayHiImagePreviewUI.f206414g;
        kotlin.jvm.internal.o.d(arrayList2);
        com.tencent.mm.ui.tools.MMGestureGallery mMGestureGallery = contactSayHiImagePreviewUI.f206411d;
        kotlin.jvm.internal.o.d(mMGestureGallery);
        com.tencent.mm.pluginsdk.model.a2.g(doFavoriteEvent, 6, (java.lang.String) arrayList2.get(mMGestureGallery.getSelectedItemPosition()));
        am.c4 c4Var = doFavoriteEvent.f54090g;
        c4Var.f6323i = contactSayHiImagePreviewUI;
        c4Var.f6327m = 46;
        doFavoriteEvent.e();
        yj0.a.h(this, "com/tencent/mm/ui/contact/ContactSayHiImagePreviewUI$btnFav$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
