package g46;

/* loaded from: classes13.dex */
public class b extends h46.a {

    /* renamed from: q, reason: collision with root package name */
    public int f268853q;

    /* renamed from: r, reason: collision with root package name */
    public g46.a f268854r;

    public b(java.io.InputStream inputStream) {
        super(inputStream, 65536);
        this.f268854r = g46.a.NO_BLOCK;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i17, int i18) {
        int i19;
        boolean z17;
        int b17;
        long j17;
        int i27;
        if (i18 == 0) {
            return 0;
        }
        int ordinal = this.f268854r.ordinal();
        if (ordinal == 0) {
            int i28 = i();
            if (i28 == -1) {
                throw new java.io.IOException("Premature end of stream while looking for next block");
            }
            this.f268853q = i28 & 15;
            long j18 = (i28 & 240) >> 4;
            if (j18 == 15) {
                long j19 = 0;
                do {
                    i19 = i();
                    if (i19 == -1) {
                        throw new java.io.IOException("Premature end of stream while parsing length");
                    }
                    j19 += i19;
                } while (i19 == 255);
                j18 += j19;
            }
            if (j18 < 0) {
                throw new java.io.IOException("Illegal block with a negative literal size found");
            }
            if (j18 < 0) {
                throw new java.lang.IllegalArgumentException("length must not be negative");
            }
            this.f278974m = j18;
            this.f268854r = g46.a.IN_LITERAL;
        } else if (ordinal != 1) {
            if (ordinal == 2) {
                try {
                    b17 = (int) r46.d.b(this.f278977p, 2);
                    int i29 = this.f268853q;
                    j17 = i29;
                    if (i29 == 15) {
                        long j27 = 0;
                        do {
                            i27 = i();
                            if (i27 == -1) {
                                throw new java.io.IOException("Premature end of stream while parsing length");
                            }
                            j27 += i27;
                        } while (i27 == 255);
                        j17 += j27;
                    }
                } catch (java.io.IOException e17) {
                    if (this.f268853q != 0) {
                        throw e17;
                    }
                    z17 = false;
                }
                if (j17 < 0) {
                    throw new java.io.IOException("Illegal block with a negative match length found");
                }
                try {
                    j(b17, j17 + 4);
                    this.f268854r = g46.a.IN_BACK_REFERENCE;
                    z17 = true;
                    if (!z17) {
                        this.f268854r = g46.a.EOF;
                        return -1;
                    }
                } catch (java.lang.IllegalArgumentException e18) {
                    throw new java.io.IOException("Illegal block with bad offset found", e18);
                }
            } else if (ordinal != 3) {
                if (ordinal == 4) {
                    return -1;
                }
                throw new java.io.IOException("Unknown stream state " + this.f268854r);
            }
            int b18 = b(bArr, i17, i18);
            if (!(this.f278974m > 0)) {
                this.f268854r = g46.a.NO_BLOCK;
            }
            return b18 > 0 ? b18 : read(bArr, i17, i18);
        }
        int f17 = f(bArr, i17, i18);
        if (!(this.f278974m > 0)) {
            this.f268854r = g46.a.LOOKING_FOR_BACK_REFERENCE;
        }
        return f17 > 0 ? f17 : read(bArr, i17, i18);
    }
}
