package qg5;

/* loaded from: classes8.dex */
public final class b5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qg5.n5 f362933d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5(qg5.n5 n5Var) {
        super(0);
        this.f362933d = n5Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ((qg5.e3) qg5.n5.U6(this.f362933d)).oj("journey_summarize");
        com.tencent.mars.xlog.Log.i("MicroMsg.YuanBaoSummarizeFSC", "[handleSummaryTosConsent] user rejected");
        return jz5.f0.f302826a;
    }
}
