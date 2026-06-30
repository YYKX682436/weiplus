package di3;

/* loaded from: classes10.dex */
public abstract class x {
    public static void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRecorderIDKeyStat", "markCapture");
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.idkeyStat(440L, 0L, 1L, false);
        di3.f0 f0Var = di3.w.f232770d;
        if (f0Var != null) {
            int i17 = f0Var.f232700a == 1 ? 39 : 36;
            int i18 = f0Var.f232706g;
            if (i18 == 720) {
                i17++;
            } else {
                if (f0Var.f232701b.f71191d < i18) {
                    i17 += 2;
                }
            }
            g0Var.idkeyStat(440L, i17, 1L, false);
        }
    }

    public static void b(boolean z17, long j17) {
        int i17;
        int i18;
        int i19;
        di3.b.b().G = j17;
        di3.b b17 = di3.b.b();
        b17.getClass();
        m21.x xVar = new m21.x();
        m21.x xVar2 = new m21.x();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = b17.f232652a;
        sb6.append(str);
        sb6.append(",");
        xVar.b("model", sb6.toString());
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        java.lang.String str2 = b17.f232653b;
        sb7.append(str2);
        sb7.append(",");
        xVar.b("apiLevel", sb7.toString());
        xVar.b("memoryClass", b17.f232654c + ",");
        xVar.b("totalMemory", b17.f232655d + ",");
        xVar.b("maxCpu", b17.f232656e + ",");
        xVar.b("screenW", b17.f232657f + ",");
        xVar.b("screenH", b17.f232658g + ",");
        xVar2.b("model", str + ",");
        xVar2.b("apiLevel", str2 + ",");
        xVar2.b("memoryClass", b17.f232654c + ",");
        xVar2.b("totalMemory", b17.f232655d + ",");
        xVar2.b("maxCpu", b17.f232656e + ",");
        xVar2.b("screenW", b17.f232657f + ",");
        xVar2.b("screenH", b17.f232658g + ",");
        xVar.b("cropx", b17.f232663l + ",");
        xVar.b("cropy", b17.f232664m + ",");
        xVar.b("previewx", b17.f232665n + ",");
        xVar.b("previewy", b17.f232666o + ",");
        xVar.b("encoderx", b17.f232667p + ",");
        xVar.b("encodery", b17.f232668q + ",");
        xVar.b(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VIDEO_ROTATION, b17.f232669r + ",");
        xVar.b("deviceoutfps", b17.f232670s + ",");
        xVar.b("recordfps", b17.f232671t + ",");
        xVar.b("recordertype", b17.f232672u + ",");
        xVar.b("videoBitrate", b17.f232673v + ",");
        xVar.b("needRotateEachFrame", b17.f232674w + ",");
        xVar.b("isNeedRealtimeScale", b17.f232675x + ",");
        xVar.b("resolutionLimit", b17.f232676y + ",");
        xVar.b("outfps", b17.f232677z + ",");
        xVar.b("recordTime", b17.A + ",");
        xVar.b("avgcpu", b17.B + ",");
        xVar.b("outx", b17.C + ",");
        xVar.b("outy", b17.D + ",");
        xVar.b("outbitrate", b17.E + ",");
        xVar.b("fileSize", b17.F + ",");
        xVar.b("wait2playtime", b17.G + ",");
        xVar.b("useback", b17.H + ",");
        android.content.Intent registerReceiver = com.tencent.mm.sdk.platformtools.x2.f193071a.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("status", -1);
            i18 = (intExtra == 2 || intExtra == 5) ? 1 : 0;
            i19 = registerReceiver.getIntExtra(ya.b.LEVEL, -1);
            i17 = registerReceiver.getIntExtra("scale", -1);
        } else {
            i17 = 0;
            i18 = 0;
            i19 = 0;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CaptureStatistics", "battery %s %s %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i17));
        xVar.b("mIsCharging", i18 + ",");
        xVar.b(ya.b.LEVEL, i19 + ",");
        xVar.b("scale", i17 + ",");
        xVar.b("createTime", java.lang.System.currentTimeMillis() + ",");
        xVar2.b("prewViewlist1", b17.f232659h + ",");
        xVar2.b("pictureSize1", b17.f232660i + ",");
        xVar2.b("prewViewlist2", b17.f232661j + ",");
        xVar2.b("pictureSize2", b17.f232662k + ",");
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("report ");
        sb8.append(xVar.c());
        com.tencent.mars.xlog.Log.i("MicroMsg.CaptureStatistics", sb8.toString());
        xVar2.c();
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.kvStat(13947, xVar.toString());
        g0Var.kvStat(13949, xVar2.toString());
        if (!z17) {
            g0Var.idkeyStat(440L, 124L, 1L, false);
            g0Var.idkeyStat(440L, 125L, j17, false);
            if (di3.w.f232770d.f232700a == 1) {
                g0Var.idkeyStat(440L, 127L, j17, false);
                g0Var.idkeyStat(440L, 131L, j17, false);
                return;
            } else {
                g0Var.idkeyStat(440L, 126L, j17, false);
                g0Var.idkeyStat(440L, 130L, j17, false);
                return;
            }
        }
        g0Var.idkeyStat(440L, 119L, 1L, false);
        g0Var.idkeyStat(440L, 120L, j17, false);
        di3.f0 f0Var = di3.w.f232770d;
        int i27 = f0Var.f232706g;
        if (i27 == 720) {
            g0Var.idkeyStat(440L, 122L, j17, false);
            return;
        }
        if (f0Var.f232701b.f71191d < i27) {
            g0Var.idkeyStat(440L, 123L, j17, false);
        } else {
            g0Var.idkeyStat(440L, 121L, j17, false);
        }
    }

    public static void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRecorderIDKeyStat", "markFFMpegInitError");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(440L, 7L, 1L, false);
    }

    public static void d() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRecorderIDKeyStat", "markMediaCodecInitError");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(440L, 8L, 1L, false);
    }

    public static void e() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRecorderIDKeyStat", "markMediaCodecMuxError");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(440L, 31L, 1L, false);
    }

    public static void f() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRecorderIDKeyStat", "markMediaCodecYUVInitError");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(440L, 16L, 1L, false);
    }

    public static void g(java.lang.String str, int i17, int i18) {
        try {
            if (di3.w.f232770d != null) {
                int optInt = new org.json.JSONObject(com.tencent.mm.plugin.sight.base.SightVideoJNI.getSimpleMp4InfoVFS(str)).optInt("videoBitrate");
                if (i18 == 1) {
                    if (i17 == 1) {
                        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                        g0Var.idkeyStat(440L, 189L, optInt, false);
                        g0Var.idkeyStat(440L, 190L, 1L, false);
                    } else {
                        com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                        g0Var2.idkeyStat(440L, 184L, optInt, false);
                        g0Var2.idkeyStat(440L, 185L, 1L, false);
                    }
                } else if (i18 == 2) {
                    if (i17 == 1) {
                        com.tencent.mm.plugin.report.service.g0 g0Var3 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                        g0Var3.idkeyStat(440L, 194L, optInt, false);
                        g0Var3.idkeyStat(440L, 195L, 1L, false);
                    } else {
                        com.tencent.mm.plugin.report.service.g0 g0Var4 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                        g0Var4.idkeyStat(440L, 199L, optInt, false);
                        g0Var4.idkeyStat(440L, 200L, 1L, false);
                    }
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMSightRecorderIDKeyStat", "markAfterCaptureFinish error: %s", e17.getMessage());
        }
    }
}
