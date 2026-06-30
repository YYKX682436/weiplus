package d82;

/* loaded from: classes11.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f226934d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d82.g f226935e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(d82.g gVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f226935e = gVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new d82.h(this.f226935e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((d82.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f226934d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            d82.j jVar = d82.j.f226946a;
            this.f226934d = 1;
            if (d82.j.a(jVar, this.f226935e, this) == aVar) {
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
