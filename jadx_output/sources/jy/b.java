package jy;

/* loaded from: classes10.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f302451d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jy.d f302452e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(jy.d dVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f302452e = dVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new jy.b(this.f302452e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((jy.b) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f302451d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            jy.d dVar = this.f302452e;
            kotlinx.coroutines.flow.j g17 = kotlinx.coroutines.flow.l.g(dVar.f302456d);
            jy.a aVar2 = new jy.a(dVar);
            this.f302451d = 1;
            if (((kotlinx.coroutines.flow.e) g17).a(aVar2, this) == aVar) {
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
