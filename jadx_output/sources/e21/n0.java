package e21;

/* loaded from: classes5.dex */
public final class n0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f246554d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xg3.q0 f246555e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xg3.n0 f246556f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f246557g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(xg3.q0 q0Var, xg3.n0 n0Var, java.lang.ref.WeakReference weakReference, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f246555e = q0Var;
        this.f246556f = n0Var;
        this.f246557g = weakReference;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new e21.n0(this.f246555e, this.f246556f, this.f246557g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((e21.n0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        e21.f0 f0Var;
        xg3.n0 n0Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f246554d;
        xg3.q0 q0Var = this.f246555e;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                e21.z0 z0Var = e21.z0.f246605d;
                this.f246554d = 1;
                obj = e21.z0.a(z0Var, q0Var, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            f0Var = (e21.f0) obj;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.OplogServiceKt", th6, "dealWith cgi error", new java.lang.Object[0]);
            f0Var = new e21.f0(q0Var, -1, "", "");
        }
        e21.z0 z0Var2 = e21.z0.f246605d;
        xg3.n0 n0Var2 = this.f246556f;
        if (n0Var2 != null) {
            z0Var2.o(n0Var2, f0Var.f246517b, f0Var.f246518c, f0Var.f246519d);
        }
        java.lang.ref.WeakReference weakReference = this.f246557g;
        if (weakReference != null && (n0Var = (xg3.n0) weakReference.get()) != null) {
            z0Var2.o(n0Var, f0Var.f246517b, f0Var.f246518c, f0Var.f246519d);
        }
        ((kotlinx.coroutines.flow.q2) e21.z0.f246612n).e(f0Var);
        return jz5.f0.f302826a;
    }
}
