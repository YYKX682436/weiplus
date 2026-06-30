package com.tencent.mm.ui.anim.widget;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/ui/anim/widget/XButton;", "Landroidx/appcompat/widget/AppCompatButton;", "Lza5/a;", "", "visibility", "Ljz5/f0;", "setVisibility", "Landroid/view/View;", "getView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class XButton extends androidx.appcompat.widget.AppCompatButton implements za5.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // za5.a
    public void f(int i17) {
        super.setVisibility(i17);
    }

    @Override // za5.a
    public android.view.View getView() {
        return this;
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        za5.c.a(this, i17);
    }
}
