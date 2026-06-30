package ei3;

/* loaded from: classes10.dex */
public class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ei3.w0 f253121d;

    public s0(ei3.w0 w0Var) {
        this.f253121d = w0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        ei3.w0 w0Var = this.f253121d;
        w0Var.getClass();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        java.lang.String str = null;
        if (w0Var.f253179s != null && w0Var.f253180t != null) {
            if (fp.h.c(18)) {
                w0Var.f253179s.quitSafely();
            } else {
                w0Var.f253179s.quit();
            }
            w0Var.f253180t = null;
        }
        int i17 = w0Var.f253169i.f253003e;
        w0Var.f253165e = (i17 * 1000.0f) / w0Var.f253164d;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "stop, frameCount: %s, fps: %s, duration: %s, file: %s handlerrunning %s, overrideDurationMs: %s, overrideFps: %s", java.lang.Integer.valueOf(i17), java.lang.Float.valueOf(w0Var.f253165e), java.lang.Integer.valueOf(w0Var.f253164d), w0Var.f253163c, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime), java.lang.Integer.valueOf(w0Var.f253166f), java.lang.Float.valueOf(w0Var.f253167g));
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "frameCountCallback %s", w0Var.A.c());
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "yuvRecorderWriteDataCallback %s", w0Var.f253186z.c());
        if (com.tencent.mm.plugin.mmsight.model.CaptureMMProxy.getInstance() != null) {
            str = com.tencent.mm.plugin.mmsight.model.CaptureMMProxy.getInstance().getAccVideoPath();
        } else if (!com.tencent.mm.sdk.platformtools.t8.K0(w0Var.f253163c)) {
            str = new com.tencent.mm.vfs.r6(w0Var.f253163c).s().o();
        }
        java.lang.String l17 = !com.tencent.mm.sdk.platformtools.t8.K0(str) ? ai3.d.l(str) : w0Var.f253163c;
        int i18 = w0Var.f253164d;
        int i19 = w0Var.f253166f;
        int i27 = i19 > 0 ? i19 : i18;
        float f17 = w0Var.f253165e;
        float f18 = w0Var.f253167g;
        w0Var.f253170j = new ei3.l0(new com.tencent.mm.plugin.sight.base.h(w0Var.f253178r), l17, f18 > 0.0f ? f18 : f17, w0Var.f253173m, i27, w0Var.B.f71199o, w0Var.L, false, false);
        long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
        boolean z18 = false;
        boolean a17 = w0Var.f253170j.a(false);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "mux used %sms, success: %s", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime2), java.lang.Boolean.valueOf(a17));
        if (a17) {
            boolean z19 = w0Var.F;
            if ((z19 && w0Var.f253182v) || ((!w0Var.f253182v && !z19) || ((z19 && java.lang.Math.abs(w0Var.f253177q - w0Var.G) == 0) || w0Var.G == 180))) {
                long elapsedRealtime3 = android.os.SystemClock.elapsedRealtime();
                boolean z27 = w0Var.f253182v;
                int i28 = (z27 || w0Var.F) ? z27 ? w0Var.G : 180 : w0Var.f253177q;
                if (w0Var.G == 180 && !z27 && (i28 = i28 + 180) > 360) {
                    i28 += org.chromium.net.NetError.ERR_HTTP2_INADEQUATE_TRANSPORT_SECURITY;
                }
                if (i28 > 0) {
                    com.tencent.mm.plugin.sight.base.SightVideoJNI.tagRotateVideoVFS(l17, w0Var.f253181u, i28);
                    com.tencent.mars.xlog.Log.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "tagRotateVideo used %sms, cameraOrientation: %s, isLandscape: %s, deviceDegree: %s, rotateDegree: %s", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime3), java.lang.Integer.valueOf(w0Var.f253177q), java.lang.Boolean.valueOf(w0Var.F), java.lang.Integer.valueOf(w0Var.G), java.lang.Integer.valueOf(i28));
                    long elapsedRealtime4 = android.os.SystemClock.elapsedRealtime();
                    try {
                        com.tencent.mm.vfs.w6.h(l17);
                        com.tencent.mm.vfs.w6.w(w0Var.f253181u, l17);
                        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "copyFile cost %s", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime4));
                        s75.d.b(new ei3.t0(w0Var, w0Var.f253181u), "BigSightMediaCodecMP4MuxRecorder_tagRotate_after_process");
                    } catch (java.lang.Exception unused) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "stop, copy file error");
                    }
                }
            }
            com.tencent.mm.plugin.sight.base.SightVideoJNI.releaseBigSightDataBufferLock(w0Var.f253178r);
            w0Var.f253176p.a(ei3.l.Stop);
            w0Var.E = com.tencent.mm.vfs.w6.p(l17);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(l17) && !l17.equals(w0Var.f253163c)) {
                com.tencent.mm.vfs.w6.w(l17, w0Var.f253163c);
                com.tencent.mm.vfs.w6.h(l17);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "move muxResultPath %s , isExist: %b", l17, java.lang.Boolean.valueOf(com.tencent.mm.vfs.w6.j(l17)));
            java.lang.String str2 = w0Var.f253163c;
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "to mCurRecordPath %s ,  isExist: %b", str2, java.lang.Boolean.valueOf(com.tencent.mm.vfs.w6.j(str2)));
            z18 = true;
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "mux failed!");
            di3.x.e();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "stopImpl result: %s", java.lang.Boolean.valueOf(z18));
        if (z18) {
            if (this.f253121d.I != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "call stopCallback");
                com.tencent.mm.sdk.platformtools.u3.h(this.f253121d.I);
                return;
            }
            return;
        }
        com.tencent.mm.plugin.sight.base.SightVideoJNI.releaseBigSightDataBufferLock(this.f253121d.f253178r);
        if (this.f253121d.H != null) {
            com.tencent.mm.sdk.platformtools.u3.h(new ei3.r0(this));
        }
    }
}
