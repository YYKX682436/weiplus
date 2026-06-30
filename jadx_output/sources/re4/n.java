package re4;

/* loaded from: classes9.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static int f394543a = -1;

    /* renamed from: b, reason: collision with root package name */
    public static int f394544b = -1;

    public static void a(int i17, int i18) {
        java.lang.Throwable th6 = new java.lang.Throwable();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.String c17 = com.tencent.mm.sdk.platformtools.z3.c(th6);
        com.tencent.mars.xlog.Log.i("MicroMsg.FingerpirntReporter", "soter cLog report, sceneType: %d, detailScene: %d, content: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), c17);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("sceneType", java.lang.String.valueOf(i17));
        hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, java.lang.String.valueOf(i18));
        com.tencent.mm.plugin.report.service.g0.INSTANCE.i("Soter", "Fingerprint pay add authentication task failed: " + c17, hashMap);
    }

    public static void b() {
        f394544b = (int) (java.lang.System.currentTimeMillis() / 1000);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001d, code lost:
    
        if (r11 != 1004) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(int r10, int r11, long r12) {
        /*
            r0 = -3
            r1 = 1
            r2 = -1
            if (r11 == r0) goto L44
            r0 = -2
            if (r11 == r0) goto L3f
            r0 = 4
            if (r11 == r0) goto L34
            r1 = 6
            r3 = 3
            if (r11 == r1) goto L32
            r1 = 1001(0x3e9, float:1.403E-42)
            if (r11 == r1) goto L30
            r1 = 1023(0x3ff, float:1.434E-42)
            if (r11 == r1) goto L2c
            r10 = 1003(0x3eb, float:1.406E-42)
            if (r11 == r10) goto L20
            r10 = 1004(0x3ec, float:1.407E-42)
            if (r11 == r10) goto L4a
            goto L49
        L20:
            wo.u1 r10 = wo.v1.f447828h
            boolean r10 = r10.f447810a
            if (r10 == 0) goto L29
            r0 = 9
            goto L4a
        L29:
            r0 = 10
            goto L4a
        L2c:
            if (r10 != r3) goto L49
            r0 = 0
            goto L4a
        L30:
            r0 = 5
            goto L4a
        L32:
            r0 = r3
            goto L4a
        L34:
            wo.u1 r10 = wo.v1.f447828h
            boolean r10 = r10.f447810a
            if (r10 == 0) goto L3c
            r0 = 7
            goto L4a
        L3c:
            r0 = 8
            goto L4a
        L3f:
            if (r10 != r1) goto L49
            r0 = 11
            goto L4a
        L44:
            if (r10 != r1) goto L49
            r0 = 12
            goto L4a
        L49:
            r0 = r2
        L4a:
            if (r0 == r2) goto L70
            r10 = 672(0x2a0, float:9.42E-43)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
            java.lang.Long r1 = java.lang.Long.valueOf(r12)
            java.lang.Object[] r10 = new java.lang.Object[]{r10, r11, r1}
            java.lang.String r11 = "MicroMsg.FingerpirntReporter"
            java.lang.String r1 = "soter idkey report id: %d, key: %d, value: %d"
            com.tencent.mars.xlog.Log.i(r11, r1, r10)
            com.tencent.mm.plugin.report.service.g0 r2 = com.tencent.mm.plugin.report.service.g0.INSTANCE
            r3 = 672(0x2a0, double:3.32E-321)
            long r5 = (long) r0
            r9 = 0
            r7 = r12
            r2.idkeyStat(r3, r5, r7, r9)
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: re4.n.c(int, int, long):void");
    }

    public static void d(int i17) {
        if (f394544b == -1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FingerpirntReporter", "hy: no current pay session");
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16995, java.lang.Integer.valueOf(f394544b), java.lang.Integer.valueOf(i17));
            f394544b = -1;
        }
    }

    public static void e(int i17, int i18, int i19, java.lang.String str) {
        if (f394543a == -1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FingerpirntReporter", "hy: current open scene not set");
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16992, java.lang.Integer.valueOf(f394543a), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        }
    }

    public static void f(int i17) {
        if (f394544b == -1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FingerpirntReporter", "hy: no current pay session");
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12927, java.lang.Integer.valueOf(f394544b), java.lang.Integer.valueOf(i17));
            f394544b = -1;
        }
    }

    public static void g(int i17, int i18, int i19, java.lang.String str) {
        if (f394543a == -1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FingerpirntReporter", "hy: current open scene not set");
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13413, java.lang.Integer.valueOf(f394543a), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
            f394543a = -1;
        }
    }

    public static void h() {
        if (f394543a == -1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FingerpirntReporter", "hy: current open scene not set");
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12926, java.lang.Integer.valueOf(f394543a));
        }
    }

    public static void i(int i17, int i18) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14381, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    public static void j() {
        if (f394543a == -1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FingerpirntReporter", "hy: current open scene not set");
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12925, java.lang.Integer.valueOf(f394543a));
        }
    }

    public static void k() {
        ((ku5.t0) ku5.t0.f312615d).g(new re4.m());
    }
}
