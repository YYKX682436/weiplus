package wq2;

/* loaded from: classes2.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f448514d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f448515e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wq2.h f448516f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f448517g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f448518h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f448519i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(wq2.h hVar, int i17, int i18, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f448516f = hVar;
        this.f448517g = i17;
        this.f448518h = i18;
        this.f448519i = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        wq2.c cVar = new wq2.c(this.f448516f, this.f448517g, this.f448518h, this.f448519i, continuation);
        cVar.f448515e = obj;
        return cVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((wq2.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f448514d;
        boolean z17 = this.f448519i;
        wq2.h hVar = this.f448516f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f448515e;
            wq2.b bVar = new wq2.b(this.f448517g, this.f448518h, z17, hVar);
            oz5.l f11582e = y0Var.getF11582e();
            int i18 = kotlinx.coroutines.r2.O0;
            kotlinx.coroutines.r2 r2Var = (kotlinx.coroutines.r2) f11582e.get(kotlinx.coroutines.q2.f310571d);
            android.app.Activity activity = hVar.f448529a;
            kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            aq2.g gVar = new aq2.g(bVar, r2Var, (com.tencent.mm.ui.MMActivity) activity, hVar.f448535g);
            this.f448514d = 1;
            obj = ay1.l.j(gVar, false, this, 1, null);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        oz5.l lVar = ((kotlinx.coroutines.internal.h) hVar.f448530b).f310496d;
        wq2.a aVar2 = new wq2.a((com.tencent.mm.modelbase.f) obj, hVar, z17, null);
        this.f448514d = 2;
        if (kotlinx.coroutines.l.g(lVar, aVar2, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
