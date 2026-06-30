package tb1;

/* loaded from: classes7.dex */
public class e implements com.tencent.mm.plugin.appbrand.utils.g4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView f416894a;

    public e(com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView appBrandCameraView) {
        this.f416894a = appBrandCameraView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        if (r0.getRequestedOrientation() != 1) goto L15;
     */
    @Override // com.tencent.mm.plugin.appbrand.utils.g4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(com.tencent.mm.plugin.appbrand.utils.f4 r5, com.tencent.mm.plugin.appbrand.utils.f4 r6) {
        /*
            r4 = this;
            int r5 = com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView.f80166x0
            com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView r5 = r4.f416894a
            android.content.Context r0 = r5.getContext()
            android.content.ContentResolver r0 = r0.getContentResolver()
            java.lang.String r1 = "accelerometer_rotation"
            r2 = 0
            int r0 = android.provider.Settings.System.getInt(r0, r1, r2)
            r1 = 1
            if (r0 != 0) goto L18
            r0 = r1
            goto L19
        L18:
            r0 = r2
        L19:
            if (r0 == 0) goto L34
            android.content.Context r0 = r5.f80168d
            boolean r3 = r0 instanceof android.app.Activity
            if (r3 != 0) goto L22
            goto L30
        L22:
            android.app.Activity r0 = (android.app.Activity) r0
            int r3 = r0.getRequestedOrientation()
            if (r3 == 0) goto L30
            int r0 = r0.getRequestedOrientation()
            if (r0 != r1) goto L31
        L30:
            r2 = r1
        L31:
            if (r2 == 0) goto L34
            return
        L34:
            com.tencent.mm.plugin.appbrand.utils.f4 r0 = com.tencent.mm.plugin.appbrand.utils.f4.LANDSCAPE
            com.tencent.mm.plugin.appbrand.utils.f4 r1 = com.tencent.mm.plugin.appbrand.utils.f4.REVERSE_LANDSCAPE
            if (r6 != r0) goto L43
            com.tencent.mm.plugin.appbrand.utils.f4 r2 = r5.U
            if (r2 != r1) goto L43
            r5.U = r6
            com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView.d(r5)
        L43:
            if (r6 != r1) goto L4e
            com.tencent.mm.plugin.appbrand.utils.f4 r1 = r5.U
            if (r1 != r0) goto L4e
            r5.U = r6
            com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView.d(r5)
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb1.e.a(com.tencent.mm.plugin.appbrand.utils.f4, com.tencent.mm.plugin.appbrand.utils.f4):void");
    }
}
