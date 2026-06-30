package vm2;

/* loaded from: classes3.dex */
public final class z extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final int f438134d;

    /* renamed from: e, reason: collision with root package name */
    public final int f438135e;

    /* renamed from: f, reason: collision with root package name */
    public final int f438136f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.Paint f438137g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f438138h;

    /* renamed from: i, reason: collision with root package name */
    public final int f438139i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(android.content.Context context, int i17, int i18, int i19) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f438134d = i17;
        this.f438135e = i18;
        this.f438136f = i19;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f438137g = paint;
        this.f438139i = i19 - i18;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        paint.setAntiAlias(true);
    }

    public final int getColor() {
        return this.f438134d;
    }

    public final int getSelectedStokeWidth() {
        return this.f438136f;
    }

    public final int getUnselectedStokeWidth() {
        return this.f438135e;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        android.graphics.Paint paint = this.f438137g;
        paint.setColor(-1);
        boolean z17 = this.f438138h;
        int i17 = this.f438136f;
        int i18 = this.f438134d;
        if (z17) {
            canvas.drawCircle(width, height, width, paint);
            paint.setColor(i18);
            canvas.drawCircle(width, height, width - i17, paint);
        } else {
            canvas.drawCircle(width, height, width - this.f438139i, paint);
            paint.setColor(i18);
            canvas.drawCircle(width, height, width - i17, paint);
        }
        super.onDraw(canvas);
    }

    public final void setHasSelected(boolean z17) {
        if (this.f438138h != z17) {
            this.f438138h = z17;
            invalidate();
        }
    }
}
