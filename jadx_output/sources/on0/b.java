package on0;

/* loaded from: classes3.dex */
public final class b {
    public on0.c A;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f346761a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f346762b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f346763c;

    /* renamed from: d, reason: collision with root package name */
    public nn0.a0 f346764d;

    /* renamed from: e, reason: collision with root package name */
    public int f346765e;

    /* renamed from: f, reason: collision with root package name */
    public int f346766f;

    /* renamed from: g, reason: collision with root package name */
    public final int f346767g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f346768h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f346769i;

    /* renamed from: j, reason: collision with root package name */
    public android.graphics.PointF f346770j;

    /* renamed from: k, reason: collision with root package name */
    public int f346771k;

    /* renamed from: l, reason: collision with root package name */
    public android.graphics.PointF f346772l;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.PointF f346773m;

    /* renamed from: n, reason: collision with root package name */
    public float f346774n;

    /* renamed from: o, reason: collision with root package name */
    public float f346775o;

    /* renamed from: p, reason: collision with root package name */
    public float f346776p;

    /* renamed from: q, reason: collision with root package name */
    public float f346777q;

    /* renamed from: r, reason: collision with root package name */
    public float f346778r;

    /* renamed from: s, reason: collision with root package name */
    public float f346779s;

    /* renamed from: t, reason: collision with root package name */
    public float f346780t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f346781u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f346782v;

    /* renamed from: w, reason: collision with root package name */
    public float f346783w;

    /* renamed from: x, reason: collision with root package name */
    public float f346784x;

    /* renamed from: y, reason: collision with root package name */
    public float f346785y;

    /* renamed from: z, reason: collision with root package name */
    public float f346786z;

    public b(android.content.Context context) {
        int i17;
        kotlin.jvm.internal.o.g(context, "context");
        this.f346761a = context;
        boolean z17 = true;
        this.f346763c = true;
        int c17 = com.tencent.mm.ui.bl.c(context);
        android.graphics.Point b17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
        int i18 = b17.x;
        int i19 = b17.y;
        java.lang.System.nanoTime();
        if (!com.tencent.mm.ui.bk.y() && !com.tencent.mm.ui.bk.Q() && !com.tencent.mm.ui.bk.A()) {
            z17 = false;
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (z17) {
            i17 = i19 - c17;
        } else {
            i17 = (i19 >= i18 ? i19 : i18) - c17;
        }
        this.f346767g = i17;
        this.f346769i = new int[2];
        this.f346770j = new android.graphics.PointF();
        this.f346772l = new android.graphics.PointF();
        this.f346773m = new android.graphics.PointF();
        this.f346779s = 1.0f;
        this.f346780t = 1.0f;
        this.f346783w = 3.0f;
        this.f346784x = 2.0f;
        this.f346785y = 0.85f;
        this.f346786z = 1.0f;
        this.A = on0.c.f346787d;
    }

    public final void a() {
        android.view.View view = this.f346768h;
        if (view != null) {
            java.util.Objects.toString(this.f346772l);
            nn0.a0 a0Var = this.f346764d;
            if (a0Var != null) {
                a0Var.h0(this.f346780t == 1.0f);
            }
            view.setScaleX(this.f346780t);
            view.setScaleY(this.f346780t);
            view.setTranslationX(this.f346777q);
            view.setTranslationY(this.f346778r);
        }
    }

    public final void b(android.graphics.PointF pointF) {
        android.graphics.PointF pointF2 = this.f346772l;
        pointF2.x = pointF.x;
        pointF2.y = pointF.y;
        if (this.A != on0.c.f346788e) {
            return;
        }
        pointF2.y = (this.f346766f / this.f346767g) * pointF.y;
    }

    public final void c(int i17, int i18) {
        if (i17 <= 0 || i18 <= 0) {
            return;
        }
        this.f346765e = i17;
        this.f346766f = i18;
        android.view.View view = this.f346768h;
        int[] iArr = this.f346769i;
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        on0.c cVar = (this.f346765e <= 0 || this.f346766f <= 0) ? on0.c.f346787d : this.f346761a.getResources().getConfiguration().orientation == 2 ? on0.c.f346787d : ((float) (this.f346765e / this.f346766f)) >= 1.0f ? on0.c.f346788e : on0.c.f346787d;
        this.A = cVar;
        if (cVar == on0.c.f346788e) {
            this.f346784x = this.f346767g / i18;
        } else {
            this.f346784x = 2.0f;
        }
        this.f346783w = (this.f346784x * 3) / 2.0f;
        this.f346786z = 1.0f;
        this.f346785y = 0.85f;
        int i19 = iArr[0];
        int i27 = iArr[1];
    }

    public final void d() {
        if (this.f346765e <= 0 || this.f346766f <= 0) {
            return;
        }
        if (this.f346780t <= 1.0f) {
            this.f346777q = 0.0f;
            this.f346778r = 0.0f;
            return;
        }
        this.f346777q += this.f346775o;
        this.f346778r += this.f346776p;
        android.view.View view = this.f346768h;
        if (view != null) {
            float f17 = 1;
            float pivotX = view.getPivotX() * (this.f346780t - f17);
            float pivotX2 = (view.getPivotX() - this.f346765e) * (this.f346780t - f17);
            if (this.f346777q > pivotX) {
                this.f346777q = pivotX;
            }
            if (this.f346777q < pivotX2) {
                this.f346777q = pivotX2;
            }
            if (this.A == on0.c.f346787d) {
                float pivotY = view.getPivotY() * (this.f346780t - f17);
                float pivotY2 = (view.getPivotY() - this.f346766f) * (this.f346780t - f17);
                view.getPivotX();
                view.getPivotY();
                if (this.f346778r > pivotY) {
                    this.f346778r = pivotY;
                }
                if (this.f346778r < pivotY2) {
                    this.f346778r = pivotY2;
                    return;
                }
                return;
            }
            float pivotY3 = view.getPivotY();
            float f18 = this.f346780t;
            float f19 = (pivotY3 * (f18 - f17)) - this.f346769i[1];
            float f27 = (this.f346767g + f19) - (this.f346766f * f18);
            view.getPivotX();
            view.getPivotY();
            if (this.f346778r < f19) {
                this.f346778r = f19;
            }
            if (this.f346778r > f27) {
                this.f346778r = f27;
            }
        }
    }
}
