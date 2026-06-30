package so5;

/* loaded from: classes14.dex */
public final class h0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f410843d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f410844e;

    /* renamed from: f, reason: collision with root package name */
    public int f410845f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ so5.k0 f410846g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(so5.k0 k0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f410846g = k0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new so5.h0(this.f410846g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((so5.h0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        so5.k0 k0Var;
        java.lang.Object obj2;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f410845f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            so5.k0 k0Var2 = this.f410846g;
            kotlinx.coroutines.sync.d dVar = k0Var2.f410870t;
            this.f410843d = dVar;
            this.f410844e = k0Var2;
            this.f410845f = 1;
            kotlinx.coroutines.sync.k kVar = (kotlinx.coroutines.sync.k) dVar;
            if (kVar.b(null, this) == aVar) {
                return aVar;
            }
            k0Var = k0Var2;
            obj2 = kVar;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            k0Var = (so5.k0) this.f410844e;
            java.lang.Object obj3 = (kotlinx.coroutines.sync.d) this.f410843d;
            kotlin.ResultKt.throwOnFailure(obj);
            obj2 = obj3;
        }
        try {
            zq4.b bVar = k0Var.f410859f;
            if (bVar != null) {
                bVar.e();
            }
            ((kotlinx.coroutines.sync.k) obj2).d(null);
            return jz5.f0.f302826a;
        } catch (java.lang.Throwable th6) {
            ((kotlinx.coroutines.sync.k) obj2).d(null);
            throw th6;
        }
    }
}
