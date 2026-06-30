package te2;

/* loaded from: classes3.dex */
public final class e6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f417976d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te2.p8 f417977e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f417978f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f417979g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e6(te2.p8 p8Var, r45.h32 h32Var, java.lang.Integer num, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f417977e = p8Var;
        this.f417978f = h32Var;
        this.f417979g = num;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new te2.e6(this.f417977e, this.f417978f, this.f417979g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((te2.e6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f417976d;
        te2.p8 p8Var = this.f417977e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            r45.h32 h32Var = p8Var.A1.f418391b;
            if (h32Var != null) {
                h32Var.set(18, java.lang.Integer.valueOf(this.f417978f.getInteger(18)));
            }
            this.f417976d = 1;
            obj = te2.p8.T6(p8Var, 0, this, 1, null);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
            p8Var.C1 = true;
        } else {
            r45.h32 h32Var2 = p8Var.A1.f418391b;
            if (h32Var2 != null) {
                java.lang.Integer num = this.f417979g;
                h32Var2.set(18, java.lang.Integer.valueOf(num != null ? num.intValue() : 0));
            }
        }
        te2.p8.x7(p8Var, false, null, 2, null);
        return jz5.f0.f302826a;
    }
}
