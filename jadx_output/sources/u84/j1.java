package u84;

/* loaded from: classes4.dex */
public final class j1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f425559d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f425560e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f425560e = snsInfo;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$requestDynamicData$2");
        u84.j1 j1Var = new u84.j1(this.f425560e, continuation);
        j1Var.f425559d = obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$requestDynamicData$2");
        return j1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$requestDynamicData$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$requestDynamicData$2");
        u84.j1 j1Var = (u84.j1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        j1Var.invokeSuspend(f0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$requestDynamicData$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$requestDynamicData$2");
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$requestDynamicData$2");
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f425559d;
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310570c;
        kotlinx.coroutines.r0 r0Var = u84.m1.N;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getExceptionHandler$cp", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
        kotlinx.coroutines.r0 r0Var2 = u84.m1.N;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getExceptionHandler$cp", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
        kotlinx.coroutines.l.d(y0Var, p0Var.plus(r0Var2), null, new u84.i1(this.f425560e, null), 2, null);
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$requestDynamicData$2");
        return f0Var;
    }
}
