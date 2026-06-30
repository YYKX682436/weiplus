package com.tencent.mm.plugin.finder.live.util;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\u0003\u001a\u00020\u0002R$\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/util/CommonCircleIndicator;", "Landroid/view/View;", "", "getIndicatorHeight", "", "value", "m", "I", "setSelected", "(I)V", "selected", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class CommonCircleIndicator extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public int f115424d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f115425e;

    /* renamed from: f, reason: collision with root package name */
    public final int f115426f;

    /* renamed from: g, reason: collision with root package name */
    public final int f115427g;

    /* renamed from: h, reason: collision with root package name */
    public final float f115428h;

    /* renamed from: i, reason: collision with root package name */
    public final float f115429i;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public int selected;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CommonCircleIndicator(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    private final void setSelected(int i17) {
        this.selected = java.lang.Math.min(this.f115424d - 1, i17);
        invalidate();
    }

    public final void a(int i17) {
        int i18 = this.f115424d;
        if (i17 >= i18) {
            i17 = i18 - 1;
        }
        setSelected(i17);
        invalidate();
    }

    /* renamed from: getIndicatorHeight, reason: from getter */
    public final float getF115428h() {
        return this.f115428h;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        super.onDraw(canvas);
        java.util.Iterator it = e06.p.m(0, this.f115424d).iterator();
        while (it.hasNext()) {
            int b17 = ((kz5.x0) it).b();
            int i17 = this.selected;
            android.graphics.Paint paint = this.f115425e;
            if (b17 == i17) {
                paint.setColor(this.f115426f);
            } else {
                paint.setColor(this.f115427g);
            }
            float f17 = this.f115429i;
            float f18 = this.f115428h;
            canvas.drawCircle((b17 * (f17 + f18)) + (f18 / 2.0f), f18 / 2.0f, f18 / 2.0f, paint);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        int i19;
        int i27 = this.f115424d;
        float f17 = this.f115428h;
        if (i27 > 0) {
            i19 = (int) ((i27 * f17) + (this.f115429i * (i27 - 1)));
        } else {
            i19 = 0;
        }
        setMeasuredDimension(i19, (int) f17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonCircleIndicator(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f115425e = new android.graphics.Paint(1);
        this.f115426f = b3.l.getColor(context, com.tencent.mm.R.color.BW_100_Alpha_0_6);
        this.f115427g = b3.l.getColor(context, com.tencent.mm.R.color.BW_100_Alpha_0_3);
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vd2.x5.f436006a, i17, 0);
            kotlin.jvm.internal.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
            this.f115426f = obtainStyledAttributes.getColor(3, getResources().getColor(com.tencent.mm.R.color.aaw));
            this.f115427g = obtainStyledAttributes.getColor(2, getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_3));
            this.f115428h = obtainStyledAttributes.getDimension(1, 12.0f);
            this.f115429i = obtainStyledAttributes.getDimension(0, 16.0f);
            obtainStyledAttributes.recycle();
        }
    }
}
