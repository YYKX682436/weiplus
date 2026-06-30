package iq1;

/* loaded from: classes13.dex */
public class h extends iq1.a {

    /* renamed from: r, reason: collision with root package name */
    public static final java.lang.String f293684r;

    /* renamed from: s, reason: collision with root package name */
    public static final java.lang.String f293685s;

    /* renamed from: t, reason: collision with root package name */
    public static final java.lang.String f293686t;

    /* renamed from: u, reason: collision with root package name */
    public static final java.lang.String f293687u;

    /* renamed from: g, reason: collision with root package name */
    public byte f293688g;

    /* renamed from: h, reason: collision with root package name */
    public byte f293689h;

    /* renamed from: i, reason: collision with root package name */
    public byte f293690i;

    /* renamed from: m, reason: collision with root package name */
    public byte f293691m;

    /* renamed from: n, reason: collision with root package name */
    public final byte[] f293692n;

    /* renamed from: o, reason: collision with root package name */
    public int f293693o;

    /* renamed from: p, reason: collision with root package name */
    public byte f293694p;

    /* renamed from: q, reason: collision with root package name */
    public byte[] f293695q;

    static {
        int i17 = hq1.n0.f283173a;
        f293684r = "0000feb1-0000-1000-8000-00805f9b34fb";
        f293685s = "0000feb2-0000-1000-8000-00805f9b34fb";
        f293686t = "0000feb3-0000-1000-8000-00805f9b34fb";
        f293687u = "0000feb4-0000-1000-8000-00805f9b34fb";
    }

    public h() {
        this.f293668e = null;
        this.f293669f = 8;
        this.f293667d = 16L;
        this.f293688g = (byte) 0;
        this.f293689h = (byte) 0;
        this.f293690i = (byte) 0;
        this.f293691m = (byte) 0;
        this.f293692n = new byte[]{0, 0};
        this.f293693o = -1;
        this.f293694p = (byte) 0;
        this.f293695q = null;
    }

    @Override // iq1.a
    public byte[] a() {
        if (this.f293668e.equalsIgnoreCase(f293684r)) {
            byte[] bArr = new byte[3];
            java.lang.System.arraycopy(java.lang.Byte.valueOf(this.f293688g), 0, bArr, 0, 1);
            java.lang.System.arraycopy(java.lang.Byte.valueOf(this.f293689h), 0, bArr, 1, 1);
            java.lang.System.arraycopy(java.lang.Byte.valueOf(this.f293690i), 0, bArr, 2, 1);
            return bArr;
        }
        if (this.f293668e.equalsIgnoreCase(f293685s)) {
            byte[] bArr2 = new byte[1];
            java.lang.System.arraycopy(java.lang.Byte.valueOf(this.f293691m), 0, bArr2, 0, 1);
            return bArr2;
        }
        if (!this.f293668e.equalsIgnoreCase(f293687u)) {
            return null;
        }
        int i17 = this.f293693o;
        byte[] bArr3 = new byte[i17];
        java.lang.System.arraycopy(java.lang.Byte.valueOf((byte) (i17 & 255)), 0, bArr3, 0, 1);
        java.lang.System.arraycopy(java.lang.Byte.valueOf((byte) ((i17 >> 8) & 255)), 0, bArr3, 1, 1);
        java.lang.System.arraycopy(java.lang.Byte.valueOf(this.f293694p), 0, bArr3, 2, 1);
        int i18 = this.f293693o;
        if (i18 > 3) {
            java.lang.System.arraycopy(this.f293695q, 0, bArr3, 3, i18 - 3);
        }
        return bArr3;
    }
}
