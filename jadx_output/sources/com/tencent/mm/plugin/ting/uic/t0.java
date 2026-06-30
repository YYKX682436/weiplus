package com.tencent.mm.plugin.ting.uic;

/* loaded from: classes11.dex */
public final class t0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f174796d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ting.uic.u0 f174797e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f174798f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f174799g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(boolean z17, com.tencent.mm.plugin.ting.uic.u0 u0Var, boolean z18, kotlin.coroutines.Continuation continuation) {
        super(0);
        this.f174796d = z17;
        this.f174797e = u0Var;
        this.f174798f = z18;
        this.f174799g = continuation;
    }

    public static final void a(kotlin.coroutines.Continuation continuation, boolean z17) {
        try {
            continuation.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.valueOf(z17)));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TingRadioChannelFloatBallAnimationUIC", e17, "exitWithAnimation exception", new java.lang.Object[0]);
        }
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17 = this.f174796d;
        kotlin.coroutines.Continuation continuation = this.f174799g;
        if (z17) {
            sl4.a a17 = jm4.t2.a(bw5.eq0.AudioRadio);
            if (a17 == null) {
                a(continuation, false);
            } else if ((a17 instanceof zl4.e) && (a17 instanceof xl4.e)) {
                zl4.e eVar = (zl4.e) a17;
                eVar.i(true);
                eVar.f409264s = false;
                eVar.f93132d.f93058s = false;
                boolean A0 = eVar.A0(true);
                com.tencent.mars.xlog.Log.i("MicroMsg.TingRadioChannelFloatBallAnimationUIC", "exitWithAnimation added: " + A0);
                if (A0) {
                    com.tencent.mm.plugin.ting.uic.s0 s0Var = new com.tencent.mm.plugin.ting.uic.s0(continuation, a17);
                    com.tencent.mm.plugin.ting.uic.u0 u0Var = this.f174797e;
                    if (!u0Var.O6(s0Var)) {
                        if (this.f174798f) {
                            u0Var.getActivity().finish();
                        }
                        a(continuation, false);
                    }
                } else {
                    a(continuation, false);
                }
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.TingRadioChannelFloatBallAnimationUIC", "exitWithAnimation floatBallHelper invalid");
                a(continuation, false);
            }
        } else {
            a(continuation, false);
        }
        return jz5.f0.f302826a;
    }
}
