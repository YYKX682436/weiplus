package com.tencent.mm.plugin.finder.live.view;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000b¢\u0006\u0004\b\u0018\u0010\u0019R.\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001a"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveShadeView;", "Landroid/view/View;", "Landroid/graphics/Rect;", "value", "d", "Landroid/graphics/Rect;", "getHighLightRect", "()Landroid/graphics/Rect;", "setHighLightRect", "(Landroid/graphics/Rect;)V", "highLightRect", "", "e", "I", "getBgColor", "()I", "setBgColor", "(I)V", "bgColor", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderLiveShadeView extends android.view.View {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public android.graphics.Rect highLightRect;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int bgColor;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FinderLiveShadeView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final int getBgColor() {
        return this.bgColor;
    }

    public final android.graphics.Rect getHighLightRect() {
        return this.highLightRect;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        super.onDraw(canvas);
        android.graphics.Rect rect = this.highLightRect;
        if (rect != null) {
            canvas.clipRect(rect, android.graphics.Region.Op.DIFFERENCE);
            canvas.drawColor(this.bgColor);
        }
    }

    public final void setBgColor(int i17) {
        this.bgColor = i17;
    }

    public final void setHighLightRect(android.graphics.Rect rect) {
        this.highLightRect = rect;
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveShadeView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.bgColor = context.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_8);
    }
}
