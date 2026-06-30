package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class w7 implements j35.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f201539a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jz5.l f201540b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ImageGalleryUI f201541c;

    public w7(com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI, com.tencent.mm.storage.f9 f9Var, jz5.l lVar) {
        this.f201541c = imageGalleryUI;
        this.f201539a = f9Var;
        this.f201540b = lVar;
    }

    @Override // j35.b0
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = this.f201541c;
        if (iArr == null || iArr.length <= 0 || iArr[0] != 0) {
            db5.e1.C(imageGalleryUI, imageGalleryUI.getString(com.tencent.mm.R.string.oc6), imageGalleryUI.getString(com.tencent.mm.R.string.hht), imageGalleryUI.getString(com.tencent.mm.R.string.g6z), imageGalleryUI.getString(com.tencent.mm.R.string.fic), false, new com.tencent.mm.ui.chatting.gallery.v7(this), null);
            return;
        }
        jz5.l lVar = this.f201540b;
        java.lang.String str = (java.lang.String) lVar.f302833d;
        java.lang.Long l17 = (java.lang.Long) lVar.f302834e;
        int i18 = com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.f200588p4;
        com.tencent.mm.storage.f9 f9Var = this.f201539a;
        imageGalleryUI.getClass();
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$y(imageGalleryUI, str, f9Var, l17));
    }
}
