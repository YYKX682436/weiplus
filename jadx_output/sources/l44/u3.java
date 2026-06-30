package l44;

/* loaded from: classes4.dex */
public abstract class u3 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f316380a = new java.util.HashMap();

    public static synchronized boolean a(java.lang.String str) {
        synchronized (l44.u3.class) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isRelievedBuyWeApp", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppHelper");
            if (android.text.TextUtils.isEmpty(str)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isRelievedBuyWeApp", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppHelper");
                return false;
            }
            java.util.Map map = f316380a;
            if (!((java.util.HashMap) map).containsKey(str)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isRelievedBuyWeApp", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppHelper");
                return false;
            }
            boolean booleanValue = ((java.lang.Boolean) ((java.util.HashMap) map).get(str)).booleanValue();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isRelievedBuyWeApp", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppHelper");
            return booleanValue;
        }
    }

    public static boolean b(com.tencent.mm.plugin.sns.storage.ADXml aDXml) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSupportShowWeAppLabel", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppHelper");
        if (aDXml == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSupportShowWeAppLabel", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppHelper");
            return false;
        }
        boolean z17 = aDXml.isCardAd() || aDXml.isCombinedGridAD() || aDXml.isNormalAd();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSupportShowWeAppLabel", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppHelper");
        return z17;
    }

    public static void c(java.lang.String str, android.widget.ImageView imageView, com.tencent.mm.plugin.sns.storage.ADInfo aDInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refreshWeAppGuaranteeAuthIcon", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppHelper");
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mars.xlog.Log.e("AdWeAppHelper", "refreshWeAppAuthIcon, weAppUserName==null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshWeAppGuaranteeAuthIcon", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppHelper");
            return;
        }
        imageView.setTag(str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isExpShowRelievedBuy", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppHelper");
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.relievedbuy, 0) == 1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isExpShowRelievedBuy", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isExpShowFlagshipLabel", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppHelper");
        boolean z18 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.wxapp_flagship_store, 0) == 1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isExpShowFlagshipLabel", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppHelper");
        boolean z19 = z17 || z18;
        boolean a17 = a(str);
        boolean z27 = !aDInfo.forbiddenShowRelievedBuy && z19 && a17;
        if (z27) {
            imageView.setVisibility(0);
        } else if (imageView.getVisibility() == 0) {
            imageView.setVisibility(4);
        }
        synchronized (l44.u3.class) {
            try {
                ((java.util.HashMap) f316380a).put(str, java.lang.Boolean.valueOf(z27));
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshWeAppGuaranteeAuthIcon", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppHelper");
                throw th6;
            }
        }
        com.tencent.mars.xlog.Log.i("AdWeAppHelper", "refreshWeAppGuaranteeAuthIcon, isExpShowFlagshipLabel=" + z18 + ", isExpShowRelievedBuy=" + z17 + ", isForbid=" + aDInfo.forbiddenShowRelievedBuy + ", cache=" + a17);
        if (aDInfo.forbiddenShowRelievedBuy || !z19) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshWeAppGuaranteeAuthIcon", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppHelper");
        } else {
            ((k91.g4) ((com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class))).Ri(str, new l44.t3(imageView, z18, z17));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshWeAppGuaranteeAuthIcon", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppHelper");
        }
    }
}
