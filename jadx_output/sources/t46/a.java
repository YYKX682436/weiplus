package t46;

/* loaded from: classes13.dex */
public class a extends java.io.OutputStream {

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f415672i = new byte[0];

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f415673d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public int f415674e;

    /* renamed from: f, reason: collision with root package name */
    public int f415675f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f415676g;

    /* renamed from: h, reason: collision with root package name */
    public int f415677h;

    public a() {
        synchronized (this) {
            a(1024);
        }
    }

    public final void a(int i17) {
        int i18 = this.f415674e;
        java.util.List list = this.f415673d;
        if (i18 < list.size() - 1) {
            this.f415675f += this.f415676g.length;
            int i19 = this.f415674e + 1;
            this.f415674e = i19;
            this.f415676g = (byte[]) list.get(i19);
            return;
        }
        byte[] bArr = this.f415676g;
        if (bArr == null) {
            this.f415675f = 0;
        } else {
            i17 = java.lang.Math.max(bArr.length << 1, i17 - this.f415675f);
            this.f415675f += this.f415676g.length;
        }
        this.f415674e++;
        byte[] bArr2 = new byte[i17];
        this.f415676g = bArr2;
        list.add(bArr2);
    }

    public synchronized byte[] b() {
        int i17 = this.f415677h;
        if (i17 == 0) {
            return f415672i;
        }
        byte[] bArr = new byte[i17];
        java.util.Iterator it = ((java.util.ArrayList) this.f415673d).iterator();
        int i18 = 0;
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            int min = java.lang.Math.min(bArr2.length, i17);
            java.lang.System.arraycopy(bArr2, 0, bArr, i18, min);
            i18 += min;
            i17 -= min;
            if (i17 == 0) {
                break;
            }
        }
        return bArr;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public java.lang.String toString() {
        return new java.lang.String(b(), java.nio.charset.Charset.defaultCharset());
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i17, int i18) {
        int i19;
        if (i17 < 0 || i17 > bArr.length || i18 < 0 || (i19 = i17 + i18) > bArr.length || i19 < 0) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        if (i18 == 0) {
            return;
        }
        synchronized (this) {
            int i27 = this.f415677h;
            int i28 = i27 + i18;
            int i29 = i27 - this.f415675f;
            while (i18 > 0) {
                int min = java.lang.Math.min(i18, this.f415676g.length - i29);
                java.lang.System.arraycopy(bArr, i19 - i18, this.f415676g, i29, min);
                i18 -= min;
                if (i18 > 0) {
                    a(i28);
                    i29 = 0;
                }
            }
            this.f415677h = i28;
        }
    }

    @Override // java.io.OutputStream
    public synchronized void write(int i17) {
        int i18 = this.f415677h;
        int i19 = i18 - this.f415675f;
        if (i19 == this.f415676g.length) {
            a(i18 + 1);
            i19 = 0;
        }
        this.f415676g[i19] = (byte) i17;
        this.f415677h++;
    }
}
