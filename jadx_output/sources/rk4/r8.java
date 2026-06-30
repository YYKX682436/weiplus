package rk4;

/* loaded from: classes11.dex */
public final class r8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rk4.z8 f396957d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.fr0 f396958e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ il4.e f396959f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8(rk4.z8 z8Var, bw5.fr0 fr0Var, il4.e eVar) {
        super(0);
        this.f396957d = z8Var;
        this.f396958e = fr0Var;
        this.f396959f = eVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        jm4.n5 n5Var = (jm4.n5) ((jz5.n) this.f396957d.f397139m).getValue();
        jm4.d3 d3Var = n5Var != null ? (jm4.d3) urgen.ur_0025.UR_B9B9.UR_C03A(((jm4.p5) n5Var).getCppPointer()) : null;
        zk4.l lVar = zk4.l.f473538a;
        jm4.g3 b17 = lVar.b();
        if (d3Var != null && b17 != null) {
            bw5.mp0 mp0Var = new bw5.mp0();
            mp0Var.f30340f = this.f396959f.f292106c;
            mp0Var.K[3] = true;
            bw5.fr0 snapshot = this.f396958e;
            kotlin.jvm.internal.o.g(snapshot, "snapshot");
            byte[] byteArray = snapshot.toByteArray();
            byte[] byteArray2 = mp0Var.toByteArray();
            long cppPointer = ((jm4.e3) d3Var).getCppPointer();
            kotlin.jvm.internal.o.d(byteArray);
            kotlin.jvm.internal.o.d(byteArray2);
            urgen.ur_0025.UR_B21A.UR_013B(cppPointer, byteArray, byteArray2);
            lVar.c(b17);
        }
        return jz5.f0.f302826a;
    }
}
