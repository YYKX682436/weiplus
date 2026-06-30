package gd4;

/* loaded from: classes4.dex */
public final class m extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f270752d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f270753e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gd4.n f270754f;

    /* renamed from: g, reason: collision with root package name */
    public int f270755g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(gd4.n nVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f270754f = nVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$readySnsSightOffline$uiModelJob$1$2$emit$1");
        this.f270753e = obj;
        this.f270755g |= Integer.MIN_VALUE;
        java.lang.Object a17 = this.f270754f.a(null, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$readySnsSightOffline$uiModelJob$1$2$emit$1");
        return a17;
    }
}
