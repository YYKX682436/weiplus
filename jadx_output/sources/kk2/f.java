package kk2;

/* loaded from: classes3.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk2.p f308488d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(kk2.p pVar) {
        super(0);
        this.f308488d = pVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        kk2.p pVar = this.f308488d;
        fg2.s1 s1Var = pVar.f308510o;
        if (s1Var == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        s1Var.f262304j.setVisibility(0);
        fg2.s1 s1Var2 = pVar.f308510o;
        if (s1Var2 != null) {
            s1Var2.f262296b.setVisibility(4);
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("uiBinding");
        throw null;
    }
}
