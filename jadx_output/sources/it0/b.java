package it0;

/* loaded from: classes10.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final it0.b f294485d = new it0.b();

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17;
        try {
            int[] iArr = it0.c.f294486a;
            int c17 = wo.i.c();
            it0.c.f294487b = c17;
            boolean z18 = false;
            int i17 = 0;
            while (true) {
                if (i17 >= c17) {
                    z17 = false;
                    break;
                }
                android.hardware.Camera.CameraInfo cameraInfo = new android.hardware.Camera.CameraInfo();
                android.hardware.Camera.getCameraInfo(i17, cameraInfo);
                if (cameraInfo.facing == 1) {
                    z17 = true;
                    break;
                }
                i17++;
            }
            it0.c.f294488c = z17;
            int[] iArr2 = it0.c.f294486a;
            int i18 = it0.c.f294487b;
            int i19 = 0;
            while (true) {
                if (i19 >= i18) {
                    break;
                }
                android.hardware.Camera.CameraInfo cameraInfo2 = new android.hardware.Camera.CameraInfo();
                android.hardware.Camera.getCameraInfo(i19, cameraInfo2);
                if (cameraInfo2.facing == 0) {
                    z18 = true;
                    break;
                }
                i19++;
            }
            it0.c.f294489d = z18;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append("cameraNum : ");
            int[] iArr3 = it0.c.f294486a;
            sb6.append(it0.c.f294487b);
            sb6.append(" hasFrontCamera:");
            sb6.append(it0.c.f294488c);
            sb6.append(" hasBackCamera:");
            sb6.append(it0.c.f294489d);
            com.tencent.mars.xlog.Log.i("MicroMsg.CameraHelper", sb6.toString());
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CameraHelper", "happen sth. error");
        }
    }
}
