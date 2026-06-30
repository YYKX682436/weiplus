package f26;

/* loaded from: classes16.dex */
public class y2 extends f26.x {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f259240e;

    public y2(java.lang.String str) {
        this.f259240e = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void I0(int r9) {
        /*
            r0 = 4
            r1 = 1
            if (r9 == r1) goto L9
            if (r9 == r0) goto L9
            java.lang.String r2 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto Lb
        L9:
            java.lang.String r2 = "@NotNull method %s.%s must not return null"
        Lb:
            r3 = 3
            r4 = 2
            if (r9 == r1) goto L13
            if (r9 == r0) goto L13
            r5 = r3
            goto L14
        L13:
            r5 = r4
        L14:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType"
            r7 = 0
            if (r9 == r1) goto L30
            if (r9 == r4) goto L2b
            if (r9 == r3) goto L26
            if (r9 == r0) goto L30
            java.lang.String r8 = "newAttributes"
            r5[r7] = r8
            goto L32
        L26:
            java.lang.String r8 = "kotlinTypeRefiner"
            r5[r7] = r8
            goto L32
        L2b:
            java.lang.String r8 = "delegate"
            r5[r7] = r8
            goto L32
        L30:
            r5[r7] = r6
        L32:
            java.lang.String r7 = "refine"
            if (r9 == r1) goto L3e
            if (r9 == r0) goto L3b
            r5[r1] = r6
            goto L42
        L3b:
            r5[r1] = r7
            goto L42
        L3e:
            java.lang.String r6 = "toString"
            r5[r1] = r6
        L42:
            if (r9 == r1) goto L56
            if (r9 == r4) goto L52
            if (r9 == r3) goto L4f
            if (r9 == r0) goto L56
            java.lang.String r3 = "replaceAttributes"
            r5[r4] = r3
            goto L56
        L4f:
            r5[r4] = r7
            goto L56
        L52:
            java.lang.String r3 = "replaceDelegate"
            r5[r4] = r3
        L56:
            java.lang.String r2 = java.lang.String.format(r2, r5)
            if (r9 == r1) goto L64
            if (r9 == r0) goto L64
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r2)
            goto L69
        L64:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r2)
        L69:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: f26.y2.I0(int):void");
    }

    @Override // f26.z0, f26.c3
    public /* bridge */ /* synthetic */ f26.c3 A0(boolean z17) {
        A0(z17);
        throw null;
    }

    @Override // f26.x, f26.c3
    /* renamed from: B0 */
    public f26.c3 y0(g26.l lVar) {
        if (lVar != null) {
            return this;
        }
        I0(3);
        throw null;
    }

    @Override // f26.z0, f26.c3
    public /* bridge */ /* synthetic */ f26.c3 C0(f26.r1 r1Var) {
        C0(r1Var);
        throw null;
    }

    @Override // f26.z0
    /* renamed from: D0 */
    public f26.z0 A0(boolean z17) {
        throw new java.lang.IllegalStateException(this.f259240e);
    }

    @Override // f26.z0
    /* renamed from: E0 */
    public f26.z0 C0(f26.r1 r1Var) {
        if (r1Var != null) {
            throw new java.lang.IllegalStateException(this.f259240e);
        }
        I0(0);
        throw null;
    }

    @Override // f26.x
    public f26.z0 F0() {
        throw new java.lang.IllegalStateException(this.f259240e);
    }

    @Override // f26.x
    /* renamed from: G0 */
    public f26.z0 y0(g26.l lVar) {
        if (lVar != null) {
            return this;
        }
        I0(3);
        throw null;
    }

    @Override // f26.x
    public f26.x H0(f26.z0 z0Var) {
        if (z0Var != null) {
            throw new java.lang.IllegalStateException(this.f259240e);
        }
        I0(2);
        throw null;
    }

    @Override // f26.z0
    public java.lang.String toString() {
        java.lang.String str = this.f259240e;
        if (str != null) {
            return str;
        }
        I0(1);
        throw null;
    }

    @Override // f26.x, f26.o0
    public f26.o0 y0(g26.l lVar) {
        if (lVar != null) {
            return this;
        }
        I0(3);
        throw null;
    }
}
