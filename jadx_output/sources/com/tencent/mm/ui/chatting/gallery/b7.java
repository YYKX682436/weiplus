package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class b7 implements com.tencent.mm.ui.chatting.gallery.fb {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ImageGalleryUI f200815a;

    public b7(com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI) {
        this.f200815a = imageGalleryUI;
    }

    public void a(long j17, java.lang.String str, android.view.View view, java.lang.String str2, android.graphics.Bitmap bitmap) {
        if (view == null || bitmap == null || com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            return;
        }
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = this.f200815a;
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "onImageLoaded msgId: %d, currentMsgId: %d, imagePath: %s, bitmap: %s", valueOf, java.lang.Long.valueOf(imageGalleryUI.D), str2, java.lang.Integer.valueOf(bitmap.hashCode()));
        if (j17 == imageGalleryUI.D || (j17 == 0 && !com.tencent.mm.sdk.platformtools.t8.K0(str2) && str2.equals(imageGalleryUI.x2()))) {
            imageGalleryUI.F = bitmap;
        }
    }
}
