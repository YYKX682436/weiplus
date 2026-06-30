package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class v6 implements com.tencent.mm.plugin.scanner.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f201507a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ImageGalleryUI f201508b;

    public v6(com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI, boolean z17) {
        this.f201508b = imageGalleryUI;
        this.f201507a = z17;
    }

    @Override // com.tencent.mm.plugin.scanner.b0
    public void a(java.util.ArrayList arrayList, java.util.ArrayList arrayList2, java.util.ArrayList arrayList3) {
        com.tencent.mm.plugin.scanner.d0 d0Var = com.tencent.mm.plugin.scanner.d0.f158718a;
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = this.f201508b;
        int a17 = d0Var.a(imageGalleryUI.f200599d, imageGalleryUI.f200607f);
        if (imageGalleryUI.f200637n != null) {
            imageGalleryUI.b8();
            imageGalleryUI.B1.c(a17, arrayList3, arrayList, arrayList2, imageGalleryUI.f200637n.getMeasuredHeight());
        } else {
            imageGalleryUI.b8();
            com.tencent.mm.plugin.scanner.MultiCodeMaskView multiCodeMaskView = imageGalleryUI.B1;
            imageGalleryUI.b8();
            multiCodeMaskView.c(a17, arrayList3, arrayList, arrayList2, imageGalleryUI.B1.getRootView().getHeight());
        }
        imageGalleryUI.b9(false);
        d0Var.d(imageGalleryUI.V2.longValue(), arrayList3.size(), arrayList.size(), imageGalleryUI.f200607f ? 11 : 10, "");
        if (arrayList.size() > 1) {
            d0Var.c(imageGalleryUI.V2.longValue(), 11, arrayList3, null, imageGalleryUI.W2.longValue(), this.f201507a, a17);
        }
    }

    @Override // com.tencent.mm.plugin.scanner.b0
    public void b(com.tencent.mm.plugin.scanner.ImageQBarDataBean imageQBarDataBean, java.util.ArrayList arrayList) {
        java.lang.String str = imageQBarDataBean.f158619d;
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = this.f201508b;
        imageGalleryUI.f200666v2 = str;
        imageGalleryUI.f200669w2.b(imageGalleryUI.f200663u2, imageQBarDataBean, imageGalleryUI.f200627k3);
        com.tencent.mm.plugin.scanner.d0 d0Var = com.tencent.mm.plugin.scanner.d0.f158718a;
        d0Var.d(imageGalleryUI.V2.longValue(), imageGalleryUI.f200663u2.f344451a.size(), 0, imageGalleryUI.f200607f ? 11 : 10, "");
        d0Var.c(imageGalleryUI.V2.longValue(), 1, imageGalleryUI.f200663u2.f344451a, imageQBarDataBean, imageGalleryUI.W2.longValue(), this.f201507a, d0Var.a(imageGalleryUI.f200599d, imageGalleryUI.f200607f));
    }
}
