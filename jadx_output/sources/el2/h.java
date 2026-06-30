package el2;

/* loaded from: classes3.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ el2.i0 f253803d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(el2.i0 i0Var) {
        super(1);
        this.f253803d = i0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.h32 info = (r45.h32) obj;
        kotlin.jvm.internal.o.g(info, "info");
        el2.i0 i0Var = this.f253803d;
        wt2.a aVar = i0Var.I;
        if (aVar == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        r45.a52 a52Var = new r45.a52();
        a52Var.set(0, 1);
        a52Var.set(1, 1);
        a52Var.set(2, new com.tencent.mm.protobuf.g(info.toByteArray()));
        wt2.a.m4(aVar, a52Var, null, 2, null);
        wt2.a aVar2 = i0Var.I;
        if (aVar2 == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        gk2.e q57 = aVar2.q5();
        if (q57 != null) {
            bf2.c.b(bf2.c.f19598a, q57, 3, 1, null, 0, 24, null);
        }
        return jz5.f0.f302826a;
    }
}
