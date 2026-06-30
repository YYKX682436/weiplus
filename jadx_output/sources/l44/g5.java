package l44;

/* loaded from: classes4.dex */
public final class g5 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f316153d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l44.m5 f316154e;

    /* renamed from: f, reason: collision with root package name */
    public int f316155f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(l44.m5 m5Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f316154e = m5Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$requestFollowBrand$1");
        this.f316153d = obj;
        this.f316155f |= Integer.MIN_VALUE;
        java.lang.Object a17 = this.f316154e.a(null, 0, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$requestFollowBrand$1");
        return a17;
    }
}
