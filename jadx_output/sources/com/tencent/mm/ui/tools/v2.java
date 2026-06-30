package com.tencent.mm.ui.tools;

/* loaded from: classes15.dex */
public class v2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.CropImageNewUI f210835d;

    public v2(com.tencent.mm.ui.tools.CropImageNewUI cropImageNewUI) {
        this.f210835d = cropImageNewUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.tools.CropImageNewUI cropImageNewUI = this.f210835d;
        if (cropImageNewUI.getIntent().getBooleanExtra("CropImage_DirectlyIntoFilter", false)) {
            cropImageNewUI.finish();
            return;
        }
        cropImageNewUI.f210000f.setVisibility(8);
        cropImageNewUI.f210001g.setVisibility(0);
        android.widget.ImageView imageView = cropImageNewUI.f210003i;
        imageView.setVisibility(((java.lang.Integer) imageView.getTag()).intValue());
        cropImageNewUI.f210002h.setVisibility(0);
    }
}
