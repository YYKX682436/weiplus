package yw0;

/* loaded from: classes5.dex */
public final class k extends yw0.s {

    /* renamed from: b, reason: collision with root package name */
    public final yw0.r f466560b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.Paint f466561c;

    /* renamed from: d, reason: collision with root package name */
    public final int f466562d;

    /* renamed from: e, reason: collision with root package name */
    public long f466563e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.PointF f466564f;

    /* renamed from: g, reason: collision with root package name */
    public final ou0.a0 f466565g;

    /* renamed from: h, reason: collision with root package name */
    public final ou0.c f466566h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f466567i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.List f466568j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(android.content.Context context, yw0.r drawerAction) {
        super(drawerAction);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(drawerAction, "drawerAction");
        this.f466560b = drawerAction;
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setColor(j65.q.a(context).getColor(com.tencent.mm.R.color.f478502m, null));
        paint.setStrokeWidth(j65.q.a(context).getDimension(com.tencent.mm.R.dimen.f479642bh));
        this.f466561c = paint;
        this.f466562d = j65.q.a(context).getDimensionPixelSize(com.tencent.mm.R.dimen.f479723df);
        this.f466564f = new android.graphics.PointF();
        this.f466565g = new ou0.a0(0.1f, 1.0f, 1.0f);
        this.f466566h = new ou0.c(30.0f, 0.0f);
        this.f466567i = kz5.b0.c(new yw0.h(new ou0.c(30.0f, 0.0f), 0.5f));
        this.f466568j = kz5.c0.i(new yw0.h(new ou0.c(30.0f, 0.0f), 0.33f), new yw0.h(new ou0.c(30.0f, 0.0f), 0.5f), new yw0.h(new ou0.c(30.0f, 0.0f), 0.67f));
    }

    @Override // yw0.s
    public void a() {
        e();
    }

    @Override // yw0.s
    public void b(android.graphics.Canvas canvas, int i17, int i18) {
        boolean z17;
        int i19;
        android.graphics.Paint paint;
        kotlin.jvm.internal.o.g(canvas, "canvas");
        java.util.List list = this.f466567i;
        boolean z18 = true;
        if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((yw0.h) it.next()).f466556a.f348887e) {
                    z17 = true;
                    break;
                }
            }
        }
        z17 = false;
        java.util.List<yw0.h> list2 = this.f466568j;
        if (!z17) {
            if (!(list2 instanceof java.util.Collection) || !list2.isEmpty()) {
                java.util.Iterator it6 = list2.iterator();
                while (it6.hasNext()) {
                    if (((yw0.h) it6.next()).f466556a.f348887e) {
                        break;
                    }
                }
            }
            z18 = false;
            if (!z18) {
                return;
            }
        }
        float f17 = i17;
        float f18 = i18;
        java.util.Iterator it7 = list.iterator();
        while (true) {
            boolean hasNext = it7.hasNext();
            i19 = this.f466562d;
            paint = this.f466561c;
            if (!hasNext) {
                break;
            }
            yw0.h hVar = (yw0.h) it7.next();
            if (hVar.f466556a.f348887e) {
                float f19 = hVar.f466557b * f17;
                float f27 = i19;
                canvas.drawLine(f19, 0.0f, f19, 0.0f + f27, paint);
                canvas.drawLine(f19, f18 - f27, f19, f18, paint);
            }
        }
        for (yw0.h hVar2 : list2) {
            if (hVar2.f466556a.f348887e) {
                float f28 = hVar2.f466557b * f18;
                float f29 = i19;
                canvas.drawLine(0.0f, f28, 0.0f + f29, f28, paint);
                canvas.drawLine(f17 - f29, f28, f17, f28, paint);
            }
        }
    }

    public final float d(java.util.List list, float f17, float f18, float f19) {
        java.util.Iterator it = list.iterator();
        float f27 = f19;
        while (it.hasNext()) {
            yw0.h hVar = (yw0.h) it.next();
            ou0.b bVar = hVar.f466556a;
            boolean z17 = bVar.f348888f;
            float a17 = ou0.c0.a(f18, f17 * hVar.f466557b, f19, 30.0f, bVar, new yw0.i(this));
            boolean z18 = hVar.f466556a.f348888f;
            if (z18 || z18 != z17) {
                f27 = a17;
            }
        }
        return f27;
    }

    public final void e() {
        this.f466566h.d();
        this.f466565g.d();
        java.util.Iterator it = this.f466568j.iterator();
        while (it.hasNext()) {
            ((yw0.h) it.next()).f466556a.d();
        }
        java.util.Iterator it6 = this.f466567i.iterator();
        while (it6.hasNext()) {
            ((yw0.h) it6.next()).f466556a.d();
        }
        ((yw0.l) this.f466560b).a();
    }

    public final void f() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - this.f466563e >= 200) {
            this.f466563e = currentTimeMillis;
            ((yw0.l) this.f466560b).f466569a.f466571a.performHapticFeedback(0, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x015e, code lost:
    
        if (r0 <= r5) goto L142;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(float r17) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yw0.k.g(float):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0217, code lost:
    
        if (r12 <= r4) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0080, code lost:
    
        if (r4 < 0.0d) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0082, code lost:
    
        r8 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
    
        return r1 * r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00bf, code lost:
    
        if (r4 < 0.0d) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00fb, code lost:
    
        if (r4 < 0.0d) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0137, code lost:
    
        if (r4 < 0.0d) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0174, code lost:
    
        if (r4 < 0.0d) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01b1, code lost:
    
        if (r4 < 0.0d) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01ee, code lost:
    
        if (r4 < 0.0d) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x022a, code lost:
    
        if (r4 < 0.0d) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x022e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float h(au0.c r17, float r18) {
        /*
            Method dump skipped, instructions count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yw0.k.h(au0.c, float):float");
    }
}
