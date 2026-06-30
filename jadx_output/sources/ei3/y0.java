package ei3;

/* loaded from: classes10.dex */
public class y0 {

    /* renamed from: d, reason: collision with root package name */
    public final int f253194d;

    /* renamed from: e, reason: collision with root package name */
    public final int f253195e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f253196f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f253197g;

    /* renamed from: h, reason: collision with root package name */
    public final int f253198h;

    /* renamed from: a, reason: collision with root package name */
    public int f253191a = -1;

    /* renamed from: b, reason: collision with root package name */
    public volatile int f253192b = 0;

    /* renamed from: c, reason: collision with root package name */
    public long f253193c = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f253199i = -1;

    public y0(boolean z17, int i17, int i18, int i19, boolean z18) {
        this.f253198h = -1;
        this.f253196f = z17;
        this.f253198h = i17;
        this.f253194d = i18;
        this.f253195e = i19;
        this.f253197g = z18;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightX264YUVRecorder", "create MMSightX264YUVRecorder, needRotateEachFrame: %s, initRotate: %s, targetWidth: %s, targetHeight: %s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
    }

    public long a() {
        if (0 != this.f253193c) {
            return java.lang.System.currentTimeMillis() - this.f253193c;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.MMSightX264YUVRecorder", "do not start record");
        return 0L;
    }

    public void b() {
        synchronized (ei3.y0.class) {
            this.f253192b = 0;
        }
        this.f253193c = 0L;
    }

    public void c(byte[] bArr, int i17, int i18, int i19) {
        boolean z17;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        android.os.SystemClock.elapsedRealtime();
        if (this.f253191a < 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMSightX264YUVRecorder", "write data error, yuv buffer id error");
            return;
        }
        synchronized (ei3.y0.class) {
            this.f253192b++;
        }
        int i27 = this.f253198h;
        boolean z19 = this.f253196f;
        if (z19) {
            int i28 = this.f253199i;
            if (i28 != -1) {
                i27 = i28;
            }
            z17 = z19;
        } else {
            int i29 = this.f253199i;
            if (i29 == -1 || i29 == i27) {
                z17 = false;
            } else {
                i27 = java.lang.Math.max(0, i27 <= 180 ? i29 - i27 : i29 + (360 - i27));
                z17 = true;
                if (i27 >= 360) {
                    i27 = 0;
                }
            }
        }
        com.tencent.mm.plugin.sight.base.SightVideoJNI.setRotateForBufId(this.f253191a, i27);
        int i37 = (!z17 ? !(i27 == 0 || i27 == 180) : i27 == 0 || i27 == 180) ? this.f253195e : this.f253194d;
        int i38 = (!z17 ? !(i27 == 0 || i27 == 180) : i27 == 0 || i27 == 180) ? this.f253194d : this.f253195e;
        int i39 = (!z17 ? !(i27 == 0 || i27 == 180) : i27 == 0 || i27 == 180) ? i19 : i18;
        int i47 = (!z17 ? !(i27 == 0 || i27 == 180) : i27 == 0 || i27 == 180) ? i18 : i19;
        boolean z27 = (i39 == i37 && i47 == i38) ? false : true;
        if (this.f253197g) {
            com.tencent.mm.plugin.sight.base.SightVideoJNI.mirrorCameraData(bArr, i39, i47, true);
        }
        com.tencent.mm.plugin.sight.base.SightVideoJNI.writeYuvDataForMMSight(this.f253191a, bArr, i17, i37, i38, z17, z27, i39, i47);
        android.os.SystemClock.elapsedRealtime();
    }
}
