package dn2;

/* loaded from: classes3.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f241923d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f241924e;

    /* renamed from: f, reason: collision with root package name */
    public int f241925f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dn2.m f241926g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ cn2.p0 f241927h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f241928i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(dn2.m mVar, cn2.p0 p0Var, android.view.View view, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f241926g = mVar;
        this.f241927h = p0Var;
        this.f241928i = view;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new dn2.j(this.f241926g, this.f241927h, this.f241928i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((dn2.j) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        cn2.p0 p0Var;
        dn2.m mVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f241925f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            dn2.m mVar2 = this.f241926g;
            cn2.k kVar = mVar2.f241941d;
            yz5.l lVar = mVar2.f241940c;
            android.view.View view = this.f241928i;
            if (kVar != null && lVar != null) {
                p0Var = this.f241927h;
                cn2.c0 b17 = p0Var.b();
                this.f241923d = p0Var;
                this.f241924e = mVar2;
                this.f241925f = 1;
                if (b17.h(1000L, view, kVar, lVar, this) == aVar) {
                    return aVar;
                }
                mVar = mVar2;
            }
            return jz5.f0.f302826a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        mVar = (dn2.m) this.f241924e;
        p0Var = (cn2.p0) this.f241923d;
        kotlin.ResultKt.throwOnFailure(obj);
        if (!p0Var.f43599j) {
            mVar.f241940c = null;
            mVar.f241941d = null;
        }
        return jz5.f0.f302826a;
    }
}
