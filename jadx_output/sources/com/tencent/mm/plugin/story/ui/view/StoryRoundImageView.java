package com.tencent.mm.plugin.story.ui.view;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fB#\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u0011R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/plugin/story/ui/view/StoryRoundImageView;", "Landroid/widget/ImageView;", "", "f", "I", "getRound", "()I", "setRound", "(I)V", "round", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-story_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class StoryRoundImageView extends android.widget.ImageView {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.RectF f172033d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Path f172034e;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public int round;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StoryRoundImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final int getRound() {
        return this.round;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        android.graphics.RectF rectF = this.f172033d;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        android.graphics.Path path = this.f172034e;
        int i17 = this.round;
        path.addRoundRect(rectF, i17, i17, android.graphics.Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        super.onDraw(canvas);
        canvas.restore();
    }

    public final void setRound(int i17) {
        this.round = i17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryRoundImageView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f172033d = new android.graphics.RectF();
        this.f172034e = new android.graphics.Path();
    }
}
