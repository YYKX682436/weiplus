package ri;

/* loaded from: classes16.dex */
public final class j0 {
    public final java.lang.String A;
    public final int B;
    public final int C;
    public final java.lang.String D;
    public final java.lang.String E;
    public final int F;
    public final int G;

    /* renamed from: a, reason: collision with root package name */
    public final int f395867a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f395868b;

    /* renamed from: c, reason: collision with root package name */
    public final int f395869c;

    /* renamed from: d, reason: collision with root package name */
    public final int f395870d;

    /* renamed from: e, reason: collision with root package name */
    public final long f395871e;

    /* renamed from: f, reason: collision with root package name */
    public final long f395872f;

    /* renamed from: g, reason: collision with root package name */
    public final long f395873g;

    /* renamed from: h, reason: collision with root package name */
    public final int f395874h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f395875i;

    /* renamed from: j, reason: collision with root package name */
    public final int f395876j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f395877k;

    /* renamed from: l, reason: collision with root package name */
    public final int f395878l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f395879m;

    /* renamed from: n, reason: collision with root package name */
    public final long f395880n;

    /* renamed from: o, reason: collision with root package name */
    public final long f395881o;

    /* renamed from: p, reason: collision with root package name */
    public final long f395882p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f395883q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f395884r;

    /* renamed from: s, reason: collision with root package name */
    public final int f395885s;

    /* renamed from: t, reason: collision with root package name */
    public final int f395886t;

    /* renamed from: u, reason: collision with root package name */
    public final int f395887u;

    /* renamed from: v, reason: collision with root package name */
    public final int f395888v;

    /* renamed from: w, reason: collision with root package name */
    public final int f395889w;

    /* renamed from: x, reason: collision with root package name */
    public final long f395890x;

    /* renamed from: y, reason: collision with root package name */
    public final java.lang.String f395891y;

    /* renamed from: z, reason: collision with root package name */
    public final java.lang.String f395892z;

    /* JADX WARN: Multi-variable type inference failed */
    public j0(int i17, java.lang.String str, int i18, int i19, long j17, long j18, long j19, int i27, java.lang.String str2, int i28, java.lang.String str3, int i29, java.lang.String str4, long j27, long j28, long j29, java.lang.String str5, java.lang.String str6, int i37, int i38, int i39, int i47, int i48, long j37, java.lang.String str7, java.lang.String str8, java.lang.String str9, int i49, int i57, java.lang.String str10, java.lang.String str11, int i58, int i59, int i66, int i67, kotlin.jvm.internal.i iVar) {
        java.lang.String process;
        int i68;
        int i69;
        int i76;
        java.lang.String systemMemInfo;
        long j38;
        java.lang.String str12;
        java.lang.String buildTag;
        java.lang.String buildRevision;
        int i77 = (i66 & 1) != 0 ? 0 : i17;
        if ((i66 & 2) != 0) {
            process = bm5.f1.a();
            kotlin.jvm.internal.o.f(process, "getProcessName(...)");
        } else {
            process = str;
        }
        if ((i66 & 4) != 0) {
            com.tencent.matrix.lifecycle.supervisor.d0.f52834k.getClass();
            i68 = com.tencent.matrix.lifecycle.supervisor.d0.f52830g.active();
        } else {
            i68 = i18;
        }
        if ((i66 & 8) != 0) {
            java.lang.String str13 = com.tencent.matrix.lifecycle.owners.f0.f52719a;
            i69 = com.tencent.matrix.lifecycle.owners.f0.f52739u;
        } else {
            i69 = i19;
        }
        long j39 = (i66 & 16) != 0 ? 0L : j17;
        long j47 = (i66 & 32) != 0 ? 0L : j18;
        long j48 = (i66 & 64) != 0 ? 0L : j19;
        int i78 = (i66 & 128) != 0 ? 0 : i27;
        java.lang.String debugPssDetailK = (i66 & 256) != 0 ? "" : str2;
        int i79 = (i66 & 512) != 0 ? 0 : i28;
        java.lang.String amsPssDetailK = (i66 & 1024) != 0 ? "" : str3;
        int i86 = i79;
        int i87 = (i66 & 2048) != 0 ? 0 : i29;
        java.lang.String allProcessPssDetailK = (i66 & 4096) != 0 ? "" : str4;
        int i88 = i78;
        long j49 = (i66 & 8192) != 0 ? 0L : j27;
        long j57 = (i66 & 16384) != 0 ? 0L : j28;
        long j58 = (32768 & i66) != 0 ? 0L : j29;
        java.lang.String recentActivity = (65536 & i66) != 0 ? "" : str5;
        long j59 = j48;
        java.lang.String leakActivity = (i66 & 131072) != 0 ? "" : str6;
        int i89 = (262144 & i66) != 0 ? 0 : i37;
        int i96 = (i66 & 524288) != 0 ? 0 : i38;
        int i97 = (i66 & 1048576) != 0 ? 0 : i39;
        int i98 = (i66 & 2097152) != 0 ? 0 : i47;
        int i99 = (i66 & 4194304) != 0 ? com.tencent.mm.sdk.platformtools.z.f193115k ? 1 : 0 : i48;
        long j66 = (i66 & 8388608) != 0 ? 0L : j37;
        if ((i66 & com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62) != 0) {
            i76 = i89;
            systemMemInfo = "";
        } else {
            i76 = i89;
            systemMemInfo = str7;
        }
        long j67 = j47;
        java.lang.String processState = (i66 & com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCHighTierLevel62) != 0 ? "" : str8;
        java.lang.String str14 = (67108864 & i66) != 0 ? "" : str9;
        int i100 = (i66 & 134217728) != 0 ? 0 : i49;
        int i101 = (i66 & 268435456) != 0 ? 0 : i57;
        if ((i66 & com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0) {
            str12 = str14;
            buildTag = com.tencent.mm.sdk.platformtools.z.f193105a;
            j38 = j39;
            kotlin.jvm.internal.o.f(buildTag, "BUILD_TAG");
        } else {
            j38 = j39;
            str12 = str14;
            buildTag = str10;
        }
        if ((1073741824 & i66) != 0) {
            buildRevision = com.tencent.mm.sdk.platformtools.z.f193109e;
            kotlin.jvm.internal.o.f(buildRevision, "REV");
        } else {
            buildRevision = str11;
        }
        int i102 = (i66 & Integer.MIN_VALUE) != 0 ? 0 : i58;
        int myPid = (i67 & 1) != 0 ? android.os.Process.myPid() : i59;
        kotlin.jvm.internal.o.g(process, "process");
        kotlin.jvm.internal.o.g(debugPssDetailK, "debugPssDetailK");
        kotlin.jvm.internal.o.g(amsPssDetailK, "amsPssDetailK");
        kotlin.jvm.internal.o.g(allProcessPssDetailK, "allProcessPssDetailK");
        kotlin.jvm.internal.o.g(recentActivity, "recentActivity");
        kotlin.jvm.internal.o.g(leakActivity, "leakActivity");
        kotlin.jvm.internal.o.g(systemMemInfo, "systemMemInfo");
        kotlin.jvm.internal.o.g(processState, "processState");
        kotlin.jvm.internal.o.g(buildTag, "buildTag");
        kotlin.jvm.internal.o.g(buildRevision, "buildRevision");
        this.f395867a = i77;
        this.f395868b = process;
        this.f395869c = i68;
        this.f395870d = i69;
        this.f395871e = j38;
        this.f395872f = j67;
        this.f395873g = j59;
        this.f395874h = i88;
        this.f395875i = debugPssDetailK;
        this.f395876j = i86;
        this.f395877k = amsPssDetailK;
        this.f395878l = i87;
        this.f395879m = allProcessPssDetailK;
        this.f395880n = j49;
        this.f395881o = j57;
        this.f395882p = j58;
        this.f395883q = recentActivity;
        this.f395884r = leakActivity;
        this.f395885s = i76;
        this.f395886t = i96;
        this.f395887u = i97;
        this.f395888v = i98;
        this.f395889w = i99;
        this.f395890x = j66;
        this.f395891y = systemMemInfo;
        this.f395892z = processState;
        this.A = str12;
        this.B = i100;
        this.C = i101;
        this.D = buildTag;
        this.E = buildRevision;
        this.F = i102;
        this.G = myPid;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ri.j0)) {
            return false;
        }
        ri.j0 j0Var = (ri.j0) obj;
        return this.f395867a == j0Var.f395867a && kotlin.jvm.internal.o.b(this.f395868b, j0Var.f395868b) && this.f395869c == j0Var.f395869c && this.f395870d == j0Var.f395870d && this.f395871e == j0Var.f395871e && this.f395872f == j0Var.f395872f && this.f395873g == j0Var.f395873g && this.f395874h == j0Var.f395874h && kotlin.jvm.internal.o.b(this.f395875i, j0Var.f395875i) && this.f395876j == j0Var.f395876j && kotlin.jvm.internal.o.b(this.f395877k, j0Var.f395877k) && this.f395878l == j0Var.f395878l && kotlin.jvm.internal.o.b(this.f395879m, j0Var.f395879m) && this.f395880n == j0Var.f395880n && this.f395881o == j0Var.f395881o && this.f395882p == j0Var.f395882p && kotlin.jvm.internal.o.b(this.f395883q, j0Var.f395883q) && kotlin.jvm.internal.o.b(this.f395884r, j0Var.f395884r) && this.f395885s == j0Var.f395885s && this.f395886t == j0Var.f395886t && this.f395887u == j0Var.f395887u && this.f395888v == j0Var.f395888v && this.f395889w == j0Var.f395889w && this.f395890x == j0Var.f395890x && kotlin.jvm.internal.o.b(this.f395891y, j0Var.f395891y) && kotlin.jvm.internal.o.b(this.f395892z, j0Var.f395892z) && kotlin.jvm.internal.o.b(this.A, j0Var.A) && this.B == j0Var.B && this.C == j0Var.C && kotlin.jvm.internal.o.b(this.D, j0Var.D) && kotlin.jvm.internal.o.b(this.E, j0Var.E) && this.F == j0Var.F && this.G == j0Var.G;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((((((((((((((((((((((((((((java.lang.Integer.hashCode(this.f395867a) * 31) + this.f395868b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f395869c)) * 31) + java.lang.Integer.hashCode(this.f395870d)) * 31) + java.lang.Long.hashCode(this.f395871e)) * 31) + java.lang.Long.hashCode(this.f395872f)) * 31) + java.lang.Long.hashCode(this.f395873g)) * 31) + java.lang.Integer.hashCode(this.f395874h)) * 31) + this.f395875i.hashCode()) * 31) + java.lang.Integer.hashCode(this.f395876j)) * 31) + this.f395877k.hashCode()) * 31) + java.lang.Integer.hashCode(this.f395878l)) * 31) + this.f395879m.hashCode()) * 31) + java.lang.Long.hashCode(this.f395880n)) * 31) + java.lang.Long.hashCode(this.f395881o)) * 31) + java.lang.Long.hashCode(this.f395882p)) * 31) + this.f395883q.hashCode()) * 31) + this.f395884r.hashCode()) * 31) + java.lang.Integer.hashCode(this.f395885s)) * 31) + java.lang.Integer.hashCode(this.f395886t)) * 31) + java.lang.Integer.hashCode(this.f395887u)) * 31) + java.lang.Integer.hashCode(this.f395888v)) * 31) + java.lang.Integer.hashCode(this.f395889w)) * 31) + java.lang.Long.hashCode(this.f395890x)) * 31) + this.f395891y.hashCode()) * 31) + this.f395892z.hashCode()) * 31;
        java.lang.String str = this.A;
        return ((((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Integer.hashCode(this.B)) * 31) + java.lang.Integer.hashCode(this.C)) * 31) + this.D.hashCode()) * 31) + this.E.hashCode()) * 31) + java.lang.Integer.hashCode(this.F)) * 31) + java.lang.Integer.hashCode(this.G);
    }

    public java.lang.String toString() {
        return "Data(type=" + this.f395867a + ", process='" + this.f395868b + "', appForeground=" + this.f395869c + ", processForeground=" + this.f395870d + ", javaHeapByte=" + this.f395871e + ", nativeHeapByte=" + this.f395872f + ", vmSizeK=" + this.f395873g + ", debugPssK=" + this.f395874h + ", debugPssDetailK='" + this.f395875i + "', amsPssK=" + this.f395876j + ", amsPssDetailK='" + this.f395877k + "', allProcessPssSumK=" + this.f395878l + ", allProcessPssDetailK='" + this.f395879m + "', vmRss=" + this.f395880n + ", vmSwap=" + this.f395881o + ", threads=" + this.f395882p + ", recentActivity='" + this.f395883q + "', leakActivity='" + this.f395884r + "', activityLeakAnalyseEnable=" + this.f395885s + ", hasHprof=" + this.f395886t + ", memHookEnable=" + this.f395887u + ", hasSmaps=" + this.f395888v + ", is64bit=" + this.f395889w + ", bgDuration=" + this.f395890x + ", systemMemInfo='" + this.f395891y + "', processState='" + this.f395892z + "', extra=" + this.A + ", debugGraphicPssK=" + this.B + ", amsGraphicPssK=" + this.C + ", buildTag='" + this.D + "', buildRevision='" + this.E + "', hasDumpsysMemInfo=" + this.F + ", pid=" + this.G + ')';
    }
}
