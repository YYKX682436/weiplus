package or4;

/* loaded from: classes.dex */
public final class c extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root = root(com.tencent.mm.R.layout.d59);
        root.view(com.tencent.mm.R.id.o_w).disable();
        root.view(com.tencent.mm.R.id.p_x).disable();
        root.view(com.tencent.mm.R.id.f487641pa4).descFormat(com.tencent.mm.R.string.f493489kf4).valueByString(com.tencent.mm.R.string.kf9).valueByView(com.tencent.mm.R.id.f485936jl3);
        com.tencent.mm.accessibility.base.ViewSetter expand = root.view(com.tencent.mm.R.id.ac_).expand(12, 12, 12, 12);
        com.tencent.mm.accessibility.type.ViewType viewType = com.tencent.mm.accessibility.type.ViewType.Button;
        expand.type(viewType).desc(com.tencent.mm.R.id.aca);
        root.view(com.tencent.mm.R.id.f487640pa3).expand(12, 12, 12, 12).type(viewType);
        root.focusFirst(com.tencent.mm.R.id.f487641pa4);
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root2 = root(com.tencent.mm.R.layout.d5b);
        root2.view(com.tencent.mm.R.id.acc).descFormat(com.tencent.mm.R.string.jpo).valueByView(com.tencent.mm.R.id.f487682pf5).valueByView(com.tencent.mm.R.id.acd).valueByView(com.tencent.mm.R.id.h0a).valueByView(com.tencent.mm.R.id.h0b).type(viewType);
        root2.view(com.tencent.mm.R.id.ixo).disable();
        view(com.tencent.mm.R.id.f485972jq4, com.tencent.mm.R.id.f487682pf5).disable();
        com.tencent.mm.accessibility.base.ViewSetter desc = view(com.tencent.mm.R.id.f485972jq4, com.tencent.mm.R.id.pbn).desc(new or4.a(this));
        com.tencent.mm.accessibility.type.ViewType viewType2 = com.tencent.mm.accessibility.type.ViewType.TextView;
        desc.type(viewType2);
        root2.view(com.tencent.mm.R.id.iw9).type(viewType);
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root3 = root(com.tencent.mm.R.layout.d58);
        root3.view(com.tencent.mm.R.id.acc).descFormat(com.tencent.mm.R.string.jpo).valueByView(com.tencent.mm.R.id.f487682pf5).valueByView(com.tencent.mm.R.id.acd).valueByView(com.tencent.mm.R.id.h0a).valueByView(com.tencent.mm.R.id.h0b).type(viewType);
        root3.view(com.tencent.mm.R.id.itw).disable();
        view(com.tencent.mm.R.id.ach, com.tencent.mm.R.id.f487682pf5).disable();
        view(com.tencent.mm.R.id.ach, com.tencent.mm.R.id.pbn).desc(new or4.b(this)).type(viewType2);
        root3.view(com.tencent.mm.R.id.f484367e15).expand(12, 12, 12, 12).type(viewType);
        root3.view(com.tencent.mm.R.id.f484364e12).expand(12, 12, 12, 12).type(viewType);
        root3.view(com.tencent.mm.R.id.itx).descFormat(com.tencent.mm.R.string.klb).valueByView(com.tencent.mm.R.id.ity).valueByView(com.tencent.mm.R.id.itx).expand(12, 12, 12, 12).type(viewType);
        root(com.tencent.mm.R.layout.d96).view(com.tencent.mm.R.id.keyboard_animation_action).type(viewType).descFormat(com.tencent.mm.R.string.l0_).valueByKey("keyboard_title_key");
        root(com.tencent.mm.R.layout.btw).view(com.tencent.mm.R.id.iwt).type(viewType).desc(com.tencent.mm.R.string.b9a);
        root(com.tencent.mm.R.layout.f487907b9).view(com.tencent.mm.R.id.f482482fq).desc(com.tencent.mm.R.string.krj);
    }
}
