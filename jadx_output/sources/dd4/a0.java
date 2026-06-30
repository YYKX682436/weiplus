package dd4;

/* loaded from: classes4.dex */
public final class a0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f228968d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.SnsVideoMenuEvent f228969e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dd4.e0 f228970f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.tencent.mm.autogen.events.SnsVideoMenuEvent snsVideoMenuEvent, dd4.e0 e0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f228969e = snsVideoMenuEvent;
        this.f228970f = e0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper$menuEventListener$1$callback$1");
        dd4.a0 a0Var = new dd4.a0(this.f228969e, this.f228970f, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper$menuEventListener$1$callback$1");
        return a0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper$menuEventListener$1$callback$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper$menuEventListener$1$callback$1");
        java.lang.Object invokeSuspend = ((dd4.a0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper$menuEventListener$1$callback$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper$menuEventListener$1$callback$1");
        return invokeSuspend;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x018f  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 619
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dd4.a0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
