package s6;

/* loaded from: classes13.dex */
public class f implements s6.b {

    /* renamed from: a, reason: collision with root package name */
    public int[] f403293a;

    /* renamed from: c, reason: collision with root package name */
    public final s6.a f403295c;

    /* renamed from: d, reason: collision with root package name */
    public java.nio.ByteBuffer f403296d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f403297e;

    /* renamed from: f, reason: collision with root package name */
    public short[] f403298f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f403299g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f403300h;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f403301i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f403302j;

    /* renamed from: k, reason: collision with root package name */
    public int f403303k;

    /* renamed from: l, reason: collision with root package name */
    public s6.d f403304l;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.Bitmap f403305m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f403306n;

    /* renamed from: o, reason: collision with root package name */
    public int f403307o;

    /* renamed from: p, reason: collision with root package name */
    public int f403308p;

    /* renamed from: q, reason: collision with root package name */
    public int f403309q;

    /* renamed from: r, reason: collision with root package name */
    public int f403310r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.Boolean f403311s;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f403294b = new int[256];

    /* renamed from: t, reason: collision with root package name */
    public android.graphics.Bitmap.Config f403312t = android.graphics.Bitmap.Config.ARGB_8888;

    public f(s6.a aVar, s6.d dVar, java.nio.ByteBuffer byteBuffer, int i17) {
        this.f403295c = aVar;
        this.f403304l = new s6.d();
        synchronized (this) {
            if (i17 <= 0) {
                throw new java.lang.IllegalArgumentException("Sample size must be >=0, not: " + i17);
            }
            int highestOneBit = java.lang.Integer.highestOneBit(i17);
            this.f403307o = 0;
            this.f403304l = dVar;
            this.f403303k = -1;
            java.nio.ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.f403296d = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            this.f403296d.order(java.nio.ByteOrder.LITTLE_ENDIAN);
            this.f403306n = false;
            java.util.Iterator it = ((java.util.ArrayList) dVar.f403282e).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((s6.c) it.next()).f403273g == 3) {
                    this.f403306n = true;
                    break;
                }
            }
            this.f403308p = highestOneBit;
            int i18 = dVar.f403283f;
            this.f403310r = i18 / highestOneBit;
            int i19 = dVar.f403284g;
            this.f403309q = i19 / highestOneBit;
            this.f403301i = ((h7.d) this.f403295c).a(i18 * i19);
            s6.a aVar2 = this.f403295c;
            int i27 = this.f403310r * this.f403309q;
            x6.b bVar = ((h7.d) aVar2).f279331b;
            this.f403302j = bVar == null ? new int[i27] : (int[]) ((x6.l) bVar).c(i27, int[].class);
        }
    }

    public final android.graphics.Bitmap a() {
        java.lang.Boolean bool = this.f403311s;
        android.graphics.Bitmap c17 = ((h7.d) this.f403295c).f279330a.c(this.f403310r, this.f403309q, (bool == null || bool.booleanValue()) ? android.graphics.Bitmap.Config.ARGB_8888 : this.f403312t);
        c17.setHasAlpha(true);
        return c17;
    }

    public synchronized android.graphics.Bitmap b() {
        if (this.f403304l.f403280c <= 0 || this.f403303k < 0) {
            if (android.util.Log.isLoggable("f", 3)) {
                int i17 = this.f403304l.f403280c;
            }
            this.f403307o = 1;
        }
        int i18 = this.f403307o;
        if (i18 != 1 && i18 != 2) {
            this.f403307o = 0;
            if (this.f403297e == null) {
                this.f403297e = ((h7.d) this.f403295c).a(255);
            }
            s6.c cVar = (s6.c) ((java.util.ArrayList) this.f403304l.f403282e).get(this.f403303k);
            int i19 = this.f403303k - 1;
            s6.c cVar2 = i19 >= 0 ? (s6.c) ((java.util.ArrayList) this.f403304l.f403282e).get(i19) : null;
            int[] iArr = cVar.f403277k;
            if (iArr == null) {
                iArr = this.f403304l.f403278a;
            }
            this.f403293a = iArr;
            if (iArr == null) {
                android.util.Log.isLoggable("f", 3);
                this.f403307o = 1;
                return null;
            }
            if (cVar.f403272f) {
                java.lang.System.arraycopy(iArr, 0, this.f403294b, 0, iArr.length);
                int[] iArr2 = this.f403294b;
                this.f403293a = iArr2;
                iArr2[cVar.f403274h] = 0;
                if (cVar.f403273g == 2 && this.f403303k == 0) {
                    this.f403311s = java.lang.Boolean.TRUE;
                }
            }
            return d(cVar, cVar2);
        }
        android.util.Log.isLoggable("f", 3);
        return null;
    }

    public void c(android.graphics.Bitmap.Config config) {
        if (config == android.graphics.Bitmap.Config.ARGB_8888 || config == android.graphics.Bitmap.Config.RGB_565) {
            this.f403312t = config;
            return;
        }
        throw new java.lang.IllegalArgumentException("Unsupported format: " + config + ", must be one of " + android.graphics.Bitmap.Config.ARGB_8888 + " or " + android.graphics.Bitmap.Config.RGB_565);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0046, code lost:
    
        if (r3.f403287j == r36.f403274h) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap d(s6.c r36, s6.c r37) {
        /*
            Method dump skipped, instructions count: 1089
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s6.f.d(s6.c, s6.c):android.graphics.Bitmap");
    }
}
