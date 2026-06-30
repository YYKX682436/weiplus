package com.tencent.mm.plugin.mall.ui;

/* loaded from: classes.dex */
public class n0 extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    public n0(androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        focusOrder().next(com.tencent.mm.R.id.khd);
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root = root(com.tencent.mm.R.id.gyc);
        com.tencent.mm.accessibility.base.ViewSetter view = root.view(com.tencent.mm.R.id.khd);
        com.tencent.mm.accessibility.type.ViewType viewType = com.tencent.mm.accessibility.type.ViewType.Button;
        view.type(viewType).descFormat(com.tencent.mm.R.string.f489802c4).valueByView(com.tencent.mm.R.id.kho);
        root.view(com.tencent.mm.R.id.acb).type(viewType).descFormat(com.tencent.mm.R.string.f489803c5).valueByView(com.tencent.mm.R.id.acw).valueByView(com.tencent.mm.R.id.aco);
        root.view(com.tencent.mm.R.id.adv).type(viewType).descFormat(com.tencent.mm.R.string.f489802c4).valueByView(com.tencent.mm.R.id.aew);
        root(com.tencent.mm.R.id.j9s).view(com.tencent.mm.R.id.j9t).type(viewType).desc(new com.tencent.mm.plugin.mall.ui.m0(this));
    }
}
