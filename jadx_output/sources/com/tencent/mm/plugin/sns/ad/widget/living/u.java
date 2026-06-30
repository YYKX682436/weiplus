package com.tencent.mm.plugin.sns.ad.widget.living;

/* loaded from: classes4.dex */
public final class u {
    public u(kotlin.jvm.internal.i iVar) {
    }

    public final boolean a(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        java.lang.String str;
        java.lang.String str2;
        s34.e0 a17;
        java.lang.Long a18;
        s34.e0 a19;
        s34.e0 a27;
        s34.e0 a28;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkShowAdLivingStream", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper$Companion");
        if (snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkShowAdLivingStream", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper$Companion");
            return false;
        }
        if (snsInfo.getAdXml().adFinderLiveStreamInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkShowAdLivingStream", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper$Companion");
            return false;
        }
        s34.g0 g0Var = snsInfo.getAdXml().adFinderLiveStreamInfo;
        if (g0Var == null || g0Var.a() == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkShowAdLivingStream", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper$Companion");
            return false;
        }
        java.lang.String[] strArr = new java.lang.String[3];
        s34.g0 g0Var2 = snsInfo.getAdXml().adFinderLiveStreamInfo;
        java.lang.String str3 = null;
        if (g0Var2 == null || (a28 = g0Var2.a()) == null) {
            str = null;
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFinderLiveExportId", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo$FinderLiveInfo");
            str = a28.f402622a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFinderLiveExportId", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo$FinderLiveInfo");
        }
        strArr[0] = str;
        s34.g0 g0Var3 = snsInfo.getAdXml().adFinderLiveStreamInfo;
        if (g0Var3 == null || (a27 = g0Var3.a()) == null) {
            str2 = null;
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFinderLiveFeedNonceId", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo$FinderLiveInfo");
            str2 = a27.f402624c;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFinderLiveFeedNonceId", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo$FinderLiveInfo");
        }
        strArr[1] = str2;
        s34.g0 g0Var4 = snsInfo.getAdXml().adFinderLiveStreamInfo;
        if (g0Var4 != null && (a19 = g0Var4.a()) != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFinderUsername", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo$FinderLiveInfo");
            java.lang.String str4 = a19.f402625d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFinderUsername", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo$FinderLiveInfo");
            str3 = str4;
        }
        strArr[2] = str3;
        if (!com.tencent.mm.sdk.platformtools.t8.N0(strArr)) {
            s34.g0 g0Var5 = snsInfo.getAdXml().adFinderLiveStreamInfo;
            if (!((g0Var5 == null || (a17 = g0Var5.a()) == null || (a18 = a17.a()) == null || 0 != a18.longValue()) ? false : true)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkShowAdLivingStream", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper$Companion");
                return true;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkShowAdLivingStream", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper$Companion");
        return false;
    }

    public final com.tencent.mm.sdk.platformtools.r2 b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBitmapCache", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getBitmapCache$cp", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper");
        com.tencent.mm.sdk.platformtools.r2 r2Var = com.tencent.mm.plugin.sns.ad.widget.living.v.f163767f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getBitmapCache$cp", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBitmapCache", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper$Companion");
        return r2Var;
    }

    public final boolean c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isAdLivingFrequencyLimit", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper$Companion");
        try {
            boolean z17 = true;
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ad_living_frequency_limit, 1);
            com.tencent.mars.xlog.Log.i("MicroMsg.AdLivingStreamHelper", "isAdLivingFrequencyLimit is " + Ni);
            if (Ni != 1) {
                z17 = false;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAdLivingFrequencyLimit", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper$Companion");
            return z17;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AdLivingStreamHelper", "isAdLivingFrequencyLimit, exp is " + th6);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAdLivingFrequencyLimit", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper$Companion");
            return false;
        }
    }

    public final void d(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("sendPauseAdLivingEvent", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper$Companion");
        if (a(snsInfo)) {
            com.tencent.mm.autogen.events.SnsAdLivingStreamJumpEvent snsAdLivingStreamJumpEvent = new com.tencent.mm.autogen.events.SnsAdLivingStreamJumpEvent();
            snsAdLivingStreamJumpEvent.f54794g.f6405a = ca4.z0.T(snsInfo);
            snsAdLivingStreamJumpEvent.e();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("sendPauseAdLivingEvent", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper$Companion");
    }
}
