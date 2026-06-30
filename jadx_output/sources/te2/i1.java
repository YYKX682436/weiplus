package te2;

/* loaded from: classes3.dex */
public final class i1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f418098d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te2.p1 f418099e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f418100f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(te2.p1 p1Var, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f418099e = p1Var;
        this.f418100f = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new te2.i1(this.f418099e, this.f418100f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((te2.i1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f418098d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            te2.p1 p1Var = this.f418099e;
            r45.d22 d22Var = p1Var.f418292m;
            java.lang.Integer num = d22Var != null ? new java.lang.Integer(d22Var.getInteger(0)) : null;
            r45.d22 d22Var2 = this.f418099e.f418292m;
            r45.rm1 g17 = d22Var2 != null ? dk2.q.g(d22Var2) : null;
            int i18 = this.f418100f;
            this.f418098d = 1;
            if (p1Var.z(4, num, g17, i18, this) == aVar) {
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
