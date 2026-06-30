package dn2;

/* loaded from: classes3.dex */
public final class b0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f241888d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f241889e;

    /* renamed from: f, reason: collision with root package name */
    public int f241890f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dn2.d0 f241891g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ cn2.p0 f241892h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f241893i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(dn2.d0 d0Var, cn2.p0 p0Var, android.view.View view, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f241891g = d0Var;
        this.f241892h = p0Var;
        this.f241893i = view;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new dn2.b0(this.f241891g, this.f241892h, this.f241893i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((dn2.b0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        cn2.p0 p0Var;
        dn2.d0 d0Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f241890f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            dn2.d0 d0Var2 = this.f241891g;
            cn2.k kVar = d0Var2.f241904d;
            yz5.l lVar = d0Var2.f241903c;
            android.view.View view = this.f241893i;
            if (kVar != null && lVar != null) {
                p0Var = this.f241892h;
                cn2.c0 b17 = p0Var.b();
                this.f241888d = p0Var;
                this.f241889e = d0Var2;
                this.f241890f = 1;
                if (b17.h(1000L, view, kVar, lVar, this) == aVar) {
                    return aVar;
                }
                d0Var = d0Var2;
            }
            return jz5.f0.f302826a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        d0Var = (dn2.d0) this.f241889e;
        p0Var = (cn2.p0) this.f241888d;
        kotlin.ResultKt.throwOnFailure(obj);
        if (!p0Var.f43599j) {
            d0Var.f241903c = null;
            d0Var.f241904d = null;
        }
        return jz5.f0.f302826a;
    }
}
