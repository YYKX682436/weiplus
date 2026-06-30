package n74;

/* loaded from: classes4.dex */
public abstract class w1 {
    public static int a(com.tencent.mm.plugin.sns.storage.ADXml aDXml, boolean z17, boolean z18, int i17) {
        int i18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdTypeKey", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineStaticHelper");
        if (aDXml.isFullCardAd()) {
            if (aDXml.isLongPressGestureAd()) {
                i18 = 22;
            } else if (aDXml.isGestureAd()) {
                i18 = 23;
            } else if (aDXml.isTwistAd()) {
                i18 = 24;
            } else if (aDXml.isShakeAd()) {
                i18 = 25;
            } else if (aDXml.isAdBreakFrameVideo()) {
                i18 = 26;
            } else if (aDXml.isAdSolidBreakFrameVideo()) {
                i18 = 66;
            } else if (aDXml.isAdIpInteractVideo()) {
                i18 = 44;
            } else if (aDXml.isRandomPickCardAd()) {
                i18 = 49;
            } else if (z18) {
                i18 = 11;
            } else {
                if (z17) {
                    i18 = 12;
                }
                i18 = 15;
            }
        } else if (aDXml.isDynamicAD()) {
            if (aDXml.isCardAd()) {
                i18 = 55;
            } else if (aDXml.isCombinedGridAD()) {
                i18 = 56;
            } else if (z17) {
                i18 = 57;
            } else {
                if (z18) {
                    i18 = i17 <= 1 ? 58 : 59;
                }
                i18 = 15;
            }
        } else if (aDXml.isCardAd()) {
            i18 = z18 ? 9 : z17 ? 10 : 52;
        } else if (aDXml.isSphereCardAd()) {
            i18 = 13;
        } else if (aDXml.isFinderTopicCard() || aDXml.isSlideFullCard()) {
            i18 = 14;
        } else if (aDXml.isCombinedGridAD()) {
            i18 = 43;
        } else if (aDXml.isLookbookCardAd()) {
            i18 = aDXml.isLookBookAdHasPagTheme() ? 63 : aDXml.isLookBookAdHasSplashCard() ? 64 : 47;
        } else if (aDXml.isFlipCardAd()) {
            i18 = 67;
        } else if (z18) {
            i18 = i17 <= 1 ? 53 : 54;
        } else {
            if (z17) {
                i18 = 8;
            }
            i18 = 15;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdTypeKey", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineStaticHelper");
        return i18;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0068 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(int r11, com.tencent.mm.plugin.sns.storage.ADXml r12, com.tencent.mm.protocal.protobuf.TimeLineObject r13) {
        /*
            java.lang.String r0 = "reportAdType, contentStyle="
            java.lang.String r1 = "reportAdType"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineStaticHelper"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            r3 = 4
            java.lang.String r4 = "TimeLineStaticHelper"
            r5 = 5
            r6 = 1
            r7 = 1697(0x6a1, float:2.378E-42)
            if (r11 != r3) goto L1d
            com.tencent.mm.plugin.report.service.g0 r11 = com.tencent.mm.plugin.report.service.g0.INSTANCE     // Catch: java.lang.Throwable -> L1a
            r11.A(r7, r5)     // Catch: java.lang.Throwable -> L1a
            goto L25
        L1a:
            r11 = move-exception
            goto Lb8
        L1d:
            if (r11 != r6) goto L25
            com.tencent.mm.plugin.report.service.g0 r11 = com.tencent.mm.plugin.report.service.g0.INSTANCE     // Catch: java.lang.Throwable -> L1a
            r3 = 6
            r11.A(r7, r3)     // Catch: java.lang.Throwable -> L1a
        L25:
            boolean r11 = r12.usePreferedInfo     // Catch: java.lang.Throwable -> L1a
            if (r11 == 0) goto L31
            com.tencent.mm.plugin.report.service.g0 r11 = com.tencent.mm.plugin.report.service.g0.INSTANCE     // Catch: java.lang.Throwable -> L1a
            r3 = 71
            r11.A(r7, r3)     // Catch: java.lang.Throwable -> L1a
            goto L38
        L31:
            com.tencent.mm.plugin.report.service.g0 r11 = com.tencent.mm.plugin.report.service.g0.INSTANCE     // Catch: java.lang.Throwable -> L1a
            r3 = 72
            r11.A(r7, r3)     // Catch: java.lang.Throwable -> L1a
        L38:
            r45.a90 r11 = r13.ContentObj     // Catch: java.lang.Throwable -> L1a
            int r11 = r11.f369837e     // Catch: java.lang.Throwable -> L1a
            r3 = 15
            r8 = 0
            if (r11 == r3) goto L4c
            if (r11 != r5) goto L44
            goto L4c
        L44:
            if (r11 != r6) goto L49
            r3 = r6
            r6 = r8
            goto L4d
        L49:
            r3 = r8
            r6 = r3
            goto L4d
        L4c:
            r3 = r8
        L4d:
            java.lang.String r5 = "getMediaSize"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r2)     // Catch: java.lang.Throwable -> L1a
            r45.a90 r9 = r13.ContentObj     // Catch: java.lang.Throwable -> L1a
            if (r9 == 0) goto L63
            java.util.LinkedList r9 = r9.f369840h     // Catch: java.lang.Throwable -> L1a
            if (r9 != 0) goto L5b
            goto L63
        L5b:
            int r8 = r9.size()     // Catch: java.lang.Throwable -> L1a
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r2)     // Catch: java.lang.Throwable -> L1a
            goto L66
        L63:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r2)     // Catch: java.lang.Throwable -> L1a
        L66:
            if (r6 != 0) goto L6a
            if (r3 == 0) goto L6c
        L6a:
            if (r8 != 0) goto L75
        L6c:
            java.lang.String r5 = "ad_content_ad_exp"
            java.lang.String r9 = r13.Id     // Catch: java.lang.Throwable -> L1a
            java.lang.String r10 = ""
            ca4.e0.a(r5, r9, r11, r8, r10)     // Catch: java.lang.Throwable -> L1a
        L75:
            int r12 = a(r12, r6, r3, r8)     // Catch: java.lang.Throwable -> L1a
            com.tencent.mm.plugin.report.service.g0 r5 = com.tencent.mm.plugin.report.service.g0.INSTANCE     // Catch: java.lang.Throwable -> L1a
            r5.A(r7, r12)     // Catch: java.lang.Throwable -> L1a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1a
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L1a
            r5.append(r11)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r11 = ", mediaSize="
            r5.append(r11)     // Catch: java.lang.Throwable -> L1a
            r5.append(r8)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r11 = ", isVideo="
            r5.append(r11)     // Catch: java.lang.Throwable -> L1a
            r5.append(r6)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r11 = ", isPhoto="
            r5.append(r11)     // Catch: java.lang.Throwable -> L1a
            r5.append(r3)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r11 = ", idKey="
            r5.append(r11)     // Catch: java.lang.Throwable -> L1a
            r5.append(r12)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r11 = ", id="
            r5.append(r11)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r11 = r13.Id     // Catch: java.lang.Throwable -> L1a
            r5.append(r11)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r11 = r5.toString()     // Catch: java.lang.Throwable -> L1a
            com.tencent.mars.xlog.Log.i(r4, r11)     // Catch: java.lang.Throwable -> L1a
            goto Lce
        Lb8:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "reportAdType, exp="
            r12.<init>(r13)
            java.lang.String r11 = r11.toString()
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            com.tencent.mars.xlog.Log.e(r4, r11)
        Lce:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n74.w1.b(int, com.tencent.mm.plugin.sns.storage.ADXml, com.tencent.mm.protocal.protobuf.TimeLineObject):void");
    }

    public static void c(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportNetType", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineStaticHelper");
        try {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            if (com.tencent.mars.comm.NetStatusUtil.isWifi(context)) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1697, 27);
            } else if (com.tencent.mars.comm.NetStatusUtil.is5G(context)) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1697, 28);
            } else if (com.tencent.mars.comm.NetStatusUtil.is4G(context)) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1697, 29);
            } else {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1697, 30);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("TimeLineStaticHelper", "reportNetType, exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportNetType", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineStaticHelper");
    }
}
