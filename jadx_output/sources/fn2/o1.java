package fn2;

/* loaded from: classes10.dex */
public final class o1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f264343d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fn2.q1 f264344e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(fn2.q1 q1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f264344e = q1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new fn2.o1(this.f264344e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((fn2.o1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f264343d;
        fn2.q1 q1Var = this.f264344e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            sf2.d3 d3Var = q1Var.f264358a;
            this.f264343d = 1;
            obj = sf2.d3.l7(d3Var, 0, 0, false, this, 7, null);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        q1Var.f264359b = (r45.gx1) obj;
        return obj;
    }
}
