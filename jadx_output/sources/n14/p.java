package n14;

/* loaded from: classes.dex */
public final class p extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root = root(com.tencent.mm.R.layout.djl);
        root.view(com.tencent.mm.R.id.ssb).desc(n14.n.f334151d).checkOn(n14.o.f334152d);
        root.view(com.tencent.mm.R.id.vbc).disable();
    }
}
