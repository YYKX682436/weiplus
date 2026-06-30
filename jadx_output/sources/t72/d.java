package t72;

/* loaded from: classes3.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f416045d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t72.l f416046e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f416047f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f416048g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(t72.l lVar, java.util.List list, yz5.l lVar2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f416046e = lVar;
        this.f416047f = list;
        this.f416048g = lVar2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new t72.d(this.f416046e, this.f416047f, this.f416048g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((t72.d) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f416045d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f416045d = 1;
            obj = this.f416046e.T6(this.f416047f, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.f416048g.invoke(java.lang.Boolean.valueOf(((java.lang.Boolean) obj).booleanValue()));
        return jz5.f0.f302826a;
    }
}
