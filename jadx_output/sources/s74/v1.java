package s74;

/* loaded from: classes4.dex */
public final class v1 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s74.f3 f404568d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f404569e;

    public v1(s74.f3 f3Var, java.lang.String str) {
        this.f404568d = f3Var;
        this.f404569e = str;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap;
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("emit", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onBindDynamicComponent$2$4$1");
        java.lang.String str2 = (java.lang.String) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("emit", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onBindDynamicComponent$2$4$1");
        i64.y yVar = i64.y.f289357d;
        yVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleProductChange", "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager");
        s74.f3 f3Var = this.f404568d;
        if (f3Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleProductChange", "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager");
        } else {
            java.lang.String str3 = this.f404569e;
            if (str3 == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleProductChange", "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager");
            } else {
                if (str2 == null || str2.length() == 0) {
                    com.tencent.mars.xlog.Log.e(yVar.d(), "handleProductChange, snsId=" + str3 + ", resp=" + str2);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleProductChange", "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager");
                } else {
                    try {
                        concurrentHashMap = i64.y.f289359f;
                        i64.x xVar = (i64.x) concurrentHashMap.get(str3);
                        if (xVar != null) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRespString", "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager$LivingProductResp");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRespString", "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager$LivingProductResp");
                            str = xVar.f289352a;
                        } else {
                            str = null;
                        }
                    } catch (java.lang.Throwable th6) {
                        ca4.q.c("handleLivingProductChange", th6);
                    }
                    if (kotlin.jvm.internal.o.b(str, str2)) {
                        com.tencent.mars.xlog.Log.w(yVar.d(), "handleProductChange, snsId=" + str3 + ", product not changed");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleProductChange", "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager");
                    } else {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1837, 11);
                        org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
                        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("influentData");
                        org.json.JSONArray optJSONArray = optJSONObject != null ? optJSONObject.optJSONArray("layout") : null;
                        if (optJSONArray == null) {
                            com.tencent.mars.xlog.Log.e(yVar.d(), "handleProductChange, influentData-layout is null, snsId=".concat(str3));
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleProductChange", "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager");
                        } else {
                            org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("adFinderLiveProductInfo");
                            java.lang.String optString = optJSONObject2 != null ? optJSONObject2.optString("finderLiveProductId") : null;
                            if (optString == null) {
                                optString = "";
                            }
                            com.tencent.mars.xlog.Log.i(yVar.d(), "handleProductChange, snsId=" + str3 + ", component.size=" + optJSONArray.length() + ", productId=" + optString);
                            yVar.k(f3Var, optJSONArray);
                            concurrentHashMap.put(str3, new i64.x(str2, com.tencent.mm.sdk.platformtools.t8.F1(optString, 0L), optJSONArray));
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleProductChange", "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager");
                        }
                    }
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onBindDynamicComponent$2$4$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onBindDynamicComponent$2$4$1");
        return f0Var;
    }
}
