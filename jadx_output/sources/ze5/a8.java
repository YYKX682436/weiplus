package ze5;

/* loaded from: classes5.dex */
public final class a8 implements sb5.s2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f471821a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v11.e0 f471822b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.l f471823c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dh0.j f471824d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f471825e;

    public a8(long j17, v11.e0 e0Var, yz5.l lVar, dh0.j jVar, java.lang.String str) {
        this.f471821a = j17;
        this.f471822b = e0Var;
        this.f471823c = lVar;
        this.f471824d = jVar;
        this.f471825e = str;
    }

    public void a() {
        java.lang.String str;
        long j17 = this.f471821a;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemMarkdownMvvm", "[THINKING_TRACE] onThinkingEnd: msgSvrId=%d", java.lang.Long.valueOf(j17));
        if (this.f471824d != null) {
            java.lang.String talker = this.f471825e;
            kotlin.jvm.internal.o.g(talker, "talker");
            str = eh0.k.f252888a.b(talker, j17);
        } else {
            str = null;
        }
        java.lang.String str2 = str;
        if (str2 != null) {
            this.f471823c.invoke(ze5.l8.b(ze5.m8.f472098a, str2, this.f471822b, false, null, null, 0L, 56, null));
        }
    }

    public void b(java.lang.String streamText) {
        kotlin.jvm.internal.o.g(streamText, "streamText");
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemMarkdownMvvm", "[THINKING_TRACE] onThinkingUpdate: msgSvrId=%d, textLen=%d", java.lang.Long.valueOf(this.f471821a), java.lang.Integer.valueOf(streamText.length()));
        this.f471823c.invoke(ze5.l8.b(ze5.m8.f472098a, streamText, this.f471822b, true, null, null, 0L, 56, null));
    }
}
