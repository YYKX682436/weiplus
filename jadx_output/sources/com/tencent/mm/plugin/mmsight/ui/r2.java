package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes10.dex */
public class r2 implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f149412d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.ui.s2 f149413e;

    public r2(com.tencent.mm.plugin.mmsight.ui.s2 s2Var, long j17) {
        this.f149413e = s2Var;
        this.f149412d = j17;
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return "BigSightFFMpegRecorder_markAfterCaptureFinish_idkeystat";
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        int i18;
        int i19;
        int i27;
        int i28;
        int i29;
        com.tencent.mm.plugin.mmsight.ui.r2 r2Var = this;
        com.tencent.mm.plugin.mmsight.ui.s2 s2Var = r2Var.f149413e;
        java.lang.String filePath = s2Var.f149417d.f149235m.getFilePath();
        r45.vh4 vh4Var = s2Var.f149417d.M;
        di3.f0 f0Var = di3.w.f232770d;
        int i37 = f0Var.f232700a;
        int i38 = f0Var.f232706g;
        try {
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMSightRecorderIDKeyStat", "markAfterCaptureFinish error: %s", e17.getMessage());
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(filePath)) {
            if (!com.tencent.mm.vfs.w6.j(filePath)) {
                di3.x.b(false, r2Var.f149412d);
            }
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.idkeyStat(440L, 87L, 1L, false);
            org.json.JSONObject jSONObject = new org.json.JSONObject(com.tencent.mm.plugin.sight.base.SightVideoJNI.getSimpleMp4InfoVFS(filePath));
            int i39 = (int) jSONObject.getDouble("videoFPS");
            int optInt = jSONObject.optInt("videoBitrate");
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRecorderIDKeyStat", "markAfterCaptureFinish, videoFPS: %s, videoBitrate: %s, recorderType: %s, resolutionLimit: %s", java.lang.Integer.valueOf(i39), java.lang.Integer.valueOf(optInt), java.lang.Integer.valueOf(i37), java.lang.Integer.valueOf(i38));
            di3.b.b().a(filePath, i39);
            if (i37 == 1) {
                i17 = optInt;
                i18 = i39;
                g0Var.idkeyStat(440L, 89L, 1L, false);
                g0Var.idkeyStat(440L, 49L, i18, false);
                i19 = 69;
                i27 = 93;
                i28 = 73;
            } else {
                i17 = optInt;
                i18 = i39;
                g0Var.idkeyStat(440L, 88L, 1L, false);
                g0Var.idkeyStat(440L, 48L, i18, false);
                i19 = 50;
                i27 = 90;
                i28 = 54;
            }
            if (i38 == 720) {
                i19 += 6;
                i27++;
                i28 += 6;
            } else {
                di3.f0 f0Var2 = di3.w.f232770d;
                if ((f0Var2.f232701b.f71191d < f0Var2.f232706g) || i38 == 1080) {
                    i19 += 12;
                    i27 += 2;
                    i28 += 12;
                }
            }
            int i47 = i19;
            int i48 = i27;
            long j17 = i18;
            g0Var.idkeyStat(440L, i28, j17, false);
            g0Var.idkeyStat(440L, i48, 1L, false);
            g0Var.idkeyStat(440L, 47L, j17, false);
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRecorderIDKeyStat", "markAfterCaptureFinish, filePath: %s base %d", filePath, java.lang.Integer.valueOf(i47));
            if (i18 < 0 || i18 > 10) {
                i29 = 1;
                if (i18 > 10 && i18 <= 15) {
                    g0Var.idkeyStat(440L, i47 + 1, 1L, false);
                } else if (i18 > 15 && i18 <= 20) {
                    g0Var.idkeyStat(440L, i47 + 2, 1L, false);
                } else if (i18 > 20 && i18 <= 30) {
                    g0Var.idkeyStat(440L, i47 + 3, 1L, false);
                }
            } else {
                i29 = 1;
                g0Var.idkeyStat(440L, i47, 1L, false);
            }
            int i49 = i17;
            if (i49 > 0) {
                if (i37 == 2) {
                    long j18 = i49;
                    g0Var.idkeyStat(440L, 175L, j18, false);
                    g0Var.idkeyStat(440L, 176L, 1L, false);
                    if (vh4Var != null) {
                        int i57 = vh4Var.f388237g;
                        if (i57 == i29) {
                            g0Var.idkeyStat(440L, 184L, j18, false);
                            g0Var.idkeyStat(440L, 185L, 1L, false);
                        } else if (i57 == 2) {
                            g0Var.idkeyStat(440L, 194L, j18, false);
                            g0Var.idkeyStat(440L, 195L, 1L, false);
                        }
                    }
                } else {
                    long j19 = i49;
                    g0Var.idkeyStat(440L, 179L, j19, false);
                    g0Var.idkeyStat(440L, 180L, 1L, false);
                    if (vh4Var != null) {
                        int i58 = vh4Var.f388237g;
                        if (i58 == i29) {
                            g0Var.idkeyStat(440L, 189L, j19, false);
                            g0Var.idkeyStat(440L, 190L, 1L, false);
                        } else if (i58 == 2) {
                            g0Var.idkeyStat(440L, 199L, j19, false);
                            g0Var.idkeyStat(440L, 200L, 1L, false);
                        }
                    }
                }
            }
        }
        r2Var = this;
        di3.x.b(false, r2Var.f149412d);
    }
}
