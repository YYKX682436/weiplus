package oc4;

/* loaded from: classes4.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC f344343d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC improveUnreadUIC, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f344343d = improveUnreadUIC;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$clickUnreadBtnListener$1$callback$1");
        oc4.h hVar = new oc4.h(this.f344343d, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$clickUnreadBtnListener$1$callback$1");
        return hVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$clickUnreadBtnListener$1$callback$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$clickUnreadBtnListener$1$callback$1");
        oc4.h hVar = (oc4.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        hVar.invokeSuspend(f0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$clickUnreadBtnListener$1$callback$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$clickUnreadBtnListener$1$callback$1");
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.ArrayList a17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$clickUnreadBtnListener$1$callback$1");
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC improveUnreadUIC = this.f344343d;
        oc4.v S6 = improveUnreadUIC.S6();
        if (S6 != null && (a17 = S6.a()) != null) {
            java.util.Iterator it = a17.iterator();
            while (it.hasNext()) {
                oc4.s sVar = (oc4.s) com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC.O6(improveUnreadUIC).get((java.lang.String) it.next());
                if (sVar != null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setExpose", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadPair");
                    sVar.f344366a = true;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setExpose", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadPair");
                }
            }
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$clickUnreadBtnListener$1$callback$1");
        return f0Var;
    }
}
