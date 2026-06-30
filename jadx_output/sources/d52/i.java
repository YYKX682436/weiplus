package d52;

/* loaded from: classes13.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f226534d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d52.b f226535e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d52.n f226536f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(d52.b bVar, d52.n nVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f226535e = bVar;
        this.f226536f = nVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new d52.i(this.f226535e, this.f226536f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((d52.i) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f226534d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            d52.b bVar = this.f226535e;
            int i18 = bVar.f226528a;
            java.lang.Object obj2 = this.f226536f.f226546c;
            r45.hw3 b17 = d52.e.b(bVar);
            kotlin.jvm.internal.o.f(b17, "localToHellMsg(...)");
            this.f226534d = 1;
            if (((u26.o) obj2).t(b17, this) == aVar) {
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
