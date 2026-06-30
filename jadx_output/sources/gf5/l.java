package gf5;

/* loaded from: classes11.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gf5.n f271406d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(gf5.n nVar) {
        super(0);
        this.f271406d = nVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        lz5.m mVar = new lz5.m();
        gf5.n nVar = this.f271406d;
        for (gf5.b0 b0Var : (java.util.List) nVar.f271420m.getValue()) {
            gf5.z zVar = b0Var.f271380a;
            java.util.Iterator it = b0Var.f271381b.iterator();
            while (it.hasNext()) {
                mVar.putIfAbsent(nVar.f((java.lang.String) it.next()), zVar);
            }
        }
        return kz5.b1.b(mVar);
    }
}
