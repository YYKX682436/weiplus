package si0;

/* loaded from: classes.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f408057d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ si0.o0 f408058e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f408059f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(si0.o0 o0Var, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f408058e = o0Var;
        this.f408059f = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new si0.e(this.f408058e, this.f408059f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((si0.e) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f408057d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            si0.d dVar = new si0.d(this.f408059f);
            this.f408057d = 1;
            if (this.f408058e.b(dVar, this) == aVar) {
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
