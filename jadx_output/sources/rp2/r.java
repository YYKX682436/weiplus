package rp2;

/* loaded from: classes10.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f398595d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView f398596e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView nearbyLivePreviewView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f398596e = nearbyLivePreviewView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rp2.r(this.f398596e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rp2.r) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f398595d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView nearbyLivePreviewView = this.f398596e;
            mn0.b0 player = nearbyLivePreviewView.getPlayer();
            if (player != null) {
                rp2.q qVar = new rp2.q(nearbyLivePreviewView);
                this.f398595d = 1;
                mn0.y.c((mn0.y) player, qVar, this);
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
