package iu0;

/* loaded from: classes5.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eu0.n f294817d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f294818e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(eu0.n nVar, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f294817d = nVar;
        this.f294818e = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new iu0.g(this.f294817d, this.f294818e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((iu0.g) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        eu0.n nVar = this.f294817d;
        if (!(nVar.f256723d.length() > 0)) {
            return null;
        }
        return iu0.k.a(iu0.k.f294830a, nVar.f256723d, this.f294818e + "/cover_" + nVar.f256720a);
    }
}
