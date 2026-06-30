package n74;

/* loaded from: classes.dex */
public abstract class u {
    public static boolean a(com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo, com.tencent.mm.plugin.sns.storage.ADInfo aDInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doJumpAdBrandRegion", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdJumpBrandRegionHelper");
        if (adClickActionInfo == null || aDInfo == null) {
            com.tencent.mars.xlog.Log.e("AdJumpBrandRegion", "doJumpAdBrandRegion, adClickActionInfo or adInfo is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doJumpAdBrandRegion", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdJumpBrandRegionHelper");
            return false;
        }
        java.lang.String str = adClickActionInfo.f162596n0;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("AdJumpBrandRegion", "doJumpAdBrandRegion, searchQuery is null or nil");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doJumpAdBrandRegion", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdJumpBrandRegionHelper");
            return false;
        }
        try {
            java.lang.String str2 = aDInfo.uxInfo;
            cl0.g gVar = new cl0.g();
            gVar.h("uxInfo", str2);
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("query", str);
            hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 105);
            hashMap.put("thirdExtParam", gVar.toString());
            boolean d17 = d(hashMap);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doJumpAdBrandRegion", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdJumpBrandRegionHelper");
            return d17;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdJumpBrandRegion", "doJumpAdBrandRegion, exp is " + th6.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doJumpAdBrandRegion", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdJumpBrandRegionHelper");
            return false;
        }
    }

    public static int b(java.util.Map map, java.lang.String str, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSaveInt", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdJumpBrandRegionHelper");
        java.lang.String c17 = c(map, str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(c17)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSaveInt", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdJumpBrandRegionHelper");
            return i17;
        }
        try {
            int parseInt = java.lang.Integer.parseInt(c17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSaveInt", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdJumpBrandRegionHelper");
            return parseInt;
        } catch (java.lang.Exception unused) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSaveInt", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdJumpBrandRegionHelper");
            return i17;
        }
    }

    public static java.lang.String c(java.util.Map map, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSaveString", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdJumpBrandRegionHelper");
        if (!map.containsKey(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSaveString", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdJumpBrandRegionHelper");
            return "";
        }
        java.lang.Object obj = map.get(str);
        java.lang.String obj2 = obj != null ? obj.toString() : "";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSaveString", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdJumpBrandRegionHelper");
        return obj2;
    }

    public static boolean d(java.util.Map map) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("openSosHomeWebView", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdJumpBrandRegionHelper");
        if (((tg0.o1) i95.n0.c(tg0.o1.class)) == null) {
            com.tencent.mars.xlog.Log.e("AdJumpBrandRegion", "IWebSearchApiLogicService is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openSosHomeWebView", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdJumpBrandRegionHelper");
            return false;
        }
        java.lang.String c17 = c(map, "query");
        int b17 = b(map, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 3);
        int b18 = b(map, "type", 0);
        java.lang.String obj = map.get("thirdExtParam") == null ? "" : map.get("thirdExtParam").toString();
        java.lang.String f17 = su4.r2.f(b17);
        java.util.Map b19 = su4.r2.b(b17, true, 0);
        java.util.HashMap hashMap = (java.util.HashMap) b19;
        hashMap.put("query", c17);
        hashMap.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, f17);
        hashMap.put("thirdExtParam", fp.s0.a(obj));
        ((com.tencent.mm.plugin.websearch.h2) ((su4.a1) i95.n0.c(su4.a1.class))).Di(com.tencent.mm.sdk.platformtools.x2.f193071a, b17, c17, f17, true, b19, b18, true, "");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openSosHomeWebView", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdJumpBrandRegionHelper");
        return true;
    }
}
