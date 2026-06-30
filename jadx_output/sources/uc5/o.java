package uc5;

/* loaded from: classes10.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f426535d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uc5.p f426536e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f426537f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f426538g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(uc5.p pVar, android.content.Context context, com.tencent.mm.storage.f9 f9Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f426536e = pVar;
        this.f426537f = context;
        this.f426538g = f9Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new uc5.o(this.f426536e, this.f426537f, this.f426538g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((uc5.o) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f426535d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            uc5.n d17 = this.f426536e.d();
            this.f426535d = 1;
            obj = d17.w(this.f426537f, this.f426538g, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
