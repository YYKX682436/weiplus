package ir3;

/* loaded from: classes.dex */
public final class b extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        com.tencent.mm.accessibility.base.ViewSetter view = root(com.tencent.mm.R.layout.cba).view(com.tencent.mm.R.id.g6k);
        com.tencent.mm.accessibility.type.ViewType viewType = com.tencent.mm.accessibility.type.ViewType.Button;
        view.type(viewType).descFormat(com.tencent.mm.R.string.amq).valueByKey("title_num_1");
        root(com.tencent.mm.R.layout.cba).view(com.tencent.mm.R.id.mfv).type(viewType).descFormat(com.tencent.mm.R.string.amq).valueByKey("title_num_2");
        root(com.tencent.mm.R.layout.cba).view(com.tencent.mm.R.id.o5y).type(viewType).descFormat(com.tencent.mm.R.string.amq).valueByKey("title_num_3");
        root(com.tencent.mm.R.layout.cba).view(com.tencent.mm.R.id.gd6).type(viewType).descFormat(com.tencent.mm.R.string.amq).valueByKey("title_num_4");
    }
}
