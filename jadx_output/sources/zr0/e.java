package zr0;

/* loaded from: classes14.dex */
public final class e extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f475120d;

    /* renamed from: e, reason: collision with root package name */
    public int f475121e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zr0.p f475122f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ is0.c f475123g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(zr0.p pVar, is0.c cVar, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f475122f = pVar;
        this.f475123g = cVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new zr0.e(this.f475122f, this.f475123g, continuation);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return ((zr0.e) create((kotlin.coroutines.Continuation) obj)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        zr0.p pVar;
        zr0.p pVar2;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f475121e;
        is0.c cVar = this.f475123g;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            pVar = this.f475122f;
            nr0.c cVar2 = pVar.f475170m;
            if (cVar2 != null) {
                this.f475120d = pVar;
                this.f475121e = 1;
                java.lang.Object d17 = cVar2.d(cVar, this);
                if (d17 == aVar) {
                    return aVar;
                }
                pVar2 = pVar;
                obj = d17;
            }
            pVar2 = pVar;
            pVar2.f475171n = cVar;
            return jz5.f0.f302826a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        pVar2 = (zr0.p) this.f475120d;
        kotlin.ResultKt.throwOnFailure(obj);
        is0.c cVar3 = (is0.c) obj;
        if (cVar3 != null) {
            cVar = cVar3;
            pVar2.f475171n = cVar;
            return jz5.f0.f302826a;
        }
        pVar = pVar2;
        pVar2 = pVar;
        pVar2.f475171n = cVar;
        return jz5.f0.f302826a;
    }
}
