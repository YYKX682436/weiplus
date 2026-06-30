package com.tencent.mm.view.refreshLayout.horizontal;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/view/refreshLayout/horizontal/WxHRefreshLayout;", "Lcom/tencent/mm/view/refreshLayout/WxRefreshLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class WxHRefreshLayout extends com.tencent.mm.view.refreshLayout.WxRefreshLayout {
    public boolean I;

    public WxHRefreshLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        getCommonConfig().f330195e = false;
        nn5.a aVar = new nn5.a();
        this.scrollBoundaryDecider = aVar;
        on5.b bVar = this.contentPlugin;
        if (bVar != null) {
            ((un5.b) bVar).f429493e.f420874b = aVar;
        }
    }

    @Override // com.tencent.mm.view.refreshLayout.WxRefreshLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        on5.b contentPlugin = getContentPlugin();
        if (contentPlugin != null && !(contentPlugin instanceof nn5.b)) {
            nn5.b bVar = new nn5.b(((un5.b) contentPlugin).f429498m);
            on5.h scrollBoundaryDecider = getScrollBoundaryDecider();
            tn5.g gVar = bVar.f429493e;
            gVar.f420874b = scrollBoundaryDecider;
            gVar.f420875c = getCommonConfig().f330199i;
            bVar.f(this);
            setContentPlugin(bVar);
        }
        setRotation(-90.0f);
    }

    @Override // com.tencent.mm.view.refreshLayout.WxRefreshLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        on5.g gVar;
        int i28;
        int i29;
        on5.g gVar2;
        int i37 = i19 - i17;
        int i38 = i27 - i18;
        int i39 = (i38 - i37) / 2;
        int i47 = 0;
        if (!this.I) {
            int i48 = i18 - i39;
            int i49 = i17 + i39;
            this.I = true;
            layout(i49, i48, i37 + i49, i38 + i48);
            this.I = false;
            return;
        }
        on5.g headerPlugin = getHeaderPlugin();
        on5.g footerPlugin = getFooterPlugin();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int childCount = getChildCount();
        while (i47 < childCount) {
            android.view.View childAt = getChildAt(i47);
            kotlin.jvm.internal.o.f(childAt, "getChildAt(...)");
            if ((headerPlugin == null || !kotlin.jvm.internal.o.b(childAt, headerPlugin.getView())) && ((footerPlugin == null || !kotlin.jvm.internal.o.b(childAt, footerPlugin.getView())) && childAt.getVisibility() != 8)) {
                int i57 = i37 - (paddingTop + paddingBottom);
                int i58 = i38 - (paddingLeft + paddingRight);
                android.view.ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
                    int i59 = marginLayoutParams.topMargin;
                    gVar = headerPlugin;
                    int i66 = marginLayoutParams.bottomMargin;
                    i57 -= i59 + i66;
                    int i67 = marginLayoutParams.leftMargin;
                    i58 -= marginLayoutParams.rightMargin + i67;
                    i29 = i66 + paddingBottom;
                    i28 = i67 + paddingLeft;
                } else {
                    gVar = headerPlugin;
                    i28 = paddingLeft;
                    i29 = paddingBottom;
                }
                int i68 = (i57 - i58) / 2;
                int i69 = i29 + i68;
                int i76 = i28 - i68;
                childAt.setRotation(90.0f);
                gVar2 = footerPlugin;
                childAt.setTag(com.tencent.mm.R.id.prl, "GONE");
                childAt.measure(android.view.View.MeasureSpec.makeMeasureSpec(i58, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(i57, 1073741824));
                childAt.layout(i69, i76, i58 + i69, i57 + i76);
            } else {
                gVar = headerPlugin;
                gVar2 = footerPlugin;
            }
            i47++;
            headerPlugin = gVar;
            footerPlugin = gVar2;
        }
        super.onLayout(z17, i17, i18, i19, i27);
    }

    @Override // com.tencent.mm.view.refreshLayout.WxRefreshLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i18, i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WxHRefreshLayout(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        kotlin.jvm.internal.o.g(attrs, "attrs");
        getCommonConfig().f330195e = false;
        nn5.a aVar = new nn5.a();
        this.scrollBoundaryDecider = aVar;
        on5.b bVar = this.contentPlugin;
        if (bVar != null) {
            ((un5.b) bVar).f429493e.f420874b = aVar;
        }
    }
}
