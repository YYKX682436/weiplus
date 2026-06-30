package i8;

/* loaded from: classes7.dex */
public class b extends java.io.FilterInputStream {

    /* renamed from: d, reason: collision with root package name */
    public long f289506d;

    public b(java.io.FileInputStream fileInputStream) {
        super(fileInputStream);
        this.f289506d = 0L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i17) {
        try {
            this.f289506d = ((java.io.FileInputStream) ((java.io.FilterInputStream) this).in).getChannel().position();
        } catch (java.lang.Exception e17) {
            g8.g.c("MicroMsg.FileSeekingInputStream", e17, "Failed seeking FileChannel.", new java.lang.Object[0]);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
        ((java.io.FileInputStream) ((java.io.FilterInputStream) this).in).getChannel().position(this.f289506d);
    }
}
