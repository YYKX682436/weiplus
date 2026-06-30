package zv1;

/* loaded from: classes15.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final zv1.d f476359a;

    /* renamed from: b, reason: collision with root package name */
    public final long f476360b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f476361c;

    /* renamed from: d, reason: collision with root package name */
    public long f476362d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f476363e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.wcdb.support.CancellationSignal f476364f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f476365g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f476366h;

    public r(zv1.d cleaner, long j17, boolean z17, long j18, java.util.List exemptFiles, com.tencent.wcdb.support.CancellationSignal cancellationSignal, boolean z18, boolean z19) {
        kotlin.jvm.internal.o.g(cleaner, "cleaner");
        kotlin.jvm.internal.o.g(exemptFiles, "exemptFiles");
        this.f476359a = cleaner;
        this.f476360b = j17;
        this.f476361c = z17;
        this.f476362d = j18;
        this.f476363e = exemptFiles;
        this.f476364f = cancellationSignal;
        this.f476365g = z18;
        this.f476366h = z19;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zv1.r)) {
            return false;
        }
        zv1.r rVar = (zv1.r) obj;
        return kotlin.jvm.internal.o.b(this.f476359a, rVar.f476359a) && this.f476360b == rVar.f476360b && this.f476361c == rVar.f476361c && this.f476362d == rVar.f476362d && kotlin.jvm.internal.o.b(this.f476363e, rVar.f476363e) && kotlin.jvm.internal.o.b(this.f476364f, rVar.f476364f) && this.f476365g == rVar.f476365g && this.f476366h == rVar.f476366h;
    }

    public int hashCode() {
        int hashCode = ((((((((this.f476359a.hashCode() * 31) + java.lang.Long.hashCode(this.f476360b)) * 31) + java.lang.Boolean.hashCode(this.f476361c)) * 31) + java.lang.Long.hashCode(this.f476362d)) * 31) + this.f476363e.hashCode()) * 31;
        com.tencent.wcdb.support.CancellationSignal cancellationSignal = this.f476364f;
        return ((((hashCode + (cancellationSignal == null ? 0 : cancellationSignal.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f476365g)) * 31) + java.lang.Boolean.hashCode(this.f476366h);
    }

    public java.lang.String toString() {
        return "CleanCacheContinuation(cleaner=" + this.f476359a + ", expectCleanSize=" + this.f476360b + ", withDirs=" + this.f476361c + ", exemptCleanSize=" + this.f476362d + ", exemptFiles=" + this.f476363e + ", cs=" + this.f476364f + ", debugMode=" + this.f476365g + ", dryRun=" + this.f476366h + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public r(zv1.d r14, long r15, boolean r17, long r18, java.util.List r20, com.tencent.wcdb.support.CancellationSignal r21, boolean r22, boolean r23, int r24, kotlin.jvm.internal.i r25) {
        /*
            r13 = this;
            r0 = r24
            r1 = r0 & 2
            if (r1 == 0) goto L9
            r1 = -1
            goto La
        L9:
            r1 = r15
        La:
            r3 = r0 & 4
            java.lang.String r4 = "0"
            java.lang.String r5 = "1"
            java.lang.Class<e42.e0> r6 = e42.e0.class
            java.lang.Class<zv1.f1> r7 = zv1.f1.class
            if (r3 == 0) goto L3f
            int r3 = zv1.f1.f476299w1
            i95.m r3 = i95.n0.c(r7)
            zv1.f1 r3 = (zv1.f1) r3
            yv1.h r3 = (yv1.h) r3
            r3.getClass()
            boolean r3 = zv1.s.f476367f
            i95.m r3 = i95.n0.c(r6)
            e42.e0 r3 = (e42.e0) r3
            boolean r8 = zv1.s.f476369h
            if (r8 == 0) goto L31
            r8 = r5
            goto L32
        L31:
            r8 = r4
        L32:
            h62.d r3 = (h62.d) r3
            java.lang.String r9 = "clicfg_auto_clean_cache_with_dirs"
            java.lang.String r3 = r3.aj(r9, r8)
            boolean r3 = kotlin.jvm.internal.o.b(r3, r5)
            goto L41
        L3f:
            r3 = r17
        L41:
            r8 = r0 & 8
            if (r8 == 0) goto L48
            r8 = 0
            goto L4a
        L48:
            r8 = r18
        L4a:
            r10 = r0 & 16
            if (r10 == 0) goto L51
            kz5.p0 r10 = kz5.p0.f313996d
            goto L53
        L51:
            r10 = r20
        L53:
            r11 = r0 & 32
            if (r11 == 0) goto L59
            r11 = 0
            goto L5b
        L59:
            r11 = r21
        L5b:
            r12 = r0 & 64
            if (r12 == 0) goto L86
            int r12 = zv1.f1.f476299w1
            i95.m r7 = i95.n0.c(r7)
            zv1.f1 r7 = (zv1.f1) r7
            yv1.h r7 = (yv1.h) r7
            r7.getClass()
            boolean r7 = zv1.s.f476367f
            i95.m r6 = i95.n0.c(r6)
            e42.e0 r6 = (e42.e0) r6
            boolean r7 = zv1.s.f476368g
            if (r7 == 0) goto L79
            r4 = r5
        L79:
            h62.d r6 = (h62.d) r6
            java.lang.String r7 = "clicfg_auto_clean_cache_debug_mode"
            java.lang.String r4 = r6.aj(r7, r4)
            boolean r4 = kotlin.jvm.internal.o.b(r4, r5)
            goto L88
        L86:
            r4 = r22
        L88:
            r0 = r0 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L8e
            r0 = 0
            goto L90
        L8e:
            r0 = r23
        L90:
            r15 = r13
            r16 = r14
            r17 = r1
            r19 = r3
            r20 = r8
            r22 = r10
            r23 = r11
            r24 = r4
            r25 = r0
            r15.<init>(r16, r17, r19, r20, r22, r23, r24, r25)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zv1.r.<init>(zv1.d, long, boolean, long, java.util.List, com.tencent.wcdb.support.CancellationSignal, boolean, boolean, int, kotlin.jvm.internal.i):void");
    }
}
