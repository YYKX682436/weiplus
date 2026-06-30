package e84;

/* loaded from: classes4.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f250261d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f250262e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e84.t f250263f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, e84.t tVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f250262e = snsInfo;
        this.f250263f = tVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent$handlePAGAnimEndNotify$1$1");
        e84.d dVar = new e84.d(this.f250262e, this.f250263f, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent$handlePAGAnimEndNotify$1$1");
        return dVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent$handlePAGAnimEndNotify$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent$handlePAGAnimEndNotify$1$1");
        java.lang.Object invokeSuspend = ((e84.d) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent$handlePAGAnimEndNotify$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent$handlePAGAnimEndNotify$1$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent$handlePAGAnimEndNotify$1$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f250261d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            l44.b3 b3Var = l44.b3.f316041a;
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f250262e;
            java.lang.String snsId = snsInfo.getSnsId();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdBreakFramePAGPlayEndFlow", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBreakFramePAGPlayEndFlow", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper");
            kotlinx.coroutines.flow.i2 i2Var = l44.b3.f316052l;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBreakFramePAGPlayEndFlow", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdBreakFramePAGPlayEndFlow", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper");
            e84.c cVar = new e84.c(this.f250263f, snsInfo);
            this.f250261d = 1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("collect", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper$getAdBreakFramePAGPlayEndFlow$$inlined$map$1");
            l44.g0 g0Var = new l44.g0(cVar);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("collect", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper$getBreakFramePAGPlayEndFlow$$inlined$filter$1");
            java.lang.Object a17 = i2Var.a(new l44.p1(g0Var, snsId), this);
            if (a17 == pz5.a.f359186d) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("collect", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper$getBreakFramePAGPlayEndFlow$$inlined$filter$1");
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("collect", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper$getBreakFramePAGPlayEndFlow$$inlined$filter$1");
                a17 = f0Var;
            }
            if (a17 == pz5.a.f359186d) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("collect", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper$getAdBreakFramePAGPlayEndFlow$$inlined$map$1");
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("collect", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper$getAdBreakFramePAGPlayEndFlow$$inlined$map$1");
                a17 = f0Var;
            }
            if (a17 == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent$handlePAGAnimEndNotify$1$1");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent$handlePAGAnimEndNotify$1$1");
                throw illegalStateException;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent$handlePAGAnimEndNotify$1$1");
        return f0Var;
    }
}
