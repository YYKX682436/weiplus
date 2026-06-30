package dk2;

/* loaded from: classes3.dex */
public final class qf implements java.io.Serializable {
    public java.lang.String A;
    public int B;
    public java.lang.String C;
    public java.lang.String D;
    public java.lang.String E;
    public boolean F;
    public final java.util.List G;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Long f233970d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f233971e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Long f233972f;

    /* renamed from: g, reason: collision with root package name */
    public int f233973g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f233974h;

    /* renamed from: i, reason: collision with root package name */
    public int f233975i;

    /* renamed from: m, reason: collision with root package name */
    public int f233976m;

    /* renamed from: n, reason: collision with root package name */
    public int f233977n;

    /* renamed from: o, reason: collision with root package name */
    public int f233978o;

    /* renamed from: p, reason: collision with root package name */
    public long f233979p;

    /* renamed from: q, reason: collision with root package name */
    public long f233980q;

    /* renamed from: r, reason: collision with root package name */
    public long f233981r;

    /* renamed from: s, reason: collision with root package name */
    public long f233982s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f233983t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f233984u;

    /* renamed from: v, reason: collision with root package name */
    public long f233985v;

    /* renamed from: w, reason: collision with root package name */
    public dk2.na f233986w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f233987x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f233988y;

    /* renamed from: z, reason: collision with root package name */
    public long f233989z;

    public qf(java.lang.Long l17, java.lang.String str, java.lang.Long l18, int i17, boolean z17, int i18, int i19, int i27, int i28, long j17, long j18, long j19, long j27, boolean z18, boolean z19, long j28, dk2.na naVar, boolean z27, boolean z28, long j29, java.lang.String str2, int i29, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z29, java.util.List list, int i37, kotlin.jvm.internal.i iVar) {
        java.lang.Long l19 = (i37 & 1) != 0 ? null : l17;
        java.lang.String str6 = (i37 & 2) != 0 ? null : str;
        java.lang.Long l27 = (i37 & 4) != 0 ? null : l18;
        int i38 = (i37 & 8) != 0 ? 0 : i17;
        boolean z37 = (i37 & 16) != 0 ? false : z17;
        int i39 = (i37 & 32) != 0 ? 0 : i18;
        int i47 = (i37 & 64) != 0 ? 0 : i19;
        int i48 = (i37 & 128) != 0 ? 0 : i27;
        int i49 = (i37 & 256) != 0 ? 0 : i28;
        long j37 = (i37 & 512) != 0 ? 0L : j17;
        long j38 = (i37 & 1024) != 0 ? 0L : j18;
        long j39 = (i37 & 2048) != 0 ? 0L : j19;
        long j47 = (i37 & 4096) != 0 ? 0L : j27;
        boolean z38 = (i37 & 8192) != 0 ? false : z18;
        boolean z39 = (i37 & 16384) != 0 ? false : z19;
        long j48 = (i37 & 32768) != 0 ? 0L : j28;
        dk2.na curStatus = (i37 & 65536) != 0 ? dk2.na.f233806e : naVar;
        boolean z47 = (i37 & 131072) != 0 ? false : z27;
        boolean z48 = (i37 & 262144) != 0 ? false : z28;
        long j49 = (i37 & 524288) != 0 ? 0L : j29;
        java.lang.String str7 = (i37 & 1048576) != 0 ? null : str2;
        int i57 = (i37 & 2097152) != 0 ? -1 : i29;
        java.lang.String str8 = (i37 & 4194304) != 0 ? null : str3;
        java.lang.String str9 = (i37 & 8388608) != 0 ? null : str4;
        java.lang.String str10 = (i37 & com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62) != 0 ? null : str5;
        boolean z49 = (i37 & com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCHighTierLevel62) != 0 ? false : z29;
        java.util.List micReplayInfoList = (i37 & 67108864) != 0 ? new java.util.ArrayList() : list;
        kotlin.jvm.internal.o.g(curStatus, "curStatus");
        kotlin.jvm.internal.o.g(micReplayInfoList, "micReplayInfoList");
        this.f233970d = l19;
        this.f233971e = str6;
        this.f233972f = l27;
        this.f233973g = i38;
        this.f233974h = z37;
        this.f233975i = i39;
        this.f233976m = i47;
        this.f233977n = i48;
        this.f233978o = i49;
        this.f233979p = j37;
        this.f233980q = j38;
        this.f233981r = j39;
        this.f233982s = j47;
        this.f233983t = z38;
        this.f233984u = z39;
        this.f233985v = j48;
        this.f233986w = curStatus;
        this.f233987x = z47;
        this.f233988y = z48;
        this.f233989z = j49;
        this.A = str7;
        this.B = i57;
        this.C = str8;
        this.D = str9;
        this.E = str10;
        this.F = z49;
        this.G = micReplayInfoList;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk2.qf)) {
            return false;
        }
        dk2.qf qfVar = (dk2.qf) obj;
        return kotlin.jvm.internal.o.b(this.f233970d, qfVar.f233970d) && kotlin.jvm.internal.o.b(this.f233971e, qfVar.f233971e) && kotlin.jvm.internal.o.b(this.f233972f, qfVar.f233972f) && this.f233973g == qfVar.f233973g && this.f233974h == qfVar.f233974h && this.f233975i == qfVar.f233975i && this.f233976m == qfVar.f233976m && this.f233977n == qfVar.f233977n && this.f233978o == qfVar.f233978o && this.f233979p == qfVar.f233979p && this.f233980q == qfVar.f233980q && this.f233981r == qfVar.f233981r && this.f233982s == qfVar.f233982s && this.f233983t == qfVar.f233983t && this.f233984u == qfVar.f233984u && this.f233985v == qfVar.f233985v && this.f233986w == qfVar.f233986w && this.f233987x == qfVar.f233987x && this.f233988y == qfVar.f233988y && this.f233989z == qfVar.f233989z && kotlin.jvm.internal.o.b(this.A, qfVar.A) && this.B == qfVar.B && kotlin.jvm.internal.o.b(this.C, qfVar.C) && kotlin.jvm.internal.o.b(this.D, qfVar.D) && kotlin.jvm.internal.o.b(this.E, qfVar.E) && this.F == qfVar.F && kotlin.jvm.internal.o.b(this.G, qfVar.G);
    }

    public int hashCode() {
        java.lang.Long l17 = this.f233970d;
        int hashCode = (l17 == null ? 0 : l17.hashCode()) * 31;
        java.lang.String str = this.f233971e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.Long l18 = this.f233972f;
        int hashCode3 = (((((((((((((((((((((((((((((((((((hashCode2 + (l18 == null ? 0 : l18.hashCode())) * 31) + java.lang.Integer.hashCode(this.f233973g)) * 31) + java.lang.Boolean.hashCode(this.f233974h)) * 31) + java.lang.Integer.hashCode(this.f233975i)) * 31) + java.lang.Integer.hashCode(this.f233976m)) * 31) + java.lang.Integer.hashCode(this.f233977n)) * 31) + java.lang.Integer.hashCode(this.f233978o)) * 31) + java.lang.Long.hashCode(this.f233979p)) * 31) + java.lang.Long.hashCode(this.f233980q)) * 31) + java.lang.Long.hashCode(this.f233981r)) * 31) + java.lang.Long.hashCode(this.f233982s)) * 31) + java.lang.Boolean.hashCode(this.f233983t)) * 31) + java.lang.Boolean.hashCode(this.f233984u)) * 31) + java.lang.Long.hashCode(this.f233985v)) * 31) + this.f233986w.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f233987x)) * 31) + java.lang.Boolean.hashCode(this.f233988y)) * 31) + java.lang.Long.hashCode(this.f233989z)) * 31;
        java.lang.String str2 = this.A;
        int hashCode4 = (((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + java.lang.Integer.hashCode(this.B)) * 31;
        java.lang.String str3 = this.C;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.D;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        java.lang.String str5 = this.E;
        return ((((hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.F)) * 31) + this.G.hashCode();
    }

    public java.lang.String toString() {
        return "FinderLiveVisitorMicReplayData(liveId=" + this.f233970d + ", micId=" + this.f233971e + ", objectId=" + this.f233972f + ", minMicDuration=" + this.f233973g + ", haveChangeLiveMode=" + this.f233974h + ", beginLiveMode=" + this.f233975i + ", beginLiveSubMode=" + this.f233976m + ", curLiveMode=" + this.f233977n + ", curLiveSubMode=" + this.f233978o + ", duration=" + this.f233979p + ", uv=" + this.f233980q + ", heatCount=" + this.f233981r + ", likeCount=" + this.f233982s + ", enableGenerateReplay=" + this.f233983t + ", enableGenerateKTVReplay=" + this.f233984u + ", songsCount=" + this.f233985v + ", curStatus=" + this.f233986w + ", isVisitorMicReplayReplayVisible=" + this.f233987x + ", isVisitorLastConnectingMic=" + this.f233988y + ", visitorLastConnectingMicTime=" + this.f233989z + ", selfHeadUrl=" + this.A + ", selfRoleType=" + this.B + ", selfNickname=" + this.C + ", anchorHeadUrl=" + this.D + ", anchorNickname=" + this.E + ", isPurchaseMic=" + this.F + ", micReplayInfoList=" + this.G + ')';
    }
}
