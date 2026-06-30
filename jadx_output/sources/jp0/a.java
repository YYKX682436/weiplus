package jp0;

/* loaded from: classes10.dex */
public class a implements jp0.h, jp0.i {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f300972a;

    /* renamed from: b, reason: collision with root package name */
    public java.io.InputStream f300973b = null;

    public a(java.lang.String str) {
        this.f300972a = str;
    }

    @Override // jp0.h
    public byte[] a() {
        byte[] bArr = null;
        try {
            java.io.InputStream E = com.tencent.mm.vfs.w6.E(this.f300972a);
            this.f300973b = E;
            bArr = new byte[E.available()];
            this.f300973b.read(bArr);
            return bArr;
        } catch (java.lang.Exception unused) {
            return bArr;
        }
    }

    @Override // jp0.i
    public java.io.InputStream b() {
        try {
            java.io.InputStream E = com.tencent.mm.vfs.w6.E(this.f300972a);
            this.f300973b = E;
            return E;
        } catch (java.io.FileNotFoundException unused) {
            return null;
        }
    }

    @Override // jp0.g
    public void close() {
        java.io.InputStream inputStream = this.f300973b;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (java.lang.Exception unused) {
            }
        }
    }
}
