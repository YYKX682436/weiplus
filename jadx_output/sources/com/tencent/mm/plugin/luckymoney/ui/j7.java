package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes3.dex */
public final class j7 extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper f147048d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f147049e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j7(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    public final void O6(boolean z17) {
        this.f147049e = z17;
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.nni);
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.npf);
        if (findViewById == null || findViewById2 == null) {
            return;
        }
        if (z17) {
            findViewById.setImportantForAccessibility(2);
            findViewById2.setImportantForAccessibility(0);
        } else {
            findViewById.setImportantForAccessibility(1);
            findViewById2.setImportantForAccessibility(4);
        }
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        com.tencent.mm.accessibility.base.ViewSetter view;
        com.tencent.mm.accessibility.base.ViewSetter view2;
        com.tencent.mm.accessibility.base.ViewSetter desc;
        com.tencent.mm.accessibility.base.ViewSetter view3;
        com.tencent.mm.accessibility.base.ViewSetter desc2;
        com.tencent.mm.accessibility.base.ViewSetter view4;
        com.tencent.mm.accessibility.base.ViewSetter desc3;
        com.tencent.mm.accessibility.base.ViewSetter view5;
        com.tencent.mm.accessibility.base.ViewSetter desc4;
        com.tencent.mm.accessibility.base.ViewSetter view6;
        com.tencent.mm.accessibility.base.ViewSetter desc5;
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root = root(com.tencent.mm.R.id.izy);
        this.f147048d = root;
        if (root != null && (view6 = root.view(com.tencent.mm.R.id.izi)) != null && (desc5 = view6.desc(com.tencent.mm.R.id.j0e)) != null) {
            desc5.type(com.tencent.mm.accessibility.type.ViewType.Button);
        }
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper configHelper = this.f147048d;
        if (configHelper != null && (view5 = configHelper.view(com.tencent.mm.R.id.j76)) != null && (desc4 = view5.desc(com.tencent.mm.R.id.j77)) != null) {
            desc4.type(com.tencent.mm.accessibility.type.ViewType.Button);
        }
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper configHelper2 = this.f147048d;
        if (configHelper2 != null && (view4 = configHelper2.view(com.tencent.mm.R.id.j7_)) != null && (desc3 = view4.desc(new com.tencent.mm.plugin.luckymoney.ui.e7(this))) != null) {
            desc3.type(com.tencent.mm.accessibility.type.ViewType.Button);
        }
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper configHelper3 = this.f147048d;
        if (configHelper3 != null && (view3 = configHelper3.view(com.tencent.mm.R.id.j78)) != null && (desc2 = view3.desc(new com.tencent.mm.plugin.luckymoney.ui.f7(this))) != null) {
            desc2.type(com.tencent.mm.accessibility.type.ViewType.Button);
        }
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper configHelper4 = this.f147048d;
        if (configHelper4 != null && (view2 = configHelper4.view(com.tencent.mm.R.id.f485768j03)) != null && (desc = view2.desc(new com.tencent.mm.plugin.luckymoney.ui.g7(this))) != null) {
            desc.type(com.tencent.mm.accessibility.type.ViewType.Button);
        }
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper configHelper5 = this.f147048d;
        if (configHelper5 != null && (view = configHelper5.view(com.tencent.mm.R.id.nni)) != null) {
            view.desc(new com.tencent.mm.plugin.luckymoney.ui.h7(this));
        }
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root2 = root(com.tencent.mm.R.id.j0_);
        root2.view(com.tencent.mm.R.id.j0c).desc(new com.tencent.mm.plugin.luckymoney.ui.i7(this));
        root2.view(com.tencent.mm.R.id.j7j).disable();
    }
}
