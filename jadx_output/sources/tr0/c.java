package tr0;

/* loaded from: classes14.dex */
public final class c implements android.hardware.Camera.AutoFocusCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tr0.d f421288d;

    public c(tr0.d dVar) {
        this.f421288d = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0016 A[Catch: Exception -> 0x0045, TryCatch #0 {Exception -> 0x0045, blocks: (B:3:0x0005, B:5:0x0009, B:7:0x000d, B:11:0x0016, B:13:0x001b, B:15:0x001f, B:17:0x0027, B:19:0x002f, B:21:0x0033, B:23:0x003c, B:28:0x0041), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    @Override // android.hardware.Camera.AutoFocusCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAutoFocus(boolean r3, android.hardware.Camera r4) {
        /*
            r2 = this;
            tr0.d r3 = r2.f421288d
            r3.getClass()
            wo.h r4 = r3.f421289e     // Catch: java.lang.Exception -> L45
            if (r4 == 0) goto L13
            wo.d1 r4 = r4.f447713a     // Catch: java.lang.Exception -> L45
            if (r4 == 0) goto L13
            boolean r4 = r4.f447654c     // Catch: java.lang.Exception -> L45
            r0 = 1
            if (r4 != r0) goto L13
            goto L14
        L13:
            r0 = 0
        L14:
            if (r0 != 0) goto L4c
            wo.h r4 = r3.f421289e     // Catch: java.lang.Exception -> L45
            r0 = 0
            if (r4 == 0) goto L24
            wo.d1 r4 = r4.f447713a     // Catch: java.lang.Exception -> L45
            if (r4 == 0) goto L24
            android.hardware.Camera$Parameters r4 = r4.c()     // Catch: java.lang.Exception -> L45
            goto L25
        L24:
            r4 = r0
        L25:
            if (r4 == 0) goto L2c
            java.lang.String r1 = r4.getFocusMode()     // Catch: java.lang.Exception -> L45
            goto L2d
        L2c:
            r1 = r0
        L2d:
            if (r1 == 0) goto L4c
            java.lang.String r1 = r3.f421290f     // Catch: java.lang.Exception -> L45
            if (r1 == 0) goto L4c
            r4.setFocusMode(r1)     // Catch: java.lang.Exception -> L45
            r3.f421290f = r0     // Catch: java.lang.Exception -> L45
            wo.h r3 = r3.f421289e     // Catch: java.lang.Exception -> L45
            if (r3 == 0) goto L3e
            wo.d1 r0 = r3.f447713a     // Catch: java.lang.Exception -> L45
        L3e:
            if (r0 != 0) goto L41
            goto L4c
        L41:
            r0.f(r4)     // Catch: java.lang.Exception -> L45
            goto L4c
        L45:
            java.lang.String r3 = "MicroMsg.Camera.Camera1FocusHelper"
            java.lang.String r4 = "auto focus return while camera is release"
            com.tencent.mars.xlog.Log.e(r3, r4)
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tr0.c.onAutoFocus(boolean, android.hardware.Camera):void");
    }
}
