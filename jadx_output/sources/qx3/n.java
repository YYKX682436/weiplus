package qx3;

/* loaded from: classes10.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f367372d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qx3.o f367373e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(qx3.o oVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f367373e = oVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qx3.n(this.f367373e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((qx3.n) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f367372d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            qx3.o oVar = this.f367373e;
            kotlinx.coroutines.flow.f3 f3Var = oVar.f367378h;
            qx3.m mVar = new qx3.m(oVar, null);
            this.f367372d = 1;
            if (kotlinx.coroutines.flow.l.f(f3Var, mVar, this) == aVar) {
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
