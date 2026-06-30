package dy;

/* loaded from: classes5.dex */
public final class c extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f244525d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f244526e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Paint f244527f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.Paint f244528g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.drawable.GradientDrawable f244529h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.content.Context context, boolean z17) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeWidth(1.0f);
        paint.setColor(android.graphics.Color.parseColor(z17 ? "#33FFFFFF" : "#22000000"));
        this.f244525d = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        paint2.setStyle(android.graphics.Paint.Style.FILL);
        paint2.setColor(android.graphics.Color.parseColor(z17 ? "#FF1A1A1A" : "#FFEAEEF2"));
        android.graphics.Paint paint3 = new android.graphics.Paint(1);
        paint3.setStyle(android.graphics.Paint.Style.FILL);
        paint3.setColor(android.graphics.Color.parseColor("#FFEF4444"));
        this.f244526e = paint3;
        android.graphics.Paint paint4 = new android.graphics.Paint(1);
        paint4.setStyle(android.graphics.Paint.Style.STROKE);
        paint4.setStrokeWidth(2.0f);
        paint4.setColor(-1);
        this.f244527f = paint4;
        android.graphics.Paint paint5 = new android.graphics.Paint(1);
        paint5.setColor(android.graphics.Color.parseColor(z17 ? "#FF888888" : "#FF999999"));
        paint5.setTextSize(android.util.TypedValue.applyDimension(2, 10.0f, context.getResources().getDisplayMetrics()));
        paint5.setTextAlign(android.graphics.Paint.Align.RIGHT);
        this.f244528g = paint5;
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setCornerRadius(android.util.TypedValue.applyDimension(1, 8.0f, context.getResources().getDisplayMetrics()));
        gradientDrawable.setColor(paint2.getColor());
        this.f244529h = gradientDrawable;
        setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        android.graphics.Paint paint;
        kotlin.jvm.internal.o.g(canvas, "canvas");
        super.onDraw(canvas);
        float width = getWidth();
        float height = getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        android.graphics.drawable.GradientDrawable gradientDrawable = this.f244529h;
        gradientDrawable.setBounds(0, 0, getWidth(), getHeight());
        gradientDrawable.draw(canvas);
        float applyDimension = android.util.TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics());
        float f17 = applyDimension;
        while (true) {
            paint = this.f244525d;
            if (f17 >= width) {
                break;
            }
            canvas.drawLine(f17, 0.0f, f17, height, paint);
            f17 += applyDimension;
        }
        for (float f18 = applyDimension; f18 < height; f18 += applyDimension) {
            canvas.drawLine(0.0f, f18, width, f18, paint);
        }
        float f19 = width / 2.0f;
        float f27 = height / 2.0f;
        float applyDimension2 = android.util.TypedValue.applyDimension(1, 9.0f, getResources().getDisplayMetrics());
        canvas.drawCircle(f19, f27, applyDimension2, this.f244526e);
        canvas.drawCircle(f19, f27, applyDimension2, this.f244527f);
        android.graphics.Rect rect = new android.graphics.Rect();
        android.graphics.Paint paint2 = this.f244528g;
        paint2.getTextBounds("mock map (android)", 0, 18, rect);
        canvas.drawText("mock map (android)", width - android.util.TypedValue.applyDimension(1, 8.0f, getResources().getDisplayMetrics()), height - android.util.TypedValue.applyDimension(1, 6.0f, getResources().getDisplayMetrics()), paint2);
    }
}
