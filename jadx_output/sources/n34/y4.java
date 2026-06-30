package n34;

/* loaded from: classes4.dex */
public final class y4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n34.d5 f334794d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f334795e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f334796f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f334797g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(n34.d5 d5Var, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, android.view.View view, android.content.Context context) {
        super(0);
        this.f334794d = d5Var;
        this.f334795e = snsInfo;
        this.f334796f = view;
        this.f334797g = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.TimelineStarHelper$cancelStar$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.TimelineStarHelper$cancelStar$1");
        android.view.View view = this.f334796f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doChangeStarInternal$default", "com.tencent.mm.plugin.sns.TimelineStarHelper");
        n34.d5 d5Var = this.f334794d;
        d5Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doChangeStarInternal", "com.tencent.mm.plugin.sns.TimelineStarHelper");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f334795e;
        java.lang.String snsId = snsInfo.getSnsId();
        long n17 = com.tencent.mm.plugin.sns.storage.w2.n(snsId);
        com.tencent.mars.xlog.Log.i("MicroMsg.TimelineStarHelper", "feedId: " + snsId + ",, action: 2");
        android.content.Context context = this.f334797g;
        kotlinx.coroutines.l.d(d5Var.f334582a, null, null, new n34.b5(2, n17, snsId, snsInfo, com.tencent.mm.ui.widget.dialog.u3.f(context, context.getString(com.tencent.mm.R.string.f493243jf1), false, 0, null), context, d5Var, view, null), 3, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doChangeStarInternal", "com.tencent.mm.plugin.sns.TimelineStarHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doChangeStarInternal$default", "com.tencent.mm.plugin.sns.TimelineStarHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.TimelineStarHelper$cancelStar$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.TimelineStarHelper$cancelStar$1");
        return f0Var;
    }
}
