package rk4;

/* loaded from: classes11.dex */
public final class f4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f396648d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(yz5.l lVar) {
        super(1);
        this.f396648d = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        bw5.sq0 result = (bw5.sq0) obj;
        kotlin.jvm.internal.o.g(result, "result");
        rk4.g4 g4Var = rk4.g4.f396674a;
        boolean[] zArr = result.f33115f;
        byte[] g17 = (zArr[2] ? result.f33114e : com.tencent.mm.protobuf.g.f192155b).g();
        bw5.tq0 tq0Var = zArr[1] ? result.f33113d : new bw5.tq0();
        kotlin.jvm.internal.o.f(tq0Var, "getImageInfo(...)");
        this.f396648d.invoke(rk4.g4.a(g4Var, g17, tq0Var));
        return jz5.f0.f302826a;
    }
}
