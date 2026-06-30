package rc3;

/* loaded from: classes7.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc3.w0 f393949d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(rc3.w0 w0Var) {
        super(0);
        this.f393949d = w0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        rc3.w0 w0Var = this.f393949d;
        java.util.Collection<com.tencent.mm.plugin.magicbrush.view.MBSurfaceStub> values = w0Var.f394095p.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        for (com.tencent.mm.plugin.magicbrush.view.MBSurfaceStub mBSurfaceStub : values) {
            android.view.TextureView textureView = mBSurfaceStub.f148184d;
            if (textureView != null) {
                mBSurfaceStub.removeView(textureView);
            }
            mBSurfaceStub.f148184d = null;
            android.graphics.SurfaceTexture surfaceTexture = mBSurfaceStub.f148185e;
            if (surfaceTexture != null) {
                surfaceTexture.release();
            }
        }
        w0Var.f394095p.clear();
        java.util.HashMap hashMap = w0Var.f394096q;
        java.util.Collection<cf3.d> values2 = hashMap.values();
        kotlin.jvm.internal.o.f(values2, "<get-values>(...)");
        for (cf3.d dVar : values2) {
            dVar.f40917b.post(new cf3.a(dVar));
        }
        hashMap.clear();
        return jz5.f0.f302826a;
    }
}
