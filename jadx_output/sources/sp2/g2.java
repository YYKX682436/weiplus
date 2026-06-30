package sp2;

/* loaded from: classes2.dex */
public final class g2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f411039d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sp2.o2 f411040e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(sp2.o2 o2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f411040e = o2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new sp2.g2(this.f411040e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((sp2.g2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f411039d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            cq2.q qVar = cq2.q.f221428a;
            r45.qt2 qt2Var = this.f411040e.f411127d;
            this.f411039d = 1;
            if (qVar.f(qt2Var, this) == aVar) {
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
