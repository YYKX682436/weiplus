package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class o5 implements al5.b4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ImageGalleryUI f201236d;

    public o5(com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI) {
        this.f201236d = imageGalleryUI;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(android.view.ScaleGestureDetector scaleGestureDetector) {
        return false;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScaleBegin(android.view.ScaleGestureDetector scaleGestureDetector) {
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = this.f201236d;
        com.tencent.mm.ui.chatting.gallery.k1 k1Var = imageGalleryUI.f200611g;
        if (k1Var == null) {
            return true;
        }
        if (k1Var.w().isVideo()) {
            com.tencent.mm.ui.chatting.gallery.ta v17 = imageGalleryUI.f200611g.v();
            v17.d();
            if (v17.f201438p instanceof com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerViewContainer) {
                com.tencent.mm.ui.chatting.gallery.ta v18 = imageGalleryUI.f200611g.v();
                v18.d();
                android.view.View currentView = ((com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerViewContainer) v18.f201438p).getCurrentView();
                if (currentView != null && (currentView instanceof com.tencent.mm.plugin.thumbplayer.view.MMTextureView)) {
                    ((com.tencent.mm.plugin.thumbplayer.view.MMTextureView) currentView).setInterceptDetach(true);
                    android.graphics.Rect rect = new android.graphics.Rect();
                    currentView.getGlobalVisibleRect(rect);
                    if (rect.bottom - rect.top > 0) {
                        imageGalleryUI.X1.setRealViewHeight(r0 - r3);
                        imageGalleryUI.X1.setViewRect(rect);
                    } else {
                        imageGalleryUI.X1.setRealViewHeight(0.0f);
                        imageGalleryUI.X1.getViewRect().setEmpty();
                    }
                }
            }
            imageGalleryUI.X1.setEnable(true);
            imageGalleryUI.U7();
            com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBar redesignVideoPlayerSeekBar = imageGalleryUI.L1;
            if (redesignVideoPlayerSeekBar != null) {
                android.graphics.Rect rect2 = new android.graphics.Rect();
                redesignVideoPlayerSeekBar.getHitRect(rect2);
                imageGalleryUI.X1.setDisabledRect(rect2);
            }
            imageGalleryUI.X1.b(imageGalleryUI.f200611g.z(imageGalleryUI.f200637n.getCurrentItem()));
        } else if (imageGalleryUI.f200611g.w().J2()) {
            imageGalleryUI.X1.setEnable(false);
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(android.view.ScaleGestureDetector scaleGestureDetector) {
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = this.f201236d;
        com.tencent.mm.ui.chatting.gallery.k1 k1Var = imageGalleryUI.f200611g;
        if (k1Var != null) {
            com.tencent.mm.ui.chatting.gallery.ta v17 = k1Var.v();
            v17.d();
            if (v17.f201436n.getVisibility() == 0) {
                yd5.q.f461145a.a(3, 2, imageGalleryUI.X1.getCurrentScale());
            } else {
                yd5.q.f461145a.a(2, 2, imageGalleryUI.X1.getCurrentScale());
            }
        }
    }
}
