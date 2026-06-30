package jy;

/* loaded from: classes10.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f302453d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jy.d f302454e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jy.r f302455f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(jy.d dVar, jy.r rVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f302454e = dVar;
        this.f302455f = rVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new jy.c(this.f302454e, this.f302455f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((jy.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f302453d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.Object obj2 = this.f302454e.f302456d;
            this.f302453d = 1;
            if (((u26.o) obj2).t(this.f302455f, this) == aVar) {
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
