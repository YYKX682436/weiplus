package com.tencent.mm.plugin.flash.action;

/* loaded from: classes14.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.flash.action.j f137144d;

    public i(com.tencent.mm.plugin.flash.action.j jVar) {
        this.f137144d = jVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.e("MicroMsg.FaceFlashActionPreviewLayout", "GetFaceCheckLiveType use http timeout!");
        com.tencent.mm.plugin.flash.action.j jVar = this.f137144d;
        jVar.f137147f.f137067f.setVisibility(8);
        com.tencent.mm.plugin.flash.action.FaceFlashActionPreviewLayout faceFlashActionPreviewLayout = jVar.f137147f;
        faceFlashActionPreviewLayout.f137078s.a7(faceFlashActionPreviewLayout.d(90037, i65.a.r(faceFlashActionPreviewLayout.getContext(), com.tencent.mm.R.string.c7q)));
    }
}
