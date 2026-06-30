package s74;

/* loaded from: classes4.dex */
public final class a2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f404202d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s74.o2 f404203e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f404204f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(s74.o2 o2Var, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f404203e = o2Var;
        this.f404204f = snsInfo;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onBindDynamicComponent$2");
        s74.a2 a2Var = new s74.a2(this.f404203e, this.f404204f, continuation);
        a2Var.f404202d = obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onBindDynamicComponent$2");
        return a2Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onBindDynamicComponent$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onBindDynamicComponent$2");
        java.lang.Object invokeSuspend = ((s74.a2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onBindDynamicComponent$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onBindDynamicComponent$2");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onBindDynamicComponent$2");
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f404202d;
        s74.o2 o2Var = this.f404203e;
        s74.f3 D = o2Var.D();
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (D == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onBindDynamicComponent$2");
            return f0Var;
        }
        com.tencent.mm.plugin.sns.storage.ADXml f17 = D.f();
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f404204f;
        java.lang.String T = ca4.z0.T(snsInfo);
        if (T == null) {
            T = "";
        }
        java.lang.String str = T;
        kotlinx.coroutines.l.d(y0Var, null, null, new s74.q1(o2Var, f17, D, null), 3, null);
        kotlinx.coroutines.l.d(y0Var, null, null, new s74.r1(o2Var, f17, D, null), 3, null);
        kotlinx.coroutines.l.d(y0Var, null, null, new s74.u1(str, snsInfo, D, null), 3, null);
        kotlinx.coroutines.l.d(y0Var, null, null, new s74.w1(this.f404204f, this.f404203e, str, D, null), 3, null);
        kotlinx.coroutines.l.d(y0Var, null, null, new s74.y1(this.f404204f, this.f404203e, str, D, null), 3, null);
        kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getExceptionHandler", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        kotlinx.coroutines.r0 r0Var = o2Var.f404453t;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getExceptionHandler", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        kotlinx.coroutines.l.d(y0Var, g3Var.plus(r0Var), null, new s74.z1(o2Var, null), 2, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onBindDynamicComponent$2");
        return f0Var;
    }
}
