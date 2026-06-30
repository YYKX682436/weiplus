package com.tencent.mm.plugin.ting.uic;

/* loaded from: classes11.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f174775d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ting.uic.n f174776e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f174777f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f174778g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(boolean z17, com.tencent.mm.plugin.ting.uic.n nVar, boolean z18, kotlin.coroutines.Continuation continuation) {
        super(0);
        this.f174775d = z17;
        this.f174776e = nVar;
        this.f174777f = z18;
        this.f174778g = continuation;
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
        boolean z17 = this.f174775d;
        kotlin.coroutines.Continuation continuation = this.f174778g;
        if (z17) {
            sl4.a a17 = jm4.t2.a(bw5.eq0.TingChatRoom);
            if (a17 == null) {
                a(continuation, false);
            } else if (a17 instanceof vl4.l) {
                vl4.l lVar = (vl4.l) a17;
                lVar.i(true);
                lVar.f409264s = false;
                lVar.f93132d.f93058s = false;
                boolean A0 = lVar.A0(true);
                com.tencent.mars.xlog.Log.i("MicroMsg.TingChatRoomFloatBallAnimationUIC", "exitWithAnimation added: " + A0);
                if (A0) {
                    com.tencent.mm.plugin.ting.uic.l lVar2 = new com.tencent.mm.plugin.ting.uic.l(continuation, a17);
                    com.tencent.mm.plugin.ting.uic.n nVar = this.f174776e;
                    if (!nVar.O6(lVar2)) {
                        if (this.f174777f) {
                            nVar.getActivity().finish();
                        }
                        a(continuation, false);
                    }
                } else {
                    a(continuation, false);
                }
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.TingChatRoomFloatBallAnimationUIC", "exitWithAnimation floatBallHelper invalid");
                a(continuation, false);
            }
        } else {
            a(continuation, false);
        }
        return jz5.f0.f302826a;
    }
}
