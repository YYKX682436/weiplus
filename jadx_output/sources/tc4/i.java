package tc4;

/* loaded from: classes4.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.g92 f417361d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tc4.a0 f417362e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xc4.p f417363f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(r45.g92 g92Var, tc4.a0 a0Var, xc4.p pVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f417361d = g92Var;
        this.f417362e = a0Var;
        this.f417363f = pVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$checkLiveStatus$2");
        tc4.i iVar = new tc4.i(this.f417361d, this.f417362e, this.f417363f, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$checkLiveStatus$2");
        return iVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$checkLiveStatus$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$checkLiveStatus$2");
        tc4.i iVar = (tc4.i) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        iVar.invokeSuspend(f0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$checkLiveStatus$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$checkLiveStatus$2");
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Long j17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$checkLiveStatus$2");
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.g92 g92Var = this.f417361d;
        java.lang.String string = g92Var.getString(0);
        long longValue = (string == null || (j17 = r26.h0.j(string)) == null) ? 0L : j17.longValue();
        int integer = g92Var.getInteger(13);
        tc4.a0 a0Var = this.f417362e;
        a0Var.x("MicroMsg.Improve.FinderLiveTimelineItem", "checkLiveStatus thisLiveId:" + longValue + " originStatus:" + integer);
        r45.g92 g92Var2 = this.f417361d;
        tc4.h hVar = new tc4.h(g92Var2, this.f417362e, this.f417363f, longValue, integer);
        boolean z17 = ((r45.nw1) g92Var2.getCustom(24)) == null;
        i95.m c17 = i95.n0.c(s40.w0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        s40.w0 w0Var = (s40.w0) c17;
        android.content.Context context = a0Var.getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) context;
        qs5.d dVar = qs5.d.f366426e;
        s40.w0.u9(w0Var, longValue, z17, mMActivity, hVar, 2, null, null, null, 224, null);
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$checkLiveStatus$2");
        return f0Var;
    }
}
