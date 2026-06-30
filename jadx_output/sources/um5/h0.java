package um5;

/* loaded from: classes10.dex */
public final class h0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um5.z f429165d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(um5.z zVar) {
        super(0);
        this.f429165d = zVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        um5.z zVar = this.f429165d;
        android.opengl.GLES20.glDeleteTextures(1, new int[]{zVar.f429229b.f429128a}, 0);
        android.graphics.SurfaceTexture surfaceTexture = zVar.f429229b.f429133f;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        return jz5.f0.f302826a;
    }
}
