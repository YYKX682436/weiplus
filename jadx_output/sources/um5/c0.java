package um5;

/* loaded from: classes10.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um5.i0 f429139d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(um5.i0 i0Var) {
        super(0);
        this.f429139d = i0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        um5.i0 i0Var = this.f429139d;
        java.util.Iterator it = i0Var.f429168u.iterator();
        while (it.hasNext()) {
            um5.z zVar = (um5.z) it.next();
            android.opengl.GLES20.glDeleteTextures(1, new int[]{zVar.f429229b.f429128a}, 0);
            android.graphics.SurfaceTexture surfaceTexture = zVar.f429229b.f429133f;
            if (surfaceTexture != null) {
                surfaceTexture.release();
            }
        }
        i0Var.f429168u.clear();
        return jz5.f0.f302826a;
    }
}
