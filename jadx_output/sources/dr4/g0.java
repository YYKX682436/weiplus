package dr4;

/* loaded from: classes14.dex */
public final class g0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr4.n0 f242633d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(dr4.n0 n0Var) {
        super(0);
        this.f242633d = n0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        rs0.h n17 = rs0.g.n(rs0.i.f399296a, null, null, 1, 1, null, 16, null);
        dr4.n0 n0Var = this.f242633d;
        n0Var.f242685k = n17;
        pq4.c l17 = gq4.v.Bi().l("DECODE");
        if (l17 != null) {
            l17.f357683d = n17;
        }
        n0Var.f242686l = new dr4.s0(0, 0, 0, 0, 1, 2, 8, null);
        is0.c b17 = is0.b.b(false, 14L);
        n0Var.f242687m = b17;
        n0Var.d(new dr4.m(n0Var, b17));
        n0Var.f242690p = new android.graphics.SurfaceTexture(b17.f294395e);
        n0Var.f242691q = new android.view.Surface(n0Var.f242690p);
        android.graphics.SurfaceTexture surfaceTexture = n0Var.f242690p;
        if (surfaceTexture != null) {
            surfaceTexture.setOnFrameAvailableListener(new dr4.f0(n0Var, b17));
        }
        yz5.l lVar = n0Var.f242672u;
        if (lVar != null) {
            lVar.invoke(n0Var);
        }
        return jz5.f0.f302826a;
    }
}
