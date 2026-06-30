package yx0;

/* loaded from: classes5.dex */
public final class d6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f467251d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pp0.p0 f467252e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6(pp0.p0 p0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f467252e = p0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yx0.d6(this.f467252e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.d6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f467251d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f467251d = 1;
            obj = this.f467252e.F(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (!((java.lang.Boolean) obj).booleanValue()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingCorePlugin", "switchBeauty >> Failed to clear beauty");
        }
        return jz5.f0.f302826a;
    }
}
