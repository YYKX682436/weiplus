package com.tencent.mm.plugin.ting.uic;

/* loaded from: classes11.dex */
public final class o0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f174782d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ting.uic.p0 f174783e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f174784f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f174785g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(boolean z17, com.tencent.mm.plugin.ting.uic.p0 p0Var, boolean z18, kotlin.coroutines.Continuation continuation) {
        super(0);
        this.f174782d = z17;
        this.f174783e = p0Var;
        this.f174784f = z18;
        this.f174785g = continuation;
    }

    public static final void a(kotlin.coroutines.Continuation continuation, boolean z17) {
        try {
            continuation.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.valueOf(z17)));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TingChatRoomFloatBallAnimationUIC", e17, "exitWithAnimation exception", new java.lang.Object[0]);
        }
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17 = this.f174782d;
        kotlin.coroutines.Continuation continuation = this.f174785g;
        if (z17) {
            sl4.a a17 = jm4.t2.a(bw5.eq0.TingMusic);
            if (a17 == null) {
                a(continuation, false);
            } else if (!(a17 instanceof cm4.a)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.TingChatRoomFloatBallAnimationUIC", "exitWithAnimation floatBallHelper invalid");
                a(continuation, false);
            } else if (((cm4.a) a17).A0(true)) {
                com.tencent.mm.plugin.ting.uic.n0 n0Var = new com.tencent.mm.plugin.ting.uic.n0(continuation);
                com.tencent.mm.plugin.ting.uic.p0 p0Var = this.f174783e;
                if (!p0Var.O6(n0Var)) {
                    if (this.f174784f) {
                        p0Var.getActivity().finish();
                    }
                    a(continuation, false);
                }
            } else {
                a(continuation, false);
            }
        } else {
            a(continuation, false);
        }
        return jz5.f0.f302826a;
    }
}
