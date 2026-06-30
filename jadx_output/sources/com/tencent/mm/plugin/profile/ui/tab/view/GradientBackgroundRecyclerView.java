package com.tencent.mm.plugin.profile.ui.tab.view;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/plugin/profile/ui/tab/view/GradientBackgroundRecyclerView;", "Lcom/tencent/mm/plugin/profile/ui/tab/view/BizProfileRecyclerView;", "", "j2", "Z", "getHasTopic", "()Z", "setHasTopic", "(Z)V", "hasTopic", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class GradientBackgroundRecyclerView extends com.tencent.mm.plugin.profile.ui.tab.view.BizProfileRecyclerView {

    /* renamed from: j2, reason: collision with root package name and from kotlin metadata */
    public boolean hasTopic;

    /* renamed from: k2, reason: collision with root package name */
    public final android.graphics.Paint f154664k2;

    /* renamed from: l2, reason: collision with root package name */
    public final int f154665l2;

    /* renamed from: m2, reason: collision with root package name */
    public final int f154666m2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GradientBackgroundRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.f154664k2 = paint;
        this.f154665l2 = context.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479718db);
        this.f154666m2 = context.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479723df);
    }

    public final boolean getHasTopic() {
        return this.hasTopic;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        int i17 = this.hasTopic ? this.f154665l2 : 0;
        int color = getContext().getColor(com.tencent.mm.R.color.f478491c);
        int color2 = getContext().getColor(com.tencent.mm.R.color.f478489a);
        boolean z17 = this.hasTopic;
        android.graphics.Paint paint = this.f154664k2;
        if (z17 && i17 > 0) {
            paint.setShader(null);
            paint.setColor(color);
            canvas.drawRect(0.0f, 0.0f, getWidth(), i17, paint);
        }
        float f17 = i17;
        int i18 = this.f154666m2;
        paint.setShader(new android.graphics.LinearGradient(0.0f, f17, 0.0f, i17 + i18, color, color2, android.graphics.Shader.TileMode.CLAMP));
        canvas.drawRect(0.0f, f17, getWidth(), i17 + i18, paint);
    }

    public final void setHasTopic(boolean z17) {
        this.hasTopic = z17;
    }
}
