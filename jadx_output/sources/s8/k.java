package s8;

/* loaded from: classes15.dex */
public final class k {

    /* renamed from: d, reason: collision with root package name */
    public static final long[] f404708d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f404709a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    public int f404710b;

    /* renamed from: c, reason: collision with root package name */
    public int f404711c;

    public static long a(byte[] bArr, int i17, boolean z17) {
        long j17 = bArr[0] & 255;
        if (z17) {
            j17 &= ~f404708d[i17 - 1];
        }
        for (int i18 = 1; i18 < i17; i18++) {
            j17 = (j17 << 8) | (bArr[i18] & 255);
        }
        return j17;
    }

    public long b(q8.f fVar, boolean z17, boolean z18, int i17) {
        int i18;
        int i19 = this.f404710b;
        byte[] bArr = this.f404709a;
        if (i19 == 0) {
            if (!((q8.b) fVar).e(bArr, 0, 1, z17)) {
                return -1L;
            }
            int i27 = bArr[0] & 255;
            int i28 = 0;
            while (true) {
                if (i28 >= 8) {
                    i18 = -1;
                    break;
                }
                if ((f404708d[i28] & i27) != 0) {
                    i18 = i28 + 1;
                    break;
                }
                i28++;
            }
            this.f404711c = i18;
            if (i18 == -1) {
                throw new java.lang.IllegalStateException("No valid varint length mask found");
            }
            this.f404710b = 1;
        }
        int i29 = this.f404711c;
        if (i29 > i17) {
            this.f404710b = 0;
            return -2L;
        }
        if (i29 != 1) {
            ((q8.b) fVar).e(bArr, 1, i29 - 1, false);
        }
        this.f404710b = 0;
        return a(bArr, this.f404711c, z18);
    }
}
