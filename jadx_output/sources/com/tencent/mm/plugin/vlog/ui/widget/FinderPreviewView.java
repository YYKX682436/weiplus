package com.tencent.mm.plugin.vlog.ui.widget;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/vlog/ui/widget/FinderPreviewView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-vlog_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderPreviewView extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f176115d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f176116e;

    public FinderPreviewView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f176115d = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.f176116e = paint2;
        paint.setColor(-1);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(i65.a.b(getContext(), 2));
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint2.setColor(android.graphics.Color.parseColor("#4DFFFFFF"));
        paint2.setAntiAlias(true);
        paint2.setStrokeWidth(i65.a.b(getContext(), 1));
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.f176115d);
        for (int i17 = 1; i17 < 3; i17++) {
            float f17 = i17;
            float f18 = 3;
            float height = (getHeight() * f17) / f18;
            float width = (getWidth() * f17) / f18;
            canvas.drawLine(0.0f, height, getWidth(), height, this.f176116e);
            canvas.drawLine(width, 0.0f, width, getHeight(), this.f176116e);
        }
    }

    public FinderPreviewView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f176115d = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.f176116e = paint2;
        paint.setColor(-1);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(i65.a.b(getContext(), 2));
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint2.setColor(android.graphics.Color.parseColor("#4DFFFFFF"));
        paint2.setAntiAlias(true);
        paint2.setStrokeWidth(i65.a.b(getContext(), 1));
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
    }
}
