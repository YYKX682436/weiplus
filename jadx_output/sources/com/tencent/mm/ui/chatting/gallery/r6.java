package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class r6 implements com.tencent.mm.ui.widget.dialog.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ImageGalleryUI f201337a;

    public r6(com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI) {
        this.f201337a = imageGalleryUI;
    }

    @Override // com.tencent.mm.ui.widget.dialog.b1
    public void a() {
        com.tencent.mm.storage.f9 w17;
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = this.f201337a;
        com.tencent.mm.ui.chatting.gallery.k1 k1Var = imageGalleryUI.f200611g;
        if (k1Var == null || (w17 = k1Var.w()) == null || !w17.M2()) {
            return;
        }
        com.tencent.mm.plugin.webview.ui.tools.media.a.f185739a.a(3, imageGalleryUI.Z7(), imageGalleryUI.Y7());
    }
}
