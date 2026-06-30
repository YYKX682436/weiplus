package se1;

/* loaded from: classes7.dex */
public class h extends java.io.Reader {

    /* renamed from: d, reason: collision with root package name */
    public se1.g f406768d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f406769e;

    /* renamed from: f, reason: collision with root package name */
    public java.nio.charset.CharsetDecoder f406770f;

    /* renamed from: g, reason: collision with root package name */
    public final java.nio.ByteBuffer f406771g;

    public h(se1.g gVar, java.lang.String str) {
        super(gVar);
        this.f406769e = false;
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(8192);
        this.f406771g = allocate;
        str.getClass();
        this.f406768d = gVar;
        try {
            this.f406770f = java.nio.charset.Charset.forName(str).newDecoder().onMalformedInput(java.nio.charset.CodingErrorAction.REPLACE).onUnmappableCharacter(java.nio.charset.CodingErrorAction.REPLACE);
            allocate.limit(0);
        } catch (java.lang.IllegalArgumentException e17) {
            throw ((java.io.UnsupportedEncodingException) new java.io.UnsupportedEncodingException(str).initCause(e17));
        }
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (((java.io.Reader) this).lock) {
            java.nio.charset.CharsetDecoder charsetDecoder = this.f406770f;
            if (charsetDecoder != null) {
                charsetDecoder.reset();
            }
            this.f406770f = null;
            se1.g gVar = this.f406768d;
            if (gVar != null) {
                gVar.close();
                this.f406768d = null;
            }
        }
    }

    @Override // java.io.Reader
    public int read() {
        char c17;
        synchronized (((java.io.Reader) this).lock) {
            if (this.f406768d != null) {
                char[] cArr = new char[1];
                c17 = read(cArr, 0, 1) != -1 ? cArr[0] : (char) 65535;
            } else {
                throw new java.io.IOException("DataSourceReader is closed");
            }
        }
        return c17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0048, code lost:
    
        if (r12.position() > r13) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ec A[Catch: all -> 0x0122, TryCatch #0 {, blocks: (B:4:0x0003, B:8:0x000e, B:11:0x0015, B:14:0x001b, B:17:0x001d, B:21:0x002f, B:31:0x0038, B:33:0x0044, B:25:0x0089, B:27:0x0097, B:29:0x00a5, B:35:0x004c, B:38:0x0051, B:40:0x0079, B:43:0x007f, B:46:0x00bb, B:48:0x00bf, B:50:0x00c3, B:51:0x00d5, B:53:0x00db, B:55:0x00e4, B:58:0x00f2, B:60:0x00ec, B:61:0x00e1, B:63:0x00f4, B:64:0x0117, B:65:0x0118, B:66:0x011f), top: B:3:0x0003 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00a3 -> B:20:0x00b8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00a5 -> B:20:0x00b8). Please report as a decompilation issue!!! */
    @Override // java.io.Reader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int read(char[] r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: se1.h.read(char[], int, int):int");
    }
}
