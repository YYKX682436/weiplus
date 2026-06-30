package com.tencent.mm.plugin.sns.ad.widget;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/sns/ad/widget/FullCardContentBackgroundView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class FullCardContentBackgroundView extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f163257d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f163258e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.drawable.GradientDrawable f163259f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.drawable.GradientDrawable f163260g;

    public FullCardContentBackgroundView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDraw", "com.tencent.mm.plugin.sns.ad.widget.FullCardContentBackgroundView");
        kotlin.jvm.internal.o.g(canvas, "canvas");
        super.onDraw(canvas);
        android.view.View view = this.f163257d;
        if (view == null) {
            kotlin.jvm.internal.o.o("mTopLayer");
            throw null;
        }
        if (view.getHeight() > 0) {
            android.graphics.drawable.GradientDrawable gradientDrawable = this.f163259f;
            if (gradientDrawable != null) {
                android.view.View view2 = this.f163257d;
                if (view2 == null) {
                    kotlin.jvm.internal.o.o("mTopLayer");
                    throw null;
                }
                int width = view2.getWidth();
                android.view.View view3 = this.f163257d;
                if (view3 == null) {
                    kotlin.jvm.internal.o.o("mTopLayer");
                    throw null;
                }
                gradientDrawable.setBounds(0, 0, width, view3.getHeight());
            }
            android.graphics.drawable.GradientDrawable gradientDrawable2 = this.f163259f;
            if (gradientDrawable2 != null) {
                gradientDrawable2.draw(canvas);
            }
        }
        android.view.View view4 = this.f163258e;
        if (view4 == null) {
            kotlin.jvm.internal.o.o("mBottomLayer");
            throw null;
        }
        if (view4.getHeight() > 0) {
            int height = getHeight();
            android.view.View view5 = this.f163258e;
            if (view5 == null) {
                kotlin.jvm.internal.o.o("mBottomLayer");
                throw null;
            }
            int height2 = height - view5.getHeight();
            android.graphics.drawable.GradientDrawable gradientDrawable3 = this.f163260g;
            if (gradientDrawable3 != null) {
                android.view.View view6 = this.f163258e;
                if (view6 == null) {
                    kotlin.jvm.internal.o.o("mBottomLayer");
                    throw null;
                }
                gradientDrawable3.setBounds(0, height2, view6.getWidth(), getHeight());
            }
            android.graphics.drawable.GradientDrawable gradientDrawable4 = this.f163260g;
            if (gradientDrawable4 != null) {
                gradientDrawable4.draw(canvas);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDraw", "com.tencent.mm.plugin.sns.ad.widget.FullCardContentBackgroundView");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullCardContentBackgroundView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.d(context);
    }
}
