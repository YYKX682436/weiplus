package rs0;

/* loaded from: classes10.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final rs0.p f399310a = new rs0.p();

    /* renamed from: b, reason: collision with root package name */
    public static long f399311b = -1;

    public final void a(java.lang.String filePath, int i17, int i18) {
        int i19;
        int i27;
        int i28;
        int i29;
        int i37;
        kotlin.jvm.internal.o.g(filePath, "filePath");
        try {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(filePath) && com.tencent.mm.vfs.w6.j(filePath)) {
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                g0Var.idkeyStat(985L, 69L, 1L, false);
                org.json.JSONObject jSONObject = new org.json.JSONObject(com.tencent.mm.plugin.sight.base.SightVideoJNI.getSimpleMp4InfoVFS(filePath));
                int i38 = (int) jSONObject.getDouble("videoFPS");
                com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "markAfterCaptureFinish, videoFPS: %s, videoBitrate: %s, recorderType: %s, resolutionLimit: %s", java.lang.Integer.valueOf(i38), java.lang.Integer.valueOf(jSONObject.optInt("videoBitrate")), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
                if (i17 == 1) {
                    g0Var.idkeyStat(985L, 71L, 1L, false);
                    g0Var.idkeyStat(985L, 73L, i38, false);
                    i19 = 74;
                    i27 = 95;
                    i28 = 98;
                    i29 = 107;
                    i37 = 108;
                } else {
                    g0Var.idkeyStat(985L, 70L, 1L, false);
                    g0Var.idkeyStat(985L, 72L, i38, false);
                    i19 = 57;
                    i27 = 86;
                    i28 = 89;
                    i29 = 104;
                    i37 = 105;
                }
                int i39 = i29;
                int i47 = i37;
                if (i18 == 720) {
                    i19 += 4;
                    i27++;
                    i28++;
                } else {
                    di3.f0 f0Var = di3.w.f232770d;
                    if ((f0Var.f232701b.f71191d < f0Var.f232706g) || i18 == 1080) {
                        i19 += 8;
                        i27 += 2;
                        i28 += 2;
                    }
                }
                int i48 = i19;
                int i49 = i28;
                g0Var.idkeyStat(985L, i27, 1L, false);
                long j17 = i38;
                g0Var.idkeyStat(985L, i49, j17, false);
                g0Var.idkeyStat(985L, i39, 1L, false);
                g0Var.idkeyStat(985L, i47, j17, false);
                com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "markAfterCaptureFinish, filePath: %s base %d", filePath, java.lang.Integer.valueOf(i48));
                if (i38 >= 0 && i38 <= 10) {
                    g0Var.idkeyStat(985L, i48, 1L, false);
                    return;
                }
                if (i38 > 10 && i38 <= 15) {
                    g0Var.idkeyStat(985L, i48 + 1, 1L, false);
                    return;
                }
                if (i38 > 15 && i38 <= 20) {
                    g0Var.idkeyStat(985L, i48 + 2, 1L, false);
                } else {
                    if (i38 <= 20 || i38 > 30) {
                        return;
                    }
                    g0Var.idkeyStat(985L, i48 + 3, 1L, false);
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MediaEditorIDKeyStat", "markAfterCaptureFinish error: %s", e17.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(java.lang.String path) {
        hs0.a aVar;
        kotlin.jvm.internal.o.g(path, "path");
        if (com.tencent.mm.vfs.w6.j(path)) {
            hs0.a aVar2 = null;
            hs0.a aVar3 = null;
            try {
                try {
                    aVar = new hs0.a(path);
                } catch (java.lang.Throwable th6) {
                    th = th6;
                }
            } catch (java.lang.Exception e17) {
                e = e17;
            }
            try {
                android.media.MediaFormat mediaFormat = aVar.f284552f;
                android.media.MediaFormat mediaFormat2 = aVar.f284551e;
                boolean z17 = true;
                long j17 = mediaFormat != null && mediaFormat.containsKey("durationUs") ? mediaFormat.getLong("durationUs") : -1L;
                if (mediaFormat2 == 0 || !mediaFormat2.containsKey("durationUs")) {
                    z17 = false;
                }
                long j18 = z17 ? mediaFormat2.getLong("durationUs") : -1L;
                com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "markCheckRemuxResult, videoDuration:" + j18 + ", audioDuration:" + j17);
                if (j17 > 0 && j18 > 0 && (((float) java.lang.Math.max(j17, j18)) * 1.0f) / ((float) java.lang.Math.min(j17, j18)) >= 1.5d) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "duration not match, report error");
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.C(986L, 146L, 1L);
                }
                aVar.d();
                aVar2 = mediaFormat2;
            } catch (java.lang.Exception e18) {
                e = e18;
                aVar3 = aVar;
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MediaEditorIDKeyStat", e, "", new java.lang.Object[0]);
                aVar2 = aVar3;
                if (aVar3 != null) {
                    aVar3.d();
                    aVar2 = aVar3;
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
                aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.d();
                }
                throw th;
            }
        }
    }

    public final void c(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "markMediaCodecCaptureResult, mixType:" + i17);
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.C(986L, 0L, 1L);
        if (i17 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxSlient");
            g0Var.C(986L, 4L, 1L);
            return;
        }
        if (i17 == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxNoMusic");
            g0Var.C(986L, 1L, 1L);
        } else if (i17 == 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxMusicOnly");
            g0Var.C(986L, 3L, 1L);
        } else {
            if (i17 != 3) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxMusicBackground");
            g0Var.C(986L, 2L, 1L);
        }
    }

    public final void d(int i17, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxSuccess, mixType:" + i17 + ", time:" + j17);
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.C(986L, 34L, 1L);
        if (i17 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxTimeSlient, time:" + j17);
            g0Var.C(986L, 39L, j17);
            return;
        }
        if (i17 == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxTimeNoMusic, time:" + j17);
            g0Var.C(986L, 35L, j17);
            return;
        }
        if (i17 == 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxTimeMusicOnly, time:" + j17);
            g0Var.C(986L, 37L, j17);
            return;
        }
        if (i17 != 3) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxTimeAll, time:" + j17);
        g0Var.C(986L, 41L, j17);
    }

    public final void e(long j17, long j18, long j19) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxSuccessResult, bitrate:" + j17 + ", fps:" + j18 + ", originVideoFps:" + j19);
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.C(986L, 43L, j19);
        g0Var.C(986L, 45L, j18);
        g0Var.C(986L, 48L, j17);
    }
}
