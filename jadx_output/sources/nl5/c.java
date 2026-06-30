package nl5;

/* loaded from: classes15.dex */
public final class c extends android.view.View {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f338248v = 0;

    /* renamed from: d, reason: collision with root package name */
    public final nl5.s0 f338249d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f338250e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.PopupWindow f338251f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.Paint f338252g;

    /* renamed from: h, reason: collision with root package name */
    public final int f338253h;

    /* renamed from: i, reason: collision with root package name */
    public final int f338254i;

    /* renamed from: m, reason: collision with root package name */
    public final int f338255m;

    /* renamed from: n, reason: collision with root package name */
    public final int f338256n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f338257o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f338258p;

    /* renamed from: q, reason: collision with root package name */
    public int f338259q;

    /* renamed from: r, reason: collision with root package name */
    public int f338260r;

    /* renamed from: s, reason: collision with root package name */
    public int f338261s;

    /* renamed from: t, reason: collision with root package name */
    public final int[] f338262t;

    /* renamed from: u, reason: collision with root package name */
    public final int[] f338263u;

    static {
        new nl5.a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(nl5.s0 selectableEditTextHelper, boolean z17) {
        super(selectableEditTextHelper.f338356g);
        kotlin.jvm.internal.o.g(selectableEditTextHelper, "selectableEditTextHelper");
        this.f338249d = selectableEditTextHelper;
        android.widget.PopupWindow popupWindow = new android.widget.PopupWindow(this);
        this.f338251f = popupWindow;
        this.f338256n = 25;
        this.f338258p = jz5.h.b(new nl5.b(this));
        this.f338262t = new int[2];
        this.f338263u = new int[2];
        this.f338250e = z17;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f338252g = paint;
        paint.setColor(selectableEditTextHelper.f338370u);
        int i17 = selectableEditTextHelper.f338371v / 2;
        this.f338253h = i17;
        int i18 = i17 * 2;
        this.f338254i = i18;
        int i19 = i17 * 2;
        this.f338255m = i19;
        popupWindow.setClippingEnabled(false);
        popupWindow.setWidth(i18 + (25 * 2));
        popupWindow.setHeight(i19 + (25 / 2));
        invalidate();
    }

    private final xl5.c getMTextMagnifierHelper() {
        return (xl5.c) ((jz5.n) this.f338258p).getValue();
    }

    public final int a(int i17, android.text.Layout layout) {
        int lineBottom = layout.getLineBottom(layout.getLineForOffset(i17)) + getExtraY();
        int[] iArr = this.f338263u;
        int i18 = iArr[1];
        nl5.s0 s0Var = this.f338249d;
        int height = (i18 + s0Var.f338357h.getHeight()) - s0Var.f338357h.getPaddingBottom();
        if (lineBottom > height) {
            lineBottom = height;
        }
        int i19 = iArr[1];
        return lineBottom < i19 ? i19 : lineBottom;
    }

    public final void b(int i17, int i18) {
        nl5.s0 s0Var = this.f338249d;
        android.widget.TextView textView = s0Var.f338357h;
        int[] iArr = this.f338263u;
        textView.getLocationInWindow(iArr);
        int extraX = (i17 - (this.f338250e ? this.f338254i : 0)) + getExtraX();
        int extraY = i18 + getExtraY();
        int i19 = iArr[1];
        if (extraY >= i19 && extraY <= ((i19 + s0Var.f338357h.getHeight()) - s0Var.f338357h.getPaddingBottom()) + com.tencent.mm.ui.zk.a(s0Var.f338356g, 5)) {
            c(extraX, extraY);
        }
    }

    public final void c(int i17, int i18) {
        android.widget.PopupWindow popupWindow = this.f338251f;
        try {
            if (popupWindow.isShowing()) {
                popupWindow.update(i17, i18, -1, -1);
            } else {
                popupWindow.showAtLocation(this.f338249d.f338357h, 0, i17, i18);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mm.ui.yk.b("SelectableEditTextHelper", "cursor error!: %s.", e17.getMessage());
        }
    }

    public final void d() {
        nl5.s0 s0Var = this.f338249d;
        s0Var.f338357h.getLocationInWindow(this.f338263u);
        android.text.Layout layout = s0Var.f338357h.getLayout();
        if (this.f338250e) {
            int i17 = s0Var.f338355f.f338245a;
            kotlin.jvm.internal.o.d(layout);
            c((((int) layout.getPrimaryHorizontal(s0Var.f338355f.f338245a)) - this.f338254i) + getExtraX(), a(i17, layout));
            return;
        }
        int i18 = s0Var.f338355f.f338246b;
        kotlin.jvm.internal.o.d(layout);
        c(((int) layout.getPrimaryHorizontal(s0Var.f338355f.f338246b)) + getExtraX(), a(i18, layout));
    }

    public final int getExtraX() {
        return (this.f338263u[0] - this.f338256n) + this.f338249d.f338357h.getPaddingLeft();
    }

    public final int getExtraY() {
        int i17 = this.f338263u[1];
        nl5.s0 s0Var = this.f338249d;
        return (i17 + s0Var.f338357h.getPaddingTop()) - s0Var.f338357h.getScrollY();
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        int i17 = this.f338253h;
        int i18 = this.f338256n;
        android.graphics.Paint paint = this.f338252g;
        canvas.drawCircle(i17 + i18, i17, i17, paint);
        if (this.f338250e) {
            canvas.drawRect(i17 + i18, 0.0f, (i17 * 2) + i18, i17, paint);
        } else {
            canvas.drawRect(i18, 0.0f, i18 + i17, i17, paint);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (r1 != 3) goto L70;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nl5.c.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setLeft(boolean z17) {
        this.f338250e = z17;
    }

    public final void setMoving(boolean z17) {
        this.f338257o = z17;
    }
}
