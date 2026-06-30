package rc3;

/* loaded from: classes7.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc3.w0 f394050d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f394051e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.magicbrush.view.MBSurfaceStub f394052f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(rc3.w0 w0Var, int i17, com.tencent.mm.plugin.magicbrush.view.MBSurfaceStub mBSurfaceStub) {
        super(0);
        this.f394050d = w0Var;
        this.f394051e = i17;
        this.f394052f = mBSurfaceStub;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        jc3.g0 g0Var;
        com.tencent.mm.plugin.magicbrush.MBBuildConfig mBBuildConfig = this.f394050d.f394091i;
        com.tencent.mm.plugin.magicbrush.view.MBSurfaceStub mBSurfaceStub = this.f394052f;
        if (mBBuildConfig != null && (g0Var = mBBuildConfig.f147828r) != null) {
            g0Var.Zf(this.f394051e, mBSurfaceStub);
        }
        android.view.TextureView textureView = mBSurfaceStub.f148184d;
        if (textureView != null) {
            mBSurfaceStub.removeView(textureView);
        }
        mBSurfaceStub.f148184d = null;
        android.graphics.SurfaceTexture surfaceTexture = mBSurfaceStub.f148185e;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        return jz5.f0.f302826a;
    }
}
