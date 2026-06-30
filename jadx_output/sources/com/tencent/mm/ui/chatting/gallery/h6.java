package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class h6 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ImageGalleryUI f200984d;

    public h6(com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI) {
        this.f200984d = imageGalleryUI;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        g4Var.clear();
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = this.f200984d;
        com.tencent.mm.storage.f9 w17 = imageGalleryUI.f200611g.w();
        if (c01.ia.e(w17)) {
            return;
        }
        g4Var.g(16, imageGalleryUI.getString(com.tencent.mm.R.string.lwe), com.tencent.mm.R.raw.translate_off_regular);
        g4Var.g(17, imageGalleryUI.getString(com.tencent.mm.R.string.lwf), com.tencent.mm.R.raw.language_transfer_regular);
        g4Var.g(18, imageGalleryUI.getString(com.tencent.mm.R.string.lwh), com.tencent.mm.R.raw.icons_outlined_feedback_error);
        if (com.tencent.mm.ui.chatting.gallery.k1.L(w17) || com.tencent.mm.ui.chatting.gallery.k1.G(w17)) {
            g4Var.g(19, imageGalleryUI.getString(com.tencent.mm.R.string.lwi), com.tencent.mm.R.raw.icons_outlined_download);
        }
    }
}
