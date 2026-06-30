package com.tencent.mm.plugin.finder.view;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cB!\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001d\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001eR\u001b\u0010\u0007\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\"\u0010\u000b\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001f"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderAuthorAreaLayout;", "Landroid/widget/FrameLayout;", "", "d", "Ljz5/g;", "getFollowBtnMargin", "()I", "followBtnMargin", "", "e", "Z", "isShrinkText", "()Z", "setShrinkText", "(Z)V", "Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;", "f", "Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;", "getFeed", "()Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;", "setFeed", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "feed", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleInt", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderAuthorAreaLayout extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final jz5.g followBtnMargin;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean isShrinkText;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public com.tencent.mm.plugin.finder.model.BaseFinderFeed feed;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderAuthorAreaLayout(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.followBtnMargin = jz5.h.b(com.tencent.mm.plugin.finder.view.h2.f132204d);
    }

    public final com.tencent.mm.plugin.finder.model.BaseFinderFeed getFeed() {
        return this.feed;
    }

    public final int getFollowBtnMargin() {
        return ((java.lang.Number) this.followBtnMargin.getValue()).intValue();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.gac);
        if (findViewById.getVisibility() != 0) {
            com.tencent.mm.plugin.finder.view.EllipsizedTextView ellipsizedTextView = (com.tencent.mm.plugin.finder.view.EllipsizedTextView) findViewById(com.tencent.mm.R.id.a8p);
            if (ellipsizedTextView.b()) {
                if (!this.isShrinkText) {
                    this.isShrinkText = true;
                    ellipsizedTextView.setTextSize(0, getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479788f9));
                    measure(android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    layout(i17, i18, i19, i27);
                    return;
                }
                android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.che);
                int dimensionPixelOffset = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479688cn);
                com.tencent.mm.plugin.finder.view.FadeOutLinearLayout fadeOutLinearLayout = findViewById2 instanceof com.tencent.mm.plugin.finder.view.FadeOutLinearLayout ? (com.tencent.mm.plugin.finder.view.FadeOutLinearLayout) findViewById2 : null;
                if (fadeOutLinearLayout != null) {
                    int i28 = com.tencent.mm.plugin.finder.view.FadeOutLinearLayout.f130852n;
                    fadeOutLinearLayout.b(dimensionPixelOffset, 0L, 0);
                    return;
                }
                return;
            }
            return;
        }
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.dzo);
        com.tencent.mm.plugin.finder.view.EllipsizedTextView ellipsizedTextView2 = (com.tencent.mm.plugin.finder.view.EllipsizedTextView) findViewById(com.tencent.mm.R.id.a8p);
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.che);
        int right = findViewById3.getRight() + getFollowBtnMargin() + findViewById.getMeasuredWidth();
        if (right > getMeasuredWidth()) {
            if (!this.isShrinkText) {
                this.isShrinkText = true;
                ellipsizedTextView2.setTextSize(0, getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479788f9));
                measure(android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                layout(i17, i18, i19, i27);
                return;
            }
            int measuredWidth = right - getMeasuredWidth();
            int width = findViewById.getWidth();
            com.tencent.mm.plugin.finder.viewmodel.component.gh ghVar = com.tencent.mm.plugin.finder.viewmodel.component.kh.f134967d;
            int intValue = width + ((java.lang.Number) ((jz5.n) com.tencent.mm.plugin.finder.viewmodel.component.kh.f134968e).getValue()).intValue() + measuredWidth;
            com.tencent.mm.plugin.finder.view.FadeOutLinearLayout fadeOutLinearLayout2 = findViewById4 instanceof com.tencent.mm.plugin.finder.view.FadeOutLinearLayout ? (com.tencent.mm.plugin.finder.view.FadeOutLinearLayout) findViewById4 : null;
            if (fadeOutLinearLayout2 != null) {
                fadeOutLinearLayout2.b(intValue, 0L, measuredWidth);
            }
            right = getMeasuredWidth();
        }
        findViewById.layout(right - findViewById.getMeasuredWidth(), findViewById.getTop(), right, findViewById.getBottom());
    }

    public final void setFeed(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        this.feed = baseFinderFeed;
    }

    public final void setShrinkText(boolean z17) {
        this.isShrinkText = z17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderAuthorAreaLayout(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.followBtnMargin = jz5.h.b(com.tencent.mm.plugin.finder.view.h2.f132204d);
    }
}
