package hr3;

/* loaded from: classes.dex */
public final class q0 extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        root(com.tencent.mm.R.layout.a1_);
        com.tencent.mm.accessibility.base.ViewSetter view = root(com.tencent.mm.R.id.ane).view(com.tencent.mm.R.id.ane);
        com.tencent.mm.accessibility.type.ViewType viewType = com.tencent.mm.accessibility.type.ViewType.Button;
        view.type(viewType);
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root = root(com.tencent.mm.R.layout.a1p);
        root.view(com.tencent.mm.R.id.ane).type(viewType).descFormat(com.tencent.mm.R.string.amq).valueByKey("biz_timeline_profile_menu_selected_msg");
        root.view(com.tencent.mm.R.id.ann).type(viewType).descFormat(com.tencent.mm.R.string.amq).valueByKey("biz_timeline_profile_menu_selected_video");
        root(com.tencent.mm.R.layout.a1o).view(com.tencent.mm.R.id.cc_).descFormat(com.tencent.mm.R.string.anf).valueByView(com.tencent.mm.R.id.f483407an1).valueByView(com.tencent.mm.R.id.f483406an0).valueByView(com.tencent.mm.R.id.f483411an5).disableChildren();
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        root(com.tencent.mm.R.id.l9n).view(com.tencent.mm.R.id.l9n).desc(new ya2.j1(context));
        root(com.tencent.mm.R.layout.a0w).view(com.tencent.mm.R.id.cbr).desc(hr3.d0.f283461d).disableChildren().type(viewType);
        root(com.tencent.mm.R.layout.a0x).view(com.tencent.mm.R.id.f483883cc0).desc(hr3.e0.f283504d).disableChildren().type(viewType);
        root(com.tencent.mm.R.layout.a0y).view(com.tencent.mm.R.id.cbz).desc(hr3.f0.f283535d).disableChildren().type(viewType);
        root(com.tencent.mm.R.layout.a0m).view(com.tencent.mm.R.id.dyl).desc(hr3.g0.f283568d).disableChildren().type(viewType);
        root(com.tencent.mm.R.layout.a0p).view(com.tencent.mm.R.id.dyu).desc(hr3.h0.f283601d).disableChildren().type(viewType);
        root(com.tencent.mm.R.layout.a0q).view(com.tencent.mm.R.id.dyu).desc(hr3.i0.f283643d).disableChildren().type(viewType);
        root(com.tencent.mm.R.layout.a0n).view(com.tencent.mm.R.id.dyu).desc(hr3.j0.f283665d).disableChildren().type(viewType);
        root(com.tencent.mm.R.layout.a0r).view(com.tencent.mm.R.id.dyu).desc(hr3.k0.f283708d).disableChildren().type(viewType);
        root(com.tencent.mm.R.layout.a0z).view(com.tencent.mm.R.id.cb9).desc(hr3.l0.f283738d).disableChildren();
        view(com.tencent.mm.R.id.f482482fq, com.tencent.mm.R.id.f482482fq).type(viewType).desc(new hr3.m0(this));
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root2 = root(com.tencent.mm.R.layout.cav);
        com.tencent.mm.accessibility.base.ViewSetter view2 = root2.view(com.tencent.mm.R.id.cct);
        com.tencent.mm.accessibility.type.ViewType viewType2 = com.tencent.mm.accessibility.type.ViewType.TextView;
        view2.type(viewType2).descFormat(com.tencent.mm.R.string.jpl).valueByView(com.tencent.mm.R.id.cct);
        root2.view(com.tencent.mm.R.id.ccr).type(viewType2).descFormat(com.tencent.mm.R.string.jpl).valueByView(com.tencent.mm.R.id.ccr);
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root3 = root(com.tencent.mm.R.id.f482344bz);
        root3.view(com.tencent.mm.R.id.f486610lu3).type(viewType);
        root3.view(com.tencent.mm.R.id.jp_).type(viewType);
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root4 = root(com.tencent.mm.R.layout.a2l);
        root4.view(com.tencent.mm.R.id.cfc).type(viewType2).descFormat(com.tencent.mm.R.string.jpl).valueByKey("contact_profile_sex_icon");
        root4.view(com.tencent.mm.R.id.cf7).type(viewType2).descFormat(com.tencent.mm.R.string.jpl).valueByView(com.tencent.mm.R.id.cf7);
        root4.view(com.tencent.mm.R.id.f483907cf0).type(viewType2).descFormat(com.tencent.mm.R.string.jpl).valueByView(com.tencent.mm.R.id.f483907cf0);
        root4.view(com.tencent.mm.R.id.cfd).type(viewType2).descFormat(com.tencent.mm.R.string.jpl).valueByView(com.tencent.mm.R.id.cfd);
        root4.view(com.tencent.mm.R.id.f483909cf2).type(viewType2).descFormat(com.tencent.mm.R.string.jpl).valueByView(com.tencent.mm.R.id.f483909cf2);
        root4.view(com.tencent.mm.R.id.cf6).type(viewType2).descFormat(com.tencent.mm.R.string.jpl).valueByView(com.tencent.mm.R.id.cf6);
        root4.view(com.tencent.mm.R.id.cfe).type(viewType2).descFormat(com.tencent.mm.R.string.jpl).valueByView(com.tencent.mm.R.id.cfe);
        root(com.tencent.mm.R.layout.bz_).view(android.R.id.title).type(viewType2).descFormat(com.tencent.mm.R.string.jpl).valueByView(android.R.id.title);
        root(com.tencent.mm.R.layout.bz_).view(com.tencent.mm.R.id.f482920rt).type(viewType2).descFormat(com.tencent.mm.R.string.jpl).valueByView(com.tencent.mm.R.id.f482920rt);
        root(com.tencent.mm.R.layout.bze).view(com.tencent.mm.R.id.f484450eb3).type(viewType).descFormat(com.tencent.mm.R.string.jpm).valueByView(com.tencent.mm.R.id.obc).valueByView(com.tencent.mm.R.id.f482920rt).disableChildren();
        root(com.tencent.mm.R.layout.byv).view(com.tencent.mm.R.id.m7k).type(viewType).desc(hr3.n0.f283816d).checkOn(hr3.o0.f283846d, hr3.p0.f283870d).disableChildren();
    }
}
