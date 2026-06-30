package com.tencent.mm.plugin.finder.view.refresh;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/refresh/NewLifeProfileRefreshLayout;", "Lcom/tencent/mm/plugin/finder/view/FinderRefreshLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class NewLifeProfileRefreshLayout extends com.tencent.mm.plugin.finder.view.FinderRefreshLayout {

    /* renamed from: J, reason: collision with root package name */
    public final android.view.ViewGroup.MarginLayoutParams f132945J;

    public NewLifeProfileRefreshLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f132945J = new android.view.ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // com.tencent.mm.view.refreshLayout.WxRefreshLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        android.view.View view;
        super.onLayout(z17, i17, i18, i19, i27);
        on5.g footerPlugin = getFooterPlugin();
        if (footerPlugin != null) {
            android.view.View view2 = footerPlugin.getView();
            android.view.ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : this.f132945J;
            sn5.c spinnerStyle = footerPlugin.getSpinnerStyle();
            int i28 = marginLayoutParams.leftMargin;
            int i29 = marginLayoutParams.topMargin;
            on5.b contentPlugin = getContentPlugin();
            int measuredHeight = i29 + ((contentPlugin == null || (view = ((un5.b) contentPlugin).f429498m) == null) ? getMeasuredHeight() : view.getMeasuredHeight());
            on5.b contentPlugin2 = getContentPlugin();
            if (contentPlugin2 != null && getCValues().f330229v && getCValues().f330230w && getCommonConfig().f330198h && footerPlugin.getSpinnerStyle() == sn5.c.f410174b && n(getCommonConfig().f330194d)) {
                android.view.View view3 = ((un5.b) contentPlugin2).f429498m;
                android.view.ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
                measuredHeight = getPaddingTop() + getPaddingTop() + (layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).topMargin : 0) + view3.getMeasuredHeight();
            }
            if (spinnerStyle == sn5.c.f410177e) {
                measuredHeight = marginLayoutParams.topMargin;
            } else if (spinnerStyle == sn5.c.f410176d || spinnerStyle == sn5.c.f410175c) {
                measuredHeight -= getFooterConfig().f330231a;
            } else {
                spinnerStyle.getClass();
            }
            view2.layout(i28, measuredHeight, view2.getMeasuredWidth() + i28, view2.getMeasuredHeight() + measuredHeight);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewLifeProfileRefreshLayout(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.f132945J = new android.view.ViewGroup.MarginLayoutParams(-1, -2);
    }
}
