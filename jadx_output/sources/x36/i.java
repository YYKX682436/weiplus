package x36;

/* loaded from: classes16.dex */
public final class i implements java.io.Closeable {

    /* renamed from: d, reason: collision with root package name */
    public x36.k f451681d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f451682e;

    /* renamed from: f, reason: collision with root package name */
    public x36.c0 f451683f;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f451685h;

    /* renamed from: g, reason: collision with root package name */
    public long f451684g = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f451686i = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f451687m = -1;

    public final int a(long j17) {
        x36.c0 c0Var;
        x36.k kVar = this.f451681d;
        if (kVar == null) {
            throw new java.lang.IllegalStateException("not attached to a buffer".toString());
        }
        if (j17 >= -1) {
            long j18 = kVar.f451694e;
            if (j17 <= j18) {
                if (j17 == -1 || j17 == j18) {
                    this.f451683f = null;
                    this.f451684g = j17;
                    this.f451685h = null;
                    this.f451686i = -1;
                    this.f451687m = -1;
                    return -1;
                }
                x36.c0 c0Var2 = kVar.f451693d;
                x36.c0 c0Var3 = this.f451683f;
                long j19 = 0;
                if (c0Var3 != null) {
                    long j27 = this.f451684g;
                    int i17 = this.f451686i;
                    kotlin.jvm.internal.o.d(c0Var3);
                    long j28 = j27 - (i17 - c0Var3.f451658b);
                    if (j28 > j17) {
                        c0Var = c0Var2;
                        c0Var2 = this.f451683f;
                        j18 = j28;
                    } else {
                        c0Var = this.f451683f;
                        j19 = j28;
                    }
                } else {
                    c0Var = c0Var2;
                }
                if (j18 - j17 > j17 - j19) {
                    while (true) {
                        kotlin.jvm.internal.o.d(c0Var);
                        int i18 = c0Var.f451659c;
                        int i19 = c0Var.f451658b;
                        if (j17 < (i18 - i19) + j19) {
                            break;
                        }
                        j19 += i18 - i19;
                        c0Var = c0Var.f451662f;
                    }
                } else {
                    while (j18 > j17) {
                        kotlin.jvm.internal.o.d(c0Var2);
                        c0Var2 = c0Var2.f451663g;
                        kotlin.jvm.internal.o.d(c0Var2);
                        j18 -= c0Var2.f451659c - c0Var2.f451658b;
                    }
                    c0Var = c0Var2;
                    j19 = j18;
                }
                if (this.f451682e) {
                    kotlin.jvm.internal.o.d(c0Var);
                    if (c0Var.f451660d) {
                        byte[] bArr = c0Var.f451657a;
                        byte[] copyOf = java.util.Arrays.copyOf(bArr, bArr.length);
                        kotlin.jvm.internal.o.f(copyOf, "java.util.Arrays.copyOf(this, size)");
                        x36.c0 c0Var4 = new x36.c0(copyOf, c0Var.f451658b, c0Var.f451659c, false, true);
                        if (kVar.f451693d == c0Var) {
                            kVar.f451693d = c0Var4;
                        }
                        c0Var.b(c0Var4);
                        x36.c0 c0Var5 = c0Var4.f451663g;
                        kotlin.jvm.internal.o.d(c0Var5);
                        c0Var5.a();
                        c0Var = c0Var4;
                    }
                }
                this.f451683f = c0Var;
                this.f451684g = j17;
                kotlin.jvm.internal.o.d(c0Var);
                this.f451685h = c0Var.f451657a;
                int i27 = c0Var.f451658b + ((int) (j17 - j19));
                this.f451686i = i27;
                int i28 = c0Var.f451659c;
                this.f451687m = i28;
                return i28 - i27;
            }
        }
        throw new java.lang.ArrayIndexOutOfBoundsException("offset=" + j17 + " > size=" + kVar.f451694e);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!(this.f451681d != null)) {
            throw new java.lang.IllegalStateException("not attached to a buffer".toString());
        }
        this.f451681d = null;
        this.f451683f = null;
        this.f451684g = -1L;
        this.f451685h = null;
        this.f451686i = -1;
        this.f451687m = -1;
    }
}
