package t9;

/* loaded from: classes15.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f416505a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f416506b = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f416507c = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static int a(t9.o oVar) {
        int d17 = oVar.d(4);
        if (d17 == 15) {
            return oVar.d(24);
        }
        t9.a.a(d17 < 13);
        return f416506b[d17];
    }

    public static android.util.Pair b(byte[] bArr) {
        t9.o oVar = new t9.o(bArr, bArr.length);
        int d17 = oVar.d(5);
        if (d17 == 31) {
            d17 = oVar.d(6) + 32;
        }
        int a17 = a(oVar);
        int d18 = oVar.d(4);
        if (d17 == 5 || d17 == 29) {
            a17 = a(oVar);
            int d19 = oVar.d(5);
            if (d19 == 31) {
                d19 = oVar.d(6) + 32;
            }
            if (d19 == 22) {
                d18 = oVar.d(4);
            }
        }
        int i17 = f416507c[d18];
        t9.a.a(i17 != -1);
        return android.util.Pair.create(java.lang.Integer.valueOf(a17), java.lang.Integer.valueOf(i17));
    }
}
