package gm2;

/* loaded from: classes3.dex */
public class c extends gm2.a {

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.drawable.Drawable f273315d;

    /* renamed from: e, reason: collision with root package name */
    public wo.q1 f273316e;

    /* renamed from: f, reason: collision with root package name */
    public int f273317f;

    /* renamed from: g, reason: collision with root package name */
    public int f273318g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.graphics.drawable.Drawable drawable) {
        super(drawable);
        kotlin.jvm.internal.o.g(drawable, "drawable");
        this.f273316e = new wo.q1(0, 0);
        gm2.c1.f273320a.k();
    }

    @Override // gm2.y1
    public int a() {
        return getDrawable().getMinimumWidth();
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(android.graphics.Canvas canvas, java.lang.CharSequence charSequence, int i17, int i18, float f17, int i19, int i27, int i28, android.graphics.Paint paint) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        kotlin.jvm.internal.o.g(paint, "paint");
        int color = paint.getColor();
        float textSize = paint.getTextSize();
        int i29 = i28 - i19;
        float f18 = f17 + this.f273318g;
        android.graphics.drawable.Drawable drawable = this.f273315d;
        if (drawable != null) {
            if (this.f273317f != 0) {
                drawable.setColorFilter(new android.graphics.PorterDuffColorFilter(this.f273317f, android.graphics.PorterDuff.Mode.SRC_ATOP));
            }
            int i37 = i19 + ((i29 - this.f273316e.f447791b) / 2);
            drawable.setBounds(new android.graphics.Rect((int) f18, i37, (int) (f18 + r0.f447790a), this.f273316e.f447791b + i37));
            drawable.draw(canvas);
        }
        paint.setColor(color);
        paint.setTextSize(textSize);
    }
}
