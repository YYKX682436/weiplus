package ml2;

/* loaded from: classes3.dex */
public final class f0 {
    public static final ml2.d0 A = new ml2.d0(null);

    /* renamed from: a, reason: collision with root package name */
    public final so2.j5 f327396a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f327397b;

    /* renamed from: c, reason: collision with root package name */
    public final int f327398c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f327399d;

    /* renamed from: e, reason: collision with root package name */
    public final long f327400e;

    /* renamed from: f, reason: collision with root package name */
    public final long f327401f;

    /* renamed from: g, reason: collision with root package name */
    public ml2.x1 f327402g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f327403h;

    /* renamed from: i, reason: collision with root package name */
    public final int f327404i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f327405j;

    /* renamed from: k, reason: collision with root package name */
    public final ml2.e0 f327406k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f327407l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f327408m;

    /* renamed from: n, reason: collision with root package name */
    public final int f327409n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f327410o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f327411p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f327412q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f327413r;

    /* renamed from: s, reason: collision with root package name */
    public final long f327414s;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f327415t;

    /* renamed from: u, reason: collision with root package name */
    public final int f327416u;

    /* renamed from: v, reason: collision with root package name */
    public final long f327417v;

    /* renamed from: w, reason: collision with root package name */
    public final int f327418w;

    /* renamed from: x, reason: collision with root package name */
    public final java.lang.String f327419x;

    /* renamed from: y, reason: collision with root package name */
    public final java.lang.String f327420y;

    /* renamed from: z, reason: collision with root package name */
    public final java.lang.Integer f327421z;

    public f0(so2.j5 j5Var, java.lang.String str, int i17, java.lang.String feedId, long j17, long j18, ml2.x1 actionType, java.lang.String commentscene, int i18, java.lang.String str2, ml2.e0 e0Var, boolean z17, boolean z18, int i19, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, long j19, java.lang.String str7, int i27, long j27, int i28, java.lang.String str8, java.lang.String str9, java.lang.Integer num, int i29, kotlin.jvm.internal.i iVar) {
        java.lang.String str10 = (i29 & 2) != 0 ? "" : str;
        int i37 = (i29 & 256) != 0 ? -1 : i18;
        java.lang.String nickName = (i29 & 512) != 0 ? "" : str2;
        ml2.e0 liveStatus = (i29 & 1024) != 0 ? ml2.e0.f327369d : e0Var;
        boolean z19 = (i29 & 2048) != 0 ? false : z17;
        boolean z27 = (i29 & 4096) != 0 ? false : z18;
        int i38 = (i29 & 8192) != 0 ? 0 : i19;
        java.lang.String clickTabContextId = (i29 & 16384) != 0 ? "" : str3;
        java.lang.String clickSubTabContextId = (32768 & i29) != 0 ? "" : str4;
        java.lang.String str11 = (i29 & 65536) != 0 ? "" : str5;
        java.lang.String str12 = (i29 & 131072) != 0 ? "" : str6;
        long j28 = (i29 & 262144) != 0 ? 0L : j19;
        java.lang.String str13 = (i29 & 524288) != 0 ? "" : str7;
        int i39 = (i29 & 1048576) != 0 ? 0 : i27;
        long j29 = (i29 & 2097152) != 0 ? 0L : j27;
        int i47 = (i29 & 4194304) != 0 ? 0 : i28;
        java.lang.String gmsgId = (i29 & 8388608) == 0 ? str8 : "";
        java.lang.String str14 = (i29 & com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62) != 0 ? null : str9;
        java.lang.Integer num2 = (i29 & com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCHighTierLevel62) != 0 ? 0 : num;
        kotlin.jvm.internal.o.g(feedId, "feedId");
        kotlin.jvm.internal.o.g(actionType, "actionType");
        kotlin.jvm.internal.o.g(commentscene, "commentscene");
        kotlin.jvm.internal.o.g(nickName, "nickName");
        kotlin.jvm.internal.o.g(liveStatus, "liveStatus");
        kotlin.jvm.internal.o.g(clickTabContextId, "clickTabContextId");
        kotlin.jvm.internal.o.g(clickSubTabContextId, "clickSubTabContextId");
        java.lang.Integer num3 = num2;
        java.lang.String chnlExtra = str11;
        kotlin.jvm.internal.o.g(chnlExtra, "chnlExtra");
        java.lang.String talkerUsername = str13;
        kotlin.jvm.internal.o.g(talkerUsername, "talkerUsername");
        kotlin.jvm.internal.o.g(gmsgId, "gmsgId");
        this.f327396a = j5Var;
        this.f327397b = str10;
        this.f327398c = i17;
        this.f327399d = feedId;
        this.f327400e = j17;
        this.f327401f = j18;
        this.f327402g = actionType;
        this.f327403h = commentscene;
        this.f327404i = i37;
        this.f327405j = nickName;
        this.f327406k = liveStatus;
        this.f327407l = z19;
        this.f327408m = z27;
        this.f327409n = i38;
        this.f327410o = clickTabContextId;
        this.f327411p = clickSubTabContextId;
        this.f327412q = str11;
        this.f327413r = str12;
        this.f327414s = j28;
        this.f327415t = talkerUsername;
        this.f327416u = i39;
        this.f327417v = j29;
        this.f327418w = i47;
        this.f327419x = gmsgId;
        this.f327420y = str14;
        this.f327421z = num3;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ml2.f0)) {
            return false;
        }
        ml2.f0 f0Var = (ml2.f0) obj;
        return kotlin.jvm.internal.o.b(this.f327396a, f0Var.f327396a) && kotlin.jvm.internal.o.b(this.f327397b, f0Var.f327397b) && this.f327398c == f0Var.f327398c && kotlin.jvm.internal.o.b(this.f327399d, f0Var.f327399d) && this.f327400e == f0Var.f327400e && this.f327401f == f0Var.f327401f && this.f327402g == f0Var.f327402g && kotlin.jvm.internal.o.b(this.f327403h, f0Var.f327403h) && this.f327404i == f0Var.f327404i && kotlin.jvm.internal.o.b(this.f327405j, f0Var.f327405j) && this.f327406k == f0Var.f327406k && this.f327407l == f0Var.f327407l && this.f327408m == f0Var.f327408m && this.f327409n == f0Var.f327409n && kotlin.jvm.internal.o.b(this.f327410o, f0Var.f327410o) && kotlin.jvm.internal.o.b(this.f327411p, f0Var.f327411p) && kotlin.jvm.internal.o.b(this.f327412q, f0Var.f327412q) && kotlin.jvm.internal.o.b(this.f327413r, f0Var.f327413r) && this.f327414s == f0Var.f327414s && kotlin.jvm.internal.o.b(this.f327415t, f0Var.f327415t) && this.f327416u == f0Var.f327416u && this.f327417v == f0Var.f327417v && this.f327418w == f0Var.f327418w && kotlin.jvm.internal.o.b(this.f327419x, f0Var.f327419x) && kotlin.jvm.internal.o.b(this.f327420y, f0Var.f327420y) && kotlin.jvm.internal.o.b(this.f327421z, f0Var.f327421z);
    }

    public int hashCode() {
        so2.j5 j5Var = this.f327396a;
        int hashCode = (j5Var == null ? 0 : j5Var.hashCode()) * 31;
        java.lang.String str = this.f327397b;
        int hashCode2 = (((((((((((((((((((((((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Integer.hashCode(this.f327398c)) * 31) + this.f327399d.hashCode()) * 31) + java.lang.Long.hashCode(this.f327400e)) * 31) + java.lang.Long.hashCode(this.f327401f)) * 31) + this.f327402g.hashCode()) * 31) + this.f327403h.hashCode()) * 31) + java.lang.Integer.hashCode(this.f327404i)) * 31) + this.f327405j.hashCode()) * 31) + this.f327406k.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f327407l)) * 31) + java.lang.Boolean.hashCode(this.f327408m)) * 31) + java.lang.Integer.hashCode(this.f327409n)) * 31) + this.f327410o.hashCode()) * 31) + this.f327411p.hashCode()) * 31) + this.f327412q.hashCode()) * 31;
        java.lang.String str2 = this.f327413r;
        int hashCode3 = (((((((((((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + java.lang.Long.hashCode(this.f327414s)) * 31) + this.f327415t.hashCode()) * 31) + java.lang.Integer.hashCode(this.f327416u)) * 31) + java.lang.Long.hashCode(this.f327417v)) * 31) + java.lang.Integer.hashCode(this.f327418w)) * 31) + this.f327419x.hashCode()) * 31;
        java.lang.String str3 = this.f327420y;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.Integer num = this.f327421z;
        return hashCode4 + (num != null ? num.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "HellLiveFeed(feed=" + this.f327396a + ", userName=" + this.f327397b + ", pos=" + this.f327398c + ", feedId=" + this.f327399d + ", feedIdL=" + this.f327400e + ", liveId=" + this.f327401f + ", actionType=" + this.f327402g + ", commentscene=" + this.f327403h + ", onlineNum=" + this.f327404i + ", nickName=" + this.f327405j + ", liveStatus=" + this.f327406k + ", isLiveCard=" + this.f327407l + ", isSingleLiveAvatar=" + this.f327408m + ", shareType=" + this.f327409n + ", clickTabContextId=" + this.f327410o + ", clickSubTabContextId=" + this.f327411p + ", chnlExtra=" + this.f327412q + ", fromUsername=" + this.f327413r + ", enterIconType=" + this.f327414s + ", talkerUsername=" + this.f327415t + ", fromFeedType=" + this.f327416u + ", fromFeedId=" + this.f327417v + ", fromCommentScene=" + this.f327418w + ", gmsgId=" + this.f327419x + ", contextId=" + this.f327420y + ", liveShareScene=" + this.f327421z + ')';
    }
}
