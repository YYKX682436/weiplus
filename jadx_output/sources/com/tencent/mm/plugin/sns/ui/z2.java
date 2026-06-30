package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class z2 implements com.tencent.mm.sdk.platformtools.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f171662a;

    public z2(android.graphics.Bitmap bitmap) {
        this.f171662a = bitmap;
    }

    @Override // com.tencent.mm.sdk.platformtools.w
    public void a(java.io.OutputStream outputStream) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$4");
        try {
            try {
                this.f171662a.compress(android.graphics.Bitmap.CompressFormat.PNG, 80, outputStream);
            } catch (java.lang.Throwable th6) {
                try {
                    outputStream.close();
                } catch (java.lang.Exception unused) {
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$4");
                throw th6;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FlipView", e17, "", new java.lang.Object[0]);
        }
        try {
            outputStream.close();
        } catch (java.lang.Exception unused2) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$4");
        }
    }
}
