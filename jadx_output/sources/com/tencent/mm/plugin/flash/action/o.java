package com.tencent.mm.plugin.flash.action;

/* loaded from: classes14.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.flash.action.FaceFlashActionPreviewLayout f137165d;

    public o(com.tencent.mm.plugin.flash.action.FaceFlashActionPreviewLayout faceFlashActionPreviewLayout) {
        this.f137165d = faceFlashActionPreviewLayout;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.flash.action.FaceFlashActionPreviewLayout faceFlashActionPreviewLayout = this.f137165d;
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashActionPreviewLayout", "faceReflectMask.post faceTipTextViewBefore.getHeight():%s", java.lang.Integer.valueOf(faceFlashActionPreviewLayout.f137068g.getTop()));
        faceFlashActionPreviewLayout.f137066e.setCircleMarginY(faceFlashActionPreviewLayout.f137068g.getTop() + faceFlashActionPreviewLayout.f137068g.getHeight() + i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 48));
        faceFlashActionPreviewLayout.f137066e.invalidate();
        faceFlashActionPreviewLayout.e();
    }
}
