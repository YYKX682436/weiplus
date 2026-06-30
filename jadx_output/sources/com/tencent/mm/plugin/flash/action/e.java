package com.tencent.mm.plugin.flash.action;

/* loaded from: classes14.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.flash.action.FaceFlashActionPreviewLayout f137127d;

    public e(com.tencent.mm.plugin.flash.action.FaceFlashActionPreviewLayout faceFlashActionPreviewLayout) {
        this.f137127d = faceFlashActionPreviewLayout;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.flash.action.FaceFlashActionPreviewLayout faceFlashActionPreviewLayout = this.f137127d;
        faceFlashActionPreviewLayout.f137069h.setText(i65.a.r(faceFlashActionPreviewLayout.getContext(), com.tencent.mm.R.string.c7n));
    }
}
