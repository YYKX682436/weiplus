package or3;

/* loaded from: classes.dex */
public final class k extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root = root(com.tencent.mm.R.layout.e3x);
        com.tencent.mm.accessibility.base.ViewSetter checkOn = root.view(com.tencent.mm.R.id.v8u).clickAs(com.tencent.mm.R.id.n_y).checkOn(or3.g.f347692d);
        com.tencent.mm.accessibility.type.ViewType viewType = com.tencent.mm.accessibility.type.ViewType.CheckBox;
        checkOn.type(viewType);
        root.view(com.tencent.mm.R.id.vci).clickAs(com.tencent.mm.R.id.nxq).checkOn(or3.h.f347693d).type(viewType);
        root.view(com.tencent.mm.R.id.kdq).clickAs(com.tencent.mm.R.id.kdu).checkOn(or3.i.f347694d).type(viewType);
        root.disable(com.tencent.mm.R.id.kdu);
        root.view(com.tencent.mm.R.id.umf).clickAs(com.tencent.mm.R.id.f486159ke3).checkOn(or3.j.f347695d).type(viewType);
        root.disable(com.tencent.mm.R.id.f486159ke3);
    }
}
