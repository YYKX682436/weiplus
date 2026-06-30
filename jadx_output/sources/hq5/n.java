package hq5;

/* loaded from: classes5.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f283250d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hq5.r f283251e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(hq5.r rVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f283251e = rVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new hq5.n(this.f283251e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((hq5.n) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f283250d;
        hq5.r rVar = this.f283251e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            jq5.l lVar = jq5.n.f301282a;
            android.app.Activity context = rVar.getContext();
            this.f283250d = 1;
            obj = lVar.g(context, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
            rVar.T6();
        }
        return jz5.f0.f302826a;
    }
}
