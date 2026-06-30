package com.tencent.mm.plugin.flash;

/* loaded from: classes14.dex */
public class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.flash.d0 f137062d;

    public a0(com.tencent.mm.plugin.flash.d0 d0Var) {
        this.f137062d = d0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.flash.d0 d0Var = this.f137062d;
        d0Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerCamera", "closeCamera start");
        com.tencent.mm.plugin.facedetect.model.v.b().d(d0Var.f137215r);
        wo.d1 d1Var = d0Var.f137201d;
        if (d1Var != null) {
            try {
                if (d0Var.f137208k) {
                    d0Var.f137208k = false;
                    d1Var.l();
                    d0Var.f137201d.g(null);
                    com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerCamera", "stop preview, not previewing");
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerCamera", "Error setting camera preview: " + e17.getMessage());
            }
            try {
                try {
                    d0Var.f137201d.g(null);
                    d0Var.f137201d.d();
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerCamera", "Error setting camera preview: " + e18.getMessage());
                }
            } finally {
                d0Var.f137201d = null;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerCamera", "closeCamera end");
        if (d0Var.f137199b == null) {
            return;
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var = d0Var.f137200c;
        if (n3Var != null) {
            n3Var.removeCallbacksAndMessages(null);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerCamera", "stop camera thread");
        d0Var.f137199b.quitSafely();
        d0Var.f137199b = null;
        d0Var.f137200c = null;
        d0Var.f137214q = null;
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerCamera", "stop camera thread finish");
    }
}
