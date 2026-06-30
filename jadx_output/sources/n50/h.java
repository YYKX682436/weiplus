package n50;

/* loaded from: classes9.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n50.i f335102d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(n50.i iVar) {
        super(0);
        this.f335102d = iVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        n50.i iVar = this.f335102d;
        long b17 = iVar.b();
        jz5.g gVar = iVar.f335106d;
        if (b17 <= 0 && ((java.lang.Number) ((jz5.n) gVar).getValue()).longValue() == 0) {
            return null;
        }
        pt0.e0 e0Var = pt0.f0.f358209b1;
        jz5.g gVar2 = iVar.f335107e;
        com.tencent.mm.storage.f9 k17 = e0Var.k((java.lang.String) ((jz5.n) gVar2).getValue(), iVar.b());
        return k17 == null ? e0Var.l((java.lang.String) ((jz5.n) gVar2).getValue(), ((java.lang.Number) ((jz5.n) gVar).getValue()).longValue()) : k17;
    }
}
