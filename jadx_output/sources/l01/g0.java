package l01;

/* loaded from: classes7.dex */
public class g0 extends java.io.BufferedInputStream {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ik1.b0 f314770d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(java.io.InputStream inputStream, ik1.b0 b0Var) {
        super(inputStream);
        this.f314770d = b0Var;
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            super.close();
        } finally {
            java.net.URLConnection uRLConnection = (java.net.URLConnection) this.f314770d.f291824a;
            int i17 = s46.d.f403004a;
            if (uRLConnection instanceof java.net.HttpURLConnection) {
                ((java.net.HttpURLConnection) uRLConnection).disconnect();
            }
        }
    }
}
