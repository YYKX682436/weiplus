package te2;

/* loaded from: classes3.dex */
public final class u0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f418459d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te2.p1 f418460e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dk2.vg f418461f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(te2.p1 p1Var, dk2.vg vgVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f418460e = p1Var;
        this.f418461f = vgVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new te2.u0(this.f418460e, this.f418461f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((te2.u0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f418459d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            te2.p1 p1Var = this.f418460e;
            dk2.vg vgVar = this.f418461f;
            java.lang.Integer num = new java.lang.Integer(vgVar.f234254a.getInteger(0));
            r45.rm1 g17 = dk2.q.g(vgVar.f234254a);
            this.f418459d = 1;
            if (te2.p1.A(p1Var, 3, num, g17, 0, this, 8, null) == aVar) {
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
