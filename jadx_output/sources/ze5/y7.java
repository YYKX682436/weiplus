package ze5;

/* loaded from: classes5.dex */
public final class y7 implements sb5.t2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f472325a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ af5.d1 f472326b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.p f472327c;

    public y7(long j17, af5.d1 d1Var, yz5.p pVar) {
        this.f472325a = j17;
        this.f472326b = d1Var;
        this.f472327c = pVar;
    }

    public void a(v11.n0 thinkingState) {
        kotlin.jvm.internal.o.g(thinkingState, "thinkingState");
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemMarkdownMvvm", "[THINKING_TRACE] onThinkingStatusChanged: msgSvrId=%d, state=%s", java.lang.Long.valueOf(this.f472325a), thinkingState.name());
        this.f472326b.setViewModel(new v11.m0(thinkingState, thinkingState != v11.n0.f432445d ? this.f472327c : null));
    }
}
