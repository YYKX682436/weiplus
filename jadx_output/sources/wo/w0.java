package wo;

/* loaded from: classes12.dex */
public abstract class w0 {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f447839a;

    /* renamed from: b, reason: collision with root package name */
    public static final wo.r0 f447840b = new wo.h0(new wo.g0("a", 5));

    /* renamed from: c, reason: collision with root package name */
    public static final wo.r0 f447841c = new wo.i0(new wo.u0("c", 5));

    /* renamed from: d, reason: collision with root package name */
    public static final wo.r0 f447842d = new wo.j0(new wo.u0("d", 5));

    /* renamed from: e, reason: collision with root package name */
    public static final wo.r0 f447843e = new wo.k0(new wo.u0("e", 5));

    /* renamed from: f, reason: collision with root package name */
    public static final wo.r0 f447844f = new wo.m0(new wo.l0("f", 5));

    /* renamed from: g, reason: collision with root package name */
    public static final wo.r0 f447845g = new wo.n0(new wo.u0("g", 5));

    /* renamed from: h, reason: collision with root package name */
    public static final wo.r0 f447846h = new wo.o0(new wo.u0("h", 5));

    /* renamed from: i, reason: collision with root package name */
    public static final wo.r0 f447847i = new wo.x(new wo.u0("i", 5));

    /* renamed from: j, reason: collision with root package name */
    public static final wo.r0 f447848j = new wo.z(new wo.y("j", 5));

    /* renamed from: k, reason: collision with root package name */
    public static final wo.r0 f447849k = new wo.b0(new wo.a0("k", 5));

    /* renamed from: l, reason: collision with root package name */
    public static final wo.r0 f447850l = new wo.c0(new wo.u0("MODEL", 5));

    /* renamed from: m, reason: collision with root package name */
    public static final wo.r0 f447851m = new wo.e0(new wo.d0("DEVICE_ID", 5));

    /* renamed from: n, reason: collision with root package name */
    public static final wo.r0 f447852n = new wo.f0(new wo.u0("FIRST_INSTALL_TIMEl", 5));

    /* renamed from: o, reason: collision with root package name */
    public static final java.io.File f447853o;

    /* renamed from: p, reason: collision with root package name */
    public static final java.lang.Boolean[] f447854p;

    /* renamed from: q, reason: collision with root package name */
    public static boolean f447855q;

    /* renamed from: r, reason: collision with root package name */
    public static java.lang.String f447856r;

    /* renamed from: s, reason: collision with root package name */
    public static java.lang.String f447857s;

    /* renamed from: t, reason: collision with root package name */
    public static java.lang.String f447858t;

    /* renamed from: u, reason: collision with root package name */
    public static java.lang.String f447859u;

    /* renamed from: v, reason: collision with root package name */
    public static final wo.v0 f447860v;

    /* renamed from: w, reason: collision with root package name */
    public static volatile boolean f447861w;

    /* renamed from: x, reason: collision with root package name */
    public static volatile boolean f447862x;

    /* renamed from: y, reason: collision with root package name */
    public static final java.lang.Boolean[] f447863y;

    static {
        new java.io.File(lp0.b.e(), new java.lang.StringBuilder("midcdnu.").reverse().toString());
        f447853o = new java.io.File(lp0.b.e(), new java.lang.StringBuilder("midcdnd.").reverse().toString());
        f447854p = new java.lang.Boolean[]{null};
        f447855q = false;
        f447856r = null;
        f447857s = null;
        f447858t = null;
        f447859u = null;
        f447860v = new wo.v0("ddc_spin_" + android.os.Process.myUid());
        f447861w = false;
        f447862x = false;
        f447863y = new java.lang.Boolean[]{null};
    }

    public static boolean a() {
        return android.provider.Settings.Global.getInt(com.tencent.mm.sdk.platformtools.x2.f193071a.getContentResolver(), "adb_enabled", 0) == 1;
    }

    public static boolean b() {
        return android.provider.Settings.Secure.getInt(com.tencent.mm.sdk.platformtools.x2.f193071a.getContentResolver(), "development_settings_enabled", 0) == 1;
    }

    public static java.lang.String c() {
        boolean z17 = f447839a;
        wo.r0 r0Var = f447845g;
        if (!z17) {
            wo.v0 v0Var = r0Var.f447795b;
            try {
                v0Var.a();
                if (!(!android.text.TextUtils.isEmpty(r0Var.f447794a.a(null)))) {
                    return "";
                }
            } finally {
                v0Var.c();
            }
        }
        java.lang.String a17 = r0Var.a();
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        return a17 == null ? "" : a17;
    }

    public static java.lang.String d() {
        try {
            return java.lang.Long.toString(com.tencent.mm.sdk.platformtools.x2.f193071a.getPackageManager().getPackageInfo(com.tencent.mm.sdk.platformtools.x2.f193072b, 0).firstInstallTime);
        } catch (java.lang.Exception unused) {
            return com.eclipsesource.mmv8.Platform.UNKNOWN;
        }
    }

    public static java.util.Map e() {
        java.io.BufferedReader bufferedReader;
        java.lang.Throwable th6;
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream("/proc/cpuinfo"), com.tencent.mapsdk.internal.rv.f51270c));
            while (true) {
                try {
                    java.lang.String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    if (!readLine.trim().isEmpty()) {
                        java.lang.String[] split = readLine.split(":");
                        if (split.length > 1) {
                            hashMap.put(split[0].trim().toLowerCase(), split[1].trim());
                        }
                    }
                } catch (java.lang.Throwable th7) {
                    th6 = th7;
                    try {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.DeviceInfo", th6, "getCPUInfoMap() failed.", new java.lang.Object[0]);
                        hashMap.clear();
                        return hashMap;
                    } finally {
                        com.tencent.mm.sdk.platformtools.t8.v1(bufferedReader);
                    }
                }
            }
        } catch (java.lang.Throwable th8) {
            bufferedReader = null;
            th6 = th8;
        }
        return hashMap;
    }

    public static java.lang.String[] f() {
        java.io.BufferedReader bufferedReader = null;
        try {
            java.io.BufferedReader bufferedReader2 = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream("/proc/cpuinfo"), com.tencent.mapsdk.internal.rv.f51270c));
            try {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                java.lang.String[] split = bufferedReader2.readLine().split("\\s+");
                for (int i17 = 2; i17 < split.length; i17++) {
                    sb6.append(split[i17]);
                    sb6.append(' ');
                }
                java.lang.String[] strArr = {sb6.toString(), bufferedReader2.readLine().split("\\s+")[2]};
                com.tencent.mm.sdk.platformtools.t8.v1(bufferedReader2);
                return strArr;
            } catch (java.lang.Throwable th6) {
                th = th6;
                bufferedReader = bufferedReader2;
                try {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.DeviceInfo", th, "getFirstCPUCoreDescs() failed.", new java.lang.Object[0]);
                    return new java.lang.String[]{"", "0"};
                } finally {
                    com.tencent.mm.sdk.platformtools.t8.v1(bufferedReader);
                }
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }

    public static java.lang.String g(boolean z17) {
        java.lang.String a17 = f447840b.a();
        return !com.tencent.mm.sdk.platformtools.t8.K0(a17) ? a17 : z17 ? "1234567890ABCDEF" : "";
    }

    public static java.lang.String h() {
        android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("phone");
        try {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            java.lang.String str = (java.lang.String) yj0.a.j(telephonyManager, "com/tencent/mm/compatible/deviceinfo/DeviceInfo", "getIMSI", "()Ljava/lang/String;", "android/telephony/TelephonyManager", "getSubscriberId", "()Ljava/lang/String;");
            return str == null ? "" : str;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.DeviceInfo", th6, "getIMSI", new java.lang.Object[0]);
            return "";
        }
    }

    public static java.lang.String i() {
        java.lang.String a17 = f447842d.a();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        return a17 == null ? "" : a17;
    }

    public static java.lang.String j() {
        return k();
    }

    public static java.lang.String k() {
        java.lang.String a17 = f447846h.a();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        return a17 == null ? "" : a17;
    }

    public static java.lang.String l() {
        return "android-" + m() + "-" + android.os.Build.VERSION.SDK_INT;
    }

    public static java.lang.String m() {
        java.lang.String a17 = f447850l.a();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        return a17 == null ? "" : a17;
    }

    public static java.lang.String n() {
        java.lang.String a17 = f447849k.a();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        return a17 == null ? "" : a17;
    }

    public static java.lang.String o() {
        try {
            android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("phone");
            if (telephonyManager == null) {
                return "";
            }
            java.lang.String simCountryIso = telephonyManager.getSimCountryIso();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            return simCountryIso == null ? "" : simCountryIso;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.DeviceInfo", th6, "getSimCountryIso", new java.lang.Object[0]);
            return "";
        }
    }

    public static java.lang.String p() {
        java.lang.String a17 = f447848j.a();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        return a17 == null ? "" : a17;
    }

    public static boolean q() {
        boolean booleanValue;
        java.lang.Boolean[] boolArr = f447863y;
        java.lang.Boolean bool = boolArr[0];
        if (bool != null) {
            return bool.booleanValue();
        }
        synchronized (boolArr) {
            java.lang.Boolean bool2 = boolArr[0];
            if (bool2 == null) {
                bool2 = java.lang.Boolean.valueOf(android.os.Process.is64Bit());
                boolArr[0] = bool2;
            }
            booleanValue = bool2.booleanValue();
        }
        return booleanValue;
    }

    public static void r(wo.t0 t0Var) {
        if (!u()) {
            com.tencent.mm.app.p5.e("MicroMsg.DeviceInfo", "[+] new impl of device change detection is not enabled.", new java.lang.Object[0]);
            return;
        }
        if (!f447861w) {
            wo.v0 v0Var = f447860v;
            synchronized (v0Var) {
                if (!f447861w) {
                    try {
                        v0Var.a();
                        t(t0Var);
                        f447861w = true;
                        v0Var.c();
                        return;
                    } catch (java.lang.Throwable th6) {
                        f447860v.c();
                        throw th6;
                    }
                }
            }
        }
        com.tencent.mm.app.p5.f("MicroMsg.DeviceInfo", "[!] refreshWhenDeviceChanged called, skip this time.", new java.lang.Object[0]);
    }

    public static boolean s() {
        if (u()) {
            com.tencent.mm.app.p5.e("MicroMsg.DeviceInfo", "[+] legacy impl of device change detection was disabled.", new java.lang.Object[0]);
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.DeviceInfo", "init DeviceInfo ");
        java.lang.String d17 = d();
        wo.r0 r0Var = f447852n;
        java.lang.String a17 = r0Var.a();
        f447856r = a17;
        if (!d17.equalsIgnoreCase(a17)) {
            wo.r0 r0Var2 = f447845g;
            java.lang.String a18 = r0Var2.a();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (a18 == null) {
                a18 = "";
            }
            f447857s = a18;
            android.content.ContentResolver contentResolver = com.tencent.mm.sdk.platformtools.x2.f193071a.getContentResolver();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add("android_id");
            arrayList.add(contentResolver);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            if (!a18.equalsIgnoreCase((java.lang.String) yj0.a.k(obj, arrayList.toArray(), "com/tencent/mm/compatible/deviceinfo/DeviceInfo", "refreshWhenDeviceChangedLegacyIfEnabled", "()Z", "android/provider/Settings$Secure", "getString", "(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;"))) {
                f447858t = m();
                wo.r0 r0Var3 = f447851m;
                f447859u = r0Var3.a();
                r0Var.e();
                r0Var3.e();
                r0Var2.e();
                wo.r0 r0Var4 = f447850l;
                r0Var4.e();
                f447843e.f();
                f447847i.f();
                f447855q = true;
                com.tencent.mars.xlog.Log.w("MicroMsg.DeviceInfo", java.lang.String.format("[!!] Reset DeviceInfo. InstallTime(%s -> %s), Model(%s -> %s), MMGUID(%s, %s -> %s), AndroidID(%s -> %s)", f447856r, d17, f447858t, r0Var4.a(), f447846h.a(), f447859u, r0Var3.a(), f447857s, r0Var2.a()));
                jz5.g gVar = fp.t.f265239a;
                try {
                    if (((java.lang.Boolean) ((jz5.n) fp.t.f265239a).getValue()).booleanValue()) {
                        java.lang.String cacheDirectory = io.flutter.util.PathUtils.getCacheDirectory(com.tencent.mm.sdk.platformtools.x2.f193071a);
                        kotlin.jvm.internal.o.f(cacheDirectory, "getCacheDirectory(...)");
                        java.lang.String concat = cacheDirectory.concat("/flutter_engine");
                        if (com.tencent.mm.vfs.w6.j(concat)) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.FlutterCacheUtil", "cleanFlutterCache");
                            com.tencent.mm.vfs.w6.f(concat);
                        }
                    }
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FlutterCacheUtil", th6, "cleanFlutterCache error", new java.lang.Object[0]);
                }
                return f447855q;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.DeviceInfo", java.lang.String.format("No need to reset DeviceInfo as usual. [%s]", d17));
        return f447855q;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void t(wo.t0 r15) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wo.w0.t(wo.t0):void");
    }

    public static boolean u() {
        java.lang.Boolean[] boolArr = f447854p;
        synchronized (boolArr) {
            java.lang.Boolean bool = boolArr[0];
            if (bool != null) {
                return bool.booleanValue();
            }
            boolean z17 = true;
            try {
                z17 = true ^ f447853o.exists();
            } catch (java.lang.Throwable unused) {
            }
            java.lang.Boolean[] boolArr2 = f447854p;
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
            boolArr2[0] = valueOf;
            return valueOf.booleanValue();
        }
    }
}
