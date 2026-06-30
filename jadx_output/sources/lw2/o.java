package lw2;

/* loaded from: classes15.dex */
public final class o {
    public float A;
    public float B;
    public boolean C;
    public boolean D;
    public boolean E;
    public float F;
    public float G;
    public float H;
    public float I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f321590J;
    public android.util.Size K;
    public float L;
    public float M;
    public float N;
    public float O;
    public float P;
    public android.view.VelocityTracker Q;
    public long R;
    public long S;
    public float T;

    /* renamed from: a, reason: collision with root package name */
    public final float f321591a;

    /* renamed from: b, reason: collision with root package name */
    public final float f321592b;

    /* renamed from: c, reason: collision with root package name */
    public final float f321593c;

    /* renamed from: d, reason: collision with root package name */
    public final int f321594d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f321595e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f321596f;

    /* renamed from: g, reason: collision with root package name */
    public nn0.a0 f321597g;

    /* renamed from: h, reason: collision with root package name */
    public int f321598h;

    /* renamed from: i, reason: collision with root package name */
    public int f321599i;

    /* renamed from: j, reason: collision with root package name */
    public final int f321600j;

    /* renamed from: k, reason: collision with root package name */
    public final int f321601k;

    /* renamed from: l, reason: collision with root package name */
    public final float f321602l;

    /* renamed from: m, reason: collision with root package name */
    public final float f321603m;

    /* renamed from: n, reason: collision with root package name */
    public final float f321604n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f321605o;

    /* renamed from: p, reason: collision with root package name */
    public final int[] f321606p;

    /* renamed from: q, reason: collision with root package name */
    public android.graphics.PointF f321607q;

    /* renamed from: r, reason: collision with root package name */
    public int f321608r;

    /* renamed from: s, reason: collision with root package name */
    public android.graphics.PointF f321609s;

    /* renamed from: t, reason: collision with root package name */
    public android.graphics.PointF f321610t;

    /* renamed from: u, reason: collision with root package name */
    public float f321611u;

    /* renamed from: v, reason: collision with root package name */
    public float f321612v;

    /* renamed from: w, reason: collision with root package name */
    public float f321613w;

    /* renamed from: x, reason: collision with root package name */
    public float f321614x;

    /* renamed from: y, reason: collision with root package name */
    public float f321615y;

    /* renamed from: z, reason: collision with root package name */
    public float f321616z;

    public o(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f321591a = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Kf).getValue()).r()).floatValue();
        this.f321592b = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Lf).getValue()).r()).floatValue();
        this.f321593c = 1.01f;
        this.f321594d = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Mf).getValue()).r()).intValue();
        com.tencent.mm.plugin.finder.assist.e8 e8Var = com.tencent.mm.plugin.finder.assist.e8.f102131a;
        int b17 = e8Var.b(context);
        this.f321600j = b17;
        this.f321601k = e8Var.c(null);
        float f17 = (b17 * 2.25f) / 40.0f;
        this.f321602l = f17;
        this.f321603m = f17;
        this.f321604n = 5.0f;
        this.f321606p = new int[2];
        this.f321607q = new android.graphics.PointF();
        this.f321609s = new android.graphics.PointF();
        this.f321610t = new android.graphics.PointF();
        this.f321612v = 1.0f;
        this.A = 1.0f;
        this.B = 1.0f;
        this.F = 10.0f;
        this.G = 2.0f;
        this.H = 0.1f;
        this.I = 1.0f;
        on0.c cVar = on0.c.f346787d;
        this.K = new android.util.Size(0, 0);
    }

    public final void a(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("FinderVideoScaleManager", str);
    }

    public final void b() {
        android.view.View view = this.f321605o;
        if (view != null) {
            com.tencent.mars.xlog.Log.i("FinderVideoScaleManager", "checkAnimate viewScale: " + this.B + " scalePrevPoint: " + this.f321609s + " viewTransitionX: " + this.f321615y + " viewTransitionY: " + this.f321616z);
            nn0.a0 a0Var = this.f321597g;
            if (a0Var != null) {
                a0Var.h0(this.B == 1.0f);
            }
            view.setScaleX(this.B);
            view.setScaleY(this.B);
            view.setTranslationX(this.f321615y);
            view.setTranslationY(this.f321616z);
        }
    }

    public final void c(android.graphics.PointF pointF) {
        android.graphics.PointF pointF2 = this.f321609s;
        pointF2.x = pointF.x;
        pointF2.y = pointF.y;
        a("saveScalePrevPoint origin point: " + pointF.y);
        this.f321609s.y = (((float) this.f321599i) / ((float) this.f321600j)) * pointF.y;
        a("saveScalePrevPoint after point: " + this.f321609s.y);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(int r9, int r10, android.util.Size r11) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lw2.o.d(int, int, android.util.Size):void");
    }

    public final void e() {
        if (this.f321598h <= 0 || this.f321599i <= 0) {
            return;
        }
        if (this.B <= 1.0f) {
            this.f321615y = 0.0f;
            this.f321616z = 0.0f;
            return;
        }
        this.f321615y += this.f321613w;
        this.f321616z += this.f321614x;
        android.view.View view = this.f321605o;
        if (view != null) {
            int i17 = 1;
            float f17 = 1;
            float pivotX = view.getPivotX() * (this.B - f17);
            float f18 = this.f321603m;
            float f19 = pivotX + f18;
            float pivotX2 = ((view.getPivotX() - this.f321598h) * (this.B - f17)) - f18;
            if (this.f321615y > f19) {
                this.f321615y = f19;
            }
            if (this.f321615y < pivotX2) {
                this.f321615y = pivotX2;
            }
            float pivotY = view.getPivotY();
            float f27 = this.B;
            float f28 = pivotY * (f27 - f17);
            float f29 = this.f321606p[1] - f28;
            float f37 = this.f321616z;
            float f38 = f29 + f37;
            float f39 = this.f321599i * f27;
            float f47 = f39 + f38;
            int i18 = this.f321600j;
            float f48 = i18;
            if (f39 <= f48) {
                this.f321616z = f37 - this.f321614x;
                return;
            }
            float f49 = this.f321602l;
            if (f38 > f49) {
                this.f321616z = f49 - f29;
            } else {
                i17 = 0;
            }
            float f57 = f48 - f49;
            if (f47 < f57) {
                this.f321616z = f57 - (f29 + f39);
                i17 = 2;
            }
            a("checkOnMove hit:" + i17 + " pivotX:" + view.getPivotX() + " pivotY:" + view.getPivotY() + " yOffset:" + f28 + "yTop:" + f38 + " yBottom:" + f47 + " viewTransitionY:" + this.f321616z + " translation[" + view.getTranslationY() + "] threshold:" + f49 + " screenHeight:" + i18 + ' ');
        }
    }

    public final void f() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateViewLocation animViewScreenPos: ");
        int[] iArr = this.f321606p;
        sb6.append(iArr[0]);
        sb6.append(' ');
        sb6.append(iArr[1]);
        com.tencent.mars.xlog.Log.i("FinderVideoScaleManager", sb6.toString());
        android.view.View view = this.f321605o;
        if (view != null) {
            view.getLocationOnScreen(iArr);
            d(view.getMeasuredWidth(), view.getMeasuredHeight(), this.K);
        }
        com.tencent.mars.xlog.Log.i("FinderVideoScaleManager", "updateViewLocation after animViewScreenPos: " + iArr[0] + ' ' + iArr[1]);
    }
}
