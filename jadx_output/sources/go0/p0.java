package go0;

/* loaded from: classes14.dex */
public final class p0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go0.v0 f273813d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(go0.v0 v0Var) {
        super(0);
        this.f273813d = v0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        rs0.g gVar = rs0.i.f399296a;
        go0.v0 v0Var = this.f273813d;
        v0Var.f273885l = gVar.l(v0Var.f273875b, v0Var.f273876c, v0Var.f273874a);
        int i17 = v0Var.f273875b;
        int i18 = v0Var.f273876c;
        v0Var.f273880g = new go0.b1(i17, i18, i17, i18, 2, 0, 32, null);
        is0.c cVar = new is0.c(false, 18L);
        go0.b1 b1Var = v0Var.f273880g;
        if (b1Var != null) {
            b1Var.Q = cVar.f294395e;
        }
        android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(cVar.f294395e);
        v0Var.f273881h = surfaceTexture;
        surfaceTexture.setDefaultBufferSize(v0Var.f273875b, v0Var.f273876c);
        android.graphics.SurfaceTexture surfaceTexture2 = v0Var.f273881h;
        if (surfaceTexture2 != null) {
            surfaceTexture2.setOnFrameAvailableListener(new go0.u0(v0Var));
        }
        v0Var.f273884k = new android.view.Surface(v0Var.f273881h);
        v0Var.f273877d.invoke(v0Var);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Renderer info:");
        go0.b1 b1Var2 = v0Var.f273880g;
        sb6.append(b1Var2 != null ? b1Var2.C() : null);
        com.tencent.mars.xlog.Log.i("LiveScreenShareRender", sb6.toString());
        go0.b1 b1Var3 = v0Var.f273880g;
        if (b1Var3 != null) {
            b1Var3.P++;
        }
        return jz5.f0.f302826a;
    }
}
