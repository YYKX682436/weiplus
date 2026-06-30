package n34;

/* loaded from: classes4.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n34.p f334620d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f334621e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f334622f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f334623g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(n34.p pVar, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17, int i18) {
        super(0);
        this.f334620d = pVar;
        this.f334621e = snsInfo;
        this.f334622f = i17;
        this.f334623g = i18;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.CommentDetailStarHelper$doChangeStar$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.CommentDetailStarHelper$doChangeStar$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$doChangeStarInternal", "com.tencent.mm.plugin.sns.CommentDetailStarHelper");
        this.f334620d.b(this.f334621e, this.f334622f, this.f334623g);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$doChangeStarInternal", "com.tencent.mm.plugin.sns.CommentDetailStarHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.CommentDetailStarHelper$doChangeStar$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.CommentDetailStarHelper$doChangeStar$1");
        return f0Var;
    }
}
