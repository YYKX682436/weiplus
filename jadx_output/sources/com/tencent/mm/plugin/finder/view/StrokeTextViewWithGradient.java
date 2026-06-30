package com.tencent.mm.plugin.finder.view;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u000bB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\f"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/StrokeTextViewWithGradient;", "Lcom/tencent/mm/plugin/finder/view/StrokeTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "com/tencent/mm/plugin/finder/view/rs", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class StrokeTextViewWithGradient extends com.tencent.mm.plugin.finder.view.StrokeTextView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StrokeTextViewWithGradient(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        com.tencent.mm.plugin.finder.view.rs[] rsVarArr = com.tencent.mm.plugin.finder.view.rs.f132987d;
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        android.widget.TextView strokeTextView = getStrokeTextView();
        android.text.TextPaint paint = strokeTextView != null ? strokeTextView.getPaint() : null;
        if (paint != null) {
            paint.setShader(null);
        }
        super.draw(canvas);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StrokeTextViewWithGradient(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        com.tencent.mm.plugin.finder.view.rs[] rsVarArr = com.tencent.mm.plugin.finder.view.rs.f132987d;
    }
}
