package com.tencent.mm.ui.widget.cropview;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dB%\b\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001c\u0010 J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001b\u0010\u000b\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001b\u0010\u000e\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u001b\u0010\u0011\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\b\u001a\u0004\b\u0010\u0010\nR\u001b\u0010\u0014\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0013\u0010\nR\u001b\u0010\u0017\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\b\u001a\u0004\b\u0016\u0010\n¨\u0006!"}, d2 = {"Lcom/tencent/mm/ui/widget/cropview/BorderView;", "Landroid/view/View;", "Landroid/graphics/Rect;", "rect", "Ljz5/f0;", "setBorderRect", "", "d", "Ljz5/g;", "getBOX_LINE_WIDTH", "()F", "BOX_LINE_WIDTH", "e", "getBOX_GIRD_WIDTH", "BOX_GIRD_WIDTH", "f", "getCORNER_WIDTH", "CORNER_WIDTH", "g", "getBOX_PADDING", "BOX_PADDING", "h", "getCORNER_LENGTH", "CORNER_LENGTH", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class BorderView extends android.view.View {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final jz5.g BOX_LINE_WIDTH;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final jz5.g BOX_GIRD_WIDTH;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final jz5.g CORNER_WIDTH;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final jz5.g BOX_PADDING;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final jz5.g CORNER_LENGTH;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.Path f211642i;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.Paint f211643m;

    /* renamed from: n, reason: collision with root package name */
    public final android.graphics.Paint f211644n;

    /* renamed from: o, reason: collision with root package name */
    public final android.graphics.Paint f211645o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f211646p;

    /* renamed from: q, reason: collision with root package name */
    public final android.graphics.Rect f211647q;

    /* renamed from: r, reason: collision with root package name */
    public android.graphics.Rect f211648r;

    /* renamed from: s, reason: collision with root package name */
    public final android.graphics.Rect f211649s;

    public BorderView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.BOX_LINE_WIDTH = jz5.h.b(new ml5.c(this));
        this.BOX_GIRD_WIDTH = jz5.h.b(new ml5.b(this));
        this.CORNER_WIDTH = jz5.h.b(new ml5.f(this));
        this.BOX_PADDING = jz5.h.b(new ml5.d(this));
        this.CORNER_LENGTH = jz5.h.b(new ml5.e(this));
        this.f211642i = new android.graphics.Path();
        this.f211643m = new android.graphics.Paint();
        this.f211644n = new android.graphics.Paint();
        this.f211645o = new android.graphics.Paint();
        this.f211647q = new android.graphics.Rect();
        this.f211649s = new android.graphics.Rect();
    }

    private final float getBOX_GIRD_WIDTH() {
        return ((java.lang.Number) this.BOX_GIRD_WIDTH.getValue()).floatValue();
    }

    private final float getBOX_LINE_WIDTH() {
        return ((java.lang.Number) this.BOX_LINE_WIDTH.getValue()).floatValue();
    }

    private final float getBOX_PADDING() {
        return ((java.lang.Number) this.BOX_PADDING.getValue()).floatValue();
    }

    private final float getCORNER_LENGTH() {
        return ((java.lang.Number) this.CORNER_LENGTH.getValue()).floatValue();
    }

    private final float getCORNER_WIDTH() {
        return ((java.lang.Number) this.CORNER_WIDTH.getValue()).floatValue();
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        super.onDraw(canvas);
        android.graphics.Rect rect = this.f211648r;
        if (rect == null) {
            kotlin.jvm.internal.o.o("currentRect");
            throw null;
        }
        android.graphics.Rect rect2 = this.f211649s;
        boolean equals = rect.equals(rect2);
        android.graphics.Path path = this.f211642i;
        android.graphics.Rect rect3 = this.f211647q;
        if (!equals) {
            android.graphics.Rect rect4 = this.f211648r;
            if (rect4 == null) {
                kotlin.jvm.internal.o.o("currentRect");
                throw null;
            }
            rect2.set(rect4);
            android.graphics.Rect rect5 = this.f211648r;
            if (rect5 == null) {
                kotlin.jvm.internal.o.o("currentRect");
                throw null;
            }
            int box_padding = rect5.left + ((int) getBOX_PADDING());
            android.graphics.Rect rect6 = this.f211648r;
            if (rect6 == null) {
                kotlin.jvm.internal.o.o("currentRect");
                throw null;
            }
            int box_padding2 = rect6.top + ((int) getBOX_PADDING());
            android.graphics.Rect rect7 = this.f211648r;
            if (rect7 == null) {
                kotlin.jvm.internal.o.o("currentRect");
                throw null;
            }
            int box_padding3 = rect7.right - ((int) getBOX_PADDING());
            android.graphics.Rect rect8 = this.f211648r;
            if (rect8 == null) {
                kotlin.jvm.internal.o.o("currentRect");
                throw null;
            }
            rect3.set(box_padding, box_padding2, box_padding3, rect8.bottom - ((int) getBOX_PADDING()));
            path.reset();
            for (int i17 = 1; i17 < 3; i17++) {
                path.moveTo(rect3.left + ((rect3.width() / 3) * i17), rect3.top);
                path.lineTo(rect3.left + ((rect3.width() / 3) * i17), rect3.bottom);
                path.moveTo(rect3.left, rect3.top + ((rect3.height() / 3) * i17));
                path.lineTo(rect3.right, rect3.top + ((rect3.height() / 3) * i17));
            }
        }
        canvas.drawPath(path, this.f211644n);
        canvas.drawRect(rect3, this.f211643m);
        float f17 = 2;
        canvas.drawLine(rect3.left - getCORNER_WIDTH(), rect3.top - (getCORNER_WIDTH() / f17), rect3.left + getCORNER_LENGTH(), rect3.top - (getCORNER_WIDTH() / f17), this.f211645o);
        canvas.drawLine((rect3.right - getCORNER_LENGTH()) + (getCORNER_WIDTH() / f17), rect3.top - (getCORNER_WIDTH() / f17), rect3.right + getCORNER_WIDTH(), rect3.top - (getCORNER_WIDTH() / f17), this.f211645o);
        canvas.drawLine(rect3.left - (getCORNER_WIDTH() / f17), rect3.top - (getCORNER_WIDTH() / f17), rect3.left - (getCORNER_WIDTH() / f17), rect3.top + getCORNER_LENGTH(), this.f211645o);
        canvas.drawLine(rect3.left - (getCORNER_WIDTH() / f17), (rect3.bottom - getCORNER_LENGTH()) + (getCORNER_WIDTH() / f17), rect3.left - (getCORNER_WIDTH() / f17), rect3.bottom + (getCORNER_WIDTH() / f17), this.f211645o);
        canvas.drawLine(rect3.right + (getCORNER_WIDTH() / f17), rect3.top, rect3.right + (getCORNER_WIDTH() / f17), rect3.top + getCORNER_LENGTH(), this.f211645o);
        canvas.drawLine(rect3.right + (getCORNER_WIDTH() / f17), (rect3.bottom - getCORNER_LENGTH()) + (getCORNER_WIDTH() / f17), rect3.right + (getCORNER_WIDTH() / f17), rect3.bottom + (getCORNER_WIDTH() / f17), this.f211645o);
        canvas.drawLine(rect3.left - getCORNER_WIDTH(), rect3.bottom + (getCORNER_WIDTH() / f17), rect3.left + getCORNER_LENGTH(), rect3.bottom + (getCORNER_WIDTH() / f17), this.f211645o);
        canvas.drawLine(rect3.right - getCORNER_LENGTH(), rect3.bottom + (getCORNER_WIDTH() / f17), rect3.right + getCORNER_WIDTH(), rect3.bottom + (getCORNER_WIDTH() / f17), this.f211645o);
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        if (this.f211646p) {
            return;
        }
        this.f211646p = true;
        android.graphics.Paint paint = this.f211643m;
        paint.setColor(-1);
        paint.setStrokeWidth(getBOX_LINE_WIDTH());
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setAntiAlias(true);
        android.graphics.Paint paint2 = this.f211644n;
        paint2.set(paint);
        paint2.setStrokeWidth(getBOX_GIRD_WIDTH());
        android.graphics.Paint paint3 = this.f211645o;
        paint3.set(paint);
        paint3.setStrokeWidth(getCORNER_WIDTH());
    }

    public final void setBorderRect(android.graphics.Rect rect) {
        kotlin.jvm.internal.o.g(rect, "rect");
        this.f211648r = rect;
    }

    public BorderView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.BOX_LINE_WIDTH = jz5.h.b(new ml5.c(this));
        this.BOX_GIRD_WIDTH = jz5.h.b(new ml5.b(this));
        this.CORNER_WIDTH = jz5.h.b(new ml5.f(this));
        this.BOX_PADDING = jz5.h.b(new ml5.d(this));
        this.CORNER_LENGTH = jz5.h.b(new ml5.e(this));
        this.f211642i = new android.graphics.Path();
        this.f211643m = new android.graphics.Paint();
        this.f211644n = new android.graphics.Paint();
        this.f211645o = new android.graphics.Paint();
        this.f211647q = new android.graphics.Rect();
        this.f211649s = new android.graphics.Rect();
    }
}
