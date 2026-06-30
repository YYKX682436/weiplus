package oh2;

/* loaded from: classes10.dex */
public final class o {
    public final float A;

    /* renamed from: a, reason: collision with root package name */
    public final float f345381a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Paint f345382b;

    /* renamed from: c, reason: collision with root package name */
    public my5.a f345383c;

    /* renamed from: d, reason: collision with root package name */
    public final float f345384d;

    /* renamed from: e, reason: collision with root package name */
    public final float f345385e;

    /* renamed from: f, reason: collision with root package name */
    public final float f345386f;

    /* renamed from: g, reason: collision with root package name */
    public final int f345387g;

    /* renamed from: h, reason: collision with root package name */
    public final int f345388h;

    /* renamed from: i, reason: collision with root package name */
    public final float f345389i;

    /* renamed from: j, reason: collision with root package name */
    public final float f345390j;

    /* renamed from: k, reason: collision with root package name */
    public float f345391k;

    /* renamed from: l, reason: collision with root package name */
    public float f345392l;

    /* renamed from: m, reason: collision with root package name */
    public final float f345393m;

    /* renamed from: n, reason: collision with root package name */
    public float f345394n;

    /* renamed from: o, reason: collision with root package name */
    public float f345395o;

    /* renamed from: p, reason: collision with root package name */
    public float f345396p;

    /* renamed from: q, reason: collision with root package name */
    public float f345397q;

    /* renamed from: r, reason: collision with root package name */
    public float f345398r;

    /* renamed from: s, reason: collision with root package name */
    public float f345399s;

    /* renamed from: t, reason: collision with root package name */
    public int f345400t;

    /* renamed from: u, reason: collision with root package name */
    public int f345401u;

    /* renamed from: v, reason: collision with root package name */
    public int f345402v;

    /* renamed from: w, reason: collision with root package name */
    public final int f345403w;

    /* renamed from: x, reason: collision with root package name */
    public float f345404x;

    /* renamed from: y, reason: collision with root package name */
    public final float f345405y;

    /* renamed from: z, reason: collision with root package name */
    public final android.graphics.Rect f345406z;

    public o(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        float a17 = i65.a.a(context, 17.0f);
        this.f345381a = a17;
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setTextSize(a17);
        paint.setAntiAlias(true);
        this.f345382b = paint;
        this.f345384d = i65.a.a(context, 0.0f);
        paint.setTextSize(a17);
        android.graphics.Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        this.f345385e = fontMetrics.descent - fontMetrics.ascent;
        paint.setTextSize(a17 * 1.2f);
        android.graphics.Paint.FontMetrics fontMetrics2 = paint.getFontMetrics();
        this.f345386f = fontMetrics2.descent - fontMetrics2.ascent;
        this.f345387g = -1;
        this.f345388h = -1;
        this.f345389i = i65.a.a(context, 28.0f);
        this.f345390j = i65.a.a(context, 0.0f);
        this.f345391k = i65.a.a(context, 24.0f);
        this.f345392l = i65.a.a(context, 24.0f);
        this.f345393m = i65.a.a(context, 52.0f);
        this.f345395o = 1.4f;
        this.f345396p = 1.0f;
        this.f345397q = 1.0f;
        this.f345398r = 0.5f;
        this.f345400t = -1;
        this.f345401u = -1;
        this.f345402v = -1;
        this.f345403w = 2;
        this.f345404x = (com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).x - this.f345391k) - this.f345392l;
        this.f345405y = i65.a.a(context, 80.0f);
        this.f345406z = new android.graphics.Rect();
        this.A = 0.1f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
    
        r0 = r12.f345382b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
    
        if (r3 < 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        r1 = (my5.b) r13.f332860d.get(r3);
        r3 = r13.f332857a;
        kotlin.jvm.internal.o.f(r3, "mText");
        r2 = r3.substring(0, r1.f332855c);
        kotlin.jvm.internal.o.f(r2, "substring(...)");
        r13 = r13.f332857a;
        kotlin.jvm.internal.o.f(r13, "mText");
        r13 = r13.substring(r1.f332855c, r1.f332856d);
        kotlin.jvm.internal.o.f(r13, "substring(...)");
        r2 = r0.measureText(r2);
        r14 = ((float) (r14 - r1.f332853a)) / ((float) r1.f332854b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008b, code lost:
    
        if (r14 <= 1.0f) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008d, code lost:
    
        r14 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        return r2 + (r0.measureText(r13) * r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009b, code lost:
    
        return r0.measureText(r13.f332857a);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float a(my5.c r13, int r14) {
        /*
            r12 = this;
            java.util.ArrayList r0 = r13.f332860d
            java.lang.String r1 = "mCharacters"
            kotlin.jvm.internal.o.f(r0, r1)
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
            r3 = r2
        Ld:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L4a
            java.lang.Object r4 = r0.next()
            int r5 = r3 + 1
            if (r3 < 0) goto L45
            my5.b r4 = (my5.b) r4
            long r6 = r4.f332853a
            java.util.ArrayList r4 = r13.f332860d
            kotlin.jvm.internal.o.f(r4, r1)
            java.lang.Object r4 = kz5.n0.a0(r4, r5)
            my5.b r4 = (my5.b) r4
            if (r4 == 0) goto L2f
            long r8 = r4.f332853a
            goto L34
        L2f:
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L34:
            long r10 = (long) r14
            int r4 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r4 > 0) goto L3f
            int r4 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r4 >= 0) goto L3f
            r4 = 1
            goto L40
        L3f:
            r4 = r2
        L40:
            if (r4 == 0) goto L43
            goto L4b
        L43:
            r3 = r5
            goto Ld
        L45:
            kz5.c0.p()
            r13 = 0
            throw r13
        L4a:
            r3 = -1
        L4b:
            android.graphics.Paint r0 = r12.f345382b
            if (r3 < 0) goto L95
            java.util.ArrayList r1 = r13.f332860d
            java.lang.Object r1 = r1.get(r3)
            my5.b r1 = (my5.b) r1
            java.lang.String r3 = r13.f332857a
            java.lang.String r4 = "mText"
            kotlin.jvm.internal.o.f(r3, r4)
            int r5 = r1.f332855c
            java.lang.String r2 = r3.substring(r2, r5)
            java.lang.String r3 = "substring(...)"
            kotlin.jvm.internal.o.f(r2, r3)
            java.lang.String r13 = r13.f332857a
            kotlin.jvm.internal.o.f(r13, r4)
            int r4 = r1.f332855c
            int r5 = r1.f332856d
            java.lang.String r13 = r13.substring(r4, r5)
            kotlin.jvm.internal.o.f(r13, r3)
            float r2 = r0.measureText(r2)
            long r3 = (long) r14
            long r5 = r1.f332853a
            long r3 = r3 - r5
            float r14 = (float) r3
            long r3 = r1.f332854b
            float r1 = (float) r3
            float r14 = r14 / r1
            r1 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r3 <= 0) goto L8e
            r14 = r1
        L8e:
            float r13 = r0.measureText(r13)
            float r13 = r13 * r14
            float r2 = r2 + r13
            goto L9b
        L95:
            java.lang.String r13 = r13.f332857a
            float r2 = r0.measureText(r13)
        L9b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: oh2.o.a(my5.c, int):float");
    }

    public final void b() {
        this.f345402v = -1;
        this.f345394n = 0.0f;
        this.f345395o = 1.5f;
        this.f345396p = 1.0f;
        this.f345400t = -1;
        this.f345398r = 0.5f;
        this.f345397q = 1.0f;
        this.f345399s = 0.0f;
        this.f345401u = this.f345403w - 1;
        com.tencent.mars.xlog.Log.i("KtvLyricsDrawer", "reset");
    }
}
