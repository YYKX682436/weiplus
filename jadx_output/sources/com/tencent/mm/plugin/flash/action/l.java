package com.tencent.mm.plugin.flash.action;

/* loaded from: classes14.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.flash.action.FaceFlashActionPreviewLayout f137158d;

    public l(com.tencent.mm.plugin.flash.action.FaceFlashActionPreviewLayout faceFlashActionPreviewLayout) {
        this.f137158d = faceFlashActionPreviewLayout;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.flash.action.FaceFlashActionPreviewLayout faceFlashActionPreviewLayout = this.f137158d;
        faceFlashActionPreviewLayout.f137067f.setVisibility(8);
        faceFlashActionPreviewLayout.f137078s.a7(faceFlashActionPreviewLayout.d(90037, i65.a.r(faceFlashActionPreviewLayout.getContext(), com.tencent.mm.R.string.c7q)));
    }
}
