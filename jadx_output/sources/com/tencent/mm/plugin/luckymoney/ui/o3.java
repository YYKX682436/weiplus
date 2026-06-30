package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes3.dex */
public class o3 extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper f147255d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f147256e;

    public o3(androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
    }

    public void O6(boolean z17) {
        this.f147256e = z17;
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
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root = root(com.tencent.mm.R.id.izy);
        this.f147255d = root;
        com.tencent.mm.accessibility.base.ViewSetter desc = root.view(com.tencent.mm.R.id.izi).desc(com.tencent.mm.R.id.j0e);
        com.tencent.mm.accessibility.type.ViewType viewType = com.tencent.mm.accessibility.type.ViewType.Button;
        desc.type(viewType);
        this.f147255d.view(com.tencent.mm.R.id.j76).desc(com.tencent.mm.R.id.j77).type(viewType);
        this.f147255d.view(com.tencent.mm.R.id.j7_).desc(new com.tencent.mm.plugin.luckymoney.ui.j3(this)).type(viewType);
        this.f147255d.view(com.tencent.mm.R.id.j78).desc(new com.tencent.mm.plugin.luckymoney.ui.k3(this)).type(viewType);
        this.f147255d.view(com.tencent.mm.R.id.f485768j03).desc(new com.tencent.mm.plugin.luckymoney.ui.l3(this)).type(viewType);
        this.f147255d.view(com.tencent.mm.R.id.nni).desc(new com.tencent.mm.plugin.luckymoney.ui.m3(this));
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root2 = root(com.tencent.mm.R.id.j0_);
        root2.view(com.tencent.mm.R.id.j0c).desc(new com.tencent.mm.plugin.luckymoney.ui.n3(this));
        root2.view(com.tencent.mm.R.id.j7j).disable();
    }
}
