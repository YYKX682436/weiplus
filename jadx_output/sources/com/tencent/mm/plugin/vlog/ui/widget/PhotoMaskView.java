package com.tencent.mm.plugin.vlog.ui.widget;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB%\b\u0016\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/plugin/vlog/ui/widget/PhotoMaskView;", "Landroid/view/View;", "Landroid/graphics/RectF;", "rect", "Ljz5/f0;", "setVisibleRect", "Landroid/graphics/Rect;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-vlog_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class PhotoMaskView extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.RectF f176130d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f176131e;

    public PhotoMaskView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f176130d = new android.graphics.RectF();
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f176131e = paint;
        paint.setColor(-16777216);
        paint.setStyle(android.graphics.Paint.Style.FILL);
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        super.onDraw(canvas);
        android.graphics.RectF rectF = this.f176130d;
        if (rectF.isEmpty()) {
            return;
        }
        float width = getWidth();
        float f17 = rectF.top;
        android.graphics.Paint paint = this.f176131e;
        canvas.drawRect(0.0f, 0.0f, width, f17, paint);
        canvas.drawRect(0.0f, rectF.bottom, getWidth(), getHeight(), paint);
    }

    public final void setVisibleRect(android.graphics.RectF rect) {
        kotlin.jvm.internal.o.g(rect, "rect");
        this.f176130d.set(rect);
        invalidate();
    }

    public final void setVisibleRect(android.graphics.Rect rect) {
        kotlin.jvm.internal.o.g(rect, "rect");
        this.f176130d.set(rect);
        invalidate();
    }

    public PhotoMaskView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f176130d = new android.graphics.RectF();
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f176131e = paint;
        paint.setColor(-16777216);
        paint.setStyle(android.graphics.Paint.Style.FILL);
    }
}
