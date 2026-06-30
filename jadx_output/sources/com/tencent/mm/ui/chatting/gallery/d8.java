package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class d8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ImageGalleryUI f200869d;

    public d8(com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI) {
        this.f200869d = imageGalleryUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.f200588p4;
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = this.f200869d;
        android.view.animation.Animation B7 = imageGalleryUI.B7(1000);
        B7.setAnimationListener(new com.tencent.mm.ui.chatting.gallery.c8(this));
        if (com.tencent.mm.ui.chatting.gallery.ja.H()) {
            ((c35.m) i95.n0.c(c35.m.class)).getClass();
        } else {
            android.view.Display display = imageGalleryUI.getContentView().getDisplay();
            if (display != null && display.getRotation() != 0 && display.getRotation() != 2) {
                ((c35.m) i95.n0.c(c35.m.class)).getClass();
            }
        }
        imageGalleryUI.h9(imageGalleryUI.P, 8);
        imageGalleryUI.Q.setVisibility(8);
        android.view.View view = imageGalleryUI.S;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$79", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$79", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = imageGalleryUI.U;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$79", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$79", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        imageGalleryUI.U.startAnimation(B7);
        imageGalleryUI.R8(imageGalleryUI.I7());
        imageGalleryUI.o9(false);
        com.tencent.mm.ui.chatting.gallery.k1 k1Var = imageGalleryUI.f200611g;
        com.tencent.mm.storage.f9 y17 = k1Var == null ? null : k1Var.y(imageGalleryUI.O3);
        if (y17 != null && imageGalleryUI.o8()) {
            g90.s sVar = (g90.s) ((h90.v) i95.n0.c(h90.v.class));
            sVar.getClass();
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("chat_msg_witch_to_original", sVar.Ni(y17), 32337);
        }
        com.tencent.mm.ui.chatting.gallery.q3.c(imageGalleryUI.f200605e3, new com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$c0(), 100, java.lang.Boolean.TRUE);
    }
}
