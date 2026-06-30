package com.tencent.mm.plugin.finder.view.indictor;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB!\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/indictor/FinderMediaGestureIndicator2;", "Lcom/tencent/mm/view/MediaBannerIndicator;", "Lcom/tencent/mm/plugin/finder/view/z;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderMediaGestureIndicator2 extends com.tencent.mm.view.MediaBannerIndicator implements com.tencent.mm.plugin.finder.view.z {

    /* renamed from: o, reason: collision with root package name */
    public float f132359o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderMediaGestureIndicator2(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        setIndicatorWidth((int) getResources().getDimension(com.tencent.mm.R.dimen.f479738dv));
        setIndicatorMargin(ym5.x.a(getContext(), 3.0f));
        setUnSelectDrawable(getContext().getDrawable(com.tencent.mm.R.drawable.f481661zd));
        setSelectDrawable(getContext().getDrawable(com.tencent.mm.R.drawable.f481662ze));
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i17) {
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        super.onTouchEvent(event);
        if (event.getAction() == 0) {
            this.f132359o = event.getX();
        } else if (event.getAction() == 1 || event.getAction() == 3) {
            float x17 = event.getX() - this.f132359o;
            if (java.lang.Math.abs(x17) >= 15.0f) {
                if (x17 < 0.0f) {
                    ym5.n1 f213370n = getF213370n();
                    if (f213370n != null) {
                        ((mx2.f) f213370n).a(java.lang.Math.min(getF213369m() + 1, getF132355e2() - 1));
                    }
                } else {
                    ym5.n1 f213370n2 = getF213370n();
                    if (f213370n2 != null) {
                        ((mx2.f) f213370n2).a(java.lang.Math.max(getF213369m() - 1, 0));
                    }
                }
            } else if (this.f132359o < getWidth() / 2.0f) {
                ym5.n1 f213370n3 = getF213370n();
                if (f213370n3 != null) {
                    ((mx2.f) f213370n3).a(java.lang.Math.max(getF213369m() - 1, 0));
                }
            } else {
                ym5.n1 f213370n4 = getF213370n();
                if (f213370n4 != null) {
                    ((mx2.f) f213370n4).a(java.lang.Math.min(getF213369m() + 1, getF132355e2() - 1));
                }
            }
        }
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.view.z
    public boolean canScrollHorizontally(int i17, android.view.ViewGroup parent, float f17, float f18) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) ((android.app.Activity) context).findViewById(com.tencent.mm.R.id.f484869fs3);
        com.tencent.mm.plugin.finder.view.image.FinderImageBanner finderImageBanner = viewGroup instanceof com.tencent.mm.plugin.finder.view.image.FinderImageBanner ? (com.tencent.mm.plugin.finder.view.image.FinderImageBanner) viewGroup : null;
        if (finderImageBanner != null) {
            return finderImageBanner.canScrollHorizontally(i17, parent, f17, f18);
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderMediaGestureIndicator2(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        setIndicatorWidth((int) getResources().getDimension(com.tencent.mm.R.dimen.f479738dv));
        setIndicatorMargin(ym5.x.a(getContext(), 3.0f));
        setUnSelectDrawable(getContext().getDrawable(com.tencent.mm.R.drawable.f481661zd));
        setSelectDrawable(getContext().getDrawable(com.tencent.mm.R.drawable.f481662ze));
    }
}
