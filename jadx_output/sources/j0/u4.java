package j0;

/* loaded from: classes14.dex */
public final class u4 {

    /* renamed from: f, reason: collision with root package name */
    public static final w0.x f296582f = w0.b.a(j0.s4.f296566d, j0.t4.f296571d);

    /* renamed from: a, reason: collision with root package name */
    public final n0.v2 f296583a;

    /* renamed from: b, reason: collision with root package name */
    public final n0.v2 f296584b;

    /* renamed from: c, reason: collision with root package name */
    public d1.g f296585c;

    /* renamed from: d, reason: collision with root package name */
    public long f296586d;

    /* renamed from: e, reason: collision with root package name */
    public final n0.v2 f296587e;

    public u4(b0.y1 initialOrientation, float f17) {
        kotlin.jvm.internal.o.g(initialOrientation, "initialOrientation");
        this.f296583a = n0.s4.c(java.lang.Float.valueOf(f17), null, 2, null);
        this.f296584b = n0.s4.c(java.lang.Float.valueOf(0.0f), null, 2, null);
        this.f296585c = d1.g.f225628e;
        int i17 = a2.m1.f782c;
        this.f296586d = a2.m1.f781b;
        this.f296587e = n0.s4.b(initialOrientation, n0.h5.f333529a);
    }

    public final float a() {
        return ((java.lang.Number) this.f296583a.getValue()).floatValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0035, code lost:
    
        if ((r6 == r0.f225630b) == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(b0.y1 r8, d1.g r9, int r10, int r11) {
        /*
            r7 = this;
            java.lang.String r0 = "orientation"
            kotlin.jvm.internal.o.g(r8, r0)
            java.lang.String r0 = "cursorRect"
            kotlin.jvm.internal.o.g(r9, r0)
            int r11 = r11 - r10
            float r11 = (float) r11
            n0.v2 r0 = r7.f296584b
            java.lang.Float r1 = java.lang.Float.valueOf(r11)
            n0.q4 r0 = (n0.q4) r0
            r0.setValue(r1)
            d1.g r0 = r7.f296585c
            float r1 = r0.f225629a
            float r2 = r9.f225629a
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L25
            r1 = r3
            goto L26
        L25:
            r1 = r4
        L26:
            n0.v2 r5 = r7.f296583a
            float r6 = r9.f225630b
            if (r1 == 0) goto L37
            float r0 = r0.f225630b
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 != 0) goto L34
            r0 = r3
            goto L35
        L34:
            r0 = r4
        L35:
            if (r0 != 0) goto L78
        L37:
            b0.y1 r0 = b0.y1.Vertical
            if (r8 != r0) goto L3c
            goto L3d
        L3c:
            r3 = r4
        L3d:
            if (r3 == 0) goto L40
            r2 = r6
        L40:
            if (r3 == 0) goto L45
            float r8 = r9.f225632d
            goto L47
        L45:
            float r8 = r9.f225631c
        L47:
            float r0 = r7.a()
            float r10 = (float) r10
            float r10 = r10 + r0
            int r1 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r1 >= 0) goto L62
            float r8 = r7.a()
            float r0 = r0 - r2
            float r8 = r8 - r0
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            r10 = r5
            n0.q4 r10 = (n0.q4) r10
            r10.setValue(r8)
            goto L76
        L62:
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 <= 0) goto L76
            float r0 = r7.a()
            float r8 = r8 - r10
            float r0 = r0 + r8
            java.lang.Float r8 = java.lang.Float.valueOf(r0)
            r10 = r5
            n0.q4 r10 = (n0.q4) r10
            r10.setValue(r8)
        L76:
            r7.f296585c = r9
        L78:
            float r8 = r7.a()
            r9 = 0
            float r8 = e06.p.e(r8, r9, r11)
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            n0.q4 r5 = (n0.q4) r5
            r5.setValue(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.u4.b(b0.y1, d1.g, int, int):void");
    }
}
