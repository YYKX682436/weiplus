package df2;

/* loaded from: classes.dex */
public final class vq extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f231623d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.ar f231624e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vq(df2.ar arVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f231624e = arVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.vq(this.f231624e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((df2.vq) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f231623d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            df2.ar arVar = this.f231624e;
            kotlinx.coroutines.flow.j2 j2Var = arVar.f229743s;
            df2.uq uqVar = new df2.uq(arVar);
            this.f231623d = 1;
            if (((kotlinx.coroutines.flow.h3) j2Var).a(uqVar, this) == aVar) {
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
