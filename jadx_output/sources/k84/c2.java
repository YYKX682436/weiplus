package k84;

/* loaded from: classes4.dex */
public final class c2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f304964d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f304965e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f304966f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k84.d2 f304967g;

    /* renamed from: h, reason: collision with root package name */
    public int f304968h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(k84.d2 d2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f304967g = d2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindComponentModel$5$2$emit$1");
        this.f304966f = obj;
        this.f304968h |= Integer.MIN_VALUE;
        java.lang.Object a17 = this.f304967g.a(null, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindComponentModel$5$2$emit$1");
        return a17;
    }
}
