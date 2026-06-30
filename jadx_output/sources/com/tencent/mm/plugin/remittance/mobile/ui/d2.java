package com.tencent.mm.plugin.remittance.mobile.ui;

/* loaded from: classes.dex */
public class d2 extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    public d2(androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root = root(com.tencent.mm.R.id.joa);
        root.disable(com.tencent.mm.R.id.joa);
        root.disable(com.tencent.mm.R.id.jnm);
        root.view(com.tencent.mm.R.id.jnr).desc(new com.tencent.mm.plugin.remittance.mobile.ui.c2(this));
        com.tencent.mm.accessibility.base.ViewSetter expand = root.view(com.tencent.mm.R.id.joc).expand(12, 12, 12, 12);
        com.tencent.mm.accessibility.type.ViewType viewType = com.tencent.mm.accessibility.type.ViewType.Button;
        expand.type(viewType);
        root.view(com.tencent.mm.R.id.f486617lv4).type(viewType);
        root.view(com.tencent.mm.R.id.f482711lu).type(viewType);
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root2 = root(com.tencent.mm.R.layout.f489636d85);
        root2.view(com.tencent.mm.R.id.pbn).type(com.tencent.mm.accessibility.type.ViewType.TextView).descFormat(com.tencent.mm.R.string.i1i).valueByView(com.tencent.mm.R.id.f487682pf5).valueByView(com.tencent.mm.R.id.pbn).valueByString(com.tencent.mm.R.string.f492825i06);
        root2.disable(com.tencent.mm.R.id.f487682pf5);
    }
}
