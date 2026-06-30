package d92;

/* loaded from: classes.dex */
public final class q0 extends d92.z0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // d92.z0, com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        super.initConfig();
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root = root(com.tencent.mm.R.id.eje);
        root.view(com.tencent.mm.R.id.muu).desc(com.tencent.mm.R.string.edw);
        root.view(com.tencent.mm.R.id.f484541ek2).desc(com.tencent.mm.R.string.dmm);
        root.view(com.tencent.mm.R.id.iri).desc(com.tencent.mm.R.string.dq9);
        root.view(com.tencent.mm.R.id.er_).desc(com.tencent.mm.R.string.f491487d84);
        root.view(com.tencent.mm.R.id.jyz).desc(com.tencent.mm.R.string.dz6);
        root.view(com.tencent.mm.R.id.el7).desc(com.tencent.mm.R.string.dsm);
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root2 = root(com.tencent.mm.R.id.fgb);
        com.tencent.mm.accessibility.base.ViewSetter expand = root2.view(com.tencent.mm.R.id.f484828fn5).desc(new d92.n0(context)).expand(12, 12, 12, 12);
        com.tencent.mm.accessibility.type.ViewType viewType = com.tencent.mm.accessibility.type.ViewType.TextView;
        expand.type(viewType);
        root2.view(com.tencent.mm.R.id.f484765fg5).desc(com.tencent.mm.R.string.e58);
        com.tencent.mm.accessibility.base.ViewSetter view = root2.view(com.tencent.mm.R.id.fga);
        view.desc(d92.o0.f227497d);
        view.disableChildren();
        root2.view(com.tencent.mm.R.id.foo).expand(12, 4, 12, 4);
        root2.view(com.tencent.mm.R.id.l0q).expand(12, 4, 12, 4);
        root2.view(com.tencent.mm.R.id.eqd).type(com.tencent.mm.accessibility.type.ViewType.Button).desc(d92.p0.f227500d);
        root2.view(com.tencent.mm.R.id.fg_).desc(com.tencent.mm.R.string.e5f);
        disableWholeExpand();
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root3 = root(com.tencent.mm.R.id.etf);
        root3.view(com.tencent.mm.R.id.esq).descFormat(com.tencent.mm.R.string.dfp).valueByView(com.tencent.mm.R.id.ess).disableChildren();
        root3.view(com.tencent.mm.R.id.f484586et5).descFormat(com.tencent.mm.R.string.dfp).valueByView(com.tencent.mm.R.id.et7).disableChildren();
        root3.view(com.tencent.mm.R.id.eta).descFormat(com.tencent.mm.R.string.dfp).valueByView(com.tencent.mm.R.id.ete).disableChildren();
        root3.view(com.tencent.mm.R.id.fmm).descFormat(com.tencent.mm.R.string.e2k).valueByView(com.tencent.mm.R.id.fmn).disableChildren();
        focusOrder().next(com.tencent.mm.R.id.esq).next(com.tencent.mm.R.id.f484586et5).next(com.tencent.mm.R.id.eta).next(com.tencent.mm.R.id.fmm);
        root(com.tencent.mm.R.id.i6_).view(com.tencent.mm.R.id.i6_).disableChildren().clickAs(com.tencent.mm.R.id.igy).desc(com.tencent.mm.R.string.d_e);
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root4 = root(com.tencent.mm.R.id.f484547el2);
        root4.view(com.tencent.mm.R.id.fnd).desc(com.tencent.mm.R.string.d6b);
        root4.view(com.tencent.mm.R.id.fng).desc(com.tencent.mm.R.string.d4m);
        root4.view(com.tencent.mm.R.id.ekd).desc(com.tencent.mm.R.string.d_d);
        root4.view(com.tencent.mm.R.id.ekj).descFormat(com.tencent.mm.R.string.dfp).valueByView(com.tencent.mm.R.id.ekk).disableChildren();
        focusOrder().next(com.tencent.mm.R.id.ekj).next(com.tencent.mm.R.id.ekv);
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root5 = root(com.tencent.mm.R.id.ely);
        root5.view(com.tencent.mm.R.id.fcp).desc(com.tencent.mm.R.string.d6h);
        root5.view(com.tencent.mm.R.id.f487627p85).desc(com.tencent.mm.R.string.dza);
        root5.view(com.tencent.mm.R.id.jg_).desc(com.tencent.mm.R.string.dz7).type(viewType);
        root5.view(com.tencent.mm.R.id.f482686l9).desc(com.tencent.mm.R.string.f491705dz4).type(viewType);
    }
}
