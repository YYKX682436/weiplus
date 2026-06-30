package ws2;

/* loaded from: classes3.dex */
public final class b0 extends we2.w {

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f449009i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        this.f449009i = kz5.c0.i(new ws2.a0(this, liveContext), new af2.m(liveContext), new af2.i(liveContext), new ws2.z(this, liveContext), new af2.n(liveContext), new af2.l(liveContext), new af2.f(liveContext), new xe2.n(liveContext), new af2.b(), new af2.c(liveContext), new af2.a(liveContext));
    }

    @Override // we2.w
    public boolean P6(we2.c cgiResp) {
        kotlin.jvm.internal.o.g(cgiResp, "cgiResp");
        boolean z17 = false;
        for (we2.c0 c0Var : this.f449009i) {
            boolean a17 = c0Var.a(cgiResp);
            if (!a17) {
                com.tencent.mars.xlog.Log.i("FinderLiveReplayMsgRespChain", "dealWithResp interceptor:" + c0Var.getClass().getSimpleName() + " break!");
                return a17;
            }
            z17 = a17;
        }
        return z17;
    }

    @Override // we2.w
    public java.util.List Q6() {
        return this.f449009i;
    }
}
