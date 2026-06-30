package dr4;

/* loaded from: classes14.dex */
public final class t0 implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f242742d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f242743e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dr4.p1 f242744f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f242745g;

    public t0(kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.h0 h0Var2, dr4.p1 p1Var, int i17) {
        this.f242742d = h0Var;
        this.f242743e = h0Var2;
        this.f242744f = p1Var;
        this.f242745g = i17;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surface, int i17, int i18) {
        dr4.x1 x1Var;
        kotlin.jvm.internal.o.g(surface, "surface");
        java.lang.Object obj = this.f242742d.f310123d;
        int i19 = this.f242745g;
        dr4.p1 p1Var = this.f242744f;
        kotlin.jvm.internal.h0 h0Var = this.f242743e;
        if (obj != null) {
            dr4.x1 x1Var2 = p1Var.f242708g;
            if (x1Var2 != null) {
                x1Var2.a((dr4.q) h0Var.f310123d, i19);
                return;
            }
            return;
        }
        h0Var.f310123d = new dr4.q(surface, i17, i18);
        dr4.x1 x1Var3 = p1Var.f242708g;
        boolean z17 = false;
        if (x1Var3 != null) {
            java.lang.Object obj2 = h0Var.f310123d;
            kotlin.jvm.internal.o.d(obj2);
            if (x1Var3.b((dr4.q) obj2)) {
                z17 = true;
            }
        }
        if (!z17 || (x1Var = p1Var.f242708g) == null) {
            return;
        }
        x1Var.a((dr4.q) h0Var.f310123d, i19);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surface) {
        kotlin.jvm.internal.o.g(surface, "surface");
        dr4.x1 x1Var = this.f242744f.f242708g;
        if (x1Var == null) {
            return true;
        }
        x1Var.c((dr4.q) this.f242743e.f310123d, this.f242745g);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surface, int i17, int i18) {
        kotlin.jvm.internal.o.g(surface, "surface");
        dr4.q qVar = (dr4.q) this.f242743e.f310123d;
        if (qVar != null) {
            qVar.d(0, 0, i17, i18);
        }
        dr4.x1 x1Var = this.f242744f.f242708g;
        if (x1Var != null) {
            x1Var.d();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        kotlin.jvm.internal.o.g(surface, "surface");
    }
}
