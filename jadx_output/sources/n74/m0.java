package n74;

/* loaded from: classes4.dex */
public abstract class m0 {
    public static java.util.List a(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.pointers.PInt pInt, java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createFlipCardAdPreloadTask", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlineVideoPreloadHelper");
        if (snsInfo == null || !snsInfo.isFlipCardAd()) {
            com.tencent.mars.xlog.Log.e("SlideFullCard.MicroMsg.SnsVideoService", "createFlipCardAdPreloadTask, snsInfo==null or !FlipCardAd");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createFlipCardAdPreloadTask", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlineVideoPreloadHelper");
            return null;
        }
        t74.a2 a2Var = snsInfo.getAdXml().adFlipCardInfo;
        if (a2Var == null) {
            com.tencent.mars.xlog.Log.e("SlideFullCard.MicroMsg.SnsVideoService", "createFlipCardAdPreloadTask, adFlipCardInfo==null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createFlipCardAdPreloadTask", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlineVideoPreloadHelper");
            return null;
        }
        java.util.List h17 = a2Var.h();
        if (a84.b0.b(h17)) {
            com.tencent.mars.xlog.Log.e("SlideFullCard.MicroMsg.SnsVideoService", "createFlipCardAdPreloadTask, mediaList is empty");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createFlipCardAdPreloadTask", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlineVideoPreloadHelper");
            return null;
        }
        g(snsInfo, pInt);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String localid = snsInfo.getLocalid();
        java.util.Iterator it = ((java.util.ArrayList) h17).iterator();
        while (it.hasNext()) {
            r45.jj4 jj4Var = (r45.jj4) it.next();
            if (jj4Var != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSight", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo$Companion");
                boolean z18 = jj4Var.f377856e == 6;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSight", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo$Companion");
                if (z18) {
                    dn.o c17 = c(snsInfo, jj4Var, localid, str, pInt, z17);
                    if (c17 != null) {
                        arrayList.add(c17);
                    }
                }
            }
            com.tencent.mars.xlog.Log.i("SlideFullCard.MicroMsg.SnsVideoService", "createFlipCardAdPreloadTask, mediaObj!=sight");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createFlipCardAdPreloadTask", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlineVideoPreloadHelper");
        return arrayList;
    }

    public static java.util.List b(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.pointers.PInt pInt, java.lang.String str, boolean z17) {
        dn.o c17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createLookbookAdPreloadTask", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlineVideoPreloadHelper");
        if (snsInfo == null || !snsInfo.isLookbookCardAd()) {
            com.tencent.mars.xlog.Log.e("SlideFullCard.MicroMsg.SnsVideoService", "createLookbookAdPreloadTask, snsInfo==null or !lookbookAD");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createLookbookAdPreloadTask", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlineVideoPreloadHelper");
            return null;
        }
        v74.m mVar = snsInfo.getAdXml().adLookbookInfo;
        if (mVar == null) {
            com.tencent.mars.xlog.Log.e("SlideFullCard.MicroMsg.SnsVideoService", "createLookbookAdPreloadTask, adLookbookInfo==null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createLookbookAdPreloadTask", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlineVideoPreloadHelper");
            return null;
        }
        java.util.List<v74.q> c18 = mVar.c();
        if (a84.b0.b(c18)) {
            com.tencent.mars.xlog.Log.e("SlideFullCard.MicroMsg.SnsVideoService", "createLookbookAdPreloadTask, itemList is empty");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createLookbookAdPreloadTask", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlineVideoPreloadHelper");
            return null;
        }
        g(snsInfo, pInt);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String localid = snsInfo.getLocalid();
        for (v74.q qVar : c18) {
            if (qVar == null || !qVar.c()) {
                com.tencent.mars.xlog.Log.i("SlideFullCard.MicroMsg.SnsVideoService", "createLookbookAdPreloadTask, item!=sight");
            } else {
                dn.o c19 = c(snsInfo, qVar.b(), localid, str, pInt, z17);
                if (c19 != null) {
                    arrayList.add(c19);
                }
            }
        }
        r45.jj4 f17 = mVar.f();
        if (f17 != null && (c17 = c(snsInfo, f17, localid, str, pInt, z17)) != null) {
            com.tencent.mars.xlog.Log.i("SlideFullCard.MicroMsg.SnsVideoService", "createLookbookAdPreloadTask, brandNewMedia");
            arrayList.add(c17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createLookbookAdPreloadTask", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlineVideoPreloadHelper");
        return arrayList;
    }

    public static dn.o c(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, r45.jj4 jj4Var, java.lang.String str, java.lang.String str2, com.tencent.mm.pointers.PInt pInt, boolean z17) {
        java.lang.String str3;
        t21.v2 v2Var;
        boolean z18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createMultiVideoAdPreloadTask", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlineVideoPreloadHelper");
        if (snsInfo == null || jj4Var == null) {
            com.tencent.mars.xlog.Log.w("SlideFullCard.MicroMsg.SnsVideoService", "createMultiVideoAdPreloadTask, current video is already download finish, do nothing");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createMultiVideoAdPreloadTask", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlineVideoPreloadHelper");
            return null;
        }
        java.lang.String t07 = ca4.z0.t0(snsInfo.field_snsId);
        java.lang.String e17 = ca4.m0.e(str, jj4Var.f377855d + "_");
        java.lang.String i17 = com.tencent.mm.plugin.sns.model.y6.i(e17, jj4Var);
        com.tencent.mars.xlog.Log.i("SlideFullCard.MicroMsg.SnsVideoService", "createMultiVideoAdPreloadTask, localId is " + str + ", fakeLocalId is " + e17 + ", finishPath is " + i17);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(i17)) {
            com.tencent.mars.xlog.Log.w("SlideFullCard.MicroMsg.SnsVideoService", "createMultiVideoAdPreloadTask, current video is already download finish, do nothing");
            t21.o2.Ni().f(jj4Var.M, z17 ? 4 : 3, com.tencent.mm.vfs.w6.k(i17), snsInfo.getUserName(), "", 0, "", jj4Var.f377858g, str2);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(354L, 147L, 1L, false);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createMultiVideoAdPreloadTask", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlineVideoPreloadHelper");
            return null;
        }
        boolean u17 = com.tencent.mm.vfs.w6.u(com.tencent.mm.plugin.sns.model.y6.n(jj4Var.f377855d));
        java.lang.String p17 = com.tencent.mm.plugin.sns.model.y6.p(jj4Var);
        com.tencent.mars.xlog.Log.i("SlideFullCard.MicroMsg.SnsVideoService", "createMultiVideoAdPreloadTask, realLocalId: [%s], fakeLocalId: [%s], media id: [%s], duration: [%f], preloadPercent [%d], snsId: [%s], file: [%s]", str, e17, jj4Var.f377855d, java.lang.Float.valueOf(jj4Var.R), java.lang.Integer.valueOf(pInt.value), t07, p17);
        t21.v2 l17 = com.tencent.mm.plugin.sns.model.y6.l(e17, jj4Var.f377855d, jj4Var.U, jj4Var.Y);
        if (l17 != null) {
            com.tencent.mars.xlog.Log.i("SlideFullCard.MicroMsg.SnsVideoService", "createMultiVideoAdPreloadTask, video info: %s", l17.toString());
            if (com.tencent.mm.sdk.platformtools.t8.K0(p17) || !com.tencent.mm.vfs.w6.j(p17)) {
                str3 = p17;
                v2Var = l17;
                com.tencent.mars.xlog.Log.i("SlideFullCard.MicroMsg.SnsVideoService", "createMultiVideoAdPreloadTask, sns: [%s], fakeLocalId: [%s], videoFinishFilePath [%s], filePath [%s] is null or file maybe delete.", str, e17, i17, str3);
            } else {
                int i18 = l17.f415008f;
                if (i18 > 0 && java.lang.Math.ceil((l17.I * 100.0d) / i18) >= pInt.value) {
                    com.tencent.mars.xlog.Log.w("SlideFullCard.MicroMsg.SnsVideoService", "createMultiVideoAdPreloadTask, sns: [%s], fakeLocalId: [%s], videoFinishFilePath [%s], filePath [%s] already preload finish, do nothing.", str, e17, i17, p17);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createMultiVideoAdPreloadTask", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlineVideoPreloadHelper");
                    return null;
                }
                com.tencent.mars.xlog.Log.i("SlideFullCard.MicroMsg.SnsVideoService", "createMultiVideoAdPreloadTask, sns: [%s], fakeLocalId: [%s], videoFinishFilePath [%s], filePath [%s] has not preload finish, preloadSize is %d, totalLength is %d, preloadPercent value is %d.", str, e17, i17, p17, java.lang.Integer.valueOf(l17.I), java.lang.Integer.valueOf(l17.f415008f), java.lang.Integer.valueOf(pInt.value));
                str3 = p17;
                v2Var = l17;
            }
        } else {
            str3 = p17;
            v2Var = l17;
        }
        if (v2Var == null) {
            com.tencent.mm.plugin.sns.model.y6.v(e17, jj4Var.f377855d, 30, jj4Var, str3);
            z18 = true;
        } else {
            com.tencent.mm.plugin.sns.model.y6.y(v2Var, jj4Var.f377855d, 30);
            z18 = false;
        }
        boolean z19 = z18;
        com.tencent.mars.xlog.Log.i("SlideFullCard.MicroMsg.SnsVideoService", "createMultiVideoAdPreloadTask fakeLocalId: [%s] preload stream download sns video %s mkDir %b", e17, str3, java.lang.Boolean.valueOf(u17));
        com.tencent.mm.storage.s7 c17 = com.tencent.mm.storage.s7.c();
        c17.f195313b = snsInfo.getCreateTime();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSight", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSight", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
        java.lang.String str4 = jj4Var.f377858g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setUrl", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setUrl", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setThumb", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setThumb", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
        t21.i2.wi();
        dn.o k17 = t21.o2.Di().k(c17, str4, str3, com.tencent.mm.plugin.sns.model.y6.g(e17, jj4Var), 2, jj4Var.N, jj4Var.f377855d, jj4Var.D, jj4Var.E, jj4Var.U, jj4Var);
        if (k17 == null) {
            com.tencent.mars.xlog.Log.w("SlideFullCard.MicroMsg.SnsVideoService", "createMultiVideoAdPreloadTask, checkCanSnsOnlineVideo, taskInfo==null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createMultiVideoAdPreloadTask", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlineVideoPreloadHelper");
            return null;
        }
        if (z19) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1697, 35);
        }
        k17.field_fileType = 20210;
        k17.U1 = jj4Var.M;
        k17.field_preloadRatio = pInt.value;
        k17.Q1 = str2;
        k17.f241814b2 = jj4Var.f377855d;
        java.lang.String userName = snsInfo.getUserName();
        k17.I1 = userName;
        k17.J1 = userName;
        k17.f241800s = com.tencent.mm.plugin.sns.model.i7.r(jj4Var);
        java.lang.String str5 = jj4Var.U;
        k17.X1 = str5;
        com.tencent.mars.xlog.Log.i("SlideFullCard.MicroMsg.SnsVideoService", "createMultiVideoAdPreloadTask, download video flag: %s", str5);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createMultiVideoAdPreloadTask", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlineVideoPreloadHelper");
        return k17;
    }

    public static java.util.List d(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.pointers.PInt pInt, java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createSlideFullCardPreloadTask", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlineVideoPreloadHelper");
        if (snsInfo == null || snsInfo.getAdXml().adSliderFullCardInfo == null) {
            com.tencent.mars.xlog.Log.e("SlideFullCard.MicroMsg.SnsVideoService", "createSlideFullCardPreloadTask, snsInfo or adSliderFullCardInfo is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createSlideFullCardPreloadTask", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlineVideoPreloadHelper");
            return null;
        }
        java.util.List<s34.x0> list = snsInfo.getAdXml().adSliderFullCardInfo.resInfoList;
        if (a84.b0.b(list)) {
            com.tencent.mars.xlog.Log.e("SlideFullCard.MicroMsg.SnsVideoService", "createSlideFullCardPreloadTask, adSlideFullCardItemInfoList is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createSlideFullCardPreloadTask", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlineVideoPreloadHelper");
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.String localid = snsInfo.getLocalid();
        g(snsInfo, pInt);
        for (s34.x0 x0Var : list) {
            if (x0Var == null || !x0Var.a()) {
                com.tencent.mars.xlog.Log.i("SlideFullCard.MicroMsg.SnsVideoService", "createSlideFullCardPreloadTask, adSlideFullCardItemInfo is null or is not sight");
            } else {
                r45.jj4 jj4Var = x0Var.f402828e;
                if (arrayList2.contains(jj4Var.f377855d)) {
                    com.tencent.mars.xlog.Log.i("SlideFullCard.MicroMsg.SnsVideoService", "createSlideFullCardPreloadTask, mediaIdList contains mediaId " + jj4Var.f377855d);
                } else {
                    dn.o c17 = c(snsInfo, jj4Var, localid, str, pInt, z17);
                    if (c17 != null) {
                        arrayList.add(c17);
                        arrayList2.add(jj4Var.f377855d);
                    }
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createSlideFullCardPreloadTask", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlineVideoPreloadHelper");
        return arrayList;
    }

    public static r45.jj4 e(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFlipCardMediaById", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlineVideoPreloadHelper");
        if (snsInfo != null && snsInfo.isFlipCardAd()) {
            t74.a2 a2Var = snsInfo.getAdXml().adFlipCardInfo;
            if (a2Var == null) {
                com.tencent.mars.xlog.Log.e("SlideFullCard.MicroMsg.SnsVideoService", "getFlipCardMediaById, adFlipCardInfo==null");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFlipCardMediaById", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlineVideoPreloadHelper");
                return null;
            }
            java.util.List h17 = a2Var.h();
            if (a84.b0.b(h17)) {
                com.tencent.mars.xlog.Log.e("SlideFullCard.MicroMsg.SnsVideoService", "getFlipCardMediaById, flipCardAd mediaList empty");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFlipCardMediaById", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlineVideoPreloadHelper");
                return null;
            }
            java.util.Iterator it = ((java.util.ArrayList) h17).iterator();
            while (it.hasNext()) {
                r45.jj4 jj4Var = (r45.jj4) it.next();
                if (jj4Var != null && !com.tencent.mm.sdk.platformtools.t8.N0(str, jj4Var.f377855d) && com.tencent.mm.sdk.platformtools.t8.D0(str, jj4Var.f377855d)) {
                    com.tencent.mars.xlog.Log.i("SlideFullCard.MicroMsg.SnsVideoService", "getFlipCardMediaById, find flipCard media, mediaId=" + str);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFlipCardMediaById", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlineVideoPreloadHelper");
                    return jj4Var;
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFlipCardMediaById", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlineVideoPreloadHelper");
        return null;
    }

    public static r45.jj4 f(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, java.lang.String str) {
        r45.jj4 b17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLookbookAdMediaById", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlineVideoPreloadHelper");
        if (snsInfo != null && snsInfo.isLookbookCardAd()) {
            v74.m mVar = snsInfo.getAdXml().adLookbookInfo;
            if (mVar == null) {
                com.tencent.mars.xlog.Log.e("SlideFullCard.MicroMsg.SnsVideoService", "getLookbookAdMediaById, adLookbookInfo==null");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLookbookAdMediaById", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlineVideoPreloadHelper");
                return null;
            }
            java.util.List<v74.q> c17 = mVar.c();
            if (a84.b0.b(c17)) {
                com.tencent.mars.xlog.Log.e("SlideFullCard.MicroMsg.SnsVideoService", "getLookbookAdMediaById, lookbookAd itemList empty");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLookbookAdMediaById", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlineVideoPreloadHelper");
                return null;
            }
            for (v74.q qVar : c17) {
                if (qVar != null && (b17 = qVar.b()) != null && !com.tencent.mm.sdk.platformtools.t8.N0(str, b17.f377855d) && com.tencent.mm.sdk.platformtools.t8.D0(str, b17.f377855d)) {
                    com.tencent.mars.xlog.Log.i("SlideFullCard.MicroMsg.SnsVideoService", "getLookbookAdMediaById, find lookbookAd media, mediaId=" + str);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLookbookAdMediaById", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlineVideoPreloadHelper");
                    return b17;
                }
            }
            r45.jj4 f17 = mVar.f();
            if (f17 != null && !com.tencent.mm.sdk.platformtools.t8.N0(str, f17.f377855d) && com.tencent.mm.sdk.platformtools.t8.D0(str, f17.f377855d)) {
                com.tencent.mars.xlog.Log.i("SlideFullCard.MicroMsg.SnsVideoService", "getLookbookAdMediaById, find lookbookAd splashCardMedia, mediaId=" + str);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLookbookAdMediaById", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlineVideoPreloadHelper");
                return f17;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLookbookAdMediaById", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlineVideoPreloadHelper");
        return null;
    }

    public static void g(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.pointers.PInt pInt) {
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updatePreloadRatio", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlineVideoPreloadHelper");
        pInt.value = 100;
        java.lang.String t07 = ca4.z0.t0(snsInfo.field_snsId);
        com.tencent.mm.plugin.sns.storage.ADInfo adInfo = snsInfo.getAdInfo();
        q34.b adPreloadConfig = adInfo == null ? null : adInfo.getAdPreloadConfig();
        if (adPreloadConfig == null || (i17 = adPreloadConfig.f359967b) <= 0) {
            com.tencent.mars.xlog.Log.i("SlideFullCard.MicroMsg.SnsVideoService", "use default ratio: " + pInt.value + ", snsId is " + t07);
        } else {
            pInt.value = i17;
            com.tencent.mars.xlog.Log.i("SlideFullCard.MicroMsg.SnsVideoService", "use config ratio: " + pInt.value + ", snsId is " + t07);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updatePreloadRatio", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlineVideoPreloadHelper");
    }
}
