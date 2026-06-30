package com.tencent.mm.plugin.game.model.silent_download;

/* loaded from: classes8.dex */
public abstract class u {
    public static void a(java.lang.String str, int i17, int i18) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo a17 = com.tencent.mm.plugin.game.model.silent_download.k.a(str);
        if (a17 != null) {
            long j17 = a17.f96961d;
            if (j17 > 0) {
                java.lang.String str2 = a17.f96962e;
                long j18 = a17.f96968n;
                b(str, j17, str2, j18 == 0 ? 0 : (int) ((a17.f96967m * 100) / j18), i17, i18, false, false, false, false, false, null);
                return;
            }
        }
        b(str, 0L, "", 0, i17, i18, false, false, false, false, false, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00d8 A[LOOP:0: B:16:0x00d6->B:17:0x00d8, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(java.lang.String r15, long r16, java.lang.String r18, int r19, int r20, int r21, boolean r22, boolean r23, boolean r24, boolean r25, boolean r26, java.util.Map r27) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.game.model.silent_download.u.b(java.lang.String, long, java.lang.String, int, int, int, boolean, boolean, boolean, boolean, boolean, java.util.Map):void");
    }

    public static void c(java.lang.String str, int i17, int i18) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Zi().y0(str) == null) {
            return;
        }
        a(str, i17, i18);
    }

    public static void d(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo a17 = com.tencent.mm.plugin.game.model.silent_download.k.a(str);
        com.tencent.mm.plugin.game.model.silent_download.n y07 = ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Zi().y0(str);
        if (a17 != null) {
            long j17 = a17.f96961d;
            if (j17 > 0) {
                if (y07 != null) {
                    java.lang.String str2 = a17.f96962e;
                    long j18 = a17.f96968n;
                    b(str, j17, str2, j18 == 0 ? 0 : (int) ((a17.f96967m * 100) / j18), 3, 0, y07.field_noWifi, y07.field_noSdcard, y07.field_noEnoughSpace, y07.field_lowBattery, y07.field_continueDelay, null);
                    return;
                } else {
                    java.lang.String str3 = a17.f96962e;
                    long j19 = a17.f96968n;
                    b(str, j17, str3, j19 == 0 ? 0 : (int) ((a17.f96967m * 100) / j19), 3, 0, false, false, false, false, false, null);
                    return;
                }
            }
        }
        if (y07 != null) {
            b(str, 0L, "", 0, 3, 0, y07.field_noWifi, y07.field_noSdcard, y07.field_noEnoughSpace, y07.field_lowBattery, y07.field_continueDelay, null);
        } else {
            b(str, 0L, "", 0, 3, 0, false, false, false, false, false, null);
        }
    }
}
