package n06;

/* loaded from: classes15.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n06.o f333992d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n06.o oVar) {
        super(0);
        this.f333992d = oVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        n06.o oVar = this.f333992d;
        yz5.a aVar = oVar.f333998f;
        if (aVar == null) {
            throw new java.lang.AssertionError("JvmBuiltins instance has not been initialized properly");
        }
        n06.k kVar = (n06.k) aVar.invoke();
        oVar.f333998f = null;
        return kVar;
    }
}
