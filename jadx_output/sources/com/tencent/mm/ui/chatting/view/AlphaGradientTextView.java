package com.tencent.mm.ui.chatting.view;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/tencent/mm/ui/chatting/view/AlphaGradientTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class AlphaGradientTextView extends androidx.appcompat.widget.AppCompatTextView {

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.LinearGradient f202806g;

    /* renamed from: h, reason: collision with root package name */
    public final float f202807h;

    /* renamed from: i, reason: collision with root package name */
    public final int f202808i;

    /* renamed from: m, reason: collision with root package name */
    public final int f202809m;

    /* renamed from: n, reason: collision with root package name */
    public int f202810n;

    /* renamed from: o, reason: collision with root package name */
    public final int f202811o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AlphaGradientTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        if (z17) {
            if (this.f202806g == null || (this.f202810n > 0 && java.lang.Math.abs(getHeight() - this.f202810n) > this.f202811o)) {
                this.f202806g = new android.graphics.LinearGradient(0.0f, getHeight() * this.f202807h, 0.0f, getHeight(), this.f202809m, this.f202808i, android.graphics.Shader.TileMode.CLAMP);
            }
            this.f202810n = getHeight();
            getPaint().setShader(this.f202806g);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlphaGradientTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f202807h = 0.24f;
        this.f202808i = e3.b.i(getCurrentTextColor(), 112);
        this.f202809m = e3.b.i(getCurrentTextColor(), 255);
        this.f202811o = 4;
    }
}
