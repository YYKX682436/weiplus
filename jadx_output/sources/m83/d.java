package m83;

/* loaded from: classes14.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public int f324723a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f324724b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f324725c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f324726d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f324727e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f324728f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f324729g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f324730h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f324731i = 0;

    /* renamed from: j, reason: collision with root package name */
    public int f324732j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f324733k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f324734l = 0;

    /* renamed from: m, reason: collision with root package name */
    public long f324735m = 0;

    /* renamed from: n, reason: collision with root package name */
    public long f324736n = 0;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f324737o = "";

    /* renamed from: p, reason: collision with root package name */
    public int f324738p = 0;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f324739q = "";

    /* renamed from: r, reason: collision with root package name */
    public long f324740r = 0;

    /* renamed from: s, reason: collision with root package name */
    public long f324741s = 0;

    /* renamed from: t, reason: collision with root package name */
    public long f324742t = 0;

    /* renamed from: u, reason: collision with root package name */
    public long f324743u = 0;

    /* renamed from: v, reason: collision with root package name */
    public long f324744v = 0;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f324745w = "";

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f324746x = "";

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f324747y = "";

    /* renamed from: z, reason: collision with root package name */
    public long f324748z = 0;
    public long A = 0;
    public java.lang.String B = "";
    public long C = 0;
    public int D = 0;
    public int E = 0;
    public int F = 0;
    public int G = 0;

    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.IPCallReportHelper", "selfCancel");
        this.f324726d = 1;
        if (this.C != 0 || this.f324740r == 0) {
            return;
        }
        this.C = java.lang.System.currentTimeMillis() - this.f324740r;
    }
}
