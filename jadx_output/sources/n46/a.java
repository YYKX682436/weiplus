package n46;

/* loaded from: classes13.dex */
public class a extends j46.a {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f335088v = 0;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f335089s;

    /* renamed from: t, reason: collision with root package name */
    public final int f335090t;

    /* renamed from: u, reason: collision with root package name */
    public long f335091u;

    public a(java.io.InputStream inputStream, int i17) {
        super(inputStream, java.nio.ByteOrder.LITTLE_ENDIAN);
        int a17 = (int) this.f297718f.a(8);
        int a18 = (int) this.f297718f.a(8);
        int a19 = (int) this.f297718f.a(8);
        if (a17 != 31 || a18 != 157 || a19 < 0) {
            throw new java.io.IOException("Input is not in .Z format");
        }
        boolean z17 = (a19 & 128) != 0;
        this.f335089s = z17;
        int i18 = a19 & 31;
        this.f335090t = i18;
        if (z17) {
            this.f297719g = 256;
        }
        if (i18 <= 0) {
            throw new java.lang.IllegalArgumentException("maxCodeSize is " + i18 + ", must be bigger than 0");
        }
        if (i17 > -1) {
            long j17 = ((1 << i18) * 6) >> 10;
            if (j17 > i17) {
                throw new z36.a(j17, i17);
            }
        }
        if (i18 <= 0) {
            throw new java.lang.IllegalArgumentException("maxCodeSize is " + i18 + ", must be bigger than 0");
        }
        int i19 = 1 << i18;
        this.f297724o = new int[i19];
        this.f297725p = new byte[i19];
        this.f297726q = new byte[i19];
        this.f297727r = i19;
        for (int i27 = 0; i27 < 256; i27++) {
            this.f297724o[i27] = -1;
            this.f297725p[i27] = (byte) i27;
        }
        this.f297723n = (this.f335089s ? 1 : 0) + 256;
    }

    public int b(int i17, byte b17) {
        int i18 = this.f297720h;
        int i19 = 1 << i18;
        int i27 = this.f297723n;
        if (i27 < i19) {
            this.f297724o[i27] = i17;
            this.f297725p[i27] = b17;
            this.f297723n = i27 + 1;
        } else {
            i27 = -1;
        }
        if (this.f297723n == i19 && i18 < this.f335090t) {
            c();
            this.f297720h++;
        }
        return i27;
    }

    public final void c() {
        long j17;
        long j18 = 8 - (this.f335091u % 8);
        if (j18 == 8) {
            j18 = 0;
            j17 = 0;
        } else {
            j17 = 0;
        }
        while (j17 < j18) {
            f();
            j17++;
        }
        r46.a aVar = this.f297718f;
        aVar.f392498f = 0L;
        aVar.f392499g = 0;
    }

    public int f() {
        int i17 = this.f297720h;
        if (i17 > 31) {
            throw new java.lang.IllegalArgumentException("Code size must not be bigger than 31");
        }
        int a17 = (int) this.f297718f.a(i17);
        if (a17 >= 0) {
            this.f335091u++;
        }
        return a17;
    }
}
