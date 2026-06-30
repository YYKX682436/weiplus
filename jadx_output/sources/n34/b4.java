package n34;

/* loaded from: classes4.dex */
public final class b4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f334554d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f334555e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f334556f;

    /* renamed from: g, reason: collision with root package name */
    public int f334557g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.SnsStarListDataUIC f334558h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(com.tencent.mm.plugin.sns.SnsStarListDataUIC snsStarListDataUIC, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f334558h = snsStarListDataUIC;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.SnsStarListDataUIC$loadData$1");
        n34.b4 b4Var = new n34.b4(this.f334558h, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.SnsStarListDataUIC$loadData$1");
        return b4Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.SnsStarListDataUIC$loadData$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.SnsStarListDataUIC$loadData$1");
        java.lang.Object invokeSuspend = ((n34.b4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.SnsStarListDataUIC$loadData$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.SnsStarListDataUIC$loadData$1");
        return invokeSuspend;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x002d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x017c  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instructions count: 1118
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n34.b4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
