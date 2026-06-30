package iq1;

/* loaded from: classes13.dex */
public class i extends iq1.a {

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String f293696m;

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String f293697n;

    /* renamed from: g, reason: collision with root package name */
    public int f293698g;

    /* renamed from: h, reason: collision with root package name */
    public int f293699h;

    /* renamed from: i, reason: collision with root package name */
    public int f293700i;

    static {
        int i17 = hq1.n0.f283173a;
        f293696m = "0000fea1-0000-1000-8000-00805f9b34fb";
        f293697n = "0000fea2-0000-1000-8000-00805f9b34fb";
    }

    public i() {
        this.f293668e = null;
        this.f293669f = 8;
        this.f293667d = 1L;
        this.f293698g = -1;
        this.f293699h = -1;
        this.f293700i = -1;
    }

    @Override // iq1.a
    public byte[] a() {
        if (this.f293698g < 0) {
            com.tencent.mars.xlog.Log.e("iq1.i", "stepCount is invalid");
            return null;
        }
        int i17 = this.f293699h >= 0 ? 7 : 4;
        if (this.f293700i >= 0) {
            i17 += 3;
        }
        byte[] bArr = new byte[i17];
        bArr[0] = 1;
        int i18 = 1;
        for (int i19 = 0; i19 < 3; i19++) {
            bArr[i18] = (byte) ((this.f293698g >> (i19 * 8)) & 255);
            i18++;
        }
        if (this.f293699h >= 0) {
            bArr[0] = (byte) (bArr[0] | 2);
            for (int i27 = 0; i27 < 3; i27++) {
                bArr[i18] = (byte) ((this.f293699h >> (i27 * 8)) & 255);
                i18++;
            }
        }
        if (this.f293700i >= 0) {
            bArr[0] = 4;
            for (int i28 = 0; i28 < 3; i28++) {
                bArr[i18] = (byte) ((this.f293700i >> (i28 * 8)) & 255);
                i18++;
            }
        }
        return bArr;
    }
}
