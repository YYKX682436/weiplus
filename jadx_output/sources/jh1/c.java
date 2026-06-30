package jh1;

/* loaded from: classes7.dex */
public class c implements n01.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f299799d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f299800e;

    /* renamed from: f, reason: collision with root package name */
    public nf.a f299801f;

    /* renamed from: g, reason: collision with root package name */
    public long f299802g;

    public c(java.lang.String str, java.lang.String str2) {
        this.f299801f = null;
        this.f299799d = str;
        this.f299800e = str2;
        this.f299801f = b(str, str2);
    }

    public int a() {
        java.lang.String str;
        nf.a aVar = this.f299801f;
        java.lang.String str2 = this.f299799d;
        if (aVar == null) {
            this.f299801f = b(str2, this.f299800e);
        }
        if (this.f299801f == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxaAudioDataSource", "[getAudioType] inputStream is null");
            return 0;
        }
        if (str2.toLowerCase().endsWith(".mp3")) {
            return 2;
        }
        if (str2.toLowerCase().contains(".wav")) {
            return 3;
        }
        if (str2.toLowerCase().contains(".ogg")) {
            return 4;
        }
        try {
            try {
                byte[] bArr = new byte[64];
                this.f299801f.b(0);
                this.f299801f.read(bArr);
                str = new java.lang.String(bArr);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WxaAudioDataSource", "getAudioType", e17);
                this.f299801f.b(0);
                str = null;
            }
            return (str == null || !str.contains("ftyp")) ? 0 : 1;
        } finally {
            this.f299801f.b(0);
        }
    }

    public final nf.a b(java.lang.String str, java.lang.String str2) {
        java.lang.System.nanoTime();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxaAudioDataSource", "pkgpath is null, return");
            return null;
        }
        com.tencent.mm.plugin.appbrand.appcache.y8 y8Var = new com.tencent.mm.plugin.appbrand.appcache.y8(new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str2)));
        if (!y8Var.f76071g) {
            y8Var.close();
            com.tencent.mars.xlog.Log.e("MicroMsg.WxaAudioDataSource", "pkg invalid");
            return null;
        }
        if (!y8Var.a()) {
            y8Var.close();
            com.tencent.mars.xlog.Log.e("MicroMsg.WxaAudioDataSource", "pkg readInfo failed");
            return null;
        }
        java.io.InputStream c17 = y8Var.c(str);
        if (c17 == null) {
            y8Var.close();
            com.tencent.mars.xlog.Log.e("MicroMsg.WxaAudioDataSource", "inputstream for %s is null", str);
            return null;
        }
        y8Var.close();
        java.lang.System.nanoTime();
        return (nf.a) c17;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        nf.a aVar = this.f299801f;
        if (aVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaAudioDataSource", "close");
            aVar.close();
            this.f299801f = null;
        }
    }

    @Override // n01.f
    public long getSize() {
        if (this.f299801f != null) {
            return r0.f336572d.limit();
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.WxaAudioDataSource", "[getSize] inputStream is null");
        return 0L;
    }

    @Override // n01.f
    public int readAt(long j17, byte[] bArr, int i17, int i18) {
        if (this.f299801f == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxaAudioDataSource", "[readAt]inputstream is null");
            return -1;
        }
        if (bArr == null || bArr.length <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxaAudioDataSource", "[readAt]bytes is null");
            return -1;
        }
        if (j17 < 0 || i17 < 0 || i18 <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxaAudioDataSource", "position:%d, offset:%d, size:%d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            return -1;
        }
        if (i17 + i18 > bArr.length) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxaAudioDataSource", "offset:%d, size:%d, bytes.length:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(bArr.length));
            return -1;
        }
        if (i18 + j17 > getSize()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxaAudioDataSource", "position:%d, size:%d, getSize():%d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(getSize()));
        }
        if (this.f299802g != j17) {
            this.f299801f.b((int) j17);
            this.f299802g = j17;
        }
        int read = this.f299801f.read(bArr, i17, i18);
        if (read >= 0) {
            this.f299802g += read;
        }
        return read;
    }
}
