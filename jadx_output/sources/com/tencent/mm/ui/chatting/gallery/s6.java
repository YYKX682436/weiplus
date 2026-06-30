package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class s6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ImageGalleryUI f201359d;

    public s6(com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI) {
        this.f201359d = imageGalleryUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$52", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.f200588p4;
        this.f201359d.o7(5);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$52", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
