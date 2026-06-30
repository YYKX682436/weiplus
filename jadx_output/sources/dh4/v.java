package dh4;

/* loaded from: classes15.dex */
public class v {
    public long A;
    public int B;
    public long C;
    public long D;
    public boolean E;
    public boolean F;

    /* renamed from: a, reason: collision with root package name */
    public int f232588a;

    /* renamed from: b, reason: collision with root package name */
    public long f232589b;

    /* renamed from: c, reason: collision with root package name */
    public long f232590c;

    /* renamed from: e, reason: collision with root package name */
    public int f232592e;

    /* renamed from: f, reason: collision with root package name */
    public long f232593f;

    /* renamed from: g, reason: collision with root package name */
    public int f232594g;

    /* renamed from: h, reason: collision with root package name */
    public int f232595h;

    /* renamed from: i, reason: collision with root package name */
    public int f232596i;

    /* renamed from: j, reason: collision with root package name */
    public int f232597j;

    /* renamed from: k, reason: collision with root package name */
    public int f232598k;

    /* renamed from: m, reason: collision with root package name */
    public int f232600m;

    /* renamed from: n, reason: collision with root package name */
    public int f232601n;

    /* renamed from: o, reason: collision with root package name */
    public int f232602o;

    /* renamed from: p, reason: collision with root package name */
    public int f232603p;

    /* renamed from: q, reason: collision with root package name */
    public int f232604q;

    /* renamed from: r, reason: collision with root package name */
    public int f232605r;

    /* renamed from: s, reason: collision with root package name */
    public int f232606s;

    /* renamed from: t, reason: collision with root package name */
    public int f232607t;

    /* renamed from: u, reason: collision with root package name */
    public int f232608u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f232609v;

    /* renamed from: w, reason: collision with root package name */
    public int f232610w;

    /* renamed from: x, reason: collision with root package name */
    public long f232611x;

    /* renamed from: y, reason: collision with root package name */
    public int f232612y;

    /* renamed from: z, reason: collision with root package name */
    public int f232613z;

    /* renamed from: d, reason: collision with root package name */
    public int f232591d = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f232599l = 0;

    public void a() {
        long j17 = this.D;
        if (j17 == 0) {
            return;
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = (android.os.SystemClock.elapsedRealtime() - j17) / 1000;
        if (elapsedRealtime < 2) {
            this.f232600m++;
        } else if (elapsedRealtime < 6) {
            this.f232601n++;
        } else if (elapsedRealtime < 11) {
            this.f232602o++;
        } else if (elapsedRealtime < 21) {
            this.f232603p++;
        } else if (elapsedRealtime < 31) {
            this.f232604q++;
        } else if (elapsedRealtime < 41) {
            this.f232605r++;
        } else if (elapsedRealtime < 51) {
            this.f232606s++;
        } else if (elapsedRealtime < 61) {
            this.f232607t++;
        } else {
            this.f232608u++;
        }
        this.D = 0L;
    }

    public java.lang.String toString() {
        return "" + this.f232588a + "," + this.f232589b + "," + this.f232590c + "," + this.f232591d + "," + this.f232592e + "," + this.f232593f + "," + this.f232594g + "," + this.f232595h + ",0,0," + this.f232596i + "," + this.f232597j + "," + this.f232598k + "," + this.f232599l + "," + this.f232600m + "," + this.f232601n + "," + this.f232602o + "," + this.f232603p + "," + this.f232604q + "," + this.f232605r + "," + this.f232606s + "," + this.f232607t + "," + this.f232608u + "," + this.f232609v + "," + this.f232610w + "," + this.f232611x + "," + this.f232612y + "," + this.f232613z;
    }
}
