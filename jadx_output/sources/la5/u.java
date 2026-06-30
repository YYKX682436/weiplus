package la5;

/* loaded from: classes.dex */
public final class u extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        root(com.tencent.mm.R.layout.f488554wx).view(com.tencent.mm.R.id.lgx).descFormat(com.tencent.mm.R.string.gzc).valueByView(com.tencent.mm.R.id.bjp).valueByKey("quote_img");
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root = root(com.tencent.mm.R.layout.f488526w0);
        root.view(com.tencent.mm.R.id.bkg).desc(com.tencent.mm.R.id.o_k);
        root.view(com.tencent.mm.R.id.i1b).desc(com.tencent.mm.R.string.a6x);
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root2 = root(com.tencent.mm.R.layout.f488536wc);
        root2.view(com.tencent.mm.R.id.a3q).disable();
        root2.view(com.tencent.mm.R.id.a3r).disable();
        root2.view(com.tencent.mm.R.id.bkg).disable();
        root2.view(com.tencent.mm.R.id.a3t).desc(com.tencent.mm.R.string.b4f);
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root3 = root(com.tencent.mm.R.layout.f488492ur);
        root3.view(com.tencent.mm.R.id.a3q).disable();
        root3.view(com.tencent.mm.R.id.a3r).disable();
        root3.view(com.tencent.mm.R.id.bkg).disable();
        root3.view(com.tencent.mm.R.id.a3t).desc(com.tencent.mm.R.string.b4f);
        root(com.tencent.mm.R.layout.ehs).view(com.tencent.mm.R.id.lgy).desc(la5.p.f317634d);
        root(com.tencent.mm.R.layout.f487908ba).view(com.tencent.mm.R.id.obq).desc(new la5.q(this)).disable(la5.r.f317638d);
        root(com.tencent.mm.R.layout.f488562e20).view(com.tencent.mm.R.id.bkg).desc(new la5.s(this));
        root(com.tencent.mm.R.layout.e1l).view(com.tencent.mm.R.id.bkg).desc(new la5.t(this));
        root(com.tencent.mm.R.layout.f488497ux).view(com.tencent.mm.R.id.bkg).descFormat(com.tencent.mm.R.string.cvp).valueByView(com.tencent.mm.R.id.bnp);
        root(com.tencent.mm.R.layout.f488540wh).view(com.tencent.mm.R.id.bkg).descFormat(com.tencent.mm.R.string.cvp).valueByView(com.tencent.mm.R.id.bnp);
        root(com.tencent.mm.R.layout.e1w).view(com.tencent.mm.R.id.bkg).desc(com.tencent.mm.R.id.bjy);
        root(com.tencent.mm.R.layout.e1h).view(com.tencent.mm.R.id.bkg).desc(com.tencent.mm.R.id.bjy);
        root(com.tencent.mm.R.layout.f488393s3).view(com.tencent.mm.R.id.b1n).type(com.tencent.mm.accessibility.type.ViewType.Button).desc(com.tencent.mm.R.string.b9a);
        root(com.tencent.mm.R.id.f483664bn1).view(com.tencent.mm.R.id.bkf).clickAs(com.tencent.mm.R.id.bpa);
        root(com.tencent.mm.R.layout.f488567xi).view(com.tencent.mm.R.id.bru).desc(la5.o.f317632d);
    }
}
