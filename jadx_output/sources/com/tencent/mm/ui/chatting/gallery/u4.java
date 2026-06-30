package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class u4 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ImageGalleryUI f201476d;

    public u4(com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI) {
        this.f201476d = imageGalleryUI;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$10", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int i17 = com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.f200588p4;
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = this.f201476d;
        if (!imageGalleryUI.o8() || imageGalleryUI.isFinishing() || imageGalleryUI.isDestroyed() || !imageGalleryUI.z8()) {
            yj0.a.i(false, this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$10", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        if (imageGalleryUI.S1 && motionEvent.getAction() == 0 && imageGalleryUI.o8()) {
            motionEvent.offsetLocation(view.getScrollX() - imageGalleryUI.L1.getLeft(), view.getScrollY() - imageGalleryUI.L1.getTop());
            ((com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBarWithAnimation) imageGalleryUI.L1).B(motionEvent);
            yj0.a.i(true, this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$10", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return true;
        }
        if (!(imageGalleryUI.S1 && imageGalleryUI.o8()) && motionEvent.getAction() == 2) {
            yj0.a.i(false, this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$10", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        motionEvent.offsetLocation(view.getScrollX() - imageGalleryUI.L1.getLeft(), view.getScrollY() - imageGalleryUI.L1.getTop());
        boolean B = ((com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBarWithAnimation) imageGalleryUI.L1).B(motionEvent);
        if (motionEvent.getAction() == 1) {
            if (!B) {
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).fk(imageGalleryUI.R1, "panel_status", java.lang.Integer.valueOf(imageGalleryUI.f200614g4 ? 2 : 1));
            }
            if (!imageGalleryUI.f200614g4 || B) {
                imageGalleryUI.o9(false);
            } else {
                imageGalleryUI.k8();
            }
        } else if (motionEvent.getAction() == 2 && B) {
            imageGalleryUI.o9(false);
            imageGalleryUI.t9();
        }
        yj0.a.i(B, this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$10", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return B;
    }
}
