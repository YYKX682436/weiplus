package gy4;

/* loaded from: classes5.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f277620d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c01.ob f277621e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(c01.ob obVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f277621e = obVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gy4.r(this.f277621e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gy4.r) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.z zVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f277620d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            c01.nb nbVar = this.f277621e.f37374b;
            if (nbVar == null || (zVar = nbVar.f37353c) == null) {
                return null;
            }
            this.f277620d = 1;
            obj = ((kotlinx.coroutines.a0) zVar).k(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return (java.lang.String) obj;
    }
}
