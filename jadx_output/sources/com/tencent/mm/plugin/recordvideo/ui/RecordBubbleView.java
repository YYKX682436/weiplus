package com.tencent.mm.plugin.recordvideo.ui;

/* loaded from: classes4.dex */
public class RecordBubbleView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public int f155898d;

    /* renamed from: e, reason: collision with root package name */
    public final int f155899e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Point f155900f;

    /* renamed from: g, reason: collision with root package name */
    public int f155901g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Paint f155902h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.Path f155903i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.RectF f155904m;

    public RecordBubbleView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f155899e = 4;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f155902h = paint;
        paint.setAntiAlias(true);
        this.f155902h.setStyle(android.graphics.Paint.Style.FILL);
        this.f155902h.setColor(android.graphics.Color.parseColor("#B3666666"));
        this.f155903i = new android.graphics.Path();
        this.f155904m = new android.graphics.RectF();
        this.f155900f = new android.graphics.Point();
        setWillNotDraw(false);
        setLayerType(1, null);
        this.f155898d = i65.a.h(context, com.tencent.mm.R.dimen.aih);
    }

    public final void a() {
        int i17 = this.f155899e;
        if (i17 != 1) {
            if (i17 != 2) {
                if (i17 != 3) {
                    if (i17 != 4) {
                        return;
                    }
                }
            }
            this.f155900f.x += this.f155901g;
            return;
        }
        this.f155900f.y += this.f155901g;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        int paddingBottom;
        super.onDraw(canvas);
        android.graphics.Point point = this.f155900f;
        if (point.x <= 0 || point.y <= 0) {
            return;
        }
        int i17 = this.f155899e;
        if (i17 == 1) {
            int paddingLeft = getPaddingLeft();
            if (paddingLeft == 0) {
                return;
            }
            android.graphics.Path path = this.f155903i;
            android.graphics.RectF rectF = this.f155904m;
            float f17 = this.f155898d;
            path.addRoundRect(rectF, f17, f17, android.graphics.Path.Direction.CCW);
            android.graphics.Path path2 = this.f155903i;
            android.graphics.Point point2 = this.f155900f;
            int i18 = paddingLeft / 2;
            path2.moveTo(point2.x, point2.y - i18);
            android.graphics.Path path3 = this.f155903i;
            android.graphics.Point point3 = this.f155900f;
            path3.lineTo(point3.x - i18, point3.y);
            android.graphics.Path path4 = this.f155903i;
            android.graphics.Point point4 = this.f155900f;
            path4.lineTo(point4.x, point4.y + i18);
            this.f155903i.close();
            canvas.drawPath(this.f155903i, this.f155902h);
            return;
        }
        if (i17 == 2) {
            int paddingTop = getPaddingTop();
            if (paddingTop == 0) {
                return;
            }
            android.graphics.Path path5 = this.f155903i;
            android.graphics.RectF rectF2 = this.f155904m;
            float f18 = this.f155898d;
            path5.addRoundRect(rectF2, f18, f18, android.graphics.Path.Direction.CCW);
            android.graphics.Path path6 = this.f155903i;
            android.graphics.Point point5 = this.f155900f;
            int i19 = paddingTop / 2;
            path6.moveTo(point5.x + i19, point5.y);
            android.graphics.Path path7 = this.f155903i;
            android.graphics.Point point6 = this.f155900f;
            path7.lineTo(point6.x, point6.y - i19);
            android.graphics.Path path8 = this.f155903i;
            android.graphics.Point point7 = this.f155900f;
            path8.lineTo(point7.x - i19, point7.y);
            this.f155903i.close();
            canvas.drawPath(this.f155903i, this.f155902h);
            return;
        }
        if (i17 != 3) {
            if (i17 == 4 && (paddingBottom = getPaddingBottom()) != 0) {
                android.graphics.Path path9 = this.f155903i;
                android.graphics.RectF rectF3 = this.f155904m;
                float f19 = this.f155898d;
                path9.addRoundRect(rectF3, f19, f19, android.graphics.Path.Direction.CCW);
                android.graphics.Path path10 = this.f155903i;
                android.graphics.Point point8 = this.f155900f;
                int i27 = paddingBottom / 2;
                path10.moveTo(point8.x + i27, point8.y);
                android.graphics.Path path11 = this.f155903i;
                android.graphics.Point point9 = this.f155900f;
                path11.lineTo(point9.x, point9.y + i27);
                android.graphics.Path path12 = this.f155903i;
                android.graphics.Point point10 = this.f155900f;
                path12.lineTo(point10.x - i27, point10.y);
                this.f155903i.close();
                canvas.drawPath(this.f155903i, this.f155902h);
                return;
            }
            return;
        }
        int paddingRight = getPaddingRight();
        if (paddingRight == 0) {
            return;
        }
        android.graphics.Path path13 = this.f155903i;
        android.graphics.RectF rectF4 = this.f155904m;
        float f27 = this.f155898d;
        path13.addRoundRect(rectF4, f27, f27, android.graphics.Path.Direction.CCW);
        android.graphics.Path path14 = this.f155903i;
        android.graphics.Point point11 = this.f155900f;
        int i28 = paddingRight / 2;
        path14.moveTo(point11.x, point11.y - i28);
        android.graphics.Path path15 = this.f155903i;
        android.graphics.Point point12 = this.f155900f;
        path15.lineTo(point12.x + i28, point12.y);
        android.graphics.Path path16 = this.f155903i;
        android.graphics.Point point13 = this.f155900f;
        path16.lineTo(point13.x, point13.y + i28);
        this.f155903i.close();
        canvas.drawPath(this.f155903i, this.f155902h);
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        android.graphics.RectF rectF = this.f155904m;
        rectF.left = 0.0f;
        rectF.top = 0.0f;
        rectF.right = i17;
        rectF.bottom = i18 - (getPaddingBottom() / 2);
        if (this.f155899e == 4) {
            android.graphics.Point point = this.f155900f;
            point.x = i17 / 2;
            point.y = i18 - (getPaddingBottom() / 2);
        }
        if (this.f155901g != 0) {
            a();
        }
    }

    public void setOffset(int i17) {
        this.f155901g = i17;
    }

    public void setTriangleOffset(int i17) {
        this.f155901g = i17;
        a();
        invalidate();
    }
}
