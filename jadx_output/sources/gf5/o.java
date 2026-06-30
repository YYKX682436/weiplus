package gf5;

/* loaded from: classes11.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final double f271423a;

    /* renamed from: b, reason: collision with root package name */
    public final double f271424b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f271425c;

    /* renamed from: d, reason: collision with root package name */
    public final double f271426d;

    /* renamed from: e, reason: collision with root package name */
    public final double f271427e;

    /* renamed from: f, reason: collision with root package name */
    public final double f271428f;

    /* renamed from: g, reason: collision with root package name */
    public final double f271429g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f271430h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f271431i;

    public o(double d17, double d18, java.util.List tokenWeights, double d19, double d27, double d28, double d29, java.util.List textPatternBonuses, java.util.List tokenCountBonuses) {
        kotlin.jvm.internal.o.g(tokenWeights, "tokenWeights");
        kotlin.jvm.internal.o.g(textPatternBonuses, "textPatternBonuses");
        kotlin.jvm.internal.o.g(tokenCountBonuses, "tokenCountBonuses");
        this.f271423a = d17;
        this.f271424b = d18;
        this.f271425c = tokenWeights;
        this.f271426d = d19;
        this.f271427e = d27;
        this.f271428f = d28;
        this.f271429g = d29;
        this.f271430h = textPatternBonuses;
        this.f271431i = tokenCountBonuses;
    }

    public static gf5.o a(gf5.o oVar, double d17, double d18, java.util.List list, double d19, double d27, double d28, double d29, java.util.List list2, java.util.List list3, int i17, java.lang.Object obj) {
        double d37 = (i17 & 1) != 0 ? oVar.f271423a : d17;
        double d38 = (i17 & 2) != 0 ? oVar.f271424b : d18;
        java.util.List tokenWeights = (i17 & 4) != 0 ? oVar.f271425c : list;
        double d39 = (i17 & 8) != 0 ? oVar.f271426d : d19;
        double d47 = (i17 & 16) != 0 ? oVar.f271427e : d27;
        double d48 = (i17 & 32) != 0 ? oVar.f271428f : d28;
        double d49 = (i17 & 64) != 0 ? oVar.f271429g : d29;
        java.util.List textPatternBonuses = (i17 & 128) != 0 ? oVar.f271430h : list2;
        java.util.List tokenCountBonuses = (i17 & 256) != 0 ? oVar.f271431i : list3;
        oVar.getClass();
        kotlin.jvm.internal.o.g(tokenWeights, "tokenWeights");
        kotlin.jvm.internal.o.g(textPatternBonuses, "textPatternBonuses");
        kotlin.jvm.internal.o.g(tokenCountBonuses, "tokenCountBonuses");
        return new gf5.o(d37, d38, tokenWeights, d39, d47, d48, d49, textPatternBonuses, tokenCountBonuses);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf5.o)) {
            return false;
        }
        gf5.o oVar = (gf5.o) obj;
        return java.lang.Double.compare(this.f271423a, oVar.f271423a) == 0 && java.lang.Double.compare(this.f271424b, oVar.f271424b) == 0 && kotlin.jvm.internal.o.b(this.f271425c, oVar.f271425c) && java.lang.Double.compare(this.f271426d, oVar.f271426d) == 0 && java.lang.Double.compare(this.f271427e, oVar.f271427e) == 0 && java.lang.Double.compare(this.f271428f, oVar.f271428f) == 0 && java.lang.Double.compare(this.f271429g, oVar.f271429g) == 0 && kotlin.jvm.internal.o.b(this.f271430h, oVar.f271430h) && kotlin.jvm.internal.o.b(this.f271431i, oVar.f271431i);
    }

    public int hashCode() {
        return (((((((((((((((java.lang.Double.hashCode(this.f271423a) * 31) + java.lang.Double.hashCode(this.f271424b)) * 31) + this.f271425c.hashCode()) * 31) + java.lang.Double.hashCode(this.f271426d)) * 31) + java.lang.Double.hashCode(this.f271427e)) * 31) + java.lang.Double.hashCode(this.f271428f)) * 31) + java.lang.Double.hashCode(this.f271429g)) * 31) + this.f271430h.hashCode()) * 31) + this.f271431i.hashCode();
    }

    public java.lang.String toString() {
        return "LanguageDetectionProfile(coverageWeight=" + this.f271423a + ", defaultTokenWeight=" + this.f271424b + ", tokenWeights=" + this.f271425c + ", lowCoverageThreshold=" + this.f271426d + ", lowCoveragePenalty=" + this.f271427e + ", lowSpanDensityThreshold=" + this.f271428f + ", lowSpanDensityPenalty=" + this.f271429g + ", textPatternBonuses=" + this.f271430h + ", tokenCountBonuses=" + this.f271431i + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ o(double r17, double r19, java.util.List r21, double r22, double r24, double r26, double r28, java.util.List r30, java.util.List r31, int r32, kotlin.jvm.internal.i r33) {
        /*
            r16 = this;
            r0 = r32
            r1 = r0 & 1
            if (r1 == 0) goto L9
            r1 = 4638144666238189568(0x405e000000000000, double:120.0)
            goto Lb
        L9:
            r1 = r17
        Lb:
            r3 = r0 & 2
            if (r3 == 0) goto L12
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            goto L14
        L12:
            r3 = r19
        L14:
            r5 = r0 & 4
            kz5.p0 r6 = kz5.p0.f313996d
            if (r5 == 0) goto L1c
            r5 = r6
            goto L1e
        L1c:
            r5 = r21
        L1e:
            r7 = r0 & 8
            if (r7 == 0) goto L28
            r7 = 4590429028186199163(0x3fb47ae147ae147b, double:0.08)
            goto L2a
        L28:
            r7 = r22
        L2a:
            r9 = r0 & 16
            if (r9 == 0) goto L31
            r9 = 4633641066610819072(0x404e000000000000, double:60.0)
            goto L33
        L31:
            r9 = r24
        L33:
            r11 = r0 & 32
            if (r11 == 0) goto L3d
            r11 = 4572414629676717179(0x3f747ae147ae147b, double:0.005)
            goto L3f
        L3d:
            r11 = r26
        L3f:
            r13 = r0 & 64
            if (r13 == 0) goto L49
            r13 = 4630122629401935872(0x4041800000000000, double:35.0)
            goto L4b
        L49:
            r13 = r28
        L4b:
            r15 = r0 & 128(0x80, float:1.8E-43)
            if (r15 == 0) goto L51
            r15 = r6
            goto L53
        L51:
            r15 = r30
        L53:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L58
            goto L5a
        L58:
            r6 = r31
        L5a:
            r17 = r16
            r18 = r1
            r20 = r3
            r22 = r5
            r23 = r7
            r25 = r9
            r27 = r11
            r29 = r13
            r31 = r15
            r32 = r6
            r17.<init>(r18, r20, r22, r23, r25, r27, r29, r31, r32)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gf5.o.<init>(double, double, java.util.List, double, double, double, double, java.util.List, java.util.List, int, kotlin.jvm.internal.i):void");
    }
}
