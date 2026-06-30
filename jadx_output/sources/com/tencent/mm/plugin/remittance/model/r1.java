package com.tencent.mm.plugin.remittance.model;

/* loaded from: classes.dex */
public final class r1 extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root = root(com.tencent.mm.R.layout.ced);
        root.disable(com.tencent.mm.R.id.root_view);
        root.disable(com.tencent.mm.R.id.auq);
        root.disable(com.tencent.mm.R.id.lwn);
        root.disable(com.tencent.mm.R.id.f486618lv5);
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root2 = root(com.tencent.mm.R.layout.f489636d85);
        root2.view(com.tencent.mm.R.id.pbn).type(com.tencent.mm.accessibility.type.ViewType.TextView).descFormat(com.tencent.mm.R.string.l0b).valueByView(com.tencent.mm.R.id.f487682pf5).valueByView(com.tencent.mm.R.id.pbn).valueByString(com.tencent.mm.R.string.f492825i06);
        root2.disable(com.tencent.mm.R.id.f487682pf5);
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root3 = root(com.tencent.mm.R.layout.d96);
        com.tencent.mm.accessibility.base.ViewSetter view = root3.view(com.tencent.mm.R.id.keyboard_action);
        com.tencent.mm.accessibility.type.ViewType viewType = com.tencent.mm.accessibility.type.ViewType.Button;
        view.type(viewType);
        root3.view(com.tencent.mm.R.id.keyboard_animation_action).type(viewType).descFormat(com.tencent.mm.R.string.l0_).valueByKey("keyboard_title_key");
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root4 = root(com.tencent.mm.R.layout.cee);
        root4.view(com.tencent.mm.R.id.lws).descFormat(com.tencent.mm.R.string.hz7).valueByKey("desc_length_key").valueByKey("desc_max_length_key");
        root4.view(com.tencent.mm.R.id.lws).talkOn(com.tencent.mm.plugin.remittance.model.q1.f156984d);
        root4.view(com.tencent.mm.R.id.lwq).type(viewType).desc(com.tencent.mm.R.string.hz6);
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root5 = root(com.tencent.mm.R.layout.cec);
        root5.view(com.tencent.mm.R.id.gw7).type(viewType).desc(com.tencent.mm.R.string.b9a);
        root5.focusFirst(com.tencent.mm.R.id.gwd);
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root6 = root(com.tencent.mm.R.layout.f489396ce5);
        root6.view(com.tencent.mm.R.id.lx7).descFormat(com.tencent.mm.R.string.klb).valueByView(com.tencent.mm.R.id.lvw).valueByView(com.tencent.mm.R.id.lvk);
        root6.view(com.tencent.mm.R.id.kao).descFormat(com.tencent.mm.R.string.l0b).valueByView(com.tencent.mm.R.id.lwl).valueByView(com.tencent.mm.R.id.lwm).valueByView(com.tencent.mm.R.id.kao);
        root6.disable(com.tencent.mm.R.id.root_view);
        root6.disable(com.tencent.mm.R.id.lvw);
        root6.disable(com.tencent.mm.R.id.lvk);
        root6.disable(com.tencent.mm.R.id.lwl);
        root6.disable(com.tencent.mm.R.id.lwm);
        root6.focusFirst(com.tencent.mm.R.id.lx7);
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root7 = root(com.tencent.mm.R.layout.f489394ce3);
        root7.view(com.tencent.mm.R.id.lvf).descFormat(com.tencent.mm.R.string.kla).valueByView(com.tencent.mm.R.id.lvj).valueByView(com.tencent.mm.R.id.lvf);
        root7.disable(com.tencent.mm.R.id.lvj);
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root8 = root(com.tencent.mm.R.layout.f489391ce1);
        root8.disable(com.tencent.mm.R.id.lut);
        root8.disable(com.tencent.mm.R.id.f486613lv0);
        root8.disable(com.tencent.mm.R.id.lx_);
        root8.disable(com.tencent.mm.R.id.lxa);
        root8.disable(com.tencent.mm.R.id.lxb);
        root8.disable(com.tencent.mm.R.id.root_view);
        root8.disable(com.tencent.mm.R.id.luy);
        root8.disable(com.tencent.mm.R.id.lux);
        root8.disable(com.tencent.mm.R.id.luo);
        root8.focusFirst(com.tencent.mm.R.id.pbn);
        root8.view(com.tencent.mm.R.id.lx9).type(viewType).descFormat(com.tencent.mm.R.string.l0_).valueByView(com.tencent.mm.R.id.lxb);
        root8.view(com.tencent.mm.R.id.lup).descFormat(com.tencent.mm.R.string.klb).valueByView(com.tencent.mm.R.id.luo).valueByView(com.tencent.mm.R.id.lup);
        root8.view(com.tencent.mm.R.id.f484396e53).descFormat(com.tencent.mm.R.string.klb).valueByView(com.tencent.mm.R.id.f484394e51).valueByView(com.tencent.mm.R.id.f484395e52);
    }
}
