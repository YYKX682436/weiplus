package qf2;

/* loaded from: classes10.dex */
public final class d1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f362327d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qf2.y1 f362328e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f362329f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(xg2.h hVar, kotlin.coroutines.Continuation continuation, qf2.y1 y1Var, yz5.l lVar) {
        super(2, continuation);
        this.f362327d = hVar;
        this.f362328e = y1Var;
        this.f362329f = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qf2.d1(this.f362327d, continuation, this.f362328e, this.f362329f);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        qf2.d1 d1Var = (qf2.d1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        d1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i("FinderLiveMicAnchorBattlePkController", "anchorNewCloseBattle success ");
        qf2.y1 y1Var = this.f362328e;
        com.tencent.mm.plugin.finder.live.plugin.na naVar = (com.tencent.mm.plugin.finder.live.plugin.na) y1Var.R6(com.tencent.mm.plugin.finder.live.plugin.na.class);
        if (naVar != null) {
            naVar.K0(0);
            qi2.s1 w17 = naVar.w1();
            if (w17 != null) {
                ((lj2.c0) w17).g(0);
            }
            qi2.s1 w18 = naVar.w1();
            if (w18 != null) {
                ((lj2.c0) w18).e(new com.tencent.mm.plugin.finder.live.plugin.ja(naVar));
            }
            naVar.f113604q.k(8);
        }
        com.tencent.mm.plugin.finder.live.plugin.x7 x7Var = (com.tencent.mm.plugin.finder.live.plugin.x7) y1Var.R6(com.tencent.mm.plugin.finder.live.plugin.x7.class);
        if (x7Var != null) {
            x7Var.I1(0);
        }
        ((mm2.o4) y1Var.business(mm2.o4.class)).Z = null;
        db5.t7.h(y1Var.O6(), y1Var.O6().getResources().getString(com.tencent.mm.R.string.d6q));
        yz5.l lVar = this.f362329f;
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.TRUE);
        }
        return jz5.f0.f302826a;
    }
}
