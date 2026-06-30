package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes10.dex */
public class x2 implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.ui.z2 f149444d;

    public x2(com.tencent.mm.plugin.mmsight.ui.z2 z2Var) {
        this.f149444d = z2Var;
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return "SightCaptureUI_edit_finish_save_new_thumb";
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        com.tencent.mm.plugin.mmsight.ui.SightCaptureUI sightCaptureUI = this.f149444d.f149454a;
        int i18 = com.tencent.mm.plugin.mmsight.ui.SightCaptureUI.N1;
        sightCaptureUI.getClass();
        try {
            android.graphics.Bitmap p17 = ai3.d.p(sightCaptureUI.f149235m.getFilePath());
            if (p17 == null || sightCaptureUI.f149232h == null || java.lang.Math.min(p17.getWidth(), p17.getHeight()) <= sightCaptureUI.f149232h.f71204t) {
                return;
            }
            int width = p17.getWidth();
            int height = p17.getHeight();
            com.tencent.mm.modelcontrol.VideoTransPara videoTransPara = sightCaptureUI.f149232h;
            int i19 = videoTransPara.f71204t;
            if (i19 <= 0) {
                i19 = videoTransPara.f71191d;
            }
            if (width < height) {
                i17 = (int) (height / ((width * 1.0f) / i19));
            } else {
                int i27 = i19;
                i19 = (int) (width / ((height * 1.0f) / i19));
                i17 = i27;
            }
            com.tencent.mm.sdk.platformtools.x.D0(android.graphics.Bitmap.createScaledBitmap(p17, i19, i17, true), 60, android.graphics.Bitmap.CompressFormat.JPEG, sightCaptureUI.f149235m.b(), true);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SightCaptureUI", e17, "saveNewThumbAfterEdit error: %s", e17.getMessage());
        }
    }
}
