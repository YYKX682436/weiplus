package m8;

/* loaded from: classes15.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Object f324595a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Object f324596b;

    /* renamed from: c, reason: collision with root package name */
    public int f324597c;

    /* renamed from: d, reason: collision with root package name */
    public long f324598d;

    /* renamed from: e, reason: collision with root package name */
    public long f324599e;

    /* renamed from: f, reason: collision with root package name */
    public long[] f324600f;

    /* renamed from: g, reason: collision with root package name */
    public int[] f324601g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f324602h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f324603i;

    /* renamed from: j, reason: collision with root package name */
    public long[][] f324604j;

    /* renamed from: k, reason: collision with root package name */
    public long f324605k;

    public int a(long j17) {
        if (this.f324600f == null) {
            return -1;
        }
        int i17 = 0;
        while (true) {
            long[] jArr = this.f324600f;
            if (i17 >= jArr.length) {
                break;
            }
            long j18 = jArr[i17];
            if (j18 == Long.MIN_VALUE || (j17 < j18 && !c(i17))) {
                break;
            }
            i17++;
        }
        if (i17 < this.f324600f.length) {
            return i17;
        }
        return -1;
    }

    public int b(long j17) {
        long[] jArr = this.f324600f;
        if (jArr == null) {
            return -1;
        }
        int length = jArr.length - 1;
        while (length >= 0) {
            long j18 = this.f324600f[length];
            if (j18 != Long.MIN_VALUE && j18 <= j17) {
                break;
            }
            length--;
        }
        if (length < 0 || c(length)) {
            return -1;
        }
        return length;
    }

    public boolean c(int i17) {
        int i18 = this.f324601g[i17];
        return i18 != -1 && this.f324603i[i17] == i18;
    }
}
