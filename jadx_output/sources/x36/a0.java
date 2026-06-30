package x36;

/* loaded from: classes14.dex */
public final class a0 extends java.io.InputStream {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x36.b0 f451653d;

    public a0(x36.b0 b0Var) {
        this.f451653d = b0Var;
    }

    @Override // java.io.InputStream
    public int available() {
        x36.b0 b0Var = this.f451653d;
        if (b0Var.f451655e) {
            throw new java.io.IOException("closed");
        }
        return (int) java.lang.Math.min(b0Var.f451654d.f451694e, Integer.MAX_VALUE);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f451653d.close();
    }

    @Override // java.io.InputStream
    public int read() {
        x36.b0 b0Var = this.f451653d;
        if (!b0Var.f451655e) {
            x36.k kVar = b0Var.f451654d;
            if (kVar.f451694e == 0 && b0Var.f451656f.B(kVar, 8192) == -1) {
                return -1;
            }
            return b0Var.f451654d.readByte() & 255;
        }
        throw new java.io.IOException("closed");
    }

    public java.lang.String toString() {
        return this.f451653d + ".inputStream()";
    }

    @Override // java.io.InputStream
    public int read(byte[] data, int i17, int i18) {
        kotlin.jvm.internal.o.g(data, "data");
        x36.b0 b0Var = this.f451653d;
        if (!b0Var.f451655e) {
            x36.b.b(data.length, i17, i18);
            x36.k kVar = b0Var.f451654d;
            if (kVar.f451694e == 0 && b0Var.f451656f.B(kVar, 8192) == -1) {
                return -1;
            }
            return b0Var.f451654d.i(data, i17, i18);
        }
        throw new java.io.IOException("closed");
    }
}
