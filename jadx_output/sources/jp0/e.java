package jp0;

/* loaded from: classes10.dex */
public class e implements jp0.i {

    /* renamed from: a, reason: collision with root package name */
    public final java.io.InputStream f300978a;

    public e(java.io.InputStream inputStream) {
        this.f300978a = inputStream;
    }

    @Override // jp0.i
    public java.io.InputStream b() {
        return this.f300978a;
    }

    @Override // jp0.g
    public void close() {
        java.io.InputStream inputStream = this.f300978a;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (java.lang.Exception unused) {
            }
        }
    }
}
