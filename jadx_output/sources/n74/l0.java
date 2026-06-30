package n74;

/* loaded from: classes4.dex */
public abstract class l0 {
    public static boolean a(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        r45.jj4 jj4Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableAdOnlineVideoPreload", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
        if (snsInfo == null) {
            com.tencent.mars.xlog.Log.w("SnsAd.OnlinePlayerSwitchHelper", "enableOnlineVideoPreload: the snsInfo is null!!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableAdOnlineVideoPreload", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
            return false;
        }
        if (!snsInfo.isAd()) {
            com.tencent.mars.xlog.Log.w("SnsAd.OnlinePlayerSwitchHelper", "enableOnlineVideoPreload: the snsInfo is not ad!!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableAdOnlineVideoPreload", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
            return false;
        }
        if (com.tencent.mm.plugin.sns.ad.widget.living.v.a(snsInfo)) {
            com.tencent.mars.xlog.Log.i("SnsAd.OnlinePlayerSwitchHelper", "enableOnlineVideoPreload: the snsInfo is ad living stream");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableAdOnlineVideoPreload", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
            return false;
        }
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = snsInfo.getTimeLine();
        com.tencent.mm.plugin.sns.storage.ADXml adXml = snsInfo.getAdXml();
        boolean b17 = b(timeLine, adXml);
        if (b17) {
            try {
                i64.q a17 = i64.q.a(snsInfo);
                if (adXml.isSlideFullCard()) {
                    s34.a1 a1Var = adXml.adSliderFullCardInfo;
                    java.lang.String str = timeLine.Id;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkSetH265", "com.tencent.mm.plugin.sns.ad.adxml.AdSliderFullCardInfo");
                    if (a17 != null && a1Var != null) {
                        java.util.List<s34.x0> list = a1Var.resInfoList;
                        if (!a84.b0.b(list)) {
                            for (s34.x0 x0Var : list) {
                                if (x0Var != null && x0Var.a() && (jj4Var = x0Var.f402828e) != null) {
                                    l44.c0.c(a17, jj4Var, str);
                                }
                            }
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkSetH265", "com.tencent.mm.plugin.sns.ad.adxml.AdSliderFullCardInfo");
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkSetH265", "com.tencent.mm.plugin.sns.ad.adxml.AdSliderFullCardInfo");
                } else if (adXml.isLookbookCardAd()) {
                    v74.m.a(a17, adXml.adLookbookInfo, timeLine.Id);
                } else if (adXml.isFlipCardAd()) {
                    t74.a2.a(a17, adXml.adFlipCardInfo, timeLine.Id);
                } else {
                    r45.a90 a90Var = timeLine.ContentObj;
                    if (a90Var != null && a90Var.f369840h.size() >= 1) {
                        r45.jj4 jj4Var2 = (r45.jj4) timeLine.ContentObj.f369840h.get(0);
                        com.tencent.mars.xlog.Log.i("SnsAd.OnlinePlayerSwitchHelper", "AdH265Helper, enableAdOnlineVideoPreload, snsId=" + timeLine.Id);
                        l44.c0.c(a17, jj4Var2, timeLine.Id);
                    }
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("SnsAd.OnlinePlayerSwitchHelper", "AdH265Helper, enableAdOnlineVideoPreload exp=" + th6.toString());
            }
            if (snsInfo.isAdForbidAutoPlay()) {
                com.tencent.mars.xlog.Log.i("SnsAd.OnlinePlayerSwitchHelper", "forbidAutoPlay, disable AdOnlineVideoPreload");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableAdOnlineVideoPreload", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
                return false;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableAdOnlineVideoPreload", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
        return b17;
    }

    public static boolean b(com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject, com.tencent.mm.plugin.sns.storage.ADXml aDXml) {
        boolean z17;
        s34.a1 a1Var;
        r45.a90 a90Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableAdOnlineVideoPreload", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isVideoSight", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
        if (timeLineObject == null || (a90Var = timeLineObject.ContentObj) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isVideoSight", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
            z17 = false;
        } else {
            z17 = a90Var.f369837e == 15;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isVideoSight", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
        }
        if (aDXml != null && aDXml.isFullCardAd()) {
            if (aDXml.isLongPressGestureAd()) {
                com.tencent.mars.xlog.Log.i("SnsAd.OnlinePlayerSwitchHelper", "fullcard useOnlineVideoView preload false, longpressgesture offline");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableAdOnlineVideoPreload", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
                return false;
            }
            if (aDXml.isAdBreakFrameVideo() || aDXml.isAdIpInteractVideo() || aDXml.isAdSolidBreakFrameVideo()) {
                com.tencent.mars.xlog.Log.i("SnsAd.OnlinePlayerSwitchHelper", "fullcard adBreakFrameVideo is offline");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableAdOnlineVideoPreload", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
                return false;
            }
            int i17 = p34.v.f351699a;
            if (i17 == 1) {
                com.tencent.mars.xlog.Log.i("SnsAd.OnlinePlayerSwitchHelper", "fullcard useOnlineVideoView preload false, force offline");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableAdOnlineVideoPreload", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
                return false;
            }
            if (i17 == 2) {
                com.tencent.mars.xlog.Log.i("SnsAd.OnlinePlayerSwitchHelper", "fullcard useOnlineVideoView preload true,  force online");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableAdOnlineVideoPreload", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
                return true;
            }
        }
        if (!d() && aDXml != null && aDXml.isSlideFullCard() && (a1Var = aDXml.adSliderFullCardInfo) != null) {
            java.util.List<s34.x0> list = a1Var.resInfoList;
            if (!a84.b0.b(list)) {
                for (s34.x0 x0Var : list) {
                    if (x0Var != null && x0Var.a()) {
                        com.tencent.mars.xlog.Log.i("SnsAd.OnlinePlayerSwitchHelper", "slideFullCard ad exists video item, so preload is enable!");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableAdOnlineVideoPreload", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
                        return true;
                    }
                }
            }
        }
        if (aDXml != null && aDXml.isLookbookCardAd()) {
            v74.m mVar = aDXml.adLookbookInfo;
            mVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getHasVideoItem", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardInfo");
            boolean z18 = mVar.f433867c;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getHasVideoItem", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardInfo");
            if (z18) {
                com.tencent.mars.xlog.Log.i("SnsAd.OnlinePlayerSwitchHelper", "lookbook ad has video item, preload enable");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableAdOnlineVideoPreload", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
                return true;
            }
        }
        if (aDXml != null && aDXml.isFlipCardAd()) {
            com.tencent.mars.xlog.Log.i("SnsAd.OnlinePlayerSwitchHelper", "flip card ad, preload enable");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableAdOnlineVideoPreload", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
            return true;
        }
        if (z17 && aDXml != null && (aDXml.isNormalAd() || aDXml.isCardAd())) {
            com.tencent.mars.xlog.Log.i("SnsAd.OnlinePlayerSwitchHelper", "normal video ad or card video ad, so preload is enable!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableAdOnlineVideoPreload", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
            return true;
        }
        if (z17 && c(aDXml)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("useOnlineVideoInNormalTimeline", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("useOnlineVideoInNormalTimeline", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
            if (aDXml.isNormalAd()) {
                com.tencent.mars.xlog.Log.i("SnsAd.OnlinePlayerSwitchHelper", "the normal video preload is disable, because the online normal video preload is enable!");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableAdOnlineVideoPreload", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
                return true;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("useOnlineVideoInBaseCardTimeline", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("useOnlineVideoInBaseCardTimeline", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
            if (aDXml.isCardAd()) {
                com.tencent.mars.xlog.Log.i("SnsAd.OnlinePlayerSwitchHelper", "the base card ad video preload is disable, because the online base card prload is enable!");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableAdOnlineVideoPreload", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
                return true;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isExptUseOnlineVideoView", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isExptUseOnlineVideoView", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
            if (aDXml.isFullCardAd() && !aDXml.isLongPressGestureAd() && !aDXml.isAdBreakFrameVideo() && !aDXml.isAdIpInteractVideo() && !aDXml.isAdSolidBreakFrameVideo()) {
                com.tencent.mars.xlog.Log.i("SnsAd.OnlinePlayerSwitchHelper", "fullcard useOnlineVideoView preload true");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableAdOnlineVideoPreload", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
                return true;
            }
            if (aDXml.isCombinedGridAD()) {
                com.tencent.mars.xlog.Log.i("SnsAd.OnlinePlayerSwitchHelper", "combinedGridAD useOnlineVideoView preload true");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableAdOnlineVideoPreload", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
                return true;
            }
            com.tencent.mars.xlog.Log.i("SnsAd.OnlinePlayerSwitchHelper", "the ad video preload is not disable!");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableAdOnlineVideoPreload", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
        return false;
    }

    public static boolean c(com.tencent.mm.plugin.sns.storage.ADXml aDXml) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableOnlineVideoFeatureInAdXml", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
        if (aDXml == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableOnlineVideoFeatureInAdXml", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
            return false;
        }
        boolean z17 = aDXml.videoPlayInStreamingMode > 0;
        if (z17) {
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.A(fe1.t.CTRL_INDEX, 20);
            if (aDXml.isCardAd()) {
                g0Var.A(fe1.t.CTRL_INDEX, 22);
            }
        } else {
            com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var2.A(fe1.t.CTRL_INDEX, 19);
            if (aDXml.isCardAd()) {
                g0Var2.A(fe1.t.CTRL_INDEX, 21);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableOnlineVideoFeatureInAdXml", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
        return z17;
    }

    public static boolean d() {
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("useOfflineVideoAdSlideFullCard", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
        try {
            i17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ad_timeline_slide_full_card_video_online, 0);
        } catch (java.lang.Throwable unused) {
            i17 = 0;
        }
        boolean z17 = i17 > 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("useOfflineVideoAdSlideFullCard", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
        return z17;
    }
}
