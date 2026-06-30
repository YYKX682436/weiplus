package gk4;

/* loaded from: classes10.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk4.h0 f272535d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f272536e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(gk4.h0 h0Var, yz5.l lVar) {
        super(0);
        this.f272535d = h0Var;
        this.f272536e = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i(this.f272535d.f272556a, "createVideoTexture");
        is0.c cVar = this.f272535d.f272569n;
        if (cVar != null) {
            cVar.close();
        }
        this.f272535d.f272569n = new is0.c(false, 15L);
        gk4.h0 h0Var = this.f272535d;
        is0.c cVar2 = h0Var.f272569n;
        if (cVar2 != null) {
            yz5.l lVar = this.f272536e;
            if (cVar2.f294395e > 0) {
                android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(cVar2.f294395e);
                h0Var.f272570o = surfaceTexture;
                surfaceTexture.setOnFrameAvailableListener(new gk4.z(h0Var));
                ((ku5.t0) ku5.t0.f312615d).B(new gk4.a0(lVar, h0Var));
            } else {
                com.tencent.mars.xlog.Log.e(h0Var.f272556a, "create videoPlayTexture error texID:" + cVar2.f294395e);
            }
        }
        return jz5.f0.f302826a;
    }
}
