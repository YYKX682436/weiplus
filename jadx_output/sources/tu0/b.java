package tu0;

/* loaded from: classes5.dex */
public abstract class b implements tu0.f {

    /* renamed from: d, reason: collision with root package name */
    public byte[] f422078d;

    /* renamed from: a, reason: collision with root package name */
    public tu0.e f422075a = null;

    /* renamed from: b, reason: collision with root package name */
    public int f422076b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f422077c = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f422079e = 0;

    public void a(byte[] bArr, int i17, boolean z17) {
        if (this.f422075a == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Record.AudioEncoder", "mEncodeListener is null, return");
            return;
        }
        int i18 = this.f422077c;
        if (i18 == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Record.AudioEncoder", "no frameSize, return");
            return;
        }
        if (i17 > i18) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Record.AudioEncoder", "buffSize:%d frameSize:%d, buffSize > frameSize ", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f422077c));
        }
        this.f422075a.b(bArr, i17, z17);
        int i19 = this.f422079e;
        int i27 = i19 + i17;
        if (i27 >= this.f422077c && bArr != null) {
            if (i27 > this.f422078d.length) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Record.AudioEncoder", "expand the end codeBuffer:%d", java.lang.Integer.valueOf(i27));
                byte[] bArr2 = this.f422078d;
                byte[] bArr3 = new byte[i27];
                this.f422078d = bArr3;
                java.lang.System.arraycopy(bArr2, 0, bArr3, 0, this.f422079e);
            }
            java.lang.System.arraycopy(bArr, 0, this.f422078d, this.f422079e, i17);
            this.f422075a.a(this.f422078d, i27, false);
            this.f422079e = 0;
        } else if (bArr != null) {
            java.lang.System.arraycopy(bArr, 0, this.f422078d, i19, i17);
            this.f422079e = i27;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Record.AudioEncoder", "isEnd is true, flush the buffer, bufferedSize:%d", java.lang.Integer.valueOf(this.f422079e));
            this.f422075a.a(this.f422078d, this.f422079e, z17);
            this.f422079e = 0;
        }
    }
}
