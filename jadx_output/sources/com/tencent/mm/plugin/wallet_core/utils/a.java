package com.tencent.mm.plugin.wallet_core.utils;

/* loaded from: classes.dex */
public final class a extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        com.tencent.mm.accessibility.base.ViewSetter view = root(com.tencent.mm.R.layout.d5l).view(com.tencent.mm.R.id.f487656pc1);
        com.tencent.mm.accessibility.type.ViewType viewType = com.tencent.mm.accessibility.type.ViewType.Button;
        view.type(viewType).descFormat(com.tencent.mm.R.string.l0_).valueByView(com.tencent.mm.R.id.f487657pc2);
        root(com.tencent.mm.R.layout.f488192k2).disable(com.tencent.mm.R.id.i3y);
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root = root(com.tencent.mm.R.layout.f488191k1);
        root.view(com.tencent.mm.R.id.cgr).descFormat(com.tencent.mm.R.string.l0_).valueByView(com.tencent.mm.R.id.az6);
        root.disable(com.tencent.mm.R.id.az6);
        root.disable(com.tencent.mm.R.id.f483474az5);
        root(com.tencent.mm.R.layout.f487910bc).view(com.tencent.mm.R.id.jha).type(viewType).desc(com.tencent.mm.R.string.kgi);
    }
}
