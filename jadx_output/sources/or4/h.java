package or4;

/* loaded from: classes.dex */
public final class h extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        root(com.tencent.mm.R.layout.c7o).view(com.tencent.mm.R.id.jhc).disable();
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root = root(com.tencent.mm.R.layout.f489622de3);
        com.tencent.mm.accessibility.base.ViewSetter view = root.view(com.tencent.mm.R.id.pym);
        com.tencent.mm.accessibility.type.ViewType viewType = com.tencent.mm.accessibility.type.ViewType.Button;
        view.type(viewType).descFormat(com.tencent.mm.R.string.l0_).valueByView(com.tencent.mm.R.id.pyo);
        root.view(com.tencent.mm.R.id.qxx).type(viewType).expand(12, 12, 12, 12);
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root2 = root(com.tencent.mm.R.id.q2n);
        root2.view(com.tencent.mm.R.id.q2g).type(viewType).descFormat(com.tencent.mm.R.string.l0_).valueByView(com.tencent.mm.R.id.q2i).expand(12, 12, 12, 12);
        root2.view(com.tencent.mm.R.id.q2h).type(viewType).descFormat(com.tencent.mm.R.string.l0_).valueByView(com.tencent.mm.R.id.q2j).expand(12, 12, 12, 12);
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root3 = root(com.tencent.mm.R.id.q2m);
        root3.view(com.tencent.mm.R.id.q2g).type(viewType).descFormat(com.tencent.mm.R.string.l0_).valueByView(com.tencent.mm.R.id.q2i);
        root3.view(com.tencent.mm.R.id.q2h).type(viewType).descFormat(com.tencent.mm.R.string.l0_).valueByView(com.tencent.mm.R.id.q2j);
        root(com.tencent.mm.R.layout.ddy).view(com.tencent.mm.R.id.q2l).descFormat(com.tencent.mm.R.string.lgl).valueByView(com.tencent.mm.R.id.pxv).valueByView(com.tencent.mm.R.id.pxs);
        root(com.tencent.mm.R.layout.ddx).view(com.tencent.mm.R.id.pxm).desc(new or4.f(this));
        root(com.tencent.mm.R.layout.dea).view(com.tencent.mm.R.id.py6).type(viewType);
        root(com.tencent.mm.R.layout.de9).view(com.tencent.mm.R.id.pyd).descFormat(com.tencent.mm.R.string.lgl).valueByView(com.tencent.mm.R.id.py_).valueByView(com.tencent.mm.R.id.py8);
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root4 = root(com.tencent.mm.R.layout.deb);
        root4.view(com.tencent.mm.R.id.q2s).desc(new or4.g(this));
        root4.view(com.tencent.mm.R.id.q2s).descFormat(com.tencent.mm.R.string.lgl).valueByView(com.tencent.mm.R.id.pyg).valueByView(com.tencent.mm.R.id.pye);
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root5 = root(com.tencent.mm.R.layout.de7);
        root5.view(com.tencent.mm.R.id.pyl).type(viewType).descFormat(com.tencent.mm.R.string.l0_).valueByView(com.tencent.mm.R.id.pyn);
        root5.view(com.tencent.mm.R.id.q2g).type(viewType).descFormat(com.tencent.mm.R.string.l0_).valueByView(com.tencent.mm.R.id.q2i).expand(12, 12, 12, 12);
        root5.view(com.tencent.mm.R.id.q2h).type(viewType).descFormat(com.tencent.mm.R.string.l0_).valueByView(com.tencent.mm.R.id.q2j).expand(12, 12, 12, 12);
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root6 = root(com.tencent.mm.R.id.pyb);
        root6.view(com.tencent.mm.R.id.pyl).type(viewType).descFormat(com.tencent.mm.R.string.l0_).valueByView(com.tencent.mm.R.id.pyn);
        root6.view(com.tencent.mm.R.id.q2g).type(viewType).descFormat(com.tencent.mm.R.string.l0_).valueByView(com.tencent.mm.R.id.q2i).expand(12, 12, 12, 12);
        root6.view(com.tencent.mm.R.id.q2h).type(viewType).descFormat(com.tencent.mm.R.string.l0_).valueByView(com.tencent.mm.R.id.q2j).expand(12, 12, 12, 12);
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root7 = root(com.tencent.mm.R.layout.ddu);
        root7.view(com.tencent.mm.R.id.q2e).type(viewType);
        root7.view(com.tencent.mm.R.id.q2f).type(viewType);
        root7.view(com.tencent.mm.R.id.f487673q30).type(viewType);
    }
}
