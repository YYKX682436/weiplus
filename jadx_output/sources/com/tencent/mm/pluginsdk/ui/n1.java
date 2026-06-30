package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes11.dex */
public abstract class n1 extends android.graphics.drawable.BitmapDrawable implements com.tencent.mm.pluginsdk.ui.a0 {

    /* renamed from: q, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.o3 f190894q = com.tencent.mm.sdk.platformtools.c4.f192496b.f192497a;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f190895d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f190896e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f190897f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f190898g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f190899h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.j1 f190900i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f190901m;

    /* renamed from: n, reason: collision with root package name */
    public final float f190902n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.l1 f190903o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.Runnable f190904p;

    public n1(com.tencent.mm.pluginsdk.ui.j1 j1Var, java.lang.String str) {
        super(j1Var.uc());
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f190895d = paint;
        this.f190896e = false;
        this.f190897f = false;
        this.f190902n = 1.0f;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
        paint2.setFlags(1);
        paint2.setAntiAlias(true);
        this.f190904p = new com.tencent.mm.pluginsdk.ui.i1(this);
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        this.f190900i = j1Var;
        this.f190901m = str;
        j1Var.X9(this);
    }

    public void U(java.lang.String str) {
        com.tencent.mm.pluginsdk.ui.l1 l1Var = this.f190903o;
        if ((l1Var == null || !l1Var.U(str)) && str != null && str.equals(this.f190901m)) {
            f190894q.e(this.f190904p, 0L);
        }
    }

    public void a() {
        f190894q.d(this.f190904p);
    }

    public void b(java.lang.String str) {
        if (str == null || str.length() <= 0 || str.equals(this.f190901m)) {
            return;
        }
        this.f190901m = str;
        f190894q.d(this.f190904p);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        android.graphics.Rect rect;
        boolean z17 = this.f190897f;
        com.tencent.mm.pluginsdk.ui.j1 j1Var = this.f190900i;
        android.graphics.Bitmap Zg = z17 ? j1Var.Zg(this.f190901m, canvas.getWidth(), canvas.getHeight(), 1) : this.f190898g ? j1Var.W0(this.f190901m) : j1Var.loadBitmap(this.f190901m);
        if (Zg == null || Zg.isRecycled()) {
            Zg = j1Var.uc();
            if (this.f190898g) {
                this.f190899h = true;
            } else {
                this.f190899h = false;
            }
        } else {
            this.f190899h = false;
        }
        android.graphics.Rect bounds = getBounds();
        if (this.f190902n > 1.0f || this.f190896e) {
            int height = (Zg.getHeight() / 15) / 2;
            int width = (Zg.getWidth() / 15) / 2;
            rect = new android.graphics.Rect(width, height, Zg.getWidth() - width, Zg.getHeight() - height);
        } else {
            rect = null;
        }
        canvas.drawBitmap(Zg, rect, bounds, this.f190895d);
    }

    @Override // com.tencent.mm.pluginsdk.ui.a0
    public void onScrollStateChanged(boolean z17) {
        if (z17) {
            this.f190898g = true;
            return;
        }
        if (this.f190898g) {
            this.f190898g = false;
            if (this.f190899h) {
                this.f190899h = false;
                invalidateSelf();
            }
        }
    }

    public n1(com.tencent.mm.pluginsdk.ui.j1 j1Var, java.lang.String str, boolean z17) {
        super(j1Var.uc());
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f190895d = paint;
        this.f190896e = false;
        this.f190897f = false;
        this.f190902n = 1.0f;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
        paint2.setFlags(1);
        paint2.setAntiAlias(true);
        this.f190904p = new com.tencent.mm.pluginsdk.ui.i1(this);
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        this.f190896e = z17;
        this.f190900i = j1Var;
        this.f190901m = str;
        j1Var.X9(this);
    }
}
