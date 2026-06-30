package com.tencent.mm.plugin.finder.webview.ad;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fB#\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u0011R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/plugin/finder/webview/ad/CenterScrollFrameLayout;", "Lcom/tencent/mm/plugin/finder/webview/ad/ScrollFrameLayout;", "", "y", "I", "getPeekHeight", "()I", "setPeekHeight", "(I)V", "peekHeight", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class CenterScrollFrameLayout extends com.tencent.mm.plugin.finder.webview.ad.ScrollFrameLayout {

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public int peekHeight;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CenterScrollFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final int getPeekHeight() {
        return this.peekHeight;
    }

    @Override // com.tencent.mm.plugin.finder.webview.ad.ScrollFrameLayout
    public boolean i(float f17, float f18, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("Finder.CenterScrollFrameLayout", "distanceY:" + f18 + " velocityY:" + i18);
        return f18 >= 10.0f && java.lang.Math.abs(i18) > java.lang.Math.abs(i17) && java.lang.Math.abs(f18) > java.lang.Math.abs(f17);
    }

    @Override // com.tencent.mm.plugin.finder.webview.ad.ScrollFrameLayout
    public void j() {
        m();
        h();
    }

    @Override // com.tencent.mm.plugin.finder.webview.ad.ScrollFrameLayout
    public void k() {
        m();
        h();
    }

    @Override // com.tencent.mm.plugin.finder.webview.ad.ScrollFrameLayout
    public void l(float f17) {
        if (getMPointerTranslateY() + f17 < 0.0f) {
            setMPointerTranslateY(0.0f);
        } else {
            setMPointerTranslateY(getMPointerTranslateY() + f17);
        }
        setTranslationY(getMPointerTranslateY());
        com.tencent.mars.xlog.Log.i("Finder.CenterScrollFrameLayout", "translationY :" + getTranslationY() + " offsetY:" + f17);
    }

    public final void m() {
        if (getMPointerTranslateY() > getScrollDownLimit()) {
            com.tencent.mm.plugin.finder.webview.ad.ScrollFrameLayout.d(this, this.peekHeight, false, 0, new oy2.b(this), 6, null);
        } else {
            com.tencent.mm.plugin.finder.webview.ad.ScrollFrameLayout.d(this, 0.0f, false, 0, null, 15, null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTranslationY(this.peekHeight);
        com.tencent.mm.plugin.finder.webview.ad.ScrollFrameLayout.d(this, 0.0f, false, 300, null, 8, null);
    }

    public final void setPeekHeight(int i17) {
        this.peekHeight = i17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CenterScrollFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        setAllowVerticalIntercept(true);
        setScrollDownLimit(context.getResources().getDimension(com.tencent.mm.R.dimen.f479649bo));
    }
}
