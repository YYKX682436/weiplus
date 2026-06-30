package la5;

/* loaded from: classes.dex */
public final class x extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root = root(com.tencent.mm.R.id.kud);
        root.view(com.tencent.mm.R.id.kuc);
        com.tencent.mm.accessibility.base.ViewSetter view = root.view(com.tencent.mm.R.id.csb);
        com.tencent.mm.accessibility.type.ViewType viewType = com.tencent.mm.accessibility.type.ViewType.Button;
        view.type(viewType).clickAs(com.tencent.mm.R.id.csa).desc(com.tencent.mm.R.string.boo);
        root(com.tencent.mm.R.id.kua).view(com.tencent.mm.R.id.kuc).type(viewType);
        view(com.tencent.mm.R.id.cdj, com.tencent.mm.R.id.cdj).desc(com.tencent.mm.R.string.gxy).disableChildren().type(viewType);
    }
}
