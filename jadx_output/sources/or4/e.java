package or4;

/* loaded from: classes.dex */
public final class e extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root = root(com.tencent.mm.R.layout.f489627d72);
        root.view(com.tencent.mm.R.id.f485743iw2).descFormat(com.tencent.mm.R.string.l0_).valueByView(com.tencent.mm.R.id.f485744iw3);
        root.disable(com.tencent.mm.R.id.f485744iw3);
        com.tencent.mm.accessibility.base.ViewSetter view = root.view(com.tencent.mm.R.id.iuu);
        com.tencent.mm.accessibility.type.ViewType viewType = com.tencent.mm.accessibility.type.ViewType.Button;
        view.type(viewType).descFormat(com.tencent.mm.R.string.l0_).valueByView(com.tencent.mm.R.id.iuv);
        root.view(com.tencent.mm.R.id.ivw).desc(new or4.d(this));
        root.disable(com.tencent.mm.R.id.ivz);
        root.view(com.tencent.mm.R.id.ivl).descFormat(com.tencent.mm.R.string.l0_).valueByView(com.tencent.mm.R.id.ivm);
        root.disable(com.tencent.mm.R.id.ivm);
        root.disable(com.tencent.mm.R.id.ivk);
        root.view(com.tencent.mm.R.id.f485745iw4).type(viewType).descFormat(com.tencent.mm.R.string.l0_).valueByView(com.tencent.mm.R.id.f485746iw5);
        root.disable(com.tencent.mm.R.id.f485746iw5);
        root.view(com.tencent.mm.R.id.ium).type(viewType).descFormat(com.tencent.mm.R.string.l0b).valueByView(com.tencent.mm.R.id.iur).valueByView(com.tencent.mm.R.id.f485936jl3).valueByView(com.tencent.mm.R.id.iwv);
        root(com.tencent.mm.R.layout.c2f).disable(com.tencent.mm.R.id.f485936jl3);
        root.disable(com.tencent.mm.R.id.iur);
        root.disable(com.tencent.mm.R.id.iuq);
        root.disable(com.tencent.mm.R.id.iut);
        root.disable(com.tencent.mm.R.id.ius);
        root.disable(com.tencent.mm.R.id.iww);
        root(com.tencent.mm.R.layout.bt_).view(com.tencent.mm.R.id.hzi).type(viewType).descFormat(com.tencent.mm.R.string.klb).valueByView(com.tencent.mm.R.id.iuz).valueByView(com.tencent.mm.R.id.iux);
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root2 = root(com.tencent.mm.R.layout.btk);
        root2.disable(com.tencent.mm.R.id.iwx);
        root2.view(com.tencent.mm.R.id.ix9).type(viewType).descFormat(com.tencent.mm.R.string.l0_).valueByView(com.tencent.mm.R.id.ix8);
        root2.view(com.tencent.mm.R.id.f485748ix1).type(viewType).descFormat(com.tencent.mm.R.string.kwz).valueByView(com.tencent.mm.R.id.f485749ix2).valueByView(com.tencent.mm.R.id.f485751ix4).valueByView(com.tencent.mm.R.id.f485747ix0).valueByView(com.tencent.mm.R.id.f485750ix3);
        root.view(com.tencent.mm.R.id.iv9).type(viewType).descFormat(com.tencent.mm.R.string.l0_).valueByView(com.tencent.mm.R.id.iv_);
        root.view(com.tencent.mm.R.id.iv6).type(viewType).descFormat(com.tencent.mm.R.string.l0_).valueByView(com.tencent.mm.R.id.iv7);
        root.view(com.tencent.mm.R.id.iva).type(viewType).descFormat(com.tencent.mm.R.string.l0_).valueByView(com.tencent.mm.R.id.ivb);
        root(com.tencent.mm.R.layout.f487907b9).view(com.tencent.mm.R.id.f482482fq).desc(com.tencent.mm.R.string.krj);
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root3 = root(com.tencent.mm.R.layout.d76);
        root3.view(com.tencent.mm.R.id.iu_).type(viewType).descFormat(com.tencent.mm.R.string.l0b).valueByView(com.tencent.mm.R.id.f487682pf5).valueByView(com.tencent.mm.R.id.iu9).valueByView(com.tencent.mm.R.id.h0a);
        root3.disable(com.tencent.mm.R.id.iu9);
        root3.disable(com.tencent.mm.R.id.h0a);
        root3.disable(com.tencent.mm.R.id.ixf);
        root3.disable(com.tencent.mm.R.id.ixe);
        root3.disable(com.tencent.mm.R.id.j8i);
        root3.disable(com.tencent.mm.R.id.ixn);
        root3.disable(com.tencent.mm.R.id.iua);
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root4 = root(com.tencent.mm.R.layout.d96);
        root4.disable(com.tencent.mm.R.id.keyboard_base);
        root4.view(com.tencent.mm.R.id.keyboard_action).type(viewType);
        root4.view(com.tencent.mm.R.id.keyboard_animation_action).type(viewType).descFormat(com.tencent.mm.R.string.l0_).valueByKey("keyboard_title_key");
        root(com.tencent.mm.R.layout.f489630d75).disable(com.tencent.mm.R.id.f487682pf5);
        root3.view(com.tencent.mm.R.id.ixr).type(viewType);
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root5 = root(com.tencent.mm.R.layout.btw);
        root5.view(com.tencent.mm.R.id.iwt).type(viewType);
        root5.focusFirst(com.tencent.mm.R.id.ixu);
        root3.view(com.tencent.mm.R.id.iwg).type(com.tencent.mm.accessibility.type.ViewType.TextView).descFormat(com.tencent.mm.R.string.klb).valueByView(com.tencent.mm.R.id.iwi).valueByView(com.tencent.mm.R.id.iwh);
        root3.disable(com.tencent.mm.R.id.iwi);
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root6 = root(com.tencent.mm.R.layout.f489629d74);
        root6.view(com.tencent.mm.R.id.f482956st).descFormat(com.tencent.mm.R.string.klb).valueByView(com.tencent.mm.R.id.f482963t1).valueByView(com.tencent.mm.R.id.f482962t0);
        root6.focusFirst(com.tencent.mm.R.id.nrn);
    }
}
