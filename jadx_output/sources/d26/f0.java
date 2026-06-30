package d26;

/* loaded from: classes16.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d26.i0 f225992d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(d26.i0 i0Var) {
        super(1);
        this.f225992d = i0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        n16.g it = (n16.g) obj;
        kotlin.jvm.internal.o.g(it, "it");
        d26.i0 i0Var = this.f225992d;
        java.util.Map map = i0Var.f226004b;
        p16.j0 PARSER = i16.u0.B;
        kotlin.jvm.internal.o.f(PARSER, "PARSER");
        byte[] bArr = (byte[]) ((java.util.LinkedHashMap) map).get(it);
        d26.l0 l0Var = i0Var.f226011i;
        java.util.Collection<i16.u0> y17 = bArr != null ? q26.h0.y(q26.y.e(new d26.c0(PARSER, new java.io.ByteArrayInputStream(bArr), l0Var))) : kz5.p0.f313996d;
        java.util.ArrayList arrayList = new java.util.ArrayList(y17.size());
        for (i16.u0 u0Var : y17) {
            b26.s0 s0Var = l0Var.f226021b.f17523i;
            kotlin.jvm.internal.o.d(u0Var);
            arrayList.add(s0Var.f(u0Var));
        }
        l0Var.k(it, arrayList);
        return o26.a.b(arrayList);
    }
}
