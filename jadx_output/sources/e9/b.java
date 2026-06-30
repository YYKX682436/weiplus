package e9;

/* loaded from: classes15.dex */
public abstract class b extends e9.a {

    /* renamed from: i, reason: collision with root package name */
    public byte[] f250328i;

    /* renamed from: j, reason: collision with root package name */
    public int f250329j;

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f250330k;

    public b(r9.k kVar, r9.n nVar, int i17, com.google.android.exoplayer2.Format format, int i18, java.lang.Object obj, byte[] bArr) {
        super(kVar, nVar, i17, format, i18, obj, -9223372036854775807L, -9223372036854775807L);
        this.f250328i = bArr;
    }

    @Override // r9.c0
    public final void a() {
        try {
            this.f250327h.b(this.f250320a);
            int i17 = 0;
            this.f250329j = 0;
            while (i17 != -1 && !this.f250330k) {
                byte[] bArr = this.f250328i;
                if (bArr == null) {
                    this.f250328i = new byte[16384];
                } else if (bArr.length < this.f250329j + 16384) {
                    this.f250328i = java.util.Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i17 = this.f250327h.a(this.f250328i, this.f250329j, 16384);
                if (i17 != -1) {
                    this.f250329j += i17;
                }
            }
            if (!this.f250330k) {
                ((g9.c) this).f269563m = java.util.Arrays.copyOf(this.f250328i, this.f250329j);
            }
        } finally {
            t9.d0.e(this.f250327h);
        }
    }

    @Override // r9.c0
    public final boolean b() {
        return this.f250330k;
    }

    @Override // r9.c0
    public final void c() {
        this.f250330k = true;
    }

    @Override // e9.a
    public long d() {
        return this.f250329j;
    }
}
