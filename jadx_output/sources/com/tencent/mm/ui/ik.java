package com.tencent.mm.ui;

/* loaded from: classes10.dex */
public final class ik {
    public ik(kotlin.jvm.internal.i iVar) {
    }

    public final boolean a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("style", ya.b.MEDIUM);
        return b(jSONObject.toString());
    }

    public final boolean b(java.lang.String str) {
        int i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchUtils", "vibrateShort , type = " + str);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("vibrator");
            kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.os.Vibrator");
            android.os.Vibrator vibrator = (android.os.Vibrator) systemService;
            java.lang.Object obj = jSONObject.get("style");
            char c17 = kotlin.jvm.internal.o.b(obj, "light") ? (char) 1 : kotlin.jvm.internal.o.b(obj, ya.b.MEDIUM) ? (char) 2 : kotlin.jvm.internal.o.b(obj, "heavy") ? (char) 3 : (char) 65535;
            long j17 = 50;
            if (65534 == c17) {
                vibrator.vibrate(50L);
                return true;
            }
            if (65535 == c17) {
                vibrator.vibrate(50L);
                return true;
            }
            if (android.os.Build.VERSION.SDK_INT < 26 || !vibrator.hasAmplitudeControl()) {
                vibrator.vibrate(50L);
            } else {
                if (c17 == 1) {
                    i17 = 128;
                    j17 = 15;
                } else if (c17 == 2) {
                    i17 = 192;
                } else if (c17 == 3) {
                    i17 = 255;
                    j17 = 85;
                } else {
                    i17 = -1;
                }
                if (-1 == i17) {
                    vibrator.vibrate(j17);
                } else {
                    vibrator.vibrate(android.os.VibrationEffect.createOneShot(j17, i17));
                }
            }
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.WebSearchUtils", e17, be1.a1.NAME, new java.lang.Object[0]);
            return false;
        }
    }
}
