package oj5;

/* loaded from: classes4.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public float f345824a;

    /* renamed from: b, reason: collision with root package name */
    public float f345825b;

    /* renamed from: c, reason: collision with root package name */
    public final int f345826c;

    /* renamed from: d, reason: collision with root package name */
    public final int f345827d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f345828e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f345829f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f345830g;

    /* renamed from: h, reason: collision with root package name */
    public int f345831h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f345832i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.Runnable f345833j;

    /* renamed from: k, reason: collision with root package name */
    public final java.util.HashSet f345834k;

    public a0(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f345832i = true;
        this.f345833j = new oj5.z(this);
        this.f345834k = new java.util.HashSet();
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
        this.f345826c = android.view.ViewConfiguration.getLongPressTimeout() + 100;
        this.f345827d = viewConfiguration.getScaledTouchSlop();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if (r1 != 3) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(android.view.MotionEvent r6) {
        /*
            r5 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.o.g(r6, r0)
            r6.getAction()
            r6.getX()
            r6.getY()
            int r0 = r5.f345831h
            int r1 = r6.getActionMasked()
            r2 = 1
            if (r1 == r2) goto L24
            r3 = 2
            if (r1 == r3) goto L1e
            r3 = 3
            if (r1 == r3) goto L24
            goto L26
        L1e:
            boolean r0 = r5.f345830g
            r2 = r2 ^ r0
            int r0 = r5.f345831h
            goto L26
        L24:
            r0 = 15
        L26:
            boolean r1 = r5.f345828e
            if (r1 != 0) goto L54
            if (r2 == 0) goto L54
            java.util.HashSet r2 = r5.f345834k
            java.util.Iterator r2 = r2.iterator()
        L32:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L54
            java.lang.Object r3 = r2.next()
            oj5.y r3 = (oj5.y) r3
            if (r1 == 0) goto L41
            goto L54
        L41:
            boolean r4 = r5.f345829f
            if (r4 == 0) goto L4c
            int r4 = r3.b()
            r4 = r4 & r0
            if (r4 == 0) goto L32
        L4c:
            boolean r4 = r5.f345829f
            boolean r3 = r3.a(r6, r4, r0)
            r1 = r1 | r3
            goto L32
        L54:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: oj5.a0.a(android.view.MotionEvent):boolean");
    }

    public final void b(android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        int actionMasked = event.getActionMasked();
        java.lang.Runnable runnable = this.f345833j;
        if (actionMasked == 0) {
            this.f345825b = event.getX();
            this.f345824a = event.getY();
            this.f345828e = false;
            this.f345829f = false;
            this.f345830g = false;
            this.f345831h = 0;
            com.tencent.mm.sdk.platformtools.u3.i(runnable, this.f345826c);
            return;
        }
        int i17 = 1;
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                float x17 = event.getX();
                float y17 = event.getY();
                float f17 = this.f345825b;
                float f18 = x17 - f17;
                float f19 = y17 - this.f345824a;
                if (!this.f345829f) {
                    float abs = java.lang.Math.abs(x17 - f17);
                    int i18 = this.f345827d;
                    this.f345829f = abs > ((float) i18) || java.lang.Math.abs(y17 - this.f345824a) > ((float) i18);
                }
                if (this.f345829f) {
                    com.tencent.mm.sdk.platformtools.u3.l(runnable);
                    if (this.f345831h == 0) {
                        if (java.lang.Math.abs(f19) <= java.lang.Math.abs(f18)) {
                            i17 = f18 < 0.0f ? 4 : 8;
                        } else if (f19 >= 0.0f) {
                            i17 = 2;
                        }
                        this.f345831h = i17;
                        return;
                    }
                    return;
                }
                return;
            }
            if (actionMasked != 3) {
                return;
            }
        }
        com.tencent.mm.sdk.platformtools.u3.l(runnable);
        this.f345831h = 0;
        this.f345830g = true;
    }
}
