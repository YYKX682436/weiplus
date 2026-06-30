package ly0;

/* loaded from: classes5.dex */
public final class k extends oz5.a implements kotlinx.coroutines.r0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ly0.n f322211d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(kotlinx.coroutines.q0 q0Var, ly0.n nVar) {
        super(q0Var);
        this.f322211d = nVar;
    }

    @Override // kotlinx.coroutines.r0
    public void handleException(oz5.l lVar, java.lang.Throwable th6) {
        java.util.Objects.toString(th6);
        ky0.b bVar = ky0.b.f313452a;
        ly0.n nVar = this.f322211d;
        bVar.b(nVar.f322224i);
        nVar.f(th6);
    }
}
