package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class k8 implements zh1.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f201148a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f201149b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.service.k5 f201150c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f201151d;

    public k8(com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI, java.lang.String str, com.tencent.mm.plugin.appbrand.service.k5 k5Var, bi1.g gVar, boolean z17) {
        this.f201148a = new java.lang.ref.WeakReference(imageGalleryUI);
        this.f201149b = str;
        this.f201150c = k5Var;
        this.f201151d = z17;
    }

    @Override // zh1.a1
    public void a(boolean z17, com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection appBrandOpenMaterialCollection) {
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = (com.tencent.mm.ui.chatting.gallery.ImageGalleryUI) this.f201148a.get();
        if (imageGalleryUI == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "tryEnhanceBottomSheet#onMyOpenMaterialsGot, ui is null");
            return;
        }
        if (!z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "tryEnhanceBottomSheet#onMyOpenMaterialsGot, fail");
            return;
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var = imageGalleryUI.f200651q2;
        if (k0Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "tryEnhanceBottomSheet#onMyOpenMaterialsGot, bottomSheet is null");
            return;
        }
        imageGalleryUI.F3 = this.f201149b;
        imageGalleryUI.G3 = appBrandOpenMaterialCollection;
        if (!((zh1.p) this.f201150c).Zi(k0Var, appBrandOpenMaterialCollection)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "tryEnhanceBottomSheet#onMyOpenMaterialsGot, not need enhance");
            return;
        }
        com.tencent.mm.ui.chatting.gallery.k1 k1Var = imageGalleryUI.f200611g;
        com.tencent.mm.ui.chatting.gallery.gb u17 = k1Var != null ? k1Var.u() : null;
        if (u17 == null || com.tencent.mm.ui.chatting.gallery.gb.f200965d == u17) {
            return;
        }
        imageGalleryUI.w9(this.f201151d);
    }
}
