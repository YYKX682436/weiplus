package t9;

/* loaded from: classes15.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f416532a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    public static final float[] f416533b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Object f416534c = new java.lang.Object();

    /* renamed from: d, reason: collision with root package name */
    public static int[] f416535d = new int[10];

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0095, code lost:
    
        r9 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int b(byte[] r8, int r9, int r10, boolean[] r11) {
        /*
            Method dump skipped, instructions count: 186
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t9.n.b(byte[], int, int, boolean[]):int");
    }

    public static t9.l c(byte[] bArr, int i17, int i18) {
        t9.q qVar = new t9.q(bArr, i17, i18);
        qVar.j(8);
        int f17 = qVar.f();
        int f18 = qVar.f();
        qVar.i();
        return new t9.l(f17, f18, qVar.d());
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static t9.m d(byte[] r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t9.n.d(byte[], int, int):t9.m");
    }

    public static int e(byte[] bArr, int i17) {
        int i18;
        synchronized (f416534c) {
            int i19 = 0;
            int i27 = 0;
            while (i19 < i17) {
                while (true) {
                    if (i19 >= i17 - 2) {
                        i19 = i17;
                        break;
                    }
                    if (bArr[i19] == 0 && bArr[i19 + 1] == 0 && bArr[i19 + 2] == 3) {
                        break;
                    }
                    i19++;
                }
                if (i19 < i17) {
                    int[] iArr = f416535d;
                    if (iArr.length <= i27) {
                        f416535d = java.util.Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f416535d[i27] = i19;
                    i19 += 3;
                    i27++;
                }
            }
            i18 = i17 - i27;
            int i28 = 0;
            int i29 = 0;
            for (int i37 = 0; i37 < i27; i37++) {
                int i38 = f416535d[i37] - i29;
                java.lang.System.arraycopy(bArr, i29, bArr, i28, i38);
                int i39 = i28 + i38;
                int i47 = i39 + 1;
                bArr[i39] = 0;
                i28 = i47 + 1;
                bArr[i47] = 0;
                i29 += i38 + 3;
            }
            java.lang.System.arraycopy(bArr, i29, bArr, i28, i18 - i28);
        }
        return i18;
    }
}
