package ij5;

/* loaded from: classes.dex */
public final class b0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f291753d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.i2 f291754e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f291755f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ij5.d0 f291756g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ wi5.z f291757h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(kotlinx.coroutines.flow.i2 i2Var, java.util.HashMap hashMap, ij5.d0 d0Var, wi5.z zVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f291754e = i2Var;
        this.f291755f = hashMap;
        this.f291756g = d0Var;
        this.f291757h = zVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ij5.b0(this.f291754e, this.f291755f, this.f291756g, this.f291757h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((ij5.b0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f291753d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            ij5.a0 a0Var = new ij5.a0(this.f291755f, this.f291756g, this.f291757h);
            this.f291753d = 1;
            if (this.f291754e.a(a0Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        throw new jz5.d();
    }
}
