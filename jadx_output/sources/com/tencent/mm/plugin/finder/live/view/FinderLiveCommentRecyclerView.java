package com.tencent.mm.plugin.finder.live.view;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eB#\b\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010\u001f\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010 R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0017¨\u0006!"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveCommentRecyclerView;", "Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "", "j2", "I", "getCropTopLength", "()I", "setCropTopLength", "(I)V", "cropTopLength", "k2", "getFadeLength", "setFadeLength", "fadeLength", "Landroid/graphics/Paint;", "l2", "Ljz5/g;", "getPaint", "()Landroid/graphics/Paint;", "paint", "Landroid/graphics/Rect;", "m2", "getGradientRectTop", "()Landroid/graphics/Rect;", "gradientRectTop", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class FinderLiveCommentRecyclerView extends com.tencent.mm.view.recyclerview.WxRecyclerView {

    /* renamed from: n2, reason: collision with root package name */
    public static final int[] f115831n2 = {0, -16777216};

    /* renamed from: j2, reason: collision with root package name and from kotlin metadata */
    public int cropTopLength;

    /* renamed from: k2, reason: collision with root package name and from kotlin metadata */
    public int fadeLength;

    /* renamed from: l2, reason: collision with root package name and from kotlin metadata */
    public final jz5.g paint;

    /* renamed from: m2, reason: collision with root package name and from kotlin metadata */
    public final jz5.g gradientRectTop;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveCommentRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.cropTopLength = -1;
        this.fadeLength = -1;
        this.paint = jz5.h.b(com.tencent.mm.plugin.finder.live.view.r3.f116627d);
        this.gradientRectTop = jz5.h.b(com.tencent.mm.plugin.finder.live.view.q3.f116599d);
    }

    private final android.graphics.Rect getGradientRectTop() {
        return (android.graphics.Rect) this.gradientRectTop.getValue();
    }

    private final android.graphics.Paint getPaint() {
        return (android.graphics.Paint) this.paint.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        if (this.cropTopLength <= 0 || this.fadeLength <= 0) {
            super.dispatchDraw(canvas);
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop() + this.cropTopLength;
        int width = getWidth() - getPaddingRight();
        int i17 = this.fadeLength + paddingTop;
        getGradientRectTop().set(paddingLeft, paddingTop, width, i17);
        float f17 = paddingLeft;
        getPaint().setShader(new android.graphics.LinearGradient(f17, paddingTop, f17, i17, f115831n2, (float[]) null, android.graphics.Shader.TileMode.CLAMP));
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        super.dispatchDraw(canvas);
        canvas.drawRect(getGradientRectTop(), getPaint());
        canvas.restoreToCount(saveLayer);
    }

    public final int getCropTopLength() {
        return this.cropTopLength;
    }

    public final int getFadeLength() {
        return this.fadeLength;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onDraw(android.graphics.Canvas c17) {
        kotlin.jvm.internal.o.g(c17, "c");
        super.onDraw(c17);
        if (this.cropTopLength > 0) {
            c17.clipRect(new android.graphics.Rect(0, this.cropTopLength, getWidth(), getHeight()));
        }
    }

    public final void setCropTopLength(int i17) {
        this.cropTopLength = i17;
    }

    public final void setFadeLength(int i17) {
        this.fadeLength = i17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveCommentRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.cropTopLength = -1;
        this.fadeLength = -1;
        this.paint = jz5.h.b(com.tencent.mm.plugin.finder.live.view.r3.f116627d);
        this.gradientRectTop = jz5.h.b(com.tencent.mm.plugin.finder.live.view.q3.f116599d);
    }
}
