package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes11.dex */
public class x extends com.tencent.mm.pluginsdk.ui.v {

    /* renamed from: v, reason: collision with root package name */
    public static u45.f f192085v;

    /* renamed from: s, reason: collision with root package name */
    public float f192086s;

    /* renamed from: t, reason: collision with root package name */
    public android.graphics.Bitmap f192087t;

    /* renamed from: u, reason: collision with root package name */
    public final android.graphics.Paint f192088u;

    public x(java.lang.String str, float f17) {
        super(com.tencent.mm.pluginsdk.ui.u.c(), str);
        this.f192086s = 0.5f;
        this.f192087t = null;
        this.f192088u = new android.graphics.Paint();
        this.f192086s = f17;
    }

    @Override // com.tencent.mm.pluginsdk.ui.v, com.tencent.mm.pluginsdk.ui.n1, kv.e0
    public void U(java.lang.String str) {
        super.U(str);
    }

    public final void c(android.graphics.Canvas canvas, android.graphics.Bitmap bitmap) {
        android.graphics.Rect rect;
        android.graphics.Rect bounds = getBounds();
        if (this.f190902n > 1.0f || this.f190896e) {
            int height = (bitmap.getHeight() / 15) / 2;
            int width = (bitmap.getWidth() / 15) / 2;
            rect = new android.graphics.Rect(width, height, bitmap.getWidth() - width, bitmap.getHeight() - height);
        } else {
            rect = null;
        }
        canvas.drawBitmap(bitmap, rect, bounds, this.f190895d);
    }

    @Override // com.tencent.mm.pluginsdk.ui.n1, android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        if (f192085v == null) {
            f192085v = u45.e.a();
        }
        java.lang.String str = this.f190901m + "-" + this.f192086s;
        android.graphics.Bitmap Ai = ((va3.m0) f192085v).Ai(str);
        if (Ai == null || Ai.isRecycled()) {
            boolean z17 = this.f190897f;
            com.tencent.mm.pluginsdk.ui.j1 j1Var = this.f190900i;
            android.graphics.Bitmap Zg = z17 ? j1Var.Zg(this.f190901m, canvas.getWidth(), canvas.getHeight(), 1) : j1Var.loadBitmap(this.f190901m);
            boolean a17 = j1Var instanceof com.tencent.mm.pluginsdk.ui.k1 ? ((com.tencent.mm.pluginsdk.ui.k1) j1Var).a(this.f190901m) : true;
            if (Zg == null || Zg.isRecycled()) {
                if (this.f192087t == null) {
                    try {
                        java.io.InputStream open = com.tencent.mm.sdk.platformtools.x2.f193071a.getAssets().open("avatar/default_nor_avatar.png", 3);
                        try {
                            this.f192087t = com.tencent.mm.sdk.platformtools.x.s0(com.tencent.mm.sdk.platformtools.j.c(open, i65.a.g(null)), true, this.f192086s * r1.getWidth());
                            if (open != null) {
                                open.close();
                            }
                        } finally {
                        }
                    } catch (java.io.IOException e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AvatarRoundDrawable", e17, "", new java.lang.Object[0]);
                    }
                }
                android.graphics.Bitmap bitmap = this.f192087t;
                if (bitmap != null && !bitmap.isRecycled()) {
                    c(canvas, bitmap);
                }
            } else {
                if (a17) {
                    Zg = com.tencent.mm.sdk.platformtools.x.s0(Zg, false, this.f192086s * Zg.getWidth());
                }
                ((va3.m0) f192085v).Bi(str, Zg);
                c(canvas, Zg);
            }
        } else {
            c(canvas, Ai);
        }
        if (this.f192028r) {
            android.graphics.Paint paint = this.f192088u;
            paint.setColor(-16777216);
            paint.setAlpha(76);
            paint.setAntiAlias(true);
            android.graphics.RectF rectF = new android.graphics.RectF(getBounds());
            canvas.drawRoundRect(rectF, this.f192086s * rectF.width(), this.f192086s * rectF.height(), paint);
        }
    }
}
