package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class j8 implements com.tencent.mm.pluginsdk.ui.tools.o5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ImageGalleryUI f201069a;

    public j8(com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI) {
        this.f201069a = imageGalleryUI;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.o5
    public void a(int i17, int i18) {
        h90.v vVar = (h90.v) i95.n0.c(h90.v.class);
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = this.f201069a;
        ((g90.s) vVar).sj(imageGalleryUI, imageGalleryUI.f200611g.w(), 1, i17, i18);
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.o5
    public void b(float f17, float f18) {
        h90.v vVar = (h90.v) i95.n0.c(h90.v.class);
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = this.f201069a;
        ((g90.s) vVar).tj(imageGalleryUI, imageGalleryUI.f200611g.w(), 1, f17, f18);
    }
}
