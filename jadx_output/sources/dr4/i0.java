package dr4;

/* loaded from: classes14.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr4.n0 f242645d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f242646e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f242647f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.nio.ByteBuffer f242648g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(dr4.n0 n0Var, int i17, int i18, java.nio.ByteBuffer byteBuffer) {
        super(0);
        this.f242645d = n0Var;
        this.f242646e = i17;
        this.f242647f = i18;
        this.f242648g = byteBuffer;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        dr4.n0 n0Var = this.f242645d;
        dr4.r1 r1Var = n0Var.f242686l;
        if (r1Var != null) {
            r1Var.E(0);
        }
        is0.c cVar = n0Var.f242687m;
        if (cVar != null) {
            dr4.r1 r1Var2 = n0Var.f242686l;
            int i17 = this.f242647f;
            int i18 = this.f242646e;
            if (r1Var2 != null) {
                r1Var2.w(i18, i17);
            }
            dr4.r1 r1Var3 = n0Var.f242686l;
            if (r1Var3 != null) {
                r1Var3.s(90);
            }
            dr4.r1 r1Var4 = n0Var.f242686l;
            if (r1Var4 != null) {
                r1Var4.j(false);
            }
            gq4.v.wi().f365982p = new android.util.Size(i18, i17);
            dr4.r1 r1Var5 = n0Var.f242686l;
            if (r1Var5 != null) {
                r1Var5.y(this.f242648g, i18, i17);
            }
            n0Var.i(cVar);
        }
        return jz5.f0.f302826a;
    }
}
