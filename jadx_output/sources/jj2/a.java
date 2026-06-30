package jj2;

/* loaded from: classes10.dex */
public abstract class a extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f299970d;

    /* renamed from: e, reason: collision with root package name */
    public float f299971e;

    /* renamed from: f, reason: collision with root package name */
    public float f299972f;

    /* renamed from: g, reason: collision with root package name */
    public float f299973g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(android.content.Context context, jj2.d data) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(data, "data");
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f299970d = paint;
        b(data);
        paint.setAntiAlias(true);
        setVisibility(8);
    }

    public abstract void a(android.graphics.Canvas canvas);

    public final void b(jj2.d data) {
        kotlin.jvm.internal.o.g(data, "data");
        int i17 = data.f299975b;
        android.graphics.Paint paint = this.f299970d;
        paint.setColor(i17);
        paint.setStyle(data.f299978e);
        paint.setStrokeWidth(data.f299974a);
        this.f299973g = data.f299976c;
        paint.setAlpha(data.f299977d);
        if (this.f299971e == 0.0f) {
            return;
        }
        if (this.f299972f == 0.0f) {
            return;
        }
        invalidate();
    }

    public final float getCircleRadius() {
        return this.f299973g;
    }

    public final android.graphics.Paint getPaint() {
        return this.f299970d;
    }

    public final float getViewHeight() {
        return this.f299972f;
    }

    public final float getViewWidth() {
        return this.f299971e;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        super.onDraw(canvas);
        a(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        int size = android.view.View.MeasureSpec.getSize(i17);
        int size2 = android.view.View.MeasureSpec.getSize(i18);
        float f17 = size;
        this.f299971e = f17;
        float f18 = size2;
        this.f299972f = f18;
        setMeasuredDimension((int) f17, (int) f18);
    }

    public final void setCircleRadius(float f17) {
        this.f299973g = f17;
    }

    public final void setViewHeight(float f17) {
        this.f299972f = f17;
    }

    public final void setViewWidth(float f17) {
        this.f299971e = f17;
    }
}
