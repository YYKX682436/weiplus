package w64;

/* loaded from: classes4.dex */
public class b extends v64.b {
    @Override // v64.b
    public /* bridge */ /* synthetic */ v64.c d(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, v64.d dVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdActionButtonClickWrapper");
        w64.a e17 = e(snsInfo, dVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdActionButtonClickWrapper");
        return e17;
    }

    public w64.a e(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, v64.d dVar) {
        int intValue;
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdActionButtonClickWrapper");
        if (snsInfo == null || snsInfo.getAdXml() == null) {
            com.tencent.mars.xlog.Log.w("SnsAd.AdActionButtonClick", "the sns info or adxml is null!!!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdActionButtonClickWrapper");
            return null;
        }
        int intValue2 = dVar != null ? ((java.lang.Integer) dVar.get(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE)).intValue() : 0;
        com.tencent.mm.plugin.sns.storage.ADXml adXml = snsInfo.getAdXml();
        com.tencent.mm.plugin.sns.storage.ADInfo adInfo = snsInfo.getAdInfo();
        if (intValue2 == 1) {
            com.tencent.mm.plugin.sns.storage.ADXml.AdCardActionBtnInfo adCardActionBtnInfo = adXml.adCardActionBtnInfo;
            if (adCardActionBtnInfo != null) {
                adClickActionInfo = adCardActionBtnInfo.clickActionInfo;
            }
            adClickActionInfo = null;
        } else if (intValue2 == 2) {
            s34.b1 b1Var = adXml.adTagBtnInfo;
            if (b1Var != null) {
                adClickActionInfo = b1Var.clickActionInfo;
            }
            adClickActionInfo = null;
        } else if (intValue2 == 3) {
            if (adXml.adSliderFullCardInfo != null) {
                adClickActionInfo = adXml.adSliderFullCardInfo.resInfoList.get(dVar != null ? ((java.lang.Integer) dVar.get("subClickPos")).intValue() : 0).clickActionInfo;
            }
            adClickActionInfo = null;
        } else if (intValue2 == 4) {
            if (adXml.adSliderFullCardInfo != null) {
                adClickActionInfo = adXml.adSliderFullCardInfo.resInfoList.get(dVar != null ? ((java.lang.Integer) dVar.get("subClickPos")).intValue() : 0).buttonInfo.btnClickActionInfo;
            }
            adClickActionInfo = null;
        } else if (intValue2 == 5) {
            com.tencent.mm.plugin.sns.storage.o adSelectInfo = adXml.getAdSelectInfo();
            if (adSelectInfo != null) {
                adClickActionInfo = adSelectInfo.adSelectCardClickInfoLeft;
            }
            adClickActionInfo = null;
        } else if (intValue2 == 6) {
            com.tencent.mm.plugin.sns.storage.o adSelectInfo2 = adXml.getAdSelectInfo();
            if (adSelectInfo2 != null) {
                adClickActionInfo = adSelectInfo2.adSelectCardClickInfoRight;
            }
            adClickActionInfo = null;
        } else if (intValue2 == 7 || intValue2 == 8) {
            if (adInfo != null && !a84.b0.b(adInfo.adClickActionInfoList)) {
                intValue = dVar != null ? ((java.lang.Integer) dVar.get("subClickPos")).intValue() : 0;
                if (adInfo.checkCurIndexCanJump(intValue)) {
                    adClickActionInfo = adInfo.adClickActionInfoList.get(intValue);
                }
            }
            adClickActionInfo = null;
        } else if (intValue2 == 10) {
            adClickActionInfo = adXml.adActionLinkClickInfo;
        } else if (intValue2 == 13 || intValue2 == 14) {
            if (adInfo != null && !a84.b0.b(adInfo.adClickActionInfoList) && adInfo.checkCurIndexCanJump(0)) {
                adClickActionInfo = adInfo.adClickActionInfoList.get(0);
            }
            adClickActionInfo = null;
        } else if (intValue2 == 16 || intValue2 == 17) {
            com.tencent.mm.plugin.sns.storage.n nVar = adXml.adFullCardInfo;
            if (nVar != null) {
                adClickActionInfo = nVar.gestureClickActionInfo;
            }
            adClickActionInfo = null;
        } else if (intValue2 == 18) {
            if (adXml.isLookbookCardAd()) {
                adClickActionInfo = adXml.adLookbookInfo.d();
            }
            adClickActionInfo = null;
        } else if (intValue2 == 19 || intValue2 == 27) {
            if (adXml.isLookbookCardAd()) {
                intValue = dVar != null ? ((java.lang.Integer) dVar.get("subClickPos")).intValue() : 0;
                java.util.List c17 = adXml.adLookbookInfo.c();
                if (intValue >= 0 && intValue < c17.size()) {
                    adClickActionInfo = ((v74.q) c17.get(intValue)).a();
                }
            }
            adClickActionInfo = null;
        } else {
            if (intValue2 == 22 && adXml.isSlideFullCard()) {
                adClickActionInfo = adXml.adSliderFullCardInfo.overSlideJumpInfo;
            }
            adClickActionInfo = null;
        }
        if (adClickActionInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdActionButtonClickWrapper");
            return null;
        }
        int i17 = adClickActionInfo.f162571b;
        if (i17 == 8) {
            x64.g gVar = new x64.g(adClickActionInfo);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdActionButtonClickWrapper");
            return gVar;
        }
        if (i17 == 9) {
            x64.j jVar = new x64.j(adClickActionInfo);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdActionButtonClickWrapper");
            return jVar;
        }
        if (i17 == 10) {
            x64.l lVar = new x64.l(adClickActionInfo);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdActionButtonClickWrapper");
            return lVar;
        }
        if (i17 != 11) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdActionButtonClickWrapper");
            return null;
        }
        x64.m mVar = new x64.m(adClickActionInfo);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdActionButtonClickWrapper");
        return mVar;
    }
}
