package com.tencent.mm.plugin.recordvideo.ui.editor.view;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B#\u0012\b\u0010'\u001a\u0004\u0018\u00010&\u0012\b\u0010)\u001a\u0004\u0018\u00010(\u0012\u0006\u0010*\u001a\u00020\u0006¢\u0006\u0004\b+\u0010,B\u001d\b\u0016\u0012\b\u0010'\u001a\u0004\u0018\u00010&\u0012\b\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b+\u0010-J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0006R\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0015\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\"\u0010\u0019\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R\"\u0010\u001d\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\f\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R0\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006."}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/ui/editor/view/TextColorSelector;", "Landroid/view/View;", "", "colorArray", "Ljz5/f0;", "setColorList", "", "select", "setSelected", "getSelected", "", "m", "F", "getRadiusNormalInner", "()F", "setRadiusNormalInner", "(F)V", "radiusNormalInner", "n", "getRadiusNormalOuter", "setRadiusNormalOuter", "radiusNormalOuter", "o", "getRadiusSelectInner", "setRadiusSelectInner", "radiusSelectInner", "p", "getRadiusSelectOuter", "setRadiusSelectOuter", "radiusSelectOuter", "Lkotlin/Function1;", "q", "Lyz5/l;", "getColorSelectedCallback", "()Lyz5/l;", "setColorSelectedCallback", "(Lyz5/l;)V", "colorSelectedCallback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class TextColorSelector extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final int f156440d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f156441e;

    /* renamed from: f, reason: collision with root package name */
    public float f156442f;

    /* renamed from: g, reason: collision with root package name */
    public int[] f156443g;

    /* renamed from: h, reason: collision with root package name */
    public int f156444h;

    /* renamed from: i, reason: collision with root package name */
    public int f156445i;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public float radiusNormalInner;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public float radiusNormalOuter;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public float radiusSelectInner;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public float radiusSelectOuter;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public yz5.l colorSelectedCallback;

    public TextColorSelector(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f156440d = -1;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f156441e = paint;
        this.f156443g = new int[0];
        this.f156444h = -1;
        this.f156445i = -1;
        this.radiusNormalInner = getResources().getDimension(com.tencent.mm.R.dimen.f480320uh);
        this.radiusNormalOuter = getResources().getDimension(com.tencent.mm.R.dimen.f480321ui);
        this.radiusSelectInner = getResources().getDimension(com.tencent.mm.R.dimen.f480322uj);
        this.radiusSelectOuter = getResources().getDimension(com.tencent.mm.R.dimen.f480323uk);
        paint.setStyle(android.graphics.Paint.Style.FILL);
    }

    public final int a(float f17, float f18) {
        int round;
        int measuredHeight = getMeasuredHeight();
        int i17 = (int) f18;
        boolean z17 = false;
        if (i17 >= 0 && i17 <= measuredHeight) {
            z17 = true;
        }
        if (!z17 || (round = java.lang.Math.round(((f17 - getPaddingLeft()) - this.radiusNormalOuter) / this.f156442f)) < 0 || round >= this.f156443g.length) {
            return -1;
        }
        return round;
    }

    public final yz5.l getColorSelectedCallback() {
        return this.colorSelectedCallback;
    }

    public final float getRadiusNormalInner() {
        return this.radiusNormalInner;
    }

    public final float getRadiusNormalOuter() {
        return this.radiusNormalOuter;
    }

    public final float getRadiusSelectInner() {
        return this.radiusSelectInner;
    }

    public final float getRadiusSelectOuter() {
        return this.radiusSelectOuter;
    }

    /* renamed from: getSelected, reason: from getter */
    public final int getF156445i() {
        return this.f156445i;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        super.onDraw(canvas);
        this.f156442f = (((getWidth() - getPaddingLeft()) - getPaddingRight()) - (this.radiusNormalOuter * 2)) / (this.f156443g.length - 1);
        float height = getHeight() / 2.0f;
        int length = this.f156443g.length;
        for (int i17 = 0; i17 < length; i17++) {
            float paddingLeft = (this.f156442f * i17) + this.radiusNormalOuter + getPaddingLeft();
            android.graphics.Paint paint = this.f156441e;
            paint.setColor(this.f156440d);
            if (i17 == this.f156445i) {
                canvas.drawCircle(paddingLeft, height, this.radiusSelectOuter, paint);
            } else {
                canvas.drawCircle(paddingLeft, height, this.radiusNormalOuter, paint);
            }
            paint.setColor(this.f156443g[i17]);
            if (i17 == this.f156445i) {
                canvas.drawCircle(paddingLeft, height, this.radiusSelectInner, paint);
            } else {
                canvas.drawCircle(paddingLeft, height, this.radiusNormalInner, paint);
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            this.f156444h = a(event.getX(), event.getY());
        } else if (actionMasked == 1) {
            int a17 = a(event.getX(), event.getY());
            if (a17 >= 0 && a17 == this.f156444h) {
                this.f156445i = a17;
                yz5.l lVar = this.colorSelectedCallback;
                if (lVar != null) {
                    lVar.invoke(java.lang.Integer.valueOf(a17));
                }
            }
            this.f156444h = -1;
            postInvalidate();
        } else if (actionMasked == 3) {
            this.f156444h = -1;
        }
        return true;
    }

    public final void setColorList(int[] colorArray) {
        kotlin.jvm.internal.o.g(colorArray, "colorArray");
        this.f156443g = colorArray;
    }

    public final void setColorSelectedCallback(yz5.l lVar) {
        this.colorSelectedCallback = lVar;
    }

    public final void setRadiusNormalInner(float f17) {
        this.radiusNormalInner = f17;
    }

    public final void setRadiusNormalOuter(float f17) {
        this.radiusNormalOuter = f17;
    }

    public final void setRadiusSelectInner(float f17) {
        this.radiusSelectInner = f17;
    }

    public final void setRadiusSelectOuter(float f17) {
        this.radiusSelectOuter = f17;
    }

    public final void setSelected(int i17) {
        this.f156445i = i17;
    }

    public TextColorSelector(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
