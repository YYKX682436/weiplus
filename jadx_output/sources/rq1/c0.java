package rq1;

/* loaded from: classes12.dex */
public class c0 extends java.io.FilterInputStream {
    public c0(java.io.InputStream inputStream) {
        super(inputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ((java.util.zip.ZipInputStream) ((java.io.FilterInputStream) this).in).closeEntry();
    }
}
