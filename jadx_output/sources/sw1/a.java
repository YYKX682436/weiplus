package sw1;

/* loaded from: classes.dex */
public class a extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        root(com.tencent.mm.R.layout.bxp).disable(com.tencent.mm.R.id.jlt);
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root = root(com.tencent.mm.R.layout.f488637z7);
        root.disable(com.tencent.mm.R.id.root_view);
        root.disable(com.tencent.mm.R.id.c2k);
        root.disable(com.tencent.mm.R.id.f482317b6);
        com.tencent.mm.accessibility.base.ViewSetter view = root.view(com.tencent.mm.R.id.f483805c32);
        com.tencent.mm.accessibility.type.ViewType viewType = com.tencent.mm.accessibility.type.ViewType.Button;
        view.type(viewType);
        root.view(com.tencent.mm.R.id.f483807c34).type(viewType);
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root2 = root(com.tencent.mm.R.layout.f489636d85);
        root2.view(com.tencent.mm.R.id.pbn).type(com.tencent.mm.accessibility.type.ViewType.TextView).descFormat(com.tencent.mm.R.string.b_z).valueByView(com.tencent.mm.R.id.f487682pf5).valueByView(com.tencent.mm.R.id.pbn).valueByString(com.tencent.mm.R.string.b9x);
        root2.disable(com.tencent.mm.R.id.f487682pf5);
    }
}
