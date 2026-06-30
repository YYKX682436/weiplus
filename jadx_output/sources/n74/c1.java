package n74;

/* loaded from: classes4.dex */
public abstract class c1 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f335314a = new java.util.concurrent.ConcurrentHashMap();

    public static boolean a(com.tencent.mm.plugin.sns.storage.ADInfo aDInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkAdExtTailWording", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper");
        boolean z17 = false;
        if (aDInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkAdExtTailWording", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper");
            return false;
        }
        boolean z18 = !com.tencent.mm.sdk.platformtools.t8.K0(aDInfo.adExtTailWording) && aDInfo.adExtTailWordingExchangeValue > 0;
        if (z18) {
            boolean contains = aDInfo.adExtTailWording.contains("%d");
            int indexOf = aDInfo.adExtTailWording.indexOf("%");
            int lastIndexOf = aDInfo.adExtTailWording.lastIndexOf("%");
            if (contains && indexOf == lastIndexOf) {
                z17 = true;
            }
            z18 = z17;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkAdExtTailWording", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper");
        return z18;
    }

    public static boolean b(com.tencent.mm.plugin.sns.storage.ADInfo aDInfo, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkOriginAdChainData", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper");
        if (aDInfo == null || ((aDInfo.adActionExtTailType != com.tencent.mm.plugin.sns.storage.ADInfo.ADChainStrengthenUserInfoFormatWording || com.tencent.mm.sdk.platformtools.t8.K0(aDInfo.adActionExtTailWording) || aDInfo.adActionExtUserList.size() <= 0) && (aDInfo.adActionExtTailType != com.tencent.mm.plugin.sns.storage.ADInfo.ADChainStrengthenDefaultWording || com.tencent.mm.sdk.platformtools.t8.K0(aDInfo.adActionExtTailWording)))) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkOriginAdChainData", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper");
            return false;
        }
        com.tencent.mars.xlog.Log.i("DynamicDataReqHelper", "use init adChainData");
        ((java.util.concurrent.ConcurrentHashMap) f335314a).put(str, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkOriginAdChainData", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper");
        return true;
    }

    public static void c(int i17, java.lang.String str, com.tencent.mm.plugin.sns.storage.ADInfo aDInfo, com.tencent.mm.protocal.protobuf.SnsObject snsObject, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateAdChainData", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper");
        if (aDInfo == null || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("DynamicDataReqHelper", "adInfo or snsId is null, snsId = " + str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateAdChainData", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper");
            return;
        }
        if (snsObject == null) {
            com.tencent.mars.xlog.Log.e("DynamicDataReqHelper", "snsObject is null, snsId = " + str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateAdChainData", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper");
            return;
        }
        if (aDInfo.adChainType != 1) {
            com.tencent.mars.xlog.Log.i("DynamicDataReqHelper", "adChainType is not 1, snsId = " + str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateAdChainData", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper");
            return;
        }
        if (snsInfo != null && snsInfo.getAdXml().isHideAdChainStrengthenLabel()) {
            com.tencent.mars.xlog.Log.i("DynamicDataReqHelper", "isHideAdChainStrengthenLabel is 1, snsId = " + str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateAdChainData", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper");
            return;
        }
        int i18 = aDInfo.adChainTypeExpireTime;
        int i19 = i18 == 0 ? com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL : i18 * 1000;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.Map map = f335314a;
        java.lang.Long l17 = (java.lang.Long) ((java.util.concurrent.ConcurrentHashMap) map).get(str);
        if (currentTimeMillis - (l17 == null ? 0L : l17.longValue()) < i19) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateAdChainData", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper");
            return;
        }
        java.util.HashSet H = ca4.m0.H(snsObject);
        java.util.HashSet F = ca4.m0.F(snsObject);
        i64.o0 o0Var = new i64.o0(i17, "", aDInfo.aid, str, aDInfo.uxInfo, ca4.m0.G(H, F).size(), H.size(), F.size());
        gm0.j1.d().a(4342, new n74.b1(i17, str, null));
        gm0.j1.n().f273288b.g(o0Var);
        ((java.util.concurrent.ConcurrentHashMap) map).put(str, java.lang.Long.valueOf(currentTimeMillis));
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1612, 43);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateAdChainData", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper");
    }

    public static void d(android.widget.TextView textView, com.tencent.mm.protocal.protobuf.SnsObject snsObject, com.tencent.mm.plugin.sns.storage.ADInfo aDInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateAdExtTailWording", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper");
        if (textView == null || snsObject == null || aDInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateAdExtTailWording", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper");
            return;
        }
        try {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLikeCommentUsersUnion", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            java.util.HashSet G = ca4.m0.G(ca4.m0.H(snsObject), ca4.m0.F(snsObject));
            if (!com.tencent.mm.sdk.platformtools.t8.K0(snsObject.Username)) {
                G.remove(snsObject.Username);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLikeCommentUsersUnion", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            textView.setText(java.lang.String.format(aDInfo.adExtTailWording, java.lang.Integer.valueOf(java.lang.Math.max(G.size(), aDInfo.adExtTailWordingExchangeValue))));
            textView.setVisibility(0);
            if (aDInfo.adExtTailWordingExchangeValue < G.size()) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1612, 51);
            }
        } catch (java.lang.Throwable th6) {
            textView.setVisibility(8);
            com.tencent.mars.xlog.Log.e("DynamicDataReqHelper", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateAdExtTailWording", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper");
    }
}
