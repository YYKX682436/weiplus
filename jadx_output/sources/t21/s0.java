package t21;

/* loaded from: classes12.dex */
public class s0 implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t21.v0 f414950d;

    public s0(t21.v0 v0Var) {
        this.f414950d = v0Var;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        t21.v0 v0Var = this.f414950d;
        if (i17 != 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.NetScenePreloadVideoFake", "%d preload video error startRet[%d]", java.lang.Integer.valueOf(v0Var.hashCode()), java.lang.Integer.valueOf(i17));
            t21.u0 u0Var = v0Var.f414994r;
            if (u0Var != null) {
                u0Var.a(v0Var, false, 0, 0);
            }
        }
        if (gVar != null) {
            v0Var.hashCode();
        }
        if (hVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetScenePreloadVideoFake", "%d preload video error [%d]", java.lang.Integer.valueOf(v0Var.hashCode()), java.lang.Integer.valueOf(hVar.field_retCode));
            if (hVar.field_retCode != 0) {
                t21.u0 u0Var2 = v0Var.f414994r;
                if (u0Var2 != null) {
                    u0Var2.a(v0Var, false, 0, 0);
                }
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.NetScenePreloadVideoFake", "%d preload video download all video file", java.lang.Integer.valueOf(v0Var.hashCode()));
                v0Var.f(v0Var.f414982f, (int) hVar.field_fileLength, v0Var.f414983g);
            }
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return new byte[0];
    }
}
