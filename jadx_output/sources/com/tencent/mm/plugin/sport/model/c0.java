package com.tencent.mm.plugin.sport.model;

/* loaded from: classes12.dex */
public abstract class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static db5.d5 f171773a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String[] f171774b = {"_id", "_begin_time", "_end_time", "_mode", "_steps"};

    /* renamed from: c, reason: collision with root package name */
    public static final android.net.Uri f171775c = android.net.Uri.parse("content://com.miui.providers.steps/item");

    public static boolean a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        if (fp.h.a(19)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Sport.SportKtUtil", "Not Support SDK VERSION");
            return false;
        }
        if (com.tencent.mm.plugin.sport.model.w.f171816a == null) {
            com.tencent.mm.plugin.sport.model.w.f171816a = java.lang.Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.sensor.stepcounter"));
        }
        java.lang.Boolean bool = com.tencent.mm.plugin.sport.model.w.f171816a;
        java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
        if (!kotlin.jvm.internal.o.b(bool, bool2)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Sport.SportKtUtil", "Not Support FEATURE_SENSOR_STEP_COUNTER");
            return false;
        }
        try {
            if (com.tencent.mm.plugin.sport.model.w.f171817b == null) {
                java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("sensor");
                kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
                com.tencent.mm.plugin.sport.model.w.f171817b = java.lang.Boolean.valueOf(((android.hardware.SensorManager) systemService).getDefaultSensor(19) != null);
            }
            if (!kotlin.jvm.internal.o.b(com.tencent.mm.plugin.sport.model.w.f171817b, bool2)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Sport.SportKtUtil", "Not Support can not get sensor");
                return false;
            }
            if (com.tencent.mm.plugin.sport.model.t.c().optInt("deviceStepSwitch") == 1) {
                return true;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Sport.SportKtUtil", "Not Support deviceStepSwitch is off");
            return false;
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Sport.SportKtUtil", "Not Support can not get sensor Exception");
            return false;
        }
    }

    public static boolean b() {
        if (com.tencent.mm.plugin.sport.model.t.c().optInt("extStepApiSwitch") == 1) {
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Sport.SportUtil", "Not Support extStepApiSwitch is off");
        return false;
    }

    public static boolean c(long j17, long j18) {
        if (j17 == 0 && j18 > 0) {
            return true;
        }
        int i17 = 500;
        try {
            org.json.JSONObject optJSONObject = com.tencent.mm.plugin.sport.model.t.c().optJSONObject("stepCountUploadConfig");
            if (optJSONObject != null) {
                i17 = optJSONObject.optInt("backgroundStepCountInterval", 500);
            }
        } catch (java.lang.Exception unused) {
        }
        return j18 - j17 >= ((long) i17);
    }

    public static boolean d(long j17, long j18) {
        long j19 = 3600000;
        try {
            if (com.tencent.mm.plugin.sport.model.t.c().optJSONObject("stepCountUploadConfig") != null) {
                j19 = r2.optInt("backgroundTimeInterval", 60) * 60 * 1000;
            }
        } catch (java.lang.Exception unused) {
        }
        return j18 - j17 >= j19;
    }

    public static boolean e() {
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n("gh_43f2581f6fd6", true);
        boolean r27 = n17 != null ? n17.r2() : false;
        if (!r27) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Sport.SportUtil", "checkUserInstallWeSportPlugin %b", java.lang.Boolean.valueOf(r27));
        }
        return r27;
    }

    public static final java.lang.String f(long j17) {
        return new java.text.SimpleDateFormat(com.tencent.tav.coremedia.TimeUtil.YYYY2MM2DD_HH1MM1SS).format(new java.util.Date(j17));
    }

    public static long g() {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTimeInMillis(c01.id.c());
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }
}
