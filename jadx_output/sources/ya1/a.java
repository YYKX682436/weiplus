package ya1;

/* loaded from: classes7.dex */
public class a extends java.io.FilterInputStream {

    /* renamed from: d, reason: collision with root package name */
    public long f460417d;

    public a(java.io.FileInputStream fileInputStream) {
        super(fileInputStream);
        this.f460417d = 0L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i17) {
        try {
            this.f460417d = ((java.io.FileInputStream) ((java.io.FilterInputStream) this).in).getChannel().position();
        } catch (java.io.IOException e17) {
            com.tencent.stubs.logger.Log.e("Luggage.ViewAttributeHelper", e17, "fail to mark position.");
            this.f460417d = -1L;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        if (this.f460417d < 0) {
            throw new java.io.IOException("Illegal marked position: " + this.f460417d);
        }
        ((java.io.FileInputStream) ((java.io.FilterInputStream) this).in).getChannel().position(this.f460417d);
    }
}
