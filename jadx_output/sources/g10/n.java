package g10;

/* loaded from: classes7.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f267536d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g10.v f267537e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bw5.x7 f267538f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(g10.v vVar, bw5.x7 x7Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f267537e = vVar;
        this.f267538f = x7Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new g10.n(this.f267537e, this.f267538f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((g10.n) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f267536d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            bw5.s7 e17 = this.f267538f.e();
            this.f267536d = 1;
            if (g10.v.wi(this.f267537e, e17, this) == aVar) {
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
