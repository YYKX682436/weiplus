package rc3;

/* loaded from: classes7.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc3.w0 f394022d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f394023e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.magicbrush.view.MBSurfaceStub f394024f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(rc3.w0 w0Var, int i17, com.tencent.mm.plugin.magicbrush.view.MBSurfaceStub mBSurfaceStub) {
        super(0);
        this.f394022d = w0Var;
        this.f394023e = i17;
        this.f394024f = mBSurfaceStub;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        jc3.g0 g0Var;
        rc3.w0 w0Var = this.f394022d;
        com.tencent.mm.plugin.magicbrush.MBBuildConfig mBBuildConfig = w0Var.f394091i;
        com.tencent.mm.plugin.magicbrush.view.MBSurfaceStub mBSurfaceStub = this.f394024f;
        if (mBBuildConfig != null && (g0Var = mBBuildConfig.f147828r) != null) {
            g0Var.Me(this.f394023e, mBSurfaceStub);
        }
        com.tencent.mm.plugin.magicbrush.MBBuildConfig mBBuildConfig2 = w0Var.f394091i;
        boolean z17 = mBBuildConfig2 != null ? mBBuildConfig2.f147833w : false;
        if (mBSurfaceStub.f148184d == null) {
            android.view.TextureView textureView = new android.view.TextureView(mBSurfaceStub.getContext());
            textureView.setOpaque(false);
            textureView.setSurfaceTextureListener(mBSurfaceStub);
            mBSurfaceStub.f148184d = textureView;
            if (z17) {
                mBSurfaceStub.setBackgroundColor(-16777216);
            }
            mBSurfaceStub.addView(mBSurfaceStub.f148184d);
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            if (z65.c.a()) {
                mBSurfaceStub.setContentDescription("MBView");
                android.view.TextureView textureView2 = mBSurfaceStub.f148184d;
                if (textureView2 != null) {
                    textureView2.setContentDescription("MBTextureView");
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
