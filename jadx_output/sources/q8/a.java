package q8;

/* loaded from: classes15.dex */
public final class a implements q8.m {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f360612a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f360613b;

    /* renamed from: c, reason: collision with root package name */
    public final long f360614c;

    public a(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f360612a = jArr;
        this.f360613b = jArr3;
        int length = iArr.length;
        if (length <= 0) {
            this.f360614c = 0L;
        } else {
            int i17 = length - 1;
            this.f360614c = jArr2[i17] + jArr3[i17];
        }
    }

    @Override // q8.m
    public boolean c() {
        return true;
    }

    @Override // q8.m
    public long d(long j17) {
        return this.f360612a[t9.d0.c(this.f360613b, j17, true, true)];
    }

    @Override // q8.m
    public long g() {
        return this.f360614c;
    }
}
