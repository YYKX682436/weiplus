package tl5;

/* loaded from: classes10.dex */
public final class d extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f420339d;

    /* renamed from: e, reason: collision with root package name */
    public float f420340e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f420341f;

    /* renamed from: g, reason: collision with root package name */
    public int f420342g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.OverScroller f420343h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f420339d = kz5.p0.f313996d;
        this.f420343h = new android.widget.OverScroller(context, new android.view.animation.LinearInterpolator());
    }

    public final void a(java.util.List items) {
        kotlin.jvm.internal.o.g(items, "items");
        this.f420339d = items;
        java.util.Iterator it = items.iterator();
        while (it.hasNext()) {
            ((tl5.i) it.next()).getClass();
        }
        this.f420343h.forceFinished(true);
        this.f420342g = 0;
        this.f420340e = 0.0f;
        invalidate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
    
        if (r11 >= 0.23f) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        r3 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0047, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x003f, code lost:
    
        if (r11 < 0.23f) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0045, code lost:
    
        if (r11 >= 0.23f) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(float r11, boolean r12) {
        /*
            r10 = this;
            java.util.List r0 = r10.f420339d
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L9
            return
        L9:
            r10.f420341f = r12
            float r0 = r10.f420340e
            int r0 = java.lang.Float.compare(r0, r11)
            if (r0 != 0) goto L14
            return
        L14:
            java.util.List r0 = r10.f420339d
            java.util.Iterator r0 = r0.iterator()
        L1a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2a
            java.lang.Object r1 = r0.next()
            tl5.i r1 = (tl5.i) r1
            r1.getClass()
            goto L1a
        L2a:
            int r0 = r10.f420342g
            r1 = 2
            r2 = 1
            r3 = 1047233823(0x3e6b851f, float:0.23)
            if (r0 == 0) goto L43
            if (r0 == r2) goto L3d
            if (r0 == r1) goto L38
            goto L49
        L38:
            int r3 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r3 < 0) goto L41
            goto L47
        L3d:
            int r3 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r3 >= 0) goto L47
        L41:
            r3 = r1
            goto L4a
        L43:
            int r3 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r3 < 0) goto L49
        L47:
            r3 = r2
            goto L4a
        L49:
            r3 = 0
        L4a:
            r10.f420340e = r11
            android.widget.OverScroller r4 = r10.f420343h
            if (r12 == 0) goto L5a
            boolean r11 = r4.isFinished()
            if (r11 != 0) goto L97
            r4.forceFinished(r2)
            goto L97
        L5a:
            if (r0 != 0) goto L6a
            if (r3 != r2) goto L6a
            r5 = 0
            r6 = 0
            r7 = 1000000(0xf4240, float:1.401298E-39)
            r8 = 0
            r9 = 380(0x17c, float:5.32E-43)
            r4.startScroll(r5, r6, r7, r8, r9)
            goto L97
        L6a:
            if (r0 != r2) goto L7f
            if (r3 != r1) goto L7f
            int r5 = r4.getCurrX()
            r6 = 0
            int r11 = r4.getCurrX()
            int r7 = -r11
            r8 = 0
            r9 = 380(0x17c, float:5.32E-43)
            r4.startScroll(r5, r6, r7, r8, r9)
            goto L97
        L7f:
            if (r0 != r1) goto L97
            if (r3 != r2) goto L97
            int r5 = r4.getCurrX()
            r6 = 0
            int r11 = r4.getCurrX()
            r12 = 1000000(0xf4240, float:1.401298E-39)
            int r7 = r12 - r11
            r8 = 0
            r9 = 380(0x17c, float:5.32E-43)
            r4.startScroll(r5, r6, r7, r8, r9)
        L97:
            r10.f420342g = r3
            r10.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tl5.d.b(float, boolean):void");
    }

    @Override // android.view.View
    public void computeScroll() {
        if (!this.f420341f && this.f420343h.computeScrollOffset()) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        super.onDraw(canvas);
        if (this.f420339d.isEmpty()) {
            return;
        }
        if (this.f420341f) {
            java.util.Iterator it = this.f420339d.iterator();
            while (it.hasNext()) {
                ((tl5.i) it.next()).a(canvas, this.f420340e, -1.0f);
            }
        } else {
            float currX = this.f420343h.getCurrX() / 1000000.0f;
            java.util.Iterator it6 = this.f420339d.iterator();
            while (it6.hasNext()) {
                ((tl5.i) it6.next()).a(canvas, this.f420340e, currX);
            }
        }
    }
}
