package q0;

/* loaded from: classes16.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.l {
    public final /* synthetic */ wi5.n0 C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(wi5.n0 n0Var) {
        super(1);
        this.C = n0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.ArrayList<ri5.j> it = (java.util.ArrayList) obj;
        kotlin.jvm.internal.o.g(it, "it");
        for (ri5.j jVar : it) {
            jVar.f396115l1 = !jVar.f396125v && this.C.e(jVar.f396111f);
        }
        return jz5.f0.f302826a;
    }
}
