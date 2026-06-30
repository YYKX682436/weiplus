package di3;

/* loaded from: classes10.dex */
public class m extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f232730a;

    /* renamed from: b, reason: collision with root package name */
    public float f232731b;

    /* renamed from: c, reason: collision with root package name */
    public float f232732c;

    /* renamed from: d, reason: collision with root package name */
    public int f232733d;

    /* renamed from: e, reason: collision with root package name */
    public int f232734e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ di3.n f232735f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(di3.n nVar, android.os.Looper looper) {
        super(looper);
        this.f232735f = nVar;
        this.f232730a = false;
    }

    public android.graphics.Rect b(float f17, float f18, float f19, int i17, int i18) {
        float f27 = f19 * 80.0f;
        float f28 = ((f17 / i17) * 2000.0f) - 1000.0f;
        float f29 = f27 / 2.0f;
        float f37 = f28 - f29;
        float f38 = (((f18 / i18) * 2000.0f) - 1000.0f) - f29;
        android.graphics.RectF rectF = new android.graphics.RectF();
        rectF.set(f37, f38, f37 + f27, f27 + f38);
        int round = java.lang.Math.round(rectF.left);
        int i19 = -1000;
        if (round > 1000) {
            round = 1000;
        } else if (round < -1000) {
            round = -1000;
        }
        int round2 = java.lang.Math.round(rectF.top);
        if (round2 > 1000) {
            round2 = 1000;
        } else if (round2 < -1000) {
            round2 = -1000;
        }
        int round3 = java.lang.Math.round(rectF.right);
        if (round3 > 1000) {
            round3 = 1000;
        } else if (round3 < -1000) {
            round3 = -1000;
        }
        int round4 = java.lang.Math.round(rectF.bottom);
        if (round4 > 1000) {
            i19 = 1000;
        } else if (round4 >= -1000) {
            i19 = round4;
        }
        return new android.graphics.Rect(round, round2, round3, i19);
    }

    public void c(wo.d1 d1Var) {
        if (d1Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMSightCamera", "want to auto focus, but camera is null, do nothing");
            return;
        }
        if (!di3.n.R) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMSightCamera", "auto focus not back");
            return;
        }
        di3.n.R = false;
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightCamera", "triggerAutoFocus");
            android.hardware.Camera camera = d1Var.f447652a;
            if (camera != null) {
                camera.cancelAutoFocus();
            }
            d1Var.b(this.f232735f.N);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMSightCamera", "autofocus fail, exception %s", e17.getMessage());
            di3.n.R = true;
        }
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        int i17 = message.what;
        boolean z17 = true;
        if (i17 == 4353) {
            if (this.f232730a) {
                return;
            }
            android.hardware.Camera camera = (android.hardware.Camera) message.obj;
            android.hardware.Camera.Parameters parameters = camera.getParameters();
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightCamera", "zoomed %s curZoomStep %s params.getZoom() %s", java.lang.Boolean.FALSE, 0, java.lang.Integer.valueOf(parameters.getZoom()));
            int zoom = parameters.getZoom() + 0;
            if (zoom <= 0) {
                zoom = 0;
            } else {
                sendMessageDelayed(obtainMessage(4353, message.obj), 20L);
                z17 = false;
            }
            parameters.setZoom(zoom);
            try {
                camera.setParameters(parameters);
            } catch (java.lang.Exception unused) {
            }
            if (z17) {
                this.f232733d = 0;
                this.f232734e = 0;
                return;
            }
            return;
        }
        if (i17 != 4354) {
            return;
        }
        wo.d1 d1Var = (wo.d1) message.obj;
        if (this.f232733d == 0 || this.f232734e == 0 || fp.h.a(14)) {
            c(d1Var);
            return;
        }
        float f17 = this.f232731b;
        float f18 = this.f232732c;
        int i18 = this.f232733d;
        int i19 = this.f232734e;
        if (d1Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMSightCamera", "want to auto focus, but camera is null, do nothing");
            return;
        }
        if (!di3.n.R) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMSightCamera", "auto focus not back");
            return;
        }
        di3.n.R = false;
        try {
            android.hardware.Camera camera2 = d1Var.f447652a;
            if (camera2 != null) {
                camera2.cancelAutoFocus();
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightCamera", "ashutest:: touch %f %f, display %d %d", java.lang.Float.valueOf(f17), java.lang.Float.valueOf(f18), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
            android.graphics.Rect b17 = b(f17, f18, 1.0f, i18, i19);
            android.graphics.Rect b18 = b(f17, f18, 1.5f, i18, i19);
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightCamera", "ashutest:: focus rect %s, meter rect %s", b17, b18);
            android.hardware.Camera.Parameters c17 = d1Var.c();
            java.util.List<java.lang.String> supportedFocusModes = c17.getSupportedFocusModes();
            if (supportedFocusModes != null && supportedFocusModes.contains("auto")) {
                c17.setFocusMode("auto");
            }
            if (c17.getMaxNumFocusAreas() > 0) {
                java.util.ArrayList arrayList = new java.util.ArrayList(1);
                arrayList.add(new android.hardware.Camera.Area(b17, 1000));
                c17.setFocusAreas(arrayList);
            }
            if (c17.getMaxNumMeteringAreas() > 0) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList(1);
                arrayList2.add(new android.hardware.Camera.Area(b18, 1000));
                c17.setMeteringAreas(arrayList2);
            }
            d1Var.f(c17);
            d1Var.b(this.f232735f.N);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMSightCamera", "autofocus with area fail, exception %s", e17.getMessage());
            di3.n.R = true;
        }
    }
}
