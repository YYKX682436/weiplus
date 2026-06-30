package oc4;

/* loaded from: classes4.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC f344353d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC improveUnreadUIC, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f344353d = improveUnreadUIC;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$report$1");
        oc4.n nVar = new oc4.n(this.f344353d, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$report$1");
        return nVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$report$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$report$1");
        oc4.n nVar = (oc4.n) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        nVar.invokeSuspend(f0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$report$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$report$1");
        return f0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x029d  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instructions count: 1405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oc4.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
