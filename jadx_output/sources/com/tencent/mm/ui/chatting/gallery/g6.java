package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class g6 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ImageGalleryUI f200957d;

    public g6(com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI) {
        this.f200957d = imageGalleryUI;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        g4Var.clear();
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = this.f200957d;
        com.tencent.mm.storage.f9 w17 = imageGalleryUI.f200611g.w();
        int l17 = c01.ia.l(w17);
        if (!(l17 == 3 || l17 == 4) && !c01.ia.C(w17) && !c01.ia.e(w17)) {
            g4Var.f(0, imageGalleryUI.getString(com.tencent.mm.R.string.i29));
            java.lang.String string = imageGalleryUI.getString(com.tencent.mm.R.string.i8c);
            if (com.tencent.mm.ui.chatting.gallery.k1.L(w17) || com.tencent.mm.ui.chatting.gallery.k1.G(w17)) {
                string = imageGalleryUI.getString(com.tencent.mm.R.string.i89);
            } else if ((com.tencent.mm.ui.chatting.gallery.k1.N(w17) || com.tencent.mm.ui.chatting.gallery.k1.M(w17)) && !w17.M2()) {
                string = imageGalleryUI.getString(com.tencent.mm.R.string.i8d);
            }
            if (!w17.M2()) {
                g4Var.f(1, string);
            }
        }
        g4Var.g(5, imageGalleryUI.getString(com.tencent.mm.R.string.b2b), com.tencent.mm.R.raw.icons_outlined_chats);
    }
}
