package com.tencent.mm.plugin.remittance.mobile.ui;

/* loaded from: classes3.dex */
public class u0 extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    public u0(androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root = root(com.tencent.mm.R.id.jo_);
        root.disable(com.tencent.mm.R.id.jo_);
        root.view(com.tencent.mm.R.id.f485954jo2).desc(new com.tencent.mm.plugin.remittance.mobile.ui.t0(this));
        root(com.tencent.mm.R.layout.f487918bk).disable(com.tencent.mm.R.id.actionbar_up_indicator);
    }
}
