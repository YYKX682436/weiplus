package f84;

/* loaded from: classes4.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f260187d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f260188e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f84.u f260189f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, f84.u uVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f260188e = snsInfo;
        this.f260189f = uVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent$handleInteractType$1$1");
        f84.h hVar = new f84.h(this.f260188e, this.f260189f, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent$handleInteractType$1$1");
        return hVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent$handleInteractType$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent$handleInteractType$1$1");
        java.lang.Object invokeSuspend = ((f84.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent$handleInteractType$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent$handleInteractType$1$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent$handleInteractType$1$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f260187d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            l44.b3 b3Var = l44.b3.f316041a;
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f260188e;
            kotlinx.coroutines.flow.j c17 = b3Var.c(snsInfo.getSnsId());
            f84.g gVar = new f84.g(this.f260189f, snsInfo);
            this.f260187d = 1;
            if (((v26.g) c17).a(gVar, this) == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent$handleInteractType$1$1");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent$handleInteractType$1$1");
                throw illegalStateException;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent$handleInteractType$1$1");
        return f0Var;
    }
}
