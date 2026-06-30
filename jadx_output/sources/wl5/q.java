package wl5;

/* loaded from: classes15.dex */
public class q extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.PopupWindow f447130d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f447131e;

    /* renamed from: f, reason: collision with root package name */
    public final int f447132f;

    /* renamed from: g, reason: collision with root package name */
    public final int f447133g;

    /* renamed from: h, reason: collision with root package name */
    public final int f447134h;

    /* renamed from: i, reason: collision with root package name */
    public final int f447135i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f447136m;

    /* renamed from: n, reason: collision with root package name */
    public int f447137n;

    /* renamed from: o, reason: collision with root package name */
    public int f447138o;

    /* renamed from: p, reason: collision with root package name */
    public int f447139p;

    /* renamed from: q, reason: collision with root package name */
    public final int[] f447140q;

    /* renamed from: r, reason: collision with root package name */
    public xl5.c f447141r;

    /* renamed from: s, reason: collision with root package name */
    public final android.graphics.Rect f447142s;

    /* renamed from: t, reason: collision with root package name */
    public final android.graphics.Point f447143t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f447144u;

    /* renamed from: v, reason: collision with root package name */
    public final int[] f447145v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f447146w;

    /* renamed from: x, reason: collision with root package name */
    public wl5.r f447147x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ wl5.x f447148y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(wl5.x xVar, boolean z17) {
        super(xVar.f447164i);
        this.f447148y = xVar;
        int i17 = xVar.f447181z / 2;
        this.f447132f = i17;
        int i18 = i17 * 2;
        this.f447133g = i18;
        int i19 = i17 * 2;
        this.f447134h = i19;
        this.f447135i = 20;
        this.f447140q = new int[2];
        this.f447142s = new android.graphics.Rect();
        this.f447143t = new android.graphics.Point();
        this.f447144u = false;
        this.f447145v = new int[2];
        this.f447146w = false;
        this.f447136m = z17;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f447131e = paint;
        paint.setColor(xVar.f447164i.getResources().getColor(xVar.f447180y));
        android.widget.PopupWindow popupWindow = new android.widget.PopupWindow(this);
        this.f447130d = popupWindow;
        popupWindow.setClippingEnabled(false);
        popupWindow.setWidth(i18 + (20 * 3));
        popupWindow.setHeight(i19 + (20 * 2));
    }

    public int a() {
        return (this.f447140q[0] - (this.f447135i * 2)) + this.f447148y.f447165j.getPaddingLeft();
    }

    public int b() {
        return this.f447140q[1] + this.f447148y.f447165j.getPaddingTop();
    }

    public void c(int i17, int i18) {
        wl5.x xVar = this.f447148y;
        android.view.View view = xVar.f447165j;
        int[] iArr = this.f447140q;
        view.getLocationInWindow(iArr);
        boolean z17 = this.f447136m;
        wl5.w wVar = xVar.f447158c;
        int i19 = z17 ? wVar.f447151a : wVar.f447152b;
        int a17 = wl5.y.a(xVar.f447165j, i17, i18 - iArr[1], i19);
        if (a17 != i19) {
            xVar.f447173r = 0;
            xVar.k();
            boolean z18 = this.f447136m;
            if (z18) {
                if (a17 > this.f447139p) {
                    wl5.q qVar = xVar.f447155a;
                    if (qVar.f447136m) {
                        qVar = xVar.f447157b;
                    }
                    this.f447136m = !z18;
                    invalidate();
                    qVar.f447136m = !qVar.f447136m;
                    qVar.invalidate();
                    int i27 = this.f447139p;
                    this.f447138o = i27;
                    xVar.f447169n = a17 - i27 < 1;
                    xVar.l(i27, a17);
                    qVar.d();
                } else {
                    xVar.f447169n = wVar.f447152b - a17 < 1;
                    xVar.l(a17, -1);
                }
                d();
                return;
            }
            int i28 = this.f447138o;
            if (a17 < i28) {
                wl5.q qVar2 = xVar.f447155a;
                if (!qVar2.f447136m) {
                    qVar2 = xVar.f447157b;
                }
                qVar2.f447136m = !qVar2.f447136m;
                qVar2.invalidate();
                this.f447136m = !this.f447136m;
                invalidate();
                int i29 = this.f447138o;
                this.f447139p = i29;
                xVar.f447169n = i29 - a17 < 1;
                xVar.l(a17, i29);
                qVar2.d();
            } else {
                xVar.f447169n = a17 - i28 < 1;
                xVar.l(i28, a17);
            }
            d();
        }
    }

    public final void d() {
        wl5.x xVar = this.f447148y;
        xVar.f447168m = false;
        xVar.f447165j.getLocationInWindow(this.f447140q);
        android.text.TextPaint l17 = wl5.y.l(xVar.f447165j);
        if (l17 != null) {
            int i17 = (int) l17.getFontMetrics().descent;
            boolean z17 = this.f447136m;
            android.widget.PopupWindow popupWindow = this.f447130d;
            if (z17) {
                int m17 = (((int) wl5.y.m(xVar.f447165j, xVar.f447158c.f447151a)) - this.f447133g) + a();
                android.view.View view = xVar.f447165j;
                popupWindow.update(m17, wl5.y.b(view, wl5.y.d(view, xVar.f447158c.f447151a)) + i17 + b(), -1, -1);
            } else {
                int m18 = (int) wl5.y.m(xVar.f447165j, xVar.f447158c.f447152b);
                android.view.View view2 = xVar.f447165j;
                int[] e17 = e(m18, wl5.y.b(view2, wl5.y.d(view2, xVar.f447158c.f447152b)) + i17);
                popupWindow.update(e17[0] + this.f447135i + a(), e17[1] + b(), -1, -1);
            }
        }
    }

    public final int[] e(int i17, int i18) {
        int[] iArr = new int[2];
        if (i17 == 0) {
            wl5.x xVar = this.f447148y;
            if (xVar.f447158c.f447152b > 1) {
                xVar.f447165j.getLocationInWindow(this.f447140q);
                android.text.TextPaint l17 = wl5.y.l(xVar.f447165j);
                if (l17 != null) {
                    int i19 = (int) l17.getFontMetrics().descent;
                    int j17 = (int) wl5.y.j(xVar.f447165j, wl5.y.d(xVar.f447165j, xVar.f447158c.f447152b - 1));
                    android.view.View view = xVar.f447165j;
                    i18 = i19 + wl5.y.b(view, wl5.y.d(view, xVar.f447158c.f447152b - 1));
                    i17 = j17;
                }
            }
        }
        iArr[0] = i17;
        iArr[1] = i18;
        return iArr;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        int i17;
        int i18;
        wl5.x xVar = this.f447148y;
        if (xVar.f447166k != null) {
            int i19 = this.f447136m ? xVar.f447158c.f447151a : xVar.f447158c.f447152b;
            android.text.TextPaint l17 = wl5.y.l(xVar.f447165j);
            if (l17 != null) {
                android.view.View view = xVar.f447165j;
                i18 = wl5.y.b(view, wl5.y.d(view, i19)) + ((int) l17.getFontMetrics().descent);
                i17 = (int) wl5.y.m(xVar.f447165j, i19);
            } else {
                i17 = 0;
                i18 = 0;
            }
            android.view.View view2 = xVar.f447165j;
            int[] iArr = this.f447140q;
            view2.getLocationInWindow(iArr);
            xVar.f447165j.getLocationInWindow(iArr);
            if (!this.f447136m) {
                i18 = e(i17, i18)[1];
            }
            int b17 = i18 + b();
            android.view.View view3 = xVar.f447165j;
            android.graphics.Point point = this.f447143t;
            android.graphics.Rect rect = this.f447142s;
            if (!view3.getGlobalVisibleRect(rect, point)) {
                com.tencent.mm.ui.yk.a("SelectableTextHelper", "view invisible.", new java.lang.Object[0]);
                return;
            }
            if (b17 > rect.bottom) {
                if (this.f447136m) {
                    com.tencent.mm.ui.yk.a("SelectableTextHelper", "start below bottom, dismiss all.", new java.lang.Object[0]);
                    xVar.k();
                    xVar.M = true;
                    xVar.N = true;
                    xVar.i();
                    xVar.f447166k.a();
                }
                com.tencent.mm.ui.yk.a("SelectableTextHelper", "cursor invisible.", new java.lang.Object[0]);
                return;
            }
            if (b17 < rect.top) {
                if (!this.f447136m) {
                    com.tencent.mm.ui.yk.a("SelectableTextHelper", "end above top, dismiss all.", new java.lang.Object[0]);
                    xVar.k();
                    xVar.M = true;
                    xVar.N = true;
                    xVar.i();
                    xVar.f447166k.a();
                }
                com.tencent.mm.ui.yk.a("SelectableTextHelper", "cursor invisible.", new java.lang.Object[0]);
                return;
            }
        }
        boolean z17 = this.f447136m;
        android.graphics.Paint paint = this.f447131e;
        int i27 = this.f447135i;
        int i28 = this.f447132f;
        if (z17) {
            canvas.drawCircle((i27 * 2) + i28, i28, i28, paint);
            canvas.drawRect((i27 * 2) + i28, 0.0f, (i28 * 2) + (i27 * 2), i28, paint);
        } else {
            canvas.drawCircle(i28 + i27, i28, i28, paint);
            canvas.drawRect(i27, 0.0f, i27 + i28, i28, paint);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x002d, code lost:
    
        if (r1 != 3) goto L56;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wl5.q.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
