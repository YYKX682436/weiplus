package com.tencent.mm.plugin.sns.ad.widget.animlabel;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rB%\b\u0016\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/plugin/sns/ad/widget/animlabel/LabelBackgroundView;", "Landroid/widget/FrameLayout;", "", "outContentW", "Ljz5/f0;", "setContentWidth", "leftEdge", "setMidDrawLeftEdge", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class LabelBackgroundView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f163520d;

    /* renamed from: e, reason: collision with root package name */
    public int f163521e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.drawable.GradientDrawable f163522f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.drawable.Drawable f163523g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.drawable.GradientDrawable f163524h;

    /* renamed from: i, reason: collision with root package name */
    public int f163525i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f163526m;

    /* renamed from: n, reason: collision with root package name */
    public int f163527n;

    public LabelBackgroundView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dispatchDraw", "com.tencent.mm.plugin.sns.ad.widget.animlabel.LabelBackgroundView");
        kotlin.jvm.internal.o.g(canvas, "canvas");
        super.dispatchDraw(canvas);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refreshDraw", "com.tencent.mm.plugin.sns.ad.widget.animlabel.LabelBackgroundView");
        if (this.f163526m) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshDraw", "com.tencent.mm.plugin.sns.ad.widget.animlabel.LabelBackgroundView");
        } else {
            android.graphics.drawable.Drawable drawable = this.f163523g;
            if (drawable == null) {
                kotlin.jvm.internal.o.o("mMidDrawable");
                throw null;
            }
            int i17 = this.f163525i;
            drawable.setBounds(i17, 0, getMeasuredWidth() + i17, getMeasuredHeight());
            android.graphics.drawable.GradientDrawable gradientDrawable = this.f163522f;
            if (gradientDrawable == null) {
                kotlin.jvm.internal.o.o("mLeftDrawable");
                throw null;
            }
            int i18 = this.f163525i;
            gradientDrawable.setBounds(i18 - this.f163521e, 0, i18, getMeasuredHeight());
            android.graphics.drawable.GradientDrawable gradientDrawable2 = this.f163524h;
            if (gradientDrawable2 == null) {
                kotlin.jvm.internal.o.o("mRightDrawable");
                throw null;
            }
            gradientDrawable2.setBounds(this.f163525i + getMeasuredWidth(), 0, this.f163525i + getMeasuredWidth() + this.f163521e, getMeasuredHeight());
            android.graphics.drawable.GradientDrawable gradientDrawable3 = this.f163522f;
            if (gradientDrawable3 == null) {
                kotlin.jvm.internal.o.o("mLeftDrawable");
                throw null;
            }
            gradientDrawable3.draw(canvas);
            android.graphics.drawable.Drawable drawable2 = this.f163523g;
            if (drawable2 == null) {
                kotlin.jvm.internal.o.o("mMidDrawable");
                throw null;
            }
            drawable2.draw(canvas);
            android.graphics.drawable.GradientDrawable gradientDrawable4 = this.f163524h;
            if (gradientDrawable4 == null) {
                kotlin.jvm.internal.o.o("mRightDrawable");
                throw null;
            }
            gradientDrawable4.draw(canvas);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshDraw", "com.tencent.mm.plugin.sns.ad.widget.animlabel.LabelBackgroundView");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dispatchDraw", "com.tencent.mm.plugin.sns.ad.widget.animlabel.LabelBackgroundView");
    }

    public final void setContentWidth(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setContentWidth", "com.tencent.mm.plugin.sns.ad.widget.animlabel.LabelBackgroundView");
        this.f163527n = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setContentWidth", "com.tencent.mm.plugin.sns.ad.widget.animlabel.LabelBackgroundView");
    }

    public final void setMidDrawLeftEdge(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMidDrawLeftEdge", "com.tencent.mm.plugin.sns.ad.widget.animlabel.LabelBackgroundView");
        if (!this.f163526m) {
            this.f163525i = i17;
            invalidate();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMidDrawLeftEdge", "com.tencent.mm.plugin.sns.ad.widget.animlabel.LabelBackgroundView");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LabelBackgroundView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.d(context);
        this.f163520d = "LabelBackgroundView";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.widget.animlabel.LabelBackgroundView");
        this.f163521e = i65.a.b(getContext(), 80);
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setGradientType(0);
        gradientDrawable.setOrientation(android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT);
        gradientDrawable.setColors(new int[]{android.graphics.Color.parseColor("#00000000"), android.graphics.Color.parseColor("#7f000000")});
        this.f163522f = gradientDrawable;
        this.f163523g = new android.graphics.drawable.ColorDrawable(android.graphics.Color.parseColor("#7f000000"));
        android.graphics.drawable.GradientDrawable gradientDrawable2 = new android.graphics.drawable.GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setGradientType(0);
        gradientDrawable2.setOrientation(android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT);
        gradientDrawable2.setColors(new int[]{android.graphics.Color.parseColor("#7f000000"), android.graphics.Color.parseColor("#00000000")});
        this.f163524h = gradientDrawable2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.widget.animlabel.LabelBackgroundView");
    }
}
