package com.tencent.mm.plugin.websearch.view;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B%\b\u0016\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB\u001d\b\u0016\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\fJ\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\r"}, d2 = {"Lcom/tencent/mm/plugin/websearch/view/CircleToSearchCropperView;", "Landroid/view/View;", "Landroid/graphics/RectF;", "getRect", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-websearch_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class CircleToSearchCropperView extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f181686d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f181687e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Paint f181688f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.RectF f181689g;

    public CircleToSearchCropperView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setColor(i65.a.d(getContext(), com.tencent.mm.R.color.UN_BW_0_Alpha_0_5));
        this.f181686d = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        paint2.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR));
        this.f181687e = paint2;
        android.graphics.Paint paint3 = new android.graphics.Paint(1);
        paint3.setColor(i65.a.d(getContext(), com.tencent.mm.R.color.f478553an));
        paint3.setStrokeWidth(ym5.x.a(getContext(), 2.0f));
        paint3.setStyle(android.graphics.Paint.Style.STROKE);
        this.f181688f = paint3;
        setLayerType(1, null);
    }

    /* renamed from: getRect, reason: from getter */
    public final android.graphics.RectF getF181689g() {
        return this.f181689g;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        super.onDraw(canvas);
        float width = getWidth();
        float height = getHeight();
        float a17 = ym5.x.a(getContext(), 8.0f);
        android.graphics.RectF rectF = this.f181689g;
        if (rectF != null) {
            canvas.drawRect(0.0f, 0.0f, width, height, this.f181686d);
            canvas.drawRoundRect(rectF, a17, a17, this.f181687e);
            canvas.drawRoundRect(rectF, a17, a17, this.f181688f);
        }
    }

    public CircleToSearchCropperView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setColor(i65.a.d(getContext(), com.tencent.mm.R.color.UN_BW_0_Alpha_0_5));
        this.f181686d = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        paint2.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR));
        this.f181687e = paint2;
        android.graphics.Paint paint3 = new android.graphics.Paint(1);
        paint3.setColor(i65.a.d(getContext(), com.tencent.mm.R.color.f478553an));
        paint3.setStrokeWidth(ym5.x.a(getContext(), 2.0f));
        paint3.setStyle(android.graphics.Paint.Style.STROKE);
        this.f181688f = paint3;
        setLayerType(1, null);
    }
}
