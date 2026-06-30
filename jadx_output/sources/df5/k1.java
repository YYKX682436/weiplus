package df5;

/* loaded from: classes14.dex */
public final class k1 extends android.widget.TextView {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f232145d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Path f232146e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.RectF f232147f;

    /* renamed from: g, reason: collision with root package name */
    public final float f232148g;

    /* renamed from: h, reason: collision with root package name */
    public final int f232149h;

    /* renamed from: i, reason: collision with root package name */
    public final int f232150i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(android.content.Context context, v11.b0 inlineStyleConfig) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(inlineStyleConfig, "inlineStyleConfig");
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        paint.setColor(inlineStyleConfig.f432340h);
        this.f232145d = paint;
        this.f232146e = new android.graphics.Path();
        this.f232147f = new android.graphics.RectF();
        this.f232148g = inlineStyleConfig.f432341i;
        this.f232149h = inlineStyleConfig.f432342j;
        this.f232150i = inlineStyleConfig.f432344l;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        android.text.Spanned spanned;
        df5.v0[] v0VarArr;
        boolean z17;
        int i17;
        int i18;
        int i19;
        int lineForOffset;
        int lineForOffset2;
        float[] fArr;
        kotlin.jvm.internal.o.g(canvas, "canvas");
        android.text.Layout layout = getLayout();
        if (layout != null) {
            java.lang.CharSequence text = getText();
            android.text.Spanned spanned2 = text instanceof android.text.Spanned ? (android.text.Spanned) text : null;
            if (spanned2 != null) {
                boolean z18 = false;
                df5.v0[] v0VarArr2 = (df5.v0[]) spanned2.getSpans(0, spanned2.length(), df5.v0.class);
                kotlin.jvm.internal.o.d(v0VarArr2);
                if (!(v0VarArr2.length == 0)) {
                    int save = canvas.save();
                    canvas.translate(getTotalPaddingLeft(), getTotalPaddingTop());
                    canvas.clipRect(getScrollX(), getScrollY(), ((getScrollX() + getWidth()) - getTotalPaddingLeft()) - getTotalPaddingRight(), ((getScrollY() + getHeight()) - getTotalPaddingTop()) - getTotalPaddingBottom());
                    int length = v0VarArr2.length;
                    int i27 = 0;
                    while (i27 < length) {
                        df5.v0 v0Var = v0VarArr2[i27];
                        int spanStart = spanned2.getSpanStart(v0Var);
                        int spanEnd = spanned2.getSpanEnd(v0Var);
                        if (spanStart >= spanEnd || (i18 = spanStart + 2) >= spanEnd - 2 || (lineForOffset = layout.getLineForOffset(i18)) > (lineForOffset2 = layout.getLineForOffset(i19))) {
                            spanned = spanned2;
                            v0VarArr = v0VarArr2;
                            z17 = z18;
                            i17 = length;
                        } else {
                            int i28 = lineForOffset;
                            while (true) {
                                int lineStart = layout.getLineStart(i28);
                                int lineEnd = layout.getLineEnd(i28);
                                int max = java.lang.Math.max(i18, lineStart);
                                spanned = spanned2;
                                int min = java.lang.Math.min(i19, lineEnd);
                                if (max < min) {
                                    float primaryHorizontal = layout.getPrimaryHorizontal(max);
                                    boolean z19 = max == lineStart;
                                    int i29 = this.f232149h;
                                    if (!z19) {
                                        primaryHorizontal -= i29;
                                    }
                                    float f17 = primaryHorizontal;
                                    float min2 = min == lineEnd ? java.lang.Math.min(layout.getLineRight(i28) + i29, getWidth() - getPaddingRight()) : layout.getPrimaryHorizontal(min) + i29;
                                    float lineBaseline = layout.getLineBaseline(i28);
                                    float ascent = getPaint().ascent() + lineBaseline;
                                    v0VarArr = v0VarArr2;
                                    float f18 = this.f232150i;
                                    i17 = length;
                                    float max2 = java.lang.Math.max(ascent + f18, layout.getLineTop(i28));
                                    float min3 = java.lang.Math.min((lineBaseline + getPaint().descent()) - f18, layout.getLineBottom(i28));
                                    android.graphics.RectF rectF = this.f232147f;
                                    rectF.set(f17, max2, min2, min3);
                                    android.graphics.Path path = this.f232146e;
                                    path.reset();
                                    boolean z27 = i28 == lineForOffset;
                                    boolean z28 = i28 == lineForOffset2;
                                    float f19 = this.f232148g;
                                    if (z27 && z28) {
                                        fArr = new float[]{f19, f19, f19, f19, f19, f19, f19, f19};
                                        z17 = false;
                                    } else if (z27) {
                                        z17 = false;
                                        fArr = new float[]{f19, f19, 0.0f, 0.0f, 0.0f, 0.0f, f19, f19};
                                    } else {
                                        z17 = false;
                                        fArr = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
                                        if (z28) {
                                            fArr[0] = 0.0f;
                                            fArr[1] = 0.0f;
                                            fArr[2] = f19;
                                            fArr[3] = f19;
                                            fArr[4] = f19;
                                            fArr[5] = f19;
                                            fArr[6] = 0.0f;
                                            fArr[7] = 0.0f;
                                        }
                                    }
                                    path.addRoundRect(rectF, fArr, android.graphics.Path.Direction.CW);
                                    canvas.drawPath(path, this.f232145d);
                                } else {
                                    v0VarArr = v0VarArr2;
                                    i17 = length;
                                    z17 = false;
                                }
                                if (i28 != lineForOffset2) {
                                    i28++;
                                    spanned2 = spanned;
                                    v0VarArr2 = v0VarArr;
                                    length = i17;
                                }
                            }
                        }
                        i27++;
                        z18 = z17;
                        spanned2 = spanned;
                        v0VarArr2 = v0VarArr;
                        length = i17;
                    }
                    canvas.restoreToCount(save);
                }
            }
        }
        super.onDraw(canvas);
    }
}
