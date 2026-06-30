package lm;

/* loaded from: classes9.dex */
public final class l implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f319314d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f319315e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f319316f;

    public l(java.lang.ref.WeakReference weakReference, kotlinx.coroutines.y0 y0Var, kotlinx.coroutines.q qVar) {
        this.f319314d = weakReference;
        this.f319315e = y0Var;
        this.f319316f = qVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        w65.o oVar;
        w65.p pVar = (w65.p) obj;
        java.util.Objects.toString(pVar);
        java.lang.ref.WeakReference weakReference = this.f319314d;
        if (weakReference != null && (oVar = (w65.o) weakReference.get()) != null) {
            oVar.P2(pVar);
        }
        if (lm.k.f319313a[pVar.f443362a.ordinal()] == 1) {
            kotlinx.coroutines.z0.e(this.f319315e, null, 1, null);
            ((kotlinx.coroutines.r) this.f319316f).resumeWith(kotlin.Result.m521constructorimpl(pVar));
        }
        return jz5.f0.f302826a;
    }
}
