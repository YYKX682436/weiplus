package k84;

/* loaded from: classes4.dex */
public final class v2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f305288d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f305289e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f305290f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f305291g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f305292h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ k84.d4 f305293i;

    /* renamed from: m, reason: collision with root package name */
    public int f305294m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(k84.d4 d4Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f305293i = d4Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$changeCommentsAndLikesToGold$1");
        this.f305292h = obj;
        this.f305294m |= Integer.MIN_VALUE;
        java.lang.Object y17 = k84.d4.y(this.f305293i, null, null, null, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$changeCommentsAndLikesToGold$1");
        return y17;
    }
}
