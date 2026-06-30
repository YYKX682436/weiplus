package uk;

/* loaded from: classes7.dex */
public class h extends java.io.FileInputStream {

    /* renamed from: d, reason: collision with root package name */
    public long f428500d;

    public h(java.io.File file) {
        super(file);
        this.f428500d = 0L;
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i17) {
        try {
            this.f428500d = getChannel().position();
        } catch (java.io.IOException e17) {
            throw new java.lang.IllegalStateException(e17);
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        getChannel().position(this.f428500d);
    }
}
