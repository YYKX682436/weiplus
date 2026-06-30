package nj1;

/* loaded from: classes5.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f337816d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f337817e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f337818f;

    public e(java.lang.String str, kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.h0 h0Var2) {
        this.f337816d = str;
        this.f337817e = h0Var;
        this.f337818f = h0Var2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateWithParams params:");
        java.lang.String str = this.f337816d;
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.SkylineNativeViewFactoryRichText", sb6.toString());
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        if (jSONObject.has(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA)) {
            java.lang.String optString = jSONObject.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
            try {
                com.tencent.mm.plugin.appbrand.skyline.nativeview.l lVar = (com.tencent.mm.plugin.appbrand.skyline.nativeview.l) this.f337817e.f310123d;
                if (lVar != null) {
                    android.graphics.Canvas lockHardwareCanvas = lVar.f88914n.lockHardwareCanvas();
                    try {
                        lockHardwareCanvas.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
                        lVar.f88914n.unlockCanvasAndPost(lockHardwareCanvas);
                    } catch (java.lang.Throwable th6) {
                        lVar.f88914n.unlockCanvasAndPost(lockHardwareCanvas);
                        throw th6;
                    }
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SkylineNativeViewFactoryRichText", "clean fail! ex:" + e17.getMessage());
            }
            wl1.h hVar = (wl1.h) this.f337818f.f310123d;
            if (hVar != null) {
                kotlin.jvm.internal.o.d(optString);
                hVar.c(optString);
            }
        }
    }
}
