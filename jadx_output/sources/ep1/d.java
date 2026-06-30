package ep1;

/* loaded from: classes14.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f255608d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ep1.k f255609e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f255610f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fp1.b f255611g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ep1.k kVar, android.view.View view, fp1.b bVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f255609e = kVar;
        this.f255610f = view;
        this.f255611g = bVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ep1.d(this.f255609e, this.f255610f, this.f255611g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ep1.d) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f255608d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f255608d = 1;
            ep1.k.a(this.f255609e, this.f255610f, this.f255611g, this);
            if (f0Var == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return f0Var;
    }
}
