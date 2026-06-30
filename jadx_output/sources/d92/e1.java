package d92;

/* loaded from: classes.dex */
public final class e1 extends d92.z0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // d92.z0, com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        super.initConfig();
        disableWholeExpand();
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root = root(com.tencent.mm.R.id.foy);
        root.view(com.tencent.mm.R.id.eyy).desc(com.tencent.mm.R.string.f491544dh3);
        root.view(com.tencent.mm.R.id.muu).desc(com.tencent.mm.R.string.edw);
        root.view(com.tencent.mm.R.id.i2v).desc(com.tencent.mm.R.string.f491870ei1);
        root.view(com.tencent.mm.R.id.j0u).desc(com.tencent.mm.R.string.dsm);
        root.view(com.tencent.mm.R.id.gri).desc(com.tencent.mm.R.string.dhu);
        root.view(com.tencent.mm.R.id.s5m).desc(com.tencent.mm.R.string.dx7);
        root.view(com.tencent.mm.R.id.f6e).desc(com.tencent.mm.R.string.f491589dm0);
        root.view(com.tencent.mm.R.id.f6i).descFormat(com.tencent.mm.R.string.f491869ei0).valueByView(com.tencent.mm.R.id.f6i);
        root.view(com.tencent.mm.R.id.u8b).desc(com.tencent.mm.R.string.f493719org);
        root(com.tencent.mm.R.layout.ar7).view(com.tencent.mm.R.id.bzh).desc(com.tencent.mm.R.string.d_d).type(com.tencent.mm.accessibility.type.ViewType.TextView);
        root(com.tencent.mm.R.id.eza).view(com.tencent.mm.R.id.ez6).desc(com.tencent.mm.R.string.d_d);
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root2 = root(com.tencent.mm.R.id.ia9);
        root2.view(com.tencent.mm.R.id.iaa).desc(com.tencent.mm.R.string.eci);
        root2.view(com.tencent.mm.R.id.ubq).desc(com.tencent.mm.R.string.f491876nw0);
        root2.view(com.tencent.mm.R.id.i_z).desc(com.tencent.mm.R.string.dlc);
        root(com.tencent.mm.R.id.f485639ig1).view(com.tencent.mm.R.id.i_h).disableChildren().clickAs(com.tencent.mm.R.id.i_e).desc(new d92.c1(this));
        root(com.tencent.mm.R.id.fqd).view(com.tencent.mm.R.id.fpx).desc(com.tencent.mm.R.string.dz6);
        root(com.tencent.mm.R.id.f484840fo5).view(com.tencent.mm.R.id.f484840fo5).clickAs(com.tencent.mm.R.id.ozm).desc(com.tencent.mm.R.string.egx);
        root(com.tencent.mm.R.id.fas).view(com.tencent.mm.R.id.faw).desc(com.tencent.mm.R.string.dzb);
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root3 = root(com.tencent.mm.R.id.f1h);
        root3.view(com.tencent.mm.R.id.f1b).desc(com.tencent.mm.R.string.d_d).disableChildren().clickAs(com.tencent.mm.R.id.f1a);
        root3.view(com.tencent.mm.R.id.f1l).descFormat(com.tencent.mm.R.string.ek6).valueByView(com.tencent.mm.R.id.f1o).disExpand();
        root3.view(com.tencent.mm.R.id.f0u).desc(new d92.d1(this));
    }
}
