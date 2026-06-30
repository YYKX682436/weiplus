package s20;

/* loaded from: classes13.dex */
public final class d extends android.text.style.DynamicDrawableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final bw5.c7 f402273d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f402274e;

    /* renamed from: f, reason: collision with root package name */
    public s20.a f402275f;

    /* renamed from: g, reason: collision with root package name */
    public int f402276g;

    /* renamed from: h, reason: collision with root package name */
    public int f402277h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(bw5.c7 img, float f17, android.view.View view) {
        super(2);
        kotlin.jvm.internal.o.g(img, "img");
        kotlin.jvm.internal.o.g(view, "view");
        this.f402273d = img;
        this.f402274e = view;
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setTextSize(f17);
        android.graphics.Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        int i17 = fontMetricsInt.descent - fontMetricsInt.ascent;
        if (i17 <= 0) {
            return;
        }
        this.f402277h = i17;
        int i18 = img.f25954e;
        int b17 = a06.d.b(i17 * (i18 > 0 ? img.f25955f / i18 : 1.0f));
        this.f402276g = b17;
        if (b17 <= 0) {
            this.f402276g = 1;
        }
        if (this.f402277h <= 0) {
            this.f402277h = 1;
        }
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(android.graphics.Canvas canvas, java.lang.CharSequence charSequence, int i17, int i18, float f17, int i19, int i27, int i28, android.graphics.Paint paint) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        kotlin.jvm.internal.o.g(paint, "paint");
        android.graphics.drawable.Drawable drawable = getDrawable();
        canvas.save();
        canvas.translate(f17, ((i19 + i28) - drawable.getBounds().height()) / 2.0f);
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // android.text.style.DynamicDrawableSpan
    public android.graphics.drawable.Drawable getDrawable() {
        if (this.f402275f == null) {
            android.graphics.drawable.ColorDrawable colorDrawable = new android.graphics.drawable.ColorDrawable(0);
            colorDrawable.setBounds(0, 0, this.f402276g, this.f402277h);
            this.f402275f = new s20.a(colorDrawable, this.f402276g, this.f402277h);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startDowload. url= ");
            bw5.c7 c7Var = this.f402273d;
            sb6.append(c7Var.b());
            com.tencent.mars.xlog.Log.i("bufanwang", sb6.toString());
            q00.f fVar = new q00.f();
            fVar.f359251a = c7Var;
            fVar.b(new s20.c(this));
            fVar.a();
        }
        s20.a aVar = this.f402275f;
        kotlin.jvm.internal.o.d(aVar);
        return aVar;
    }
}
