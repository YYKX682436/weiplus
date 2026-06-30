package com.tencent.mm.plugin.flash.action;

/* loaded from: classes14.dex */
public class c implements com.tencent.mm.plugin.flash.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.flash.action.FaceFlashActionPreviewLayout f137119a;

    public c(com.tencent.mm.plugin.flash.action.FaceFlashActionPreviewLayout faceFlashActionPreviewLayout) {
        this.f137119a = faceFlashActionPreviewLayout;
    }

    @Override // com.tencent.mm.plugin.flash.b0
    public void a(java.lang.Boolean bool, com.tencent.mm.plugin.flash.d0 d0Var) {
        if (bool.booleanValue()) {
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.FaceFlashActionPreviewLayout", "logicReset startPreview open camera failed");
        vz2.c.k("openCamera", -1);
        vz2.c.b().B = 1;
        com.tencent.mm.plugin.flash.action.FaceFlashActionPreviewLayout faceFlashActionPreviewLayout = this.f137119a;
        faceFlashActionPreviewLayout.f137078s.a7(faceFlashActionPreviewLayout.d(90038, i65.a.r(faceFlashActionPreviewLayout.getContext(), com.tencent.mm.R.string.c7m)));
    }
}
