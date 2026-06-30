package com.tencent.mm.view.shadow.layout;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011B#\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0010\u0010\u0014J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001b\u0010\u000b\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/tencent/mm/view/shadow/layout/WxShadowLinearLayout;", "Landroid/widget/LinearLayout;", "", "blurRadius", "Ljz5/f0;", "setBlurRadius", "Lvn5/c;", "d", "Ljz5/g;", "getShadowHelper", "()Lvn5/c;", "shadowHelper", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class WxShadowLinearLayout extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final jz5.g shadowHelper;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WxShadowLinearLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    private final vn5.c getShadowHelper() {
        return (vn5.c) ((jz5.n) this.shadowHelper).getValue();
    }

    public final void a(boolean z17) {
        vn5.c shadowHelper = getShadowHelper();
        if (shadowHelper.f438448b != z17) {
            shadowHelper.f438448b = z17;
            shadowHelper.f438447a.invalidate();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        super.onDraw(canvas);
        getShadowHelper().a(canvas);
    }

    public final void setBlurRadius(float f17) {
        vn5.c shadowHelper = getShadowHelper();
        if (!(shadowHelper.f438451e == f17)) {
            shadowHelper.f438451e = f17;
            shadowHelper.b();
        }
        postInvalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WxShadowLinearLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.shadowHelper = jz5.h.b(new wn5.b(this));
        setWillNotDraw(false);
        getShadowHelper().c(context, attributeSet, i17);
    }
}
