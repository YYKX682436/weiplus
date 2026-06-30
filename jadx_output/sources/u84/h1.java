package u84;

/* loaded from: classes4.dex */
public final class h1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f425548d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f425549e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u84.m1 f425550f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f425551g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, u84.m1 m1Var, android.content.Context context, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f425549e = snsInfo;
        this.f425550f = m1Var;
        this.f425551g = context;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$requestDynamicData$1");
        u84.h1 h1Var = new u84.h1(this.f425549e, this.f425550f, this.f425551g, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$requestDynamicData$1");
        return h1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$requestDynamicData$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$requestDynamicData$1");
        java.lang.Object invokeSuspend = ((u84.h1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$requestDynamicData$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$requestDynamicData$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$requestDynamicData$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f425548d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.j e17 = i64.o.f289257d.e(a84.d0.c(this.f425549e));
            u84.g1 g1Var = new u84.g1(this.f425550f, this.f425551g);
            this.f425548d = 1;
            if (((kotlinx.coroutines.flow.h3) e17).a(g1Var, this) == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$requestDynamicData$1");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$requestDynamicData$1");
                throw illegalStateException;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$requestDynamicData$1");
        return f0Var;
    }
}
