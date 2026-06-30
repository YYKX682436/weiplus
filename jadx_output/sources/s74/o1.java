package s74;

/* loaded from: classes4.dex */
public final class o1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f404460d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f404461e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s74.f3 f404462f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s74.o2 f404463g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f404464h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(java.lang.String str, s74.f3 f3Var, s74.o2 o2Var, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f404461e = str;
        this.f404462f = f3Var;
        this.f404463g = o2Var;
        this.f404464h = str2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$observeActionLinkUI$3");
        s74.o1 o1Var = new s74.o1(this.f404461e, this.f404462f, this.f404463g, this.f404464h, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$observeActionLinkUI$3");
        return o1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$observeActionLinkUI$3");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$observeActionLinkUI$3");
        java.lang.Object invokeSuspend = ((s74.o1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$observeActionLinkUI$3");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$observeActionLinkUI$3");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$observeActionLinkUI$3");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f404460d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            i64.t tVar = i64.t.f289316d;
            java.lang.String appId = this.f404461e;
            kotlin.jvm.internal.o.f(appId, "$appId");
            kotlinx.coroutines.flow.j e17 = tVar.e(appId);
            s74.n1 n1Var = new s74.n1(this.f404462f, this.f404463g, appId, this.f404464h);
            this.f404460d = 1;
            if (((kotlinx.coroutines.flow.h3) e17).a(n1Var, this) == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$observeActionLinkUI$3");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$observeActionLinkUI$3");
                throw illegalStateException;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$observeActionLinkUI$3");
        return f0Var;
    }
}
