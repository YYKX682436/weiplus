package nu0;

/* loaded from: classes5.dex */
public final class b0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f339868d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nu0.q0 f339869e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(nu0.q0 q0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f339869e = q0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new nu0.b0(this.f339869e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((nu0.b0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.maas.imagestudio.MJImageSession mJImageSession;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f339868d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            nu0.q0 q0Var = this.f339869e;
            this.f339868d = 1;
            if (q0Var.O6(this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.maas.imagestudio.MJImageSession mJImageSession2 = this.f339869e.f340075r;
        if (mJImageSession2 != null) {
            mJImageSession2.j();
        }
        nu0.q0 q0Var2 = this.f339869e;
        az0.i5 i5Var = az0.i5.f15557a;
        if (i5Var.t()) {
            mJImageSession = i5Var.q().k(new android.os.Handler(android.os.Looper.getMainLooper()));
            kotlin.jvm.internal.o.f(mJImageSession, "newImageSession(...)");
        } else {
            mJImageSession = null;
        }
        q0Var2.f340075r = mJImageSession;
        return jz5.f0.f302826a;
    }
}
