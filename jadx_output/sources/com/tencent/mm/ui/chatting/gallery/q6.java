package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class q6 implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ImageGalleryUI f201298d;

    public q6(com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI) {
        this.f201298d = imageGalleryUI;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public void onDismiss() {
        java.util.HashMap hashMap;
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = this.f201298d;
        imageGalleryUI.f200651q2 = null;
        imageGalleryUI.f200657s2 = false;
        oc5.g0 g0Var = imageGalleryUI.f200669w2;
        if (g0Var != null) {
            g0Var.f344425i = null;
            g0Var.f344426j = 0L;
            g0Var.f344427k = false;
            g0Var.f344428l = false;
            g0Var.f344429m = 0L;
            g0Var.f344430n = null;
            g0Var.f344431o = false;
        }
        ((com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic) imageGalleryUI.Z2).n();
        oc5.b bVar = imageGalleryUI.f200591a3.f344396c;
        if (bVar != null && (hashMap = bVar.f344385b) != null) {
        }
        ((kz3.o) imageGalleryUI.f200643o3).f313905a.clear();
        oc5.l0 l0Var = imageGalleryUI.f200663u2;
        l0Var.f344452b = null;
        l0Var.f344453c = null;
        imageGalleryUI.C8(false);
    }
}
