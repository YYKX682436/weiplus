package kp;

/* loaded from: classes13.dex */
public final class y0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f310866d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f310867e;

    /* renamed from: f, reason: collision with root package name */
    public int f310868f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kp.i1 f310869g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.net.wifi.p2p.WifiP2pManager.Channel f310870h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(kp.i1 i1Var, android.net.wifi.p2p.WifiP2pManager.Channel channel, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f310869g = i1Var;
        this.f310870h = channel;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new kp.y0(this.f310869g, this.f310870h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((kp.y0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f310868f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kp.i1 i1Var = this.f310869g;
            this.f310866d = i1Var;
            android.net.wifi.p2p.WifiP2pManager.Channel channel = this.f310870h;
            this.f310867e = channel;
            this.f310868f = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            i1Var.f310764e.removeGroup(channel, new kp.x0(i1Var, rVar));
            obj = rVar.j();
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
