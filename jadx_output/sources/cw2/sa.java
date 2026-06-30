package cw2;

/* loaded from: classes10.dex */
public final class sa extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f224010d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.LiveFeedPlayerView f224011e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sa(com.tencent.mm.plugin.finder.video.LiveFeedPlayerView liveFeedPlayerView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f224011e = liveFeedPlayerView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new cw2.sa(this.f224011e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((cw2.sa) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f224010d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.finder.video.LiveFeedPlayerView liveFeedPlayerView = this.f224011e;
            mn0.b0 player = liveFeedPlayerView.getPlayer();
            if (player != null) {
                cw2.ra raVar = new cw2.ra(liveFeedPlayerView);
                this.f224010d = 1;
                mn0.y.c((mn0.y) player, raVar, this);
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
