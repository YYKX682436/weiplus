package kh1;

/* loaded from: classes13.dex */
public abstract class c implements kh1.e {

    /* renamed from: d, reason: collision with root package name */
    public byte[] f307975d;

    /* renamed from: a, reason: collision with root package name */
    public kh1.d f307972a = null;

    /* renamed from: b, reason: collision with root package name */
    public int f307973b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f307974c = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f307976e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f307977f = 0;

    @Override // kh1.e
    public void a(kh1.d dVar) {
        this.f307972a = dVar;
    }

    @Override // kh1.e
    public void b(double d17) {
        this.f307974c = (int) (1024.0d * d17);
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.AudioEncoder", "setEncodeBuffFrameSize frameKbSize:%b frameByteSize:%d", java.lang.Double.valueOf(d17), java.lang.Integer.valueOf(this.f307974c));
        this.f307975d = new byte[this.f307974c];
    }

    @Override // kh1.e
    public void c(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.AudioEncoder", "mMinBufferSize:%d", java.lang.Integer.valueOf(this.f307973b));
        this.f307973b = i17;
    }

    public void e(byte[] bArr, int i17, boolean z17) {
        if (this.f307972a == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Record.AudioEncoder", "mEncodeListener is null, return");
            return;
        }
        int i18 = this.f307974c;
        if (i18 == 0.0d) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Record.AudioEncoder", "no frameSize, return");
            return;
        }
        if (i17 > i18) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Record.AudioEncoder", "buffSize:%d frameSize:%d, buffSize > frameSize ", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f307974c));
        }
        int i19 = this.f307976e;
        int i27 = i19 + i17;
        if (i27 >= this.f307974c && bArr != null) {
            if (i27 > this.f307975d.length) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Record.AudioEncoder", "expand the end codeBuffer:%d", java.lang.Integer.valueOf(i27));
                byte[] bArr2 = this.f307975d;
                byte[] bArr3 = new byte[i27];
                this.f307975d = bArr3;
                java.lang.System.arraycopy(bArr2, 0, bArr3, 0, this.f307976e);
            }
            java.lang.System.arraycopy(bArr, 0, this.f307975d, this.f307976e, i17);
            this.f307972a.a(this.f307975d, i27, false);
            this.f307976e = 0;
        } else if (bArr != null) {
            java.lang.System.arraycopy(bArr, 0, this.f307975d, i19, i17);
            this.f307976e = i27;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Record.AudioEncoder", "isEnd is true, flush the buffer, bufferedSize:%d", java.lang.Integer.valueOf(this.f307976e));
            this.f307972a.a(this.f307975d, this.f307976e, z17);
            this.f307976e = 0;
        }
        this.f307977f += i17;
    }
}
