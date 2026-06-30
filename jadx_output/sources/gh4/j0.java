package gh4;

/* loaded from: classes8.dex */
public abstract class j0 {

    /* renamed from: a, reason: collision with root package name */
    public static final o11.g f271933a;

    /* renamed from: b, reason: collision with root package name */
    public static final o11.g f271934b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f271935c;

    static {
        o11.f fVar = new o11.f();
        fVar.f342087k = 512;
        fVar.f342086j = 512;
        fVar.f342085i = 5;
        fVar.f342078b = true;
        fVar.f342077a = true;
        f271933a = fVar.a();
        o11.f fVar2 = new o11.f();
        fVar2.f342087k = 512;
        fVar2.f342086j = 512;
        fVar2.f342085i = 1;
        fVar2.f342077a = true;
        f271934b = fVar2.a();
        f271935c = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a() {
        /*
            android.content.SharedPreferences r0 = com.tencent.mm.sdk.platformtools.x2.d()
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.String r1 = "enable_dynamic_background_for_test"
            r2 = 0
            boolean r1 = r0.getBoolean(r1, r2)
            java.lang.String r3 = "MicroMsg.TaskBarConfig"
            r4 = 1
            if (r1 == 0) goto L2a
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "initEnableNativeDynamicBackground enableForTest: %b"
            com.tencent.mars.xlog.Log.i(r3, r1, r0)
            gh4.j0.f271935c = r4
            c(r4)
            jh4.e.d()
            return
        L2a:
            boolean r1 = wo.w0.q()
            if (r1 == 0) goto L46
            java.lang.String r1 = "enable_dynamic_background"
            boolean r1 = r0.getBoolean(r1, r4)
            gh4.j0.f271935c = r1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r5 = "dynamicbg enable state: %b"
            com.tencent.mars.xlog.Log.i(r3, r5, r1)
            goto L48
        L46:
            gh4.j0.f271935c = r2
        L48:
            android.content.SharedPreferences r1 = jh4.e.f299853a
            if (r1 == 0) goto L82
            java.lang.String r5 = "dynamic_bg_init_start_point_count"
            int r1 = r1.getInt(r5, r2)
            android.content.SharedPreferences r5 = jh4.e.f299853a
            java.lang.String r6 = "dynamic_bg_draw_start_point_count"
            int r5 = r5.getInt(r6, r2)
            android.content.SharedPreferences r6 = jh4.e.f299853a
            java.lang.String r7 = "dynamic_bg_init_crash"
            boolean r6 = r6.getBoolean(r7, r2)
            jh4.e.f299855c = r6
            if (r6 != 0) goto L6f
            r6 = 2
            if (r1 >= r6) goto L6f
            if (r5 < r6) goto L6c
            goto L6f
        L6c:
            jh4.e.f299854b = r2
            goto L82
        L6f:
            jh4.e.f299854b = r4
            android.content.SharedPreferences r1 = jh4.e.f299853a
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r5 = "dynamic_bg_will_crash"
            android.content.SharedPreferences$Editor r1 = r1.putBoolean(r5, r4)
            r1.apply()
            r1 = r4
            goto L83
        L82:
            r1 = r2
        L83:
            if (r1 == 0) goto Lcc
            r5 = -1
            java.lang.String r6 = "dynamic_background_version"
            int r5 = r0.getInt(r6, r5)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r7 = new java.lang.Object[]{r7, r8}
            java.lang.String r8 = "localVersion %d, currentVersion: %d"
            com.tencent.mars.xlog.Log.i(r3, r8, r7)
            if (r5 == r4) goto Lc4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r5}
            java.lang.String r5 = "ignore crash because of new version"
            com.tencent.mars.xlog.Log.i(r3, r5, r1)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = r0.putInt(r6, r4)
            r0.apply()
            jh4.e.d()
            c(r4)
            goto Lcd
        Lc4:
            java.lang.String r0 = "disable dynamicBackground because of crash"
            com.tencent.mars.xlog.Log.i(r3, r0)
            c(r2)
        Lcc:
            r2 = r1
        Lcd:
            boolean r0 = gh4.j0.f271935c
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            java.lang.String r1 = "AppBrandDesktopConfig initEnableNativeDynamicBackground: %b, willCrash: %b"
            com.tencent.mars.xlog.Log.i(r3, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gh4.j0.a():void");
    }

    public static boolean b() {
        java.lang.Thread.currentThread().getId();
        return f271935c;
    }

    public static void c(boolean z17) {
        android.content.SharedPreferences d17;
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarConfig", "setEnableNativeDynamicBackground enable: %b", java.lang.Boolean.valueOf(z17));
        if (f271935c != z17 && (d17 = com.tencent.mm.sdk.platformtools.x2.d()) != null) {
            d17.edit().putBoolean("enable_dynamic_background", z17).apply();
        }
        f271935c = z17;
    }
}
