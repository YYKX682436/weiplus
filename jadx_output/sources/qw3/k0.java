package qw3;

/* loaded from: classes9.dex */
public class k0 extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    public k0(androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root = root(com.tencent.mm.R.layout.f488179jp);
        root.disable(com.tencent.mm.R.id.adi);
        root.disable(com.tencent.mm.R.id.adj);
        root.disable(com.tencent.mm.R.id.adk);
        root.disable(com.tencent.mm.R.id.adl);
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root2 = root(com.tencent.mm.R.id.ax7);
        root2.disable(com.tencent.mm.R.id.ax7);
        root2.disable(com.tencent.mm.R.id.pel);
        root2.disable(com.tencent.mm.R.id.pcd);
        root.focusOrder().next(com.tencent.mm.R.id.f487682pf5);
        root.focusOrder().next(com.tencent.mm.R.id.pbn);
        root.focusOrder().next(com.tencent.mm.R.id.pcg).next(com.tencent.mm.R.id.k3p);
        root2.view(com.tencent.mm.R.id.pcg).expand(12, 12, 12, 12);
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root3 = root(com.tencent.mm.R.id.ax6);
        root3.disable(com.tencent.mm.R.id.ax6);
        root3.disable(com.tencent.mm.R.id.pel);
        root3.disable(com.tencent.mm.R.id.pcd);
        root3.focusOrder().next(com.tencent.mm.R.id.f487682pf5);
        root3.focusOrder().next(com.tencent.mm.R.id.pbn);
        root3.focusOrder().next(com.tencent.mm.R.id.pcg);
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root4 = root(com.tencent.mm.R.id.f483462ax5);
        root4.disable(com.tencent.mm.R.id.adh);
        root4.disable(com.tencent.mm.R.id.f487682pf5);
        root4.disable(com.tencent.mm.R.id.pel);
        root4.disable(com.tencent.mm.R.id.pci);
        root4.disable(com.tencent.mm.R.id.pbn);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f483462ax5);
        android.widget.TextView textView = (android.widget.TextView) findViewById.findViewById(com.tencent.mm.R.id.f487682pf5);
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = (com.tenpay.android.wechat.TenpaySecureEditText) findViewById.findViewById(com.tencent.mm.R.id.pbn);
        tenpaySecureEditText.setAccessibilityDelegate(new qw3.j0(this));
        com.tencent.mm.accessibility.base.ViewSetter view = root4.view(com.tencent.mm.R.id.f483462ax5);
        com.tencent.mm.accessibility.type.ViewType viewType = com.tencent.mm.accessibility.type.ViewType.Button;
        view.type(viewType).desc(new qw3.h0(this, textView, tenpaySecureEditText));
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root5 = root(com.tencent.mm.R.id.f483461ax4);
        root5.disable(com.tencent.mm.R.id.pcd);
        root5.disable(com.tencent.mm.R.id.f487682pf5);
        root5.disable(com.tencent.mm.R.id.pel);
        root5.disable(com.tencent.mm.R.id.pci);
        root5.disable(com.tencent.mm.R.id.pbn);
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.f483461ax4);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById2.findViewById(com.tencent.mm.R.id.f487682pf5);
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText2 = (com.tenpay.android.wechat.TenpaySecureEditText) findViewById2.findViewById(com.tencent.mm.R.id.pbn);
        tenpaySecureEditText2.setAccessibilityDelegate(new qw3.j0(this));
        root5.view(com.tencent.mm.R.id.f483461ax4).type(viewType).desc(new qw3.i0(this, textView2, tenpaySecureEditText2));
        root(com.tencent.mm.R.id.coz).view(com.tencent.mm.R.id.f482482fq).desc(com.tencent.mm.R.string.f489812cf).type(viewType);
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig, com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        super.onResume();
    }
}
