package com.tencent.mm.plugin.fts.ui.voice;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/tencent/mm/plugin/fts/ui/voice/EducationGradientMask;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ui-fts_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class EducationGradientMask extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f138202d;

    /* renamed from: e, reason: collision with root package name */
    public int f138203e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EducationGradientMask(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        super.onDraw(canvas);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.f138202d);
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        this.f138203e = i18;
        if (i18 <= 0) {
            return;
        }
        this.f138202d.setShader(new android.graphics.LinearGradient(0.0f, 0.0f, 0.0f, this.f138203e, new int[]{0, b3.l.getColor(getContext(), com.tencent.mm.R.color.f479153rh)}, new float[]{0.0f, 1.0f}, android.graphics.Shader.TileMode.CLAMP));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EducationGradientMask(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f138202d = new android.graphics.Paint(1);
        setAlpha(0.0f);
    }
}
