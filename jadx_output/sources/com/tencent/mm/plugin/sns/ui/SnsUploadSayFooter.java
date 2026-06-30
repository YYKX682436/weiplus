package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class SnsUploadSayFooter extends com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter {
    public SnsUploadSayFooter(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter
    public void c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refreshBottomPanelHeight", "com.tencent.mm.plugin.sns.ui.SnsUploadSayFooter");
        int g17 = com.tencent.mm.sdk.platformtools.d2.g(getContext());
        this.f170757g.setPortHeightPx(g17);
        this.f170757g.b();
        android.view.ViewGroup.LayoutParams layoutParams = this.f170757g.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = g17;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsUploadSayFooter", "refreshBottomPanelHeight: smileyPanel height=%d", java.lang.Integer.valueOf(g17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshBottomPanelHeight", "com.tencent.mm.plugin.sns.ui.SnsUploadSayFooter");
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter
    public void d(boolean z17, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refreshUIOnInputPanelChange", "com.tencent.mm.plugin.sns.ui.SnsUploadSayFooter");
        if (this.f170762o != i17 && i17 != 0) {
            this.f170762o = i17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("saveKeyboardHeight", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
            fp.w.m(getContext(), i17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("saveKeyboardHeight", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
            c();
        }
        if (z17) {
            f();
            setTranslationY(-i17);
        } else {
            e();
            setTranslationY(0.0f);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshUIOnInputPanelChange", "com.tencent.mm.plugin.sns.ui.SnsUploadSayFooter");
    }

    @Override // com.tencent.mm.ui.widget.SnsUploadInputPanelLinearLayout
    public int getSoftInputMode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSoftInputMode", "com.tencent.mm.plugin.sns.ui.SnsUploadSayFooter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSoftInputMode", "com.tencent.mm.plugin.sns.ui.SnsUploadSayFooter");
        return 32;
    }
}
