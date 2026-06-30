package i64;

/* loaded from: classes4.dex */
public final class y extends i64.a0 {

    /* renamed from: d, reason: collision with root package name */
    public static final i64.y f289357d = new i64.y();

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f289358e = "AdFinderLivingProductModelManager";

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f289359f = new java.util.concurrent.ConcurrentHashMap();

    public static final long h(com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLivingProductId", "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager");
        boolean z17 = true;
        boolean z18 = adClickActionInfo != null && adClickActionInfo.f162582g0;
        long j17 = 0;
        i64.y yVar = f289357d;
        if (!z18) {
            com.tencent.mars.xlog.Log.i(yVar.d(), "getLivingProductId, snsId=" + str + ", isFinderLiveShowProduct=false");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLivingProductId", "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager");
            return 0L;
        }
        yVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLivingProductId", "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager");
        if (str != null && str.length() != 0) {
            z17 = false;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.e(yVar.d(), "getLivingProductId, snsId empty");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLivingProductId", "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager");
        } else {
            i64.x xVar = (i64.x) f289359f.get(str);
            if (xVar != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getProductId", "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager$LivingProductResp");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getProductId", "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager$LivingProductResp");
                j17 = xVar.f289353b;
            }
            com.tencent.mars.xlog.Log.i(yVar.d(), "getLivingProductId, snsId=" + str + ", productId=" + j17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLivingProductId", "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLivingProductId", "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager");
        return j17;
    }

    public static final boolean i(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.storage.ADXml adXml;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isFinderLivingProductAd", "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager");
        s34.d0 d0Var = (snsInfo == null || (adXml = snsInfo.getAdXml()) == null) ? null : adXml.adFinderLiveProductInfo;
        if (d0Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFinderLivingProductAd", "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager");
            return false;
        }
        java.lang.String T = ca4.z0.T(snsInfo);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getNumberRequestParams", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveProductInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getNumberRequestParams", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveProductInfo");
        java.lang.String str = d0Var.f402617a;
        boolean z17 = str == null || str.length() == 0;
        i64.y yVar = f289357d;
        if (!z17) {
            yVar.d();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFinderLivingProductAd", "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager");
            return true;
        }
        com.tencent.mars.xlog.Log.e(yVar.d(), "isFinderLivingProductAd=false, no req params, snsId=" + T);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFinderLivingProductAd", "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager");
        return false;
    }

    public static final boolean j(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isValidProductId", "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager");
        boolean z17 = j17 != 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isValidProductId", "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager");
        return z17;
    }

    @Override // i64.a0
    public java.lang.String d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager");
        return f289358e;
    }

    public void g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clear", "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clear", "com.tencent.mm.plugin.sns.ad.model.AdModelManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clear", "com.tencent.mm.plugin.sns.ad.model.AdModelManager");
        boolean z17 = ca4.m0.u0(e42.c0.clicfg_ad_enable_update_living_product, 1) > 0;
        com.tencent.mars.xlog.Log.i(d(), "clear, isEnableUpdate=" + z17);
        ((java.util.LinkedHashMap) c()).clear();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMutexes", "com.tencent.mm.plugin.sns.ad.model.AdModelManager");
        java.util.Map map = this.f289063b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMutexes", "com.tencent.mm.plugin.sns.ad.model.AdModelManager");
        ((java.util.LinkedHashMap) map).clear();
        if (!z17) {
            f289359f.clear();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clear", "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager");
    }

    public final void k(s74.f3 f3Var, org.json.JSONArray jSONArray) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateViewNode", "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager");
        int length = jSONArray.length();
        for (int i17 = 0; i17 < length; i17++) {
            org.json.JSONObject optJSONObject = jSONArray.optJSONObject(i17);
            if (optJSONObject != null) {
                java.lang.String optString = optJSONObject.optString(dm.i4.COL_ID);
                if (optString == null || optString.length() == 0) {
                    com.tencent.mars.xlog.Log.e(d(), "updateViewNode, id empty");
                } else {
                    s74.j3 a17 = f3Var.a(optString);
                    if (a17 == null) {
                        com.tencent.mars.xlog.Log.e(d(), "updateViewNode, findViewNodeById==null, id=" + optString);
                    } else {
                        s74.y2 y2Var = s74.y2.f404609a;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getObj", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$ViewNode");
                        org.json.JSONObject jSONObject = a17.f404368c;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getObj", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$ViewNode");
                        y2Var.d(jSONObject, optJSONObject);
                        f3Var.v(a17);
                    }
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateViewNode", "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager");
    }
}
