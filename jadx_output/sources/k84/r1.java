package k84;

/* loaded from: classes4.dex */
public final class r1 {
    public r1(kotlin.jvm.internal.i iVar) {
    }

    public final boolean a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("disablePagPlay", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$Companion");
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_sns_ad_disable_adfirework_pag_play_android, 0) == 1;
        com.tencent.mars.xlog.Log.i("AdFireworkCheerComponent", "disablePagPlayInOs14:android os >= 34, shouldDisablePlay " + z17);
        if (android.os.Build.VERSION.SDK_INT < 34) {
            com.tencent.mars.xlog.Log.i("AdFireworkCheerComponent", "disablePagPlayInOs14:android os < 34, not disable play");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("disablePagPlay", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$Companion");
            return false;
        }
        if (z17) {
            c(9);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("disablePagPlay", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$Companion");
        return z17;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(com.tencent.mm.plugin.sns.storage.SnsInfo r10) {
        /*
            r9 = this;
            java.lang.String r0 = "getFireworkGoldColor"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$Companion"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.String r2 = "com.tencent.mm.plugin.sns.storage.adsocial.ColorEntity"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.storage.adsocial.FireworkCheerInfo"
            java.lang.String r4 = "getLikedColor"
            r5 = 0
            if (r10 == 0) goto L33
            com.tencent.mm.plugin.sns.storage.ADXml r6 = r10.getAdXml()
            if (r6 == 0) goto L33
            mb4.c r6 = r6.adSocialInfo
            if (r6 == 0) goto L33
            mb4.r r6 = r6.f325388m
            if (r6 == 0) goto L33
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r3)
            mb4.o r6 = r6.f325454a
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r3)
            if (r6 == 0) goto L33
            java.lang.String r7 = "getColor"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r2)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r2)
            java.lang.String r6 = r6.f325447a
            goto L34
        L33:
            r6 = r5
        L34:
            s74.u3 r7 = s74.u3.f404562a
            boolean r8 = com.tencent.mm.ui.bk.C()
            if (r8 != 0) goto L3d
            goto L71
        L3d:
            if (r10 == 0) goto L61
            com.tencent.mm.plugin.sns.storage.ADXml r10 = r10.getAdXml()
            if (r10 == 0) goto L61
            mb4.c r10 = r10.adSocialInfo
            if (r10 == 0) goto L61
            mb4.r r10 = r10.f325388m
            if (r10 == 0) goto L61
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r3)
            mb4.o r10 = r10.f325454a
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r3)
            if (r10 == 0) goto L61
            java.lang.String r3 = "getColorDark"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r2)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r2)
            java.lang.String r5 = r10.f325448b
        L61:
            if (r5 == 0) goto L6c
            boolean r10 = r26.n0.N(r5)
            if (r10 == 0) goto L6a
            goto L6c
        L6a:
            r10 = 0
            goto L6d
        L6c:
            r10 = 1
        L6d:
            if (r10 == 0) goto L70
            goto L71
        L70:
            r6 = r5
        L71:
            if (r6 != 0) goto L75
            java.lang.String r6 = ""
        L75:
            android.content.Context r10 = com.tencent.mm.sdk.platformtools.x2.f193071a
            r2 = 2131102266(0x7f060a3a, float:1.7816965E38)
            int r10 = r10.getColor(r2)
            int r10 = r7.w(r6, r10)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: k84.r1.b(com.tencent.mm.plugin.sns.storage.SnsInfo):int");
    }

    public final void c(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("idKeyReport", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$Companion");
        com.tencent.mars.xlog.Log.i("AdFireworkCheerComponent", "adIdKeyReport:" + i17);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(2037, i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("idKeyReport", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$Companion");
    }
}
