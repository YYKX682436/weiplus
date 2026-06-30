package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes.dex */
public class v4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ImageGalleryUI f201505d;

    public v4(com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI) {
        this.f201505d = imageGalleryUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = this.f201505d;
        if (!imageGalleryUI.isFinishing() && !imageGalleryUI.isDestroyed() && !imageGalleryUI.V1) {
            ((c35.m) i95.n0.c(c35.m.class)).getClass();
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
