package com.tencent.mm.plugin.recordvideo.ui.editor;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010B!\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0012J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002¨\u0006\u0013"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/ui/editor/RoundCornerAudioWaveView;", "Landroid/view/View;", "", "color", "Ljz5/f0;", "setColor", "", "isShow", "setShow", "count", "setWaveCount", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class RoundCornerAudioWaveView extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final float f156075d;

    /* renamed from: e, reason: collision with root package name */
    public final int f156076e;

    /* renamed from: f, reason: collision with root package name */
    public final float f156077f;

    /* renamed from: g, reason: collision with root package name */
    public final int f156078g;

    /* renamed from: h, reason: collision with root package name */
    public final float f156079h;

    /* renamed from: i, reason: collision with root package name */
    public float f156080i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.Paint f156081m;

    /* renamed from: n, reason: collision with root package name */
    public int f156082n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f156083o;

    /* renamed from: p, reason: collision with root package name */
    public android.graphics.RectF[] f156084p;

    /* renamed from: q, reason: collision with root package name */
    public float[] f156085q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundCornerAudioWaveView(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        int a17 = com.tencent.mm.ui.zk.a(getContext(), 1);
        float f17 = a17;
        float f18 = 1.5f * f17;
        this.f156075d = f18;
        this.f156076e = a17;
        this.f156077f = 2.0f * f17;
        this.f156078g = a17;
        this.f156079h = f18;
        this.f156080i = f17 * 9.0f;
        int i17 = this.f156082n;
        android.graphics.RectF[] rectFArr = new android.graphics.RectF[i17];
        for (int i18 = 0; i18 < i17; i18++) {
            rectFArr[i18] = new android.graphics.RectF();
        }
        this.f156084p = rectFArr;
        this.f156085q = new float[this.f156082n];
        a();
    }

    public final void a() {
        setWaveCount(20);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f156081m = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        android.graphics.Paint paint2 = this.f156081m;
        kotlin.jvm.internal.o.d(paint2);
        paint2.setColor(-3355444);
        android.graphics.Paint paint3 = this.f156081m;
        kotlin.jvm.internal.o.d(paint3);
        paint3.setAntiAlias(true);
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        android.graphics.RectF[] rectFArr = this.f156084p;
        int length = rectFArr.length;
        float f17 = 0.0f;
        int i17 = 0;
        int i18 = 0;
        while (i17 < length) {
            android.graphics.RectF rectF = rectFArr[i17];
            int i19 = i18 + 1;
            float height = rectF.height();
            int i27 = this.f156076e;
            if (height <= i27) {
                this.f156085q[i18] = (float) (this.f156080i * java.lang.Math.random());
            } else {
                float[] fArr = this.f156085q;
                if (height >= fArr[i18]) {
                    fArr[i18] = i27;
                }
            }
            float min = height <= this.f156085q[i18] ? java.lang.Math.min(height + this.f156077f, this.f156080i) : java.lang.Math.max(height - this.f156078g, i27);
            float f18 = this.f156079h;
            float f19 = this.f156080i;
            float f27 = 2;
            float f28 = min / f27;
            float f29 = f17 + f18;
            float f37 = this.f156075d;
            rectF.set(f17 + f18, (f19 / f27) - f28, f29 + f37, (f19 / f27) + f28);
            f17 = rectF.right;
            android.graphics.Paint paint = this.f156081m;
            kotlin.jvm.internal.o.d(paint);
            canvas.drawRoundRect(rectF, f37 / f27, f37 / f27, paint);
            i17++;
            i18 = i19;
        }
        if (this.f156083o) {
            postInvalidateDelayed(33L);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        this.f156080i = i18;
    }

    public final void setColor(int i17) {
        android.graphics.Paint paint = this.f156081m;
        kotlin.jvm.internal.o.d(paint);
        paint.setColor(i17);
    }

    public final void setShow(boolean z17) {
        this.f156083o = z17;
    }

    public final void setWaveCount(int i17) {
        this.f156082n = i17;
        android.graphics.RectF[] rectFArr = new android.graphics.RectF[i17];
        for (int i18 = 0; i18 < i17; i18++) {
            rectFArr[i18] = new android.graphics.RectF();
        }
        this.f156084p = rectFArr;
        this.f156085q = new float[this.f156082n];
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundCornerAudioWaveView(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        int a17 = com.tencent.mm.ui.zk.a(getContext(), 1);
        float f17 = a17;
        float f18 = 1.5f * f17;
        this.f156075d = f18;
        this.f156076e = a17;
        this.f156077f = 2.0f * f17;
        this.f156078g = a17;
        this.f156079h = f18;
        this.f156080i = f17 * 9.0f;
        int i18 = this.f156082n;
        android.graphics.RectF[] rectFArr = new android.graphics.RectF[i18];
        for (int i19 = 0; i19 < i18; i19++) {
            rectFArr[i19] = new android.graphics.RectF();
        }
        this.f156084p = rectFArr;
        this.f156085q = new float[this.f156082n];
        a();
    }
}
