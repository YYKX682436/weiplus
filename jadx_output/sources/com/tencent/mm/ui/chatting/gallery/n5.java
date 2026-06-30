package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class n5 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ImageGalleryUI f201214d;

    public n5(com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI) {
        this.f201214d = imageGalleryUI;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$28", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getAction() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "gallery ACTION_DOWN!");
            c01.l2 c17 = c01.n2.d().c("basescanui@datacenter", true);
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = this.f201214d;
            android.graphics.PointF c18 = e04.i3.c(imageGalleryUI.L7(imageGalleryUI.f200611g, imageGalleryUI.f200637n), motionEvent.getRawX(), motionEvent.getRawY());
            if (c18 != null) {
                c17.i("key_basescanui_touch_normalize_x", java.lang.Float.valueOf(c18.x));
                c17.i("key_basescanui_touch_normalize_y", java.lang.Float.valueOf(c18.y));
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.ImageGalleryUI", "get touchCoordinate is invalid");
                c17.i("key_basescanui_screen_position", java.lang.Boolean.TRUE);
                c17.i("key_basescanui_screen_x", java.lang.Float.valueOf(motionEvent.getRawX()));
                c17.i("key_basescanui_screen_y", java.lang.Float.valueOf(motionEvent.getRawY()));
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$28", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
