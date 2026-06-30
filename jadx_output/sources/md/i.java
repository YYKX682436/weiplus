package md;

/* loaded from: classes15.dex */
public class i extends android.view.OrientationEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f325695a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(md.j jVar, android.content.Context context, int i17, java.lang.ref.WeakReference weakReference) {
        super(context, i17);
        this.f325695a = weakReference;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0099, code lost:
    
        if (r9 < 330) goto L49;
     */
    @Override // android.view.OrientationEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onOrientationChanged(int r9) {
        /*
            r8 = this;
            java.lang.ref.WeakReference r0 = r8.f325695a
            java.lang.Object r0 = r0.get()
            md.j r0 = (md.j) r0
            if (r0 == 0) goto Lac
            r1 = -1
            if (r9 != r1) goto Lf
            goto Lac
        Lf:
            java.lang.String r1 = "WxaLiteApp.DeviceOrientationListener"
            r2 = 0
            if (r9 < 0) goto La5
            r3 = 360(0x168, float:5.04E-43)
            if (r9 <= r3) goto L1a
            goto La5
        L1a:
            java.lang.ref.WeakReference r3 = r0.f325699d
            java.lang.Object r3 = r3.get()
            android.content.Context r3 = (android.content.Context) r3
            if (r3 == 0) goto L43
            android.content.ContentResolver r3 = r3.getContentResolver()
            java.lang.String r4 = "accelerometer_rotation"
            int r3 = android.provider.Settings.System.getInt(r3, r4, r2)
            int r4 = r0.f325698c
            if (r4 == r3) goto L37
            com.tencent.mm.plugin.lite.LiteAppCenter.updateRotationLocked(r3)
            r0.f325698c = r3
        L37:
            r4 = 1
            if (r3 == r4) goto L43
            java.lang.String r9 = "rotation locked"
            java.lang.Object[] r0 = new java.lang.Object[r2]
            kd.c.c(r1, r9, r0)
            goto Lac
        L43:
            int r1 = r0.f325697b
            int r1 = r1 - r9
            int r1 = java.lang.Math.abs(r1)
            r3 = 30
            if (r1 >= r3) goto L5b
            long r4 = java.lang.System.currentTimeMillis()
            long r6 = r0.f325696a
            long r4 = r4 - r6
            r6 = 300(0x12c, double:1.48E-321)
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 < 0) goto Lac
        L5b:
            long r4 = java.lang.System.currentTimeMillis()
            r0.f325696a = r4
            int r1 = r0.f325697b
            r4 = 330(0x14a, float:4.62E-43)
            r5 = 60
            if (r9 <= r5) goto L97
            r6 = 300(0x12c, float:4.2E-43)
            if (r9 < r6) goto L6e
            goto L97
        L6e:
            r2 = 150(0x96, float:2.1E-43)
            r7 = 120(0x78, float:1.68E-43)
            if (r9 < r3) goto L7d
            if (r9 > r2) goto L7d
            if (r9 < r5) goto L9c
            if (r9 > r7) goto L9c
            r2 = -90
            goto L9d
        L7d:
            r3 = 240(0xf0, float:3.36E-43)
            r5 = 210(0xd2, float:2.94E-43)
            if (r9 < r7) goto L8c
            if (r9 > r3) goto L8c
            if (r9 < r2) goto L9c
            if (r9 > r5) goto L9c
            r2 = 180(0xb4, float:2.52E-43)
            goto L9d
        L8c:
            if (r9 < r5) goto L9c
            if (r9 > r4) goto L9c
            if (r9 < r3) goto L9c
            if (r9 > r6) goto L9c
            r2 = 90
            goto L9d
        L97:
            if (r9 <= r3) goto L9d
            if (r9 < r4) goto L9c
            goto L9d
        L9c:
            r2 = r1
        L9d:
            if (r2 == r1) goto Lac
            com.tencent.mm.plugin.lite.LiteAppCenter.updateDeviceOrientation(r2)
            r0.f325697b = r2
            goto Lac
        La5:
            java.lang.String r9 = "orientation out of range, ignore"
            java.lang.Object[] r0 = new java.lang.Object[r2]
            kd.c.c(r1, r9, r0)
        Lac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: md.i.onOrientationChanged(int):void");
    }
}
