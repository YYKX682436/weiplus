package ro5;

/* loaded from: classes14.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ro5.b0 f398296d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(ro5.b0 b0Var) {
        super(0);
        this.f398296d = b0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ro5.b0 b0Var = this.f398296d;
        boolean z17 = false;
        if (!b0Var.H0() && b0Var.f398150g) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPRenderController", "onCameraFailedListener cameraHelper?.startCamera()");
            so5.k0 k0Var = b0Var.f398149f;
            if (k0Var != null) {
                z17 = so5.k0.c(k0Var, false, false, 3, null);
            }
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
