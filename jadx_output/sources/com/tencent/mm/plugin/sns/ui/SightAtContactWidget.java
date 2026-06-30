package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class SightAtContactWidget extends com.tencent.mm.plugin.sns.ui.AtContactWidget {
    public SightAtContactWidget(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }

    @Override // com.tencent.mm.plugin.sns.ui.AtContactWidget
    public int getLayoutResource() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayoutResource", "com.tencent.mm.plugin.sns.ui.SightAtContactWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayoutResource", "com.tencent.mm.plugin.sns.ui.SightAtContactWidget");
        return com.tencent.mm.R.layout.cnj;
    }

    @Override // com.tencent.mm.plugin.sns.ui.AtContactWidget
    public int getWithDrawableId() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getWithDrawableId", "com.tencent.mm.plugin.sns.ui.SightAtContactWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWithDrawableId", "com.tencent.mm.plugin.sns.ui.SightAtContactWidget");
        return com.tencent.mm.R.raw.sight_icon_mention;
    }

    @Override // com.tencent.mm.plugin.sns.ui.AtContactWidget
    public int getWithEmptyDrawableId() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getWithEmptyDrawableId", "com.tencent.mm.plugin.sns.ui.SightAtContactWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWithEmptyDrawableId", "com.tencent.mm.plugin.sns.ui.SightAtContactWidget");
        return com.tencent.mm.R.raw.sight_icon_mention;
    }

    public SightAtContactWidget(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
