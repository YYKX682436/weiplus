package e84;

/* loaded from: classes4.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f250264d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f250265e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e84.t f250266f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, e84.t tVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f250265e = snsInfo;
        this.f250266f = tVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent$handlePAGAnimEndNotify$1");
        e84.e eVar = new e84.e(this.f250265e, this.f250266f, continuation);
        eVar.f250264d = obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent$handlePAGAnimEndNotify$1");
        return eVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent$handlePAGAnimEndNotify$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent$handlePAGAnimEndNotify$1");
        e84.e eVar = (e84.e) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        eVar.invokeSuspend(f0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent$handlePAGAnimEndNotify$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent$handlePAGAnimEndNotify$1");
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent$handlePAGAnimEndNotify$1");
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.l.d((kotlinx.coroutines.y0) this.f250264d, null, null, new e84.d(this.f250265e, this.f250266f, null), 3, null);
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent$handlePAGAnimEndNotify$1");
        return f0Var;
    }
}
