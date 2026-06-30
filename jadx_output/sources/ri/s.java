package ri;

/* loaded from: classes12.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final android.util.SparseArray f396008a = new android.util.SparseArray();

    public static java.lang.String a(java.util.Map map) {
        try {
            return new org.json.JSONObject(map).toString().replace(",", ";");
        } catch (java.lang.Exception e17) {
            oj.j.d("Matrix.battery.BatteryReporter", e17, "json error", new java.lang.Object[0]);
            return e17.getMessage();
        }
    }

    public static void b(int i17, int i18, java.lang.String str, java.lang.String str2, int i19, int i27, java.lang.String str3, long j17, java.lang.String str4, long j18, java.lang.String str5, long j19, java.lang.String str6, java.lang.String str7, long j27, long j28, long j29, java.lang.String str8) {
        c(false, i17, i18, str, str2, i19, i27, str3, j17, str4, j18, str5, j19, str6, str7, j27, j28, j29, str8);
    }

    public static void c(boolean z17, int i17, int i18, java.lang.String str, java.lang.String str2, int i19, int i27, java.lang.String str3, long j17, java.lang.String str4, long j18, java.lang.String str5, long j19, java.lang.String str6, java.lang.String str7, long j27, long j28, long j29, java.lang.String str8) {
        if (z17) {
            com.tencent.mars.xlog.Log.i("Matrix.battery.BatteryReporter", "#kvPost, data: \n\ttype = " + i17 + "\n, version = " + i18 + "\n, proc = " + str + "\n, extra = " + str2 + "\n, appStat = " + i19 + "\n, devStat = " + i27 + "\n, keyDgt1 = " + str3 + "\n, valDgt1 = " + j17 + "\n, keyDgt2 = " + str4 + "\n, valDgt2 = " + j18 + "\n, keyDgt3 = " + str5 + "\n, valDgt3 " + j19 + "\n, scene = " + str6 + "\n, stack = " + str7 + "\n, extraDigit1 = " + j27 + "\n, extraDigit2 = " + j28 + "\n, extraDigit3 = " + j29 + "\n, stackR = " + str8);
        }
        jx3.f.INSTANCE.d(21468, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, str2, java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), str3, java.lang.Long.valueOf(j17), str4, java.lang.Long.valueOf(j18), str5, java.lang.Long.valueOf(j19), str6, str7, java.lang.Long.valueOf(j27), java.lang.Long.valueOf(j28), java.lang.Long.valueOf(j29), str8, com.tencent.mm.sdk.platformtools.z.f193109e);
    }
}
