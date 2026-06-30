package h61;

/* loaded from: classes.dex */
public final class b extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root = root(com.tencent.mm.R.layout.f487863a0);
        root.focusFirst(com.tencent.mm.R.id.f487340oc5);
        com.tencent.mm.accessibility.base.ViewSetter view = root.view(com.tencent.mm.R.id.bs9);
        com.tencent.mm.accessibility.type.ViewType viewType = com.tencent.mm.accessibility.type.ViewType.Button;
        view.type(viewType);
        root(com.tencent.mm.R.layout.bnl).disable(com.tencent.mm.R.id.pbn);
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root2 = root(com.tencent.mm.R.layout.bnn);
        root2.disable(com.tencent.mm.R.id.f485483hu4);
        root2.disable(com.tencent.mm.R.id.htb);
        root2.disable(com.tencent.mm.R.id.ht_);
        root2.disable(com.tencent.mm.R.id.htw);
        root2.focusFirst(com.tencent.mm.R.id.htv);
        root2.view(com.tencent.mm.R.id.htv).type(viewType);
        com.tencent.mm.accessibility.base.ViewSetter view2 = root2.view(com.tencent.mm.R.id.f485482hu3);
        com.tencent.mm.accessibility.type.ViewType viewType2 = com.tencent.mm.accessibility.type.ViewType.EditText;
        view2.type(viewType2).descFormat(com.tencent.mm.R.string.g_a).valueByKey("LAUNCH_AA_TOTAL_MONEY_EDIT_FORM_VALUE_KEY").valueByView(com.tencent.mm.R.id.f485481hu2);
        root2.view(com.tencent.mm.R.id.htj).type(viewType).descFormat(com.tencent.mm.R.string.jpm).valueByView(com.tencent.mm.R.id.htk).valueByView(com.tencent.mm.R.id.htl);
        root2.view(com.tencent.mm.R.id.hua).type(viewType).descFormat(com.tencent.mm.R.string.jpm).valueByView(com.tencent.mm.R.id.htg).valueByView(com.tencent.mm.R.id.htf);
        root2.view(com.tencent.mm.R.id.f485480hu1).clickAs(com.tencent.mm.R.id.htz);
        root2.view(com.tencent.mm.R.id.hue).desc(h61.a.f279139d);
        root2.view(com.tencent.mm.R.id.chd).type(viewType).desc(com.tencent.mm.R.string.gac);
        root(com.tencent.mm.R.layout.bnj).view(com.tencent.mm.R.id.m87).descFormat(com.tencent.mm.R.string.jpm).valueByView(com.tencent.mm.R.id.ove).valueByView(com.tencent.mm.R.id.f482952sp);
        root(com.tencent.mm.R.layout.a0c).disable(com.tencent.mm.R.id.f485227gz0);
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root3 = root(com.tencent.mm.R.layout.f487918bk);
        root3.view(com.tencent.mm.R.id.oct).descFormat(com.tencent.mm.R.string.jpl).valueByView(android.R.id.text1);
        root3.disable(android.R.id.text1);
        root3.focusOrder().next(com.tencent.mm.R.id.actionbar_up_indicator).next(com.tencent.mm.R.id.oct);
        root(com.tencent.mm.R.layout.bni).view(com.tencent.mm.R.id.bxl).type(viewType);
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root4 = root(com.tencent.mm.R.layout.bnh);
        root4.disable(com.tencent.mm.R.id.m7g);
        root4.disable(com.tencent.mm.R.id.a9m);
        root4.disable(com.tencent.mm.R.id.hti);
        root4.view(com.tencent.mm.R.id.ovf).type(com.tencent.mm.accessibility.type.ViewType.TextView).descFormat(com.tencent.mm.R.string.jpm).valueByView(com.tencent.mm.R.id.ove).valueByView(com.tencent.mm.R.id.f487163nr2);
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root5 = root(com.tencent.mm.R.layout.f489355c92);
        root5.disable(com.tencent.mm.R.id.krz);
        root5.disable(com.tencent.mm.R.id.krs);
        root5.focusFirst(com.tencent.mm.R.id.kse);
        root5.view(com.tencent.mm.R.id.f486285ks3).descFormat(com.tencent.mm.R.string.jpm).valueByView(com.tencent.mm.R.id.ks6).valueByView(com.tencent.mm.R.id.k6j);
        root5.view(com.tencent.mm.R.id.ksi).type(viewType);
        root5.view(com.tencent.mm.R.id.krw).type(viewType);
        root5.view(com.tencent.mm.R.id.krr).type(viewType);
        root(com.tencent.mm.R.layout.f489354c91).disable(com.tencent.mm.R.id.ks_);
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root6 = root(com.tencent.mm.R.layout.f487873aa);
        root6.disable(com.tencent.mm.R.id.f482316b5);
        root6.disable(com.tencent.mm.R.id.m7l);
        root6.view(com.tencent.mm.R.id.f482711lu).type(viewType);
        root6.view(com.tencent.mm.R.id.f482318b7).type(viewType2).descFormat(com.tencent.mm.R.string.jpl).valueByKey("REMITTANCE_AA_MONEY_EDIT_FORM_VALUE_KEY");
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root7 = root(com.tencent.mm.R.layout.f489636d85);
        root7.disable(com.tencent.mm.R.id.f487682pf5);
        root7.disable(com.tencent.mm.R.id.pbn);
        root(com.tencent.mm.R.layout.f487907b9).view(com.tencent.mm.R.id.f482482fq).desc(com.tencent.mm.R.string.krj);
        root(com.tencent.mm.R.layout.f487872a9).view(com.tencent.mm.R.id.f482310az).type(viewType).desc(com.tencent.mm.R.string.f489733a6);
    }
}
