package df2;

/* loaded from: classes10.dex */
public final class mn extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f230789d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.un f230790e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f230791f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mn(df2.un unVar, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f230790e = unVar;
        this.f230791f = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.mn(this.f230790e, this.f230791f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.mn) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f230789d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            rf2.v0 v0Var = this.f230790e.f231542p;
            if (v0Var != null) {
                this.f230789d = 1;
                if (v0Var.i(this.f230791f, false, true, this) == aVar) {
                    return aVar;
                }
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
