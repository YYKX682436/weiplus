package l44;

/* loaded from: classes4.dex */
public class t4 implements yz5.p {
    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper$1");
        java.lang.String str = (java.lang.String) obj;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) obj2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("preloadFinderFeedsResources", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("FinderAdPreloadHelper", "reqFinderFeedsObjectIds, encryptedObjectId is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preloadFinderFeedsResources", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
        } else if (finderObject == null) {
            l44.a5.f316030a.remove(str);
            com.tencent.mars.xlog.Log.e("FinderAdPreloadHelper", "reqFinderFeedsObjectIds, finderObject is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preloadFinderFeedsResources", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
        } else if (l44.a5.f316032c == null) {
            com.tencent.mars.xlog.Log.e("FinderAdPreloadHelper", "finderPreloadVideoService is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preloadFinderFeedsResources", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
        } else {
            long id6 = finderObject.getId();
            l44.a5.f316031b.put(str, java.lang.Long.valueOf(id6));
            ((ku5.t0) ku5.t0.f312615d).g(new l44.u4(str, id6, finderObject));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preloadFinderFeedsResources", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper$1");
        return f0Var;
    }
}
