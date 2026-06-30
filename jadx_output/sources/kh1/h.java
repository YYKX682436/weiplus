package kh1;

/* loaded from: classes13.dex */
public class h extends kh1.c {

    /* renamed from: g, reason: collision with root package name */
    public java.io.OutputStream f307981g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.vfs.r6 f307982h;

    @Override // kh1.e
    public void close() {
        java.io.OutputStream outputStream = this.f307981g;
        if (outputStream != null) {
            try {
                outputStream.flush();
                this.f307981g.close();
            } catch (java.io.IOException unused) {
            }
            this.f307981g = null;
        }
    }

    @Override // kh1.e
    public boolean d(boolean z17, byte[] bArr, int i17) {
        e(bArr, i17, z17);
        try {
            java.io.OutputStream outputStream = this.f307981g;
            if (outputStream == null) {
                return true;
            }
            outputStream.write(bArr);
            return true;
        } catch (java.lang.Exception unused) {
            return true;
        }
    }

    @Override // kh1.e
    public void flush() {
        e(new byte[0], 0, true);
    }

    @Override // kh1.e
    public boolean init(java.lang.String str, int i17, int i18, int i19) {
        try {
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str));
            this.f307982h = r6Var;
            if (r6Var.m()) {
                this.f307982h.l();
            }
            this.f307982h.k();
            this.f307981g = new java.io.DataOutputStream(com.tencent.mm.vfs.w6.K(str, false));
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mm.sdk.platformtools.Log.c("Luggage.PCMAudioEncoder", "", e17);
            return true;
        }
    }
}
