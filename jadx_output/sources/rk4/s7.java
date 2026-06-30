package rk4;

/* loaded from: classes11.dex */
public final class s7 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bw5.ar0 f396970d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f396971e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7(bw5.ar0 ar0Var, java.util.Map map) {
        super(1);
        this.f396970d = ar0Var;
        this.f396971e = map;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        bw5.k20 result = (bw5.k20) obj;
        kotlin.jvm.internal.o.g(result, "result");
        java.lang.String b17 = result.b();
        km4.s a17 = km4.s.f309318f.a(this.f396970d);
        kotlin.jvm.internal.o.d(b17);
        bw5.j20 j20Var = a17.f443458d;
        j20Var.f28771d = b17;
        j20Var.f28775h[1] = true;
        a17.e("only_refresh");
        a17.d(bw5.f20.HybridRouterBizTypeTing);
        a17.a(this.f396971e);
        w71.o0 a18 = w71.q0.f443436d.a();
        if (a18 != null) {
            ((w71.q0) a18).a(a17, rk4.r7.f396956d);
        }
        return jz5.f0.f302826a;
    }
}
