package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class SightRangeWidget extends com.tencent.mm.plugin.sns.ui.RangeWidget {
    public SightRangeWidget(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }

    @Override // com.tencent.mm.plugin.sns.ui.RangeWidget, com.tencent.mm.plugin.sns.ui.BaseRangeWidget
    public boolean b(int i17, int i18, android.content.Intent intent, com.tencent.mm.plugin.sns.ui.AtContactWidget atContactWidget) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SightRangeWidget");
        super.b(i17, i18, intent, atContactWidget);
        if (atContactWidget != null) {
            if (getLabelRange() == 1) {
                atContactWidget.setVisibility(4);
                atContactWidget.a();
            } else {
                atContactWidget.setVisibility(0);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SightRangeWidget");
        return true;
    }

    @Override // com.tencent.mm.plugin.sns.ui.RangeWidget
    public int getLayoutResource() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayoutResource", "com.tencent.mm.plugin.sns.ui.SightRangeWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayoutResource", "com.tencent.mm.plugin.sns.ui.SightRangeWidget");
        return com.tencent.mm.R.layout.cnq;
    }

    @Override // com.tencent.mm.plugin.sns.ui.RangeWidget
    public int getMaxTagNameLen() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMaxTagNameLen", "com.tencent.mm.plugin.sns.ui.SightRangeWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMaxTagNameLen", "com.tencent.mm.plugin.sns.ui.SightRangeWidget");
        return 10;
    }

    public SightRangeWidget(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
