package ir2;

/* loaded from: classes2.dex */
public final class y0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f294242d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f294243e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.j5 f294244f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f294245g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f294246h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ir2.a1 f294247i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(int i17, so2.j5 j5Var, java.lang.Object obj, boolean z17, ir2.a1 a1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f294243e = i17;
        this.f294244f = j5Var;
        this.f294245g = obj;
        this.f294246h = z17;
        this.f294247i = a1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ir2.y0(this.f294243e, this.f294244f, this.f294245g, this.f294246h, this.f294247i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ir2.y0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f294242d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            ir2.a2 a2Var = new ir2.a2(this.f294243e, -1L, this.f294244f, this.f294245g, this.f294246h);
            this.f294242d = 1;
            if (this.f294247i.T6(a2Var, this) == aVar) {
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
