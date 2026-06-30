package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes5.dex */
public class jp extends android.graphics.drawable.Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f147076a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f147077b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f147078c;

    /* renamed from: e, reason: collision with root package name */
    public final int f147080e;

    /* renamed from: f, reason: collision with root package name */
    public final int f147081f;

    /* renamed from: g, reason: collision with root package name */
    public final int f147082g;

    /* renamed from: h, reason: collision with root package name */
    public final int f147083h;

    /* renamed from: i, reason: collision with root package name */
    public final int f147084i;

    /* renamed from: k, reason: collision with root package name */
    public int f147086k;

    /* renamed from: l, reason: collision with root package name */
    public int f147087l;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f147079d = new android.graphics.Paint(1);

    /* renamed from: j, reason: collision with root package name */
    public boolean f147085j = false;

    /* renamed from: m, reason: collision with root package name */
    public int f147088m = 2;

    /* renamed from: n, reason: collision with root package name */
    public final int f147089n = 2;

    public jp(android.content.Context context) {
        this.f147076a = context;
        i65.a.d(context, com.tencent.mm.R.color.f479372xo);
        i65.a.d(context, com.tencent.mm.R.color.a09);
        this.f147077b = context.getResources().getDrawable(com.tencent.mm.R.drawable.c_s);
        this.f147078c = context.getResources().getDrawable(com.tencent.mm.R.drawable.c_s);
        this.f147083h = i65.a.b(context, 24);
        this.f147084i = i65.a.b(context, 34);
        this.f147080e = i65.a.d(context, com.tencent.mm.R.color.f479370xn);
        this.f147087l = i65.a.a(context, 40.0f);
        this.f147081f = i65.a.a(context, 40.0f);
        this.f147082g = i65.a.a(context, 56.0f);
    }

    public final void a(android.graphics.Canvas canvas, boolean z17) {
        int i17;
        android.graphics.drawable.Drawable drawable = this.f147077b;
        if (drawable != null) {
            if (canvas == null || canvas.getWidth() == 0 || canvas.getHeight() == 0) {
                return;
            }
            if (z17) {
                drawable = this.f147078c;
                i17 = this.f147084i;
            } else {
                i17 = this.f147083h;
            }
            int width = canvas.getWidth() / 2;
            int height = canvas.getHeight() / 2;
            drawable.setBounds(width - i17, height - i17, width + i17, height + i17);
            drawable.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        int i17 = this.f147088m;
        if (i17 == 6 || i17 == 7) {
            if (!(canvas == null || canvas.getWidth() == 0 || canvas.getHeight() == 0)) {
                int width = canvas.getWidth() >> 1;
                int height = canvas.getHeight() >> 1;
                android.graphics.Paint paint = this.f147079d;
                paint.setShader(null);
                paint.setStyle(android.graphics.Paint.Style.FILL);
                paint.setColor(this.f147080e);
                int i18 = this.f147088m;
                int i19 = this.f147081f;
                if (i18 == 7) {
                    boolean z17 = this.f147085j;
                    int i27 = this.f147089n;
                    if (z17) {
                        this.f147087l -= i27;
                    } else {
                        this.f147087l += i27;
                    }
                    int min = java.lang.Math.min(java.lang.Math.max(i19, this.f147087l), this.f147082g);
                    this.f147087l = min;
                    canvas.drawCircle(width, height, min, paint);
                } else {
                    canvas.drawCircle(width, height, i19, paint);
                }
            }
        }
        int i28 = this.f147088m;
        if (i28 == 6 || i28 == 7) {
            a(canvas, true);
        } else {
            a(canvas, false);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f147083h * 2;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        android.content.Context context = this.f147076a;
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
