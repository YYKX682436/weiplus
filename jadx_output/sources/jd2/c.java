package jd2;

/* loaded from: classes10.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f299142d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jd2.d f299143e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(jd2.d dVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f299143e = dVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new jd2.c(this.f299143e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((jd2.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f299142d;
        jd2.d dVar = this.f299143e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310570c;
            jd2.b bVar = new jd2.b(dVar, null);
            this.f299142d = 1;
            if (kotlinx.coroutines.l.g(p0Var, bVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        dVar.f299144a.setVisibility(0);
        dVar.f299144a.g();
        return jz5.f0.f302826a;
    }
}
