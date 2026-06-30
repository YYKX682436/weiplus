package df2;

/* loaded from: classes3.dex */
public final class bc extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f229794d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.jc f229795e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bc(df2.jc jcVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f229795e = jcVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.bc(this.f229795e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.bc) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f229794d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f229794d = 1;
            if (df2.jc.a7(this.f229795e, this) == aVar) {
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
