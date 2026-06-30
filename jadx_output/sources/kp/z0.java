package kp;

/* loaded from: classes13.dex */
public final class z0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f310877d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kp.i1 f310878e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.net.wifi.p2p.WifiP2pGroup f310879f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(kp.i1 i1Var, android.net.wifi.p2p.WifiP2pGroup wifiP2pGroup, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f310878e = i1Var;
        this.f310879f = wifiP2pGroup;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new kp.z0(this.f310878e, this.f310879f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((kp.z0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f310877d;
        kp.i1 i1Var = this.f310878e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.String str = this.f310879f.getInterface();
            kotlin.jvm.internal.o.f(str, "getInterface(...)");
            this.f310877d = 1;
            if (i1Var.qj(str, 2000L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        yz5.l lVar = i1Var.f310770n;
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.TRUE);
        }
        return jz5.f0.f302826a;
    }
}
