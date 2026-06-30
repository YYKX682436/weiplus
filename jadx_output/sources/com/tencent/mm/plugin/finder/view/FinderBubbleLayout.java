package com.tencent.mm.plugin.finder.view;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rB#\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderBubbleLayout;", "Landroid/widget/FrameLayout;", "", "resId", "Ljz5/f0;", "setContent", "color", "setBubbleColor", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderBubbleLayout extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f130873d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.FrameLayout f130874e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderBubbleLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.aer, (android.view.ViewGroup) this, true);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.b1p);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById;
        this.f130873d = imageView;
        imageView.setEnabled(false);
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.b1o);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f130874e = (android.widget.FrameLayout) findViewById2;
    }

    public final void setBubbleColor(int i17) {
        this.f130873d.setImageDrawable(com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.finder_bubble_arrow, i17));
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setColor(i17);
        gradientDrawable.setCornerRadius(getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479646bl));
        this.f130874e.setBackground(gradientDrawable);
    }

    public final void setContent(int i17) {
        android.view.LayoutInflater.from(getContext()).inflate(i17, (android.view.ViewGroup) this.f130874e, true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderBubbleLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.aer, (android.view.ViewGroup) this, true);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.b1p);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById;
        this.f130873d = imageView;
        imageView.setEnabled(false);
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.b1o);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f130874e = (android.widget.FrameLayout) findViewById2;
    }
}
