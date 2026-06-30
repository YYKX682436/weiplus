package tc4;

/* loaded from: classes4.dex */
public final class i3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tc4.j3 f417370d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(tc4.j3 j3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f417370d = j3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.item.OtherImproveTimelineItem$loadCustomItemInfo$2");
        tc4.i3 i3Var = new tc4.i3(this.f417370d, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.item.OtherImproveTimelineItem$loadCustomItemInfo$2");
        return i3Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.OtherImproveTimelineItem$loadCustomItemInfo$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.OtherImproveTimelineItem$loadCustomItemInfo$2");
        java.lang.Object invokeSuspend = ((tc4.i3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.OtherImproveTimelineItem$loadCustomItemInfo$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.OtherImproveTimelineItem$loadCustomItemInfo$2");
        return invokeSuspend;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x032d  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r33) {
        /*
            Method dump skipped, instructions count: 920
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tc4.i3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
