package l44;

/* loaded from: classes4.dex */
public abstract class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static long f316037a;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040 A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:38:0x0032, B:13:0x0040, B:28:0x0049, B:32:0x0075, B:33:0x007c), top: B:37:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0049 A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:38:0x0032, B:13:0x0040, B:28:0x0049, B:32:0x0075, B:33:0x007c), top: B:37:0x0032 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(java.lang.String r13, com.tencent.mm.plugin.sns.storage.ADInfo r14) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l44.b0.a(java.lang.String, com.tencent.mm.plugin.sns.storage.ADInfo):boolean");
    }

    public static boolean b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("disableClickTimeCheck", "com.tencent.mm.plugin.sns.ad.helper.AdExpireDeleteHelper");
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_ad_timeline_click_expire_time_disabled, 0) > 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("disableClickTimeCheck", "com.tencent.mm.plugin.sns.ad.helper.AdExpireDeleteHelper");
        return z17;
    }

    public static boolean c(com.tencent.mm.plugin.sns.storage.AdSnsInfo adSnsInfo) {
        java.lang.String t07;
        int e17;
        boolean isExposured;
        com.tencent.mm.plugin.sns.storage.ADInfo adInfo;
        int i17;
        java.lang.String str;
        java.lang.String str2;
        int i18;
        boolean z17;
        boolean z18;
        long j17;
        int i19;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isAdExpired", "com.tencent.mm.plugin.sns.ad.helper.AdExpireDeleteHelper");
        if (adSnsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAdExpired", "com.tencent.mm.plugin.sns.ad.helper.AdExpireDeleteHelper");
            return false;
        }
        try {
            t07 = ca4.z0.t0(adSnsInfo.field_snsId);
            e17 = c01.id.e();
            isExposured = adSnsInfo.isExposured();
            adInfo = adSnsInfo.getAdInfo();
            i17 = adInfo.contractAdEndTime;
        } catch (java.lang.Throwable th6) {
            ca4.q.c("SnsAdSession_isAdExpired", th6);
        }
        if (i17 > 0 && i17 < e17 && !isExposured) {
            com.tencent.mars.xlog.Log.i("AdExpireDeleteHelper", "contract ad expired, snsId=" + t07);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAdExpired", "com.tencent.mm.plugin.sns.ad.helper.AdExpireDeleteHelper");
            return true;
        }
        com.tencent.mm.plugin.sns.storage.ADXml adXml = adSnsInfo.getAdXml();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("shouldDoDeletion", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("shouldDoDeletion", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper$Companion");
        if (adXml == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shouldDoDeletion", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper$Companion");
            str = "ad expired, snsId=";
            str2 = "isAdExpired, check clickTime not expired, snsId=";
            i18 = e17;
            z17 = isExposured;
            z18 = false;
        } else {
            str = "ad expired, snsId=";
            if (adXml.previewFlag == 1) {
                z17 = isExposured;
                if (adXml.previewExpiredTime > 0) {
                    i18 = e17;
                    str2 = "isAdExpired, check clickTime not expired, snsId=";
                    if (c01.id.e() >= adXml.previewExpiredTime) {
                        z18 = true;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shouldDoDeletion", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper$Companion");
                    }
                } else {
                    i18 = e17;
                    str2 = "isAdExpired, check clickTime not expired, snsId=";
                }
            } else {
                str2 = "isAdExpired, check clickTime not expired, snsId=";
                i18 = e17;
                z17 = isExposured;
            }
            z18 = false;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shouldDoDeletion", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper$Companion");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shouldDoDeletion", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper");
        if (z18) {
            com.tencent.mars.xlog.Log.i("AdExpireDeleteHelper", "Preview ad expired, snsId=" + t07);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAdExpired", "com.tencent.mm.plugin.sns.ad.helper.AdExpireDeleteHelper");
            return true;
        }
        if (!a(t07, adInfo)) {
            com.tencent.mars.xlog.Log.i("AdExpireDeleteHelper", str2 + t07);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAdExpired", "com.tencent.mm.plugin.sns.ad.helper.AdExpireDeleteHelper");
            return false;
        }
        if (z17) {
            j17 = adInfo.exposureNoActionExpireTime * 60;
            i19 = adSnsInfo.field_exposureTime;
        } else {
            j17 = adInfo.noExposureExpireTime * 60;
            i19 = adSnsInfo.field_createAdTime;
        }
        if (i18 - i19 >= j17) {
            java.lang.String r17 = c01.z1.r();
            boolean U = ca4.m0.U(com.tencent.mm.plugin.sns.model.s5.e(adSnsInfo.convertToSnsInfo()), r17);
            com.tencent.mars.xlog.Log.i("AdExpireDeleteHelper", str + t07 + ", hasCommentOrLike=" + U + ", isExposure=" + z17 + ", userName=" + r17);
            if (!U) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAdExpired", "com.tencent.mm.plugin.sns.ad.helper.AdExpireDeleteHelper");
                return true;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAdExpired", "com.tencent.mm.plugin.sns.ad.helper.AdExpireDeleteHelper");
        return false;
    }

    public static com.tencent.mm.plugin.sns.storage.AdSnsInfo d(com.tencent.mm.plugin.sns.storage.AdSnsInfo adSnsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetAdExposureInfo", "com.tencent.mm.plugin.sns.ad.helper.AdExpireDeleteHelper");
        if (adSnsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetAdExposureInfo", "com.tencent.mm.plugin.sns.ad.helper.AdExpireDeleteHelper");
            return null;
        }
        java.lang.String t07 = ca4.z0.t0(adSnsInfo.field_snsId);
        com.tencent.mars.xlog.Log.i("AdExpireDeleteHelper", "resetAdExposureInfo, snsId=" + t07 + ", exposureTime=" + adSnsInfo.field_exposureTime + ", exposureCount=" + i64.z0.a(adSnsInfo) + ", isExposured=" + adSnsInfo.isExposured());
        adSnsInfo.field_exposureTime = 0;
        adSnsInfo.field_exposureCount = 0;
        adSnsInfo.setNotExposured();
        i64.z0.b(t07);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetAdExposureInfo", "com.tencent.mm.plugin.sns.ad.helper.AdExpireDeleteHelper");
        return adSnsInfo;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0071 A[Catch: all -> 0x006c, TryCatch #0 {all -> 0x006c, blocks: (B:19:0x0063, B:13:0x0071, B:16:0x007b), top: B:18:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007b A[Catch: all -> 0x006c, TRY_LEAVE, TryCatch #0 {all -> 0x006c, blocks: (B:19:0x0063, B:13:0x0071, B:16:0x007b), top: B:18:0x0063 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(com.tencent.mm.plugin.sns.storage.SnsInfo r14) {
        /*
            java.lang.String r0 = "updateAdClickFlagInfo"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.helper.AdExpireDeleteHelper"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            boolean r2 = b()
            java.lang.String r3 = "AdExpireDeleteHelper"
            if (r2 == 0) goto L1a
            java.lang.String r14 = "updateAdClickFlagInfo, disableClickTimeCheck"
            com.tencent.mars.xlog.Log.i(r3, r14)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        L1a:
            if (r14 != 0) goto L26
            java.lang.String r14 = "updateAdClickFlagInfo, snsInfo is null"
            com.tencent.mars.xlog.Log.e(r3, r14)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        L26:
            long r4 = r14.field_snsId
            java.lang.String r14 = ca4.z0.t0(r4)
            com.tencent.mm.plugin.sns.storage.j0 r2 = new com.tencent.mm.plugin.sns.storage.j0
            r2.<init>()
            long r4 = java.lang.System.currentTimeMillis()
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 / r6
            r2.f166024a = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "updateAdClickFlagInfo, adClickFlagInfoJson is "
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r5 = ", snsId is "
            r4.append(r5)
            r4.append(r14)
            java.lang.String r4 = r4.toString()
            com.tencent.mars.xlog.Log.i(r3, r4)
            java.lang.String r3 = "saveAdClickFlagInfo, key is "
            java.lang.String r4 = "saveAdClickFlagInfo"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.storage.AdClickStorage"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            java.lang.String r6 = "AdClickStorage"
            if (r14 == 0) goto L6e
            int r7 = r14.length()     // Catch: java.lang.Throwable -> L6c
            if (r7 != 0) goto L6a
            goto L6e
        L6a:
            r7 = 0
            goto L6f
        L6c:
            r14 = move-exception
            goto Lbd
        L6e:
            r7 = 1
        L6f:
            if (r7 == 0) goto L7b
            java.lang.String r14 = "saveAdClickFlagInfo, snsId is null or empty"
            com.tencent.mars.xlog.Log.e(r6, r14)     // Catch: java.lang.Throwable -> L6c
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)     // Catch: java.lang.Throwable -> L6c
            goto Lc3
        L7b:
            com.tencent.mm.plugin.sns.storage.l0 r7 = com.tencent.mm.plugin.sns.storage.l0.f166043a     // Catch: java.lang.Throwable -> L6c
            java.lang.String r7 = r7.a(r14)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r8 = "toJson"
            java.lang.String r9 = "com.tencent.mm.plugin.sns.storage.AdClickFlagInfo"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r9)     // Catch: java.lang.Throwable -> L6c
            cl0.g r10 = new cl0.g     // Catch: java.lang.Throwable -> L6c
            r10.<init>()     // Catch: java.lang.Throwable -> L6c
            java.lang.String r11 = "clickTime"
            long r12 = r2.f166024a     // Catch: java.lang.Throwable -> L6c
            r10.p(r11, r12)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r2 = r10.toString()     // Catch: java.lang.Throwable -> L6c
            java.lang.String r10 = "toString(...)"
            kotlin.jvm.internal.o.f(r2, r10)     // Catch: java.lang.Throwable -> L6c
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r9)     // Catch: java.lang.Throwable -> L6c
            p34.o.h(r14, r7, r2)     // Catch: java.lang.Throwable -> L6c
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6c
            r14.<init>(r3)     // Catch: java.lang.Throwable -> L6c
            r14.append(r7)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r3 = ", ret is "
            r14.append(r3)     // Catch: java.lang.Throwable -> L6c
            r14.append(r2)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r14 = r14.toString()     // Catch: java.lang.Throwable -> L6c
            com.tencent.mars.xlog.Log.i(r6, r14)     // Catch: java.lang.Throwable -> L6c
            goto Lc0
        Lbd:
            ca4.q.c(r6, r14)
        Lc0:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
        Lc3:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l44.b0.e(com.tencent.mm.plugin.sns.storage.SnsInfo):void");
    }

    public static boolean f(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateAdDetail", "com.tencent.mm.plugin.sns.ad.helper.AdExpireDeleteHelper");
        boolean z17 = false;
        if (snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateAdDetail", "com.tencent.mm.plugin.sns.ad.helper.AdExpireDeleteHelper");
            return false;
        }
        long j17 = snsInfo.field_snsId;
        java.util.List list = com.tencent.mm.plugin.sns.model.k2.f164348h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addDetailReq", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdObjectDetial");
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        java.util.List list2 = com.tencent.mm.plugin.sns.model.k2.f164348h;
        if (list2.contains(valueOf)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addDetailReq", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdObjectDetial");
        } else {
            list2.add(java.lang.Long.valueOf(j17));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addDetailReq", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdObjectDetial");
            z17 = true;
        }
        if (z17) {
            com.tencent.mm.plugin.sns.model.k2 k2Var = new com.tencent.mm.plugin.sns.model.k2(j17, 1, snsInfo.getAdInfo().adInfoSyncBuffer);
            gm0.j1.i();
            gm0.j1.n().f273288b.g(k2Var);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateAdDetail", "com.tencent.mm.plugin.sns.ad.helper.AdExpireDeleteHelper");
        return true;
    }
}
