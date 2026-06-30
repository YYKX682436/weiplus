package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class j7 implements db5.a8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.h7 f201068a;

    public j7(com.tencent.mm.ui.chatting.gallery.h7 h7Var) {
        this.f201068a = h7Var;
    }

    @Override // db5.a8
    public void a() {
        com.tencent.mm.ui.chatting.gallery.h7 h7Var = this.f201068a;
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = h7Var.f200987f;
        com.tencent.mm.ui.chatting.gallery.k1 k1Var = imageGalleryUI.f200611g;
        if (k1Var != null) {
            if (k1Var.f201106x.a(imageGalleryUI.I7()) != null) {
                return;
            }
        }
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.Z6(h7Var.f200987f);
    }
}
