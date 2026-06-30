package u75;

/* loaded from: classes12.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.Boolean f425182a;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.Boolean f425183b;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.Boolean f425184c;

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.Boolean f425185d;

    /* JADX WARN: Removed duplicated region for block: B:32:0x007a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(java.lang.String r8) {
        /*
            java.lang.String r0 = "Exception while closing InputStream : %s"
            java.lang.String r1 = "Vendor.MIUI"
            java.lang.String r2 = "getprop "
            r3 = 0
            java.lang.Runtime r4 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            r5.append(r8)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            java.lang.Process r2 = r4.exec(r2)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            if (r2 != 0) goto L23
            java.lang.String r2 = "get process null"
            com.tencent.mars.xlog.Log.i(r1, r2)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            return r3
        L23:
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            java.io.InputStream r2 = r2.getInputStream()     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            r2 = 1024(0x400, float:1.435E-42)
            r4.<init>(r5, r2)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            java.lang.String r2 = r4.readLine()     // Catch: java.lang.Exception -> L4b java.lang.Throwable -> L76
            r4.close()     // Catch: java.lang.Exception -> L4b java.lang.Throwable -> L76
            r4.close()     // Catch: java.io.IOException -> L3e
            goto L4a
        L3e:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            com.tencent.mars.xlog.Log.i(r1, r0, r8)
        L4a:
            return r2
        L4b:
            r2 = move-exception
            goto L51
        L4d:
            r8 = move-exception
            goto L78
        L4f:
            r2 = move-exception
            r4 = r3
        L51:
            java.lang.String r5 = "Unable to read sysprop %s Exception:%s"
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L76
            r7 = 0
            r6[r7] = r8     // Catch: java.lang.Throwable -> L76
            java.lang.String r8 = r2.getMessage()     // Catch: java.lang.Throwable -> L76
            r2 = 1
            r6[r2] = r8     // Catch: java.lang.Throwable -> L76
            com.tencent.mars.xlog.Log.i(r1, r5, r6)     // Catch: java.lang.Throwable -> L76
            if (r4 == 0) goto L75
            r4.close()     // Catch: java.io.IOException -> L69
            goto L75
        L69:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            com.tencent.mars.xlog.Log.i(r1, r0, r8)
        L75:
            return r3
        L76:
            r8 = move-exception
            r3 = r4
        L78:
            if (r3 == 0) goto L8a
            r3.close()     // Catch: java.io.IOException -> L7e
            goto L8a
        L7e:
            r2 = move-exception
            java.lang.String r2 = r2.getMessage()
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            com.tencent.mars.xlog.Log.i(r1, r0, r2)
        L8a:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: u75.d.a(java.lang.String):java.lang.String");
    }

    public static boolean b(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (i17 < java.lang.Integer.parseInt(str)) {
            return false;
        }
        if (com.tencent.mm.sdk.platformtools.t8.D0(str2, "")) {
            if (c()) {
                if (!(com.tencent.mm.sdk.platformtools.t8.K0(str3) || java.lang.Long.valueOf(a("ro.miui.version.code_time")).longValue() < java.lang.Long.valueOf(str3).longValue())) {
                    return false;
                }
            }
        } else if (i17 > java.lang.Integer.parseInt(str2)) {
            return false;
        }
        return true;
    }

    public static boolean c() {
        if (f425184c == null) {
            java.lang.String str = android.os.Build.MANUFACTURER;
            com.tencent.mars.xlog.Log.i("Vendor.MIUI", "Build.MANUFACTURER = %s", str);
            if (android.text.TextUtils.isEmpty(str) || !str.equalsIgnoreCase("Xiaomi")) {
                f425184c = java.lang.Boolean.FALSE;
            } else {
                f425184c = java.lang.Boolean.TRUE;
            }
        }
        return f425184c.booleanValue();
    }

    public static boolean d() {
        if (f425185d == null) {
            java.lang.String str = android.os.Build.MANUFACTURER;
            com.tencent.mars.xlog.Log.i("Vendor.MIUI", "Build.MANUFACTURER = %s, Build.MODEL ", str);
            if (android.text.TextUtils.isEmpty(str) || !str.equals("Xiaomi")) {
                f425185d = java.lang.Boolean.FALSE;
            } else {
                java.lang.String a17 = a("ro.miui.version.code_time");
                com.tencent.mars.xlog.Log.w("Vendor.MIUI", "ifNotificationChannelSupportNativeActionJump() versionCode:%s", a17);
                if (java.lang.Long.valueOf(a17).longValue() > java.lang.Long.valueOf("1536681600").longValue()) {
                    f425185d = java.lang.Boolean.TRUE;
                } else {
                    f425185d = java.lang.Boolean.FALSE;
                }
            }
        }
        com.tencent.mars.xlog.Log.i("Vendor.MIUI", "ifNotificationChannelSupportNativeActionJump() ifNotificationChannelSupportNativeActionJump:%s", java.lang.Boolean.valueOf(f425185d.booleanValue()));
        return f425185d.booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
    
        if (r0 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x003d, code lost:
    
        if (r0 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003f, code lost:
    
        r0.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean e() {
        /*
            java.lang.Boolean r0 = u75.d.f425182a
            if (r0 != 0) goto L5e
            r0 = 0
            java.io.File r1 = android.os.Environment.getRootDirectory()     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L45
            java.lang.String r2 = "build.prop"
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L45
            r3.<init>(r1, r2)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L45
            com.tencent.mm.vfs.z7 r1 = new com.tencent.mm.vfs.z7     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L45
            r5 = 0
            r6 = 0
            java.lang.String r7 = r3.getPath()     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L45
            r8 = 0
            r9 = 0
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L45
            com.tencent.mm.vfs.b3 r2 = com.tencent.mm.vfs.a3.f212781a     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L45
            com.tencent.mm.vfs.z2 r2 = r2.m(r1, r0)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L45
            java.io.InputStream r0 = com.tencent.mm.vfs.w6.D(r1, r2)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L45
            java.util.Properties r1 = new java.util.Properties     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L45
            r1.<init>()     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L45
            r1.load(r0)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L45
            java.lang.String r2 = "ro.miui.ui.version.name"
            boolean r1 = r1.containsKey(r2)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L45
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L45
            u75.d.f425182a = r1     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L45
            if (r0 == 0) goto L5e
        L3f:
            r0.close()     // Catch: java.lang.Exception -> L5e
            goto L5e
        L43:
            r1 = move-exception
            goto L58
        L45:
            r1 = move-exception
            java.lang.String r2 = "Vendor.MIUI"
            java.lang.String r3 = "e = %s, ** failed to fetch miui prop, assume we are not on miui. **"
            java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch: java.lang.Throwable -> L43
            com.tencent.mars.xlog.Log.e(r2, r3, r1)     // Catch: java.lang.Throwable -> L43
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L43
            u75.d.f425182a = r1     // Catch: java.lang.Throwable -> L43
            if (r0 == 0) goto L5e
            goto L3f
        L58:
            if (r0 == 0) goto L5d
            r0.close()     // Catch: java.lang.Exception -> L5d
        L5d:
            throw r1
        L5e:
            java.lang.Boolean r0 = u75.d.f425182a
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u75.d.e():boolean");
    }

    public static boolean f() {
        if (f425183b == null) {
            java.lang.String str = android.os.Build.MANUFACTURER;
            com.tencent.mars.xlog.Log.i("Vendor.MIUI", "Build.MANUFACTURER = %s", str);
            if (android.text.TextUtils.isEmpty(str) || !str.equalsIgnoreCase("Xiaomi")) {
                f425183b = java.lang.Boolean.FALSE;
            } else if (com.tencent.mm.sdk.platformtools.t8.D0(wo.w1.a("ro.miui.ui.version.code"), "8")) {
                f425183b = java.lang.Boolean.TRUE;
            } else {
                f425183b = java.lang.Boolean.FALSE;
            }
        }
        return f425183b.booleanValue();
    }

    public static boolean g() {
        return false;
    }

    public static boolean h() {
        java.lang.String str = android.os.Build.BRAND;
        return !com.tencent.mm.sdk.platformtools.t8.K0(str) && str.toLowerCase().contains("xiaomi");
    }
}
