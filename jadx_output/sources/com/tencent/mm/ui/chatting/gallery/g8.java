package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class g8 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f200960d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ImageGalleryUI f200961e;

    public g8(com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI, android.view.View view) {
        this.f200961e = imageGalleryUI;
        this.f200960d = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f200960d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = this.f200961e;
        if (imageGalleryUI.isFinishing() || imageGalleryUI.isDestroyed() || imageGalleryUI.V1) {
            return;
        }
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.W6(imageGalleryUI);
    }
}
