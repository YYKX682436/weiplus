package f1;

/* loaded from: classes14.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public final f1.d f258501a;

    /* renamed from: b, reason: collision with root package name */
    public final f1.d f258502b;

    /* renamed from: c, reason: collision with root package name */
    public final float[] f258503c;

    public k(f1.d dVar, f1.d dVar2, f1.d dVar3, f1.d dVar4, int i17, float[] fArr, kotlin.jvm.internal.i iVar) {
        this.f258501a = dVar3;
        this.f258502b = dVar4;
        this.f258503c = fArr;
    }

    public float[] a(float[] v17) {
        kotlin.jvm.internal.o.g(v17, "v");
        float[] e17 = this.f258501a.e(v17);
        float[] fArr = this.f258503c;
        if (fArr != null) {
            e17[0] = e17[0] * fArr[0];
            e17[1] = e17[1] * fArr[1];
            e17[2] = e17[2] * fArr[2];
        }
        return this.f258502b.a(e17);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public k(f1.d r16, f1.d r17, int r18, kotlin.jvm.internal.i r19) {
        /*
            r15 = this;
            r1 = r16
            r2 = r17
            long r3 = r1.f258472b
            long r5 = f1.c.f258466a
            boolean r0 = f1.c.a(r3, r5)
            f1.a0 r3 = f1.l.f258505b
            r4 = 2
            r7 = 0
            if (r0 == 0) goto L18
            f1.d r0 = f1.e.a(r1, r3, r7, r4, r7)
            r8 = r0
            goto L19
        L18:
            r8 = r1
        L19:
            long r9 = r2.f258472b
            boolean r0 = f1.c.a(r9, r5)
            if (r0 == 0) goto L27
            f1.d r0 = f1.e.a(r2, r3, r7, r4, r7)
            r9 = r0
            goto L28
        L27:
            r9 = r2
        L28:
            r0 = 1
            r3 = 0
            r10 = 3
            r11 = r18
            if (r11 != r10) goto L31
            r12 = r0
            goto L32
        L31:
            r12 = r3
        L32:
            if (r12 != 0) goto L35
            goto L4b
        L35:
            long r12 = r1.f258472b
            boolean r12 = f1.c.a(r12, r5)
            long r13 = r2.f258472b
            boolean r5 = f1.c.a(r13, r5)
            if (r12 == 0) goto L46
            if (r5 == 0) goto L46
            goto L4b
        L46:
            if (r12 != 0) goto L4d
            if (r5 == 0) goto L4b
            goto L4d
        L4b:
            r6 = r7
            goto L7e
        L4d:
            if (r12 == 0) goto L51
            r6 = r1
            goto L52
        L51:
            r6 = r2
        L52:
            f1.y r6 = (f1.y) r6
            float[] r7 = f1.l.f258508e
            f1.a0 r6 = r6.f258523d
            if (r12 == 0) goto L5f
            float[] r12 = r6.a()
            goto L60
        L5f:
            r12 = r7
        L60:
            if (r5 == 0) goto L66
            float[] r7 = r6.a()
        L66:
            float[] r5 = new float[r10]
            r6 = r12[r3]
            r10 = r7[r3]
            float r6 = r6 / r10
            r5[r3] = r6
            r3 = r12[r0]
            r6 = r7[r0]
            float r3 = r3 / r6
            r5[r0] = r3
            r0 = r12[r4]
            r3 = r7[r4]
            float r0 = r0 / r3
            r5[r4] = r0
            r6 = r5
        L7e:
            r7 = 0
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r8
            r4 = r9
            r5 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.k.<init>(f1.d, f1.d, int, kotlin.jvm.internal.i):void");
    }
}
