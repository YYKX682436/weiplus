package ln0;

/* loaded from: classes16.dex */
public final class q {
    public long A;
    public long B;
    public long C;
    public long D;
    public long E;
    public long F;
    public long G;
    public long H;
    public long I;

    /* renamed from: J, reason: collision with root package name */
    public long f319683J;
    public long K;
    public long L;
    public java.lang.String M;

    /* renamed from: a, reason: collision with root package name */
    public int f319684a;

    /* renamed from: b, reason: collision with root package name */
    public final int f319685b;

    /* renamed from: c, reason: collision with root package name */
    public final int f319686c;

    /* renamed from: d, reason: collision with root package name */
    public final int f319687d;

    /* renamed from: e, reason: collision with root package name */
    public final int f319688e;

    /* renamed from: f, reason: collision with root package name */
    public final int f319689f;

    /* renamed from: g, reason: collision with root package name */
    public final int f319690g;

    /* renamed from: h, reason: collision with root package name */
    public final int f319691h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f319692i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f319693j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f319694k;

    /* renamed from: l, reason: collision with root package name */
    public final int f319695l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f319696m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f319697n;

    /* renamed from: o, reason: collision with root package name */
    public final int f319698o;

    /* renamed from: p, reason: collision with root package name */
    public long f319699p;

    /* renamed from: q, reason: collision with root package name */
    public long f319700q;

    /* renamed from: r, reason: collision with root package name */
    public long f319701r;

    /* renamed from: s, reason: collision with root package name */
    public long f319702s;

    /* renamed from: t, reason: collision with root package name */
    public long f319703t;

    /* renamed from: u, reason: collision with root package name */
    public long f319704u;

    /* renamed from: v, reason: collision with root package name */
    public long f319705v;

    /* renamed from: w, reason: collision with root package name */
    public long f319706w;

    /* renamed from: x, reason: collision with root package name */
    public long f319707x;

    /* renamed from: y, reason: collision with root package name */
    public long f319708y;

    /* renamed from: z, reason: collision with root package name */
    public long f319709z;

    public q(int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, java.lang.String str, java.lang.String str2, java.lang.String str3, int i39, java.lang.String str4, java.lang.String str5, int i47, long j17, long j18, long j19, long j27, long j28, long j29, long j37, long j38, long j39, long j47, long j48, long j49, long j57, long j58, long j59, long j66, long j67, long j68, long j69, long j76, long j77, long j78, long j79, java.lang.String str6, int i48, int i49, kotlin.jvm.internal.i iVar) {
        int i57 = (i48 & 1) != 0 ? 0 : i17;
        int i58 = (i48 & 2) != 0 ? 0 : i18;
        int i59 = (i48 & 4) != 0 ? 0 : i19;
        int i66 = (i48 & 8) != 0 ? 0 : i27;
        int i67 = (i48 & 16) != 0 ? 0 : i28;
        int i68 = (i48 & 32) != 0 ? 0 : i29;
        int i69 = (i48 & 64) != 0 ? 0 : i37;
        int i76 = (i48 & 128) == 0 ? i38 : 0;
        java.lang.String p2pAppid = (i48 & 256) != 0 ? "" : str;
        java.lang.String p2pKey = (i48 & 512) != 0 ? "" : str2;
        java.lang.String p2pSecret = (i48 & 1024) != 0 ? "" : str3;
        int i77 = (i48 & 2048) != 0 ? 1 : i39;
        java.lang.String cdnPlayUrl = (i48 & 4096) != 0 ? "" : str4;
        java.lang.String p2pDomain = (i48 & 8192) != 0 ? "" : str5;
        int i78 = i77;
        int i79 = (i48 & 16384) != 0 ? 1 : i47;
        long j86 = (i48 & 32768) != 0 ? 0L : j17;
        long j87 = (i48 & 65536) != 0 ? 0L : j18;
        long j88 = (i48 & 131072) != 0 ? 0L : j19;
        long j89 = (i48 & 262144) != 0 ? 0L : j27;
        long j96 = (i48 & 524288) != 0 ? 0L : j28;
        long j97 = (i48 & 1048576) != 0 ? 0L : j29;
        long j98 = (i48 & 2097152) != 0 ? 0L : j37;
        long j99 = (i48 & 4194304) != 0 ? 0L : j38;
        long j100 = (i48 & 8388608) != 0 ? 0L : j39;
        long j101 = (i48 & com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62) != 0 ? 0L : j47;
        long j102 = (i48 & com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCHighTierLevel62) != 0 ? 0L : j48;
        long j103 = (i48 & 67108864) != 0 ? 0L : j49;
        long j104 = (i48 & 134217728) != 0 ? 0L : j57;
        long j105 = (i48 & 268435456) != 0 ? 0L : j58;
        long j106 = (i48 & com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? 0L : j59;
        long j107 = (i48 & 1073741824) != 0 ? 0L : j66;
        long j108 = (i48 & Integer.MIN_VALUE) != 0 ? 0L : j67;
        long j109 = (i49 & 1) != 0 ? 0L : j68;
        long j110 = (i49 & 2) != 0 ? 0L : j69;
        long j111 = (i49 & 4) != 0 ? 0L : j76;
        long j112 = (i49 & 8) != 0 ? 0L : j77;
        long j113 = (i49 & 16) != 0 ? 0L : j78;
        long j114 = (i49 & 32) != 0 ? 0L : j79;
        java.lang.String finderNickname = (i49 & 64) != 0 ? "" : str6;
        kotlin.jvm.internal.o.g(p2pAppid, "p2pAppid");
        kotlin.jvm.internal.o.g(p2pKey, "p2pKey");
        kotlin.jvm.internal.o.g(p2pSecret, "p2pSecret");
        kotlin.jvm.internal.o.g(cdnPlayUrl, "cdnPlayUrl");
        kotlin.jvm.internal.o.g(p2pDomain, "p2pDomain");
        kotlin.jvm.internal.o.g(finderNickname, "finderNickname");
        this.f319684a = i57;
        this.f319685b = i58;
        this.f319686c = i59;
        this.f319687d = i66;
        this.f319688e = i67;
        this.f319689f = i68;
        this.f319690g = i69;
        this.f319691h = i76;
        this.f319692i = p2pAppid;
        this.f319693j = p2pKey;
        this.f319694k = p2pSecret;
        this.f319695l = i78;
        this.f319696m = cdnPlayUrl;
        this.f319697n = p2pDomain;
        this.f319698o = i79;
        this.f319699p = j86;
        this.f319700q = j87;
        this.f319701r = j88;
        this.f319702s = j89;
        this.f319703t = j96;
        this.f319704u = j97;
        this.f319705v = j98;
        this.f319706w = j99;
        this.f319707x = j100;
        this.f319708y = j101;
        this.f319709z = j102;
        this.A = j103;
        this.B = j104;
        this.C = j105;
        this.D = j106;
        this.E = j107;
        this.F = j108;
        this.G = j109;
        this.H = j110;
        this.I = j111;
        this.f319683J = j112;
        this.K = j113;
        this.L = j114;
        this.M = finderNickname;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ln0.q)) {
            return false;
        }
        ln0.q qVar = (ln0.q) obj;
        return this.f319684a == qVar.f319684a && this.f319685b == qVar.f319685b && this.f319686c == qVar.f319686c && this.f319687d == qVar.f319687d && this.f319688e == qVar.f319688e && this.f319689f == qVar.f319689f && this.f319690g == qVar.f319690g && this.f319691h == qVar.f319691h && kotlin.jvm.internal.o.b(this.f319692i, qVar.f319692i) && kotlin.jvm.internal.o.b(this.f319693j, qVar.f319693j) && kotlin.jvm.internal.o.b(this.f319694k, qVar.f319694k) && this.f319695l == qVar.f319695l && kotlin.jvm.internal.o.b(this.f319696m, qVar.f319696m) && kotlin.jvm.internal.o.b(this.f319697n, qVar.f319697n) && this.f319698o == qVar.f319698o && this.f319699p == qVar.f319699p && this.f319700q == qVar.f319700q && this.f319701r == qVar.f319701r && this.f319702s == qVar.f319702s && this.f319703t == qVar.f319703t && this.f319704u == qVar.f319704u && this.f319705v == qVar.f319705v && this.f319706w == qVar.f319706w && this.f319707x == qVar.f319707x && this.f319708y == qVar.f319708y && this.f319709z == qVar.f319709z && this.A == qVar.A && this.B == qVar.B && this.C == qVar.C && this.D == qVar.D && this.E == qVar.E && this.F == qVar.F && this.G == qVar.G && this.H == qVar.H && this.I == qVar.I && this.f319683J == qVar.f319683J && this.K == qVar.K && this.L == qVar.L && kotlin.jvm.internal.o.b(this.M, qVar.M);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((java.lang.Integer.hashCode(this.f319684a) * 31) + java.lang.Integer.hashCode(this.f319685b)) * 31) + java.lang.Integer.hashCode(this.f319686c)) * 31) + java.lang.Integer.hashCode(this.f319687d)) * 31) + java.lang.Integer.hashCode(this.f319688e)) * 31) + java.lang.Integer.hashCode(this.f319689f)) * 31) + java.lang.Integer.hashCode(this.f319690g)) * 31) + java.lang.Integer.hashCode(this.f319691h)) * 31) + this.f319692i.hashCode()) * 31) + this.f319693j.hashCode()) * 31) + this.f319694k.hashCode()) * 31) + java.lang.Integer.hashCode(this.f319695l)) * 31) + this.f319696m.hashCode()) * 31) + this.f319697n.hashCode()) * 31) + java.lang.Integer.hashCode(this.f319698o)) * 31) + java.lang.Long.hashCode(this.f319699p)) * 31) + java.lang.Long.hashCode(this.f319700q)) * 31) + java.lang.Long.hashCode(this.f319701r)) * 31) + java.lang.Long.hashCode(this.f319702s)) * 31) + java.lang.Long.hashCode(this.f319703t)) * 31) + java.lang.Long.hashCode(this.f319704u)) * 31) + java.lang.Long.hashCode(this.f319705v)) * 31) + java.lang.Long.hashCode(this.f319706w)) * 31) + java.lang.Long.hashCode(this.f319707x)) * 31) + java.lang.Long.hashCode(this.f319708y)) * 31) + java.lang.Long.hashCode(this.f319709z)) * 31) + java.lang.Long.hashCode(this.A)) * 31) + java.lang.Long.hashCode(this.B)) * 31) + java.lang.Long.hashCode(this.C)) * 31) + java.lang.Long.hashCode(this.D)) * 31) + java.lang.Long.hashCode(this.E)) * 31) + java.lang.Long.hashCode(this.F)) * 31) + java.lang.Long.hashCode(this.G)) * 31) + java.lang.Long.hashCode(this.H)) * 31) + java.lang.Long.hashCode(this.I)) * 31) + java.lang.Long.hashCode(this.f319683J)) * 31) + java.lang.Long.hashCode(this.K)) * 31) + java.lang.Long.hashCode(this.L)) * 31) + this.M.hashCode();
    }

    public java.lang.String toString() {
        return "Xp2pParams(p2pSwitch=" + this.f319684a + ", p2pUploadSwitch=" + this.f319685b + ", p2pDownloadMnSwitch=" + this.f319686c + ", p2pStatSwitch=" + this.f319687d + ", p2pDebugLogSwitch=" + this.f319688e + ", p2pMaxLoad=" + this.f319689f + ", p2pMaxBufferSize=" + this.f319690g + ", p2pVerifyStream=" + this.f319695l + ", p2pDomain=" + this.f319697n + ", cdnPlayUrl=" + this.f319696m + ')';
    }
}
