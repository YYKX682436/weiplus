package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes.dex */
public class m3 extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    public m3(androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
    }

    public void O6() {
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.khc);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.pev);
        if (viewGroup == null || viewGroup2 == null) {
            return;
        }
        if (viewGroup.isShown()) {
            viewGroup.setImportantForAccessibility(1);
            viewGroup2.setImportantForAccessibility(4);
        } else {
            viewGroup.setImportantForAccessibility(2);
            viewGroup2.setImportantForAccessibility(1);
        }
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root = root(com.tencent.mm.R.id.khh);
        root.disable(com.tencent.mm.R.id.khe);
        focusFirst(com.tencent.mm.R.id.pcu);
        focusOrder().next(com.tencent.mm.R.id.pcu);
        root.view(com.tencent.mm.R.id.pav).desc(com.tencent.mm.R.string.l1_).clickAs(com.tencent.mm.R.id.paw);
        root.view(com.tencent.mm.R.id.peu).type(com.tencent.mm.accessibility.type.ViewType.TextView);
        root.view(com.tencent.mm.R.id.khm).desc(com.tencent.mm.R.string.heb);
        root.view(com.tencent.mm.R.id.o_f).desc(com.tencent.mm.R.string.kro);
        root.view(com.tencent.mm.R.id.kct).desc(com.tencent.mm.R.string.krs);
        com.tencent.mm.accessibility.base.ViewSetter view = root.view(com.tencent.mm.R.id.nxl);
        com.tencent.mm.accessibility.type.ViewType viewType = com.tencent.mm.accessibility.type.ViewType.Button;
        view.type(viewType);
        root.view(com.tencent.mm.R.id.ofx).desc(new com.tencent.mm.plugin.offline.ui.k3(this));
        root.view(com.tencent.mm.R.id.pcw).desc(com.tencent.mm.R.string.hdw).type(viewType);
        root.view(com.tencent.mm.R.id.f487665pd4).desc(com.tencent.mm.R.string.f492744hp3).type(viewType);
        root.view(com.tencent.mm.R.id.pcs).desc(com.tencent.mm.R.string.gat).type(viewType);
        root.view(com.tencent.mm.R.id.pcx).desc(com.tencent.mm.R.string.f492424gl3).type(viewType);
        root.view(com.tencent.mm.R.id.pct).desc(com.tencent.mm.R.string.ado).type(viewType);
        root.view(com.tencent.mm.R.id.pf7).desc(new com.tencent.mm.plugin.offline.ui.l3(this)).type(viewType);
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig, com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        super.onResume();
        O6();
    }
}
