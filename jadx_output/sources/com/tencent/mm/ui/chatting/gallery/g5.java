package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes.dex */
public class g5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ImageGalleryUI f200956d;

    public g5(com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI) {
        this.f200956d = imageGalleryUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$21", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = this.f200956d;
        imageGalleryUI.onBackPressed();
        imageGalleryUI.overridePendingTransition(0, 0);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$21", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
