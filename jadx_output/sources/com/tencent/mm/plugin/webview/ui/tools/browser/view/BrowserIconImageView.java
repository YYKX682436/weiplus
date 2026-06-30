package com.tencent.mm.plugin.webview.ui.tools.browser.view;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/browser/view/BrowserIconImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class BrowserIconImageView extends androidx.appcompat.widget.AppCompatImageView {

    /* renamed from: f, reason: collision with root package name */
    public final int f184010f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BrowserIconImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        android.graphics.drawable.Drawable mutate;
        super.drawableStateChanged();
        if (!isEnabled() || !isFocusable()) {
            android.graphics.drawable.Drawable drawable = getDrawable();
            mutate = drawable != null ? drawable.mutate() : null;
            if (mutate == null) {
                return;
            }
            mutate.setColorFilter(new android.graphics.PorterDuffColorFilter(0, android.graphics.PorterDuff.Mode.SRC_ATOP));
            return;
        }
        if (isPressed()) {
            android.graphics.drawable.Drawable drawable2 = getDrawable();
            mutate = drawable2 != null ? drawable2.mutate() : null;
            if (mutate == null) {
                return;
            }
            mutate.setColorFilter(new android.graphics.PorterDuffColorFilter(this.f184010f, android.graphics.PorterDuff.Mode.SRC_ATOP));
            return;
        }
        android.graphics.drawable.Drawable drawable3 = getDrawable();
        mutate = drawable3 != null ? drawable3.mutate() : null;
        if (mutate == null) {
            return;
        }
        mutate.setColorFilter(new android.graphics.PorterDuffColorFilter(0, android.graphics.PorterDuff.Mode.SRC_ATOP));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrowserIconImageView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f184010f = getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_1);
    }
}
