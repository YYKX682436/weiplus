package r2;

/* loaded from: classes14.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f368720d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f368721e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r2.o f368722f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f368723g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(boolean z17, r2.o oVar, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f368721e = z17;
        this.f368722f = oVar;
        this.f368723g = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new r2.j(this.f368721e, this.f368722f, this.f368723g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((r2.j) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f368720d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            boolean z17 = this.f368721e;
            r2.o oVar = this.f368722f;
            if (z17) {
                o1.e eVar = oVar.f368731d;
                long j17 = this.f368723g;
                int i18 = p2.w.f351405c;
                long j18 = p2.w.f351404b;
                this.f368720d = 2;
                if (eVar.a(j17, j18, this) == aVar) {
                    return aVar;
                }
            } else {
                o1.e eVar2 = oVar.f368731d;
                int i19 = p2.w.f351405c;
                long j19 = p2.w.f351404b;
                long j27 = this.f368723g;
                this.f368720d = 1;
                if (eVar2.a(j19, j27, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1 && i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
