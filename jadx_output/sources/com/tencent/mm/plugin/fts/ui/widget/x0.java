package com.tencent.mm.plugin.fts.ui.widget;

/* loaded from: classes13.dex */
public class x0 extends android.graphics.drawable.Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f138345a;

    /* renamed from: b, reason: collision with root package name */
    public android.graphics.drawable.Drawable f138346b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f138347c;

    /* renamed from: d, reason: collision with root package name */
    public final int f138348d;

    /* renamed from: e, reason: collision with root package name */
    public int f138349e;

    /* renamed from: g, reason: collision with root package name */
    public final int f138351g;

    /* renamed from: h, reason: collision with root package name */
    public final int f138352h;

    /* renamed from: i, reason: collision with root package name */
    public final int f138353i;

    /* renamed from: j, reason: collision with root package name */
    public final int f138354j;

    /* renamed from: k, reason: collision with root package name */
    public final int f138355k;

    /* renamed from: m, reason: collision with root package name */
    public int f138357m;

    /* renamed from: p, reason: collision with root package name */
    public final int f138360p;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Paint f138350f = new android.graphics.Paint(1);

    /* renamed from: l, reason: collision with root package name */
    public boolean f138356l = false;

    /* renamed from: n, reason: collision with root package name */
    public int f138358n = 2;

    /* renamed from: o, reason: collision with root package name */
    public int f138359o = 0;

    public x0(android.content.Context context) {
        this.f138348d = 0;
        this.f138349e = 0;
        this.f138355k = 0;
        this.f138360p = 0;
        this.f138345a = context;
        this.f138348d = i65.a.d(context, com.tencent.mm.R.color.aaq);
        this.f138349e = i65.a.d(context, com.tencent.mm.R.color.aaw);
        this.f138346b = context.getResources().getDrawable(com.tencent.mm.R.drawable.c67);
        this.f138347c = context.getResources().getDrawable(com.tencent.mm.R.drawable.c68);
        this.f138355k = i65.a.b(context, 24);
        this.f138351g = i65.a.d(context, com.tencent.mm.R.color.a__);
        this.f138354j = i65.a.d(context, com.tencent.mm.R.color.a_a);
        this.f138357m = i65.a.b(context, 47);
        this.f138352h = i65.a.b(context, 47);
        this.f138353i = i65.a.b(context, 60);
        this.f138360p = 4;
    }

    public final boolean a(android.graphics.Canvas canvas) {
        return canvas == null || canvas.getWidth() == 0 || canvas.getHeight() == 0;
    }

    public final void b(android.graphics.Canvas canvas, boolean z17) {
        android.graphics.drawable.Drawable drawable;
        int i17;
        if (this.f138346b == null || a(canvas)) {
            return;
        }
        if (z17) {
            drawable = this.f138347c;
            i17 = this.f138348d;
        } else {
            drawable = this.f138346b;
            i17 = this.f138349e;
        }
        int width = canvas.getWidth() / 2;
        int height = canvas.getHeight() / 2;
        int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
        int intrinsicHeight = drawable.getIntrinsicHeight() / 2;
        android.graphics.Paint paint = this.f138350f;
        paint.setShader(null);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        paint.setColor(i17);
        canvas.drawCircle(width, height, this.f138355k, paint);
        drawable.setBounds(width - intrinsicWidth, height - intrinsicHeight, width + intrinsicWidth, height + intrinsicHeight);
        drawable.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        int i17 = this.f138358n;
        android.graphics.Paint paint = this.f138350f;
        if ((i17 == 6 || i17 == 7) && !a(canvas)) {
            int width = canvas.getWidth() >> 1;
            int height = canvas.getHeight() >> 1;
            paint.setShader(null);
            paint.setStyle(android.graphics.Paint.Style.FILL);
            paint.setColor(this.f138351g);
            int i18 = this.f138358n;
            int i19 = this.f138352h;
            if (i18 == 7) {
                boolean z17 = this.f138356l;
                int i27 = this.f138360p;
                if (z17) {
                    this.f138357m -= i27;
                } else {
                    this.f138357m += i27;
                }
                int min = java.lang.Math.min(java.lang.Math.max(i19, this.f138357m), this.f138353i);
                this.f138357m = min;
                canvas.drawCircle(width, height, min, paint);
            } else {
                canvas.drawCircle(width, height, i19, paint);
            }
        }
        int i28 = this.f138358n;
        if (i28 == 6 || i28 == 7) {
            b(canvas, true);
        } else {
            b(canvas, false);
        }
        int i29 = this.f138358n;
        if ((i29 == 6 || i29 == 7) && !a(canvas)) {
            paint.setStyle(android.graphics.Paint.Style.FILL);
            paint.setColor(this.f138354j);
            canvas.drawCircle(canvas.getWidth() >> 1, canvas.getHeight() >> 1, this.f138355k, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f138355k * 2;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        android.content.Context context = this.f138345a;
        if (context == null) {
            return 0;
        }
        return i65.a.B(context);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i17) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
    }
}
