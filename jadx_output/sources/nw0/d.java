package nw0;

/* loaded from: classes5.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f340759d;

    /* renamed from: e, reason: collision with root package name */
    public int f340760e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nw0.h f340761f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f340762g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(nw0.h hVar, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f340761f = hVar;
        this.f340762g = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new nw0.d(this.f340761f, this.f340762g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((nw0.d) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        nw0.h hVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f340760e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kw0.b bVar = kw0.b.f312792f;
            nw0.h hVar2 = this.f340761f;
            this.f340759d = hVar2;
            this.f340760e = 1;
            obj = nw0.h.a(hVar2, bVar, this.f340762g, this);
            if (obj == aVar) {
                return aVar;
            }
            hVar = hVar2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hVar = (nw0.h) this.f340759d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        zu0.k kVar = (zu0.k) obj;
        hVar.getClass();
        int i18 = kVar.f475681a;
        kw0.b bVar2 = kw0.b.f312791e;
        zu0.h hVar3 = kVar.f475682b;
        if (i18 == 3) {
            hVar.f340769c.setValue(hVar3);
        } else if (i18 == 2) {
            hVar.f340770d.setValue(hVar3);
        }
        return jz5.f0.f302826a;
    }
}
