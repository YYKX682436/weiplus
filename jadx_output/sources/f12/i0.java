package f12;

/* loaded from: classes4.dex */
public final class i0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f258614d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f12.j0 f258615e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(f12.j0 j0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f258615e = j0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new f12.i0(this.f258615e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((f12.i0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f258614d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            c12.d dVar = new c12.d(this.f258615e.f258618e, "", 0, "");
            this.f258614d = 1;
            obj = b12.d.a(dVar, this);
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
