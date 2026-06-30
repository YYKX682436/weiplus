package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes.dex */
public class i6 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ImageGalleryUI f201024d;

    public i6(com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI) {
        this.f201024d = imageGalleryUI;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        g4Var.clear();
        g4Var.g(5, this.f201024d.getString(com.tencent.mm.R.string.b2b), com.tencent.mm.R.raw.icons_outlined_chats);
    }
}
