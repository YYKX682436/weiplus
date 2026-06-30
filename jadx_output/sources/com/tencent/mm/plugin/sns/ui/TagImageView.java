package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class TagImageView extends com.tencent.mm.ui.widget.QFadeImageView {

    /* renamed from: J, reason: collision with root package name */
    public int f167645J;

    public TagImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f167645J = -1;
    }

    public int getPosition() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPosition", "com.tencent.mm.plugin.sns.ui.TagImageView");
        int i17 = this.f167645J;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPosition", "com.tencent.mm.plugin.sns.ui.TagImageView");
        return i17;
    }

    @Override // com.tencent.mm.ui.widget.QImageView, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.TagImageView");
        super.onLayout(z17, i17, i18, i19, i27);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.TagImageView");
    }

    @Override // com.tencent.mm.ui.widget.QImageView, android.view.View
    public void onMeasure(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.TagImageView");
        super.onMeasure(i17, i18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.TagImageView");
    }

    public void setPosition(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPosition", "com.tencent.mm.plugin.sns.ui.TagImageView");
        this.f167645J = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPosition", "com.tencent.mm.plugin.sns.ui.TagImageView");
    }

    public TagImageView(android.content.Context context) {
        super(context);
        this.f167645J = -1;
    }
}
