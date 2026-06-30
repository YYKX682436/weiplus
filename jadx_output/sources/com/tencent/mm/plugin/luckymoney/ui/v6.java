package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes.dex */
public class v6 extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    public v6(androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        root(com.tencent.mm.R.layout.buo).view(com.tencent.mm.R.id.izg).type(com.tencent.mm.accessibility.type.ViewType.TextView);
        com.tencent.mm.accessibility.base.ViewSetter desc = root(com.tencent.mm.R.layout.buo).view(com.tencent.mm.R.id.f485792j30).desc(com.tencent.mm.R.id.j2y);
        com.tencent.mm.accessibility.type.ViewType viewType = com.tencent.mm.accessibility.type.ViewType.Button;
        desc.type(viewType);
        root(com.tencent.mm.R.layout.bup).view(com.tencent.mm.R.id.f485797j35).desc(new com.tencent.mm.plugin.luckymoney.ui.u6(this)).type(viewType);
    }
}
