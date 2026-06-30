package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class h5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ImageGalleryUI f200983d;

    public h5(com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI) {
        this.f200983d = imageGalleryUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$22", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.Y6(this.f200983d);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$22", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
