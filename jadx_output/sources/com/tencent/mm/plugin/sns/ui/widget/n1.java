package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes2.dex */
public final class n1 extends android.widget.FrameLayout {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f171229g = 0;

    /* renamed from: d, reason: collision with root package name */
    public final int f171230d;

    /* renamed from: e, reason: collision with root package name */
    public final int f171231e;

    /* renamed from: f, reason: collision with root package name */
    public final int f171232f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(android.content.Context context, int i17, int i18, int i19) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f171230d = i17;
        this.f171231e = i18;
        this.f171232f = i19;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = new com.tencent.mm.ui.widget.imageview.WeImageView(context);
        weImageView.setIconColor(i65.a.d(getContext(), com.tencent.mm.R.color.FG_3));
        if (i17 == 1) {
            setBackgroundColor(i65.a.d(context, com.tencent.mm.R.color.BW_0_Alpha_0_0_3));
            weImageView.setImageResource(com.tencent.mm.R.raw.smile_filled);
        } else if (i17 == 2) {
            setBackgroundResource(com.tencent.mm.R.drawable.d96);
            weImageView.setImageResource(com.tencent.mm.R.raw.picture_filled);
        }
        int min = java.lang.Math.min(java.lang.Math.min(i65.a.h(context, com.tencent.mm.R.dimen.f479688cn), i18), java.lang.Math.min(i65.a.h(context, com.tencent.mm.R.dimen.f479688cn), i19));
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(min, min);
        layoutParams.gravity = 17;
        addView(weImageView, layoutParams);
    }

    public final int getH() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getH", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentDefaultThumbView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getH", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentDefaultThumbView");
        return this.f171232f;
    }

    public final int getType() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentDefaultThumbView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentDefaultThumbView");
        return this.f171230d;
    }

    public final int getW() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getW", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentDefaultThumbView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getW", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentDefaultThumbView");
        return this.f171231e;
    }
}
