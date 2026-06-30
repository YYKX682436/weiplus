package df2;

/* loaded from: classes3.dex */
public final class nu extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f230885d;

    public nu(kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.nu(continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new df2.nu((kotlin.coroutines.Continuation) obj2).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f230885d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            ko0.l lVar = ko0.l.f309870a;
            ko0.d dVar = ko0.d.f309835e;
            this.f230885d = 1;
            obj = lVar.a(dVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
            ko0.l lVar2 = ko0.l.f309870a;
            lVar2.d();
            dk2.d.f233301a.e(lVar2.b());
        }
        return jz5.f0.f302826a;
    }
}
