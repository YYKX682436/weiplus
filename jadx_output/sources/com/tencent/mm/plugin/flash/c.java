package com.tencent.mm.plugin.flash;

/* loaded from: classes14.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.flash.FaceFlashPreviewLayout f137195d;

    public c(com.tencent.mm.plugin.flash.FaceFlashPreviewLayout faceFlashPreviewLayout) {
        this.f137195d = faceFlashPreviewLayout;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.flash.FaceFlashPreviewLayout faceFlashPreviewLayout = this.f137195d;
        wz2.a.j(faceFlashPreviewLayout.f137020e, i65.a.r(faceFlashPreviewLayout.getContext(), com.tencent.mm.R.string.c7n));
    }
}
