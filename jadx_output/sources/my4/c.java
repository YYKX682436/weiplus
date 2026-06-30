package my4;

/* loaded from: classes.dex */
public final class c extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root = root(com.tencent.mm.R.layout.f488705a43);
        com.tencent.mm.accessibility.base.ViewSetter view = root.view(com.tencent.mm.R.id.nuk);
        com.tencent.mm.accessibility.type.ViewType viewType = com.tencent.mm.accessibility.type.ViewType.CheckBox;
        view.type(viewType).desc(com.tencent.mm.R.id.nuc).checkOn(my4.a.f332847d);
        root.view(com.tencent.mm.R.id.a9j).type(viewType).desc(com.tencent.mm.R.id.a9i).checkOn(my4.b.f332848d);
    }
}
