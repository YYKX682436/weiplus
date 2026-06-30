package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class g1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f117107d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.l1 f117108e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(com.tencent.mm.plugin.finder.live.viewmodel.l1 l1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f117108e = l1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.viewmodel.g1(this.f117108e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.viewmodel.g1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f117107d;
        com.tencent.mm.plugin.finder.live.viewmodel.l1 l1Var = this.f117108e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            yl2.g1 g1Var = l1Var.f117208e;
            this.f117107d = 1;
            obj = yl2.g1.t(g1Var, null, false, this, 3, null);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        yl2.a0 a0Var = (yl2.a0) obj;
        if (a0Var instanceof yl2.x) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveVerifyUIC", "handleConfirmPostLive failed, errCode:" + ((yl2.x) a0Var).f463081a);
            com.tencent.mm.plugin.finder.live.viewmodel.b1 b1Var = l1Var.f117209f;
            if (b1Var != null) {
                com.tencent.mm.plugin.finder.live.viewmodel.b1.B5(b1Var, false, null, null, false, 0, 0L, 62, null);
            }
        } else if (a0Var instanceof yl2.z) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveVerifyUIC", "handleConfirmPostLive continueLive");
            com.tencent.mm.plugin.finder.live.viewmodel.b1 b1Var2 = l1Var.f117209f;
            if (b1Var2 != null) {
                r45.j01 j01Var = ((yl2.z) a0Var).f463087a.f463036c;
                yl2.g1 g1Var2 = l1Var.f117208e;
                ((com.tencent.mm.plugin.finder.feed.ui.FinderGameLivePostVerifyUI) b1Var2).e7(true, j01Var, null, true, g1Var2.f463009b, g1Var2.f463010c);
            }
        } else if (a0Var instanceof yl2.y) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveVerifyUIC", "handleConfirmPostLive success");
            com.tencent.mm.plugin.finder.live.viewmodel.b1 b1Var3 = l1Var.f117209f;
            if (b1Var3 != null) {
                r45.j01 j01Var2 = ((yl2.y) a0Var).f463083a;
                yl2.g1 g1Var3 = l1Var.f117208e;
                ((com.tencent.mm.plugin.finder.feed.ui.FinderGameLivePostVerifyUI) b1Var3).e7(true, j01Var2, null, false, g1Var3.f463009b, g1Var3.f463010c);
            }
        }
        return jz5.f0.f302826a;
    }
}
