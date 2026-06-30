package s74;

/* loaded from: classes4.dex */
public final class q1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f404505d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s74.o2 f404506e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.ADXml f404507f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s74.f3 f404508g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(s74.o2 o2Var, com.tencent.mm.plugin.sns.storage.ADXml aDXml, s74.f3 f3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f404506e = o2Var;
        this.f404507f = aDXml;
        this.f404508g = f3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onBindDynamicComponent$2$1");
        s74.q1 q1Var = new s74.q1(this.f404506e, this.f404507f, this.f404508g, continuation);
        q1Var.f404505d = obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onBindDynamicComponent$2$1");
        return q1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onBindDynamicComponent$2$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onBindDynamicComponent$2$1");
        s74.q1 q1Var = (s74.q1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        q1Var.invokeSuspend(f0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onBindDynamicComponent$2$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onBindDynamicComponent$2$1");
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onBindDynamicComponent$2$1");
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f404505d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$observeActionButtonUI", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
        s74.o2 o2Var = this.f404506e;
        o2Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("observeActionButtonUI", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
        com.tencent.mm.plugin.sns.storage.ADXml aDXml = this.f404507f;
        com.tencent.mm.plugin.sns.storage.ADXml.AdCardActionBtnInfo adCardActionBtnInfo = aDXml != null ? aDXml.adCardActionBtnInfo : null;
        if (aDXml != null) {
            if ((adCardActionBtnInfo == null || (adClickActionInfo = adCardActionBtnInfo.clickActionInfo) == null || adClickActionInfo.f162571b != 2) ? false : true) {
                s74.f3 f3Var = this.f404508g;
                if (f3Var.g() != null) {
                    com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo2 = adCardActionBtnInfo.clickActionInfo;
                    java.lang.String str = adClickActionInfo2 != null ? adClickActionInfo2.A : null;
                    java.lang.String str2 = str == null ? "" : str;
                    java.lang.String str3 = adClickActionInfo2 != null ? adClickActionInfo2.B : null;
                    java.lang.String str4 = str3 == null ? "" : str3;
                    kotlinx.coroutines.l.d(y0Var, kotlinx.coroutines.q1.f310570c, null, new s74.j1(str2, str4, null), 2, null);
                    kotlinx.coroutines.l.d(y0Var, null, null, new s74.l1(str2, f3Var, o2Var, str4, null), 3, null);
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("observeActionButtonUI", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$observeActionButtonUI", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onBindDynamicComponent$2$1");
        return f0Var;
    }
}
