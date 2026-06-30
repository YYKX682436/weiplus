package ya1;

/* loaded from: classes7.dex */
public abstract class b {
    public static java.io.InputStream a(java.io.InputStream inputStream) {
        return inputStream.markSupported() ? inputStream : inputStream instanceof java.io.FileInputStream ? new ya1.a((java.io.FileInputStream) inputStream) : new java.io.BufferedInputStream(inputStream);
    }
}
