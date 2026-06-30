package u84;

/* loaded from: classes4.dex */
public final class t0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f425668d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f425669e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u84.m1 f425670f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, u84.m1 m1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f425669e = snsInfo;
        this.f425670f = m1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$handleInteractType$1$1");
        u84.t0 t0Var = new u84.t0(this.f425669e, this.f425670f, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$handleInteractType$1$1");
        return t0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$handleInteractType$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$handleInteractType$1$1");
        java.lang.Object invokeSuspend = ((u84.t0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$handleInteractType$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$handleInteractType$1$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$handleInteractType$1$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f425668d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            l44.b3 b3Var = l44.b3.f316041a;
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f425669e;
            kotlinx.coroutines.flow.j c17 = b3Var.c(snsInfo.getSnsId());
            u84.s0 s0Var = new u84.s0(this.f425670f, snsInfo);
            this.f425668d = 1;
            if (((v26.g) c17).a(s0Var, this) == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$handleInteractType$1$1");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$handleInteractType$1$1");
                throw illegalStateException;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$handleInteractType$1$1");
        return f0Var;
    }
}
