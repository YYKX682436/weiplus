package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class x4 implements com.tencent.mm.plugin.scanner.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ImageGalleryUI f201550a;

    public x4(com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI) {
        this.f201550a = imageGalleryUI;
    }

    @Override // com.tencent.mm.plugin.scanner.f0
    public void a(java.util.ArrayList arrayList, com.tencent.mm.plugin.scanner.ImageQBarDataBean imageQBarDataBean, boolean z17) {
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = this.f201550a;
        oc5.g0 g0Var = imageGalleryUI.f200669w2;
        if (g0Var != null) {
            imageGalleryUI.f200666v2 = imageQBarDataBean.f158619d;
            g0Var.b(imageGalleryUI.f200663u2, imageQBarDataBean, imageGalleryUI.f200627k3);
        }
        int i17 = z17 ? 1 : 2;
        com.tencent.mm.plugin.scanner.d0 d0Var = com.tencent.mm.plugin.scanner.d0.f158718a;
        d0Var.c(imageGalleryUI.V2.longValue(), i17, arrayList, imageQBarDataBean, imageGalleryUI.W2.longValue(), imageGalleryUI.f200663u2.f344455e, d0Var.a(imageGalleryUI.f200599d, imageGalleryUI.f200607f));
    }

    @Override // com.tencent.mm.plugin.scanner.f0
    public void b(java.util.ArrayList arrayList) {
        com.tencent.mm.plugin.scanner.d0 d0Var = com.tencent.mm.plugin.scanner.d0.f158718a;
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = this.f201550a;
        d0Var.c(imageGalleryUI.V2.longValue(), 3, arrayList, null, imageGalleryUI.W2.longValue(), imageGalleryUI.f200663u2.f344455e, d0Var.a(imageGalleryUI.f200599d, imageGalleryUI.f200607f));
    }
}
