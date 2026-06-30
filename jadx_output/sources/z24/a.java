package z24;

/* loaded from: classes.dex */
public final class a extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root = root(com.tencent.mm.R.id.jzy);
        root.view(com.tencent.mm.R.id.jzx).desc(com.tencent.mm.R.string.j1w);
        root.view(com.tencent.mm.R.id.k0w).desc(com.tencent.mm.R.string.j3g);
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root2 = root(com.tencent.mm.R.id.kd8);
        root2.view(com.tencent.mm.R.id.kdk).desc(com.tencent.mm.R.string.j1w);
        root2.view(com.tencent.mm.R.id.kdl).desc(com.tencent.mm.R.string.j3g);
    }
}
