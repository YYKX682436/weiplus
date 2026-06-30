package km2;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f309051a;

    /* renamed from: b, reason: collision with root package name */
    public final int f309052b;

    /* renamed from: c, reason: collision with root package name */
    public final long f309053c;

    /* renamed from: d, reason: collision with root package name */
    public final int f309054d;

    /* renamed from: e, reason: collision with root package name */
    public final long f309055e;

    /* renamed from: f, reason: collision with root package name */
    public final int f309056f;

    /* renamed from: g, reason: collision with root package name */
    public final int f309057g;

    /* renamed from: h, reason: collision with root package name */
    public final long f309058h;

    /* renamed from: i, reason: collision with root package name */
    public final int f309059i;

    /* renamed from: j, reason: collision with root package name */
    public final long f309060j;

    /* renamed from: k, reason: collision with root package name */
    public final long f309061k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f309062l;

    /* renamed from: m, reason: collision with root package name */
    public final long f309063m;

    /* renamed from: n, reason: collision with root package name */
    public final long f309064n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f309065o;

    /* renamed from: p, reason: collision with root package name */
    public final int f309066p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.protocal.protobuf.FinderJumpInfo f309067q;

    /* renamed from: r, reason: collision with root package name */
    public final int f309068r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.protocal.protobuf.FinderJumpInfo f309069s;

    /* renamed from: t, reason: collision with root package name */
    public r45.nw1 f309070t;

    /* renamed from: u, reason: collision with root package name */
    public final r45.sl1 f309071u;

    /* renamed from: v, reason: collision with root package name */
    public final r45.l71 f309072v;

    /* renamed from: w, reason: collision with root package name */
    public r45.pf2 f309073w;

    public b(int i17, int i18, long j17, int i19, long j18, int i27, int i28, long j19, int i29, long j27, long j28, boolean z17, long j29, long j37, java.util.LinkedList linkedList, int i37, com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo, int i38, com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo2, r45.nw1 nw1Var, r45.sl1 sl1Var, r45.l71 l71Var, r45.pf2 pf2Var, int i39, kotlin.jvm.internal.i iVar) {
        int i47 = (i39 & 1) != 0 ? 0 : i17;
        int i48 = (i39 & 2) != 0 ? 0 : i18;
        long j38 = (i39 & 4) != 0 ? 0L : j17;
        int i49 = (i39 & 8) != 0 ? 0 : i19;
        long j39 = (i39 & 16) != 0 ? 0L : j18;
        int i57 = (i39 & 32) != 0 ? 0 : i27;
        int i58 = (i39 & 64) != 0 ? 0 : i28;
        long j47 = (i39 & 128) != 0 ? 0L : j19;
        int i59 = (i39 & 256) != 0 ? 0 : i29;
        long j48 = (i39 & 512) != 0 ? 0L : j27;
        long j49 = (i39 & 1024) != 0 ? 0L : j28;
        boolean z18 = (i39 & 2048) != 0 ? false : z17;
        long j57 = (i39 & 4096) != 0 ? 0L : j29;
        long j58 = (i39 & 8192) != 0 ? 0L : j37;
        java.util.LinkedList jumpInfos = (i39 & 16384) != 0 ? new java.util.LinkedList() : linkedList;
        int i66 = (i39 & 32768) != 0 ? 0 : i37;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo3 = (i39 & 65536) != 0 ? null : finderJumpInfo;
        int i67 = (i39 & 131072) != 0 ? 0 : i38;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo4 = (i39 & 262144) != 0 ? null : finderJumpInfo2;
        r45.nw1 nw1Var2 = (i39 & 524288) != 0 ? null : nw1Var;
        r45.sl1 sl1Var2 = (i39 & 1048576) != 0 ? null : sl1Var;
        r45.l71 l71Var2 = (i39 & 2097152) != 0 ? null : l71Var;
        r45.pf2 pf2Var2 = (i39 & 4194304) != 0 ? null : pf2Var;
        kotlin.jvm.internal.o.g(jumpInfos, "jumpInfos");
        this.f309051a = i47;
        this.f309052b = i48;
        this.f309053c = j38;
        this.f309054d = i49;
        this.f309055e = j39;
        this.f309056f = i57;
        this.f309057g = i58;
        this.f309058h = j47;
        this.f309059i = i59;
        this.f309060j = j48;
        this.f309061k = j49;
        this.f309062l = z18;
        this.f309063m = j57;
        this.f309064n = j58;
        this.f309065o = jumpInfos;
        this.f309066p = i66;
        this.f309067q = finderJumpInfo3;
        this.f309068r = i67;
        this.f309069s = finderJumpInfo4;
        this.f309070t = nw1Var2;
        this.f309071u = sl1Var2;
        this.f309072v = l71Var2;
        this.f309073w = pf2Var2;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof km2.b)) {
            return false;
        }
        km2.b bVar = (km2.b) obj;
        return this.f309051a == bVar.f309051a && this.f309052b == bVar.f309052b && this.f309053c == bVar.f309053c && this.f309054d == bVar.f309054d && this.f309055e == bVar.f309055e && this.f309056f == bVar.f309056f && this.f309057g == bVar.f309057g && this.f309058h == bVar.f309058h && this.f309059i == bVar.f309059i && this.f309060j == bVar.f309060j && this.f309061k == bVar.f309061k && this.f309062l == bVar.f309062l && this.f309063m == bVar.f309063m && this.f309064n == bVar.f309064n && kotlin.jvm.internal.o.b(this.f309065o, bVar.f309065o) && this.f309066p == bVar.f309066p && kotlin.jvm.internal.o.b(this.f309067q, bVar.f309067q) && this.f309068r == bVar.f309068r && kotlin.jvm.internal.o.b(this.f309069s, bVar.f309069s) && kotlin.jvm.internal.o.b(this.f309070t, bVar.f309070t) && kotlin.jvm.internal.o.b(this.f309071u, bVar.f309071u) && kotlin.jvm.internal.o.b(this.f309072v, bVar.f309072v) && kotlin.jvm.internal.o.b(this.f309073w, bVar.f309073w);
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((((((((java.lang.Integer.hashCode(this.f309051a) * 31) + java.lang.Integer.hashCode(this.f309052b)) * 31) + java.lang.Long.hashCode(this.f309053c)) * 31) + java.lang.Integer.hashCode(this.f309054d)) * 31) + java.lang.Long.hashCode(this.f309055e)) * 31) + java.lang.Integer.hashCode(this.f309056f)) * 31) + java.lang.Integer.hashCode(this.f309057g)) * 31) + java.lang.Long.hashCode(this.f309058h)) * 31) + java.lang.Integer.hashCode(this.f309059i)) * 31) + java.lang.Long.hashCode(this.f309060j)) * 31) + java.lang.Long.hashCode(this.f309061k)) * 31) + java.lang.Boolean.hashCode(this.f309062l)) * 31) + java.lang.Long.hashCode(this.f309063m)) * 31) + java.lang.Long.hashCode(this.f309064n)) * 31) + this.f309065o.hashCode()) * 31) + java.lang.Integer.hashCode(this.f309066p)) * 31;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = this.f309067q;
        int hashCode2 = (((hashCode + (finderJumpInfo == null ? 0 : finderJumpInfo.hashCode())) * 31) + java.lang.Integer.hashCode(this.f309068r)) * 31;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo2 = this.f309069s;
        int hashCode3 = (hashCode2 + (finderJumpInfo2 == null ? 0 : finderJumpInfo2.hashCode())) * 31;
        r45.nw1 nw1Var = this.f309070t;
        int hashCode4 = (hashCode3 + (nw1Var == null ? 0 : nw1Var.hashCode())) * 31;
        r45.sl1 sl1Var = this.f309071u;
        int hashCode5 = (hashCode4 + (sl1Var == null ? 0 : sl1Var.hashCode())) * 31;
        r45.l71 l71Var = this.f309072v;
        int hashCode6 = (hashCode5 + (l71Var == null ? 0 : l71Var.hashCode())) * 31;
        r45.pf2 pf2Var = this.f309073w;
        return hashCode6 + (pf2Var != null ? pf2Var.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "AnchorFinishInfo(duration=" + this.f309051a + ", audienceNum=" + this.f309052b + ", likeCount=" + this.f309053c + ", newFans=" + this.f309054d + ", wecoinHot=" + this.f309055e + ", maxOnlineCnt=" + this.f309056f + ", avgDuration=" + this.f309057g + ", totalGift=" + this.f309058h + ", bizLiveNewFansNum=" + this.f309059i + ",replayPrivilege:" + this.f309066p + ')';
    }
}
