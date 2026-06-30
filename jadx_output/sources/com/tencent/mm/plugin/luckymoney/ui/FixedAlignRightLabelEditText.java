package com.tencent.mm.plugin.luckymoney.ui;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013B%\b\u0016\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0012\u0010\u0016J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/tencent/mm/plugin/luckymoney/ui/FixedAlignRightLabelEditText;", "Lcom/tencent/mm/ui/widget/cedit/edit/EditTextCompatHeight;", "", "labelText", "Ljz5/f0;", "setFixedLabelText", "", "f", "Z", "getAlwaysShowLabel", "()Z", "setAlwaysShowLabel", "(Z)V", "alwaysShowLabel", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-wxpay_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class FixedAlignRightLabelEditText extends com.tencent.mm.ui.widget.cedit.edit.EditTextCompatHeight {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f145939d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f145940e;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public boolean alwaysShowLabel;

    public FixedAlignRightLabelEditText(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f145940e = new android.graphics.Paint();
    }

    public final boolean getAlwaysShowLabel() {
        return this.alwaysShowLabel;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        java.lang.String str = this.f145939d;
        if (str != null) {
            if (!(getText().toString().length() == 0) || this.alwaysShowLabel) {
                float width = getWidth() - getPaint().measureText(str + ((java.lang.Object) getText()));
                android.graphics.Paint paint = this.f145940e;
                paint.setAntiAlias(true);
                paint.setTextSize(getPaint().getTextSize());
                paint.setColor(getCurrentTextColor());
                canvas.drawText(str, width, getBaseline(), paint);
            }
        }
        super.onDraw(canvas);
    }

    public final void setAlwaysShowLabel(boolean z17) {
        this.alwaysShowLabel = z17;
    }

    public final void setFixedLabelText(java.lang.String labelText) {
        kotlin.jvm.internal.o.g(labelText, "labelText");
        this.f145939d = labelText;
        invalidate();
    }

    public FixedAlignRightLabelEditText(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f145940e = new android.graphics.Paint();
    }
}
