package o45;

/* loaded from: classes12.dex */
public abstract class ag {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f342892a = true;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f342893b = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("auth_info_key_prefs", 4).getBoolean("auth_info_prefs_use_net_ml_cert", false);

    /* renamed from: c, reason: collision with root package name */
    public static int f342894c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static byte[] f342895d = null;

    /* renamed from: e, reason: collision with root package name */
    public static byte[] f342896e = null;

    /* renamed from: f, reason: collision with root package name */
    public static int f342897f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static int f342898g = 1;

    /* renamed from: h, reason: collision with root package name */
    public static byte[] f342899h;

    /* renamed from: i, reason: collision with root package name */
    public static byte[] f342900i;

    /* renamed from: j, reason: collision with root package name */
    public static long f342901j;

    static {
        com.tencent.mars.xlog.Log.i("MicroMsg.EcdhMgr", "summerauths USE_ECDH[%s] USE_ML[%s]", java.lang.Boolean.valueOf(f342892a), java.lang.Boolean.valueOf(f342893b));
        h();
        f342901j = 0L;
    }

    public static int a() {
        android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("auth_info_key_prefs", 4);
        int i17 = sharedPreferences.getInt("auth_info_prefs_test_ecdh_version", 0);
        if (i17 == 1) {
            sharedPreferences.edit().remove("auth_info_prefs_test_ecdh_version").commit();
        }
        if (i17 == 1) {
            return 10010;
        }
        return f342897f;
    }

    public static byte[] b() {
        int i17 = f342898g;
        try {
            i17 = gm0.j1.n().f273288b.f70764d.e0();
        } catch (java.lang.AssertionError | java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.EcdhMgr", e17.getLocalizedMessage());
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EcdhMgr", "getEcdhKey cert region " + i17 + " current: " + f342898g);
        if (i17 != f342898g) {
            f342898g = i17;
            g(i17);
        }
        return f342895d;
    }

    public static boolean c() {
        return com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("auth_info_key_prefs", 4).getInt("auth_info_prefs_test_ecdh_skip_aak", 0) == 1;
    }

    public static long d(byte[] bArr) {
        int i17 = f342894c;
        byte[] b17 = b();
        int i18 = f342898g;
        try {
            i18 = gm0.j1.n().f273288b.f70764d.e0();
        } catch (java.lang.AssertionError | java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.EcdhMgr", e17.getLocalizedMessage());
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EcdhMgr", "getEcdsaKey cert region " + i18 + " current: " + f342898g + " " + f342897f);
        if (i18 != f342898g) {
            f342898g = i18;
            g(i18);
        }
        long CreateHybridEcdhCryptoEngine = com.tencent.mm.jni.utils.UtilsJni.CreateHybridEcdhCryptoEngine(i17, b17, f342896e, bArr);
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = java.lang.Long.valueOf(CreateHybridEcdhCryptoEngine);
        objArr[1] = java.lang.Integer.valueOf(bArr == null ? -1 : bArr.length);
        objArr[2] = java.lang.Integer.valueOf(f342894c);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        objArr[3] = new com.tencent.mm.sdk.platformtools.z3();
        com.tencent.mars.xlog.Log.i("MicroMsg.EcdhMgr", "summerauths getHybridEcdhCryptoEngine engine[%s] autoauth_key[%s] nid[%s] stack[%s]", objArr);
        return CreateHybridEcdhCryptoEngine;
    }

    public static byte[] e() {
        int i17 = f342898g;
        try {
            i17 = gm0.j1.n().f273288b.f70764d.e0();
        } catch (java.lang.AssertionError | java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.EcdhMgr", e17.getLocalizedMessage());
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EcdhMgr", "getEcdhKey cert region " + i17 + " current: " + f342898g);
        if (i17 != f342898g) {
            f342898g = i17;
            g(i17);
        }
        return f342899h;
    }

    public static byte[] f() {
        int i17 = f342898g;
        try {
            i17 = gm0.j1.n().f273288b.f70764d.e0();
        } catch (java.lang.AssertionError | java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.EcdhMgr", e17.getLocalizedMessage());
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EcdhMgr", "getEcdsaKey cert region " + i17 + " current: " + f342898g + " " + f342897f);
        if (i17 != f342898g) {
            f342898g = i17;
            g(i17);
        }
        return f342900i;
    }

    public static void g(int i17) {
        if (i17 == 1) {
            h();
            return;
        }
        if (i17 != 2) {
            return;
        }
        f342897f = 50017;
        f342894c = com.tencent.wxmm.v2helper.EMethodOutputVolumeScaleEnable;
        f342895d = android.util.Base64.decode("BIabf6ipoVluK1TfAMW9bKsu1oOXauwuVm8oNUy3jdRu9pUud3P4g3GuovZA2GfQuGOkwXjaM/vaBbnMX9KtE04=", 0);
        f342896e = android.util.Base64.decode("LS0tLS1CRUdJTiBQVUJMSUMgS0VZLS0tLS0KTUZrd0V3WUhLb1pJemowQ0FRWUlLb1pJemowREFRY0RRZ0FFdjZHTy9HSmxyWGZVVUxxNXpoWVJKRUJVVllTeQpxaHcwSHowZi91OUVFUHhYMkdQVVBNUU1ReFg2RlA3WkNTdkpjbGdjOGdpUk8rWjg4U25WV1U4bGp3PT0KLS0tLS1FTkQgUFVCTElDIEtFWS0tLS0tCg==", 0);
        f342899h = "BIabf6ipoVluK1TfAMW9bKsu1oOXauwuVm8oNUy3jdRu9pUud3P4g3GuovZA2GfQuGOkwXjaM/vaBbnMX9KtE04=".getBytes(java.nio.charset.StandardCharsets.UTF_8);
        f342900i = "LS0tLS1CRUdJTiBQVUJMSUMgS0VZLS0tLS0KTUZrd0V3WUhLb1pJemowQ0FRWUlLb1pJemowREFRY0RRZ0FFdjZHTy9HSmxyWGZVVUxxNXpoWVJKRUJVVllTeQpxaHcwSHowZi91OUVFUHhYMkdQVVBNUU1ReFg2RlA3WkNTdkpjbGdjOGdpUk8rWjg4U25WV1U4bGp3PT0KLS0tLS1FTkQgUFVCTElDIEtFWS0tLS0tCg==".getBytes(java.nio.charset.StandardCharsets.UTF_8);
    }

    public static void h() {
        if (f342893b) {
            f342897f = 10001;
            f342894c = com.tencent.wxmm.v2helper.EMethodOutputVolumeScaleEnable;
            f342895d = android.util.Base64.decode("BJO0cjvgelbYHm8ZlKVVl63oMbeMYLjIqaWtZWvBBTSm7PzWslBMy8loLcnG9dITvDzD6YpddZdH1PnHxG8Kpvo=", 0);
            f342896e = android.util.Base64.decode("LS0tLS1CRUdJTiBQVUJMSUMgS0VZLS0tLS0KTUZrd0V3WUhLb1pJemowQ0FRWUlLb1pJemowREFRY0RRZ0FFQ0JvQVdmMC84ZVJEL0NKeWIxU3RKckhPeVcyVwo2Z3ZjaUh1TTZOZk82cWhLNDJKTjZSRmxucEtZbVAyTlBYbnd3L05VVFpMM05Qa3FZVEh2Q1AwSmtnPT0KLS0tLS1FTkQgUFVCTElDIEtFWS0tLS0tCg==", 0);
            f342899h = "BJO0cjvgelbYHm8ZlKVVl63oMbeMYLjIqaWtZWvBBTSm7PzWslBMy8loLcnG9dITvDzD6YpddZdH1PnHxG8Kpvo=".getBytes(java.nio.charset.StandardCharsets.UTF_8);
            f342900i = "LS0tLS1CRUdJTiBQVUJMSUMgS0VZLS0tLS0KTUZrd0V3WUhLb1pJemowQ0FRWUlLb1pJemowREFRY0RRZ0FFQ0JvQVdmMC84ZVJEL0NKeWIxU3RKckhPeVcyVwo2Z3ZjaUh1TTZOZk82cWhLNDJKTjZSRmxucEtZbVAyTlBYbnd3L05VVFpMM05Qa3FZVEh2Q1AwSmtnPT0KLS0tLS1FTkQgUFVCTElDIEtFWS0tLS0tCg==".getBytes(java.nio.charset.StandardCharsets.UTF_8);
            return;
        }
        f342897f = 10024;
        f342894c = com.tencent.wxmm.v2helper.EMethodOutputVolumeScaleEnable;
        f342895d = android.util.Base64.decode("BFftFqzpQHuTwKZusMZ/cUbitBZPbpx/SmA+S20UPC1G9jYFrQ+RTkifV7uFPrIlKjjtlowasV+G3wRfgFWCoZQ=", 0);
        f342896e = android.util.Base64.decode("LS0tLS1CRUdJTiBQVUJMSUMgS0VZLS0tLS0KTUZrd0V3WUhLb1pJemowQ0FRWUlLb1pJemowREFRY0RRZ0FFU2lsQ2ZsUVIwNlpIU1V4ZVlSK1FLbHA1SHZ6VgpDVE1aSHNwTUEvZ1gyRG9rUUlOQkpmZUxlN3EyTjdubjVOVE9MYUo4QlVJZHN5TDUwN3B2N2VocU1RPT0KLS0tLS1FTkQgUFVCTElDIEtFWS0tLS0tCg==", 0);
        f342899h = "BFftFqzpQHuTwKZusMZ/cUbitBZPbpx/SmA+S20UPC1G9jYFrQ+RTkifV7uFPrIlKjjtlowasV+G3wRfgFWCoZQ=".getBytes(java.nio.charset.StandardCharsets.UTF_8);
        f342900i = "LS0tLS1CRUdJTiBQVUJMSUMgS0VZLS0tLS0KTUZrd0V3WUhLb1pJemowQ0FRWUlLb1pJemowREFRY0RRZ0FFU2lsQ2ZsUVIwNlpIU1V4ZVlSK1FLbHA1SHZ6VgpDVE1aSHNwTUEvZ1gyRG9rUUlOQkpmZUxlN3EyTjdubjVOVE9MYUo4QlVJZHN5TDUwN3B2N2VocU1RPT0KLS0tLS1FTkQgUFVCTElDIEtFWS0tLS0tCg==".getBytes(java.nio.charset.StandardCharsets.UTF_8);
    }

    public static void i(long j17) {
        com.tencent.mm.jni.utils.UtilsJni.ReleaseHybridEcdhCryptoEngine(j17);
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.EcdhMgr", "summerauths releaseHybridEcdhCryptoEngine engine[%s] stack[%s]", valueOf, new com.tencent.mm.sdk.platformtools.z3());
    }

    public static void j(int i17) {
        com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("auth_info_key_prefs", 4).edit().putInt("auth_info_prefs_test_ecdh_skip_aak", i17).commit();
    }

    public static void k(int i17) {
        f342897f = i17;
        android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("auth_info_key_prefs", 4);
        sharedPreferences.edit().putInt("auth_info_prefs_test_ecdh_version", 1).commit();
        sharedPreferences.getInt("auth_info_prefs_test_ecdh_version", 0);
    }

    public static synchronized boolean l() {
        synchronized (o45.ag.class) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.i("MicroMsg.EcdhMgr", "summerauths switchCert LAST_SWITCH_TIME[%s] old USE_ML[%s] stack[%s]", java.lang.Long.valueOf(f342901j), java.lang.Boolean.valueOf(f342893b), new com.tencent.mm.sdk.platformtools.z3());
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            long j17 = f342901j;
            if (600000 >= elapsedRealtime - j17 && j17 > 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.EcdhMgr", "summerauths switchCert LAST_SWITCH_TIME freq limit [%s]ms ret false", java.lang.Long.valueOf(elapsedRealtime - j17));
                return false;
            }
            f342901j = android.os.SystemClock.elapsedRealtime();
            f342893b = !f342893b;
            android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("auth_info_key_prefs", 4);
            boolean commit = sharedPreferences.edit().putBoolean("auth_info_prefs_use_net_ml_cert", f342893b).commit();
            sharedPreferences.getBoolean("auth_info_prefs_use_net_ml_cert", false);
            com.tencent.mars.xlog.Log.i("MicroMsg.EcdhMgr", "summerauths switchCert to [%s] save sp[%s]", java.lang.Boolean.valueOf(f342893b), java.lang.Boolean.valueOf(commit));
            h();
            return commit;
        }
    }

    public static void m() {
        f342893b = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("auth_info_key_prefs", 4).getBoolean("auth_info_prefs_use_net_ml_cert", false);
        int i17 = f342898g;
        try {
            i17 = com.tencent.mm.sdk.platformtools.x2.n() ? gm0.j1.n().f273288b.f70764d.e0() : com.tencent.mm.network.x2.c().e0();
        } catch (java.lang.AssertionError | java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.EcdhMgr", e17.getLocalizedMessage());
            com.tencent.mars.xlog.Log.e("MicroMsg.EcdhMgr", "getMMtlsRegion error %s", e17.getMessage());
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EcdhMgr", "summerauths USE_ECDH[%s] USE_ML[%s] ECDH_REGION[%s] certRegion[%s]", java.lang.Boolean.valueOf(f342892a), java.lang.Boolean.valueOf(f342893b), java.lang.Integer.valueOf(f342898g), java.lang.Integer.valueOf(i17));
        g(i17);
    }
}
