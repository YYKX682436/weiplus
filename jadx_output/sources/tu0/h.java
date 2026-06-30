package tu0;

/* loaded from: classes5.dex */
public class h extends tu0.b {

    /* renamed from: f, reason: collision with root package name */
    public java.io.OutputStream f422084f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.vfs.r6 f422085g;

    @Override // tu0.f
    public void close() {
        java.io.OutputStream outputStream = this.f422084f;
        if (outputStream != null) {
            try {
                outputStream.flush();
                this.f422084f.close();
            } catch (java.io.IOException unused) {
            }
            this.f422084f = null;
        }
    }

    @Override // tu0.f
    public boolean init(java.lang.String str, int i17, int i18, int i19) {
        try {
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str));
            this.f422085g = r6Var;
            if (r6Var.m()) {
                this.f422085g.l();
            }
            this.f422085g.k();
            this.f422084f = new java.io.DataOutputStream(com.tencent.mm.vfs.w6.K(str, false));
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mm.sdk.platformtools.Log.c("Luggage.PCMAudioEncoder", "", e17);
            return true;
        }
    }
}
