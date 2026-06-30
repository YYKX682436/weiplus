package sw1;

/* loaded from: classes.dex */
public final class c extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        root(com.tencent.mm.R.layout.f488640za).disable(android.R.id.list);
        root(com.tencent.mm.R.layout.f488647zh).view(com.tencent.mm.R.id.kqs).disableChildren().desc(new sw1.b(this));
        root(com.tencent.mm.R.layout.f488641zb).disable(com.tencent.mm.R.id.c3_);
        com.tencent.mm.accessibility.base.ViewSetter view = root(com.tencent.mm.R.layout.z_).view(com.tencent.mm.R.id.aa_);
        com.tencent.mm.accessibility.type.ViewType viewType = com.tencent.mm.accessibility.type.ViewType.Button;
        view.type(viewType).desc(com.tencent.mm.R.string.b9a);
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root = root(com.tencent.mm.R.layout.f488642zc);
        root.disable(com.tencent.mm.R.id.c3s);
        root.disable(com.tencent.mm.R.id.c3c);
        root.view(com.tencent.mm.R.id.c4j).type(viewType).desc(com.tencent.mm.R.string.b4l);
        root.view(com.tencent.mm.R.id.c3a).type(viewType).desc(com.tencent.mm.R.string.hpz);
        root.view(com.tencent.mm.R.id.c5o).type(viewType);
        root.view(com.tencent.mm.R.id.c3z).type(viewType);
        root.view(com.tencent.mm.R.id.c1e).type(viewType).desc(com.tencent.mm.R.string.b_e).disableChildren();
        root.view(com.tencent.mm.R.id.f483809c36).descFormat(com.tencent.mm.R.string.b_y).valueByView(com.tencent.mm.R.id.c37).valueByView(com.tencent.mm.R.id.f483809c36);
        root(com.tencent.mm.R.layout.c7o).view(com.tencent.mm.R.id.ohv).type(viewType).desc(com.tencent.mm.R.string.b9a);
        root(com.tencent.mm.R.layout.a3s).view(com.tencent.mm.R.id.ohv).type(viewType);
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root2 = root(com.tencent.mm.R.layout.f488646zg);
        com.tencent.mm.accessibility.base.ViewSetter view2 = root2.view(com.tencent.mm.R.id.nrq);
        com.tencent.mm.accessibility.type.ViewType viewType2 = com.tencent.mm.accessibility.type.ViewType.TextView;
        view2.type(viewType2);
        root2.view(com.tencent.mm.R.id.nrp).type(viewType2);
        root(2306886).disable(2306886);
        root(2306885).disable(2306885);
        focusOrder().next(android.R.id.text1);
    }
}
