package zx5;

/* loaded from: classes13.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final by5.l0 f477228a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f477229b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f477230c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f477231d;

    /* renamed from: e, reason: collision with root package name */
    public int f477232e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f477233f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f477234g;

    /* renamed from: h, reason: collision with root package name */
    public final int f477235h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f477236i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f477237j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f477238k;

    /* renamed from: l, reason: collision with root package name */
    public final int f477239l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f477240m;

    /* renamed from: n, reason: collision with root package name */
    public final dy5.a f477241n;

    public f(by5.l0 l0Var, boolean z17, java.lang.String str, boolean z18, int i17, java.lang.String str2, java.lang.String str3, int i18, java.lang.String str4, boolean z19, boolean z27, java.lang.String str5, int i19, java.lang.String str6, dy5.a aVar) {
        this.f477228a = l0Var;
        this.f477229b = z17;
        this.f477230c = str;
        this.f477231d = z18;
        this.f477232e = i17;
        this.f477233f = str2;
        this.f477234g = str3;
        this.f477235h = i18;
        this.f477236i = str4;
        this.f477237j = z19;
        this.f477238k = str5;
        this.f477239l = i19;
        this.f477240m = str6;
        this.f477241n = aVar;
        if (a()) {
            return;
        }
        by5.c4.c("UpdateConfig", toString());
        throw new java.lang.RuntimeException("invalid update config");
    }

    public boolean a() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        if ((this.f477229b && ((str3 = this.f477230c) == null || str3.isEmpty())) || (str = this.f477234g) == null || str.isEmpty() || this.f477235h == -1) {
            return false;
        }
        return (this.f477229b && this.f477231d && ((str2 = this.f477233f) == null || str2.isEmpty())) ? false : true;
    }

    public java.lang.String b() {
        java.lang.String str;
        if (!a()) {
            throw new java.lang.RuntimeException("invalid update config");
        }
        boolean z17 = this.f477231d;
        int i17 = this.f477235h;
        if (!z17) {
            dy5.a aVar = this.f477241n;
            return (aVar == null || dy5.a.SEVEN_ZIP != aVar) ? by5.z3.e(i17) : by5.z3.c(i17);
        }
        int i18 = this.f477239l;
        if (i18 != 1 && i18 != 2) {
            throw new java.lang.RuntimeException("invalid patchType in updateConfig");
        }
        if (by5.z3.r(i17)) {
            str = by5.z3.n(i17) + java.io.File.separator + "zip";
        } else if (by5.z3.a(i17)) {
            by5.c4.f("XWebFileUtil", "getDownloadPatchPath, version:" + i17 + ", use new data dir");
            str = by5.z3.p(i17) + java.io.File.separator + "zip";
        } else {
            str = by5.z3.n(i17) + java.io.File.separator + "zip";
        }
        java.io.File file = new java.io.File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        if (i18 == 1) {
            return str + java.io.File.separator + "patch.zip";
        }
        if (i18 != 2) {
            by5.c4.c("XWebFileUtil", "invalid patchType in updateConfig");
            return "";
        }
        return str + java.io.File.separator + "hpatch.zip";
    }

    public java.lang.String toString() {
        return "UpdateConfig{needCheckMd5=" + this.f477229b + ", downloadFileMd5='" + this.f477230c + "', isPatchUpdate=" + this.f477231d + ", nPatchTargetVersion=" + this.f477232e + ", patchEndFileMd5='" + this.f477233f + "', downUrl='" + this.f477234g + "', apkVer=" + this.f477235h + ", fullPackageType=" + this.f477241n + '}';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f(zx5.e r17) {
        /*
            r16 = this;
            r0 = r17
            r17.getClass()
            r1 = 0
            boolean r2 = r0.f477218a
            r3 = 0
            r17.getClass()
            boolean r4 = r0.f477219b
            int r5 = r0.f477220c
            java.lang.String r6 = r0.f477221d
            java.lang.String r7 = r0.f477222e
            int r8 = r0.f477223f
            r9 = 0
            r10 = 0
            r11 = 0
            java.lang.String r12 = r0.f477224g
            int r13 = r0.f477225h
            r14 = 0
            dy5.a r15 = r0.f477226i
            r0 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zx5.f.<init>(zx5.e):void");
    }
}
