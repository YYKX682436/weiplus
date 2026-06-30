package ef0;

/* loaded from: classes11.dex */
public final class b2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f252172d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.l80 f252173e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(bw5.l80 l80Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f252173e = l80Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ef0.b2(this.f252173e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ef0.b2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f252172d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            ef0.a2 a2Var = new ef0.a2(this.f252173e, null);
            this.f252172d = 1;
            obj = kotlinx.coroutines.a4.c(1000L, a2Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        return java.lang.Boolean.valueOf(bool != null ? bool.booleanValue() : false);
    }
}
