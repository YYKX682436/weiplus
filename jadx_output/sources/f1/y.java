package f1;

/* loaded from: classes14.dex */
public final class y extends f1.d {

    /* renamed from: p, reason: collision with root package name */
    public static final f1.v f258522p = new f1.v(null);

    /* renamed from: d, reason: collision with root package name */
    public final f1.a0 f258523d;

    /* renamed from: e, reason: collision with root package name */
    public final float f258524e;

    /* renamed from: f, reason: collision with root package name */
    public final float f258525f;

    /* renamed from: g, reason: collision with root package name */
    public final f1.z f258526g;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f258527h;

    /* renamed from: i, reason: collision with root package name */
    public final float[] f258528i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f258529j;

    /* renamed from: k, reason: collision with root package name */
    public final yz5.l f258530k;

    /* renamed from: l, reason: collision with root package name */
    public final yz5.l f258531l;

    /* renamed from: m, reason: collision with root package name */
    public final yz5.l f258532m;

    /* renamed from: n, reason: collision with root package name */
    public final yz5.l f258533n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f258534o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0201  */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public y(java.lang.String r29, float[] r30, f1.a0 r31, float[] r32, yz5.l r33, yz5.l r34, float r35, float r36, f1.z r37, int r38) {
        /*
            Method dump skipped, instructions count: 703
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.y.<init>(java.lang.String, float[], f1.a0, float[], yz5.l, yz5.l, float, float, f1.z, int):void");
    }

    @Override // f1.d
    public float[] a(float[] v17) {
        kotlin.jvm.internal.o.g(v17, "v");
        f1.e.h(this.f258529j, v17);
        f1.x xVar = (f1.x) this.f258531l;
        v17[0] = (float) ((java.lang.Number) xVar.invoke(java.lang.Double.valueOf(v17[0]))).doubleValue();
        v17[1] = (float) ((java.lang.Number) xVar.invoke(java.lang.Double.valueOf(v17[1]))).doubleValue();
        v17[2] = (float) ((java.lang.Number) xVar.invoke(java.lang.Double.valueOf(v17[2]))).doubleValue();
        return v17;
    }

    @Override // f1.d
    public float b(int i17) {
        return this.f258525f;
    }

    @Override // f1.d
    public float c(int i17) {
        return this.f258524e;
    }

    @Override // f1.d
    public boolean d() {
        return this.f258534o;
    }

    @Override // f1.d
    public float[] e(float[] v17) {
        kotlin.jvm.internal.o.g(v17, "v");
        f1.w wVar = (f1.w) this.f258533n;
        v17[0] = (float) ((java.lang.Number) wVar.invoke(java.lang.Double.valueOf(v17[0]))).doubleValue();
        v17[1] = (float) ((java.lang.Number) wVar.invoke(java.lang.Double.valueOf(v17[1]))).doubleValue();
        v17[2] = (float) ((java.lang.Number) wVar.invoke(java.lang.Double.valueOf(v17[2]))).doubleValue();
        f1.e.h(this.f258528i, v17);
        return v17;
    }

    @Override // f1.d
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !kotlin.jvm.internal.o.b(kotlin.jvm.internal.i0.a(f1.y.class), kotlin.jvm.internal.i0.a(obj.getClass())) || !super.equals(obj)) {
            return false;
        }
        f1.y yVar = (f1.y) obj;
        if (java.lang.Float.compare(yVar.f258524e, this.f258524e) != 0 || java.lang.Float.compare(yVar.f258525f, this.f258525f) != 0 || !kotlin.jvm.internal.o.b(this.f258523d, yVar.f258523d) || !java.util.Arrays.equals(this.f258527h, yVar.f258527h)) {
            return false;
        }
        f1.z zVar = yVar.f258526g;
        f1.z zVar2 = this.f258526g;
        if (zVar2 != null) {
            return kotlin.jvm.internal.o.b(zVar2, zVar);
        }
        if (zVar == null) {
            return true;
        }
        if (kotlin.jvm.internal.o.b(this.f258530k, yVar.f258530k)) {
            return kotlin.jvm.internal.o.b(this.f258532m, yVar.f258532m);
        }
        return false;
    }

    @Override // f1.d
    public int hashCode() {
        int hashCode = ((((super.hashCode() * 31) + this.f258523d.hashCode()) * 31) + java.util.Arrays.hashCode(this.f258527h)) * 31;
        float f17 = this.f258524e;
        int floatToIntBits = (hashCode + (!((f17 > 0.0f ? 1 : (f17 == 0.0f ? 0 : -1)) == 0) ? java.lang.Float.floatToIntBits(f17) : 0)) * 31;
        float f18 = this.f258525f;
        int floatToIntBits2 = (floatToIntBits + (!(f18 == 0.0f) ? java.lang.Float.floatToIntBits(f18) : 0)) * 31;
        f1.z zVar = this.f258526g;
        int hashCode2 = floatToIntBits2 + (zVar != null ? zVar.hashCode() : 0);
        return zVar == null ? (((hashCode2 * 31) + this.f258530k.hashCode()) * 31) + this.f258532m.hashCode() : hashCode2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public y(java.lang.String r16, float[] r17, f1.a0 r18, f1.z r19, int r20) {
        /*
            r15 = this;
            r9 = r19
            java.lang.String r0 = "name"
            r1 = r16
            kotlin.jvm.internal.o.g(r1, r0)
            java.lang.String r0 = "primaries"
            r2 = r17
            kotlin.jvm.internal.o.g(r2, r0)
            java.lang.String r0 = "whitePoint"
            r3 = r18
            kotlin.jvm.internal.o.g(r3, r0)
            java.lang.String r0 = "function"
            kotlin.jvm.internal.o.g(r9, r0)
            r4 = 0
            double r5 = r9.f258540f
            r7 = 0
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            r10 = 1
            r11 = 0
            if (r0 != 0) goto L29
            r0 = r10
            goto L2a
        L29:
            r0 = r11
        L2a:
            double r12 = r9.f258541g
            if (r0 == 0) goto L3d
            int r0 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r0 != 0) goto L34
            r0 = r10
            goto L35
        L34:
            r0 = r11
        L35:
            if (r0 == 0) goto L3d
            f1.o r0 = new f1.o
            r0.<init>(r9)
            goto L42
        L3d:
            f1.p r0 = new f1.p
            r0.<init>(r9)
        L42:
            r14 = r0
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 != 0) goto L49
            r0 = r10
            goto L4a
        L49:
            r0 = r11
        L4a:
            if (r0 == 0) goto L5a
            int r0 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r0 != 0) goto L51
            goto L52
        L51:
            r10 = r11
        L52:
            if (r10 == 0) goto L5a
            f1.q r0 = new f1.q
            r0.<init>(r9)
            goto L5f
        L5a:
            f1.r r0 = new f1.r
            r0.<init>(r9)
        L5f:
            r6 = r0
            r7 = 0
            r8 = 1065353216(0x3f800000, float:1.0)
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r5 = r14
            r9 = r19
            r10 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.y.<init>(java.lang.String, float[], f1.a0, f1.z, int):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public y(java.lang.String r24, float[] r25, f1.a0 r26, double r27, float r29, float r30, int r31) {
        /*
            r23 = this;
            r1 = r27
            java.lang.String r0 = "name"
            r15 = r24
            kotlin.jvm.internal.o.g(r15, r0)
            java.lang.String r0 = "primaries"
            r13 = r25
            kotlin.jvm.internal.o.g(r13, r0)
            java.lang.String r0 = "whitePoint"
            r14 = r26
            kotlin.jvm.internal.o.g(r14, r0)
            r17 = 0
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L23
            r5 = r3
            goto L24
        L23:
            r5 = r4
        L24:
            f1.u r6 = f1.u.f258519d
            if (r5 == 0) goto L2b
            r18 = r6
            goto L32
        L2b:
            f1.s r5 = new f1.s
            r5.<init>(r1)
            r18 = r5
        L32:
            if (r0 != 0) goto L35
            goto L36
        L35:
            r3 = r4
        L36:
            if (r3 == 0) goto L3b
            r19 = r6
            goto L42
        L3b:
            f1.t r0 = new f1.t
            r0.<init>(r1)
            r19 = r0
        L42:
            f1.z r20 = new f1.z
            r0 = r20
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r5 = 0
            r7 = 0
            r9 = 0
            r11 = 0
            r21 = 0
            r13 = r21
            r16 = 96
            r15 = r16
            r16 = 0
            r1 = r27
            r0.<init>(r1, r3, r5, r7, r9, r11, r13, r15, r16)
            r1 = r23
            r2 = r24
            r3 = r25
            r4 = r26
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r29
            r9 = r30
            r10 = r20
            r11 = r31
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.y.<init>(java.lang.String, float[], f1.a0, double, float, float, int):void");
    }
}
