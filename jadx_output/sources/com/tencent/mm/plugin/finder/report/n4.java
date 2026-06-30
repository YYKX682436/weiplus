package com.tencent.mm.plugin.finder.report;

/* loaded from: classes2.dex */
public final class n4 {

    /* renamed from: r0 */
    public static final com.tencent.mm.plugin.finder.report.l4 f125151r0 = new com.tencent.mm.plugin.finder.report.l4(null);
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public long F;
    public int G;
    public int H;
    public int I;

    /* renamed from: J */
    public long f125152J;
    public long K;
    public long L;
    public long M;
    public long N;
    public int O;
    public int P;
    public java.lang.String Q;
    public java.util.Vector R;
    public int S;
    public int T;
    public java.lang.String U;
    public int V;
    public int W;
    public java.lang.String X;
    public so2.j5 Y;
    public int Z;

    /* renamed from: a */
    public final long f125153a;

    /* renamed from: a0 */
    public bb2.a f125154a0;

    /* renamed from: b */
    public final java.lang.String f125155b;

    /* renamed from: b0 */
    public java.util.Vector f125156b0;

    /* renamed from: c */
    public final long f125157c;

    /* renamed from: c0 */
    public final java.util.LinkedList f125158c0;

    /* renamed from: d */
    public final com.tencent.mm.plugin.finder.storage.FinderItem f125159d;

    /* renamed from: d0 */
    public int f125160d0;

    /* renamed from: e */
    public final in5.v0 f125161e;

    /* renamed from: e0 */
    public long f125162e0;

    /* renamed from: f */
    public final boolean f125163f;

    /* renamed from: f0 */
    public long f125164f0;

    /* renamed from: g */
    public final kw2.m0 f125165g;

    /* renamed from: g0 */
    public long f125166g0;

    /* renamed from: h */
    public long f125167h;

    /* renamed from: h0 */
    public int f125168h0;

    /* renamed from: i */
    public int f125169i;

    /* renamed from: i0 */
    public int f125170i0;

    /* renamed from: j */
    public int f125171j;

    /* renamed from: j0 */
    public java.lang.String f125172j0;

    /* renamed from: k */
    public long f125173k;

    /* renamed from: k0 */
    public int f125174k0;

    /* renamed from: l */
    public long[] f125175l;

    /* renamed from: l0 */
    public int f125176l0;

    /* renamed from: m */
    public long[] f125177m;

    /* renamed from: m0 */
    public int f125178m0;

    /* renamed from: n */
    public int[] f125179n;

    /* renamed from: n0 */
    public int f125180n0;

    /* renamed from: o */
    public int[] f125181o;

    /* renamed from: o0 */
    public r45.i16 f125182o0;

    /* renamed from: p */
    public int f125183p;

    /* renamed from: p0 */
    public java.util.LinkedList f125184p0;

    /* renamed from: q */
    public int f125185q;

    /* renamed from: q0 */
    public final java.util.concurrent.atomic.AtomicInteger f125186q0;

    /* renamed from: r */
    public int f125187r;

    /* renamed from: s */
    public int f125188s;

    /* renamed from: t */
    public int f125189t;

    /* renamed from: u */
    public int f125190u;

    /* renamed from: v */
    public int f125191v;

    /* renamed from: w */
    public final java.util.List f125192w;

    /* renamed from: x */
    public int f125193x;

    /* renamed from: y */
    public int f125194y;

    /* renamed from: z */
    public int f125195z;

    public n4(long j17, java.lang.String str, long j18, com.tencent.mm.plugin.finder.storage.FinderItem finderItem, in5.v0 v0Var, boolean z17, kw2.m0 m0Var) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap;
        kw2.d0 d0Var;
        java.util.LinkedList<r45.mb4> mediaList;
        java.util.LinkedList<r45.mb4> mediaList2;
        java.util.LinkedList<r45.mb4> mediaList3;
        java.util.LinkedList<r45.mb4> mediaList4;
        this.f125153a = j17;
        this.f125155b = str;
        this.f125157c = j18;
        this.f125159d = finderItem;
        this.f125161e = v0Var;
        this.f125163f = z17;
        this.f125165g = m0Var;
        this.f125167h = c01.id.c();
        int max = java.lang.Math.max((finderItem == null || (mediaList4 = finderItem.getMediaList()) == null) ? 0 : mediaList4.size(), 9);
        long[] jArr = new long[max];
        for (int i17 = 0; i17 < max; i17++) {
            jArr[i17] = 0;
        }
        this.f125175l = jArr;
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem2 = this.f125159d;
        int max2 = java.lang.Math.max((finderItem2 == null || (mediaList3 = finderItem2.getMediaList()) == null) ? 0 : mediaList3.size(), 9);
        long[] jArr2 = new long[max2];
        for (int i18 = 0; i18 < max2; i18++) {
            jArr2[i18] = 0;
        }
        this.f125177m = jArr2;
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem3 = this.f125159d;
        int max3 = java.lang.Math.max((finderItem3 == null || (mediaList2 = finderItem3.getMediaList()) == null) ? 0 : mediaList2.size(), 9);
        int[] iArr = new int[max3];
        for (int i19 = 0; i19 < max3; i19++) {
            iArr[i19] = 0;
        }
        this.f125179n = iArr;
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem4 = this.f125159d;
        int max4 = java.lang.Math.max((finderItem4 == null || (mediaList = finderItem4.getMediaList()) == null) ? 0 : mediaList.size(), 9);
        int[] iArr2 = new int[max4];
        for (int i27 = 0; i27 < max4; i27++) {
            iArr2[i27] = 0;
        }
        this.f125181o = iArr2;
        this.f125187r = 1;
        this.f125192w = new java.util.ArrayList();
        this.Q = "";
        this.R = new java.util.Vector();
        this.U = "";
        this.X = "";
        this.f125156b0 = new java.util.Vector();
        this.f125158c0 = new java.util.LinkedList();
        this.f125172j0 = "";
        this.f125184p0 = new java.util.LinkedList();
        this.f125186q0 = new java.util.concurrent.atomic.AtomicInteger(0);
        this.f125175l[0] = this.f125157c;
        kw2.m0 m0Var2 = this.f125165g;
        if (m0Var2 == null || (concurrentHashMap = m0Var2.f313059d) == null || (d0Var = (kw2.d0) concurrentHashMap.get(java.lang.Long.valueOf(this.f125153a))) == null) {
            return;
        }
        long j19 = this.f125157c;
        this.M = j19;
        if (d0Var.f312949x0) {
            this.K = j19;
        }
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("audio");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        this.S = ((android.media.AudioManager) systemService).getStreamVolume(3);
    }

    public static /* synthetic */ void L(com.tencent.mm.plugin.finder.report.n4 n4Var, kw2.m0 m0Var, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            m0Var = null;
        }
        n4Var.K(m0Var);
    }

    public final int[] A() {
        return this.f125181o;
    }

    public final int B() {
        return this.E;
    }

    public final java.util.Vector C() {
        return this.R;
    }

    public final long D() {
        return this.M;
    }

    public final long E() {
        return this.f125152J;
    }

    public final long F() {
        return this.K;
    }

    public final int G() {
        return this.f125190u;
    }

    public final long H() {
        return this.f125157c;
    }

    public final int I() {
        return this.f125178m0;
    }

    public final long[] J() {
        return this.f125177m;
    }

    public final void K(kw2.m0 m0Var) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap;
        kw2.d0 d0Var;
        int i17;
        int i18;
        java.util.LinkedList<r45.mb4> mediaList;
        r45.mb4 mb4Var;
        if (this.f125173k == 0) {
            this.f125173k = c01.id.c();
        }
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f125159d;
        int i19 = 0;
        this.W = (finderItem == null || (mediaList = finderItem.getMediaList()) == null || (mb4Var = (r45.mb4) kz5.n0.Z(mediaList)) == null) ? 0 : mb4Var.getInteger(3);
        this.N = this.f125173k - this.f125157c;
        if (m0Var == null || (concurrentHashMap = m0Var.f313059d) == null || (d0Var = (kw2.d0) concurrentHashMap.get(java.lang.Long.valueOf(this.f125153a))) == null) {
            return;
        }
        long j17 = this.M;
        if (j17 != 0) {
            this.L += this.f125173k - j17;
        }
        long j18 = this.K;
        if (j18 != 0) {
            this.f125152J += this.f125173k - j18;
        }
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("audio");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        this.T = ((android.media.AudioManager) systemService).getStreamVolume(3);
        java.lang.Object systemService2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("audio");
        kotlin.jvm.internal.o.e(systemService2, "null cannot be cast to non-null type android.media.AudioManager");
        int streamMaxVolume = ((android.media.AudioManager) systemService2).getStreamMaxVolume(3);
        int i27 = this.S != this.T ? 1 : 0;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append((this.S * 100) / streamMaxVolume);
        sb6.append('#');
        sb6.append((this.T * 100) / streamMaxVolume);
        sb6.append('#');
        sb6.append(i27);
        this.U = sb6.toString();
        this.V = ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).ik();
        java.util.Vector vector = this.R;
        synchronized (vector) {
            java.util.Iterator it = vector.iterator();
            while (it.hasNext()) {
                this.Q += ((java.lang.Integer) it.next()) + '#';
            }
        }
        java.lang.String str = cu2.x.c(cu2.x.f222449a, d0Var.f312910e, false, false, false, 14, null).field_fileFormat;
        if (str == null) {
            str = "";
        }
        com.tencent.mm.feature.sight.api.o oVar = (com.tencent.mm.feature.sight.api.o) i95.n0.c(com.tencent.mm.feature.sight.api.o.class);
        java.lang.String str2 = d0Var.f312916h;
        ((be0.e) oVar).getClass();
        com.tencent.mm.plugin.sight.base.b d17 = com.tencent.mm.plugin.sight.base.e.d(str2, true);
        if (d17 != null) {
            i19 = d17.f162383b;
            i18 = d17.f162388g;
            i17 = d17.f162386e;
        } else {
            i17 = 0;
            i18 = 0;
        }
        this.X = d0Var.f312945v0 + ';' + i19 + ';' + str + ';' + i18 + ';' + i17 + ';' + d0Var.f312953z0 + ';' + d0Var.A0 + ';';
        this.f125160d0 = d0Var.f312952z;
        this.f125162e0 = d0Var.Z;
        this.f125164f0 = d0Var.f312901J;
        this.f125166g0 = d0Var.I;
        this.f125168h0 = d0Var.f312936r;
        this.f125170i0 = d0Var.f312938s;
        this.f125172j0 = d0Var.f312939s0;
        this.f125174k0 = d0Var.D;
        this.f125176l0 = i19;
    }

    public final void M(bb2.a aVar) {
        this.f125154a0 = aVar;
    }

    public final void N(int i17) {
        this.f125193x = i17;
    }

    public final void O(int i17) {
        this.f125191v = i17;
    }

    public final void P(int i17) {
        this.f125195z = i17;
    }

    public final void Q(int i17) {
        this.f125194y = i17;
    }

    public final void R(int i17) {
        this.G = i17;
    }

    public final void S(int i17) {
        this.B = i17;
    }

    public final void T(int i17) {
        this.A = i17;
    }

    public final void U(int i17) {
        this.C = i17;
    }

    public final void V(int i17) {
        this.f125180n0 = i17;
    }

    public final void W(int i17) {
        this.D = i17;
    }

    public final void X(int i17) {
        this.H = i17;
    }

    public final void Y(int i17) {
        this.f125169i = i17;
    }

    public final void Z(int i17) {
        this.f125183p = i17;
    }

    public final com.tencent.mm.plugin.finder.report.n4 a() {
        com.tencent.mm.plugin.finder.report.n4 n4Var = new com.tencent.mm.plugin.finder.report.n4(this.f125153a, this.f125155b, this.f125157c, this.f125159d, this.f125161e, this.f125163f, this.f125165g);
        n4Var.f125167h = this.f125167h;
        n4Var.f125169i = this.f125169i;
        n4Var.f125171j = this.f125171j;
        n4Var.f125173k = this.f125173k;
        n4Var.f125175l = this.f125175l;
        n4Var.f125177m = this.f125177m;
        n4Var.f125179n = this.f125179n;
        n4Var.f125181o = this.f125181o;
        n4Var.f125183p = this.f125183p;
        n4Var.f125185q = this.f125185q;
        n4Var.f125187r = this.f125187r;
        n4Var.f125188s = this.f125188s;
        n4Var.f125189t = this.f125189t;
        n4Var.f125190u = this.f125190u;
        n4Var.f125191v = this.f125191v;
        n4Var.f125193x = this.f125193x;
        n4Var.f125194y = this.f125194y;
        n4Var.f125195z = this.f125195z;
        n4Var.A = this.A;
        n4Var.B = this.B;
        n4Var.C = this.C;
        n4Var.D = this.D;
        n4Var.E = this.E;
        n4Var.G = this.G;
        n4Var.H = this.H;
        n4Var.I = this.I;
        n4Var.f125152J = this.f125152J;
        n4Var.K = this.K;
        n4Var.L = this.L;
        n4Var.M = this.M;
        n4Var.N = this.N;
        n4Var.O = this.O;
        n4Var.P = this.P;
        n4Var.Q = this.Q;
        n4Var.R = this.R;
        n4Var.S = this.S;
        n4Var.T = this.T;
        n4Var.U = this.U;
        n4Var.V = this.V;
        n4Var.W = this.W;
        n4Var.Z = this.Z;
        n4Var.f125156b0 = this.f125156b0;
        n4Var.f125178m0 = this.f125178m0;
        return n4Var;
    }

    public final void a0(long j17) {
        this.F = j17;
    }

    public final bb2.a b() {
        return this.f125154a0;
    }

    public final void b0(int i17) {
        this.Z = i17;
    }

    public final long[] c() {
        return this.f125175l;
    }

    public final void c0(int i17) {
        this.f125187r = i17;
    }

    public final int d() {
        return this.f125193x;
    }

    public final void d0(int i17) {
        this.f125188s = i17;
    }

    public final int e() {
        return this.f125191v;
    }

    public final void e0(int i17) {
        this.f125189t = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.report.n4)) {
            return false;
        }
        com.tencent.mm.plugin.finder.report.n4 n4Var = (com.tencent.mm.plugin.finder.report.n4) obj;
        return this.f125153a == n4Var.f125153a && kotlin.jvm.internal.o.b(this.f125155b, n4Var.f125155b) && this.f125157c == n4Var.f125157c && kotlin.jvm.internal.o.b(this.f125159d, n4Var.f125159d) && kotlin.jvm.internal.o.b(this.f125161e, n4Var.f125161e) && this.f125163f == n4Var.f125163f && kotlin.jvm.internal.o.b(this.f125165g, n4Var.f125165g);
    }

    public final int f() {
        return this.f125195z;
    }

    public final void f0(int i17) {
        this.f125185q = i17;
    }

    public final int g() {
        return this.f125194y;
    }

    public final void g0(r45.i16 i16Var) {
        this.f125182o0 = i16Var;
    }

    public final int h() {
        return this.G;
    }

    public final void h0(int i17) {
        this.I = i17;
    }

    public int hashCode() {
        int hashCode = java.lang.Long.hashCode(this.f125153a) * 31;
        java.lang.String str = this.f125155b;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Long.hashCode(this.f125157c)) * 31;
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f125159d;
        int hashCode3 = (hashCode2 + (finderItem == null ? 0 : finderItem.hashCode())) * 31;
        in5.v0 v0Var = this.f125161e;
        int hashCode4 = (((hashCode3 + (v0Var == null ? 0 : v0Var.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f125163f)) * 31;
        kw2.m0 m0Var = this.f125165g;
        return hashCode4 + (m0Var != null ? m0Var.hashCode() : 0);
    }

    public final int i() {
        return this.B;
    }

    public final void i0(int i17) {
        this.O = i17;
    }

    public final int j() {
        return this.A;
    }

    public final void j0(int i17) {
        this.E = i17;
    }

    public final int k() {
        return this.C;
    }

    public final void k0(long j17) {
        this.L = j17;
    }

    public final int l() {
        return this.f125180n0;
    }

    public final void l0(long j17) {
        this.M = j17;
    }

    public final java.util.List m() {
        return this.f125192w;
    }

    public final void m0(int i17) {
        this.f125171j = i17;
    }

    public final int n() {
        return this.D;
    }

    public final void n0(long j17) {
        this.f125152J = j17;
    }

    public final int o() {
        return this.H;
    }

    public final void o0(long j17) {
        this.K = j17;
    }

    public final java.lang.String p() {
        return this.f125155b;
    }

    public final void p0(so2.j5 j5Var) {
        this.Y = j5Var;
    }

    public final com.tencent.mm.plugin.finder.storage.FinderItem q() {
        return this.f125159d;
    }

    public final void q0(int i17) {
        this.P = i17;
    }

    public final long r() {
        return this.f125153a;
    }

    public final void r0(int i17) {
        this.f125190u = i17;
    }

    public final int s() {
        return this.f125183p;
    }

    public final void s0(int i17) {
        this.f125178m0 = i17;
    }

    public final long t() {
        return this.F;
    }

    public final void t0(java.util.LinkedList linkedList) {
        kotlin.jvm.internal.o.g(linkedList, "<set-?>");
        this.f125184p0 = linkedList;
    }

    public java.lang.String toString() {
        return "FinderSingleFeedRecord(feedId=" + this.f125153a + ", dupFlag=" + this.f125155b + ", startTime=" + this.f125157c + ", feed=" + this.f125159d + ", showInfo=" + this.f125161e + ", isCenterFeed=" + this.f125163f + ", videoPlayReporter=" + this.f125165g + ')';
    }

    public final int u() {
        return this.f125187r;
    }

    public final int v() {
        return this.f125188s;
    }

    public final int w() {
        return this.f125189t;
    }

    public final int x() {
        return this.f125185q;
    }

    public final int y() {
        return this.I;
    }

    public final int[] z() {
        return this.f125179n;
    }

    public /* synthetic */ n4(long j17, java.lang.String str, long j18, com.tencent.mm.plugin.finder.storage.FinderItem finderItem, in5.v0 v0Var, boolean z17, kw2.m0 m0Var, int i17, kotlin.jvm.internal.i iVar) {
        this(j17, str, j18, finderItem, (i17 & 16) != 0 ? null : v0Var, (i17 & 32) != 0 ? false : z17, (i17 & 64) != 0 ? null : m0Var);
    }
}
