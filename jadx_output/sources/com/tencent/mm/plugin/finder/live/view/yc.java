package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes10.dex */
public final class yc extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f116841d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f116842e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Paint f116843f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.RectF f116844g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.SiriBubbleView f116845h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yc(com.tencent.mm.plugin.finder.live.view.SiriBubbleView siriBubbleView, android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f116845h = siriBubbleView;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        this.f116841d = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
        this.f116842e = paint2;
        android.graphics.Paint paint3 = new android.graphics.Paint(1);
        paint3.setStyle(android.graphics.Paint.Style.FILL);
        this.f116843f = paint3;
        this.f116844g = new android.graphics.RectF();
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        super.onDraw(canvas);
        com.tencent.mm.plugin.finder.live.view.SiriBubbleView siriBubbleView = this.f116845h;
        if (siriBubbleView.R) {
            int width = getWidth();
            int height = getHeight();
            if (width == 0 || height == 0) {
                return;
            }
            float f17 = siriBubbleView.P;
            android.graphics.RectF rectF = this.f116844g;
            float f18 = width;
            float f19 = height;
            rectF.set(f17, f17, f18 - f17, f19 - f17);
            float f27 = 2 * f17;
            float f28 = f18 - f27;
            float f29 = f19 - f27;
            float f37 = 0.0f;
            if (f28 <= 0.0f || f29 <= 0.0f) {
                return;
            }
            float f38 = siriBubbleView.F.f116863a;
            boolean z17 = siriBubbleView.B;
            float f39 = z17 ? siriBubbleView.I.f116863a : siriBubbleView.Q;
            float f47 = siriBubbleView.f116138J.f116863a;
            if (f47 < 0.0f) {
                f47 = 0.0f;
            }
            if (z17) {
                float f48 = siriBubbleView.K.f116863a;
                if (f48 >= 0.0f) {
                    f37 = f48;
                }
            }
            float f49 = f28 / 2.0f;
            float f57 = f17 + f49;
            float f58 = f29 / 2.0f;
            float f59 = f17 + f58;
            float f66 = siriBubbleView.f116143h;
            int[] iArr = siriBubbleView.f116140e;
            iArr[0] = siriBubbleView.b(f66);
            iArr[1] = siriBubbleView.b((0.33333334f + f66) % 1.0f);
            iArr[2] = siriBubbleView.b((f66 + 0.6666667f) % 1.0f);
            android.graphics.Paint paint = this.f116841d;
            paint.setShader(new android.graphics.LinearGradient(f57 - f49, f59, f57 + f49, f59, siriBubbleView.f116140e, siriBubbleView.f116139d, android.graphics.Shader.TileMode.CLAMP));
            paint.setStrokeWidth(f39);
            float f67 = 255;
            paint.setAlpha(e06.p.f((int) (f38 * f67), 0, 255));
            float f68 = siriBubbleView.f116157v;
            canvas.drawRoundRect(rectF, f68, f68, paint);
            float f69 = siriBubbleView.f116144i;
            int[] iArr2 = siriBubbleView.f116141f;
            iArr2[0] = siriBubbleView.b((0.6666667f + f69) % 1.0f);
            iArr2[1] = siriBubbleView.b(f69);
            android.graphics.Paint paint2 = this.f116842e;
            paint2.setShader(new android.graphics.LinearGradient(f57, f59 - f58, f57, f58 + f59, siriBubbleView.f116141f, (float[]) null, android.graphics.Shader.TileMode.CLAMP));
            paint2.setStrokeWidth(f39);
            paint2.setAlpha(e06.p.f((int) (f47 * f38 * f67), 0, 255));
            float f76 = siriBubbleView.f116157v;
            canvas.drawRoundRect(rectF, f76, f76, paint2);
            if (f37 > 0.001f) {
                android.graphics.Paint paint3 = this.f116843f;
                paint3.setShader(paint.getShader());
                paint3.setAlpha(e06.p.f((int) (f37 * f67), 0, 255));
                float f77 = siriBubbleView.f116157v;
                canvas.drawRoundRect(rectF, f77, f77, paint3);
            }
        }
    }
}
