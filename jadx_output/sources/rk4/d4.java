package rk4;

/* loaded from: classes14.dex */
public final class d4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f396609d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(yz5.l lVar) {
        super(1);
        this.f396609d = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        bw5.kp0 result = (bw5.kp0) obj;
        kotlin.jvm.internal.o.g(result, "result");
        rk4.g4 g4Var = rk4.g4.f396674a;
        boolean[] zArr = result.f29467n;
        bw5.rq0 rq0Var = zArr[4] ? result.f29463g : new bw5.rq0();
        kotlin.jvm.internal.o.f(rq0Var, "getPlayerBackgroundColor(...)");
        int b17 = rk4.g4.b(g4Var, rq0Var);
        bw5.rq0 rq0Var2 = zArr[5] ? result.f29464h : new bw5.rq0();
        kotlin.jvm.internal.o.f(rq0Var2, "getMinibarColor(...)");
        int b18 = rk4.g4.b(g4Var, rq0Var2);
        bw5.rq0 rq0Var3 = zArr[6] ? result.f29465i : new bw5.rq0();
        kotlin.jvm.internal.o.f(rq0Var3, "getLinkColor(...)");
        this.f396609d.invoke(new ff0.z(b17, b18, rk4.g4.b(g4Var, rq0Var3)));
        return jz5.f0.f302826a;
    }
}
