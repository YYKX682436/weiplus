package kp3;

/* loaded from: classes14.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kp3.x f311037d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f311038e;

    public r(kp3.x xVar, byte[] bArr) {
        this.f311037d = xVar;
        this.f311038e = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.youtu.YTBizPalmRegister.Result process;
        double d17;
        this.f311037d.f311053i.set(true);
        kp3.x xVar = this.f311037d;
        android.util.Size size = xVar.f311052h;
        if (size == null) {
            xVar.f311053i.set(false);
            return;
        }
        try {
            com.tencent.youtu.YTBizPalmRegister yTBizPalmRegister = xVar.f311050f;
            process = yTBizPalmRegister != null ? yTBizPalmRegister.process(this.f311038e, size.getWidth(), size.getHeight()) : null;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PalmPrintCameraSettingUIC", "[setPreviewCallback] verify failed： " + e17.getMessage());
            if (!this.f311037d.f311055n.get()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.PalmPrintCameraSettingUIC", "[setPreviewCallback] verify failed, final exit");
                jp3.g.f301000a.i(this.f311037d.getActivity(), 80012, "ERR_PALM_SDK_VERIFY", (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
            }
        }
        if (process == null) {
            this.f311037d.f311053i.set(false);
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).B(new kp3.o(this.f311037d, process));
        kp3.x xVar2 = this.f311037d;
        android.graphics.RectF rectF = process.palmRect;
        xVar2.getClass();
        if (rectF != null) {
            if (rectF.left > 0.0f) {
                if (rectF.bottom > 0.0f) {
                    double d18 = xVar2.f311062u;
                    if (d18 > 0.0d) {
                        d17 = xVar2.f311063v;
                        if (d17 > 0.0d) {
                            float f17 = 2;
                            xVar2.f311060s = (float) ((r6 + ((rectF.right - r6) / f17)) * d18);
                            float f18 = rectF.top;
                            xVar2.f311061t = (float) ((f18 + ((r8 - f18) / f17)) * d17);
                        }
                    }
                }
            }
        }
        kp3.x xVar3 = this.f311037d;
        if (!xVar3.f311059r && process.isFirstPalm) {
            xVar3.f311059r = true;
            xVar3.f311064w = java.lang.System.currentTimeMillis();
            ((ku5.t0) ku5.t0.f312615d).B(new kp3.p(this.f311037d));
            kp3.x xVar4 = this.f311037d;
            kotlinx.coroutines.l.d(xVar4.f311048d, null, null, new kp3.q(xVar4, null), 3, null);
        }
        if (process.isQualifiedPalm) {
            this.f311037d.f311065x = java.lang.System.currentTimeMillis();
        }
        if (process.tipCode == com.tencent.youtu.YTBizPalmRegister.Tip.YT_TIP_PIPELINE_SUCCESS) {
            kp3.x.P6(this.f311037d);
        }
        this.f311037d.f311053i.set(false);
    }
}
