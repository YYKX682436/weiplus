package nl4;

/* loaded from: classes11.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f338222d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nl4.r f338223e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f338224f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f338225g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ bw5.lp0 f338226h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(nl4.r rVar, java.lang.String str, java.lang.String str2, bw5.lp0 lp0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f338223e = rVar;
        this.f338224f = str;
        this.f338225g = str2;
        this.f338226h = lp0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new nl4.p(this.f338223e, this.f338224f, this.f338225g, this.f338226h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((nl4.p) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f338222d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            nl4.r rVar = this.f338223e;
            long c17 = r26.q0.c(this.f338224f);
            java.lang.String str = this.f338225g;
            bw5.gq0 e17 = this.f338226h.e();
            this.f338222d = 1;
            obj = nl4.r.q(rVar, c17, str, e17, this);
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
