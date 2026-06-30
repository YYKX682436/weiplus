package jp0;

/* loaded from: classes10.dex */
public class d implements jp0.i {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f300976a;

    /* renamed from: b, reason: collision with root package name */
    public java.io.InputStream f300977b = null;

    public d(byte[] bArr) {
        this.f300976a = bArr;
    }

    @Override // jp0.i
    public java.io.InputStream b() {
        if (this.f300977b == null) {
            this.f300977b = new java.io.ByteArrayInputStream(this.f300976a);
        }
        return this.f300977b;
    }

    @Override // jp0.g
    public void close() {
        java.io.InputStream inputStream = this.f300977b;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (java.lang.Exception unused) {
            }
        }
    }
}
