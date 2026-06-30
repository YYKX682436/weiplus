package x36;

/* loaded from: classes13.dex */
public final class j extends java.io.InputStream {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x36.k f451688d;

    public j(x36.k kVar) {
        this.f451688d = kVar;
    }

    @Override // java.io.InputStream
    public int available() {
        return (int) java.lang.Math.min(this.f451688d.f451694e, Integer.MAX_VALUE);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.InputStream
    public int read() {
        x36.k kVar = this.f451688d;
        if (kVar.f451694e > 0) {
            return kVar.readByte() & 255;
        }
        return -1;
    }

    public java.lang.String toString() {
        return this.f451688d + ".inputStream()";
    }

    @Override // java.io.InputStream
    public int read(byte[] sink, int i17, int i18) {
        kotlin.jvm.internal.o.g(sink, "sink");
        return this.f451688d.i(sink, i17, i18);
    }
}
