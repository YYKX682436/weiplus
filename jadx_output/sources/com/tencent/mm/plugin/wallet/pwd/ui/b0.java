package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes.dex */
public class b0 extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    public b0(androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root = root(com.tencent.mm.R.layout.d6d);
        root.disable(com.tencent.mm.R.id.mc_);
        root.disable(com.tencent.mm.R.id.bed);
        root.disable(com.tencent.mm.R.id.be8);
        root.disable(com.tencent.mm.R.id.be9);
        root.disable(com.tencent.mm.R.id.be_);
        root.disable(com.tencent.mm.R.id.bea);
        root.disable(com.tencent.mm.R.id.f485350he3);
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root2 = root(com.tencent.mm.R.layout.d5v);
        root2.disable(com.tencent.mm.R.id.pbl);
        root2.disable(com.tencent.mm.R.id.beb);
        root2.disable(com.tencent.mm.R.id.f483599be3);
        root2.disable(com.tencent.mm.R.id.aun);
        root2.view(com.tencent.mm.R.id.bec).type(com.tencent.mm.accessibility.type.ViewType.TextView).desc(new com.tencent.mm.plugin.wallet.pwd.ui.a0(this));
        root2.view(com.tencent.mm.R.id.f484036cs5).type(com.tencent.mm.accessibility.type.ViewType.Button);
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig, com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        super.onResume();
    }
}
