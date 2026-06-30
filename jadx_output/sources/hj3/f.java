package hj3;

/* loaded from: classes14.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f281614d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f281615e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hj3.m f281616f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nj3.f f281617g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(hj3.m mVar, nj3.f fVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f281616f = mVar;
        this.f281617g = fVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        hj3.f fVar = new hj3.f(this.f281616f, this.f281617g, continuation);
        fVar.f281615e = obj;
        return fVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((hj3.f) create((jj3.c) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object c17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f281614d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            jj3.d a17 = ((jj3.c) this.f281615e).a();
            is0.c cVar = null;
            if (a17 == null) {
                return null;
            }
            kj3.d dVar = this.f281616f.f281649g;
            android.util.Size drawSize = a17.getSize();
            nj3.f fVar = this.f281617g;
            kotlin.jvm.internal.o.g(fVar, "<this>");
            kotlin.jvm.internal.o.g(drawSize, "drawSize");
            mj3.g gVar = fVar.f337907e;
            if (gVar == null) {
                gVar = new mj3.g(0, 0, 0, false, false, 24, null);
            }
            if (fVar.f337905c) {
                nj3.d dVar2 = fVar.f337904b;
                if (dVar2.f337895b) {
                    cVar = dVar2.f337894a;
                }
            }
            kj3.e eVar = new kj3.e(gVar, drawSize, cVar != null ? cVar.f294395e : 0, false);
            this.f281614d = 1;
            c17 = dVar.c(eVar, this);
            if (c17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            c17 = obj;
        }
        return (kj3.f) c17;
    }
}
