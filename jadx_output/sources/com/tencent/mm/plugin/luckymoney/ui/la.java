package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes.dex */
public final class la extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public la(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root = root(com.tencent.mm.R.id.j5i);
        root.disable(com.tencent.mm.R.id.j5b);
        root.disable(com.tencent.mm.R.id.j6v);
        root.disable(com.tencent.mm.R.id.j6w);
        root.disable(com.tencent.mm.R.id.j2e);
        com.tencent.mm.accessibility.base.ViewSetter desc = root.view(com.tencent.mm.R.id.j2j).desc(com.tencent.mm.R.id.j2k);
        com.tencent.mm.accessibility.type.ViewType viewType = com.tencent.mm.accessibility.type.ViewType.Button;
        desc.type(viewType);
        view(com.tencent.mm.R.id.j1d, com.tencent.mm.R.id.j1d).desc(com.tencent.mm.plugin.luckymoney.ui.ia.f147022d);
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root2 = root(com.tencent.mm.R.id.j7e);
        root2.view(com.tencent.mm.R.id.j6y).disable();
        root2.view(com.tencent.mm.R.id.j0p).desc(com.tencent.mm.R.string.gj7).type(viewType);
        root.view(com.tencent.mm.R.id.j1g).desc(com.tencent.mm.plugin.luckymoney.ui.ja.f147053d).type(viewType);
        root.view(com.tencent.mm.R.id.f485775j13).desc(com.tencent.mm.plugin.luckymoney.ui.ka.f147101d).type(viewType);
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig, com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        super.onResume();
    }
}
