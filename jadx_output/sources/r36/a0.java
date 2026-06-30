package r36;

/* loaded from: classes16.dex */
public final class a0 implements x36.h0 {

    /* renamed from: d, reason: collision with root package name */
    public final x36.m f369334d;

    /* renamed from: e, reason: collision with root package name */
    public int f369335e;

    /* renamed from: f, reason: collision with root package name */
    public byte f369336f;

    /* renamed from: g, reason: collision with root package name */
    public int f369337g;

    /* renamed from: h, reason: collision with root package name */
    public int f369338h;

    /* renamed from: i, reason: collision with root package name */
    public short f369339i;

    public a0(x36.m mVar) {
        this.f369334d = mVar;
    }

    @Override // x36.h0
    public long B(x36.k kVar, long j17) {
        int i17;
        int readInt;
        do {
            int i18 = this.f369338h;
            x36.m mVar = this.f369334d;
            if (i18 != 0) {
                long B = mVar.B(kVar, java.lang.Math.min(j17, i18));
                if (B == -1) {
                    return -1L;
                }
                this.f369338h = (int) (this.f369338h - B);
                return B;
            }
            mVar.skip(this.f369339i);
            this.f369339i = (short) 0;
            if ((this.f369336f & 4) != 0) {
                return -1L;
            }
            i17 = this.f369337g;
            int readByte = ((mVar.readByte() & 255) << 16) | ((mVar.readByte() & 255) << 8) | (mVar.readByte() & 255);
            this.f369338h = readByte;
            this.f369335e = readByte;
            byte readByte2 = (byte) (mVar.readByte() & 255);
            this.f369336f = (byte) (mVar.readByte() & 255);
            java.util.logging.Logger logger = r36.c0.f369357h;
            if (logger.isLoggable(java.util.logging.Level.FINE)) {
                logger.fine(r36.g.a(true, this.f369337g, this.f369335e, readByte2, this.f369336f));
            }
            readInt = mVar.readInt() & Integer.MAX_VALUE;
            this.f369337g = readInt;
            if (readByte2 != 9) {
                r36.g.b("%s != TYPE_CONTINUATION", java.lang.Byte.valueOf(readByte2));
                throw null;
            }
        } while (readInt == i17);
        r36.g.b("TYPE_CONTINUATION streamId changed", new java.lang.Object[0]);
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // x36.h0
    public x36.j0 h() {
        return this.f369334d.h();
    }
}
