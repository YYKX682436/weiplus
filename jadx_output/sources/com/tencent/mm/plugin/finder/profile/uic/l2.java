package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class l2 {
    public r45.v31 A;
    public r45.c32 B;
    public r45.h23 C;
    public com.tencent.mm.protocal.protobuf.FinderJumpInfo D;
    public r45.x13 E;
    public r45.fr2 F;
    public r45.q13 G;

    /* renamed from: a, reason: collision with root package name */
    public int f123912a;

    /* renamed from: b, reason: collision with root package name */
    public int f123913b;

    /* renamed from: c, reason: collision with root package name */
    public int f123914c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f123915d;

    /* renamed from: e, reason: collision with root package name */
    public r45.h32 f123916e;

    /* renamed from: f, reason: collision with root package name */
    public r45.c33 f123917f;

    /* renamed from: g, reason: collision with root package name */
    public r45.fw0 f123918g;

    /* renamed from: h, reason: collision with root package name */
    public r45.e21 f123919h;

    /* renamed from: i, reason: collision with root package name */
    public m92.i f123920i;

    /* renamed from: j, reason: collision with root package name */
    public r45.t13 f123921j;

    /* renamed from: k, reason: collision with root package name */
    public r45.v23 f123922k;

    /* renamed from: l, reason: collision with root package name */
    public r45.j32 f123923l;

    /* renamed from: m, reason: collision with root package name */
    public java.util.List f123924m;

    /* renamed from: n, reason: collision with root package name */
    public r45.ah1 f123925n;

    /* renamed from: o, reason: collision with root package name */
    public r45.dc1 f123926o;

    /* renamed from: p, reason: collision with root package name */
    public r45.sf2 f123927p;

    /* renamed from: q, reason: collision with root package name */
    public r45.dc1 f123928q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.FinderJumpInfo f123929r;

    /* renamed from: s, reason: collision with root package name */
    public r45.er2 f123930s;

    /* renamed from: t, reason: collision with root package name */
    public r45.cj2 f123931t;

    /* renamed from: u, reason: collision with root package name */
    public r45.vr0 f123932u;

    /* renamed from: v, reason: collision with root package name */
    public r45.ah2 f123933v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f123934w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f123935x;

    /* renamed from: y, reason: collision with root package name */
    public int f123936y;

    /* renamed from: z, reason: collision with root package name */
    public r45.a23 f123937z;

    public l2(int i17, int i18, int i19, java.util.LinkedList linkedList, r45.h32 h32Var, r45.c33 c33Var, r45.fw0 fw0Var, r45.e21 e21Var, m92.i iVar, r45.t13 t13Var, r45.v23 v23Var, r45.j32 j32Var, java.util.List list, r45.ah1 ah1Var, r45.dc1 dc1Var, r45.sf2 sf2Var, r45.dc1 dc1Var2, com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo, r45.er2 er2Var, r45.cj2 cj2Var, r45.vr0 vr0Var, r45.ah2 ah2Var, boolean z17, boolean z18, int i27, r45.a23 a23Var, r45.v31 v31Var, r45.c32 c32Var, r45.h23 h23Var, com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo2, r45.x13 x13Var, r45.fr2 fr2Var, r45.q13 q13Var, int i28, int i29, kotlin.jvm.internal.i iVar2) {
        int i37 = (i28 & 1) != 0 ? -1 : i17;
        int i38 = (i28 & 2) != 0 ? -1 : i18;
        int i39 = (i28 & 4) == 0 ? i19 : -1;
        java.util.LinkedList userTags = (i28 & 8) != 0 ? new java.util.LinkedList() : linkedList;
        r45.h32 h32Var2 = (i28 & 16) != 0 ? null : h32Var;
        r45.c33 c33Var2 = (i28 & 32) != 0 ? null : c33Var;
        r45.fw0 fw0Var2 = (i28 & 64) != 0 ? null : fw0Var;
        r45.e21 e21Var2 = (i28 & 128) != 0 ? null : e21Var;
        m92.i iVar3 = (i28 & 256) != 0 ? null : iVar;
        r45.t13 t13Var2 = (i28 & 512) != 0 ? null : t13Var;
        r45.v23 v23Var2 = (i28 & 1024) != 0 ? null : v23Var;
        r45.j32 j32Var2 = (i28 & 2048) != 0 ? null : j32Var;
        java.util.List list2 = (i28 & 4096) != 0 ? null : list;
        r45.ah1 ah1Var2 = (i28 & 8192) != 0 ? null : ah1Var;
        r45.dc1 dc1Var3 = (i28 & 16384) != 0 ? null : dc1Var;
        r45.sf2 sf2Var2 = (i28 & 32768) != 0 ? null : sf2Var;
        r45.dc1 dc1Var4 = (i28 & 65536) != 0 ? null : dc1Var2;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo3 = (i28 & 131072) != 0 ? null : finderJumpInfo;
        r45.er2 er2Var2 = (i28 & 262144) != 0 ? null : er2Var;
        r45.cj2 cj2Var2 = (i28 & 524288) != 0 ? null : cj2Var;
        r45.vr0 vr0Var2 = (i28 & 1048576) != 0 ? null : vr0Var;
        r45.ah2 ah2Var2 = (i28 & 2097152) != 0 ? null : ah2Var;
        boolean z19 = (i28 & 4194304) != 0 ? false : z17;
        boolean z27 = (i28 & 8388608) != 0 ? false : z18;
        int i47 = (i28 & com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62) != 0 ? 0 : i27;
        r45.a23 a23Var2 = (i28 & com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCHighTierLevel62) != 0 ? null : a23Var;
        r45.v31 v31Var2 = (i28 & 67108864) != 0 ? null : v31Var;
        r45.c32 c32Var2 = (i28 & 134217728) != 0 ? null : c32Var;
        r45.h23 h23Var2 = (i28 & 268435456) != 0 ? null : h23Var;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo4 = (i28 & com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : finderJumpInfo2;
        r45.x13 x13Var2 = (i28 & 1073741824) != 0 ? null : x13Var;
        r45.fr2 fr2Var2 = (i28 & Integer.MIN_VALUE) != 0 ? null : fr2Var;
        r45.q13 q13Var2 = (i29 & 1) != 0 ? null : q13Var;
        kotlin.jvm.internal.o.g(userTags, "userTags");
        this.f123912a = i37;
        this.f123913b = i38;
        this.f123914c = i39;
        this.f123915d = userTags;
        this.f123916e = h32Var2;
        this.f123917f = c33Var2;
        this.f123918g = fw0Var2;
        this.f123919h = e21Var2;
        this.f123920i = iVar3;
        this.f123921j = t13Var2;
        this.f123922k = v23Var2;
        this.f123923l = j32Var2;
        this.f123924m = list2;
        this.f123925n = ah1Var2;
        this.f123926o = dc1Var3;
        this.f123927p = sf2Var2;
        this.f123928q = dc1Var4;
        this.f123929r = finderJumpInfo3;
        this.f123930s = er2Var2;
        this.f123931t = cj2Var2;
        this.f123932u = vr0Var2;
        this.f123933v = ah2Var2;
        this.f123934w = z19;
        this.f123935x = z27;
        this.f123936y = i47;
        this.f123937z = a23Var2;
        this.A = v31Var2;
        this.B = c32Var2;
        this.C = h23Var2;
        this.D = finderJumpInfo4;
        this.E = x13Var2;
        this.F = fr2Var2;
        this.G = q13Var2;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.profile.uic.l2)) {
            return false;
        }
        com.tencent.mm.plugin.finder.profile.uic.l2 l2Var = (com.tencent.mm.plugin.finder.profile.uic.l2) obj;
        return this.f123912a == l2Var.f123912a && this.f123913b == l2Var.f123913b && this.f123914c == l2Var.f123914c && kotlin.jvm.internal.o.b(this.f123915d, l2Var.f123915d) && kotlin.jvm.internal.o.b(this.f123916e, l2Var.f123916e) && kotlin.jvm.internal.o.b(this.f123917f, l2Var.f123917f) && kotlin.jvm.internal.o.b(this.f123918g, l2Var.f123918g) && kotlin.jvm.internal.o.b(this.f123919h, l2Var.f123919h) && kotlin.jvm.internal.o.b(this.f123920i, l2Var.f123920i) && kotlin.jvm.internal.o.b(this.f123921j, l2Var.f123921j) && kotlin.jvm.internal.o.b(this.f123922k, l2Var.f123922k) && kotlin.jvm.internal.o.b(this.f123923l, l2Var.f123923l) && kotlin.jvm.internal.o.b(this.f123924m, l2Var.f123924m) && kotlin.jvm.internal.o.b(this.f123925n, l2Var.f123925n) && kotlin.jvm.internal.o.b(this.f123926o, l2Var.f123926o) && kotlin.jvm.internal.o.b(this.f123927p, l2Var.f123927p) && kotlin.jvm.internal.o.b(this.f123928q, l2Var.f123928q) && kotlin.jvm.internal.o.b(this.f123929r, l2Var.f123929r) && kotlin.jvm.internal.o.b(this.f123930s, l2Var.f123930s) && kotlin.jvm.internal.o.b(this.f123931t, l2Var.f123931t) && kotlin.jvm.internal.o.b(this.f123932u, l2Var.f123932u) && kotlin.jvm.internal.o.b(this.f123933v, l2Var.f123933v) && this.f123934w == l2Var.f123934w && this.f123935x == l2Var.f123935x && this.f123936y == l2Var.f123936y && kotlin.jvm.internal.o.b(this.f123937z, l2Var.f123937z) && kotlin.jvm.internal.o.b(this.A, l2Var.A) && kotlin.jvm.internal.o.b(this.B, l2Var.B) && kotlin.jvm.internal.o.b(this.C, l2Var.C) && kotlin.jvm.internal.o.b(this.D, l2Var.D) && kotlin.jvm.internal.o.b(this.E, l2Var.E) && kotlin.jvm.internal.o.b(this.F, l2Var.F) && kotlin.jvm.internal.o.b(this.G, l2Var.G);
    }

    public int hashCode() {
        int hashCode = ((((((java.lang.Integer.hashCode(this.f123912a) * 31) + java.lang.Integer.hashCode(this.f123913b)) * 31) + java.lang.Integer.hashCode(this.f123914c)) * 31) + this.f123915d.hashCode()) * 31;
        r45.h32 h32Var = this.f123916e;
        int hashCode2 = (hashCode + (h32Var == null ? 0 : h32Var.hashCode())) * 31;
        r45.c33 c33Var = this.f123917f;
        int hashCode3 = (hashCode2 + (c33Var == null ? 0 : c33Var.hashCode())) * 31;
        r45.fw0 fw0Var = this.f123918g;
        int hashCode4 = (hashCode3 + (fw0Var == null ? 0 : fw0Var.hashCode())) * 31;
        r45.e21 e21Var = this.f123919h;
        int hashCode5 = (hashCode4 + (e21Var == null ? 0 : e21Var.hashCode())) * 31;
        m92.i iVar = this.f123920i;
        int hashCode6 = (hashCode5 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        r45.t13 t13Var = this.f123921j;
        int hashCode7 = (hashCode6 + (t13Var == null ? 0 : t13Var.hashCode())) * 31;
        r45.v23 v23Var = this.f123922k;
        int hashCode8 = (hashCode7 + (v23Var == null ? 0 : v23Var.hashCode())) * 31;
        r45.j32 j32Var = this.f123923l;
        int hashCode9 = (hashCode8 + (j32Var == null ? 0 : j32Var.hashCode())) * 31;
        java.util.List list = this.f123924m;
        int hashCode10 = (hashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        r45.ah1 ah1Var = this.f123925n;
        int hashCode11 = (hashCode10 + (ah1Var == null ? 0 : ah1Var.hashCode())) * 31;
        r45.dc1 dc1Var = this.f123926o;
        int hashCode12 = (hashCode11 + (dc1Var == null ? 0 : dc1Var.hashCode())) * 31;
        r45.sf2 sf2Var = this.f123927p;
        int hashCode13 = (hashCode12 + (sf2Var == null ? 0 : sf2Var.hashCode())) * 31;
        r45.dc1 dc1Var2 = this.f123928q;
        int hashCode14 = (hashCode13 + (dc1Var2 == null ? 0 : dc1Var2.hashCode())) * 31;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = this.f123929r;
        int hashCode15 = (hashCode14 + (finderJumpInfo == null ? 0 : finderJumpInfo.hashCode())) * 31;
        r45.er2 er2Var = this.f123930s;
        int hashCode16 = (hashCode15 + (er2Var == null ? 0 : er2Var.hashCode())) * 31;
        r45.cj2 cj2Var = this.f123931t;
        int hashCode17 = (hashCode16 + (cj2Var == null ? 0 : cj2Var.hashCode())) * 31;
        r45.vr0 vr0Var = this.f123932u;
        int hashCode18 = (hashCode17 + (vr0Var == null ? 0 : vr0Var.hashCode())) * 31;
        r45.ah2 ah2Var = this.f123933v;
        int hashCode19 = (((((((hashCode18 + (ah2Var == null ? 0 : ah2Var.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f123934w)) * 31) + java.lang.Boolean.hashCode(this.f123935x)) * 31) + java.lang.Integer.hashCode(this.f123936y)) * 31;
        r45.a23 a23Var = this.f123937z;
        int hashCode20 = (hashCode19 + (a23Var == null ? 0 : a23Var.hashCode())) * 31;
        r45.v31 v31Var = this.A;
        int hashCode21 = (hashCode20 + (v31Var == null ? 0 : v31Var.hashCode())) * 31;
        r45.c32 c32Var = this.B;
        int hashCode22 = (hashCode21 + (c32Var == null ? 0 : c32Var.hashCode())) * 31;
        r45.h23 h23Var = this.C;
        int hashCode23 = (hashCode22 + (h23Var == null ? 0 : h23Var.hashCode())) * 31;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo2 = this.D;
        int hashCode24 = (hashCode23 + (finderJumpInfo2 == null ? 0 : finderJumpInfo2.hashCode())) * 31;
        r45.x13 x13Var = this.E;
        int hashCode25 = (hashCode24 + (x13Var == null ? 0 : x13Var.hashCode())) * 31;
        r45.fr2 fr2Var = this.F;
        int hashCode26 = (hashCode25 + (fr2Var == null ? 0 : fr2Var.hashCode())) * 31;
        r45.q13 q13Var = this.G;
        return hashCode26 + (q13Var != null ? q13Var.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "UserExtInfo(friendFollowCount=" + this.f123912a + ", fansCount=" + this.f123913b + ", originCount=" + this.f123914c + ", userTags=" + this.f123915d + ", finderLiveNoticInfo=" + this.f123916e + ", shopInfo=" + this.f123917f + ", bizInfo=" + this.f123918g + ", eventInfo=" + this.f123919h + ", logOutInfo=" + this.f123920i + ", poiInfo=" + this.f123921j + ", weComInfo=" + this.f123922k + ", finderLiveNoticeListInfo=" + this.f123923l + ", jumpInfo=" + this.f123924m + ", liveAnchorStat=" + this.f123925n + ", ipRegionInfo=" + this.f123926o + ", mcnInfo=" + this.f123927p + ", attrRegionInfo=" + this.f123928q + ", productInfo=" + this.f123929r + ", profileBanner=" + this.f123930s + ", radio=" + this.f123931t + ", memberZoneHomeInfo=" + this.f123932u + ", mileStone=" + this.f123933v + ", lockFlag=" + this.f123934w + ", mvObjectMoveFlag=" + this.f123935x + ", memberStatus=" + this.f123936y + ", signatureFoldInfo=" + this.f123937z + ", nickanmeUpdateInfo=" + this.A + ", nextLiveNotificationInfo=" + this.B + ", protectInfo=" + this.C + ", searchJumpInfo=" + this.D + ", recentUpdateInfo=" + this.E + ", profileData=" + this.F + ", promotionAdsInfo=" + this.G + ')';
    }
}
