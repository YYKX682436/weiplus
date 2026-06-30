package com.tencent.mm.plugin.remittance.model;

/* loaded from: classes.dex */
public final class s1 extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        root(com.tencent.mm.R.layout.ce8);
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root = root(com.tencent.mm.R.layout.d6e);
        root.view(com.tencent.mm.R.id.pbn).type(com.tencent.mm.accessibility.type.ViewType.TextView).descFormat(com.tencent.mm.R.string.kwz).valueByKey("page_title_key").valueByView(com.tencent.mm.R.id.f487682pf5).valueByView(com.tencent.mm.R.id.pbn).valueByString(com.tencent.mm.R.string.f492825i06);
        root.disable(com.tencent.mm.R.id.f487682pf5);
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root2 = root(com.tencent.mm.R.layout.d96);
        com.tencent.mm.accessibility.base.ViewSetter view = root2.view(com.tencent.mm.R.id.keyboard_action);
        com.tencent.mm.accessibility.type.ViewType viewType = com.tencent.mm.accessibility.type.ViewType.Button;
        view.type(viewType);
        root2.view(com.tencent.mm.R.id.keyboard_animation_action).type(viewType).descFormat(com.tencent.mm.R.string.l0_).valueByKey("keyboard_title_key");
    }
}
