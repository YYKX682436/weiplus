package uf;

/* loaded from: classes7.dex */
public final class i1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uf.o1 f427035d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(uf.o1 o1Var) {
        super(1);
        this.f427035d = o1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        uf.h2 resp = (uf.h2) obj;
        kotlin.jvm.internal.o.g(resp, "resp");
        boolean z17 = resp.f427030a;
        uf.o1 o1Var = this.f427035d;
        if (!z17 && uf.b.f426974g == o1Var.r()) {
            o1Var.s(uf.b.f426973f);
        }
        o1Var.q().c(-1, null);
        return jz5.f0.f302826a;
    }
}
