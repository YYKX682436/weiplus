package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class qg implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderPopupBubbleView f132893d;

    public qg(com.tencent.mm.plugin.finder.view.FinderPopupBubbleView finderPopupBubbleView) {
        this.f132893d = finderPopupBubbleView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        android.view.View topPlaceHolder;
        int topPlaceHolderHeight;
        android.view.View rightPlaceHolder;
        int rightPlaceHolderWidth;
        com.tencent.mm.ui.widget.imageview.WeImageView icon;
        int iconSize;
        com.tencent.mm.ui.widget.imageview.WeImageView icon2;
        int iconSize2;
        android.widget.TextView subTitle;
        int subTitleMarginTop;
        int subTitleMarginBottom;
        android.widget.TextView subTitle2;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        com.tencent.mm.plugin.finder.view.FinderPopupBubbleView finderPopupBubbleView = this.f132893d;
        topPlaceHolder = finderPopupBubbleView.getTopPlaceHolder();
        android.view.ViewGroup.LayoutParams layoutParams = topPlaceHolder.getLayoutParams();
        topPlaceHolderHeight = finderPopupBubbleView.getTopPlaceHolderHeight();
        int i17 = (int) (topPlaceHolderHeight * floatValue);
        if (i17 < 1) {
            i17 = 1;
        }
        layoutParams.height = i17;
        rightPlaceHolder = finderPopupBubbleView.getRightPlaceHolder();
        android.view.ViewGroup.LayoutParams layoutParams2 = rightPlaceHolder.getLayoutParams();
        rightPlaceHolderWidth = finderPopupBubbleView.getRightPlaceHolderWidth();
        int i18 = (int) (rightPlaceHolderWidth * floatValue);
        layoutParams2.width = i18 >= 1 ? i18 : 1;
        icon = finderPopupBubbleView.getIcon();
        android.view.ViewGroup.LayoutParams layoutParams3 = icon.getLayoutParams();
        iconSize = finderPopupBubbleView.getIconSize();
        layoutParams3.width = (int) (iconSize * (floatValue < 0.67f ? 0.67f : floatValue));
        icon2 = finderPopupBubbleView.getIcon();
        android.view.ViewGroup.LayoutParams layoutParams4 = icon2.getLayoutParams();
        iconSize2 = finderPopupBubbleView.getIconSize();
        layoutParams4.height = (int) (iconSize2 * (floatValue >= 0.67f ? floatValue : 0.67f));
        subTitle = finderPopupBubbleView.getSubTitle();
        android.view.ViewGroup.LayoutParams layoutParams5 = subTitle.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams5, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams5;
        marginLayoutParams.width = (int) (finderPopupBubbleView.f131351q * floatValue);
        marginLayoutParams.height = (int) (finderPopupBubbleView.f131352r * floatValue);
        subTitleMarginTop = finderPopupBubbleView.getSubTitleMarginTop();
        marginLayoutParams.topMargin = (int) (subTitleMarginTop * floatValue);
        subTitleMarginBottom = finderPopupBubbleView.getSubTitleMarginBottom();
        marginLayoutParams.bottomMargin = (int) (subTitleMarginBottom * floatValue);
        subTitle2 = finderPopupBubbleView.getSubTitle();
        subTitle2.requestLayout();
    }
}
