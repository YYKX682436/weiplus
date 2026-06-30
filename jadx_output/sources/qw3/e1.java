package qw3;

/* loaded from: classes.dex */
public class e1 extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    public e1(androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root = root(com.tencent.mm.R.layout.f488183jt);
        root.disable(com.tencent.mm.R.id.root_view);
        root.disable(com.tencent.mm.R.id.m7v);
        root.disable(com.tencent.mm.R.id.adn);
        root.disable(com.tencent.mm.R.id.ayb);
        root.disable(com.tencent.mm.R.id.ayd);
        root.disable(com.tencent.mm.R.id.aye);
        root.disable(com.tencent.mm.R.id.ayf);
        root.disable(com.tencent.mm.R.id.ohm);
        root.disable(com.tencent.mm.R.id.ayj);
        root.view(com.tencent.mm.R.id.f486854mn2).descFormat(com.tencent.mm.R.string.aed).valueByView(com.tencent.mm.R.id.aye).valueByView(com.tencent.mm.R.id.ayf);
        root.view(com.tencent.mm.R.id.ohl).descFormat(com.tencent.mm.R.string.aef).valueByView(com.tencent.mm.R.id.ohm).valueByView(com.tencent.mm.R.id.ayj);
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root2 = root(com.tencent.mm.R.layout.f489636d85);
        root2.disable(com.tencent.mm.R.id.f487682pf5);
        root2.disable(com.tencent.mm.R.id.pel);
        root2.disable(com.tencent.mm.R.id.pbn);
        root2.focusFirst(com.tencent.mm.R.id.f485971jq3);
        root2.view(com.tencent.mm.R.id.f485971jq3).clickAs(com.tencent.mm.R.id.pbn).type(com.tencent.mm.accessibility.type.ViewType.EditText).desc(new qw3.d1(this, (com.tenpay.android.wechat.TenpaySecureEditText) findViewById(com.tencent.mm.R.id.ayb).findViewById(com.tencent.mm.R.id.pbn)));
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig, com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        super.onResume();
    }
}
