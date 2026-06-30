package com.tencent.mm.plugin.performance.watchdogs;

/* loaded from: classes12.dex */
public abstract class a0 {
    public static boolean a(ob0.s3 s3Var, boolean z17) {
        if (s3Var.f343969z <= 1024000) {
            return false;
        }
        if (!z17) {
            return true;
        }
        com.tencent.mm.plugin.performance.watchdogs.z.GLOBAL.f153166n++;
        if (!s3Var.f343954k ? s3Var.f343951h : s3Var.f343952i) {
            com.tencent.mm.plugin.performance.watchdogs.z.BACKGROUND.f153166n++;
            java.lang.String str = s3Var.f343950g;
            if (str != null && (str.contains("default") || s3Var.f343950g.contains("LauncherUI"))) {
                com.tencent.mm.plugin.performance.watchdogs.z.LAUNCHER_BACKGROUND.f153166n++;
            }
        } else {
            com.tencent.mm.plugin.performance.watchdogs.z.FOREGROUND.f153166n++;
        }
        java.util.Iterator it = ((java.util.ArrayList) com.tencent.mm.plugin.performance.watchdogs.z.a(s3Var.f343950g)).iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.performance.watchdogs.z) it.next()).f153166n++;
        }
        return true;
    }

    public static boolean b(ob0.s3 s3Var, boolean z17) {
        if (s3Var.f343959p - s3Var.f343960q <= 262144000) {
            return false;
        }
        if (!z17) {
            return true;
        }
        com.tencent.mm.plugin.performance.watchdogs.z.GLOBAL.f153161f++;
        if (!s3Var.f343954k ? s3Var.f343951h : s3Var.f343952i) {
            com.tencent.mm.plugin.performance.watchdogs.z.BACKGROUND.f153161f++;
            java.lang.String str = s3Var.f343950g;
            if (str != null && (str.contains("default") || s3Var.f343950g.contains("LauncherUI"))) {
                com.tencent.mm.plugin.performance.watchdogs.z.LAUNCHER_BACKGROUND.f153161f++;
            }
        } else {
            com.tencent.mm.plugin.performance.watchdogs.z.FOREGROUND.f153161f++;
        }
        java.util.Iterator it = ((java.util.ArrayList) com.tencent.mm.plugin.performance.watchdogs.z.a(s3Var.f343950g)).iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.performance.watchdogs.z) it.next()).f153161f++;
        }
        return true;
    }

    public static boolean c(ob0.s3 s3Var, boolean z17) {
        if (s3Var.f343957n <= 524288000) {
            return false;
        }
        if (!z17) {
            return true;
        }
        com.tencent.mm.plugin.performance.watchdogs.z.GLOBAL.f153162g++;
        if (!s3Var.f343954k ? s3Var.f343951h : s3Var.f343952i) {
            com.tencent.mm.plugin.performance.watchdogs.z.BACKGROUND.f153162g++;
            java.lang.String str = s3Var.f343950g;
            if (str != null && (str.contains("default") || s3Var.f343950g.contains("LauncherUI"))) {
                com.tencent.mm.plugin.performance.watchdogs.z.LAUNCHER_BACKGROUND.f153162g++;
            }
        } else {
            com.tencent.mm.plugin.performance.watchdogs.z.FOREGROUND.f153162g++;
        }
        java.util.Iterator it = ((java.util.ArrayList) com.tencent.mm.plugin.performance.watchdogs.z.a(s3Var.f343950g)).iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.performance.watchdogs.z) it.next()).f153162g++;
        }
        return true;
    }

    public static boolean d(ob0.s3 s3Var, boolean z17) {
        if (s3Var.A <= 2097152) {
            return false;
        }
        if (!z17) {
            return true;
        }
        com.tencent.mm.plugin.performance.watchdogs.z.GLOBAL.f153165m++;
        if (!s3Var.f343954k ? s3Var.f343951h : s3Var.f343952i) {
            com.tencent.mm.plugin.performance.watchdogs.z.BACKGROUND.f153165m++;
            java.lang.String str = s3Var.f343950g;
            if (str != null && (str.contains("default") || s3Var.f343950g.contains("LauncherUI"))) {
                com.tencent.mm.plugin.performance.watchdogs.z.LAUNCHER_BACKGROUND.f153165m++;
            }
        } else {
            com.tencent.mm.plugin.performance.watchdogs.z.FOREGROUND.f153165m++;
        }
        java.util.Iterator it = ((java.util.ArrayList) com.tencent.mm.plugin.performance.watchdogs.z.a(s3Var.f343950g)).iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.performance.watchdogs.z) it.next()).f153165m++;
        }
        return true;
    }

    public static boolean e(ob0.s3 s3Var, boolean z17) {
        if (s3Var.f343968y <= 1024000) {
            return false;
        }
        if (!z17) {
            return true;
        }
        com.tencent.mm.plugin.performance.watchdogs.z.GLOBAL.f153164i++;
        if (!s3Var.f343954k ? s3Var.f343951h : s3Var.f343952i) {
            com.tencent.mm.plugin.performance.watchdogs.z.BACKGROUND.f153164i++;
            java.lang.String str = s3Var.f343950g;
            if (str != null && (str.contains("default") || s3Var.f343950g.contains("LauncherUI"))) {
                com.tencent.mm.plugin.performance.watchdogs.z.LAUNCHER_BACKGROUND.f153164i++;
            }
        } else {
            com.tencent.mm.plugin.performance.watchdogs.z.FOREGROUND.f153164i++;
        }
        java.util.Iterator it = ((java.util.ArrayList) com.tencent.mm.plugin.performance.watchdogs.z.a(s3Var.f343950g)).iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.performance.watchdogs.z) it.next()).f153164i++;
        }
        return true;
    }

    public static boolean f(ob0.s3 s3Var, boolean z17) {
        if (com.tencent.mm.sdk.platformtools.z.f193115k || s3Var.f343948e <= 3879731.2d) {
            return false;
        }
        if (!z17) {
            return true;
        }
        com.tencent.mm.plugin.performance.watchdogs.z.GLOBAL.f153163h++;
        if (!s3Var.f343954k ? s3Var.f343951h : s3Var.f343952i) {
            com.tencent.mm.plugin.performance.watchdogs.z.BACKGROUND.f153163h++;
            java.lang.String str = s3Var.f343950g;
            if (str != null && (str.contains("default") || s3Var.f343950g.contains("LauncherUI"))) {
                com.tencent.mm.plugin.performance.watchdogs.z.LAUNCHER_BACKGROUND.f153163h++;
            }
        } else {
            com.tencent.mm.plugin.performance.watchdogs.z.FOREGROUND.f153163h++;
        }
        java.util.Iterator it = ((java.util.ArrayList) com.tencent.mm.plugin.performance.watchdogs.z.a(s3Var.f343950g)).iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.performance.watchdogs.z) it.next()).f153163h++;
        }
        return true;
    }

    public static int g(int i17) {
        return i17 < 102400 ? com.tencent.mm.sdk.platformtools.z.f193115k ? 42 : 2 : i17 < 204800 ? com.tencent.mm.sdk.platformtools.z.f193115k ? 43 : 3 : i17 < 307200 ? com.tencent.mm.sdk.platformtools.z.f193115k ? 44 : 4 : i17 < 409600 ? com.tencent.mm.sdk.platformtools.z.f193115k ? 45 : 5 : i17 < 512000 ? com.tencent.mm.sdk.platformtools.z.f193115k ? 46 : 6 : i17 < 614400 ? com.tencent.mm.sdk.platformtools.z.f193115k ? 47 : 7 : i17 < 716800 ? com.tencent.mm.sdk.platformtools.z.f193115k ? 48 : 8 : i17 < 819200 ? com.tencent.mm.sdk.platformtools.z.f193115k ? 49 : 9 : i17 < 921600 ? com.tencent.mm.sdk.platformtools.z.f193115k ? 50 : 10 : i17 < 1024000 ? com.tencent.mm.sdk.platformtools.z.f193115k ? 51 : 11 : i17 < 1126400 ? com.tencent.mm.sdk.platformtools.z.f193115k ? 52 : 12 : i17 < 1228800 ? com.tencent.mm.sdk.platformtools.z.f193115k ? 53 : 13 : i17 < 1331200 ? com.tencent.mm.sdk.platformtools.z.f193115k ? 54 : 14 : i17 < 1433600 ? com.tencent.mm.sdk.platformtools.z.f193115k ? 55 : 15 : com.tencent.mm.sdk.platformtools.z.f193115k ? 56 : 16;
    }

    public static void h(int i17, long j17, long j18, long j19, long j27, long j28, java.lang.String str, int i18, long j29, long j37, long j38, long j39, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, long j47, java.lang.String str6, org.json.JSONObject jSONObject) {
        jx3.f fVar = jx3.f.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[22];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = bm5.f1.a();
        objArr[2] = java.lang.Long.valueOf(j17);
        objArr[3] = java.lang.Long.valueOf(j18);
        objArr[4] = java.lang.Long.valueOf(j19);
        objArr[5] = java.lang.Long.valueOf(j27);
        objArr[6] = java.lang.Long.valueOf(j28);
        objArr[7] = str;
        objArr[8] = java.lang.Integer.valueOf(i18);
        objArr[9] = java.lang.Long.valueOf(j29);
        objArr[10] = java.lang.Long.valueOf(j37);
        objArr[11] = java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.z.f193115k ? 1 : 2);
        objArr[12] = java.lang.Long.valueOf(j38);
        objArr[13] = java.lang.Long.valueOf(j39);
        objArr[14] = str2;
        objArr[15] = str3;
        objArr[16] = str4;
        objArr[17] = str5;
        objArr[18] = java.lang.Long.valueOf(j47);
        objArr[19] = str6;
        objArr[20] = com.tencent.mm.sdk.platformtools.z.f193109e;
        objArr[21] = jSONObject != null ? jSONObject.toString().replace(',', ';') : "";
        fVar.d(20731, objArr);
    }

    public static void i(ob0.s3 s3Var, boolean z17) {
        int i17 = com.tencent.mm.sdk.platformtools.x2.j() ? 1462 : com.tencent.mm.sdk.platformtools.x2.s() ? 1463 : -1;
        if (i17 <= 0) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new com.tencent.mars.smc.IDKey(i17, 0, 1));
        arrayList.add(new com.tencent.mars.smc.IDKey(i17, z17 ? 1 : 2, 1));
        long j17 = s3Var.f343959p - s3Var.f343960q;
        com.tencent.mars.smc.IDKey iDKey = new com.tencent.mars.smc.IDKey();
        iDKey.SetID(i17);
        iDKey.SetValue(1L);
        if (j17 < 52428800) {
            iDKey.SetKey(z17 ? 3 : 16);
        } else if (j17 < com.tencent.tmassistantsdk.downloadservice.DownloadHelper.SAVE_LENGTH) {
            iDKey.SetKey(z17 ? 4 : 17);
        } else if (j17 < 209715200) {
            iDKey.SetKey(z17 ? 5 : 18);
        } else if (j17 < 314572800) {
            iDKey.SetKey(z17 ? 6 : 19);
        } else if (j17 < 419430400) {
            iDKey.SetKey(z17 ? 7 : 20);
        } else if (j17 < 524288000) {
            iDKey.SetKey(z17 ? 8 : 21);
        } else if (j17 < 629145600) {
            iDKey.SetKey(z17 ? 9 : 22);
        } else if (j17 < 734003200) {
            iDKey.SetKey(z17 ? 10 : 23);
        } else if (j17 < 838860800) {
            iDKey.SetKey(z17 ? 11 : 24);
        } else if (j17 < 943718400) {
            iDKey.SetKey(z17 ? 12 : 25);
        } else if (j17 < 1048576000) {
            iDKey.SetKey(z17 ? 13 : 26);
        } else {
            iDKey.SetKey(z17 ? 14 : 27);
        }
        arrayList.add(iDKey);
        long j18 = s3Var.f343957n;
        com.tencent.mars.smc.IDKey iDKey2 = new com.tencent.mars.smc.IDKey();
        iDKey2.SetID(i17);
        iDKey2.SetValue(1L);
        if (j18 < com.tencent.tmassistantsdk.downloadservice.DownloadHelper.SAVE_LENGTH) {
            iDKey2.SetKey(z17 ? 55 : 69);
        } else if (j18 < 209715200) {
            iDKey2.SetKey(z17 ? 56 : 70);
        } else if (j18 < 314572800) {
            iDKey2.SetKey(z17 ? 57 : 71);
        } else if (j18 < 419430400) {
            iDKey2.SetKey(z17 ? 58 : 72);
        } else if (j18 < 524288000) {
            iDKey2.SetKey(z17 ? 59 : 73);
        } else if (j18 < 629145600) {
            iDKey2.SetKey(z17 ? 60 : 74);
        } else if (j18 < 734003200) {
            iDKey2.SetKey(z17 ? 61 : 75);
        } else if (j18 < 838860800) {
            iDKey2.SetKey(z17 ? 62 : 76);
        } else if (j18 < 943718400) {
            iDKey2.SetKey(z17 ? 63 : 77);
        } else if (j18 < 1048576000) {
            iDKey2.SetKey(z17 ? 64 : 78);
        } else {
            iDKey2.SetKey(z17 ? 65 : 79);
        }
        arrayList.add(iDKey2);
        if (!com.tencent.mm.sdk.platformtools.z.f193115k) {
            com.tencent.mars.smc.IDKey iDKey3 = new com.tencent.mars.smc.IDKey();
            iDKey3.SetID(i17);
            iDKey3.SetValue(1L);
            long j19 = s3Var.f343948e;
            double d17 = j19;
            if (d17 < 1572864.0d) {
                iDKey3.SetKey(z17 ? 111 : 118);
            } else if (j19 < 2097152) {
                iDKey3.SetKey(z17 ? 112 : 119);
            } else if (d17 < 2621440.0d) {
                iDKey3.SetKey(z17 ? 113 : 120);
            } else if (j19 < 3145728) {
                iDKey3.SetKey(z17 ? 114 : 121);
            } else if (d17 < 3670016.0d) {
                iDKey3.SetKey(z17 ? 115 : 122);
            } else {
                iDKey3.SetKey(z17 ? 116 : 123);
            }
            arrayList.add(iDKey3);
        }
        com.tencent.mars.smc.IDKey iDKey4 = new com.tencent.mars.smc.IDKey();
        iDKey4.SetID(i17);
        iDKey4.SetValue(1L);
        int i18 = s3Var.f343968y;
        if (i18 < 102400) {
            iDKey4.SetKey(z17 ? 139 : com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback.INFO_LONG1_CLIP_EOS);
        } else if (i18 < 204800) {
            iDKey4.SetKey(z17 ? 140 : 154);
        } else if (i18 < 307200) {
            iDKey4.SetKey(z17 ? 141 : 155);
        } else if (i18 < 409600) {
            iDKey4.SetKey(z17 ? com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_LONG_SEEK_AV_PTS_ALIGN_MAX_THRESHOLD_MS : 156);
        } else if (i18 < 512000) {
            iDKey4.SetKey(z17 ? com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_BOOL_ENABLE_ORIGINAL_VIDEO_INFO_CALLBACK_FROM_SURFACE_LISTENER : 157);
        } else if (i18 < 614400) {
            iDKey4.SetKey(z17 ? 144 : 158);
        } else if (i18 < 716800) {
            iDKey4.SetKey(z17 ? 145 : com.tencent.mm.plugin.appbrand.jsapi.audio.e0.CTRL_INDEX);
        } else if (i18 < 819200) {
            iDKey4.SetKey(z17 ? 146 : 160);
        } else if (i18 < 921600) {
            iDKey4.SetKey(z17 ? 147 : 161);
        } else if (i18 < 1024000) {
            iDKey4.SetKey(z17 ? 148 : 162);
        } else {
            iDKey4.SetKey(z17 ? com.tencent.mm.plugin.appbrand.jsapi.pay.a2.CTRL_INDEX : 163);
        }
        arrayList.add(iDKey4);
        jx3.f.INSTANCE.b(arrayList, false);
    }
}
