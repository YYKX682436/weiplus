package cu0;

/* loaded from: classes.dex */
public final class v extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f222343d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cu0.x f222344e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(cu0.x xVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f222344e = xVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new cu0.v(this.f222344e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((cu0.v) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f222343d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            cu0.x xVar = this.f222344e;
            this.f222343d = 1;
            xVar.getClass();
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            ev0.t tVar = xVar.f222353c;
            cu0.l lVar = new cu0.l(rVar);
            tVar.getClass();
            kotlinx.coroutines.l.d(tVar.f256878a, null, null, new ev0.q(tVar, lVar, null), 3, null);
            rVar.m(new cu0.m(rVar));
            obj = rVar.j();
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
