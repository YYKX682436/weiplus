package uf;

/* loaded from: classes7.dex */
public final class u0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uf.c1 f427109d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(uf.c1 c1Var) {
        super(1);
        this.f427109d = c1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        gg1.i it = (gg1.i) obj;
        kotlin.jvm.internal.o.g(it, "it");
        x91.c cVar = it.f271568a.f452647a;
        java.lang.String str = cVar != null ? cVar.f452641i : null;
        x91.c cVar2 = this.f427109d.c().f452647a;
        if (kotlin.jvm.internal.o.b(str, cVar2 != null ? cVar2.f452641i : null)) {
            it.f271571d = false;
            it.f271570c = true;
            it.f271569b = true;
        }
        return jz5.f0.f302826a;
    }
}
