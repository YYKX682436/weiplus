package com.tencent.mm.plugin.flash;

/* loaded from: classes14.dex */
public class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.flash.FaceFlashUI f137251d;

    public t(com.tencent.mm.plugin.flash.FaceFlashUI faceFlashUI) {
        this.f137251d = faceFlashUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.flash.FaceFlashUI faceFlashUI = this.f137251d;
        com.tencent.mm.plugin.flash.FaceFlashProcessLayout faceFlashProcessLayout = faceFlashUI.f137052e;
        faceFlashProcessLayout.f137048n.cancel();
        faceFlashProcessLayout.f137049o.cancel();
        faceFlashProcessLayout.f137050p.cancel();
        com.tencent.mm.plugin.flash.FaceFlashPreviewLayout faceFlashPreviewLayout = faceFlashUI.f137051d;
        faceFlashPreviewLayout.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManager", "release");
        faceFlashPreviewLayout.f137032t.release();
        faceFlashPreviewLayout.N.cancel();
        faceFlashUI.f137058n.dead();
        faceFlashUI.f137059o.dead();
    }
}
