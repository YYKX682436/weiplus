package i64;

/* loaded from: classes4.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k64.b f289162d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a44.a f289163e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f289164f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(k64.b bVar, a44.a aVar, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f289162d = bVar;
        this.f289163e = aVar;
        this.f289164f = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.model.AdComplianceModelManager$fetchModelBySnsInfo$2$result$1");
        i64.e eVar = new i64.e(this.f289162d, this.f289163e, this.f289164f, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.model.AdComplianceModelManager$fetchModelBySnsInfo$2$result$1");
        return eVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.model.AdComplianceModelManager$fetchModelBySnsInfo$2$result$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.model.AdComplianceModelManager$fetchModelBySnsInfo$2$result$1");
        java.lang.Object invokeSuspend = ((i64.e) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.model.AdComplianceModelManager$fetchModelBySnsInfo$2$result$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.model.AdComplianceModelManager$fetchModelBySnsInfo$2$result$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        i64.b bVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.model.AdComplianceModelManager$fetchModelBySnsInfo$2$result$1");
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        k64.b bVar2 = this.f289162d;
        if ((bVar2 != null && bVar2.a() == 0) && bVar2.b() == 0 && bVar2.c() != null) {
            a44.b bVar3 = a44.k.f1285g;
            a44.a adCheckDownloadAppInfo = this.f289163e;
            kotlin.jvm.internal.o.f(adCheckDownloadAppInfo, "$adCheckDownloadAppInfo");
            bVar3.f(adCheckDownloadAppInfo, (r45.oy) bVar2.c());
            boolean c17 = bVar3.c(adCheckDownloadAppInfo);
            java.lang.String str = this.f289164f;
            bVar = !c17 ? new i64.b(str, false, adCheckDownloadAppInfo) : new i64.b(str, true, adCheckDownloadAppInfo);
        } else {
            bVar = new i64.b(this.f289164f, false, null, 4, null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.model.AdComplianceModelManager$fetchModelBySnsInfo$2$result$1");
        return bVar;
    }
}
