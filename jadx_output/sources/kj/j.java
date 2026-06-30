package kj;

/* loaded from: classes12.dex */
public class j {

    /* renamed from: d, reason: collision with root package name */
    public float f308224d;

    /* renamed from: e, reason: collision with root package name */
    public float f308225e;

    /* renamed from: f, reason: collision with root package name */
    public float f308226f;

    /* renamed from: g, reason: collision with root package name */
    public long f308227g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f308228h;

    /* renamed from: j, reason: collision with root package name */
    public final jj.e f308230j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ kj.m f308231k;

    /* renamed from: a, reason: collision with root package name */
    public final long[] f308221a = new long[kj.i.values().length];

    /* renamed from: b, reason: collision with root package name */
    public final int[] f308222b = new int[kj.h.values().length];

    /* renamed from: c, reason: collision with root package name */
    public final int[] f308223c = new int[kj.h.values().length];

    /* renamed from: i, reason: collision with root package name */
    public int f308229i = 0;

    public j(kj.m mVar, jj.e eVar) {
        this.f308231k = mVar;
        this.f308230j = eVar;
    }

    public void a(java.lang.String str, android.view.FrameMetrics frameMetrics, float f17, float f18) {
        long[] jArr;
        java.lang.String str2 = this.f308228h;
        if (str2 != null && !str2.equals(str)) {
            b();
        }
        if (!(this.f308230j.b() && frameMetrics.getMetric(9) == 1) && f17 >= (f18 / 60.0f) * r3.d()) {
            if (this.f308229i == 0) {
                this.f308227g = android.os.SystemClock.uptimeMillis();
            }
            int i17 = 0;
            while (true) {
                jArr = this.f308221a;
                if (i17 > 8) {
                    break;
                }
                jArr[i17] = jArr[i17] + frameMetrics.getMetric(kj.i.f308219e[i17]);
                i17++;
            }
            if (kj.m.f308241w >= 31) {
                jArr[9] = jArr[9] + frameMetrics.getMetric(12);
            }
            this.f308224d += f17;
            int round = java.lang.Math.round(f17);
            long j17 = round;
            kj.m mVar = this.f308231k;
            long j18 = mVar.f308249n;
            int[] iArr = this.f308223c;
            int[] iArr2 = this.f308222b;
            if (j17 >= j18) {
                iArr2[4] = iArr2[4] + 1;
                iArr[4] = iArr[4] + round;
            } else if (j17 >= mVar.f308250o) {
                iArr2[3] = iArr2[3] + 1;
                iArr[3] = iArr[3] + round;
            } else if (j17 >= mVar.f308251p) {
                iArr2[2] = iArr2[2] + 1;
                iArr[2] = iArr[2] + round;
            } else if (j17 >= mVar.f308252q) {
                iArr2[1] = iArr2[1] + 1;
                iArr[1] = iArr[1] + round;
            } else {
                iArr2[0] = iArr2[0] + 1;
                iArr[0] = iArr[0] + java.lang.Math.max(round, 0);
            }
            this.f308225e += f18;
            this.f308226f += java.lang.Math.max((float) frameMetrics.getMetric(8), 1.0E9f / f18);
            this.f308229i++;
            this.f308228h = str;
            if (android.os.SystemClock.uptimeMillis() - this.f308227g >= r3.c()) {
                b();
            }
        }
    }

    public void b() {
        long[] jArr;
        int i17 = this.f308229i;
        if (i17 > 0) {
            this.f308224d /= i17;
            this.f308225e /= i17;
            this.f308226f /= i17;
            int i18 = 0;
            while (true) {
                jArr = this.f308221a;
                if (i18 >= jArr.length) {
                    break;
                }
                jArr[i18] = jArr[i18] / this.f308229i;
                i18++;
            }
            this.f308230j.a(this.f308228h, jArr, this.f308222b, this.f308223c, this.f308224d, this.f308225e, 1.0E9f / this.f308226f);
        }
        this.f308224d = 0.0f;
        this.f308225e = 0.0f;
        this.f308226f = 0.0f;
        this.f308229i = 0;
        java.util.Arrays.fill(this.f308221a, 0L);
        java.util.Arrays.fill(this.f308222b, 0);
        java.util.Arrays.fill(this.f308223c, 0);
    }
}
