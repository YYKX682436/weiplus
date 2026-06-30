package el2;

/* loaded from: classes3.dex */
public final class f2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f253793d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ el2.i2 f253794e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.f52 f253795f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Boolean f253796g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(el2.i2 i2Var, r45.f52 f52Var, java.lang.Boolean bool, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f253794e = i2Var;
        this.f253795f = f52Var;
        this.f253796g = bool;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new el2.f2(this.f253794e, this.f253795f, this.f253796g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((el2.f2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f253793d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            el2.i2 i2Var = this.f253794e;
            kotlinx.coroutines.flow.j2 j2Var = i2Var.f253830n;
            el2.e2 e2Var = new el2.e2(i2Var, this.f253795f, this.f253796g);
            this.f253793d = 1;
            if (((kotlinx.coroutines.flow.h3) j2Var).a(e2Var, this) == aVar) {
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
