package com.tencent.mm.plugin.sns.ad.widget.shakead.bidding;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB#\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/plugin/sns/ad/widget/shakead/bidding/CommonShakeView;", "Landroid/widget/FrameLayout;", "", "isShakable", "Ljz5/f0;", "setDebugTipColor", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class CommonShakeView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f163877d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CommonShakeView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final void setDebugTipColor(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setDebugTipColor", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeView");
        if (z17) {
            android.widget.TextView textView = this.f163877d;
            if (textView != null) {
                textView.setTextColor(-65536);
            }
        } else {
            android.widget.TextView textView2 = this.f163877d;
            if (textView2 != null) {
                textView2.setTextColor(i65.a.d(getContext(), com.tencent.mm.R.color.adh));
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setDebugTipColor", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeView");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonShakeView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeView");
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCommonShakeView", "com.tencent.mm.plugin.sns.ad.improve.layout.builder.AdCommBizLayoutBuilder");
        androidx.appcompat.widget.AppCompatTextView appCompatTextView = new androidx.appcompat.widget.AppCompatTextView(context2, null);
        c44.a.o();
        if (appCompatTextView.getLayoutParams() == null) {
            c44.a.o();
            appCompatTextView.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams = appCompatTextView.getLayoutParams();
            layoutParams.width = -2;
            appCompatTextView.setLayoutParams(layoutParams);
        }
        c44.a.l();
        if (appCompatTextView.getLayoutParams() == null) {
            c44.a.o();
            appCompatTextView.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -1));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams2 = appCompatTextView.getLayoutParams();
            layoutParams2.height = -1;
            appCompatTextView.setLayoutParams(layoutParams2);
        }
        int a17 = c44.b.a(10);
        android.view.ViewGroup.LayoutParams layoutParams3 = appCompatTextView.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams3 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams3 : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.leftMargin = a17;
        }
        int a18 = c44.b.a(10);
        android.view.ViewGroup.LayoutParams layoutParams4 = appCompatTextView.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams4 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams4 : null;
        if (marginLayoutParams2 != null) {
            marginLayoutParams2.rightMargin = a18;
        }
        appCompatTextView.setGravity(c44.a.d());
        appCompatTextView.setTextSize(0, c44.b.a(12));
        appCompatTextView.setTextColor(i65.a.d(appCompatTextView.getContext(), com.tencent.mm.R.color.adh));
        java.lang.String string = appCompatTextView.getContext().getString(com.tencent.mm.R.string.f493170ls2);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        appCompatTextView.setText(string);
        appCompatTextView.setIncludeFontPadding(false);
        appCompatTextView.setMaxLines(1);
        appCompatTextView.setShadowLayer(1.0f, 0.0f, 1.0f, android.graphics.Color.parseColor("#33000000"));
        androidx.core.widget.a0.b(appCompatTextView, 5, (int) appCompatTextView.getTextSize(), 1, 0);
        android.graphics.drawable.Drawable drawable = context2.getResources().getDrawable(com.tencent.mm.R.drawable.coc);
        if (drawable != null) {
            drawable.setBounds(0, 0, c44.b.a(16), c44.b.a(16));
        }
        appCompatTextView.setCompoundDrawables(drawable, null, null, null);
        appCompatTextView.setCompoundDrawablePadding(c44.b.a(4));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCommonShakeView", "com.tencent.mm.plugin.sns.ad.improve.layout.builder.AdCommBizLayoutBuilder");
        this.f163877d = appCompatTextView;
        setBackground(new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, android.graphics.Color.parseColor("#8C000000")}));
        android.widget.FrameLayout.LayoutParams layoutParams5 = new android.widget.FrameLayout.LayoutParams(appCompatTextView.getLayoutParams());
        layoutParams5.gravity = 1;
        addView(appCompatTextView, layoutParams5);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeView");
    }
}
