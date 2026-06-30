package com.tencent.mm.plugin.mall.ui;

/* loaded from: classes.dex */
public class z2 extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    public z2(androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root = root(com.tencent.mm.R.id.k2w);
        root.disable(com.tencent.mm.R.id.k2w);
        root.disable(com.tencent.mm.R.id.k2v);
        root.disable(com.tencent.mm.R.id.k2u);
        root.disable(com.tencent.mm.R.id.k2t);
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig, com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        super.onResume();
    }
}
