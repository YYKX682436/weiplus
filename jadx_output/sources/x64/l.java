package x64;

/* loaded from: classes4.dex */
public class l extends w64.a {
    public l(com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo) {
        this.f443283a = adClickActionInfo;
    }

    @Override // w64.a
    public boolean c(android.view.View view, int i17, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo, v64.d dVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveRoomClick");
        com.tencent.mars.xlog.Log.i("SnsAd.AdFinderLiveRoomClick.AdFinderLiveClick", "AdFinderLiveRoomClick doClick, source=" + i17);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1837, 21);
        if (view == null || adClickActionInfo == null || snsInfo == null) {
            com.tencent.mars.xlog.Log.e("SnsAd.AdFinderLiveRoomClick.AdFinderLiveClick", "info null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveRoomClick");
            return false;
        }
        android.content.Context context = view.getContext();
        if (context == null) {
            com.tencent.mars.xlog.Log.e("SnsAd.AdFinderLiveRoomClick.AdFinderLiveClick", "context null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveRoomClick");
            return false;
        }
        java.lang.String T = ca4.z0.T(snsInfo);
        long h17 = i64.y.h(adClickActionInfo, T);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isFinderRoomInfoValid", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        boolean z17 = !com.tencent.mm.sdk.platformtools.t8.N0(adClickActionInfo.finderUsername, adClickActionInfo.finderLiveId, adClickActionInfo.f162574c0, adClickActionInfo.f162576d0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFinderRoomInfoValid", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (!z17) {
            com.tencent.mars.xlog.Log.i("SnsAd.AdFinderLiveRoomClick.AdFinderLiveClick", "doClick, but clickActionInfo finderInfo invalid");
            e((com.tencent.mm.modelsns.SnsAdClick) dVar.a("snsAdClick", null), adClickActionInfo, h17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showErrorToast", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveRoomClick");
            try {
                db5.t7.g(context, "进入直播间失败");
            } catch (java.lang.Throwable unused) {
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showErrorToast", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveRoomClick");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveRoomClick");
            return true;
        }
        e((com.tencent.mm.modelsns.SnsAdClick) dVar.a("snsAdClick", null), adClickActionInfo, h17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("requestLiveStatus", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveRoomClick");
        try {
            e74.i.f().c(i17, snsInfo);
        } catch (java.lang.Throwable unused2) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("requestLiveStatus", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveRoomClick");
        java.lang.String m17 = l44.s4.m(snsInfo.getUxinfo(), T, l44.s4.c(adClickActionInfo.f162569a));
        p52.h.f352016a.f(m17, adClickActionInfo.finderUsername);
        com.tencent.mars.xlog.Log.i("SnsAd.AdFinderLiveRoomClick.AdFinderLiveClick", "doClick, setSnsAdData, snsAdInfo=" + m17 + ", finderUsername=" + adClickActionInfo.finderUsername + ", clickActionType=" + adClickActionInfo.f162571b + ", adFinderLivingProductId=" + h17);
        android.util.ArrayMap arrayMap = new android.util.ArrayMap();
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        arrayMap.put("is_from_ad", bool);
        arrayMap.put("key_extra_info", m17);
        if (adClickActionInfo.f162571b == 24) {
            arrayMap.put("key_auto_open_shopping_list", bool);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1837, 8);
        } else if (i64.y.j(h17)) {
            arrayMap.put("key_product_id", java.lang.Long.valueOf(h17));
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1837, 9);
        }
        d44.h.e(context, adClickActionInfo.finderUsername, adClickActionInfo.finderLiveId, adClickActionInfo.f162574c0, adClickActionInfo.f162576d0, arrayMap, T, new x64.k(this, h17, context));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveRoomClick");
        return true;
    }

    public void d(android.view.View view, int i17, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo, v64.d dVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doJumpFinderLiveProductList", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveRoomClick");
        c(view, i17, snsInfo, adClickActionInfo, dVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doJumpFinderLiveProductList", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveRoomClick");
    }

    public final void e(com.tencent.mm.modelsns.SnsAdClick snsAdClick, com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo, long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setClickAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveRoomClick");
        if (snsAdClick == null || adClickActionInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setClickAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveRoomClick");
            return;
        }
        if (adClickActionInfo.f162571b == 24) {
            a84.u0.a(snsAdClick, 57);
        } else if (i64.y.j(j17)) {
            a84.u0.a(snsAdClick, 68);
        } else {
            a84.u0.a(snsAdClick, 44);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setClickAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveRoomClick");
    }
}
