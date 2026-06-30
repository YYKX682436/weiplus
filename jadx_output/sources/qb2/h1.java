package qb2;

/* loaded from: classes4.dex */
public final class h1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f361220d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u26.w f361221e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(u26.w wVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f361221e = wVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qb2.h1(this.f361221e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((qb2.h1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f361220d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f361220d = 1;
            if (this.f361221e.t(null, this) == aVar) {
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
