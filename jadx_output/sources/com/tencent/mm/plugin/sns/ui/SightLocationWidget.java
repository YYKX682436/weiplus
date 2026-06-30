package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class SightLocationWidget extends com.tencent.mm.plugin.sns.ui.LocationWidget {
    public SightLocationWidget(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }

    @Override // com.tencent.mm.plugin.sns.ui.LocationWidget
    public int getLayoutResource() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayoutResource", "com.tencent.mm.plugin.sns.ui.SightLocationWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayoutResource", "com.tencent.mm.plugin.sns.ui.SightLocationWidget");
        return com.tencent.mm.R.layout.eo8;
    }

    @Override // com.tencent.mm.plugin.sns.ui.LocationWidget
    public int getNormalStateImageResource() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getNormalStateImageResource", "com.tencent.mm.plugin.sns.ui.SightLocationWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getNormalStateImageResource", "com.tencent.mm.plugin.sns.ui.SightLocationWidget");
        return com.tencent.mm.R.raw.sight_icon_location_normal;
    }

    @Override // com.tencent.mm.plugin.sns.ui.LocationWidget
    public int getSelectedStateImageResource() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSelectedStateImageResource", "com.tencent.mm.plugin.sns.ui.SightLocationWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSelectedStateImageResource", "com.tencent.mm.plugin.sns.ui.SightLocationWidget");
        return com.tencent.mm.R.raw.sight_icon_location_selected;
    }

    public SightLocationWidget(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
