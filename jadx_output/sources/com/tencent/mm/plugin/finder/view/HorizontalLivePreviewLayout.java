package com.tencent.mm.plugin.finder.view;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018B#\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u0017\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\u00018\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0012\u001a\u00020\r8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/HorizontalLivePreviewLayout;", "Landroid/widget/FrameLayout;", "Landroid/view/View;", "d", "Landroid/view/View;", "getBgView", "()Landroid/view/View;", "bgView", "e", "Landroid/widget/FrameLayout;", "getIconLayout", "()Landroid/widget/FrameLayout;", "iconLayout", "Lcom/tencent/mm/plugin/finder/view/FinderFeedLiveRecommendView;", "f", "Lcom/tencent/mm/plugin/finder/view/FinderFeedLiveRecommendView;", "getLiveRecommendView", "()Lcom/tencent/mm/plugin/finder/view/FinderFeedLiveRecommendView;", "liveRecommendView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class HorizontalLivePreviewLayout extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final android.view.View bgView;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final android.widget.FrameLayout iconLayout;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final com.tencent.mm.plugin.finder.view.FinderFeedLiveRecommendView liveRecommendView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalLivePreviewLayout(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View view = new android.view.View(getContext());
        view.setBackgroundColor(-16777216);
        this.bgView = view;
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(getContext());
        this.iconLayout = frameLayout;
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        com.tencent.mm.plugin.finder.view.FinderFeedLiveRecommendView finderFeedLiveRecommendView = new com.tencent.mm.plugin.finder.view.FinderFeedLiveRecommendView(context2);
        this.liveRecommendView = finderFeedLiveRecommendView;
        setId(com.tencent.mm.R.id.f484676tj1);
        addView(view, new android.widget.FrameLayout.LayoutParams(-1, -1));
        int dimension = (int) getResources().getDimension(com.tencent.mm.R.dimen.f479718db);
        float f17 = dimension / 2.0f;
        frameLayout.setPivotX(f17);
        frameLayout.setPivotY(f17);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = new com.tencent.mm.ui.widget.imageview.WeImageView(getContext());
        int dimension2 = (int) weImageView.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479738dv);
        weImageView.setImageResource(com.tencent.mm.R.raw.icons_outlined_channels_turn);
        weImageView.setIconColor(weImageView.getContext().getResources().getColor(com.tencent.mm.R.color.BW_F_Alpha_0_8));
        weImageView.setPadding(dimension2, dimension2, dimension2, dimension2);
        weImageView.setScaleX(-1.0f);
        weImageView.setRotation(90.0f);
        frameLayout.addView(weImageView, new android.widget.FrameLayout.LayoutParams(-1, -1));
        int dimension3 = (int) getResources().getDimension(com.tencent.mm.R.dimen.f479704cz);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(dimension, dimension);
        layoutParams.setMarginEnd(dimension3);
        layoutParams.bottomMargin = dimension3;
        layoutParams.gravity = 8388661;
        addView(frameLayout, layoutParams);
        finderFeedLiveRecommendView.setVisibility(8);
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 81;
        layoutParams2.bottomMargin = (int) getResources().getDimension(com.tencent.mm.R.dimen.f479653br);
        addView(finderFeedLiveRecommendView, layoutParams2);
    }

    public final android.view.View getBgView() {
        return this.bgView;
    }

    public final android.widget.FrameLayout getIconLayout() {
        return this.iconLayout;
    }

    public final com.tencent.mm.plugin.finder.view.FinderFeedLiveRecommendView getLiveRecommendView() {
        return this.liveRecommendView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalLivePreviewLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View view = new android.view.View(getContext());
        view.setBackgroundColor(-16777216);
        this.bgView = view;
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(getContext());
        this.iconLayout = frameLayout;
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        com.tencent.mm.plugin.finder.view.FinderFeedLiveRecommendView finderFeedLiveRecommendView = new com.tencent.mm.plugin.finder.view.FinderFeedLiveRecommendView(context2);
        this.liveRecommendView = finderFeedLiveRecommendView;
        setId(com.tencent.mm.R.id.f484676tj1);
        addView(view, new android.widget.FrameLayout.LayoutParams(-1, -1));
        int dimension = (int) getResources().getDimension(com.tencent.mm.R.dimen.f479718db);
        float f17 = dimension / 2.0f;
        frameLayout.setPivotX(f17);
        frameLayout.setPivotY(f17);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = new com.tencent.mm.ui.widget.imageview.WeImageView(getContext());
        int dimension2 = (int) weImageView.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479738dv);
        weImageView.setImageResource(com.tencent.mm.R.raw.icons_outlined_channels_turn);
        weImageView.setIconColor(weImageView.getContext().getResources().getColor(com.tencent.mm.R.color.BW_F_Alpha_0_8));
        weImageView.setPadding(dimension2, dimension2, dimension2, dimension2);
        weImageView.setScaleX(-1.0f);
        weImageView.setRotation(90.0f);
        frameLayout.addView(weImageView, new android.widget.FrameLayout.LayoutParams(-1, -1));
        int dimension3 = (int) getResources().getDimension(com.tencent.mm.R.dimen.f479704cz);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(dimension, dimension);
        layoutParams.setMarginEnd(dimension3);
        layoutParams.bottomMargin = dimension3;
        layoutParams.gravity = 8388661;
        addView(frameLayout, layoutParams);
        finderFeedLiveRecommendView.setVisibility(8);
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 81;
        layoutParams2.bottomMargin = (int) getResources().getDimension(com.tencent.mm.R.dimen.f479653br);
        addView(finderFeedLiveRecommendView, layoutParams2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalLivePreviewLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View view = new android.view.View(getContext());
        view.setBackgroundColor(-16777216);
        this.bgView = view;
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(getContext());
        this.iconLayout = frameLayout;
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        com.tencent.mm.plugin.finder.view.FinderFeedLiveRecommendView finderFeedLiveRecommendView = new com.tencent.mm.plugin.finder.view.FinderFeedLiveRecommendView(context2);
        this.liveRecommendView = finderFeedLiveRecommendView;
        setId(com.tencent.mm.R.id.f484676tj1);
        addView(view, new android.widget.FrameLayout.LayoutParams(-1, -1));
        int dimension = (int) getResources().getDimension(com.tencent.mm.R.dimen.f479718db);
        float f17 = dimension / 2.0f;
        frameLayout.setPivotX(f17);
        frameLayout.setPivotY(f17);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = new com.tencent.mm.ui.widget.imageview.WeImageView(getContext());
        int dimension2 = (int) weImageView.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479738dv);
        weImageView.setImageResource(com.tencent.mm.R.raw.icons_outlined_channels_turn);
        weImageView.setIconColor(weImageView.getContext().getResources().getColor(com.tencent.mm.R.color.BW_F_Alpha_0_8));
        weImageView.setPadding(dimension2, dimension2, dimension2, dimension2);
        weImageView.setScaleX(-1.0f);
        weImageView.setRotation(90.0f);
        frameLayout.addView(weImageView, new android.widget.FrameLayout.LayoutParams(-1, -1));
        int dimension3 = (int) getResources().getDimension(com.tencent.mm.R.dimen.f479704cz);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(dimension, dimension);
        layoutParams.setMarginEnd(dimension3);
        layoutParams.bottomMargin = dimension3;
        layoutParams.gravity = 8388661;
        addView(frameLayout, layoutParams);
        finderFeedLiveRecommendView.setVisibility(8);
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 81;
        layoutParams2.bottomMargin = (int) getResources().getDimension(com.tencent.mm.R.dimen.f479653br);
        addView(finderFeedLiveRecommendView, layoutParams2);
    }
}
