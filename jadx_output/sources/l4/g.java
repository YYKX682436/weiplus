package l4;

/* loaded from: classes13.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f315713a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f315714b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f315715c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f315716d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f315717e;

    public g(int i17) {
        long[] jArr = new long[i17];
        this.f315713a = jArr;
        boolean[] zArr = new boolean[i17];
        this.f315714b = zArr;
        this.f315715c = new int[i17];
        java.util.Arrays.fill(jArr, 0L);
        java.util.Arrays.fill(zArr, false);
    }

    public int[] a() {
        synchronized (this) {
            if (this.f315716d && !this.f315717e) {
                int length = this.f315713a.length;
                int i17 = 0;
                while (true) {
                    int i18 = 1;
                    if (i17 >= length) {
                        this.f315717e = true;
                        this.f315716d = false;
                        return this.f315715c;
                    }
                    boolean z17 = this.f315713a[i17] > 0;
                    boolean[] zArr = this.f315714b;
                    if (z17 != zArr[i17]) {
                        int[] iArr = this.f315715c;
                        if (!z17) {
                            i18 = 2;
                        }
                        iArr[i17] = i18;
                    } else {
                        this.f315715c[i17] = 0;
                    }
                    zArr[i17] = z17;
                    i17++;
                }
            }
            return null;
        }
    }
}
