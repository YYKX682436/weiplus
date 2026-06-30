package xb;

/* loaded from: classes15.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final xb.c[] f452847a;

    /* renamed from: b, reason: collision with root package name */
    public final xb.f f452848b;

    /* renamed from: c, reason: collision with root package name */
    public char f452849c = 0;

    /* renamed from: d, reason: collision with root package name */
    public char f452850d = 0;

    /* renamed from: e, reason: collision with root package name */
    public char[] f452851e;

    /* renamed from: f, reason: collision with root package name */
    public int f452852f;

    /* renamed from: g, reason: collision with root package name */
    public int f452853g;

    /* renamed from: h, reason: collision with root package name */
    public int f452854h;

    /* renamed from: i, reason: collision with root package name */
    public float f452855i;

    /* renamed from: j, reason: collision with root package name */
    public float f452856j;

    /* renamed from: k, reason: collision with root package name */
    public float f452857k;

    /* renamed from: l, reason: collision with root package name */
    public float f452858l;

    /* renamed from: m, reason: collision with root package name */
    public float f452859m;

    /* renamed from: n, reason: collision with root package name */
    public float f452860n;

    /* renamed from: o, reason: collision with root package name */
    public float f452861o;

    /* renamed from: p, reason: collision with root package name */
    public float f452862p;

    /* renamed from: q, reason: collision with root package name */
    public int f452863q;

    public d(xb.c[] cVarArr, xb.f fVar) {
        this.f452847a = cVarArr;
        this.f452848b = fVar;
    }

    public final void a() {
        float a17 = this.f452848b.a(this.f452850d);
        float f17 = this.f452858l;
        float f18 = this.f452859m;
        if (f17 != f18 || f18 == a17) {
            return;
        }
        this.f452859m = a17;
        this.f452858l = a17;
        this.f452860n = a17;
    }

    public final boolean b(android.graphics.Canvas canvas, android.graphics.Paint paint, char[] cArr, int i17, float f17) {
        if (i17 < 0 || i17 >= cArr.length) {
            return false;
        }
        canvas.drawText(cArr, i17, 1, 0.0f, f17, paint);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
    
        if (r11 < r10) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005d, code lost:
    
        r11 = r11 + r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        if (r10 < r11) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
    
        r10 = r10 + r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        if (((r12 - r10) + r11) < (r10 - r11)) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0066, code lost:
    
        if (((r12 - r11) + r10) < (r11 - r10)) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(char r14) {
        /*
            r13 = this;
            r13.f452850d = r14
            float r0 = r13.f452858l
            r13.f452857k = r0
            xb.f r0 = r13.f452848b
            float r14 = r0.a(r14)
            r13.f452859m = r14
            float r1 = r13.f452857k
            float r14 = java.lang.Math.max(r1, r14)
            r13.f452860n = r14
            r14 = 0
            r13.f452851e = r14
            r1 = 0
            r2 = r1
        L1b:
            xb.c[] r3 = r13.f452847a
            int r4 = r3.length
            r5 = 1
            r6 = 2
            if (r2 >= r4) goto L83
            r4 = r3[r2]
            char r7 = r13.f452849c
            char r8 = r13.f452850d
            xb.i r9 = r0.f452872e
            int r10 = r4.a(r7)
            int r11 = r4.a(r8)
            if (r10 < 0) goto L6f
            if (r11 >= 0) goto L37
            goto L6f
        L37:
            int r9 = r9.ordinal()
            int r12 = r4.f452844a
            if (r9 == 0) goto L50
            if (r9 == r5) goto L4d
            if (r9 == r6) goto L44
            goto L69
        L44:
            if (r8 != 0) goto L4a
            char[] r5 = r4.f452845b
            int r11 = r5.length
            goto L69
        L4a:
            if (r11 >= r10) goto L69
            goto L5d
        L4d:
            if (r10 >= r11) goto L69
            goto L68
        L50:
            if (r7 == 0) goto L69
            if (r8 == 0) goto L69
            if (r11 >= r10) goto L5f
            int r5 = r10 - r11
            int r6 = r12 - r10
            int r6 = r6 + r11
            if (r6 >= r5) goto L69
        L5d:
            int r11 = r11 + r12
            goto L69
        L5f:
            if (r10 >= r11) goto L69
            int r5 = r11 - r10
            int r6 = r12 - r11
            int r6 = r6 + r10
            if (r6 >= r5) goto L69
        L68:
            int r10 = r10 + r12
        L69:
            xb.b r5 = new xb.b
            r5.<init>(r4, r10, r11)
            goto L70
        L6f:
            r5 = r14
        L70:
            if (r5 == 0) goto L80
            r3 = r3[r2]
            char[] r3 = r3.f452845b
            r13.f452851e = r3
            int r3 = r5.f452842a
            r13.f452852f = r3
            int r3 = r5.f452843b
            r13.f452853g = r3
        L80:
            int r2 = r2 + 1
            goto L1b
        L83:
            char[] r14 = r13.f452851e
            if (r14 != 0) goto La4
            char r14 = r13.f452849c
            char r0 = r13.f452850d
            if (r14 != r0) goto L98
            char[] r0 = new char[r5]
            r0[r1] = r14
            r13.f452851e = r0
            r13.f452853g = r1
            r13.f452852f = r1
            goto La4
        L98:
            char[] r2 = new char[r6]
            r2[r1] = r14
            r2[r5] = r0
            r13.f452851e = r2
            r13.f452852f = r1
            r13.f452853g = r5
        La4:
            int r14 = r13.f452853g
            int r0 = r13.f452852f
            if (r14 < r0) goto Lab
            r1 = r5
        Lab:
            if (r1 == 0) goto Lae
            goto Laf
        Lae:
            r5 = -1
        Laf:
            r13.f452863q = r5
            float r14 = r13.f452861o
            r13.f452862p = r14
            r14 = 0
            r13.f452861o = r14
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xb.d.c(char):void");
    }
}
