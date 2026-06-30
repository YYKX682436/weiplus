package la5;

/* loaded from: classes.dex */
public final class c0 extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root = root(com.tencent.mm.R.id.k8o);
        com.tencent.mm.accessibility.base.ViewSetter desc = root.view(com.tencent.mm.R.id.k8o).desc(la5.a0.f317597d);
        com.tencent.mm.accessibility.type.ViewType viewType = com.tencent.mm.accessibility.type.ViewType.Button;
        desc.type(viewType);
        root.view(com.tencent.mm.R.id.k8v).desc(com.tencent.mm.R.string.b4l).type(viewType);
        root(com.tencent.mm.R.id.kgl).view(com.tencent.mm.R.id.kgo).desc(com.tencent.mm.R.string.b4l).type(viewType);
        root(com.tencent.mm.R.id.k7u).view(com.tencent.mm.R.id.k7u).desc(la5.b0.f317601d).disableChildren();
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root2 = root(com.tencent.mm.R.id.f483432au0);
        root2.view(com.tencent.mm.R.id.k7w).descFormat(com.tencent.mm.R.string.jpl).valueByView(com.tencent.mm.R.id.k7y).disableChildren().type(viewType);
        root2.view(com.tencent.mm.R.id.k7z).descFormat(com.tencent.mm.R.string.jpl).valueByView(com.tencent.mm.R.id.f486111k81).disableChildren().type(viewType);
        root2.view(com.tencent.mm.R.id.f486119k93).descFormat(com.tencent.mm.R.string.jpm).valueByView(com.tencent.mm.R.id.k96).valueByView(com.tencent.mm.R.id.f486121k95).type(viewType);
        root(com.tencent.mm.R.id.f485217gy2).view(com.tencent.mm.R.id.f485217gy2).desc(com.tencent.mm.R.id.brc).type(viewType);
        root(com.tencent.mm.R.id.f485217gy2).view(com.tencent.mm.R.id.f483642bk1).disable();
        root(com.tencent.mm.R.id.jrz).view(com.tencent.mm.R.id.jrz).desc(com.tencent.mm.R.string.b4l).type(viewType);
        root(com.tencent.mm.R.id.d58).view(com.tencent.mm.R.id.d58).desc(com.tencent.mm.R.id.k7o);
        root(com.tencent.mm.R.id.bn7).view(com.tencent.mm.R.id.cvt).desc(com.tencent.mm.R.string.jo9).type(viewType);
        root(com.tencent.mm.R.id.f483693bq4).view(com.tencent.mm.R.id.l8_).disable();
    }
}
