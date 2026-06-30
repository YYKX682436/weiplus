package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes.dex */
public class q2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ImageGalleryGridUI f201291d;

    public q2(com.tencent.mm.ui.chatting.gallery.ImageGalleryGridUI imageGalleryGridUI) {
        this.f201291d = imageGalleryGridUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.gallery.ImageGalleryGridUI imageGalleryGridUI = this.f201291d;
        android.view.View view = imageGalleryGridUI.f200583w;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridUI$7", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridUI$7", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            imageGalleryGridUI.f200583w = null;
        }
    }
}
