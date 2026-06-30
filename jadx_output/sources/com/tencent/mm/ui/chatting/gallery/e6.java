package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class e6 implements com.tencent.mm.ui.tools.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ImageGalleryUI f200891a;

    public e6(com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI) {
        this.f200891a = imageGalleryUI;
    }

    @Override // com.tencent.mm.ui.tools.p3
    public void a() {
        com.tencent.mars.xlog.Log.w("MicroMsg.ImageGalleryUI", "runExitAnimation, onAnimationCancel");
    }

    @Override // com.tencent.mm.ui.tools.p3
    public void b(float f17) {
    }

    @Override // com.tencent.mm.ui.tools.p3
    public void onAnimationEnd() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "runExitAnimation, onAnimationEnd");
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = this.f200891a;
        imageGalleryUI.f200636m4.post(new com.tencent.mm.ui.chatting.gallery.d6(this));
        imageGalleryUI.f200665v = false;
    }

    @Override // com.tencent.mm.ui.tools.p3
    public void onAnimationStart() {
        com.tencent.mm.ui.base.MMViewPager mMViewPager;
        android.view.View e17;
        android.widget.LinearLayout linearLayout;
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = this.f200891a;
        try {
            com.tencent.mm.ui.chatting.gallery.k1 k1Var = imageGalleryUI.f200611g;
            if (k1Var != null && (mMViewPager = imageGalleryUI.f200637n) != null && (e17 = k1Var.e(mMViewPager.getCurrentItem())) != null && (e17.getTag() instanceof com.tencent.mm.ui.chatting.gallery.ta) && (linearLayout = ((com.tencent.mm.ui.chatting.gallery.ta) e17.getTag()).f201448z) != null) {
                linearLayout.setVisibility(8);
            }
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ImageGalleryUI", "runExitAnimation: hide image failed view error: " + e18.getMessage());
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "runExitAnimation, onAnimationStart");
        imageGalleryUI.f200665v = true;
    }
}
