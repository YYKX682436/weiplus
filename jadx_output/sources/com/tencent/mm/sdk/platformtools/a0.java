package com.tencent.mm.sdk.platformtools;

/* loaded from: classes11.dex */
public abstract class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static int f192438a;

    /* renamed from: b, reason: collision with root package name */
    public static int f192439b;

    /* renamed from: c, reason: collision with root package name */
    public static int f192440c;

    /* renamed from: d, reason: collision with root package name */
    public static int f192441d;

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f192442e = "" + android.os.Build.VERSION.SDK_INT;

    /* renamed from: f, reason: collision with root package name */
    public static int f192443f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.String f192444g = "market://details?id=" + com.tencent.mm.sdk.platformtools.x2.f193072b;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f192445h = false;

    /* renamed from: i, reason: collision with root package name */
    public static boolean f192446i = true;

    /* renamed from: j, reason: collision with root package name */
    public static boolean f192447j = false;

    /* renamed from: k, reason: collision with root package name */
    public static boolean f192448k = false;

    public static java.lang.String a(android.content.Context context, int i17) {
        return b(context, i17, f192445h);
    }

    public static java.lang.String b(android.content.Context context, int i17, boolean z17) {
        java.lang.String str;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(com.tencent.mm.sdk.platformtools.z.f193117m)) {
            return com.tencent.mm.sdk.platformtools.z.f193117m;
        }
        int i18 = (i17 >> 8) & 255;
        if (i18 == 0) {
            str = "" + ((i17 >> 24) & 15) + "." + ((i17 >> 16) & 255);
        } else {
            str = "" + ((i17 >> 24) & 15) + "." + ((i17 >> 16) & 255) + "." + i18;
        }
        int i19 = i17 & 268435455;
        if (context != null) {
            try {
                android.content.pm.PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 128);
                if (packageInfo != null) {
                    i19 = packageInfo.versionCode;
                    str = packageInfo.versionName;
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.ChannelUtil", e17, "", new java.lang.Object[0]);
            }
        }
        if (z17) {
            return str + "_" + i19;
        }
        java.lang.String[] split = str.split("\\.");
        if (split == null || split.length < 4) {
            return str;
        }
        java.lang.String str2 = split[0] + "." + split[1];
        if (split[2].trim().equals("0")) {
            return str2;
        }
        return str2 + "." + split[2];
    }

    public static boolean c() {
        java.lang.String str = com.tencent.mm.sdk.platformtools.a9.f192463a;
        if (!yp5.a.f464409a.a()) {
            return true;
        }
        int intValue = java.lang.Integer.decode(com.tencent.mm.sdk.platformtools.z.f193111g).intValue() & 255;
        return intValue >= 64 && intValue <= 79;
    }

    public static int d(java.lang.String str) {
        try {
            return java.lang.Integer.parseInt(str);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SDK.ChannelUtil", e17.getMessage());
            return 0;
        }
    }

    public static void e(android.content.Context context) {
        try {
            int i17 = com.tencent.mm.sdk.platformtools.z.f193122r;
            if (i17 != -1) {
                f192439b = i17;
                com.tencent.mars.xlog.Log.i("MicroMsg.SDK.ChannelUtil", "setup channel id from BuildConfig, id = " + f192439b);
                return;
            }
            int parseInt = java.lang.Integer.parseInt((java.lang.String) ((java.util.HashMap) com.tencent.mm.sdk.platformtools.b2.a(com.tencent.mm.sdk.platformtools.t8.e(context.getAssets().open("channel.ini")))).get("CHANNEL"));
            f192439b = parseInt;
            if (parseInt == 1) {
                f192438a = 1;
            }
            com.tencent.mm.app.MMCrashReportContents.f53258m.e(java.lang.String.valueOf(f192439b));
            com.tencent.mm.app.MMBugReportContents.f53227h.f53556s.e(java.lang.String.valueOf(f192439b));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.ChannelUtil", "setup channel id from channel.ini failed");
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.ChannelUtil", e17, "", new java.lang.Object[0]);
        }
    }
}
