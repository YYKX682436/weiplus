package or4;

/* loaded from: classes.dex */
public final class l extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root = root(com.tencent.mm.R.layout.d5_);
        root.view(com.tencent.mm.R.id.oxh).disableChildren();
        root.focusFirst(com.tencent.mm.R.id.oxh);
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root2 = root(com.tencent.mm.R.layout.f488175jl);
        root2.view(com.tencent.mm.R.id.cgi).disable();
        root2.view(com.tencent.mm.R.id.mfy).disable();
        root2.view(com.tencent.mm.R.id.lkc).disable();
        root2.view(com.tencent.mm.R.id.oct).disable();
        root2.view(com.tencent.mm.R.id.juu).disableChildren().clickAs(com.tencent.mm.R.id.btf).desc(or4.j.f347701d).checkOn(or4.k.f347702d);
        root(com.tencent.mm.R.id.f482523gp).view(com.tencent.mm.R.id.oct).disable();
    }
}
