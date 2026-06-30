package la5;

/* loaded from: classes.dex */
public final class l0 extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root = root(com.tencent.mm.R.layout.c2h);
        root.view(com.tencent.mm.R.id.gxv).desc(com.tencent.mm.R.string.f492557gz1);
        root.view(com.tencent.mm.R.id.a_4).disable();
        com.tencent.mm.accessibility.base.ViewSetter desc = root(com.tencent.mm.R.layout.f487913bf).view(com.tencent.mm.R.id.jga).desc(com.tencent.mm.R.string.h2e);
        com.tencent.mm.accessibility.type.ViewType viewType = com.tencent.mm.accessibility.type.ViewType.Button;
        desc.type(viewType);
        root(com.tencent.mm.R.layout.f488689e40).view(com.tencent.mm.R.id.f483943cj0).desc(new la5.i0(this));
        root(com.tencent.mm.R.id.huj).view(com.tencent.mm.R.id.nvt).checkOn(la5.j0.f317626d, la5.k0.f317628d);
        root(com.tencent.mm.R.id.j99).view(com.tencent.mm.R.id.bp9).disable();
        root(com.tencent.mm.R.id.j99).focusOrder();
        root(com.tencent.mm.R.id.f482435ei).view(com.tencent.mm.R.id.actionbar_up_indicator_btn).desc(((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).Ai() ? com.tencent.mm.R.string.oa_ : com.tencent.mm.R.string.h0x);
        root(com.tencent.mm.R.layout.f488576xq).view(com.tencent.mm.R.id.bkd).descFormat(com.tencent.mm.R.string.f490842b02).valueByView(com.tencent.mm.R.id.f482697ll);
        root(com.tencent.mm.R.layout.f488575xp).view(com.tencent.mm.R.id.bhg).descFormat(com.tencent.mm.R.string.f489820co).valueByView(com.tencent.mm.R.id.f482697ll);
        root(com.tencent.mm.R.layout.brn).view(com.tencent.mm.R.id.ifk).type(viewType).desc(com.tencent.mm.R.string.fe7);
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root2 = root(com.tencent.mm.R.layout.brp);
        root2.view(com.tencent.mm.R.id.ifg).descFormat(com.tencent.mm.R.string.gfv).valueByView(com.tencent.mm.R.id.ifm).valueByView(com.tencent.mm.R.id.ife);
        root2.view(com.tencent.mm.R.id.ifh).type(viewType).desc(com.tencent.mm.R.string.b9a);
        root(com.tencent.mm.R.layout.f488393s3).view(com.tencent.mm.R.id.b1n).type(viewType).desc(com.tencent.mm.R.string.b9a);
        root(com.tencent.mm.R.layout.cxq).view(com.tencent.mm.R.id.f483482b02).type(viewType).desc(com.tencent.mm.R.string.fe7);
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root3 = root(com.tencent.mm.R.layout.f488589xz);
        root3.view(com.tencent.mm.R.id.mgy).descFormat(com.tencent.mm.R.string.ied).valueByView(com.tencent.mm.R.id.bqk);
        root3.view(com.tencent.mm.R.id.bqj).type(viewType).desc(com.tencent.mm.R.string.b5w);
        root3.view(com.tencent.mm.R.id.bqi).type(viewType).desc(com.tencent.mm.R.string.b9a);
        root(com.tencent.mm.R.layout.f488554wx).view(com.tencent.mm.R.id.lgx).descFormat(com.tencent.mm.R.string.gzc).valueByView(com.tencent.mm.R.id.bjp).valueByKey("quote_img");
        root(com.tencent.mm.R.layout.f488510vc).view(com.tencent.mm.R.id.lgx).descFormat(com.tencent.mm.R.string.gzc).valueByView(com.tencent.mm.R.id.bjp).valueByKey("quote_img");
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root4 = root(com.tencent.mm.R.layout.f488526w0);
        root4.view(com.tencent.mm.R.id.bkg).desc(com.tencent.mm.R.id.o_k);
        root4.view(com.tencent.mm.R.id.i1b).desc(com.tencent.mm.R.string.a6x);
        root(com.tencent.mm.R.layout.f487908ba).view(com.tencent.mm.R.id.obq).disableChildren().desc(new la5.d0(this));
        root(com.tencent.mm.R.layout.ehs).view(com.tencent.mm.R.id.lgy).desc(la5.e0.f317614d);
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root5 = root(com.tencent.mm.R.layout.f488536wc);
        root5.view(com.tencent.mm.R.id.a3q).disable();
        root5.view(com.tencent.mm.R.id.a3r).disable();
        root5.view(com.tencent.mm.R.id.bkg).disable();
        root5.view(com.tencent.mm.R.id.a3t).desc(com.tencent.mm.R.string.b4f);
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root6 = root(com.tencent.mm.R.layout.f488492ur);
        root6.view(com.tencent.mm.R.id.a3q).disable();
        root6.view(com.tencent.mm.R.id.a3r).disable();
        root6.view(com.tencent.mm.R.id.bkg).disable();
        root6.view(com.tencent.mm.R.id.a3t).desc(com.tencent.mm.R.string.b4f);
        root(com.tencent.mm.R.layout.f488562e20).view(com.tencent.mm.R.id.bkg).desc(new la5.f0(this));
        root(com.tencent.mm.R.layout.e1l).view(com.tencent.mm.R.id.bkg).desc(new la5.g0(this));
        root(com.tencent.mm.R.layout.f488497ux).view(com.tencent.mm.R.id.bkg).descFormat(com.tencent.mm.R.string.cvp).valueByView(com.tencent.mm.R.id.bnp);
        root(com.tencent.mm.R.layout.f488540wh).view(com.tencent.mm.R.id.bkg).descFormat(com.tencent.mm.R.string.cvp).valueByView(com.tencent.mm.R.id.bnp);
        root(com.tencent.mm.R.layout.e1w).view(com.tencent.mm.R.id.bkg).desc(com.tencent.mm.R.id.bjy);
        root(com.tencent.mm.R.layout.e1h).view(com.tencent.mm.R.id.bkg).desc(com.tencent.mm.R.id.bjy);
        root(com.tencent.mm.R.id.f483664bn1).view(com.tencent.mm.R.id.bkf).clickAs(com.tencent.mm.R.id.bpa);
        root(com.tencent.mm.R.layout.f488567xi).view(com.tencent.mm.R.id.bru).desc(la5.h0.f317622d);
    }
}
