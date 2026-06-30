package cw2;

/* loaded from: classes10.dex */
public final class u3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f224038d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderLivePlayView f224039e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(com.tencent.mm.plugin.finder.video.FinderLivePlayView finderLivePlayView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f224039e = finderLivePlayView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new cw2.u3(this.f224039e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((cw2.u3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f224038d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.finder.video.FinderLivePlayView finderLivePlayView = this.f224039e;
            mn0.b0 txLivePlayer = finderLivePlayView.getTxLivePlayer();
            if (txLivePlayer != null) {
                cw2.t3 t3Var = new cw2.t3(finderLivePlayView);
                this.f224038d = 1;
                mn0.y.c((mn0.y) txLivePlayer, t3Var, this);
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
