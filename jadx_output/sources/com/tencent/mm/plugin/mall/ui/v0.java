package com.tencent.mm.plugin.mall.ui;

/* loaded from: classes.dex */
public class v0 extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    public v0(androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        focusOrder().next(com.tencent.mm.R.id.j9l);
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root = root(com.tencent.mm.R.id.gyc);
        com.tencent.mm.accessibility.base.ViewSetter view = root.view(com.tencent.mm.R.id.j9l);
        com.tencent.mm.accessibility.type.ViewType viewType = com.tencent.mm.accessibility.type.ViewType.Button;
        view.type(viewType).descFormat(com.tencent.mm.R.string.f489803c5).valueByView(com.tencent.mm.R.id.hjn).valueByView(com.tencent.mm.R.id.hhg);
        root.view(com.tencent.mm.R.id.j9m).type(viewType).descFormat(com.tencent.mm.R.string.f489803c5).valueByView(com.tencent.mm.R.id.hjn).valueByView(com.tencent.mm.R.id.hhg);
        root.view(com.tencent.mm.R.id.j9n).type(viewType).descFormat(com.tencent.mm.R.string.f489803c5).valueByView(com.tencent.mm.R.id.hjn).valueByView(com.tencent.mm.R.id.hhg);
        root(com.tencent.mm.R.id.j9s).view(com.tencent.mm.R.id.j9t).type(viewType).desc(new com.tencent.mm.plugin.mall.ui.u0(this));
    }
}
