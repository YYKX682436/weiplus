package vr0;

/* loaded from: classes14.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public androidx.camera.core.Camera f439441a;

    /* renamed from: b, reason: collision with root package name */
    public int f439442b;

    /* renamed from: c, reason: collision with root package name */
    public android.util.Range f439443c;

    /* renamed from: d, reason: collision with root package name */
    public int f439444d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f439445e = true;

    /* renamed from: f, reason: collision with root package name */
    public int f439446f;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r5.f456152c == true) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(androidx.camera.core.Camera r4, xr0.b r5, int r6) {
        /*
            r3 = this;
            r0 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            if (r5 == 0) goto Ld
            r2 = 1
            boolean r5 = r5.f456152c
            if (r5 != r2) goto Ld
            goto Le
        Ld:
            r2 = r0
        Le:
            java.lang.String r5 = "MicroMsg.CameraXExpoHelper"
            if (r2 != 0) goto L18
            java.lang.String r4 = "no support to adjust expo"
            com.tencent.mars.xlog.Log.i(r5, r4)
            return
        L18:
            r3.f439441a = r4
            r3.f439446f = r6
            if (r4 == 0) goto L30
            androidx.camera.core.CameraInfo r4 = r4.getCameraInfo()
            if (r4 == 0) goto L30
            androidx.camera.core.ExposureState r4 = r4.getExposureState()
            if (r4 == 0) goto L30
            android.util.Range r4 = r4.getExposureCompensationRange()
            if (r4 != 0) goto L35
        L30:
            android.util.Range r4 = new android.util.Range
            r4.<init>(r1, r1)
        L35:
            r3.f439443c = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "from camera expoRange >> "
            r4.<init>(r6)
            android.util.Range r6 = r3.f439443c
            r1 = 0
            if (r6 == 0) goto L48
            java.lang.String r6 = r6.toString()
            goto L49
        L48:
            r6 = r1
        L49:
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            com.tencent.mars.xlog.Log.i(r5, r4)
            android.util.Range r4 = r3.f439443c
            if (r4 == 0) goto L68
            r6 = -24
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r2 = 24
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            android.util.Range r4 = r4.intersect(r6, r2)
            goto L69
        L68:
            r4 = r1
        L69:
            r3.f439443c = r4
            androidx.camera.core.Camera r4 = r3.f439441a
            if (r4 == 0) goto L80
            androidx.camera.core.CameraInfo r4 = r4.getCameraInfo()
            if (r4 == 0) goto L80
            androidx.camera.core.ExposureState r4 = r4.getExposureState()
            if (r4 == 0) goto L80
            int r4 = r4.getExposureCompensationIndex()
            goto L81
        L80:
            r4 = r0
        L81:
            r3.f439442b = r4
            boolean r6 = r3.f439445e
            if (r6 != 0) goto L90
            java.lang.String r4 = "goto check is reset"
            com.tencent.mars.xlog.Log.i(r5, r4)
            r3.b()
            goto L92
        L90:
            r3.f439444d = r4
        L92:
            r3.f439445e = r0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "bindCameraRes >> expoRange: "
            r4.<init>(r6)
            android.util.Range r6 = r3.f439443c
            if (r6 == 0) goto La3
            java.lang.String r1 = r6.toString()
        La3:
            r4.append(r1)
            java.lang.String r6 = ", "
            r4.append(r6)
            int r6 = r3.f439442b
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            com.tencent.mars.xlog.Log.i(r5, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vr0.a.a(androidx.camera.core.Camera, xr0.b, int):void");
    }

    public final void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CameraXExpoHelper", "resetExpo >> " + this.f439444d + ", " + this.f439442b);
        int i17 = this.f439442b;
        int i18 = this.f439444d;
        if (i17 != i18) {
            c(i18);
            this.f439442b = this.f439444d;
        }
    }

    public final void c(int i17) {
        androidx.camera.core.CameraControl cameraControl;
        com.tencent.mars.xlog.Log.i("MicroMsg.CameraXExpoHelper", "setExpoDuration >> " + i17);
        try {
            androidx.camera.core.Camera camera = this.f439441a;
            if (camera != null && (cameraControl = camera.getCameraControl()) != null) {
                cameraControl.setExposureCompensationIndex(i17);
            }
            com.tencent.mm.autogen.mmdata.rpt.CameraReportStruct a17 = as0.a.f13425a.a(this.f439446f);
            if (a17 != null) {
                a17.Z = 1;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CameraXExpoHelper", "enlargeExpo is error >> " + e17.getMessage() + ", " + i17);
            com.tencent.mm.autogen.mmdata.rpt.CameraReportStruct a18 = as0.a.f13425a.a(this.f439446f);
            if (a18 != null) {
                a18.Z = 2;
            }
        }
    }
}
