package d92;

/* loaded from: classes.dex */
public class z0 extends e92.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root = root(com.tencent.mm.R.id.f485639ig1);
        com.tencent.mm.accessibility.base.ViewSetter desc = root.view(com.tencent.mm.R.id.ifw).desc(com.tencent.mm.R.string.egk);
        com.tencent.mm.accessibility.type.ViewType viewType = com.tencent.mm.accessibility.type.ViewType.TextView;
        desc.type(viewType).disExpand();
        root.view(com.tencent.mm.R.id.ify).disExpand().desc(new d92.r0(context));
        root(com.tencent.mm.R.id.fbf).view(com.tencent.mm.R.id.fbf).disableChildren().desc(com.tencent.mm.R.string.dx7);
        root(com.tencent.mm.R.id.f485646ih2).view(com.tencent.mm.R.id.f485646ih2).disableChildren().clickAs(com.tencent.mm.R.id.igy).desc(com.tencent.mm.R.string.d_e);
        root(com.tencent.mm.R.id.ihj).view(com.tencent.mm.R.id.ihj).disableChildren().clickAs(com.tencent.mm.R.id.ihi).desc(com.tencent.mm.R.string.dwf);
        root(com.tencent.mm.R.id.f485589i95).view(com.tencent.mm.R.id.f485586i92).desc(new d92.u0(context)).disableChildren().disExpand();
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root2 = root(com.tencent.mm.R.id.eva);
        root2.view(com.tencent.mm.R.id.i8m).desc(new d92.v0(context, this));
        root2.view(com.tencent.mm.R.id.ev_).disable().disExpand();
        root2.view(com.tencent.mm.R.id.i8o).valueByView(com.tencent.mm.R.id.i8p).disableChildren();
        root2.view(com.tencent.mm.R.id.b1u).desc(new d92.w0(context));
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root3 = root(com.tencent.mm.R.id.ibe);
        root3.view(com.tencent.mm.R.id.f9p).desc(com.tencent.mm.R.string.d_d);
        root3.view(com.tencent.mm.R.id.f9n).desc(com.tencent.mm.R.string.dts);
        root3.view(com.tencent.mm.R.id.f6k).desc(new d92.x0(context));
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root4 = root(com.tencent.mm.R.id.f484711f85);
        root4.view(com.tencent.mm.R.id.f484710f84).desc(com.tencent.mm.R.string.dpy);
        root4.view(com.tencent.mm.R.id.cjn).disable();
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root5 = root(com.tencent.mm.R.id.f86);
        root5.view(com.tencent.mm.R.id.bys).desc(com.tencent.mm.R.string.d_d).type(viewType);
        root5.view(com.tencent.mm.R.id.a6b).disExpand();
        root5.view(com.tencent.mm.R.id.b6y).desc(new d92.y0(context));
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root6 = root(com.tencent.mm.R.id.flv);
        root6.view(com.tencent.mm.R.id.flf).desc(com.tencent.mm.R.string.d_d);
        root6.view(com.tencent.mm.R.id.flm).expand(12, 12, 12, 12);
        root6.view(com.tencent.mm.R.id.flw).expand(12, 12, 12, 12);
        root6.view(com.tencent.mm.R.id.flr).expand(12, 12, 12, 12);
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root7 = root(com.tencent.mm.R.id.fll);
        root7.view(com.tencent.mm.R.id.fll).desc(new d92.s0(context));
        root7.view(com.tencent.mm.R.id.l6m).disable();
        root7.view(com.tencent.mm.R.id.l6c).disExpand();
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root8 = root(com.tencent.mm.R.layout.dau);
        int a17 = com.tencent.mm.ui.zk.a(context, 8);
        root8.view(com.tencent.mm.R.id.bys).desc(com.tencent.mm.R.string.d_d).type(viewType).expand(a17, a17, a17, a17);
        root8.view(com.tencent.mm.R.id.bzl).desc(com.tencent.mm.R.string.d_d).type(viewType);
        root8.view(com.tencent.mm.R.id.f484816fm5).desc(new d92.t0(context));
        root8.view(com.tencent.mm.R.id.l6m).disable();
        root(com.tencent.mm.R.layout.f489269by0).view(com.tencent.mm.R.id.f485288h62).disable();
        root(com.tencent.mm.R.id.f485589i95).view(com.tencent.mm.R.id.evl).disable();
        root(com.tencent.mm.R.id.f8v).view(com.tencent.mm.R.id.iy7).desc(com.tencent.mm.R.string.dsl);
        root(com.tencent.mm.R.id.fqe).view(com.tencent.mm.R.id.iap).disable();
    }
}
