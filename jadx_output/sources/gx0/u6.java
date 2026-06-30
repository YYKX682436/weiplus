package gx0;

/* loaded from: classes5.dex */
public final class u6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f277025d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f277026e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u6(gx0.w8 w8Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f277026e = w8Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.u6(this.f277026e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.u6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f277025d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            gx0.w8 w8Var = this.f277026e;
            w8Var.s7().setDoneBtnEnabled(true);
            gx0.bf V6 = w8Var.V6();
            this.f277025d = 1;
            obj = gx0.bf.d7(V6, null, null, false, this, 7, null);
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
