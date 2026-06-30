package yk1;

/* loaded from: classes12.dex */
public class a extends java.io.FilterOutputStream {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f462764d;

    /* renamed from: e, reason: collision with root package name */
    public int f462765e;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f462766f;

    /* renamed from: g, reason: collision with root package name */
    public final int f462767g;

    /* renamed from: h, reason: collision with root package name */
    public int f462768h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f462769i;

    /* renamed from: m, reason: collision with root package name */
    public final byte[] f462770m;

    /* renamed from: n, reason: collision with root package name */
    public final int f462771n;

    /* renamed from: o, reason: collision with root package name */
    public final byte[] f462772o;

    public a(java.io.OutputStream outputStream, int i17) {
        super(outputStream);
        this.f462769i = (i17 & 8) != 0;
        boolean z17 = (i17 & 1) != 0;
        this.f462764d = z17;
        int i18 = z17 ? 3 : 4;
        this.f462767g = i18;
        this.f462766f = new byte[i18];
        this.f462765e = 0;
        this.f462768h = 0;
        this.f462770m = new byte[4];
        this.f462771n = i17;
        this.f462772o = yk1.b.e(i17);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        int i17 = this.f462765e;
        if (i17 > 0) {
            if (!this.f462764d) {
                throw new java.io.IOException("Base64 input not properly padded.");
            }
            java.io.OutputStream outputStream = ((java.io.FilterOutputStream) this).out;
            byte[] bArr = this.f462766f;
            byte[] bArr2 = this.f462770m;
            yk1.b.c(bArr, 0, i17, bArr2, 0, this.f462771n);
            outputStream.write(bArr2);
            this.f462765e = 0;
        }
        super.close();
        this.f462766f = null;
        ((java.io.FilterOutputStream) this).out = null;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i17) {
        int i18 = this.f462771n;
        int i19 = this.f462767g;
        byte[] bArr = this.f462770m;
        if (this.f462764d) {
            byte[] bArr2 = this.f462766f;
            int i27 = this.f462765e;
            int i28 = i27 + 1;
            this.f462765e = i28;
            bArr2[i27] = (byte) i17;
            if (i28 >= i19) {
                java.io.OutputStream outputStream = ((java.io.FilterOutputStream) this).out;
                yk1.b.c(bArr2, 0, i19, bArr, 0, i18);
                outputStream.write(bArr);
                int i29 = this.f462768h + 4;
                this.f462768h = i29;
                if (this.f462769i && i29 >= 76) {
                    ((java.io.FilterOutputStream) this).out.write(10);
                    this.f462768h = 0;
                }
                this.f462765e = 0;
                return;
            }
            return;
        }
        byte b17 = this.f462772o[i17 & 127];
        if (b17 <= -5) {
            if (b17 != -5) {
                throw new java.io.IOException("Invalid character in Base64 data.");
            }
            return;
        }
        byte[] bArr3 = this.f462766f;
        int i37 = this.f462765e;
        int i38 = i37 + 1;
        this.f462765e = i38;
        bArr3[i37] = (byte) i17;
        if (i38 >= i19) {
            ((java.io.FilterOutputStream) this).out.write(bArr, 0, yk1.b.b(bArr3, 0, bArr, 0, i18));
            this.f462765e = 0;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i17, int i18) {
        for (int i19 = 0; i19 < i18; i19++) {
            write(bArr[i17 + i19]);
        }
    }
}
