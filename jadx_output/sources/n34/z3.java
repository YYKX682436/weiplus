package n34;

/* loaded from: classes4.dex */
public final class z3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f334798d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.SnsStarListDataUIC f334799e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(java.util.List list, com.tencent.mm.plugin.sns.SnsStarListDataUIC snsStarListDataUIC, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f334798d = list;
        this.f334799e = snsStarListDataUIC;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.SnsStarListDataUIC$initFixData$2");
        n34.z3 z3Var = new n34.z3(this.f334798d, this.f334799e, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.SnsStarListDataUIC$initFixData$2");
        return z3Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.SnsStarListDataUIC$initFixData$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.SnsStarListDataUIC$initFixData$2");
        n34.z3 z3Var = (n34.z3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        z3Var.invokeSuspend(f0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.SnsStarListDataUIC$initFixData$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.SnsStarListDataUIC$initFixData$2");
        return f0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x041b, code lost:
    
        if (r11.size() == 1) goto L98;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0443 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0429  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 1220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n34.z3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
