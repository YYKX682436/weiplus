package com.tencent.mm.plugin.finder.view.indictor;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0016\u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b&\u0010'B%\b\u0016\u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\b\u0010%\u001a\u0004\u0018\u00010$\u0012\u0006\u0010(\u001a\u00020\u0007¢\u0006\u0004\b&\u0010)J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J\b\u0010\r\u001a\u00020\u0007H\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0010H\u0016R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010!\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010\u001d¨\u0006*"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/indictor/FinderMediaBannerIndicator;", "Landroid/widget/LinearLayout;", "Lym5/o1;", "", "isShow", "Ljz5/f0;", "setShowOnlyOneIndicator", "", "count", "setCount", "getCount", "i", "setCurrentIndex", "getCurrentIndex", "Landroid/view/View;", "getView", "Lym5/n1;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnSelectedPageListener", "getOnSelectedPageListener", "Landroid/widget/TextView;", "d", "Ljz5/g;", "getIndicatorTv", "()Landroid/widget/TextView;", "indicatorTv", "Lcom/tencent/mm/ui/widget/imageview/WeImageView;", "e", "getIndicatorLeft", "()Lcom/tencent/mm/ui/widget/imageview/WeImageView;", "indicatorLeft", "f", "getIndicatorRight", "indicatorRight", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderMediaBannerIndicator extends android.widget.LinearLayout implements ym5.o1 {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final jz5.g indicatorTv;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final jz5.g indicatorLeft;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final jz5.g indicatorRight;

    /* renamed from: g, reason: collision with root package name */
    public ym5.n1 f132349g;

    /* renamed from: h, reason: collision with root package name */
    public int f132350h;

    /* renamed from: i, reason: collision with root package name */
    public int f132351i;

    public FinderMediaBannerIndicator(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.b2g, (android.view.ViewGroup) this, true);
        this.indicatorTv = jz5.h.b(new nx2.c(this));
        this.indicatorLeft = jz5.h.b(new nx2.a(this));
        this.indicatorRight = jz5.h.b(new nx2.b(this));
    }

    private final com.tencent.mm.ui.widget.imageview.WeImageView getIndicatorLeft() {
        java.lang.Object value = this.indicatorLeft.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.ui.widget.imageview.WeImageView) value;
    }

    private final com.tencent.mm.ui.widget.imageview.WeImageView getIndicatorRight() {
        java.lang.Object value = this.indicatorRight.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.ui.widget.imageview.WeImageView) value;
    }

    private final android.widget.TextView getIndicatorTv() {
        java.lang.Object value = this.indicatorTv.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.TextView) value;
    }

    @Override // ym5.o1
    /* renamed from: getCount, reason: from getter */
    public int getF132350h() {
        return this.f132350h;
    }

    /* renamed from: getCurrentIndex, reason: from getter */
    public int getF132351i() {
        return this.f132351i;
    }

    /* renamed from: getOnSelectedPageListener, reason: from getter */
    public ym5.n1 getF132349g() {
        return this.f132349g;
    }

    @Override // ym5.o1
    public android.view.View getView() {
        return this;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent event) {
        ym5.n1 n1Var;
        ym5.n1 n1Var2;
        kotlin.jvm.internal.o.g(event, "event");
        if (event.getAction() == 1) {
            if (event.getX() <= getWidth() / 2) {
                int i17 = this.f132351i;
                if (i17 >= 1 && (n1Var2 = this.f132349g) != null) {
                    ((mx2.f) n1Var2).a(i17 - 1);
                }
            } else {
                int i18 = this.f132351i;
                if (i18 + 1 < this.f132350h && (n1Var = this.f132349g) != null) {
                    ((mx2.f) n1Var).a(i18 + 1);
                }
            }
        }
        return true;
    }

    @Override // ym5.o1
    public void setCount(int i17) {
        this.f132350h = i17;
        setCurrentIndex(0);
    }

    @Override // ym5.o1
    public void setCurrentIndex(int i17) {
        int i18 = i17 + 1;
        int i19 = this.f132350h;
        int i27 = i18 > i19 ? 0 : i17;
        if (i19 == 1) {
            getIndicatorRight().setIconColor(getContext().getResources().getColor(com.tencent.mm.R.color.f479249u1));
            getIndicatorLeft().setIconColor(getContext().getResources().getColor(com.tencent.mm.R.color.f479249u1));
        } else if (i27 == 0) {
            getIndicatorLeft().setIconColor(getContext().getResources().getColor(com.tencent.mm.R.color.f479249u1));
            getIndicatorRight().setIconColor(getContext().getResources().getColor(com.tencent.mm.R.color.f479254u6));
        } else if (i27 + 1 == i19) {
            getIndicatorRight().setIconColor(getContext().getResources().getColor(com.tencent.mm.R.color.f479249u1));
            getIndicatorLeft().setIconColor(getContext().getResources().getColor(com.tencent.mm.R.color.f479254u6));
        }
        this.f132351i = i17;
        getIndicatorTv().setText((i27 + 1) + " / " + this.f132350h);
    }

    @Override // ym5.o1
    public void setOnSelectedPageListener(ym5.n1 listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f132349g = listener;
    }

    @Override // ym5.o1
    public void setShowOnlyOneIndicator(boolean z17) {
    }

    public FinderMediaBannerIndicator(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.b2g, (android.view.ViewGroup) this, true);
        this.indicatorTv = jz5.h.b(new nx2.c(this));
        this.indicatorLeft = jz5.h.b(new nx2.a(this));
        this.indicatorRight = jz5.h.b(new nx2.b(this));
    }
}
