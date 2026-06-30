package l44;

/* loaded from: classes4.dex */
public class w4 implements yz5.p {
    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper$4");
        java.lang.String str = (java.lang.String) obj;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) obj2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper$4");
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (K0) {
            com.tencent.mars.xlog.Log.e("FinderAdPreloadHelper", "onAddAppear req finderFeedsObjectIds, encryptedObjectId is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper$4");
        } else if (finderObject == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
            l44.a5.f316030a.remove(str);
            com.tencent.mars.xlog.Log.e("FinderAdPreloadHelper", "onAddAppear req finderFeedsObjectIds, finderObject is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper$4");
        } else {
            long id6 = finderObject.getId();
            l44.a5.f316031b.put(str, java.lang.Long.valueOf(id6));
            com.tencent.mars.xlog.Log.i("FinderAdPreloadHelper", "onAddAppear req finderFeedsObjectIds received, encryptedObjectId is " + str + ", objectId is " + id6);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper$4");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper$4");
        return f0Var;
    }
}
