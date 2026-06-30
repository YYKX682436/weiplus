package ly;

/* loaded from: classes14.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f322174d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f322175e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f322176f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f322177g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(yz5.a aVar, yz5.a aVar2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f322176f = aVar;
        this.f322177g = aVar2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        ly.e eVar = new ly.e(this.f322176f, this.f322177g, continuation);
        eVar.f322175e = obj;
        return eVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ly.e) create((p1.a0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5, types: [p1.q0] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        ?? r86;
        ly.d dVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f322174d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            r86 = (p1.a0) this.f322175e;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p1.a0 a0Var = (p1.a0) this.f322175e;
            kotlin.ResultKt.throwOnFailure(obj);
            r86 = a0Var;
        }
        do {
            dVar = new ly.d(this.f322176f, this.f322177g, null);
            this.f322175e = r86;
            this.f322174d = 1;
            r86 = (p1.q0) r86;
        } while (r86.v(dVar, this) != aVar);
        return aVar;
    }
}
