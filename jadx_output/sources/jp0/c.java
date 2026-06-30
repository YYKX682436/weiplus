package jp0;

/* loaded from: classes10.dex */
public class c implements jp0.h {

    /* renamed from: a, reason: collision with root package name */
    public final java.io.InputStream f300975a;

    public c(java.io.InputStream inputStream) {
        this.f300975a = inputStream;
    }

    @Override // jp0.h
    public byte[] a() {
        try {
            return new byte[this.f300975a.available()];
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    @Override // jp0.g
    public void close() {
        java.io.InputStream inputStream = this.f300975a;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (java.lang.Exception unused) {
            }
        }
    }
}
