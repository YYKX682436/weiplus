package fn2;

/* loaded from: classes10.dex */
public final class b1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f264225d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fn2.q1 f264226e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f264227f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(fn2.q1 q1Var, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f264226e = q1Var;
        this.f264227f = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new fn2.b1(this.f264226e, this.f264227f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((fn2.b1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        r45.zx1 zx1Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f264225d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f264225d = 1;
            obj = this.f264226e.e(this.f264227f, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        r45.gx1 gx1Var = (r45.gx1) obj;
        java.util.LinkedList linkedList = (gx1Var == null || (zx1Var = gx1Var.f375593d) == null) ? null : zx1Var.f392452d;
        return linkedList == null ? kz5.p0.f313996d : linkedList;
    }
}
