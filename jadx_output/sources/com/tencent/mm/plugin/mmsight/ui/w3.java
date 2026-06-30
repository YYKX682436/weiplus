package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes5.dex */
public class w3 implements qk.p7 {
    public w3(com.tencent.mm.plugin.mmsight.ui.TestVideoEditUI testVideoEditUI) {
    }

    @Override // qk.p7
    public void a(android.graphics.Bitmap bitmap, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TestVideoEditUI", "[onSuccess] w:%s h:%s", java.lang.Integer.valueOf(bitmap.getWidth()), java.lang.Integer.valueOf(bitmap.getHeight()));
        try {
            com.tencent.mm.sdk.platformtools.x.D0(bitmap, 100, android.graphics.Bitmap.CompressFormat.PNG, lp0.b.l() + java.lang.String.format("%s%d.%s", "wx_photo_edit_", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), "png"), true);
        } catch (java.io.IOException unused) {
        }
    }

    @Override // qk.p7
    public void onError(java.lang.Exception exc) {
    }
}
