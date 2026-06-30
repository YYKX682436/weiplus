package kw2;

/* loaded from: classes15.dex */
public final class e {
    public static final kw2.d V = new kw2.d(null);
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public long F;
    public long G;
    public long H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f312954J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public long O;
    public long P;
    public java.lang.String Q;
    public final android.util.ArraySet R;
    public kw2.e S;
    public java.lang.String T;
    public java.lang.String U;

    /* renamed from: a, reason: collision with root package name */
    public long f312955a;

    /* renamed from: b, reason: collision with root package name */
    public long f312956b;

    /* renamed from: c, reason: collision with root package name */
    public long f312957c;

    /* renamed from: d, reason: collision with root package name */
    public long f312958d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f312959e;

    /* renamed from: f, reason: collision with root package name */
    public long f312960f;

    /* renamed from: g, reason: collision with root package name */
    public long f312961g;

    /* renamed from: h, reason: collision with root package name */
    public long f312962h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f312963i;

    /* renamed from: j, reason: collision with root package name */
    public long f312964j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f312965k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f312966l;

    /* renamed from: m, reason: collision with root package name */
    public long f312967m;

    /* renamed from: n, reason: collision with root package name */
    public long f312968n;

    /* renamed from: o, reason: collision with root package name */
    public long f312969o;

    /* renamed from: p, reason: collision with root package name */
    public long f312970p;

    /* renamed from: q, reason: collision with root package name */
    public long f312971q;

    /* renamed from: r, reason: collision with root package name */
    public long f312972r;

    /* renamed from: s, reason: collision with root package name */
    public long f312973s;

    /* renamed from: t, reason: collision with root package name */
    public long f312974t;

    /* renamed from: u, reason: collision with root package name */
    public long f312975u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f312976v;

    /* renamed from: w, reason: collision with root package name */
    public long f312977w;

    /* renamed from: x, reason: collision with root package name */
    public long f312978x;

    /* renamed from: y, reason: collision with root package name */
    public long f312979y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f312980z;

    public e() {
        android.util.ArraySet arraySet = new android.util.ArraySet();
        this.f312955a = 0L;
        this.f312956b = 0L;
        this.f312957c = 0L;
        this.f312958d = 0L;
        this.f312959e = "";
        this.f312960f = 0L;
        this.f312961g = 0L;
        this.f312962h = 0L;
        this.f312963i = "";
        this.f312964j = 0L;
        this.f312965k = "";
        this.f312966l = "";
        this.f312967m = 0L;
        this.f312968n = 0L;
        this.f312969o = 0L;
        this.f312970p = 0L;
        this.f312971q = 0L;
        this.f312972r = 0L;
        this.f312973s = 0L;
        this.f312974t = 0L;
        this.f312975u = 0L;
        this.f312976v = "";
        this.f312977w = 0L;
        this.f312978x = 0L;
        this.f312979y = 0L;
        this.f312980z = false;
        this.A = false;
        this.B = false;
        this.C = false;
        this.D = false;
        this.E = false;
        this.F = 0L;
        this.G = 0L;
        this.H = 0L;
        this.I = false;
        this.f312954J = false;
        this.K = false;
        this.L = false;
        this.M = false;
        this.N = false;
        this.O = 0L;
        this.P = 0L;
        this.Q = "";
        this.R = arraySet;
        this.S = null;
        this.T = "";
        this.U = "";
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kw2.e)) {
            return false;
        }
        kw2.e eVar = (kw2.e) obj;
        return this.f312955a == eVar.f312955a && this.f312956b == eVar.f312956b && this.f312957c == eVar.f312957c && this.f312958d == eVar.f312958d && kotlin.jvm.internal.o.b(this.f312959e, eVar.f312959e) && this.f312960f == eVar.f312960f && this.f312961g == eVar.f312961g && this.f312962h == eVar.f312962h && kotlin.jvm.internal.o.b(this.f312963i, eVar.f312963i) && this.f312964j == eVar.f312964j && kotlin.jvm.internal.o.b(this.f312965k, eVar.f312965k) && kotlin.jvm.internal.o.b(this.f312966l, eVar.f312966l) && this.f312967m == eVar.f312967m && this.f312968n == eVar.f312968n && this.f312969o == eVar.f312969o && this.f312970p == eVar.f312970p && this.f312971q == eVar.f312971q && this.f312972r == eVar.f312972r && this.f312973s == eVar.f312973s && this.f312974t == eVar.f312974t && this.f312975u == eVar.f312975u && kotlin.jvm.internal.o.b(this.f312976v, eVar.f312976v) && this.f312977w == eVar.f312977w && this.f312978x == eVar.f312978x && this.f312979y == eVar.f312979y && this.f312980z == eVar.f312980z && this.A == eVar.A && this.B == eVar.B && this.C == eVar.C && this.D == eVar.D && this.E == eVar.E && this.F == eVar.F && this.G == eVar.G && this.H == eVar.H && this.I == eVar.I && this.f312954J == eVar.f312954J && this.K == eVar.K && this.L == eVar.L && this.M == eVar.M && this.N == eVar.N && this.O == eVar.O && this.P == eVar.P && kotlin.jvm.internal.o.b(this.Q, eVar.Q) && kotlin.jvm.internal.o.b(this.R, eVar.R) && kotlin.jvm.internal.o.b(this.S, eVar.S) && kotlin.jvm.internal.o.b(this.T, eVar.T) && kotlin.jvm.internal.o.b(this.U, eVar.U);
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((java.lang.Long.hashCode(this.f312955a) * 31) + java.lang.Long.hashCode(this.f312956b)) * 31) + java.lang.Long.hashCode(this.f312957c)) * 31) + java.lang.Long.hashCode(this.f312958d)) * 31) + this.f312959e.hashCode()) * 31) + java.lang.Long.hashCode(this.f312960f)) * 31) + java.lang.Long.hashCode(this.f312961g)) * 31) + java.lang.Long.hashCode(this.f312962h)) * 31) + this.f312963i.hashCode()) * 31) + java.lang.Long.hashCode(this.f312964j)) * 31) + this.f312965k.hashCode()) * 31) + this.f312966l.hashCode()) * 31) + java.lang.Long.hashCode(this.f312967m)) * 31) + java.lang.Long.hashCode(this.f312968n)) * 31) + java.lang.Long.hashCode(this.f312969o)) * 31) + java.lang.Long.hashCode(this.f312970p)) * 31) + java.lang.Long.hashCode(this.f312971q)) * 31) + java.lang.Long.hashCode(this.f312972r)) * 31) + java.lang.Long.hashCode(this.f312973s)) * 31) + java.lang.Long.hashCode(this.f312974t)) * 31) + java.lang.Long.hashCode(this.f312975u)) * 31) + this.f312976v.hashCode()) * 31) + java.lang.Long.hashCode(this.f312977w)) * 31) + java.lang.Long.hashCode(this.f312978x)) * 31) + java.lang.Long.hashCode(this.f312979y)) * 31) + java.lang.Boolean.hashCode(this.f312980z)) * 31) + java.lang.Boolean.hashCode(this.A)) * 31) + java.lang.Boolean.hashCode(this.B)) * 31) + java.lang.Boolean.hashCode(this.C)) * 31) + java.lang.Boolean.hashCode(this.D)) * 31) + java.lang.Boolean.hashCode(this.E)) * 31) + java.lang.Long.hashCode(this.F)) * 31) + java.lang.Long.hashCode(this.G)) * 31) + java.lang.Long.hashCode(this.H)) * 31) + java.lang.Boolean.hashCode(this.I)) * 31) + java.lang.Boolean.hashCode(this.f312954J)) * 31) + java.lang.Boolean.hashCode(this.K)) * 31) + java.lang.Boolean.hashCode(this.L)) * 31) + java.lang.Boolean.hashCode(this.M)) * 31) + java.lang.Boolean.hashCode(this.N)) * 31) + java.lang.Long.hashCode(this.O)) * 31) + java.lang.Long.hashCode(this.P)) * 31) + this.Q.hashCode()) * 31) + this.R.hashCode()) * 31;
        kw2.e eVar = this.S;
        return ((((hashCode + (eVar == null ? 0 : eVar.hashCode())) * 31) + this.T.hashCode()) * 31) + this.U.hashCode();
    }

    public java.lang.String toString() {
        return "DownloadReportData(actionType=" + this.f312955a + ", downloadType=" + this.f312956b + ", commentScene=" + this.f312957c + ", downloadStrategy=" + this.f312958d + ", feedId=" + this.f312959e + ", durationS=" + this.f312960f + ", durationMs=" + this.f312961g + ", fileSize=" + this.f312962h + ", videoFormat=" + this.f312963i + ", downloadSize=" + this.f312964j + ", downloadStartTime=" + this.f312965k + ", downloadEndTime=" + this.f312966l + ", netType=" + this.f312967m + ", uniqPlayTime=" + this.f312968n + ", realPlayTime=" + this.f312969o + ", playTime=" + this.f312970p + ", playCount=" + this.f312971q + ", playStartTime=" + this.f312972r + ", playEndTime=" + this.f312973s + ", playStartPos=" + this.f312974t + ", playStopPos=" + this.f312975u + ", mediaId=" + this.f312976v + ", startRecordTimeMs=" + this.f312977w + ", stopRecordTimeMs=" + this.f312978x + ", playSessionIndex=" + this.f312979y + ", startPlayHit=" + this.f312980z + ", stopPlayHit=" + this.A + ", startDownloaderHit=" + this.B + ", stopDownloaderHit=" + this.C + ", startPreRenderHit=" + this.D + ", stopPreRenderHit=" + this.E + ", startPlayCacheSize=" + this.F + ", stopPlayCacheSize=" + this.G + ", downloaderCompleteSizeInPlaySession=" + this.H + ", playerComeStopState=" + this.I + ", downloaderComeStopState=" + this.f312954J + ", updateFromDownloadResult=" + this.K + ", allFileDownloadCompleteBeforePlay=" + this.L + ", allFileDownloadCompleteInPlaying=" + this.M + ", segmentSizeInPreRender=" + this.N + ", lastPauseTimeMs=" + this.O + ", totalPauseTime=" + this.P + ", tag=" + this.Q + ", progressList=" + this.R + ", preRenderItem=" + this.S + ", netConnInfo=" + this.T + ", byPass=" + this.U + ')';
    }
}
