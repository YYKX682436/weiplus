package w36;

/* loaded from: classes16.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f442821a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Random f442822b;

    /* renamed from: c, reason: collision with root package name */
    public final x36.l f442823c;

    /* renamed from: d, reason: collision with root package name */
    public final x36.k f442824d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f442825e;

    /* renamed from: f, reason: collision with root package name */
    public final x36.k f442826f = new x36.k();

    /* renamed from: g, reason: collision with root package name */
    public final w36.l f442827g = new w36.l(this);

    /* renamed from: h, reason: collision with root package name */
    public boolean f442828h;

    /* renamed from: i, reason: collision with root package name */
    public final byte[] f442829i;

    /* renamed from: j, reason: collision with root package name */
    public final x36.i f442830j;

    public m(boolean z17, x36.l lVar, java.util.Random random) {
        if (lVar == null) {
            throw new java.lang.NullPointerException("sink == null");
        }
        if (random == null) {
            throw new java.lang.NullPointerException("random == null");
        }
        this.f442821a = z17;
        this.f442823c = lVar;
        this.f442824d = lVar.m();
        this.f442822b = random;
        this.f442829i = z17 ? new byte[4] : null;
        this.f442830j = z17 ? new x36.i() : null;
    }

    public final void a(int i17, x36.o oVar) {
        if (this.f442825e) {
            throw new java.io.IOException("closed");
        }
        int l17 = oVar.l();
        if (l17 > 125) {
            throw new java.lang.IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        x36.k kVar = this.f442824d;
        kVar.F(i17 | 128);
        if (this.f442821a) {
            kVar.F(l17 | 128);
            java.util.Random random = this.f442822b;
            byte[] bArr = this.f442829i;
            random.nextBytes(bArr);
            kVar.z(bArr);
            if (l17 > 0) {
                long j17 = kVar.f451694e;
                kVar.x(oVar);
                x36.i iVar = this.f442830j;
                kVar.j(iVar);
                iVar.a(j17);
                w36.i.b(iVar, bArr);
                iVar.close();
            }
        } else {
            kVar.F(l17);
            kVar.x(oVar);
        }
        this.f442823c.flush();
    }

    public void b(int i17, long j17, boolean z17, boolean z18) {
        if (this.f442825e) {
            throw new java.io.IOException("closed");
        }
        if (!z17) {
            i17 = 0;
        }
        if (z18) {
            i17 |= 128;
        }
        x36.k kVar = this.f442824d;
        kVar.F(i17);
        boolean z19 = this.f442821a;
        int i18 = z19 ? 128 : 0;
        if (j17 <= 125) {
            kVar.F(((int) j17) | i18);
        } else if (j17 <= 65535) {
            kVar.F(i18 | 126);
            kVar.N((int) j17);
        } else {
            kVar.F(i18 | 127);
            x36.c0 w17 = kVar.w(8);
            int i19 = w17.f451659c;
            int i27 = i19 + 1;
            byte[] bArr = w17.f451657a;
            bArr[i19] = (byte) ((j17 >>> 56) & 255);
            int i28 = i27 + 1;
            bArr[i27] = (byte) ((j17 >>> 48) & 255);
            int i29 = i28 + 1;
            bArr[i28] = (byte) ((j17 >>> 40) & 255);
            int i37 = i29 + 1;
            bArr[i29] = (byte) ((j17 >>> 32) & 255);
            int i38 = i37 + 1;
            bArr[i37] = (byte) ((j17 >>> 24) & 255);
            int i39 = i38 + 1;
            bArr[i38] = (byte) ((j17 >>> 16) & 255);
            int i47 = i39 + 1;
            bArr[i39] = (byte) ((j17 >>> 8) & 255);
            bArr[i47] = (byte) (255 & j17);
            w17.f451659c = i47 + 1;
            kVar.f451694e += 8;
        }
        x36.k kVar2 = this.f442826f;
        if (z19) {
            java.util.Random random = this.f442822b;
            byte[] bArr2 = this.f442829i;
            random.nextBytes(bArr2);
            kVar.z(bArr2);
            if (j17 > 0) {
                long j18 = kVar.f451694e;
                kVar.U(kVar2, j17);
                x36.i iVar = this.f442830j;
                kVar.j(iVar);
                iVar.a(j18);
                w36.i.b(iVar, bArr2);
                iVar.close();
            }
        } else {
            kVar.U(kVar2, j17);
        }
        this.f442823c.w0();
    }
}
