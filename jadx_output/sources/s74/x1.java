package s74;

/* loaded from: classes4.dex */
public final class x1 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s74.f3 f404587d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f404588e;

    public x1(s74.f3 f3Var, java.lang.String str) {
        this.f404587d = f3Var;
        this.f404588e = str;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap;
        org.json.JSONArray optJSONArray;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("emit", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onBindDynamicComponent$2$5$1");
        java.lang.String str = (java.lang.String) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("emit", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onBindDynamicComponent$2$5$1");
        i64.u uVar = i64.u.f289322d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleDynamicItemChange", "com.tencent.mm.plugin.sns.ad.model.AdDynamicUpdateModelManager");
        s74.f3 f3Var = this.f404587d;
        if (f3Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleDynamicItemChange", "com.tencent.mm.plugin.sns.ad.model.AdDynamicUpdateModelManager");
        } else {
            java.lang.String str2 = this.f404588e;
            if (str2 == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleDynamicItemChange", "com.tencent.mm.plugin.sns.ad.model.AdDynamicUpdateModelManager");
            } else {
                boolean z17 = str == null || str.length() == 0;
                i64.u uVar2 = i64.u.f289322d;
                if (z17) {
                    com.tencent.mars.xlog.Log.e(uVar2.d(), "handleDynamicItemChange, snsId=" + str2 + ", resp=" + str);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleDynamicItemChange", "com.tencent.mm.plugin.sns.ad.model.AdDynamicUpdateModelManager");
                } else {
                    java.lang.String d17 = uVar2.d();
                    try {
                        concurrentHashMap = i64.u.f289324f;
                        if (kotlin.jvm.internal.o.b(concurrentHashMap.get(str2), str)) {
                            com.tencent.mars.xlog.Log.i(uVar2.d(), "handleDynamicItemChange, snsId=" + str2 + ", not changed");
                        }
                        org.json.JSONObject optJSONObject = new org.json.JSONObject(str).optJSONObject("influentData");
                        optJSONArray = optJSONObject != null ? optJSONObject.optJSONArray("layout") : null;
                    } catch (java.lang.Throwable th6) {
                        ca4.q.c(d17, th6);
                    }
                    if (optJSONArray == null) {
                        com.tencent.mars.xlog.Log.e(uVar2.d(), "handleDynamicItemChange, influentData-layout is null, snsId=".concat(str2));
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleDynamicItemChange", "com.tencent.mm.plugin.sns.ad.model.AdDynamicUpdateModelManager");
                    } else {
                        uVar2.h(f3Var, optJSONArray);
                        concurrentHashMap.put(str2, str);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleDynamicItemChange", "com.tencent.mm.plugin.sns.ad.model.AdDynamicUpdateModelManager");
                    }
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onBindDynamicComponent$2$5$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onBindDynamicComponent$2$5$1");
        return f0Var;
    }
}
