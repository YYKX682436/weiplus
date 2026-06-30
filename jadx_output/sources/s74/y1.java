package s74;

/* loaded from: classes4.dex */
public final class y1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f404604d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f404605e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s74.o2 f404606f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f404607g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ s74.f3 f404608h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, s74.o2 o2Var, java.lang.String str, s74.f3 f3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f404605e = snsInfo;
        this.f404606f = o2Var;
        this.f404607g = str;
        this.f404608h = f3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onBindDynamicComponent$2$5");
        s74.y1 y1Var = new s74.y1(this.f404605e, this.f404606f, this.f404607g, this.f404608h, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onBindDynamicComponent$2$5");
        return y1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onBindDynamicComponent$2$5");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onBindDynamicComponent$2$5");
        java.lang.Object invokeSuspend = ((s74.y1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onBindDynamicComponent$2$5");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onBindDynamicComponent$2$5");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        org.json.JSONArray optJSONArray;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onBindDynamicComponent$2$5");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f404604d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (this.f404605e.needDynamicViewUpdate()) {
                s74.f3 D = this.f404606f.D();
                i64.u uVar = i64.u.f289322d;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateByLocalCache", "com.tencent.mm.plugin.sns.ad.model.AdDynamicUpdateModelManager");
                java.lang.String str = this.f404607g;
                if (D == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateByLocalCache", "com.tencent.mm.plugin.sns.ad.model.AdDynamicUpdateModelManager");
                } else if (str == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateByLocalCache", "com.tencent.mm.plugin.sns.ad.model.AdDynamicUpdateModelManager");
                } else {
                    java.lang.String str2 = (java.lang.String) i64.u.f289324f.get(str);
                    if (str2 == null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateByLocalCache", "com.tencent.mm.plugin.sns.ad.model.AdDynamicUpdateModelManager");
                    } else {
                        i64.u uVar2 = i64.u.f289322d;
                        com.tencent.mars.xlog.Log.i(uVar2.d(), "updateByLocalCache, snsId=".concat(str));
                        java.lang.String d17 = uVar2.d();
                        try {
                            org.json.JSONObject optJSONObject = new org.json.JSONObject(str2).optJSONObject("influentData");
                            optJSONArray = optJSONObject != null ? optJSONObject.optJSONArray("layout") : null;
                        } catch (java.lang.Throwable th6) {
                            ca4.q.c(d17, th6);
                        }
                        if (optJSONArray == null) {
                            com.tencent.mars.xlog.Log.e(uVar2.d(), "updateByLocalCache, influentData-layout is null, snsId=".concat(str));
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateByLocalCache", "com.tencent.mm.plugin.sns.ad.model.AdDynamicUpdateModelManager");
                        } else {
                            uVar2.h(D, optJSONArray);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateByLocalCache", "com.tencent.mm.plugin.sns.ad.model.AdDynamicUpdateModelManager");
                        }
                    }
                }
                kotlinx.coroutines.flow.j e17 = i64.u.f289322d.e(str);
                s74.x1 x1Var = new s74.x1(this.f404608h, str);
                this.f404604d = 1;
                if (((kotlinx.coroutines.flow.h3) e17).a(x1Var, this) == aVar) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onBindDynamicComponent$2$5");
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onBindDynamicComponent$2$5");
                throw illegalStateException;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onBindDynamicComponent$2$5");
        return f0Var;
    }
}
