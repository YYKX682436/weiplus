package com.tencent.mm.plugin.finder.view;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/AppMsgShopCardImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "finder-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class AppMsgShopCardImageView extends androidx.appcompat.widget.AppCompatImageView {

    /* renamed from: f, reason: collision with root package name */
    public final float f130814f;

    /* renamed from: g, reason: collision with root package name */
    public final float f130815g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Path f130816h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.Paint f130817i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AppMsgShopCardImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        float width = getWidth();
        float height = getHeight();
        android.graphics.Path path = this.f130816h;
        path.reset();
        float f17 = this.f130814f;
        path.moveTo(0.0f, f17);
        path.quadTo(0.0f, 0.0f, f17, 0.0f);
        path.lineTo(width - f17, 0.0f);
        path.quadTo(width, 0.0f, width, f17);
        path.lineTo(width, height);
        path.lineTo(0.0f, height);
        path.close();
        canvas.clipPath(path);
        super.onDraw(canvas);
        canvas.drawRect(0.0f, 0.0f, width, height, this.f130817i);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i17, int i18) {
        int mode = android.view.View.MeasureSpec.getMode(i17);
        int mode2 = android.view.View.MeasureSpec.getMode(i18);
        int size = android.view.View.MeasureSpec.getSize(i17);
        int size2 = android.view.View.MeasureSpec.getSize(i18);
        float f17 = this.f130815g;
        if (mode == 1073741824) {
            int i19 = (int) (size * f17);
            if (mode2 != Integer.MIN_VALUE || i19 <= size2) {
                size2 = i19;
            }
        } else {
            size = (int) getResources().getDimension(com.tencent.mm.R.dimen.f479649bo);
            size2 = (int) (size * f17);
        }
        setMeasuredDimension(size, size2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppMsgShopCardImageView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f130814f = getResources().getDimension(com.tencent.mm.R.dimen.f479646bl);
        this.f130815g = 0.32f;
        this.f130816h = new android.graphics.Path();
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setColor(android.graphics.Color.parseColor("#08000000"));
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.f130817i = paint;
    }
}
