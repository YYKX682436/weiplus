package com.tencent.mm.view;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0016\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/B!\b\u0016\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u00100\u001a\u00020\u0007¢\u0006\u0004\b.\u00101J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\f\u001a\u00020\u0007H\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\n\u0010\u0012\u001a\u0004\u0018\u00010\u000fH\u0016R\"\u0010\u0019\u001a\u00020\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001d\u001a\u00020\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R$\u0010%\u001a\u0004\u0018\u00010\u001e8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010)\u001a\u0004\u0018\u00010\u001e8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\"\"\u0004\b(\u0010$¨\u00062"}, d2 = {"Lcom/tencent/mm/view/MediaBannerIndicator;", "Landroid/widget/LinearLayout;", "Lym5/o1;", "", "isShow", "Ljz5/f0;", "setShowOnlyOneIndicator", "", "value", "setCount", "getCount", "setCurrentIndex", "getCurrentIndex", "Landroid/view/View;", "getView", "Lym5/n1;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnSelectedPageListener", "getOnSelectedPageListener", "d", "I", "getIndicatorWidth", "()I", "setIndicatorWidth", "(I)V", "indicatorWidth", "e", "getIndicatorMargin", "setIndicatorMargin", "indicatorMargin", "Landroid/graphics/drawable/Drawable;", "f", "Landroid/graphics/drawable/Drawable;", "getSelectDrawable", "()Landroid/graphics/drawable/Drawable;", "setSelectDrawable", "(Landroid/graphics/drawable/Drawable;)V", "selectDrawable", "g", "getUnSelectDrawable", "setUnSelectDrawable", "unSelectDrawable", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class MediaBannerIndicator extends android.widget.LinearLayout implements ym5.o1 {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public int indicatorWidth;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int indicatorMargin;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public android.graphics.drawable.Drawable selectDrawable;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public android.graphics.drawable.Drawable unSelectDrawable;

    /* renamed from: h, reason: collision with root package name */
    public boolean f213367h;

    /* renamed from: i, reason: collision with root package name */
    public int f213368i;

    /* renamed from: m, reason: collision with root package name */
    public int f213369m;

    /* renamed from: n, reason: collision with root package name */
    public ym5.n1 f213370n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaBannerIndicator(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.indicatorWidth = (int) getResources().getDimension(com.tencent.mm.R.dimen.a2u);
        this.indicatorMargin = (int) getResources().getDimension(com.tencent.mm.R.dimen.f479646bl);
        this.selectDrawable = getContext().getDrawable(com.tencent.mm.R.drawable.ayt);
        this.unSelectDrawable = getContext().getDrawable(com.tencent.mm.R.drawable.afl);
        setOrientation(0);
        setGravity(17);
    }

    private final void a(android.util.AttributeSet attributeSet, int i17) {
        android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, wm0.a.f447206x, i17, 0);
        kotlin.jvm.internal.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
        setIndicatorMargin((int) obtainStyledAttributes.getDimension(0, getResources().getDimension(com.tencent.mm.R.dimen.f479646bl)));
        setIndicatorWidth((int) obtainStyledAttributes.getDimension(3, getResources().getDimension(com.tencent.mm.R.dimen.a2u)));
        if (obtainStyledAttributes.hasValue(1)) {
            setSelectDrawable(obtainStyledAttributes.getDrawable(1));
        }
        if (obtainStyledAttributes.hasValue(2)) {
            setUnSelectDrawable(obtainStyledAttributes.getDrawable(2));
        }
        obtainStyledAttributes.recycle();
    }

    @Override // ym5.o1
    /* renamed from: getCount, reason: from getter */
    public int getF213368i() {
        return this.f213368i;
    }

    /* renamed from: getCurrentIndex, reason: from getter */
    public int getF213369m() {
        return this.f213369m;
    }

    public int getIndicatorMargin() {
        return this.indicatorMargin;
    }

    public int getIndicatorWidth() {
        return this.indicatorWidth;
    }

    /* renamed from: getOnSelectedPageListener, reason: from getter */
    public ym5.n1 getF213370n() {
        return this.f213370n;
    }

    public android.graphics.drawable.Drawable getSelectDrawable() {
        return this.selectDrawable;
    }

    public android.graphics.drawable.Drawable getUnSelectDrawable() {
        return this.unSelectDrawable;
    }

    @Override // ym5.o1
    public android.view.View getView() {
        return this;
    }

    @Override // ym5.o1
    public void setCount(int i17) {
        removeAllViews();
        this.f213368i = i17;
        if (i17 <= 1 && (i17 <= 0 || !this.f213367h)) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        this.f213369m = 0;
        for (int i18 = 0; i18 < i17; i18++) {
            android.widget.ImageView imageView = new android.widget.ImageView(getContext());
            imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            if (this.f213369m == i18) {
                imageView.setImageDrawable(getSelectDrawable());
            } else {
                imageView.setImageDrawable(getUnSelectDrawable());
            }
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(getIndicatorWidth(), getIndicatorWidth());
            layoutParams.leftMargin = getIndicatorMargin();
            layoutParams.rightMargin = getIndicatorMargin();
            layoutParams.gravity = 17;
            addView(imageView, layoutParams);
        }
    }

    @Override // ym5.o1
    public void setCurrentIndex(int i17) {
        android.view.View childAt = getChildAt(this.f213369m);
        android.widget.ImageView imageView = childAt instanceof android.widget.ImageView ? (android.widget.ImageView) childAt : null;
        if (imageView != null) {
            imageView.setImageDrawable(getUnSelectDrawable());
            android.view.View childAt2 = getChildAt(i17);
            android.widget.ImageView imageView2 = childAt2 instanceof android.widget.ImageView ? (android.widget.ImageView) childAt2 : null;
            if (imageView2 != null) {
                imageView2.setImageDrawable(getSelectDrawable());
            }
        }
        this.f213369m = i17;
    }

    public void setIndicatorMargin(int i17) {
        this.indicatorMargin = i17;
    }

    public void setIndicatorWidth(int i17) {
        this.indicatorWidth = i17;
    }

    @Override // ym5.o1
    public void setOnSelectedPageListener(ym5.n1 listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f213370n = listener;
    }

    public void setSelectDrawable(android.graphics.drawable.Drawable drawable) {
        this.selectDrawable = drawable;
    }

    @Override // ym5.o1
    public void setShowOnlyOneIndicator(boolean z17) {
        this.f213367h = z17;
    }

    public void setUnSelectDrawable(android.graphics.drawable.Drawable drawable) {
        this.unSelectDrawable = drawable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaBannerIndicator(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.indicatorWidth = (int) getResources().getDimension(com.tencent.mm.R.dimen.a2u);
        this.indicatorMargin = (int) getResources().getDimension(com.tencent.mm.R.dimen.f479646bl);
        this.selectDrawable = getContext().getDrawable(com.tencent.mm.R.drawable.ayt);
        this.unSelectDrawable = getContext().getDrawable(com.tencent.mm.R.drawable.afl);
        setOrientation(0);
        setGravity(17);
        a(attrs, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaBannerIndicator(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.indicatorWidth = (int) getResources().getDimension(com.tencent.mm.R.dimen.a2u);
        this.indicatorMargin = (int) getResources().getDimension(com.tencent.mm.R.dimen.f479646bl);
        this.selectDrawable = getContext().getDrawable(com.tencent.mm.R.drawable.ayt);
        this.unSelectDrawable = getContext().getDrawable(com.tencent.mm.R.drawable.afl);
        setOrientation(0);
        setGravity(17);
        a(attrs, i17);
    }
}
