package ir2;

/* loaded from: classes2.dex */
public final class j0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f294158d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f294159e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ir2.a1 f294160f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(long j17, ir2.a1 a1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f294159e = j17;
        this.f294160f = a1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ir2.j0(this.f294159e, this.f294160f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ir2.j0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f294158d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            ir2.e eVar = new ir2.e(-1, this.f294159e, 0L, 4, null);
            this.f294158d = 1;
            if (this.f294160f.T6(eVar, this) == aVar) {
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
