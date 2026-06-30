package com.tencent.mm.ui.tools;

/* loaded from: classes15.dex */
public class x1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.CropImageNewUI f210897d;

    public x1(com.tencent.mm.ui.tools.CropImageNewUI cropImageNewUI) {
        this.f210897d = cropImageNewUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.tools.CropImageNewUI cropImageNewUI = this.f210897d;
        com.tencent.mm.ui.tools.CropImageNewUI.U6(cropImageNewUI, cropImageNewUI.f210000f.getCropImageIV(), cropImageNewUI.f210000f.getCropAreaView());
        cropImageNewUI.finish();
    }
}
