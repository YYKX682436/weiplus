package dr4;

/* loaded from: classes14.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr4.c0 f242735d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f242736e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(dr4.c0 c0Var, yz5.l lVar) {
        super(0);
        this.f242735d = c0Var;
        this.f242736e = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yz5.l lVar;
        int i17;
        dr4.c0 c0Var = this.f242735d;
        if ((c0Var.f242601d != null || c0Var.f242607j) && (lVar = this.f242736e) != null) {
            lVar.invoke(c0Var);
        }
        dr4.c0 c0Var2 = this.f242735d;
        c0Var2.f242607j = true;
        c0Var2.f242609l = this.f242736e;
        rs0.h n17 = rs0.g.n(rs0.i.f399296a, null, null, c0Var2.f242598a, c0Var2.f242599b, null, 16, null);
        c0Var2.f242601d = n17;
        pq4.c l17 = gq4.v.Bi().l("CAMERA");
        if (l17 != null) {
            l17.f357683d = n17;
        }
        int i18 = c0Var2.f242598a;
        int i19 = c0Var2.f242599b;
        c0Var2.f242602e = new dr4.q1(i18, i19, i18, i19, 2, 1);
        if (c0Var2.f242614q) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PboSurfaceRender", "render YT face-beauty algorithm");
            i17 = 2;
        } else {
            i17 = 0;
        }
        c0Var2.f242615r = i17;
        c0Var2.b(new dr4.x(c0Var2));
        is0.c cVar = new is0.c(false, 14L);
        c0Var2.f242606i = cVar;
        int i27 = c0Var2.f242598a;
        int i28 = c0Var2.f242599b;
        cVar.f294400m = i27;
        cVar.f294401n = i28;
        dr4.q1 q1Var = c0Var2.f242602e;
        if (q1Var != null) {
            q1Var.x(cVar);
        }
        c0Var2.f242603f = new android.graphics.SurfaceTexture(cVar.f294395e);
        c0Var2.f242604g = new android.view.Surface(c0Var2.f242603f);
        android.graphics.SurfaceTexture surfaceTexture = c0Var2.f242603f;
        if (surfaceTexture != null) {
            surfaceTexture.setOnFrameAvailableListener(new dr4.s(c0Var2));
        }
        ((ku5.t0) ku5.t0.f312615d).B(new dr4.t(c0Var2));
        com.tencent.mars.xlog.Log.i("MicroMsg.PboSurfaceRender", "init create PboSurfaceRender, width:" + c0Var2.f242598a + ", height:" + c0Var2.f242599b);
        this.f242735d.f242608k = false;
        return jz5.f0.f302826a;
    }
}
