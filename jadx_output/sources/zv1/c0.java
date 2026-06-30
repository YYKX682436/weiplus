package zv1;

/* loaded from: classes15.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.clean.cache.CacheClassifyType f476279a;

    /* renamed from: b, reason: collision with root package name */
    public final zv1.o f476280b;

    /* renamed from: c, reason: collision with root package name */
    public final long f476281c;

    /* renamed from: d, reason: collision with root package name */
    public final long f476282d;

    /* renamed from: e, reason: collision with root package name */
    public final long f476283e;

    /* renamed from: f, reason: collision with root package name */
    public final long f476284f;

    /* renamed from: g, reason: collision with root package name */
    public final long f476285g;

    /* renamed from: h, reason: collision with root package name */
    public final long f476286h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f476287i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.Map f476288j;

    public c0(com.tencent.mm.plugin.clean.cache.CacheClassifyType cacheType, zv1.o result, long j17, long j18, long j19, long j27, long j28, long j29, java.util.Map subtypeSizeBefore, java.util.Map subtypeSizeAfter) {
        kotlin.jvm.internal.o.g(cacheType, "cacheType");
        kotlin.jvm.internal.o.g(result, "result");
        kotlin.jvm.internal.o.g(subtypeSizeBefore, "subtypeSizeBefore");
        kotlin.jvm.internal.o.g(subtypeSizeAfter, "subtypeSizeAfter");
        this.f476279a = cacheType;
        this.f476280b = result;
        this.f476281c = j17;
        this.f476282d = j18;
        this.f476283e = j19;
        this.f476284f = j27;
        this.f476285g = j28;
        this.f476286h = j29;
        this.f476287i = subtypeSizeBefore;
        this.f476288j = subtypeSizeAfter;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zv1.c0)) {
            return false;
        }
        zv1.c0 c0Var = (zv1.c0) obj;
        return this.f476279a == c0Var.f476279a && this.f476280b == c0Var.f476280b && this.f476281c == c0Var.f476281c && this.f476282d == c0Var.f476282d && this.f476283e == c0Var.f476283e && this.f476284f == c0Var.f476284f && this.f476285g == c0Var.f476285g && this.f476286h == c0Var.f476286h && kotlin.jvm.internal.o.b(this.f476287i, c0Var.f476287i) && kotlin.jvm.internal.o.b(this.f476288j, c0Var.f476288j);
    }

    public int hashCode() {
        return (((((((((((((((((this.f476279a.hashCode() * 31) + this.f476280b.hashCode()) * 31) + java.lang.Long.hashCode(this.f476281c)) * 31) + java.lang.Long.hashCode(this.f476282d)) * 31) + java.lang.Long.hashCode(this.f476283e)) * 31) + java.lang.Long.hashCode(this.f476284f)) * 31) + java.lang.Long.hashCode(this.f476285g)) * 31) + java.lang.Long.hashCode(this.f476286h)) * 31) + this.f476287i.hashCode()) * 31) + this.f476288j.hashCode();
    }

    public java.lang.String toString() {
        return "CleanerReportData(cacheType=" + this.f476279a + ", result=" + this.f476280b + ", cacheTypeSize=" + this.f476281c + ", expectCleanSize=" + this.f476282d + ", returnCleanSize=" + this.f476283e + ", actualCleanSize=" + this.f476284f + ", exemptCleanSize=" + this.f476285g + ", duration=" + this.f476286h + ", subtypeSizeBefore=" + this.f476287i + ", subtypeSizeAfter=" + this.f476288j + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ c0(com.tencent.mm.plugin.clean.cache.CacheClassifyType r22, zv1.o r23, long r24, long r26, long r28, long r30, long r32, long r34, java.util.Map r36, java.util.Map r37, int r38, kotlin.jvm.internal.i r39) {
        /*
            r21 = this;
            r0 = r38
            r1 = r0 & 4
            r2 = 0
            if (r1 == 0) goto La
            r7 = r2
            goto Lc
        La:
            r7 = r24
        Lc:
            r1 = r0 & 8
            if (r1 == 0) goto L12
            r9 = r2
            goto L14
        L12:
            r9 = r26
        L14:
            r1 = r0 & 16
            if (r1 == 0) goto L1a
            r11 = r2
            goto L1c
        L1a:
            r11 = r28
        L1c:
            r1 = r0 & 32
            if (r1 == 0) goto L22
            r13 = r2
            goto L24
        L22:
            r13 = r30
        L24:
            r1 = r0 & 64
            if (r1 == 0) goto L2a
            r15 = r2
            goto L2c
        L2a:
            r15 = r32
        L2c:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L33
            r17 = r2
            goto L35
        L33:
            r17 = r34
        L35:
            r1 = r0 & 256(0x100, float:3.59E-43)
            kz5.q0 r2 = kz5.q0.f314001d
            if (r1 == 0) goto L3e
            r19 = r2
            goto L40
        L3e:
            r19 = r36
        L40:
            r0 = r0 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L47
            r20 = r2
            goto L49
        L47:
            r20 = r37
        L49:
            r4 = r21
            r5 = r22
            r6 = r23
            r4.<init>(r5, r6, r7, r9, r11, r13, r15, r17, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zv1.c0.<init>(com.tencent.mm.plugin.clean.cache.CacheClassifyType, zv1.o, long, long, long, long, long, long, java.util.Map, java.util.Map, int, kotlin.jvm.internal.i):void");
    }
}
