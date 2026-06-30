package zo5;

/* loaded from: classes14.dex */
public final class l extends zo5.a {
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b A[Catch: all -> 0x008c, TryCatch #0 {all -> 0x008c, blocks: (B:3:0x000e, B:5:0x0013, B:7:0x0019, B:9:0x001f, B:10:0x002f, B:12:0x0034, B:14:0x003b, B:16:0x0041, B:19:0x0049, B:20:0x0059, B:22:0x0066, B:24:0x006c, B:26:0x0072, B:27:0x0082), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049 A[Catch: all -> 0x008c, TRY_ENTER, TryCatch #0 {all -> 0x008c, blocks: (B:3:0x000e, B:5:0x0013, B:7:0x0019, B:9:0x001f, B:10:0x002f, B:12:0x0034, B:14:0x003b, B:16:0x0041, B:19:0x0049, B:20:0x0059, B:22:0x0066, B:24:0x006c, B:26:0x0072, B:27:0x0082), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066 A[Catch: all -> 0x008c, TryCatch #0 {all -> 0x008c, blocks: (B:3:0x000e, B:5:0x0013, B:7:0x0019, B:9:0x001f, B:10:0x002f, B:12:0x0034, B:14:0x003b, B:16:0x0041, B:19:0x0049, B:20:0x0059, B:22:0x0066, B:24:0x006c, B:26:0x0072, B:27:0x0082), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072 A[Catch: all -> 0x008c, TryCatch #0 {all -> 0x008c, blocks: (B:3:0x000e, B:5:0x0013, B:7:0x0019, B:9:0x001f, B:10:0x002f, B:12:0x0034, B:14:0x003b, B:16:0x0041, B:19:0x0049, B:20:0x0059, B:22:0x0066, B:24:0x006c, B:26:0x0072, B:27:0x0082), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f A[Catch: all -> 0x008c, TryCatch #0 {all -> 0x008c, blocks: (B:3:0x000e, B:5:0x0013, B:7:0x0019, B:9:0x001f, B:10:0x002f, B:12:0x0034, B:14:0x003b, B:16:0x0041, B:19:0x0049, B:20:0x0059, B:22:0x0066, B:24:0x006c, B:26:0x0072, B:27:0x0082), top: B:2:0x000e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.nio.ByteBuffer r16, cp5.e r17, zo5.e r18) {
        /*
            r15 = this;
            r0 = r16
            r10 = r17
            r11 = r18
            r16.clear()
            java.util.concurrent.locks.ReentrantLock r12 = r10.f221138e
            r12.lock()
            boolean r1 = r10.f221137d     // Catch: java.lang.Throwable -> L8c
            r13 = 0
            if (r1 == 0) goto L1c
            cp5.f r1 = r10.f221134a     // Catch: java.lang.Throwable -> L8c
            boolean r2 = r1.f221140b     // Catch: java.lang.Throwable -> L8c
            if (r2 == 0) goto L1c
            dp5.f r1 = r1.f221139a     // Catch: java.lang.Throwable -> L8c
            goto L1d
        L1c:
            r1 = r13
        L1d:
            if (r1 == 0) goto L2f
            int r2 = r11.f474880a     // Catch: java.lang.Throwable -> L8c
            int r3 = r11.f474881b     // Catch: java.lang.Throwable -> L8c
            r4 = 6409(0x1909, float:8.981E-42)
            r6 = 0
            r7 = 0
            r8 = 48
            r9 = 0
            r5 = r16
            dp5.f.n(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L8c
        L2f:
            int r1 = r11.f474880a     // Catch: java.lang.Throwable -> L8c
            int r14 = r11.f474881b
            int r1 = r1 * r14
            r0.position(r1)     // Catch: java.lang.Throwable -> L8c
            boolean r1 = r10.f221137d     // Catch: java.lang.Throwable -> L8c
            if (r1 == 0) goto L44
            cp5.f r1 = r10.f221135b     // Catch: java.lang.Throwable -> L8c
            boolean r2 = r1.f221140b     // Catch: java.lang.Throwable -> L8c
            if (r2 == 0) goto L44
            dp5.f r1 = r1.f221139a     // Catch: java.lang.Throwable -> L8c
            goto L45
        L44:
            r1 = r13
        L45:
            int r11 = r11.f474880a
            if (r1 == 0) goto L59
            int r2 = r11 / 2
            int r3 = r14 / 2
            r4 = 6409(0x1909, float:8.981E-42)
            r6 = 0
            r7 = 0
            r8 = 48
            r9 = 0
            r5 = r16
            dp5.f.n(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L8c
        L59:
            int r1 = r11 * r14
            int r1 = r1 * 5
            int r1 = r1 / 4
            r0.position(r1)     // Catch: java.lang.Throwable -> L8c
            boolean r1 = r10.f221137d     // Catch: java.lang.Throwable -> L8c
            if (r1 == 0) goto L6f
            cp5.f r1 = r10.f221136c     // Catch: java.lang.Throwable -> L8c
            boolean r2 = r1.f221140b     // Catch: java.lang.Throwable -> L8c
            if (r2 == 0) goto L6f
            dp5.f r1 = r1.f221139a     // Catch: java.lang.Throwable -> L8c
            goto L70
        L6f:
            r1 = r13
        L70:
            if (r1 == 0) goto L82
            int r2 = r11 / 2
            int r3 = r14 / 2
            r4 = 6409(0x1909, float:8.981E-42)
            r6 = 0
            r7 = 0
            r8 = 48
            r9 = 0
            r5 = r16
            dp5.f.n(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L8c
        L82:
            r16.clear()     // Catch: java.lang.Throwable -> L8c
            android.opengl.GLES20.glFinish()     // Catch: java.lang.Throwable -> L8c
            r12.unlock()
            return
        L8c:
            r0 = move-exception
            r12.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: zo5.l.a(java.nio.ByteBuffer, cp5.e, zo5.e):void");
    }
}
