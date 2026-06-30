package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class f8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f200921d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ImageGalleryUI f200922e;

    public f8(com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI, java.lang.String str) {
        this.f200922e = imageGalleryUI;
        this.f200921d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = this.f200922e;
        imageGalleryUI.h9(imageGalleryUI.P, 8);
        imageGalleryUI.Q.setVisibility(8);
        android.view.View view = imageGalleryUI.S;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$80", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$80", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        imageGalleryUI.R8(imageGalleryUI.I7());
        imageGalleryUI.o9(false);
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(imageGalleryUI);
        e4Var.f211776c = this.f200921d;
        e4Var.c();
        com.tencent.mm.ui.chatting.gallery.q3.c(imageGalleryUI.f200605e3, new com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$c0(), null, java.lang.Boolean.FALSE);
    }
}
